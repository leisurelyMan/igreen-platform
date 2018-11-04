package com.igreen.boss.test;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import java.util.ArrayList;
import java.util.List;

public class WebMagicTest implements PageProcessor {
    // 抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);
    private static int count =0;

    @Override
    public Site getSite() {
        return site;
    }

    @Override
    public void process(Page page) {
        //判断链接是否符合http://www.cnblogs.com/任意个数字字母-/p/7个数字.html格式
        /*if(!page.getUrl().regex("http://www.cnblogs.com/[a-z 0-9 -]+/p/[0-9]{7}.html").match()){
            //加入满足条件的链接
            page.addTargetRequests(
                    page.getHtml().xpath("/*//*[@id=\"post_list\"]/div/div[@class='post_item_body']/h3/a/@href").all());
        }else{
            //获取页面需要的内容
            System.out.println("抓取的内容："+
                    page.getHtml().xpath("/*//*[@id=\"Header1_HeaderTitle\"]/text()").get()
            );
            count ++;
        }*/

        //获取页面需要的内容
        System.out.println("抓取的内容："+
                page.getHtml().xpath("//div[@class=\"cl\"]/p[@class=\"videoplay\"]/text()").get()
        );

        Html html = page.getHtml();
        Elements eles =  html.getDocument().getAllElements();
        Elements trs = eles.get(0).select("div[class='cl']");

        List<FileObj> fileObjs = new ArrayList<>();
        for(int i = 0; i < trs.size(); i ++) {
            Element element = trs.get(i);
            String name = element.select("p[class='titlehost']").text().replaceAll("主讲老师：黄慧娟","");
            String file = element.select("p[class='videoplay']").attr("dir");

            System.out.println(file + "," + name);
            FileObj obj = new FileObj();
            obj.setFile(file);
            obj.setName(name);
            fileObjs.add(obj);
        }

        count ++;
    }

    public static void main(String[] args) {
        long startTime, endTime;
        System.out.println("开始爬取...");
        startTime = System.currentTimeMillis();
        //Spider.create(new WebMagicTest()).addUrl("http://127.0.0.1/考纲语法.html").thread(5).run();
        Spider.create(new WebMagicTest()).addUrl("http://127.0.0.1/bk.html").thread(5).run();
        endTime = System.currentTimeMillis();
        System.out.println("爬取结束，耗时约" + ((endTime - startTime) / 1000) + "秒，抓取了"+count+"条记录");
    }

    private static class FileObj {
        private String name;
        private String file;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }
    }

}