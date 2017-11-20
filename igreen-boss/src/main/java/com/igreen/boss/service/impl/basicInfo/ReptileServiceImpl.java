package com.igreen.boss.service.impl.basicInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.igreen.boss.service.basicInfo.ImportService;
import com.igreen.boss.service.basicInfo.ReptileService;
import com.igreen.boss.task.ReptileTask;
import com.igreen.boss.util.FileUtil;
import com.igreen.boss.util.UnicodeUtil;
import com.igreen.common.dao.AdministrativePenaltyMapper;
import com.igreen.common.dao.AirQualityMapper;
import com.igreen.common.dao.CleanProductionCompanyMapper;
import com.igreen.common.dao.EnvironmentalIssueMapper;
import com.igreen.common.dao.ExecutionRecordMapper;
import com.igreen.common.dao.InformationDisclosureMapper;
import com.igreen.common.dao.IpeCountryMapper;
import com.igreen.common.dao.IpeIndustryRecordMapper;
import com.igreen.common.dao.ManagementRecordMapper;
import com.igreen.common.dao.MonitorCompanyMapper;
import com.igreen.common.dao.OtherInformationMapper;
import com.igreen.common.dao.PollutionDischargeLicenseMapper;
import com.igreen.common.dao.RegistItemMapper;
import com.igreen.common.model.AirQuality;
import com.igreen.common.model.CleanProductionCompany;
import com.igreen.common.model.EnvironmentalIssue;
import com.igreen.common.model.ExecutionRecord;
import com.igreen.common.model.InformationDisclosure;
import com.igreen.common.model.IpeIndustryRecord;
import com.igreen.common.model.ManagementRecord;
import com.igreen.common.model.MonitorCompany;
import com.igreen.common.model.OtherInformation;
import com.igreen.common.model.PollutionDischargeLicense;
import com.igreen.common.model.RegistItem;

@Service
public class ReptileServiceImpl implements ReptileService {
	private static Logger logger = Logger.getLogger(ReptileServiceImpl.class);
	
	@Resource
	ImportService importService;
	
	@Resource
	RegistItemMapper registItemMapper;
	
	@Resource
	AdministrativePenaltyMapper penaltyMapper;
	
	@Resource
	CleanProductionCompanyMapper cleanMapper;
	
	@Resource
	EnvironmentalIssueMapper issueMapper;
	
	@Resource
	MonitorCompanyMapper monitorMapper;
	
	@Resource
	IpeIndustryRecordMapper ipeIndustryRecordMapper;
	
	@Resource
	IpeCountryMapper ipeCountryMapper;
	
	@Resource
	AirQualityMapper airQualityMapper;
	
	@Resource
	PollutionDischargeLicenseMapper licenseMapper;
	
	@Resource
	ExecutionRecordMapper executionRecordMapper;
	
	@Resource
	ManagementRecordMapper manageMapper;
	
	@Resource
	InformationDisclosureMapper disclosureMapper;
	
	@Resource
	OtherInformationMapper otherMapper;
	
