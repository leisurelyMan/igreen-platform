package com.igreen.boss.test;

import com.igreen.boss.util.CommonPageIpeProcessor;
import org.apache.commons.collections.CollectionUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.JsonPathSelector;
import us.codecraft.webmagic.utils.HttpConstant;

import java.util.List;

public class CrawlerTest  implements PageProcessor {

    private Site site = Site.me();

    private static final String ARITICALE_URL = "http://angularjs\\.cn/api/article/\\w+";

    private static final String LIST_URL = "http://www.creditjx.gov.cn/DataQuery/doublePublicity/queryDoublePublicityList.json?tableType=2&inpParam=&orgIdOrRegionId=2EB078AFA4A35251E050007F010076D8&page=\\d+";

    private static final String DETAIL_URL = "http://www.creditjx.gov.cn/DataQuery/doublePublicity/getPermissionDetail.json?id=";

    @Override
    public void process(Page page) {
        if (!page.getUrl().get().contains(DETAIL_URL)) {
            List<String> ids = new JsonPathSelector("$.list[*].ID").selectList(page.getRawText());
            if (CollectionUtils.isNotEmpty(ids)) {
                for (String id : ids) {
                    Request request = new Request(DETAIL_URL + id.trim());
                    request.setMethod(HttpConstant.Method.POST);
                    page.addTargetRequest(request);
                }
                page.setSkip(true);
            }
        } else {
           /* page.putField("title", new JsonPathSelector("$.data.title").select(page.getRawText()));*/
            page.putField("content", new JsonPathSelector("$.domain.ID").select(page.getRawText()));
        }

    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        //Spider.create(new CrawlerTest()).addUrl("http://www.creditjx.gov.cn/DataQuery/doublePublicity/queryDoublePublicityList.json?tableType=2&inpParam=&orgIdOrRegionId=2EB078AFA4A35251E050007F010076D8&page=2").run();
        Spider spider = Spider.create(new CrawlerTest());
        Request request = new Request("http://www.creditjx.gov.cn/DataQuery/doublePublicity/queryDoublePublicityList.json?tableType=1&inpParam=&orgIdOrRegionId=2EB078AFA4A35251E050007F010076D8&page=1");
        request.setMethod(HttpConstant.Method.POST);
        request.setCharset("UTF-8");
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        Page page = httpClientDownloader.download(request, Spider.create(new CrawlerTest()));

        try {
            System.out.println(new String (page.getRawText().getBytes("iso8859-1"),"UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*spider.addRequest(request);
        spider.run();*/
    }
}
