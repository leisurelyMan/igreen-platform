package com.igreen.boss.controller.crawler;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.crawler.ExcelIpeIndustryRecordService;
import com.igreen.common.model.ExcelIpeIndustryRecord;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
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

@Controller
@RequestMapping(value="/excelIpeIndustry")
public class ExcelIpeIndustryRecordController extends BaseController {


    @Resource
    ExcelIpeIndustryRecordService excelIpeIndustryRecordService;

    /**
     * 结果列表页面
     * @param model
     * @return
     */
    @RequestMapping(value="toListPage")
    public ModelAndView toListPage(ModelMap model){
        return new ModelAndView("crawler/excelIpeIndustryRecord.jsp",model);
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
    ListRange pageList(ExcelIpeIndustryRecord record, Integer currentPage, Integer pageRows){
        if(currentPage == null){
            currentPage =1;
        }
        if(pageRows == null){
            pageRows = 15;
        }
        return excelIpeIndustryRecordService.pageList(record,currentPage,pageRows);
    }

    /**
     * 根据ID查询
     * @param recordId
     * @return
     */
    @RequestMapping(value="getOne", method = { RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody ExcelIpeIndustryRecord getOne(Integer recordId){
        return excelIpeIndustryRecordService.getOne(recordId);
    }

    /**
     * 添加/修改
     * @param record
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="saveOrUpdate", method = { RequestMethod.POST})
    public @ResponseBody ResponseModel saveOrUpdate(ExcelIpeIndustryRecord record,
                               HttpServletRequest request, HttpServletResponse response){
        return excelIpeIndustryRecordService.saveOrUpdate(record,this.getUser(request, response).getId());
    }

    /**
     * 删除记录
     * @param recordId
     * @return
     */
    @RequestMapping(value="deleteRecord", method = { RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody ResponseModel deleteRecord(Integer recordId,
                                                    HttpServletRequest request, HttpServletResponse response){
        return excelIpeIndustryRecordService.deleteRecord(recordId,this.getUser(request, response).getId());
    }


    /**
     * 删除所有记录
     * @return
     */
    @RequestMapping(value="deleteAll", method = { RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody ResponseModel deleteAll(HttpServletRequest request, HttpServletResponse response){
        return excelIpeIndustryRecordService.deleteAll(this.getUser(request, response).getId());
    }

    /**
     * 提交所有数据
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="affirm", method = { RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody ResponseModel affirm(HttpServletRequest request, HttpServletResponse response){
        return excelIpeIndustryRecordService.affirm(this.getUser(request, response).getId());
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
    ResponseModel uploadExcel(HttpServletRequest request, HttpServletResponse response){
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("upexcel");
        if(file.isEmpty()){
            return new ResponseModel(-1,"文件不存在！");
        }
        return excelIpeIndustryRecordService.importData(file,this.getUser(request, response).getId());
    }
}