	@Value("#{config['filepath.ipe']}")
	String ipe_filepath;
	
	
	@Override
	public void businessRiskReptile(int start,int end) {
		int companyId = start;
		int noCompanyDataTimes = 0;
		while(noCompanyDataTimes < 1000){
			try{
				if(!ReptileTask.IPEFLAG){
					logger.info("停止IPE爬虫");
					return;
				}
				
				if(end <= start){
					logger.info("IPE爬取完毕，start = " + start + ",end = " + end);
					return;
				}
				
		        Response res = Jsoup.connect("http://www.ipe.org.cn/IndustryRecord/regulatory-record.aspx?companyId=" + companyId + "&dataType=0&isyh=0").timeout(30000).execute();
		        Map<String,String> cookies = res.cookies();
		        Document body = Jsoup.parse(res.body());
		        Element companyNameParent = body.getElementsByClass("record-title").get(0);
		        Element companyName = companyNameParent.getElementsByTag("h1").get(0);
		        String cName = companyName.html();
		        String remark = companyId + "";
		        logger.info("cname = " + cName + ",compnayId = " + companyId);
		        if(cName == null || cName.length() == 0){
		        	++noCompanyDataTimes;
		        	++companyId;
		        	continue;
		        }
		        
		        Element companyDetailParent = body.getElementsByClass("record-display").get(0);
		        Element companyDetail = companyDetailParent.getElementsByClass("display-info").get(0);
		        
	        	List<RegistItem> items = registItemMapper.selectByCompanyName(cName);
	        	logger.info("+++++++++++++++++++++++" + items.size());
	        	if(items.isEmpty()){
	        		Map<String,String> result = companyDetail(companyDetail);
		        	RegistItem registItem = new RegistItem();
		        	registItem.setRemark(remark);
		        	registItem.setCompanyId(companyId);
		        	registItem.setCompanyName(cName);
		        	registItem.setDataSource(2);
		        	registItem.setStatus(0);
		        	registItem.setAddress(result.get("address"));
		        	
		        	String companyPublic = result.get("companyPublic");
		        	if(companyPublic != null && companyPublic.trim().length() != 0){
		        		registItem.setGroupCompanyPublic(companyPublic);
		        	}
		        	
		        	String groupCompanyName = result.get("groupCompanyName");
		        	if(groupCompanyName != null && groupCompanyName.trim().length() != 0){
		        		registItem.setGroupCompanyName(groupCompanyName);
		        	}
		        	
		        	String groupCompanyExchangeName = result.get("groupCompanyExchangeName");
		        	if(groupCompanyExchangeName != null && groupCompanyExchangeName.trim().length() != 0){
		        		registItem.setGroupCompanyExchangeName(groupCompanyExchangeName);
		        	}
		        	
		        	String groupCompanyStockCode = result.get("groupCompanyStockCode");
		        	if(groupCompanyStockCode != null && groupCompanyStockCode.trim().length() != 0){
		        		registItem.setGroupCompanyStockCode(groupCompanyStockCode);
		        	}
		        	
		        	String trade = result.get("trade");
		        	if(trade != null && trade.trim().length() != 0){
		        		registItem.setTradeName(trade);
		        	}
		        	
		        	String sewageFacility = result.get("sewageFacility");
		        	if(sewageFacility != null && sewageFacility.trim().length() != 0){
		        		registItem.setSweageFacility(sewageFacility);
		        	}
		        	
		        	String processGasFacility = result.get("processGasFacility");
		        	if(processGasFacility != null && processGasFacility.trim().length() != 0){
		        		registItem.setProcessGasFacility(processGasFacility);
		        	}
		        	
		        	String boilerGasFacility = result.get("boilerGasFacility");
		        	if(boilerGasFacility != null && boilerGasFacility.trim().length() != 0){
		        		registItem.setBoilerGasFacility(boilerGasFacility);
		        	}
		        	
		        	String indusSewageDischarge = result.get("indusSewageDischarge");
		        	if(indusSewageDischarge != null && indusSewageDischarge.trim().length() != 0){
		        		registItem.setIndustrialSweageDischarge(indusSewageDischarge);
		        	}
		        	
		        	String lifeSewageDischarge = result.get("lifeSewageDischarge");
		        	if(lifeSewageDischarge != null && lifeSewageDischarge.trim().length() != 0){
		        		registItem.setLifeSewageDischarge(lifeSewageDischarge);
		        	}
		        	
		        	String indusSewageStandard = result.get("indusSewageStandard");
		        	if(indusSewageStandard != null && indusSewageStandard.trim().length() != 0){
		        		registItem.setIndistrialSweageEmissionStandard(indusSewageStandard);
		        	}
		        	
		        	String lifeSewageStandard = result.get("lifeSewageStandard");
		        	if(lifeSewageStandard != null && lifeSewageStandard.trim().length() != 0){
		        		registItem.setLifeSweageEmissionStandard(lifeSewageStandard);
		        	}
		        	
		        	String gasStandard = result.get("gasStandard");
		        	if(gasStandard != null && gasStandard.trim().length() != 0){
		        		registItem.setGasEmissionStandard(gasStandard);
		        	}
		        	
		        	String pollutantSource = result.get("pollutantSource");
		        	if(pollutantSource != null && pollutantSource.trim().length() != 0){
		        		registItem.setPollutantSource(pollutantSource);
		        	}
		        	
		        	String mainProduction = result.get("mainProduction");
		        	if(mainProduction != null && mainProduction.trim().length() != 0){
		        		registItem.setMainProduction(mainProduction);
		        	}
		        	
		        	String pullutantDes = result.get("pullutantDes");
		        	if(pullutantDes != null && pullutantDes.trim().length() != 0){
		        		registItem.setPollutantDesc(pullutantDes);
		        	}
		        	
		        	registItemMapper.insertSelective(registItem);
		        	addAdministrativePenaltys(registItem,cookies);
	        	}else{
	        		boolean addPenaltys = false;
	        		for(RegistItem r:items){
	        			//公司是IPE爬虫插入的，增量爬取监管记录
	        			if(r.getRemark() != null && r.getRemark().equalsIgnoreCase(remark)){
	        				addAdministrativePenaltys(r,cookies);
	        				addPenaltys = true;
	        				break;
	        			}
	        		}
	        		
	        		//公司不是IPE插入的，可能是其他爬虫，或者是手动录入的，必然缺少集团信息
	        		if(!addPenaltys){
	        			int itemSize = items.size();
	        			//选取其中一条公司信息，更新IPE数据，如remark,companyId及集团信息
	        			RegistItem item = items.get(0);
	        			//同样公司名在regist_item表中存在多个，该公司存在重复数据，日志记录
	        			if(itemSize > 1){
	        				logger.info("公司名称:" + item.getCompanyName() + "在公司表中存在重复数据");
	        			}
	        			Map<String,String> result = companyDetail(companyDetail);
			        	RegistItem registItem = new RegistItem();
			        	registItem.setId(item.getId());
			        	registItem.setRemark(remark);
			        	registItem.setCompanyId(companyId);
			        	
			        	String companyPublic = result.get("companyPublic");
			        	if(companyPublic != null && companyPublic.trim().length() != 0){
			        		registItem.setGroupCompanyPublic(companyPublic);
			        	}
			        	
			        	String groupCompanyName = result.get("groupCompanyName");
			        	if(groupCompanyName != null && groupCompanyName.trim().length() != 0){
			        		registItem.setGroupCompanyName(groupCompanyName);
			        	}
			        	
			        	String groupCompanyExchangeName = result.get("groupCompanyExchangeName");
			        	if(groupCompanyExchangeName != null && groupCompanyExchangeName.trim().length() != 0){
			        		registItem.setGroupCompanyExchangeName(groupCompanyExchangeName);
			        	}
			        	
			        	String groupCompanyStockCode = result.get("groupCompanyStockCode");
			        	if(groupCompanyStockCode != null && groupCompanyStockCode.trim().length() != 0){
			        		registItem.setGroupCompanyStockCode(groupCompanyStockCode);
			        	}
			        	
			        	String trade = result.get("trade");
			        	if(trade != null && trade.trim().length() != 0){
			        		registItem.setTradeName(trade);
			        	}
			        	
			        	String sewageFacility = result.get("sewageFacility");
			        	if(sewageFacility != null && sewageFacility.trim().length() != 0){
			        		registItem.setSweageFacility(sewageFacility);
			        	}
			        	
			        	String processGasFacility = result.get("processGasFacility");
			        	if(processGasFacility != null && processGasFacility.trim().length() != 0){
			        		registItem.setProcessGasFacility(processGasFacility);
			        	}
			        	
			        	String boilerGasFacility = result.get("boilerGasFacility");
			        	if(boilerGasFacility != null && boilerGasFacility.trim().length() != 0){
			        		registItem.setBoilerGasFacility(boilerGasFacility);
			        	}
			        	
			        	String indusSewageDischarge = result.get("indusSewageDischarge");
			        	if(indusSewageDischarge != null && indusSewageDischarge.trim().length() != 0){
			        		registItem.setIndustrialSweageDischarge(indusSewageDischarge);
			        	}
			        	
			        	String lifeSewageDischarge = result.get("lifeSewageDischarge");
			        	if(lifeSewageDischarge != null && lifeSewageDischarge.trim().length() != 0){
			        		registItem.setLifeSewageDischarge(lifeSewageDischarge);
			        	}
			        	
			        	String indusSewageStandard = result.get("indusSewageStandard");
			        	if(indusSewageStandard != null && indusSewageStandard.trim().length() != 0){
			        		registItem.setIndistrialSweageEmissionStandard(indusSewageStandard);
			        	}
			        	
			        	String lifeSewageStandard = result.get("lifeSewageStandard");
			        	if(lifeSewageStandard != null && lifeSewageStandard.trim().length() != 0){
			        		registItem.setLifeSweageEmissionStandard(lifeSewageStandard);
			        	}
			        	
			        	String gasStandard = result.get("gasStandard");
			        	if(gasStandard != null && gasStandard.trim().length() != 0){
			        		registItem.setGasEmissionStandard(gasStandard);
			        	}
			        	
			        	String pollutantSource = result.get("pollutantSource");
			        	if(pollutantSource != null && pollutantSource.trim().length() != 0){
			        		registItem.setPollutantSource(pollutantSource);
			        	}
			        	
			        	String mainProduction = result.get("mainProduction");
			        	if(mainProduction != null && mainProduction.trim().length() != 0){
			        		registItem.setMainProduction(mainProduction);
			        	}
			        	
			        	String pullutantDes = result.get("pullutantDes");
			        	if(pullutantDes != null && pullutantDes.trim().length() != 0){
			        		registItem.setPollutantDesc(pullutantDes);
			        	}
			        	
			        	registItemMapper.updateByPrimaryKeySelective(registItem);
	        			addAdministrativePenaltys(item,cookies);
	        		}
	        	}
	        	
	        	noCompanyDataTimes = 0;
	        	++companyId;
			}catch(Exception e){
				logger.error("IPE爬虫出错" + e.getMessage());
				noCompanyDataTimes = 0;
	        	++companyId;
			}
        }
	}
	
