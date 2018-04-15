package com.igreen.boss.util;

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

public class CommonPageProcessor  implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    private WebCrawlerConfig config;

    private CrawlerResultService resultService;
    
    // 保存地址
    private static final String DISK_PATH = "/data/files/crawler";
    // 访问地址http
    private  static final String VISIT_PATH = "/web/html/";
    
    private int pageNumber;

    public CommonPageProcessor(WebCrawlerConfig config, CrawlerResultService resultService, int pageNumber){
        this.config = config;
        this.resultService = resultService;
        this.pageNumber = pageNumber;
    }

    public void process(Page page) {

        page.addTargetRequests(page.getHtml().links().regex(config.getDetailUrlRegular()).all());
        page.putField("title", page.getHtml().xpath(config.getDetailTitleRegular()).toString());

        if(page.getResultItems().get("title") == null){
            //skip this page
            page.setSkip(true);
            return;
        }

        try {
            String url = page.getUrl().toString();
            String name = url.substring(url.lastIndexOf("/")+1);
            String fileName = "";
            if(name.contains(".")){
                fileName = name.substring(0, name.indexOf(".")) + ".html";
            } else if(fileName.contains("=")){
                fileName = name.substring(name.indexOf("=")) + ".html";
            } else {
                fileName = name + ".html";
            }
            String disk = DISK_PATH + config.getWebDomain() + "/";
            fileOut(disk, fileName, deleteCRLFOnce(page.getHtml().xpath(config.getDetailContentRegular()).toString()));

        	WebCrawlerResult result = new WebCrawlerResult();
        	result.setWebName(config.getWebName());
            result.setWebDetailName(page.getResultItems().get("title").toString());
            result.setWebDomain(config.getWebDomain());
            result.setWebDetailUrl(url);
            result.setWebDetailResultUrl(VISIT_PATH + config.getWebDomain() + fileName);
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
        // 陕西省 searchid=2
        //String url = "http://www.snepb.gov.cn/e/search/result/index.php?page=${page}&searchid=2";
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        Html html = httpClientDownloader.download(config.getWebSearchUrl().replace("${page}", config.getStartPage().toString()));
        Elements eles =  html.getDocument().getAllElements();
        if(!eles.isEmpty()){
            int total = 0;
            if("attr".equals(config.getAttrType())){
                total = Integer.valueOf(eles.get(0).select(config.getPageResult()).attr(config.getAttrName()));
            } else if("text".equals(config.getAttrType())){
            	total = Integer.valueOf(StringUtils.trimAllWhitespace(eles.get(0).select(config.getPageResult()).text()));
            }
            for(int i = 0; i < (total > config.getMaxPage() ? config.getMaxPage() : total); i ++){
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
