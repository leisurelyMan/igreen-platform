package com.igreen.boss.util;

import com.igreen.boss.service.crawler.CrawlerResultService;
import com.igreen.common.model.WebCrawlerConfig;
import com.igreen.common.model.WebCrawlerResult;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
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

/**
 * 返回JSON数据格式
 */
public class CommonPageJsonProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    private WebCrawlerConfig config;

    private CrawlerResultService resultService;

    // 保存地址
    private static final String DISK_PATH = "/data/files/crawler/";
    // 访问地址http
    private  static final String VISIT_PATH = "http://img.igreenbank.cn/html/crawler";

    private int pageNumber;

    public CommonPageJsonProcessor(WebCrawlerConfig config, CrawlerResultService resultService, int pageNumber){
        this.config = config;
        this.resultService = resultService;
        this.pageNumber = pageNumber;
    }

    public void process(Page page) {

    }

    public Site getSite() {
        return site;
    }



    public  void startCrawler() {

    }


	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

    
}
