package com.igreen.boss.util;

import com.alibaba.fastjson.JSONArray;
import com.igreen.boss.service.crawler.CrawlerResultIpeService;
import com.igreen.common.model.CrawlerIpeIndustryRecord;
import com.igreen.common.model.WebCrawlerConfigIpe;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
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
import java.lang.reflect.Field;
import java.util.List;
import java.util.UUID;

public class CommonPageIpeProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    private WebCrawlerConfigIpe config;

    private CrawlerResultIpeService resultService;

    // 保存地址
    private static final String DISK_PATH = "/data/files/";
    // 访问地址http
    private  static final String VISIT_PATH = "http://img.igreenbank.cn/html/";

    private  static final String IMAGE_VISIT_PATH = "http://img.igreenbank.cn/";

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

        String disk = DISK_PATH + config.getWebDomain() + "/";
        CrawlerIpeIndustryRecord result = new CrawlerIpeIndustryRecord();
        String detailUrl = config.getDetailUrlRegular();
        String pageReqMethod= config.getPageReqMethod();
        // 返回为json
        if(!StringUtils.isEmpty(pageReqMethod) && ("2".equals(pageReqMethod) || "3".equals(pageReqMethod))) {

            // 列表页数据
            if (!page.getUrl().get().contains(detailUrl)) {
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
                    fileOut(disk, fileName, page.getRawText());

                    makeRecordByFieldRegByJson(result, page.getRawText(),config.getFieldPropertyRegular());

                    result.setWebName(config.getWebName());
                    result.setWebDetailName(new JsonPathSelector(config.getDetailTitleRegular()).select(page.getRawText()));
                    result.setWebDomain(config.getWebDomain());
                    result.setWebDetailUrl(page.getUrl().toString());
                    result.setWebDetailResultUrl(VISIT_PATH + (config.getWebDomain().contains(".") ? config.getWebDomain().split("\\.")[1] : config.getWebDomain())  + "/" + fileName);
                    result.setSavePath(disk + fileName);
                    result.setCity(config.getCity());
                    resultService.addOrEditResult(result, 0);
                    return;
                }
            }
        }



        String title = null;
        String[] detailTitles = config.getDetailTitleRegular().split("#");
        for(String detailTitle : detailTitles){
            title = page.getHtml().xpath(detailTitle).toString();
            if(!StringUtil.isBlank(title)){
                break;
            }
        }

        if(StringUtil.isBlank(title)){
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
            String name = url.substring(url.lastIndexOf("/")+1);
            String fileName = "";
            if(StringUtil.isBlank(name)){
                fileName = UUID.randomUUID() + ".html";
            }else if(name.contains(".")){
                fileName = name.substring(0, name.indexOf(".")) + ".html";
            } else if(fileName.contains("=")){
                fileName = name.substring(name.indexOf("=")) + ".html";
            } else {
                fileName = name.length() > 30 ? UUID.randomUUID().toString() : name + ".html";
            }


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

            String fieldStr = config.getFieldPropertyRegular();
            if(!StringUtil.isBlank(fieldStr)) {
                makeRecordByFieldReg(result, eles, fieldStr);
            }

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
                    String diskPath = DISK_PATH + imageFile;
                    DownloadPdf.downloadAndSave(source, diskPath);
                    /*result.setAttachmentPath(diskPath);*/
                    content = content.replace(src, IMAGE_VISIT_PATH + imageFile);
                }

            }
            fileOut(disk, fileName, content);

        	result.setWebName(config.getWebName());
            result.setWebDetailName(title);
            result.setWebDomain(config.getWebDomain());
            result.setWebDetailUrl(url);
            result.setWebDetailResultUrl(VISIT_PATH + (config.getWebDomain().contains(".") ? config.getWebDomain().split("\\.")[1] : config.getWebDomain())  + "/" + fileName);
            result.setSavePath(disk + fileName);
           /* result.setSearchId(config.getSearchId());
            result.setSearchName(config.getSearchName());
            result.setArea(config.getArea());*/
            result.setCity(config.getCity());
            /*result.setSourceType(config.getSourceType());*/
            resultService.addOrEditResult(result, 0);
        } catch (Exception e){
        	e.printStackTrace();
        }
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
                        if (!StringUtil.isBlank(attractType) && "attr".equals(attractType)) {
                            value = getElementByConfig(eles, value).attr(attractDom);
                        } else if ("text".equals(config.getAttrType())) {
                            value = getElementByConfig(eles, value).text();
                        }
                    }
                    if(!StringUtils.isEmpty(replaceReg)) value = value.replaceAll(replaceReg, "");
                    setValueField(result, value, field);
                }
            }
        }
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

    private void fileOut(String disk, String fileName, String content){
        FileOutputStream outputStream = null;

        try{
            File file = new File(disk);
            if(!file.exists()){
                file.mkdirs();
            }
            String path = disk + fileName;
            File file2 = new File(path);
            outputStream = new FileOutputStream(file2);
            if(!file2.exists()){
                file2.createNewFile();
            }
            outputStream.write(content.getBytes());
            outputStream.flush();

        } catch (Exception e){
            e.printStackTrace();
        } finally {

            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
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
        //System.out.println(html);
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
            element = eles.get(0).select(pageResult.replace("@last", "")).last().getAllElements();
        } else {
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
