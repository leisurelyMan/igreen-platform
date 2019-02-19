package com.igreen.boss.controller.crawler;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.crawler.CrawlerIpeIndustryRecordService;
import com.igreen.common.model.CrawlerIpeIndustryRecord;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
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
     * 结果列表页面
     * @param model
     * @return
     */
    @RequestMapping(value="toManuallyAnnotated")
    public ModelAndView toManuallyAnnotated(ModelMap model){
        return new ModelAndView("crawler/manuallyAnnotated.jsp",model);
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
    @RequestMapping(value="saveOrUpdate", method = { RequestMethod.POST})
    public @ResponseBody ResponseModel saveOrUpdate(CrawlerIpeIndustryRecord record, HttpServletRequest request, HttpServletResponse response){
        return crawlerIpeIndustryRecordService.saveOrUpdate(record,this.getUser(request, response).getId());
    }

    /**
     * 提交数据
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="affirm", method = { RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody ResponseModel affirm(String recordIds, HttpServletRequest request, HttpServletResponse response){
        List<Integer> recordIdList = new ArrayList<Integer>();
        for(String recordId : recordIds.split(",")){
            if(!StringUtils.isEmpty(recordId))
                recordIdList.add(Integer.parseInt(recordId));
        }
        return crawlerIpeIndustryRecordService.affirm(recordIdList,this.getUser(request, response).getId());
    }

}
