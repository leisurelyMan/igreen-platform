package com.igreen.boss.service.basicInfo;

import java.util.Map;

public interface ReptileService {

	/**
	 * 爬取行政处罚信息
	 * @param incrementFlag 是否增量爬取
	 * @return
	 */
	void businessRiskReptile(int start,int end);
	
	/**
	 * 爬取清洁生产企业
	 * @param url 环保部清洁生产企业数据URL
	 * @param startPage 开始页
	 * @param endPage 结束页
	 * @param queryParameter 查询参数
	 * @return
	 */
	void cleanProductionCompanyReptile(String url,int startPage,int endPage,
			Map<String,String> queryParameter);
	
	/**
	 * 爬取举报案件
	 * @param url 环保部群众举报案件数据URL
	 * @param startPage 开始页
	 * @param endPage 结束页
	 * @param queryParameter 查询参数
	 * @return
	 */
	void environmentalIssueReptile(String url,int startPage,int endPage,
			Map<String,String> queryParameter);
	
	/**
	 * 爬取监控企业
	 * @param url 环保部重点监控企业数据URL
	 * @param startPage 开始页
	 * @param endPage 结束页
	 * @param queryParameter 查询参数
	 * @return
	 */
	void monitorCompanyReptile(String url,int startPage,int endPage,
			Map<String,String> queryParameter);
	
	/**
	 * 爬取环保部空气质量
	 * @param url 环保部空气质量URL
	 * @return
	 */
	void airQualityReptile(String url);
	
	/**
	 * 爬取排污许可信息
	 */
	void pollutionLicenseReptile( );
	
	/**
	 * 爬取污染物排放规律，排污企业中的污染种类，大气污染物排放规律，废水污染物排放规律是调用JS解析，jsoup
	 * 无法爬取内容，只能使用HtmlUnit执行JS爬取
	 * 
	 * HtmlUnit执行效率很差，故从主流程中剥离出来，防止拖慢pollutionLicenseReptile的速度
	 * 
	 * 每小时执行一次，更新pollution表中pollution_type为空的企业信息，每次更新60个
	 */
	void pollutionLicenseTypeReptile( );
	
	int maxIpeCompanyId( );
}
