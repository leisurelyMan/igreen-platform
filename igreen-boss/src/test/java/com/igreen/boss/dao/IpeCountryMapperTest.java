package com.igreen.boss.dao;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.igreen.boss.util.UnicodeUtil;
import com.igreen.common.dao.IpeCountryMapper;
import com.igreen.common.model.IpeCountry;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class IpeCountryMapperTest {

	@Resource
	IpeCountryMapper countryMapper;
	
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
	    	IpeCountry country = new IpeCountry(option.attr("value"), option.text());
	    	countryMapper.insertSelective(country);
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
		    	IpeCountry ipecity = new IpeCountry(city.attr("value"), city.text(), country.getCode());
		    	countryMapper.insertSelective(ipecity);
		    }
	    }
	    
	}
}
