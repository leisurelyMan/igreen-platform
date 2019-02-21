package com.igreen.boss.util;

import com.alibaba.fastjson.JSONArray;
import com.igreen.boss.service.crawler.CrawlerResultIpeService;
import com.igreen.common.model.CrawlerIpeIndustryRecord;
import com.igreen.common.model.WebCrawlerConfigIpe;
import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.JsonPathSelector;
import us.codecraft.webmagic.utils.HttpConstant;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;

public class CommonPageIpeProcessor implements PageProcessor {

    //private Site site = Site.me().setCharset("utf-8").setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    private WebCrawlerConfigIpe config;

    private CrawlerResultIpeService resultService;

    private static class FieldType {
        // 单条数据
        public static final int SINGLE_DATA_TYPE = 1;
        // 列表数据
        public static final int LIST_DATA_TYPE = 2;
    }

    private int pageNumber;

    public CommonPageIpeProcessor(WebCrawlerConfigIpe config, CrawlerResultIpeService resultService, int pageNumber){
        this.config = config;
        this.resultService = resultService;
        this.pageNumber = pageNumber;
    }

    private String getRequestMethod(){
        String method = HttpConstant.Method.GET;
        String configMethod = config.getRequestMethod();
        if("POST".equals(configMethod)) {
            method = HttpConstant.Method.POST;
        }
        return method;
    }

