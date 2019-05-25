package com.igreen.boss.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProvinceTest {

    @Test
    public void test() throws IOException {
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String> cookies = null;
        //Connection.Response res = Jsoup.connect("http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2018/index.html").timeout(30000).execute();
        //cookies = res.cookies();
        Document doc = Jsoup.connect("http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2018/index.html")
                .data(params)
                .referrer("http://www.stats.gov.cn")
                //.cookies(cookies).timeout(30000)
                .post();
        //System.out.println(doc.toString());
        Elements provincetrs = doc.getElementsByClass("provincetr");
        for(Element provincetr:provincetrs){
            Elements provinces = provincetr.getElementsByTag("td");
            int index = 0;
            for(Element province:provinces){
                index ++;
                if(index > 1){
                    return;
                }
                System.out.println(province.text());
                System.out.println(province.childNode(0).attr("href"));
                city("http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2018/"+province.attr("href"));
            }
        }
    }

    private void city(String url)throws IOException{
        Document doc = Jsoup.connect(url).referrer("http://www.stats.gov.cn").post();
        Elements citytrs = doc.getElementsByClass("citytr");
        for(Element citytr:citytrs){
            Elements citys = citytr.getElementsByTag("td");
            for(Element city:citys){
                System.out.println(city.text());
                System.out.println(city.childNode(0).attr("href"));

            }
        }
    }

    private void county(String url){

    }
}
