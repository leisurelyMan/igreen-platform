package com.igreen.boss.controller.crawler;

import com.alibaba.fastjson.JSON;
import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.crawler.CrawlerIpeIndustryRecordService;
import com.igreen.boss.util.xls.CellWriterSetting;
import com.igreen.boss.util.xls.XlsType;
import com.igreen.boss.util.xls.XlsWriter;
import com.igreen.boss.util.xls.XlsWriterSetting;
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
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
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
     * 导出Excel
     * @param record
     * @return
     */
    @RequestMapping(value="exportexcel", method = { RequestMethod.POST,RequestMethod.GET })
    public void exportexcel(CrawlerIpeIndustryRecord record,HttpServletResponse response){

        try {
            List<CellWriterSetting> columnList = new ArrayList<>();

            columnList.add(new CellWriterSetting("网站名称", "webName", null));
            columnList.add(new CellWriterSetting("网站域名", "webDomain", null));
            columnList.add(new CellWriterSetting("年度", "year", null));
            columnList.add(new CellWriterSetting("详情标题", "webDetailName", null));
            columnList.add(new CellWriterSetting("详情页原url", "webDetailUrl", null));
            columnList.add(new CellWriterSetting("公司名称", "companyName", null));
            columnList.add(new CellWriterSetting("省", "province", null));
            columnList.add(new CellWriterSetting("市", "city", null));
            columnList.add(new CellWriterSetting("县", "district", null));
            columnList.add(new CellWriterSetting("处罚类型", "punishType", null));
            columnList.add(new CellWriterSetting("处罚公布时间", "punishTime", null));
            columnList.add(new CellWriterSetting("处罚金额", "punishMoney", null));
            columnList.add(new CellWriterSetting("处罚编号", "punishNo", null));
            columnList.add(new CellWriterSetting("处罚原因", "punishReason", null));
            columnList.add(new CellWriterSetting("污染类型", "majorityType", null));

            XlsWriterSetting setting = new XlsWriterSetting(true, "", "人工标注数据", true, true, 0, "yyyy-MM-dd", columnList);
            setting.setType(XlsType.XLSX);

            List<CrawlerIpeIndustryRecord> records = crawlerIpeIndustryRecordService.selectCrawlerIpeIndustryRecord(record);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            XlsWriter.createXls(records, null, setting, outputStream);

            byte[] content = outputStream.toByteArray();
            InputStream is = new ByteArrayInputStream(content);
            // 设置response参数，可以打开下载页面
            response.reset();

            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename="+ new String(("人工标注数据"+System.currentTimeMillis() + ".xlsx").getBytes(), "iso-8859-1"));
            response.setContentLength(content.length);
            ServletOutputStream output = response.getOutputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            BufferedOutputStream bos = new BufferedOutputStream(output);
            byte[] buff = new byte[8192];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
            bis.close();
            bos.close();
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    /**
     * 根据域名删除数据
     * @param webDomain
     * @return
     */
    @RequestMapping(value="deleteByWebDomain", method = { RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody ResponseModel deleteByWebDomain(String webDomain){
        return crawlerIpeIndustryRecordService.deleteByWebDomain(webDomain);
    }

    /**
     * 根据域名删除2018年之前的数据
     * @return
     */
    @RequestMapping(value="deleteHistory", method = { RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody ResponseModel deleteHistory(String webDomain){
        return crawlerIpeIndustryRecordService.deleteHistory(webDomain);
    }
}