    @Override
    public void process(Page page) {

        String disk = HtmlDownload.DISK_PATH + config.getWebDomain() + "/";
        CrawlerIpeIndustryRecord result = new CrawlerIpeIndustryRecord();
        String detailUrl = config.getDetailUrlRegular();
        String pageReqMethod= config.getPageReqMethod();
        // 返回为json
        if(!StringUtils.isEmpty(pageReqMethod) && ("2".equals(pageReqMethod) || "3".equals(pageReqMethod))) {

            // 列表页数据
            String strTemp = "\\$\\{page\\}";
            String searchUrl = config.getWebSearchUrl();
            String pageUrl = config.getPageUrlRegular();
            boolean isPageUrl = page.getUrl().get().contains(pageUrl.split(strTemp)[0]) || page.getUrl().get().contains(searchUrl.split(strTemp)[0]);
            if (isPageUrl) {
                List<String> ids = new JsonPathSelector(config.getDetailById()).selectList(page.getRawText());
                if (org.apache.commons.collections.CollectionUtils.isNotEmpty(ids)) {
                    for (String id : ids) {
                        Request request = new Request(detailUrl+ id.trim());
                        request.setMethod(getRequestMethod());
                        request.setCharset("UTF-8");
                        page.addTargetRequest(request);
                    }
                    page.setSkip(true);
                    return;
                }

            } else {
                // 详情也是json
                if("3".equals(pageReqMethod)) {
                    String fileName = UUID.randomUUID().toString() + ".json";
                    HtmlDownload.fileOut(disk, fileName, page.getRawText());

                    makeRecordByFieldRegByJson(result, page.getRawText(),config.getFieldPropertyRegular());

                    result.setWebName(config.getWebName());
                    result.setWebDetailName(new JsonPathSelector(config.getDetailTitleRegular()).select(page.getRawText()));
                    result.setWebDomain(config.getWebDomain());
                    result.setWebDetailUrl(page.getUrl().toString());
                    result.setWebDetailResultUrl(HtmlDownload.VISIT_PATH + (config.getWebDomain().contains(".") ? config.getWebDomain().split("\\.")[1] : config.getWebDomain())  + "/" + fileName);
                    result.setSavePath(disk + fileName);
                    result.setState(0);
                    //result.setCity(config.getCity());
                    resultService.addOrEditResult(result, 0);
                    return;
                }
            }
        }



        String title = null;
        String[] detailTitles = config.getDetailTitleRegular().split("#");
        for(String detailTitle : detailTitles){
            String reg = null;
            String url = detailTitle;
            if(detailTitle.contains("!!")) {
                String[] regArr = detailTitle.split("!!");
                url = regArr[0];
                reg = regArr[1];
            }
            title = page.getHtml().xpath(url).toString();
            if(!StringUtil.isBlank(title)){
                if(!StringUtils.isEmpty(reg)) {
                    title = title.replace("\n","")
                            .replace(" ","")
                            .replaceAll(" ", "")
                            .replaceAll(reg, "");
                }
                break;
            }
        }

        String strTemp = "\\$\\{page\\}";
        boolean isDetail = page.getUrl().get().contains(config.getPageUrlRegular().split(strTemp)[0]) || page.getUrl().get().contains(config.getWebSearchUrl().split(strTemp)[0]);
        if(/*StringUtil.isBlank(title) && */isDetail){
            //skip this page
            String[] urls = detailUrl.split("@");
            for(String url : urls){
                page.addTargetRequests(page.getHtml().links().regex(url).all());
            }
            page.setSkip(true);
            return;
        }

        try {
            String url = page.getUrl().toString();
            result.setWebName(config.getWebName());
            result.setWebDetailName(title);
            result.setWebDomain(config.getWebDomain());
            result.setWebDetailUrl(url);

            //String name = url.substring(url.lastIndexOf("/")+1);
            String fileName = HtmlDownload.getFileName(url);

            String content = null;
            String selectQue = "";
            String[] contentRegs = config.getDetailContentRegular().split("#");
            for(String contentReg : contentRegs){
                content = page.getHtml().xpath(contentReg).toString();
                if(!StringUtil.isBlank(content)){
                    selectQue = contentReg.substring(0, contentReg.lastIndexOf("/")).replaceAll("//", "").replaceAll("@", "").replaceAll("/", " ") + " ";
                    break;
                }
            }

            Html html = page.getHtml();
            Elements eles =  html.getDocument().getAllElements();
            Elements imgs = eles.get(0).select(selectQue + "img");

            if(imgs != null && imgs.size() > 0){
                for(Element img : imgs){
                    String src = img.attr("src");
                    String sourcePath = "";
                    String source = "";
                    if(!src.contains("http://") && !src.contains("http://")){
                        if(src.contains("./")){ // 图片在当前目录
                            sourcePath = url.substring(0, url.lastIndexOf("/")) + "/";
                        } else {
                            String temp = url.replaceAll("http://", "").replaceAll("http://", "");
                            sourcePath = "http://" + (temp.contains("/") ? temp.substring(0, temp.indexOf("/")) : temp) + "/";
                        }
                        source =sourcePath + src;
                    } else {
                        source = src;
                    }

                    String imageFile = (config.getWebDomain().contains(".") ? config.getWebDomain().split("\\.")[1] : config.getWebDomain()) + "/img/"+ src.substring(src.lastIndexOf("//") + 1);
                    String diskPath = HtmlDownload.DISK_PATH + imageFile;
                    DownloadPdf.downloadAndSave(source, diskPath);
                    /*result.setAttachmentPath(diskPath);*/
                    content = content.replace(src, HtmlDownload.IMAGE_VISIT_PATH + imageFile);
                }

            }
            // 下载内容中的附件
            content = crawlerFiles(selectQue, eles, url, content);
            HtmlDownload.fileOut(disk, fileName, content);

            result.setWebDetailResultUrl(HtmlDownload.VISIT_PATH + (config.getWebDomain().contains(".") ? config.getWebDomain().split("\\.")[1] : config.getWebDomain())  + "/" + fileName);
            result.setSavePath(disk + fileName);
            result.setState(0);
            //result.setCity(config.getCity());
            String fieldStr = config.getFieldPropertyRegular();
            if(!StringUtil.isBlank(fieldStr)) {
                if(config.getFieldType() == FieldType.SINGLE_DATA_TYPE) {
                    makeRecordByFieldReg(result, eles, fieldStr);
                } else if(config.getFieldType() == FieldType.LIST_DATA_TYPE) {
                    List<CrawlerIpeIndustryRecord> recordList = getMakeRecordListByFieldReg(result, eles, fieldStr, config.getFieldListSign());
                    resultService.addOrEditResultList(recordList, result.getWebDetailUrl());
                    return;
                }
            }
            resultService.addOrEditResult(result, 0);
        } catch (Exception e){
        	e.printStackTrace();
        	result.setErrorMsg(e.getMessage());
            resultService.addOrEditResult(result, 0);
        }
    }