	private Map<String,String> companyDetail(Element table){
		Map<String,String> result = new HashMap<String,String>( );
		//企业详细地址
		Element addressTd = table.getElementsByTag("tr").get(0)
        		.getElementsByTag("td").get(2);
        String address = addressTd.html();
        result.put("address", address);
        //是否上市
        String companyPublic = table.getElementsByTag("tr").get(1)
        		.getElementsByTag("td").get(2).html();
        result.put("companyPublic", companyPublic);
        //本企业或所属集团公司名称
        String groupCompanyName = table.getElementsByTag("tr").get(2)
        		.getElementsByTag("td").get(1).html();
        result.put("groupCompanyName", groupCompanyName);
        //本企业或所属集团公司名称交易所名称
        String groupCompanyExchangeName = table.getElementsByTag("tr").get(3)
        		.getElementsByTag("td").get(1).html();
        result.put("groupCompanyExchangeName", groupCompanyExchangeName);
       //本企业或所属集团公司名称股票代码
        String groupCompanyStockCode = table.getElementsByTag("tr").get(3)
        		.getElementsByTag("td").get(2).html();
        result.put("groupCompanyStockCode", groupCompanyStockCode);
      //行业
        String trade = table.getElementsByTag("tr").get(4)
        		.getElementsByTag("td").get(1).html();
        result.put("trade", trade);
      //是否自有污水处理设施
        String sewageFacility = table.getElementsByTag("tr").get(5)
        		.getElementsByTag("td").get(2).html();
        result.put("sewageFacility", sewageFacility);
      //是否自有工业废气处理设施
        String processGasFacility = table.getElementsByTag("tr").get(6)
        		.getElementsByTag("td").get(1).html();
        result.put("processGasFacility", processGasFacility);
      //是否自有锅炉废气处理设施
        String boilerGasFacility = table.getElementsByTag("tr").get(7)
        		.getElementsByTag("td").get(1).html();
        result.put("boilerGasFacility", boilerGasFacility);
      //工业污水排放去向
        String indusSewageDischarge = table.getElementsByTag("tr").get(8)
        		.getElementsByTag("td").get(2).html();
        result.put("indusSewageDischarge", indusSewageDischarge);
      //生活污水排放去向
        String lifeSewageDischarge = table.getElementsByTag("tr").get(9)
        		.getElementsByTag("td").get(1).html();
        result.put("lifeSewageDischarge", lifeSewageDischarge);
      //工业污水排放标准
        String indusSewageStandard = table.getElementsByTag("tr").get(10)
        		.getElementsByTag("td").get(2).html();
        result.put("indusSewageStandard", indusSewageStandard);
      //生活污水排放标准
        String lifeSewageStandard = table.getElementsByTag("tr").get(11)
        		.getElementsByTag("td").get(1).html();
        result.put("lifeSewageStandard", lifeSewageStandard);
      //废气污水排放标准
        String gasStandard = table.getElementsByTag("tr").get(12)
        		.getElementsByTag("td").get(1).html();
        result.put("gasStandard", gasStandard);
        //污染源类型
        String pollutantSource = table.getElementsByTag("tr").get(13)
        		.getElementsByTag("td").get(1).html();
        result.put("pollutantSource", pollutantSource);
      //生产经营主要产品
        String mainProduction = table.getElementsByTag("tr").get(14)
        		.getElementsByTag("td").get(1).html();
        result.put("mainProduction", mainProduction);
      //企业排污情况自述
        String pullutantDes = table.getElementsByTag("tr").get(15)
        		.getElementsByTag("td").get(1).html();
        result.put("pullutantDes", pullutantDes);
        
        return result;
	}

