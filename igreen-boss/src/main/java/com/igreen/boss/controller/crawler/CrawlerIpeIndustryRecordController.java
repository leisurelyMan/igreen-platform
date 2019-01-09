package com.igreen.boss.controller.crawler;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.crawler.CrawlerIpeIndustryRecordService;
import com.igreen.boss.util.ExcelUtil;
import com.igreen.common.model.CrawlerIpeIndustryRecord;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.List;

@Controller
@RequestMapping(value="/crawlerIpeIndustry")
public class CrawlerIpeIndustryRecordController extends BaseController {

    @Resource
    CrawlerIpeIndustryRecordService crawlerIpeIndustryRecordService;

    /**
     * 结果列表页面
     * @param model
     * @return
     */
    @RequestMapping(value="toListPage")
    public ModelAndView toListPage(ModelMap model){
        return new ModelAndView("crawler/ipeIndustryRecord.jsp",model);
    }

    /**
     * 查询列表信息
     * @param record
     * @param currentPage
     * @param pageRows
     * @return
     */
    @RequestMapping(value="pageList", method = { RequestMethod.POST,RequestMethod.GET })
    public @ResponseBody
    ListRange pageList(CrawlerIpeIndustryRecord record, Integer currentPage, Integer pageRows){
        if(currentPage == null){
            currentPage =1;
        }
        if(pageRows == null){
            pageRows = 15;
        }
        return crawlerIpeIndustryRecordService.pageList(record,currentPage,pageRows);
    }

    /**
     * 根据ID查询
     * @param recordId
     * @return
     */
    @RequestMapping(value="getOne", method = { RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody CrawlerIpeIndustryRecord getOne(Integer recordId){
        return crawlerIpeIndustryRecordService.getOne(recordId);
    }

    /**
     * 添加/修改
     * @param record
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="addHotWord", method = { RequestMethod.POST})
    public @ResponseBody ResponseModel saveOrUpdate(CrawlerIpeIndustryRecord record, HttpServletRequest request, HttpServletResponse response){
        return crawlerIpeIndustryRecordService.saveOrUpdate(record,this.getUser(request, response).getId());
    }

    /**
     * 导入数据
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value="uploadExcel",method={RequestMethod.POST})
    public @ResponseBody
    ResponseModel uploadExcel(HttpServletRequest request, HttpServletResponse response) throws Exception{
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("upfile");
        if(file.isEmpty()){
            throw new Exception("文件不存在！");
        }
        InputStream in = file.getInputStream();
        ExcelUtil eu = new ExcelUtil();
        eu.setOnlyReadOneSheet(false);
        eu.setPrintMsg(false);
        List<Row> rows = eu.analysisExcel(in);

        return crawlerIpeIndustryRecordService.importData(rows,this.getUser(request, response).getId());
    }
}
