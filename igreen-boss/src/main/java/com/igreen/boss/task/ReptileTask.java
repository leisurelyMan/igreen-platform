package com.igreen.boss.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.Resource;

import com.igreen.boss.util.HtmlDownload;
import com.igreen.common.dao.IpeIndustryRecord1Mapper;
import com.igreen.common.enums.IpeIndustryRecordSourceEnum;
import com.igreen.common.model.IpeIndustryRecord1;
import com.igreen.common.model.IpeIndustryRecord1Example;
import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.igreen.boss.service.basicInfo.ReptileService;
import org.springframework.util.StringUtils;

@Component
public class ReptileTask {
	@Resource
	ReptileService reptileService;

	@Resource
	IpeIndustryRecord1Mapper ipeIndustryRecord1Mapper;
	
	/**
	 * 环保部爬虫线程池
	 */
	private ExecutorService spiderExecutor = Executors.newFixedThreadPool(3);
	
	/**
	 * ipe爬虫线程池
	 */
	public static ExecutorService ipeExecutor = Executors.newFixedThreadPool(2);
	
	private Logger logger = Logger.getLogger(ReptileTask.class);
	
	/**
	 * 清洁企业标记
	 */
	private static final int RUNTAGCLEANPRODUCTION = 1;
	/**
	 * 监控企业标记
	 */
	private static final int RUNTAGMONITORCOMPANY = 2;
	/**
	 * 环保举报热线群众举报案件情况
	 */
	private static final int RUNTAGENVIRONMENTALISSUE = 3;
	
	/**
	 * 每个线程的最大爬取页数
	 */
	@SuppressWarnings("unused")
	private static final int MAXPAGE = Integer.MAX_VALUE;
	/**
	 * 清洁生产企业
	 */
	public static final String CLEANPRODUCTIONURL =
			"http://datacenter.mep.gov.cn:8099/ths-report/report!list.action?xmlname=1462437745098";
	
	/**
	 * 国家重点监控企业
	 */
	public static final String MONITORCOMPANYURL =
			"http://datacenter.mep.gov.cn:8099/ths-report/report!list.action?xmlname=1462849093743";
	
	/**
	 * “12369”环保举报热线群众举报案件情况
	 */
	public static final String ENVIRONMENTALISSUEURL =
			"http://datacenter.mep.gov.cn:8099/ths-report/report!list.action?xmlname=1462866483032";
	
	/**
	 * 空气质量URL
	 */
	public static final String AIRQUALITYURL = "http://datacenter.mep.gov.cn:8099/ths-report/report!list.action";
	
	
	/**
	 * IPE爬虫启动标志位，true为爬取，false为停止
	 */
	public static volatile boolean IPEFLAG = false;
	
	/**
	 * IPE公司数量预估值，目前观测到的最大值是142万多，先预估在160万，防止以后公司数量增长
	 */
	public static int maxIpeComplayId = 1600000;
	
	/**
	 * IPE爬虫的数量，目前设置为2
	 */
	public static int maxIpeThread = 1;
	
	/**
	 * 每个月的5号和20号，凌晨2点爬取环保部数据
	 */
	@Scheduled(cron="0 0 2 10,27 * ?")
	public void MEPSpider( ){
		List<MEPRunnable> runList = new ArrayList<MEPRunnable>( );
		int totalPage = getTotalPage(CLEANPRODUCTIONURL);
		if(totalPage == -1){
			logger.error("获取清洁企业页面总数失败，跳过清洁企业爬虫");
		}else{
			MEPRunnable cleanProductTask = new MEPRunnable(reptileService,RUNTAGCLEANPRODUCTION,1,totalPage,CLEANPRODUCTIONURL);
			runList.add(cleanProductTask);
		}
		
		totalPage = getTotalPage(MONITORCOMPANYURL);
		if(totalPage == -1){
			logger.error("获取重点监控企业页面总数失败，跳过重点监控企业爬虫");
		}else{
			MEPRunnable monitorCompanyTask = new MEPRunnable(reptileService,RUNTAGMONITORCOMPANY,1,totalPage,MONITORCOMPANYURL);
			runList.add(monitorCompanyTask);
		}
		
		totalPage = getTotalPage(ENVIRONMENTALISSUEURL);
		if(totalPage == -1){
			logger.error("获取群众举报页面总数失败，跳过群众举报爬虫");
		}else{
			MEPRunnable issueTask = new MEPRunnable(reptileService,RUNTAGENVIRONMENTALISSUE,1,totalPage,ENVIRONMENTALISSUEURL);
			runList.add(issueTask);
		}
		for(MEPRunnable mep:runList){
			spiderExecutor.execute(mep);
		}
	}
	