	/**
	 * 爬取行政处罚信息
	 * @param registItem
	 * @throws IOException
	 */
	private void addAdministrativePenaltys(RegistItem registItem,Map<String, String> cookies) throws IOException {
	       Map<String, String> params = new HashMap<String, String>();
	        params.put("cmd", "getRecordEachYear");
	        params.put("companyId", registItem.getRemark());
	        Document doc = Jsoup.connect("http://www.ipe.org.cn/data_ashx/GetAirData.ashx")
	                .data(params)
	                .referrer("http://www.ipe.org.cn/IndustryRecord/regulatory-record.aspx?companyId="+registItem.getRemark()+"&dataType=0&isyh=0")
	                .cookies(cookies).timeout(30000)
	                .post();
	        //System.out.println(doc.toString());
	        String text = doc.body().text();
	        doc = Jsoup.parse(UnicodeUtil.parseHtml(text));
	        //System.out.println(doc.toString());
	        
	        Elements links = doc.getElementsByTag("a");
	        for(Element link : links){
	        	IpeIndustryRecord industryRecord = new IpeIndustryRecord();
	        	try {
	        		String attr = link.attr("onclick");
		        	String recordId = attr.substring(attr.indexOf("(")+1, attr.indexOf(","));
		        	Long ipeId = Long.parseLong(recordId);
		        	//监管记录是否已经存在，存在则跳过
		        	logger.info("公司" + registItem.getCompanyName() + ",id = " + registItem.getId() + ",ipeId = " + ipeId);
		        	List<IpeIndustryRecord> iRecord = ipeIndustryRecordMapper.selectByIpeId(ipeId);
		        	if(iRecord != null && iRecord.size() > 0){
		        		continue;
		        	}
		        	
		        	String year = attr.substring(attr.indexOf(",") + 2, attr.indexOf(")") - 1);
		        	industryRecord.setYear(year);
		        	industryRecord.setIpeId(ipeId);
		        	industryRecord.setTitle(link.attr("title"));
		        	industryRecord.setRegistItemId(registItem.getId());
		        	industryRecord.setCompanyName(registItem.getCompanyName());
		        	
	        		String filename = getRecordInfo(registItem,recordId,cookies);
	        		industryRecord.setFileName(filename);
	        		ipeIndustryRecordMapper.insertSelective(industryRecord);
				} catch (Exception e) {
					e.printStackTrace();
					continue;
				}
	        }
	}

	/**
	 * 爬取单条行政处罚信息
	 * @param registItem
	 * @param remark
	 * @throws IOException 
	 */
	private String getRecordInfo(RegistItem registItem, String remark,Map<String, String> cookies) throws IOException {
	       Map<String, String> params = new HashMap<String, String>();
	        params.put("cmd", "getRecordInfo");
	        params.put("recordId", remark);
	        Document doc = Jsoup.connect("http://www.ipe.org.cn/data_ashx/GetAirData.ashx")
	                .data(params)
	                .referrer("http://www.ipe.org.cn/IndustryRecord/regulatory-record.aspx")
	                .cookies(cookies).timeout(30000)
	                .post();
	        String text = doc.body().text();
	        doc = Jsoup.parse(UnicodeUtil.parseHtml(text));
	        Elements heads = doc.getElementsByTag("head");
	        if(!heads.isEmpty()){
	        	heads.get(0).appendElement("meta").attr("charset", "utf-8");
	        	heads.get(0).appendElement("meta").attr("http-equiv", "Content-Type").attr("content", "text/html; charset=utf-8");
	        	heads.get(0).appendElement("link").attr("href", "http://img.igreenbank.cn/ipe/main.css")
	        		.attr("type", "text/css").attr("rel", "stylesheet");
	        }
	        //System.out.println(doc.toString());
	        FileUtil.judeDirExists(new File(ipe_filepath));
	        File file = new File(ipe_filepath, registItem.getId() + "_" + remark +".html");  
	        try {  
	            file.createNewFile(); // 创建文件  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	        
	     // 向文件写入内容(输出流)
	        byte bt[] = new byte[1024];  
	        bt = doc.toString().getBytes();  
	        try {  
	            FileOutputStream in = new FileOutputStream(file);  
	            try {  
	                in.write(bt, 0, bt.length);  
	                in.close();
	            } catch (IOException e) {  
	                e.printStackTrace();  
	            }  
	        } catch (FileNotFoundException e) {  
	            e.printStackTrace();  
	        }
	        return file.getName();
	}

	@Override
	public void cleanProductionCompanyReptile(String url, int startPage,
			int endPage, Map<String, String> queryParameter){
		logger.info("清洁企业爬虫开始抽取数据");
		long startTime = System.currentTimeMillis();
		for(int index = startPage; index <= endPage; ++index){
			try{
				Connection con = Jsoup.connect(url);
				Iterator<Entry<String, String>> it = queryParameter.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry<String, String> entry = it.next();
					String key = entry.getKey();
					String value = entry.getValue();
					con.data(key, value);
				}
				con.data("page.pageNo", index + "");
				Document doc = con.post();
				Element table = doc.getElementById("GridView1");
		        Elements trs = table.getElementsByTag("tr");
		        int trSize = trs.size();
		        for(int trIndex = 1; trIndex < trSize; ++trIndex){
		        	Element tr = trs.get(trIndex);
		        	Elements tds = tr.getElementsByTag("td");
		        	String year = tds.get(0).text().trim();
		        	String batchNo = tds.get(1).text().trim();
		        	String city = tds.get(2).text().trim();
		        	String serialNumber = tds.get(3).text().trim();
		        	String companyName = tds.get(4).text().trim();
		        	String trade = tds.get(5).text().trim();
		        	String productSalesAmount = tds.get(6).text().trim();
		        	String region = tds.get(7).text().trim();
		        	String address = tds.get(8).text().trim();
		        	String reportTime = tds.get(9).text().trim();
		        	String submitCheckTime = tds.get(10).text().trim();
		        	String completeEstimateTime = tds.get(11).text().trim();
		        	String completeCheckTime = tds.get(12).text().trim();
		        	String checkOrganization = tds.get(13).text().trim();
		        	
		        	if(companyName == null || companyName.length() == 0){
		        		continue;
		        	}else{
		        		if(companyName.equals("有限公司") || companyName.equals("股份有限公司")){
		        			continue;
		        		}
		        	}
		        	
		        	CleanProductionCompany query = new CleanProductionCompany( );
		        	query.setYear(year);
		        	query.setBatchNo(batchNo);
		        	query.setCity(city);
		        	query.setSerialNumber(serialNumber);
		        	query.setCompanyName(companyName);
	        		List<CleanProductionCompany> companys = cleanMapper.selectByPatameter(query);
	        		if(!companys.isEmpty()){
	        			logger.info("清洁生产公司企业信息已存在，year = " + year + ",batchNo = " + batchNo
	        					+ ",city = " + city + ",serialNumber = " + serialNumber + ",companyName = " + companyName);
	        			continue;
	        		}
		        	
		        	CleanProductionCompany clean = new CleanProductionCompany( );
	        		clean.setYear(year);
	        		clean.setBatchNo(batchNo);
	        		clean.setCity(city);
	        		clean.setSerialNumber(serialNumber);
	        		clean.setCompanyName(companyName);
	        		clean.setTrade(trade);
	        		clean.setProductSalesAmount(productSalesAmount);
	        		clean.setRegion(region);
	        		clean.setAddress(address);
	        		clean.setReportTime(reportTime);
	        		clean.setSubmitCheckTime(submitCheckTime);
	        		clean.setCompleteEstimateTime(completeEstimateTime);
	        		clean.setCompleteCheckTime(completeCheckTime);
	        		clean.setCheckOrganization(checkOrganization);
	        		clean.setCreateTm(new Date( ));
	        		//爬取公司是否已在企业注册表中，如果没有，在企业表中新增，如果有，将清洁生产企业与企业表关联
		        	List<RegistItem> items = registItemMapper.selectByCompanyName(companyName);
		        	if(items.isEmpty()){
		        		RegistItem regist = new RegistItem( );
		        		regist.setCompanyName(companyName);
		        		regist.setDataSource(3);
		        		registItemMapper.insertSelective(regist);
		        		clean.setRegistItemId(regist.getId());
		        		cleanMapper.insertSelective(clean);
		        	}else{
		        		for(RegistItem item:items){
		        			clean.setId(null);
		        			clean.setRegistItemId(item.getId());
			        		cleanMapper.insertSelective(clean);
		        		}
		        	}
		        }
			}catch(Exception e){
				logger.error("爬取清洁生产企业数据时出错",e);
				continue;
			}
	    }
		
		long endTime = System.currentTimeMillis();
		logger.info("清洁企业爬虫共耗时 " + (endTime - startTime) / 1000 + "秒");
	}

