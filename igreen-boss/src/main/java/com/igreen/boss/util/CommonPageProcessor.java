package com.igreen.boss.util;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.igreen.boss.service.crawler.CrawlerResultService;
import com.igreen.common.model.WebCrawlerConfig;
import com.igreen.common.model.WebCrawlerResult;
import org.springframework.util.StringUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class CommonPageProcessor  implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    private WebCrawlerConfig config;

    private CrawlerResultService resultService;
    
    // 保存地址
    private static final String DISK_PATH = "/data/files/crawler";
    // 访问地址http
    private  static final String VISIT_PATH = "http://img.igreenbank.cn/html/";
    
    private int pageNumber;

    public CommonPageProcessor(WebCrawlerConfig config, CrawlerResultService resultService, int pageNumber){
        this.config = config;
        this.resultService = resultService;
        this.pageNumber = pageNumber;
    }

    public void process(Page page) {

        String detailUrl = config.getDetailUrlRegular();
        String[] urls = detailUrl.split("@");
        for(String url : urls){
            page.addTargetRequests(page.getHtml().links().regex(url).all());
        }

        String title = null;
        String[] detailTitles = config.getDetailTitleRegular().split("#");
        for(String detailTitle : detailTitles){
            title = page.getHtml().xpath(detailTitle).toString();
            if(!StringUtils.isEmpty(title)){
                break;
            }
        }

        if(StringUtils.isEmpty(title)){
            //skip this page
            page.setSkip(true);
            return;
        }

        try {
            String url = page.getUrl().toString();
            String name = url.substring(url.lastIndexOf("/")+1);
            String fileName = "";
            if(StringUtils.isEmpty(name)){
                fileName = UUID.randomUUID() + ".html";
            }else if(name.contains(".")){
                fileName = name.substring(0, name.indexOf(".")) + ".html";
            } else if(fileName.contains("=")){
                fileName = name.substring(name.indexOf("=")) + ".html";
            } else {
                fileName = name + ".html";
            }
            String disk = DISK_PATH + config.getWebDomain() + "/";

            String content = null;
            String selectQue = "";
            String[] contentRegs = config.getDetailContentRegular().split("#");
            for(String contentReg : contentRegs){
                content = page.getHtml().xpath(contentReg).toString();
                if(!StringUtils.isEmpty(content)){
                    selectQue = contentReg.substring(0, contentReg.lastIndexOf("/")).replaceAll("//", "").replaceAll("@", "").replaceAll("/", " ") + " ";
                    break;
                }
            }

            Html html = page.getHtml();
            Elements eles =  html.getDocument().getAllElements();
            WebCrawlerResult result = new WebCrawlerResult();
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

                    String diskPath = DISK_PATH + (config.getWebDomain().contains(".") ? config.getWebDomain().split(".")[1] : config.getWebDomain()) + "/img/"+ src.substring(src.lastIndexOf("\\") + 1);
                    DownloadPdf.downloadAndSave(source, diskPath);
                    /*result.setAttachmentPath(diskPath);*/
                    content = content.replace(src, VISIT_PATH + (config.getWebDomain().contains(".") ? config.getWebDomain().split(".")[1] : config.getWebDomain()) + "/img/"+ UUID.randomUUID() + src.substring(src.lastIndexOf(".") + 1));
                }

            }
            fileOut(disk, fileName, content);

        	result.setWebName(config.getWebName());
            result.setWebDetailName(title);
            result.setWebDomain(config.getWebDomain());
            result.setWebDetailUrl(url);
            result.setWebDetailResultUrl(VISIT_PATH + (config.getWebDomain().contains(".") ? config.getWebDomain().split("\\.")[1] : config.getWebDomain())  + "/" + fileName);
            result.setSavePath(disk + fileName);
            resultService.addOrEditResult(result, 0);
        } catch (Exception e){
        	e.printStackTrace();
        }
    }

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

    public  void startCrawler() {
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        Html html = httpClientDownloader.download(config.getWebSearchUrl().replace("${page}", config.getStartPage().toString()));
        Elements eles =  html.getDocument().getAllElements();
        if(!eles.isEmpty()){
            int total = 0;
            if("attr".equals(config.getAttrType())){
                total = Integer.valueOf(eles.get(0).select(config.getPageResult()).attr(config.getAttrName()));
            } else if("text".equals(config.getAttrType())){
                String num = eles.get(0).select(config.getPageResult()).text();
            	total = Integer.valueOf(StringUtils.trimAllWhitespace(StringUtils.isEmpty(num) ? "0" : num.replaceAll(" ", "")));
            } else if("href".equals(config.getAttrType())){
                String href = eles.get(0).select(config.getPageResult()).attr(config.getAttrType());
                if(org.apache.commons.lang3.StringUtils.isNotBlank(href)){
                    href = href.substring(href.indexOf("?") + 1);
                    if(org.apache.commons.lang3.StringUtils.isNotBlank(href)){
                        String[] hreArr = href.split("&");
                        for(String hre : hreArr){
                            String hres = org.apache.commons.lang3.StringUtils.trim(hre).replace(" ", "");
                            if(hres.contains(config.getAttrName())){
                                total =  Integer.valueOf(hres.replace(config.getAttrName(), ""));
                                break;
                            }
                        }
                    }
                }
            }

            if(config.getMaxPage() != null && config.getMaxPage() != 0){
                total =  total > config.getMaxPage() ? config.getMaxPage() : total;
            }
            for(int i = 0; i < total; i ++){
                Spider spider = Spider.create(new CommonPageProcessor(config, resultService, pageNumber));
                System.out.println("total is :" + i + "==URL===:" + config.getPageUrlRegular().replace("${page}", String.valueOf(i)));
                spider.addUrl(config.getPageUrlRegular().replace("${page}", String.valueOf(i)));
                spider.run();
            }
        }
    }

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

    
}