	/**
	 * 获取环保部每个数据页面的总页数，页面结构都一样，div class = 'report_page'
	 * @param url
	 * @return
	 */
	private int getTotalPage(String url){
		int totalPage = -1;
		try{
			Connection con = Jsoup.connect(url);
	        Document maxNumDoc = con.get();
	        Elements rs = maxNumDoc.getElementsByClass("report_page");
	        String totalPageText = rs.get(0).text().trim();
	        String pages = totalPageText.split(" ")[2].replace("总页数 ：", " ").trim();
	        totalPage = Integer.parseInt(pages);
		}catch(Exception e){
			logger.info("获取" + url + "总页数失败",e);
		}
		return totalPage;
	}
	
	public static class IPERunnable implements Runnable{
		private ReptileService service;
		/**
		 * 起始页，由于目前没有对同一个页面分多线程爬取，故值为1
		 */
		private int start;
		/**
		 * 结束页
		 */
		private int end;
		
		public IPERunnable(ReptileService service,int start,int end){
			this.service = service;
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			service.businessRiskReptile(start, end);
		}
		
		@Override
		public String toString( ){
			return "[start = " + start + ",end =" + end + "]";
		}
	}
	
	/**
	 * 环保部爬虫执行类
	 * @author cuiwei
	 *
	 */
	class MEPRunnable implements Runnable{
		private ReptileService service;
		/**
		 * 区分是清洁企业，监控企业还是群众举报事件
		 */
		private int runTag;
		/**
		 * 起始页，由于目前没有对同一个页面分多线程爬取，故值为1
		 */
		private int startPage;
		/**
		 * 结束页
		 */
		private int endPage;
		/**
		 * 数据源url
		 */
		private String reptileUrl;
		
		public MEPRunnable(ReptileService service,int runTag,int startPage,
				int endPage,String reptileUrl){
			this.service = service;
			this.runTag = runTag;
			this.startPage = startPage;
			this.endPage = endPage;
			this.reptileUrl = reptileUrl;
		}

		@Override
		public void run() {
			String[] urlArray = reptileUrl.split("\\?");
			String dataUrl = urlArray[0];
			String xmlname = urlArray[1].split("=")[1];
			//清洁企业
			if(this.runTag == RUNTAGCLEANPRODUCTION){
				Map<String,String> param = new HashMap<String,String>( );
				param.put("xmlname", xmlname);
				param.put("page.orderBy", "year");
				param.put("page.order", "desc");
				param.put("queryflag", "close");
				param.put("isdesignpatterns", "false");
				service.cleanProductionCompanyReptile(dataUrl, startPage, endPage, param);
			//监控企业
			}else if(this.runTag == RUNTAGMONITORCOMPANY){
				Map<String,String> param = new HashMap<String,String>( );
				param.put("xmlname", xmlname);
				param.put("page.orderBy", "SUBDIVISION");
				param.put("page.order", "desc");
				param.put("queryflag", "close");
				param.put("isdesignpatterns", "false");
				service.monitorCompanyReptile(dataUrl, startPage, endPage, param);
			//群众举报
			}else{
				Map<String,String> param = new HashMap<String,String>( );
				param.put("xmlname", xmlname);
				param.put("queryflag", "close");
				param.put("isdesignpatterns", "false");
				service.environmentalIssueReptile(dataUrl, startPage, endPage, param);
			}
		}
	}
	
	/**
	 * 8点爬取空气质量
	 */
	@Scheduled(cron="0 0 8 5,20 * ?")
	public void AirQualitySpider( ){
		reptileService.airQualityReptile(AIRQUALITYURL);
	}
	
	/**
	 * 每月10号和25号，晚上10点爬取排污许可信息，测试结果1分钟大概45条记录，目前共有排污企业5800左右
	 */
	@Scheduled(cron="0 0 22 3,17 * ?")
	public void pollutionLicenseSpider( ){
		reptileService.pollutionLicenseReptile( );
	}
	
	/**
	 * 每隔30分钟更新一次排污许可信息，测试结果1分钟大概18条，目前共有排污企业5800左右
	 */
	@Scheduled(cron="0 0 0/1 3,17 * ?")
	public void updatePollutionLicenseSpider( ){
		reptileService.pollutionLicenseTypeReptile();
	}

	@Scheduled(cron="0 25 23 * * ?")
	public void  downloadHtml(){
		logger.info("downloadHtml start");
		new Runnable() {
			@Override
			public void run() {
				IpeIndustryRecord1Example example = new IpeIndustryRecord1Example();
				example.createCriteria()
						.andSourceEqualTo(IpeIndustryRecordSourceEnum.EXCEL.getValue())
						.andFileNameIsNull();
				List<IpeIndustryRecord1> ipeList = ipeIndustryRecord1Mapper.selectByExample(example);
				for(IpeIndustryRecord1 record:ipeList){
					if(!StringUtils.isEmpty(record.getWebDetailUrl())){
						try {
							record.setFileName(HtmlDownload.download(record.getWebDetailUrl()));
							ipeIndustryRecord1Mapper.updateByPrimaryKeySelective(record);
						}catch (Exception e){
							e.printStackTrace();
						}
					}
				}
			}
		}.run();
		logger.info("downloadHtml end");
	}
}