	@Override
	public void environmentalIssueReptile(String url, int startPage,
			int endPage, Map<String, String> queryParameter) {
		logger.info("举报案件爬虫开始抽取数据");
		long startTime = System.currentTimeMillis();
		for(int index = startPage; index <= endPage; ++index){
			try{
				Connection con = Jsoup.connect(url);
				Iterator<Entry<String, String>> it = queryParameter.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry<String, String> entry = it.next();
					String key = entry.getKey();
					String value = entry.getValue();
					con.data(key, value);
				}
				con.data("page.pageNo", index + "");
				Document doc = con.post();
				Element table = doc.getElementById("GridView1");
		        Elements trs = table.getElementsByTag("tr");
		        int trSize = trs.size();
		        for(int trIndex = 1; trIndex < trSize; ++trIndex){
		        	Element tr = trs.get(trIndex);
		        	Elements tds = tr.getElementsByTag("td");
		        	String reportSequence = tds.get(0).text().trim();
		        	String reportYear = tds.get(1).text().trim();
		        	String reportMonth = tds.get(2).text().trim();
		        	String province = tds.get(3).text().trim();
		        	String companyName = tds.get(4).text().trim();
		        	String reportIssue = tds.get(5).text().trim();
		        	String dealResult = tds.get(6).text().trim();
		        	String reportComment = tds.get(7).text().trim();
		        	
		        	if(companyName == null || companyName.length() == 0){
		        		continue;
		        	}else{
		        		if(companyName.equals("有限公司") || companyName.equals("股份有限公司")){
		        			continue;
		        		}
		        	}
		        	
		        	EnvironmentalIssue query = new EnvironmentalIssue( );
		        	query.setReportYear(reportYear);
		        	query.setReportMonth(reportMonth);
		        	query.setCompanyName(companyName);
		        	List<EnvironmentalIssue> issues = issueMapper.selectByParameter(query);
		        	if(!issues.isEmpty()){
	        			logger.info("举报案件已存在，reportYear = " + reportYear + ",reportMonth = " + reportMonth
	        					+  ",companyName = " + companyName);
	        			continue;
	        		}
		        	
		        	EnvironmentalIssue issue = new EnvironmentalIssue( );
		        	issue.setReportSequence(reportSequence);
		        	issue.setReportYear(reportYear);
		        	issue.setReportMonth(reportMonth);
		        	issue.setProvince(province);
		        	issue.setCompanyName(companyName);
		        	issue.setReportIssue(reportIssue);
		        	issue.setDealResult(dealResult);
		        	issue.setReportComment(reportComment);
		        	issue.setCreateTm(new Date( ));
		        	List<RegistItem> items = registItemMapper.selectByCompanyName(companyName);
		        	if(items.isEmpty()){
		        		RegistItem regist = new RegistItem( );
		        		regist.setCompanyName(companyName);
		        		regist.setDataSource(3);
		        		registItemMapper.insertSelective(regist);
		        		issue.setRegistItemId(regist.getId());
		        		issueMapper.insertSelective(issue);
		        	}else{
		        		for(RegistItem item:items){
		        			issue.setId(null);
		        			issue.setRegistItemId(item.getId());
		        			issueMapper.insertSelective(issue);
		        		}
		        	}
		        }
			}catch(Exception e){
				logger.error("爬取举报案件数据时出错",e);
				continue;
			}
	    }
		
