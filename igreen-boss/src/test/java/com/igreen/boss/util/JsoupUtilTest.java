package com.igreen.boss.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Ignore;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class JsoupUtilTest {

	@Test
	public void test() throws IOException{
	       Map<String, String> params = new HashMap<String, String>();
	        params.put("cmd", "getRecords");
	        params.put("pageSize", "15");
	        params.put("pageIndex", "1");
	        params.put("countryId", "1");
	        params.put("provinceId", "-1");
	        params.put("cityId", "-1");
	        params.put("startYear", "-1");
	        params.put("endYear", "-1");
	        params.put("professionId", "-1");
	        params.put("itemType", "0");
	        params.put("companyType", "0");
	        params.put("fengxian", "0");
	        params.put("ishistory", "2");
	        Map<String, String> cookies = null;
	        Response res = Jsoup.connect("http://www.ipe.org.cn/IndustryRecord/Regulatory.aspx").timeout(30000).execute();
	        cookies = res.cookies();
	        Document doc = Jsoup.connect("http://www.ipe.org.cn/data_ashx/GetAirData.ashx")
	                .data(params)
	                .referrer("http://www.ipe.org.cn/IndustryRecord/Regulatory.aspx")
	                .cookies(cookies).timeout(30000)
	                .post();
	        //System.out.println(doc.toString());
	        
	        Elements links = doc.getElementsByTag("a");
	        Element link = links.get(links.size()-1);
	        System.out.println(link.toString());
	        System.out.println(link.text());
	        
	        String text = doc.body().text();
	        //System.out.println(text);
	        JSONObject jsonObject = JSON.parseObject(text);
	        String value = (String) jsonObject.get("content");
	        //System.out.println(value);
	        doc = Jsoup.parse("<table>"+UnicodeUtil.parseHtml(value)+"</table>");
	        System.out.println(doc.toString());
	        Elements trs = doc.getElementsByTag("tr");
	        for(Element tr : trs){
	        	String attr = tr.attr("onclick");
	        	System.out.println(attr.substring(attr.indexOf("(")+1, attr.indexOf(",")));
	        	Elements tds = tr.getElementsByTag("td");
	        	for(Element td : tds){
	        		System.out.println(td.text());
	        	}
	        }
	}
	
	@Test
	@Ignore
	public void getRecordEachYear() throws IOException{
	       Map<String, String> params = new HashMap<String, String>();
	        params.put("cmd", "getRecordEachYear");
	        params.put("companyId", "1107420");
	        Map<String, String> cookies = null;
	        Response res = Jsoup.connect("http://www.ipe.org.cn/IndustryRecord/regulatory-record.aspx?companyId=1107420&dataType=0&isyh=0").timeout(30000).execute();
	        cookies = res.cookies();
	        Document doc = Jsoup.connect("http://www.ipe.org.cn/data_ashx/GetAirData.ashx")
	                .data(params)
	                .referrer("http://www.ipe.org.cn/IndustryRecord/regulatory-record.aspx?companyId=1107420&dataType=0&isyh=0")
	                .cookies(cookies).timeout(30000)
	                .post();
	        //System.out.println(doc.toString());
	        String text = doc.body().text();
	        doc = Jsoup.parse(UnicodeUtil.parseHtml(text));
	        //System.out.println(doc.toString());
	        Elements links = doc.getElementsByTag("a");
	        for(Element link : links){
	        	String attr = link.attr("onclick");
	        	System.out.println(attr.substring(attr.indexOf("(")+1, attr.indexOf(",")));
	        }
	}
	
	@Test
	@Ignore
	public void getRecordInfo() throws IOException{
	       Map<String, String> params = new HashMap<String, String>();
	        params.put("cmd", "getRecordInfo");
	        params.put("recordId", "544423");
	        Map<String, String> cookies = null;
	        Response res = Jsoup.connect("http://www.ipe.org.cn/IndustryRecord/regulatory-record.aspx?companyId=1107420&dataType=0&isyh=0").timeout(30000).execute();
	        cookies = res.cookies();
	        Document doc = Jsoup.connect("http://www.ipe.org.cn/data_ashx/GetAirData.ashx")
	                .data(params)
	                .referrer("http://www.ipe.org.cn/IndustryRecord/regulatory-record.aspx")
	                .cookies(cookies).timeout(30000)
	                .post();
	        //System.out.println(doc.toString());
	        String text = doc.body().text();
	        doc = Jsoup.parse(UnicodeUtil.parseHtml(text));
	        System.out.println(doc.toString());
	        Elements divs = doc.getElementsByTag("div");
	        Element div = divs.get(1);
	        Elements ps = div.getElementsByTag("p");
	        for(Element p : ps){
	        	System.out.println(p.text());
	        }
	}
	
	
	//http://www.ipe.org.cn/GreenSecurities/Securities.aspx
	
	@Test
	@Ignore
	public void securities() throws IOException{
	       Map<String, String> params = new HashMap<String, String>();
	        params.put("cmd", "getListRecords");
	        params.put("pageIndex", "1");
	        params.put("pageSize", "10");
	        Map<String, String> cookies = null;
	        Response res = Jsoup.connect("http://www.ipe.org.cn/GreenSecurities/Securities.aspx").timeout(30000).execute();
	        cookies = res.cookies();
	        Document doc = Jsoup.connect("http://www.ipe.org.cn/data_ashx/GetAirData.ashx")
	                .data(params)
	                .referrer("http://www.ipe.org.cn/GreenSecurities/Securities.aspx")
	                .cookies(cookies).timeout(30000)
	                .post();
	        //System.out.println(doc.toString());
	        
	        Elements links = doc.getElementsByTag("a");
	        Element link = links.get(links.size()-1);
	        System.out.println(link.toString());
	        System.out.println(link.text());
	        
	        String text = doc.body().text();
	        //System.out.println(text);
	        JSONObject jsonObject = JSON.parseObject(text);
	        String value = (String) jsonObject.get("content");
	        //System.out.println(value);
	        doc = Jsoup.parse("<table>"+UnicodeUtil.parseHtml(value)+"</table>");
	        System.out.println(doc.toString());
	}
	
	@Test
	public void tianyanTest() throws IOException{
		String name = "泰康仙林鼓楼医院有限公司";
	       Map<String, String> params = new HashMap<String, String>();
	        Map<String, String> cookies = null;
	        Response res = Jsoup.connect("https://www.tianyancha.com").timeout(30000).execute();
	        cookies = res.cookies();
	        Document doc = Jsoup.connect("https://www.tianyancha.com/search?key=泰康仙林鼓楼医院有限公司&checkFrom=searchBox")
	        		.header("Accept", "*/*")
	    			.header("Accept-Encoding", "gzip, deflate")
	    			.header("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
	    			.header("Referer", "https://www.baidu.com/")
	    			.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0")
	                .referrer("https://www.tianyancha.com")
	                .cookies(cookies).timeout(30000)
	                .get();
	        //System.out.println(doc.toString());
	        Elements eles = doc.select("div .search_repadding2").select(".col-xs-10");
	        String comurl = null;
	        for(Element element:eles){
	        	Elements ems = element.getElementsByTag("em");
	        	if(ems.size() == 0){
	        		continue;
	        	}
	        	String companyName = ems.get(0).text();
	        	if(companyName.endsWith(name)){
	        		comurl = element.getElementsByTag("a").get(0).attr("href");
//	        		System.out.println(comurl + "符合要求");
	        	}else{
	        		String url = element.getElementsByTag("a").get(0).attr("href");
//	        		System.out.println(url + "不符合要求");
	        	}
	        }
	        
	        doc = Jsoup.connect(comurl)
	        		.header("Accept", "*/*")
	    			.header("Accept-Encoding", "gzip, deflate")
	    			.header("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
	    			.header("Referer", "https://www.baidu.com/")
	    			.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0")
	                .referrer("https://www.tianyancha.com")
	                .cookies(cookies).timeout(30000)
	                .get();
	        Element markTable = doc.getElementById("nav-main-baseInfo");
	        Elements tableSlibings = markTable.siblingElements();
	        Element baseInfo = tableSlibings.get(0);
	        String legalPersonalName = baseInfo.getElementsByTag("a").get(0).text();
	        Elements registerInfo = baseInfo.getElementsByClass("baseinfo-module-content-value");
	        String registerCapital = registerInfo.get(0).text();
	        String openTime = registerInfo.get(1).text();
	        String operateState = registerInfo.get(2).text();
	        System.out.println("legalPersonalName = " + legalPersonalName + ",registerCapital = " + registerCapital
	        		+ ",openTime = " + openTime + ",operateState = " + operateState);
	        
	        
	        Element detailInfo = tableSlibings.get(1);
	        Elements trs = detailInfo.getElementsByTag("tr");
	        
	        Elements spans = trs.get(0).getElementsByTag("span");
	        String registerNum = spans.get(0).text();
	        String origanizationCode = spans.get(1).text();
	        
	        spans = trs.get(1).getElementsByTag("span");
	        String creditCode = spans.get(0).text();
	        String companyType = spans.get(2).text();
	        
	        spans = trs.get(2).getElementsByTag("span");
	        String taxpayerCode = spans.get(0).text();
	        
	        spans = trs.get(3).getElementsByTag("span");
	        String trade = spans.get(0).text();
	        String businessTime = spans.get(1).text();
	        String[] times = businessTime.split("至");
	        String startTime = times[0].trim();
	        String endTime = times[1].trim();
	        
	        spans = trs.get(4).getElementsByTag("span");
	        String checkTime = spans.get(0).text();
	        String checkOriginazation = spans.get(1).text();
	        
	        spans = trs.get(5).getElementsByTag("span");
	        String address = spans.get(0).text();
	        
	        spans = trs.get(6).getElementsByClass("js-full-container");
	        String scope = spans.get(0).text();
	}
	
	@Test
	public void getprovincesTest() throws Exception{
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("cmd", "getprovinces");
	    params.put("countryId", "2");
	    Map<String, String> cookies = null;
	    Response res = Jsoup.connect("http://www.ipe.org.cn/IndustryRecord/Regulatory.aspx").timeout(30000).execute();
	    cookies = res.cookies();
	    Document doc = Jsoup.connect("http://www.ipe.org.cn/data_ashx/GetAirData.ashx")
	            .data(params)
	            .referrer("http://www.ipe.org.cn/IndustryRecord/Regulatory.aspx")
	            .cookies(cookies).timeout(30000)
	            .post();
	    //System.out.println(doc.toString());
	    String text = doc.body().text();
	    //System.out.println(text);
	    JSONObject jsonObject = JSON.parseObject(text);
	    String value = (String) jsonObject.get("content");
	    //System.out.println(value);
	    doc = Jsoup.parse(UnicodeUtil.parseHtml(value));
	    //System.out.println(doc.toString());
	    
	    Elements options = doc.getElementsByTag("option");
	    for(Element option : options){
	    	if(option.text().indexOf("请选择") >= 0)
	    		continue;
	    	System.out.println(option.attr("value")+","+option.text());
	    	params.clear();
	    	params.put("cmd","getspaces");
	    	params.put("p_val", option.attr("value"));
	    	doc = Jsoup.connect("http://www.ipe.org.cn/data_ashx/GetAirData.ashx")
		            .data(params)
		            .referrer("http://www.ipe.org.cn/IndustryRecord/Regulatory.aspx")
		            .cookies(cookies).timeout(30000)
		            .post();
	    	text = doc.body().text();
		    jsonObject = JSON.parseObject(text);
		    value = (String) jsonObject.get("content");
		    doc = Jsoup.parse(UnicodeUtil.parseHtml(value));
		    Elements citys = doc.getElementsByTag("option");
		    for(Element city : citys){
		    	if(city.text().indexOf("请选择") >= 0)
		    		continue;
		    	System.out.println(city.attr("value")+","+city.text());
		    }
	    }
	    
	}
	
	
	
	@Test
	public void testindex() throws IOException{
	        Map<String, String> cookies = null;
	        Response res = Jsoup.connect("http://www.ipe.org.cn/IndustryRecord/Regulatory.aspx").timeout(30000).execute();
	        cookies = res.cookies();
	        Document doc = Jsoup.connect("http://www.ipe.org.cn/IndustryRecord/Regulatory.aspx")
	                .referrer("http://www.ipe.org.cn/IndustryRecord/Regulatory.aspx")
	                .cookies(cookies).timeout(30000)
	                .get();
	        System.out.println(doc.toString());
	        
/*	        Elements links = doc.getElementsByTag("a");
	        Element link = links.get(links.size()-1);
	        System.out.println(link.toString());
	        System.out.println(link.text());
	        
	        String text = doc.body().text();
	        //System.out.println(text);
	        JSONObject jsonObject = JSON.parseObject(text);
	        String value = (String) jsonObject.get("content");
	        //System.out.println(value);
	        doc = Jsoup.parse("<table>"+UnicodeUtil.parseHtml(value)+"</table>");
	        System.out.println(doc.toString());
	        Elements trs = doc.getElementsByTag("tr");
	        for(Element tr : trs){
	        	String attr = tr.attr("onclick");
	        	System.out.println(attr.substring(attr.indexOf("(")+1, attr.indexOf(",")));
	        	Elements tds = tr.getElementsByTag("td");
	        	for(Element td : tds){
	        		System.out.println(td.text());
	        	}
	        }*/
	}

}