    /**
     * 下载内容中的附件
     * @param selectQue
     * @param eles
     * @param url
     * @param content
     * @return
     */
    private String crawlerFiles(String selectQue, Elements eles, String url, String content) {

        try {
            Elements files = eles.get(0).select(selectQue + "a");
            if(files != null && files.size() > 0){
                for(Element file : files){
                    String sourcePath = "";
                    String source = "";
                    String href = file.attr("href");

                    String suffix = getFileSuffix(href);
                    if(StringUtils.isEmpty(suffix)) {
                        return content;
                    }

                    if(!href.contains("http://") && !href.contains("http://")){
                        if(href.contains("./")){ // 附件在当前目录
                            sourcePath = url.substring(0, url.lastIndexOf("/")) + "/";
                        } else {
                            String temp = url.replaceAll("http://", "").replaceAll("http://", "");
                            sourcePath = "http://" + (temp.contains("/") ? temp.substring(0, temp.indexOf("/")) : temp) + "/";
                        }
                        source =sourcePath + href;
                    } else {
                        source = href;
                    }

                    String imageFile = (config.getWebDomain().contains(".") ? config.getWebDomain().split("\\.")[1] : config.getWebDomain()) + "/" + suffix.replaceAll(".", "").toLowerCase()+ "/"+ href.substring(href.lastIndexOf("//") + 1);
                    String diskPath = HtmlDownload.DISK_PATH + imageFile;
                    DownloadPdf.downloadAndSave(source, diskPath);
                    content = content.replace(href, HtmlDownload.IMAGE_VISIT_PATH + imageFile);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return content;
    }

    /**
     * 是否存在附件
     * @return
     */
    private String getFileSuffix(String href) {
        String suffix = null;
        for (String fileStr : HtmlDownload.FILE_LIST) {
            if(href.contains(fileStr)) {
                suffix = fileStr;
                break;
            }
        }

        return suffix;
    }

    /**
     * 获取列表类型数据
     * @param result
     * @param eles
     * @param fieldStr
     * @param fieldListSign
     * @return
     */
    private List<CrawlerIpeIndustryRecord> getMakeRecordListByFieldReg(CrawlerIpeIndustryRecord result, Elements eles, String fieldStr, String fieldListSign) {
        List<CrawlerIpeIndustryRecord> recordList = null;
        if(!StringUtils.isEmpty(fieldListSign)) {
            recordList = new ArrayList<>();
            Elements elements = eles.select(fieldListSign);
            if(elements != null && elements.size() > 0) {
                for (Element e : elements) {
                    CrawlerIpeIndustryRecord record = new CrawlerIpeIndustryRecord();
                    BeanUtils.copyProperties(result, record);
                    makeRecordByFieldReg(record, e.getAllElements(), fieldStr);
                    recordList.add(record);
                }
            }
        }
        return recordList;
    }

    /**
     * 根据爬虫规则设定字段值
     * @param result
     * @param eles
     * @param fieldStr
     */
    private void makeRecordByFieldReg(CrawlerIpeIndustryRecord result, Elements eles, String fieldStr) {
        if (!StringUtil.isBlank(fieldStr)) {
            List<CrawlerFieldModel> fieldList = getFieldList(fieldStr);
            if (!CollectionUtils.isEmpty(fieldList)) {
                for (CrawlerFieldModel fieldModel : fieldList) {
                    String value = fieldModel.getPathValue();
                    String field = fieldModel.getField();
                    String type = fieldModel.getType();
                    String attractType = fieldModel.getAttrType();
                    String attractDom = fieldModel.getAttrDom();
                    String replaceReg = fieldModel.getReplaceReg();
                    if (!StringUtil.isBlank(type) && "xpath".equals(type)) {
                        value = getValue(eles, value, attractDom, attractType);
                    }
                    if(field.equals("year") || field.equals("punishTime")){
                        System.out.println(replaceReg);
                    }
                    if(!StringUtils.isEmpty(replaceReg)/* && !"punishTime".equals(field)*/) {
                        value = value.replace("\n","")
                                .replace(" ","")
                                .replaceAll(" ", "")
                                .replaceAll(replaceReg, "").replaceAll(" ","");
                    }/* else {
                        if("punishTime".equals(field)) {
                            value = value.replace("\n","")
                                    .replaceAll(replaceReg, "").trim();
                        }

                    }*/

                    setValueField(result, value, field);
                }
            }
        }
    }

    /**
     * Xpath 支持多个寻找规则
     * @param eles
     * @param pathValueStr
     * @param attractDom
     * @param attractType
     * @return
     */
    private String getValue(Elements eles, String pathValueStr, String attractDom, String attractType) {
        String value = "";
        String[] pathValues = pathValueStr.split("\\|分\\|");
        Elements elements = null;
        for(String pathValue : pathValues) {
            if (!StringUtil.isBlank(attractType) && "attr".equals(attractType)) {
                elements = getElementByConfig(eles, pathValue);
                value = elements != null && elements.size() > 0?  elements.get(0).attr(attractDom) : "";
            } else if ("text".equals(attractType)) {
                elements = getElementByConfig(eles, pathValue);
                value = elements != null && elements.size() > 0?  elements.get(0).text() : "";
            } else if("html".equals(attractType)) {
                elements = getElementByConfig(eles, pathValue);
                value = elements != null && elements.size() > 0?  elements.get(0).html() : "";
            }
            if (!StringUtils.isEmpty(value)) {
                break;
            }
        }

        return value;
    }

    /**
     * 根据爬虫规则json设定字段值
     * @param result
     * @param rawText
     * @param fieldStr
     */
    private void makeRecordByFieldRegByJson(CrawlerIpeIndustryRecord result, String rawText, String fieldStr) {
        if (!StringUtil.isBlank(fieldStr)) {
            List<CrawlerFieldModel> fieldList = getFieldList(fieldStr);
            if (!CollectionUtils.isEmpty(fieldList)) {
                for (CrawlerFieldModel fieldModel : fieldList) {
                    String value = fieldModel.getPathValue();
                    String field = fieldModel.getField();
                    String type = fieldModel.getType();
                    String replaceReg = fieldModel.getReplaceReg();
                    if (!StringUtil.isBlank(type) && "XJson".equals(type)) {
                        value =  new JsonPathSelector(value).select(rawText);
                    } else if(!StringUtil.isBlank(type) && "text".equals(type)) {
                    }
                    if(!StringUtils.isEmpty(replaceReg)) value.replaceAll(replaceReg, "");
                    setValueField(result, value, field);
                }
            }
        }
    }

    /**
     * 设定值
     * @param result
     * @param value
     * @param fieldStr
     */
    private void setValueField(CrawlerIpeIndustryRecord result, String value, String fieldStr) {
        try {
            Field field = result.getClass().getDeclaredField(fieldStr);
            if(field != null) {
                field.setAccessible(true);
                field.set(result, value);
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private List<CrawlerFieldModel> getFieldList(String fieldStr) {
        List<CrawlerFieldModel> fieldList = null;
        try {
            fieldList = JSONArray.parseArray(fieldStr, CrawlerFieldModel.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return fieldList;
    }

    @Override
    public Site getSite() {
        return site;
    }

    /***
     * delete CRLF; delete  empty line ;delete blank lines
     *
     * @param input
     * @return
     */
    private static String deleteCRLFOnce(String input) {
        return input.replaceAll("((\r\n)|\n)[\\s\t ]*(\\1)+", "$1");
    }

    public void startCrawler() {

        String pageReqMethod= config.getPageReqMethod();
        // 返回为json
        if(!StringUtils.isEmpty(pageReqMethod) && ("2".equals(pageReqMethod) || "3".equals(pageReqMethod))) {
            spiderResponseJson();
            return;
        }

        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        Html html = httpClientDownloader.download(config.getWebSearchUrl().replace("${page}", config.getStartPage().toString()));
        Elements eles =  html.getDocument().getAllElements();

        crawerThread(config.getWebSearchUrl().replace("${page}", config.getStartPage().toString()));

        if(!eles.isEmpty()){
            String pageParam = "0";
            if("attr".equals(config.getAttrType())){
                pageParam = getElementByConfig(eles,config.getPageResult()).attr(config.getAttrName());
            } else if("text".equals(config.getAttrType())){
                String num = getElementByConfig(eles,config.getPageResult()).text();
                pageParam = StringUtils.trimAllWhitespace(StringUtil.isBlank(num) ? "0" : num.replaceAll(" ", ""));
            } else if("href".equals(config.getAttrType())){
                String href = getElementByConfig(eles,config.getPageResult()).attr(config.getAttrType());
                if(!StringUtil.isBlank(href)){
                    href = href.substring(href.indexOf("?") + 1);
                    if(!StringUtil.isBlank(href)){
                        String[] hreArr = href.contains("&") ? href.split("&") : new String[]{href};
                        for(String hre : hreArr){
                            String hres = StringUtils.trimAllWhitespace(hre).replace(" ", "");
                            if(hres.contains(config.getAttrName())){
                                pageParam = hres.replace(config.getAttrName(), "");
                                break;
                            }
                        }
                    }
                }
            }else if("html".equals(config.getAttrType())){
                String num = getElementByConfig(eles,config.getPageResult()).html();
                pageParam = StringUtils.trimAllWhitespace(StringUtil.isBlank(num) ? "0" : num.replaceAll(" ", ""));
            } else if("value".equals(config.getAttrType())){
                pageParam = StringUtils.isEmpty(config.getMaxPage()) ?  "0": config.getMaxPage().toString();
            }

            int total = 0;
            if(!StringUtil.isBlank(config.getReplaceRegular())){
                total = Integer.parseInt(pageParam.replaceAll(config.getReplaceRegular(), ""));
            } else {
                total = Integer.parseInt(pageParam);
            }

            if("1".equals(config.getPageType())){ //已知总条数
                int pageSize = config.getMaxPage(); //已知总条数时，代表每页条数
                if(pageSize > 0){
                    total = total / pageSize + (total % pageSize > 0 ? 1 : 0);
                }
            }

            if(config.getMaxPage() != null && config.getMaxPage() != 0){
                total =  total > config.getMaxPage() ? config.getMaxPage() : total;
            }
            for(int i = 0; i < total; i ++){
                Spider spider = Spider.create(new CommonPageIpeProcessor(config, resultService, pageNumber));
                //System.out.println("total is :" + i + "==URL===:" + config.getPageUrlRegular().replace("${page}", String.valueOf(i)));
                spider.addUrl(config.getPageUrlRegular().replace("${page}", String.valueOf(i)));
                spider.run();
            }
        }
    }

    /**
     * 开启第一页爬取
     * @param url
     */
    private void crawerThread(String url) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CompletionService<String> completionService = new ExecutorCompletionService<String>(executorService);
        Callable<String> call = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Spider spider = Spider.create(new CommonPageIpeProcessor(config, resultService, pageNumber));
                spider.addUrl(url);
                spider.run();
                return "success";
            }
        };
        completionService.submit(call);
    }

    /**
     * Json 数据的处理
     */
    private void spiderResponseJson () {
        Spider spider = Spider.create(new CommonPageIpeProcessor(config, resultService, pageNumber));
        Request request = new Request(config.getWebSearchUrl().replace("${page}", config.getStartPage().toString()));
        request.setMethod(getRequestMethod());
        request.setCharset("UTF-8");
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        Page page = httpClientDownloader.download(request, Spider.create(new CommonPageIpeProcessor(config, resultService, pageNumber)));

        int total = Integer.parseInt(new JsonPathSelector(config.getPageResult()).select(page.getRawText()));
        if(config.getMaxPage() != null && config.getMaxPage() != 0){
            total =  total > config.getMaxPage() ? config.getMaxPage() : total;
        }

        for(int i = 0; i < total; i ++){
            Spider spider2 = Spider.create(new CommonPageIpeProcessor(config, resultService, pageNumber));
            request = new Request(config.getPageUrlRegular().replace("${page}", String.valueOf(i)));
            request.setMethod(getRequestMethod());
            request.setCharset("UTF-8");
            spider2.addRequest(request);
            spider2.run();
        }
    }


    private Elements getElementByConfig(Elements eles, String pageResult){
        Elements element = null;
        if(pageResult.contains("@last")){
            element = eles.get(0).select(pageResult.replace("@last", ""));
            if(element != null && element.size() > 0) {
                element = element.last().getAllElements();
            }
            /*element = eles.get(0).select(pageResult.replace("@last", "")).last().getAllElements();*/
        } else if(pageResult.contains("@first")){
            element = eles.get(0).select(pageResult.replace("@first", ""));
            if(element != null && element.size() > 0) {
                element = element.first().getAllElements();
            }
            /*element = eles.get(0).select(pageResult.replace("@first", "")).first().getAllElements();*/
        }else {
            element = eles.get(0).select(pageResult);
        }
        return element;
    }

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
}