		long endTime = System.currentTimeMillis();
		logger.info("举报案件爬虫共耗时 " + (endTime - startTime) / 1000 + "秒");
		
	}

	@Override
	public void monitorCompanyReptile(String url, int startPage,
			int endPage, Map<String, String> queryParameter) {
		logger.info("重点监控企业爬虫开始抽取数据");
		long startTime = System.currentTimeMillis();
		for(int index = startPage; index <= endPage; ++index){
			try{
				Connection con = Jsoup.connect(url);
				Iterator<Entry<String, String>> it = queryParameter.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry<String, String> entry = it.next();
					String key = entry.getKey();
					String value = entry.getValue();
					con.data(key, value);
				}
				con.data("page.pageNo", index + "");
				Document doc = con.post();
				Element table = doc.getElementById("GridView1");
		        Elements trs = table.getElementsByTag("tr");
		        int trSize = trs.size();
		        for(int trIndex = 1; trIndex < trSize; ++trIndex){
		        	Element tr = trs.get(trIndex);
		        	Elements tds = tr.getElementsByTag("td");
		        	String monitorSequence = tds.get(0).text().trim();
		        	String regionCode = tds.get(1).text().trim();
		        	String legalPersonCode = tds.get(2).text().trim();
		        	String companyName = tds.get(3).text().trim();
		        	String monitorType = tds.get(4).text().trim();
		        	String province = tds.get(5).text().trim();
		        	String monitorYear = tds.get(6).text().trim();
		        	
		        	if(companyName == null || companyName.length() == 0){
		        		continue;
		        	}else{
		        		if(companyName.equals("有限公司") || companyName.equals("股份有限公司")){
		        			continue;
		        		}
		        	}
		        	
		        	MonitorCompany query = new MonitorCompany( );
		        	query.setRegionCode(regionCode);
		        	query.setLegalPersonCode(legalPersonCode);
		        	query.setCompanyName(companyName);
		        	query.setMonitorType(monitorType);
		        	query.setProvince(province);
		        	query.setMonitorYear(monitorYear);
		        	List<MonitorCompany> issues = monitorMapper.selectByParameter(query);
		        	if(!issues.isEmpty()){
	        			logger.info("重点监控企业已存在，regionCode = " + regionCode + ",legalPersonCode = " + legalPersonCode
	        					+  ",companyName = " + companyName + ",monitorType = " + monitorType);
	        			continue;
	        		}
		        	
		        	MonitorCompany company = new MonitorCompany( );
		        	company.setMonitorSequence(monitorSequence);
		        	company.setRegionCode(regionCode);
		        	company.setLegalPersonCode(legalPersonCode);
		        	company.setCompanyName(companyName);
		        	company.setMonitorType(monitorType);
		        	company.setProvince(province);
		        	company.setMonitorYear(monitorYear);
		        	company.setCreateTm(new Date( ));
		        	List<RegistItem> items = registItemMapper.selectByCompanyName(companyName);
		        	if(items.isEmpty()){
		        		RegistItem regist = new RegistItem( );
		        		regist.setCompanyName(companyName);
		        		regist.setDataSource(3);
		        		registItemMapper.insertSelective(regist);
		        		company.setRegistItemId(regist.getId());
		        		monitorMapper.insertSelective(company);
		        	}else{
		        		for(RegistItem item:items){
		        			company.setId(null);
		        			company.setRegistItemId(item.getId());
		        			monitorMapper.insertSelective(company);
		        		}
		        	}
		        }
			}catch(Exception e){
				logger.error("重点监控企业案件数据时出错",e);
				continue;
			}
	    }
		
		long endTime = System.currentTimeMillis();
		logger.info("重点监控企业爬虫共耗时 " + (endTime - startTime) / 1000 + "秒");
		
	}

	@Override
	public void airQualityReptile(String url) {
		int pageNum = 0;
		Map<String,String> params = new HashMap<String,String>( );
		params.put("xmlname", "1464591308421");
		
		int recordSize = airQualityMapper.airQualityCount();
		boolean incremental = true;
		if(recordSize == 0){
			incremental = false;
		}
		boolean incrementalOver = false;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<AirQuality> insertList = new ArrayList<AirQuality>( );
		while(true){
			try{
				++pageNum;
				params.put("page.pageNo", pageNum + "");
				Connection con = Jsoup.connect(url);
				Response res = con.data(params).timeout(3000).execute();
				
				Document body = Jsoup.parse(res.body());
				Element airQualityTable = body.getElementById("tablehtml");
				
				Elements cityList = airQualityTable.getElementsByTag("tr");
				int size = cityList.size();
				if(size < 10){
					logger.info("空气质量爬虫数据爬取结束");
					break;
				}
				
				insertList.clear();
				for(int i = 1; i < size; ++i){
					Elements tds = cityList.get(i).getElementsByTag("td");
					String recordDate = tds.get(1).getElementsByTag("span").get(0).text().trim();
					String city = tds.get(2).getElementsByTag("span").get(0).text().trim();
					String airQualityIndex = tds.get(3).getElementsByTag("span").get(0).text().trim();
					String mainPollutant = tds.get(4).getElementsByTag("span").get(0).text().trim();
					String status = tds.get(6).getElementsByTag("span").get(0).text().trim();
					AirQuality quality = new AirQuality( );
					quality.setRecordDate(sdf.parse(recordDate));
					quality.setCity(city);
					quality.setMainPollutant(mainPollutant);
					quality.setAirQualityIndex(airQualityIndex);
					quality.setStatus(status);
					insertList.add(quality);
					
					if(incremental){
						AirQuality query = new AirQuality( );
						query.setCity(city);
						query.setRecordDate(sdf.parse(recordDate));
						List<AirQuality> list = airQualityMapper.selectByCityAndDate(query);
						if(list != null && list.size() > 0){
							incrementalOver = true;
							break;
						}
					}
				}
				
				if(incrementalOver){
					logger.info("空气质量增量爬虫结束");
					break;
				}
				
				if(insertList.size() > 0){
					airQualityMapper.insertBatch(insertList);
				}
			}catch(Exception e){
				logger.error(e.getMessage() + ",空气质量爬虫出错");
			}
			
		}
		
		
	}

	@Override
	public void pollutionLicenseReptile() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int pageNo = 0;
		while(true){
			++pageNo;
			try{
				//排污信息URL
				String pollutionUrl = "http://permit.mep.gov.cn/permitExt/outside/Publicity?pageno="
						+ pageNo + "&enterName=&province=&city=&treadcode=&treadname=";
				Response res = Jsoup.connect(pollutionUrl).timeout(3000).execute();
				Document body = Jsoup.parse(res.body());
				Element contentDiv = body.getElementsByClass("content-result").get(0);
				Element contentTable = contentDiv.getElementsByTag("table").get(0);
				Elements trs = contentTable.getElementsByTag("tr");
				int len = trs.size();
				//没有排污企业时，返回
				if(len < 2){
					return;
				}
				for(int i = 1; i < len; ++i){
					Elements tds = trs.get(i).getElementsByTag("td");
					String province = tds.get(0).text();
					String city = tds.get(1).text();
					String licenseNumber = tds.get(2).text();
					String companyName = tds.get(3).text();
					String industry = tds.get(4).text();
					String validDate = tds.get(5).text();
					int splitIndex = validDate.indexOf("至");
					String startValidDate = validDate.substring(0, splitIndex);
					String endValidDate = validDate.substring(splitIndex + 1);
					String certificateDate = tds.get(6).text();
					String detailUrl = tds.get(7).getElementsByTag("a").get(0).attr("href");
					String dataId = detailUrl.substring(detailUrl.indexOf("=") + 1);
					
					//排污企业详情URL
					String url = "http://permit.mep.gov.cn/permitExt/syssb/wysb/hpsp/"
							+ "hpsp-company-sewage!getxxgkContent.action?dataid=" + dataId;
					res = Jsoup.connect(url).timeout(3000).execute();
					body = Jsoup.parse(res.body());
					Element addressElement = body.getElementsByTag("table").get(0);
					Element addressTr = addressElement.getElementsByTag("tr").get(1);
					String addressRaw = addressTr.getElementsByTag("p").get(0).text( );

					String[] splitList = addressRaw.split(" ");
					int splitSize = splitList.length;
					String address = splitList[0];
					String origination = "";
					if(splitSize >= 4){
						String originazation = splitList[3];
						splitList = originazation.split("：");
						if(splitList.length == 2){
							origination = splitList[1];
						}
					}
					splitList = address.split("：");
					if(splitList.length == 2){
						address = splitList[1];
					}
					
					Element editTable = body.getElementById("apply_table");
					Elements editTableTrs = editTable.getElementsByTag("tr");
					String airPollutionType = editTableTrs.get(1).getElementsByTag("td").
							get(0).text();
					String airEmissionStandard = editTableTrs.get(3).getElementsByTag("td").
							get(0).text();
					String waterPollutionType= editTableTrs.get(4).getElementsByTag("td").
							get(0).text();
					String waterEmissionStandard = editTableTrs.get(6).getElementsByTag("td").
							get(0).text();
					String tradeInfo = editTableTrs.get(7).getElementsByTag("td").
							get(0).text();
					
					PollutionDischargeLicense dischargeLicense = new PollutionDischargeLicense( );
					dischargeLicense.setProvince(province);
					dischargeLicense.setCity(city);
					dischargeLicense.setLicenseNumber(licenseNumber);
					dischargeLicense.setCompanyName(companyName);
					dischargeLicense.setIndustry(industry);
					dischargeLicense.setValidDate(validDate);
					dischargeLicense.setStartValidDate(sdf.parse(startValidDate));
					dischargeLicense.setEndValidDate(sdf.parse(endValidDate));
					dischargeLicense.setCertificateDate(sdf.parse(certificateDate));
					dischargeLicense.setDataId(dataId);
					dischargeLicense.setAddress(address);
					dischargeLicense.setCertificateOrganization(origination);
					dischargeLicense.setAirPollutionType(airPollutionType);
					dischargeLicense.setAirPollutionDischargeStandard(airEmissionStandard);
					dischargeLicense.setWaterPollutionType(waterPollutionType);
					dischargeLicense.setWaterPollutionDischargeStandard(waterEmissionStandard);
					dischargeLicense.setPollutionTrade(tradeInfo);
					
					PollutionDischargeLicense queryLicense = new PollutionDischargeLicense( );
					queryLicense.setDataId(dataId);
					//排污许可信息已存在，不需要重复爬取
					List<PollutionDischargeLicense> licenseList = licenseMapper.selectByParameter(queryLicense);
					if(licenseList != null && licenseList.size() > 0){
						continue;
					}
					
					//爬取公司是否已在企业注册表中，如果没有，在企业表中新增，如果有，将排污企业与企业表关联
		        	List<RegistItem> items = registItemMapper.selectByCompanyName(companyName);
		        	if(items.isEmpty()){
		        		RegistItem regist = new RegistItem( );
		        		regist.setCompanyName(companyName);
		        		regist.setAddress(address);
		        		regist.setTradeName(industry);
		        		regist.setDataSource(3);
		        		registItemMapper.insertSelective(regist);
		        		dischargeLicense.setRegistItemId(regist.getId());
		        		licenseMapper.insertSelective(dischargeLicense);
		        	}else{
		        		//不为空时，取第一个企业表中的企业数据与排污企业相关联
		        		RegistItem item = items.get(0);
	        			dischargeLicense.setRegistItemId(item.getId());
	        			licenseMapper.insertSelective(dischargeLicense);
		        	}
					
		        	//执行（守法）报告要求
					List<ExecutionRecord> executionList = buildExecutionRecord(dischargeLicense.getId(),dataId);
					if(executionList != null && executionList.size() > 0){
						executionRecordMapper.insertBatch(executionList);
					}
					
					//环境管理要求-环境管理台账记录要求
					List<ManagementRecord> manageList = buildManagementRecord(dischargeLicense.getId(),dataId);
					if(manageList != null && manageList.size() > 0){
						manageMapper.insertBatch(manageList);
					}
					
					//信息公开要求
					List<InformationDisclosure> infoList = buildInformationDisclosure(dischargeLicense.getId(),dataId);
					if(infoList != null && infoList.size() > 0){
						disclosureMapper.insertBatch(infoList);
					}
					
					//其他信息
					OtherInformation other = buildOtherInformation(dischargeLicense.getId(),dataId);
					if(other != null){
						otherMapper.insertSelective(other);
					}
					
					
				}
			}catch(Exception e){
				
			}
		}
	}
	
	/*
	 * 执行（守法）报告
	 */
	private List<ExecutionRecord> buildExecutionRecord(Integer pollutionId,String dataId){
		try{
			List<ExecutionRecord> list = new ArrayList<ExecutionRecord>( );
			String url = "http://permit.mep.gov.cn/permitExt/syssb/wysb/hpsp/hpspbase!approvespreport_xkzgk.action?dataid="
					+ dataId + "&operate=readonly";
			Response res = Jsoup.connect(url).timeout(3000).execute();
			Document body = Jsoup.parse(res.body());
			Element tableElement = body.getElementsByTag("table").get(0);
			
			Elements trs = tableElement.getElementsByTag("tr");
			int trIndex = trs.size();
			for(int i = 1; i < trIndex; ++i){
				Elements tds = trs.get(i).getElementsByTag("td");
				String mainContent = tds.get(0).getElementsByTag("textarea").text();
				String frequency = tds.get(1).getElementsByTag("textarea").text();
				String otherInfo = tds.get(2).getElementsByTag("textarea").text();
				
				ExecutionRecord record = new ExecutionRecord( );
				record.setPollutionId(pollutionId);
				record.setFrequency(frequency);
				record.setContent(mainContent);
				record.setOtherInfo(otherInfo);
				list.add(record);
			}
			return list;
		}catch(Exception e){
			
		}
		return null;
	}
	
	/*
	 * 环境管理台账记录要求
	 */
	private List<ManagementRecord> buildManagementRecord(Integer pollutionId,String dataId){
		try{
			List<ManagementRecord> list = new ArrayList<ManagementRecord>( );
			String url = "http://permit.mep.gov.cn/permitExt/syssb/wysb/hpsp/hpsp!accountxk_xkzgk.action?dataid="
					+ dataId + "&operate=readonly";
			Response res = Jsoup.connect(url).timeout(3000).execute();
			Document body = Jsoup.parse(res.body());
			Element tableElement = body.getElementById("fuel_table");
			
			Elements trs = tableElement.getElementsByTag("tr");
			int trIndex = trs.size();
			for(int i = 1; i < trIndex; ++i){
				Elements tds = trs.get(i).getElementsByTag("td");
				String type = tds.get(0).getElementsByAttribute("selected").get(0).text();
				String parameter = tds.get(1).getElementsByAttribute("selected").get(0).text();
				String content = tds.get(2).getElementsByTag("textarea").text();
				String frequency = tds.get(3).getElementsByTag("textarea").text();
				String recordType = tds.get(4).getElementsByAttribute("selected").get(0).text();
				String otherInfo = tds.get(5).getElementsByTag("textarea").text();
				ManagementRecord record = new ManagementRecord( );
				record.setPollutionId(pollutionId);
				record.setFacilityType(type);
				record.setOperateParameter(parameter);
				record.setContent(content);
				record.setFrequency(frequency);
				record.setRecordType(recordType);
				record.setOtherInfo(otherInfo);
				list.add(record);
			}
			
			return list;
		}catch(Exception e){
			
		}
		return null;
	}
	
	/*
	 * 信息公开要求
	 */
	private List<InformationDisclosure> buildInformationDisclosure(Integer pollutionId,String dataId){
		try{
			List<InformationDisclosure> list = new ArrayList<InformationDisclosure>( );
			String url = "http://permit.mep.gov.cn/permitExt/syssb/wysb/hpsp/hpspbase!approvespinfoopen_xkzgk.action?dataid="
					+ dataId + "&operate=readonly";
			Response res = Jsoup.connect(url).timeout(3000).execute();
			Document body = Jsoup.parse(res.body());
			Element tableElement = body.getElementsByTag("table").get(0);
			
			Elements trs = tableElement.getElementsByTag("tr");
			int trIndex = trs.size();
			for(int i = 1; i < trIndex; ++i){
				Elements tds = trs.get(i).getElementsByTag("td");
				String type = tds.get(0).getElementsByTag("textarea").text();
				String time = tds.get(1).getElementsByTag("textarea").text();
				String content = tds.get(2).getElementsByTag("textarea").text();
				String otherInfo = tds.get(3).getElementsByTag("textarea").text();
				
				InformationDisclosure info = new InformationDisclosure( );
				info.setPollutionId(pollutionId);
				info.setDisclosureType(type);
				info.setContent(content);
				info.setTimePoint(time);
				info.setOtherInfo(otherInfo);
				list.add(info);
			}
			return list;
		}catch(Exception e){
			
		}
		return null;
	}
	
	/*
	 * 其他许可内容
	 */
	private OtherInformation buildOtherInformation(Integer pollutionId,String dataId){
		try{
			String url = "http://permit.mep.gov.cn/permitExt/syssb/wysb/hpsp/hpspbase!approveothercon_xkzgk.action?dataid="
					+ dataId + "&operate=readonly";
			Response res = Jsoup.connect(url).timeout(3000).execute();
			Document body = Jsoup.parse(res.body());
			Element tableElement = body.getElementsByTag("table").get(0);
			
			Elements trs = tableElement.getElementsByTag("tr");
			String management = trs.get(0).getElementsByTag("td").get(0).getElementsByTag("textarea").text();
			String otherInfo = trs.get(2).getElementsByTag("td").get(0).getElementsByTag("textarea").text();
			OtherInformation info = new OtherInformation( );
			info.setPollutionId(pollutionId);
			info.setManagementRequirement(management);
			info.setOtherInfo(otherInfo);
			return info;
		}catch(Exception e){
			
		}
		return null;
	}

	@Override
	public void pollutionLicenseTypeReptile() {
		long start = System.currentTimeMillis();
		Map<String,Object> params = new HashMap<String,Object>( );
		//每次更新400个企业的污染信息
		params.put("pageRows", 400);
		List<PollutionDischargeLicense> list = licenseMapper.selectNullPollutionTypeRecords(params);
		WebClient wc = new WebClient(BrowserVersion.CHROME);
		wc.getOptions().setJavaScriptEnabled(true); // 启用JS解释器，默认为true  
	    wc.getOptions().setCssEnabled(false); // 禁用css支持  
	    wc.getOptions().setThrowExceptionOnScriptError(false); // js运行错误时，是否抛出异常  
	    wc.getOptions().setTimeout(100000); // 设置连接超时时间 ，这里是10S。如果为0，则无限期等待  
	    wc.getOptions().setDoNotTrackEnabled(false); 
		try{
			for(PollutionDischargeLicense license:list){
			    HtmlPage page = wc  
			            .getPage("http://permit.mep.gov.cn/permitExt/syssb/wysb/hpsp/hpsp-company-sewage!getxxgkContent.action?dataid="
			            		+ license.getDataId());
			    
			    DomElement dom = page.getElementById("zywrwlbid");
			    String mainPollutant = dom.asText();
			    dom = page.getElementById("airemissionid");
			    String airEmissionBehavior = dom.asText();
			    dom = page.getElementById("wateremissionname");
			    String waterEmissionBehavior = dom.asText();
			    
			    PollutionDischargeLicense update = new PollutionDischargeLicense( );
			    update.setId(license.getId());
			    update.setPollutionType(mainPollutant);
			    update.setAirPollutionDischargeRule(airEmissionBehavior);
			    update.setWaterPollutionDischargeRule(waterEmissionBehavior);
			    licenseMapper.updateByPrimaryKeySelective(update);
			}
		}catch(Exception e){
			
		}finally{
			wc.close();
		}
		long end = System.currentTimeMillis();
		System.out.println("更新10个企业共花费,time = " + (end - start) / 1000 + "秒");
	}

	@Override
	public int maxIpeCompanyId() {
		Integer maxCompanyId = registItemMapper.selectMaxCompanyId();
		if(maxCompanyId == null){
			maxCompanyId = 1;
		}
		return maxCompanyId;
	}
}
