package com.igreen.boss.util;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.igreen.common.model.EnvicloudArea;
import com.igreen.common.model.EnvicloudBase;
import com.igreen.common.model.EnvicloudCityDailyAir;
import com.igreen.common.model.EnvicloudDischarge;
import com.igreen.common.model.EnvicloudLocation;
import com.igreen.common.model.EnvicloudMonthlyMete;
import com.igreen.common.model.EnvicloudParameter;
import com.igreen.common.model.EnvicloudPeriodicDischarge;
import com.igreen.common.model.EnvicloudYearMete;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class EnvicloudUtil {
	private static Logger logger = Logger.getLogger(EnvicloudUtil.class);
	/**
	 * 环境云基础URL
	 */
	public static final String BASEURL = "http://service.envicloud.cn:8082";
	/**
	 * 环境云结果码-成功
	 */
	public static final String RESULTCODESUCC = "200";
	/**
	 * 环境云结果码-内部错误
	 */
	public static final String RESULTCODEERROR = "201";
	/**
	 * 环境云结果码-结果集为空
	 */
	public static final String RESULTCODEEMPTY = "202";
	/**
	 * 环境云结果码-参数错误
	 */
	public static final String RESULTCODEPARAMETERERROR = "203";
	/**
	 * 用户私钥
	 */
	public static final String ACCESSKEY = "CMF0DGXLC25HA2U2MJAXNTAZMJE3NDYZODK1";
	
	/******************地理数据URL********************************/
	/**
	 * 城市地理位置url
	 */
	public static final String LOCATION = "/v2/location/{accessKey}/{cityCode}";
	/**
	 * 范围覆盖城市url
	 */
	public static final String AREA = "/v2/area/{accessKey}/{startLng}/{startLat}/{endLng}/{endLat}";
	/******************气象数据URL********************************/
	/**
	 * 月度历史天气url
	 */
	public static final String MONTHLYMETE = "/v2/monthlymete/{accessKey}/{cityCode}/{year}/{type}";
	/**
	 * 年度历史天气url
	 */
	public static final String YEARMETE = "/v2/yearlymete/{accessKey}/{cityCode}/{startYear}/{endYear}/{type}";
	/******************环境数据URL********************************/
	/**
	 * 城市指定日期空气质量url
	 */
	public static final String CITYDAILYAIR = "/v2/citydailyair/{accessKey}/{cityCode}/{date}/{type}";
	/**
	 * 年度污染排放url
	 */
	public static final String DISCHARGE = "/v2/discharge/{accessKey}/{year}/{filter}";
	/**
	 * 省级历史污染排放url
	 */
	public static final String PERIODICDISCHARGE = "/v2/periodicdischarge/{accessKey}/{startYear}/{endYear}/{province}/{filter}";
	
	/**
	 * url和封装Bean的对照表
	 */
	public static Map<String,Class<? extends EnvicloudBase>> urlToClass = new HashMap<String,Class<? extends EnvicloudBase>>( );
	static{
		urlToClass.put("location", EnvicloudLocation.class);
		urlToClass.put("area", EnvicloudArea.class);
		urlToClass.put("monthlymete", EnvicloudMonthlyMete.class);
		urlToClass.put("yearlymete", EnvicloudYearMete.class);
		urlToClass.put("citydailyair", EnvicloudCityDailyAir.class);
		urlToClass.put("discharge", EnvicloudDischarge.class);
		urlToClass.put("periodicdischarge", EnvicloudPeriodicDischarge.class);
	}
	
	
	/**
	 * 组装云平台url
	 * @param url 
	 * @param p 参数
	 * @return
	 */
	public static Map<String,String> buildEnvicloudAccessUrl(String url,EnvicloudParameter p){
		Map<String,String> result = new HashMap<String,String>( );
		List<String> fields=new ArrayList<String>();
		Pattern pattern = Pattern.compile("(?<=\\{)(.+?)(?=\\})");
		Matcher matcher = pattern.matcher(url);
		while(matcher.find()){
			fields.add(matcher.group());
		}
		
		for(String field:fields){
			try {
				Field f = p.getClass().getField(field);
				String name = f.getName();
				String methodPartName = name.replaceFirst(name.substring(0, 1), name.substring(0, 1)
	                    .toUpperCase());
				f.setAccessible(true);
				Method m = p.getClass().getMethod("get" + methodPartName);
                // 调用getter方法获取属性值
                String value = (String) m.invoke(p);
                if (value == null){
                	if(name.equals("type") || name.equals("filter")){
                		String target = "/{" + name + "}"; 
                    	url = url.replace(target, "");
                		continue;
                	}
                    logger.error(name + "参数没有值");
                    result.put("errorMsg", "参数不完整");
    				break;
                }else{
                	String target = "{" + name + "}"; 
                	url = url.replace(target, value);
                }
			} catch (NoSuchFieldException | SecurityException | NoSuchMethodException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				logger.error("参数不完整，url = " + url + ",parameter = " + p,e);
				result.put("errorMsg", "参数不完整");
				break;
			}
		}
		//完整的环境云访问路径
		url = BASEURL + url;
		result.put("url", url);
		return result;
	}
	
	public static Map<String,String> getRawData(String url,EnvicloudParameter p) throws IOException{
		Map<String,String> result = buildEnvicloudAccessUrl(url,p);
		if(result.get("errorMsg") == null){
			String accessUrl = result.get("url");
			OkHttpClient client = new OkHttpClient();
			client.setConnectTimeout(30, TimeUnit.SECONDS);
			client.setReadTimeout(30, TimeUnit.SECONDS);
			Request request = new Request.Builder().url(accessUrl).get().build();
			Response response = client.newCall(request).execute();
			result.put("data",response.body().string());
		}
		
		return result;
	}
	
	/**
	 * 从平台云获取数据
	 * @param url 访问数据的url
	 * @param p   访问数据的参数
	 * @return EnvicloudBase 返回结果的封装Bean
	 * @throws IOException
	 */
	public static EnvicloudBase getDataFromEnvicloud(String url,EnvicloudParameter p) throws IOException{
		Map<String,String> result = getRawData(url,p);
		if(result.get("errorMsg") == null){
			String data = result.get("data");
			String className = url.split("/")[2];
			Class<? extends EnvicloudBase> modelClass = urlToClass.get(className);
			return JSON.parseObject(data, modelClass);
		}else{
			EnvicloudBase errorP = new EnvicloudBase( );
			errorP.setRdesc(result.get("errorMsg"));
			return errorP;
		}
	}
	
	public static void main(String[] args) throws IOException{
		//location测试
//		EnvicloudParameter p = new EnvicloudParameter( );
//		p.setAccessKey(ACCESSKEY);
//		p.setCityCode("101010100");
//		EnvicloudBase o = getDataFromEnvicloud(LOCATION,p);
//		System.out.println(o);
		//area测试
//		EnvicloudParameter p = new EnvicloudParameter( );
//		p.setAccessKey(ACCESSKEY);
//		p.setStartLat("1000");
//		p.setStartLng("1000");
//		p.setEndLat("5000");
//		p.setEndLng("5000");
//		EnvicloudBase o = getDataFromEnvicloud(AREA,p);
//		System.out.println(o);
		//MONTHLYMETE测试
//		EnvicloudParameter p = new EnvicloudParameter( );
//		p.setAccessKey(ACCESSKEY);
//		p.setCityCode("101010100");
//		p.setYear("2015");
//		p.setType("avg");
//		EnvicloudBase o = getDataFromEnvicloud(MONTHLYMETE,p);
//		System.out.println(o);
		//YEARMETE测试
//		EnvicloudParameter p = new EnvicloudParameter( );
//		p.setAccessKey(ACCESSKEY);
//		p.setCityCode("101010100");
//		p.setStartYear("2010");
//		p.setEndYear("2015");
//		p.setType("pre");
//		EnvicloudBase o = getDataFromEnvicloud(YEARMETE,p);
//		System.out.println(o);
		//CITYDAILYAIR测试
//		EnvicloudParameter p = new EnvicloudParameter( );
//		p.setAccessKey(ACCESSKEY);
//		p.setCityCode("101010100");
//		p.setDate("20151101");
//		p.setType("PM25");
//		EnvicloudBase o = getDataFromEnvicloud(CITYDAILYAIR,p);
//		System.out.println(o);
		//DISCHARGE测试
//		EnvicloudParameter p = new EnvicloudParameter( );
//		p.setAccessKey(ACCESSKEY);
//		p.setYear("2012");
//		p.setFilter("空气");
//		EnvicloudBase o = getDataFromEnvicloud(DISCHARGE,p);
//		System.out.println(o);
		//PERIODICDISCHARGE测试
		EnvicloudParameter p = new EnvicloudParameter( );
		p.setAccessKey(ACCESSKEY);
		p.setStartYear("2010");
		p.setEndYear("2012");
		p.setProvince("江苏");
		p.setFilter("水");
		EnvicloudBase o = getDataFromEnvicloud(PERIODICDISCHARGE,p);
		System.out.println(o);
	}

}
