package com.igreen.web.service.impl;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import javax.annotation.Resource;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.igreen.common.dao.*;
import com.igreen.common.model.*;
import com.igreen.web.service.CompanyQueryDetailService;
import com.igreen.web.util.HttpClientHelper;
import com.igreen.web.util.PropertiesUtil;
import com.igreen.web.view.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import com.igreen.common.dto.MapDto;
import com.igreen.web.job.GetRegtionTaskJob;
import com.igreen.web.service.IndexService;
import com.igreen.web.util.Result;

@Service
public class IndexServiceImpl implements IndexService{
	
	@Resource
	RegistItemMapper registItemMapper;
	
	@Resource
	ShareholderMapper shareholderMapper;
	
	@Resource
	CompanyEmployeeMapper CompanyEmployeeMapper;
	
	@Resource
	ExchangeMapper exchangeMapper;
	
	@Resource
	OrganizationItemMapper organizationItemMapper;
	
	@Resource
	OpenCourtNoticeMapper openCourtNoticeMapper;
	
	@Resource
	WrittenJudgementMapper writtenJudgementMapper;
	
	@Resource
	ExecutedItemMapper executedItemMapper;
	
	@Resource
	BreakPromiseExecutedMapper breakPromiseExecutedMapper;
	
	@Resource
	CourtNoticeMapper courtNoticeMapper;
	
	@Resource
	AdministrativePenaltyMapper administrativePenaltyMapper;
	
	@Resource
	FreezeStockRightMapper freezeStockRightMapper;
	
	@Resource
	PledgeStockRightMapper pledgeStockRightMapper;
	
	@Resource
	ChattelMortgageMapper chattelMortgageMapper;
	
	@Resource
	ThingChattelMortgageMapper thingChattelMortgageMapper;
	
	//关联关系
	@Resource
	BranchMapper branchMapper;
	
	@Resource
	InvestmentMapper investmentMapper;
	
	@Resource
	RelationCompanyMapper relationCompanyMapper;
	
	@Resource
	InviteMapper inviteMapper;
	
	@Resource
	PatentMapper patentMapper;
	
	@Resource
	BrandMapper brandMapper;
	
	@Resource
	CopyrightMapper copyrightMapper;
	
	@Resource
	SoftwareCopyrightMapper softwareCopyrightMapper;
	
	@Resource
	DomainNameMapper domainNameMapper;
	
	
	@Resource
	PollutionDischargeLicenseMapper pollutionDischargeLicenseMapper;
	
	@Resource 
	CleanProductionCompanyMapper cleanProductionCompanyMapper;
	
	@Resource
	IpeIndustryRecordMapper ipeIndustryRecordMapper;
	
	@Resource 
	MonitorCompanyMapper monitorCompanyMapper;
	
	@Resource
	EnvironmentalIssueMapper environmentalIssueMapper;
	
	@Resource 
	RegistItemLocationMapper registItemLocationMapper;

	@Resource
	QichachaCompanyBaseMapper qichachaCompanyBaseMapper;

	@Resource
	QichachaJudgementMapper qichachaJudgementMapper;

	@Resource
	QichachaPatentMapper qichachaPatentMapper;

	@Resource
	ExecutionRecordMapper executionRecordMapper;

	@Resource
	ExcelEnergyEfficiencyLabelMapper excelEnergyEfficiencyLabelMapper;

	@Resource
	private CompanyQueryDetailService detailService;
	
	@Override
	public Igreen search(String companyName) {
		
		//基本信息
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("companyName", companyName);
		params.put("status", 1);
		List<RegistItem> items = registItemMapper.selectByCompanyNameAndStatus(params);
		if(items.isEmpty())
			return null;
		Igreen igreen = new Igreen();
		RegistItem item = items.get(0);
		igreen.setRegistItem(item);
		igreen.setShareholders(shareholderMapper.selectByRegistItemId(item.getId()));
		igreen.setEmployees(CompanyEmployeeMapper.selectByRegistItemId(item.getId()));
		List<Exchange> exchanges = exchangeMapper.selectByRegistItemId(item.getId());
		if(!exchanges.isEmpty())
			igreen.setExchange(exchanges.get(0));
		
		List<OrganizationItem> organizationItems = organizationItemMapper.selectByRegistItemId(item.getId());
		if(!organizationItems.isEmpty())
			igreen.setOrganizationItem(organizationItems.get(0));
		
		//法律风险
		igreen.setOpenCourtNotices(openCourtNoticeMapper.selectByRegistItemId(item.getId()));
		igreen.setWrittenJudgements(writtenJudgementMapper.selectByRegistItemId(item.getId()));
		igreen.setExecutedItems(executedItemMapper.selectByRegistItemId(item.getId()));
		igreen.setBreakPromiseExecuteds(breakPromiseExecutedMapper.selectByRegistItemId(item.getId()));
		igreen.setCourtNotices(courtNoticeMapper.selectByRegistItemId(item.getId()));
		//经营风险
		igreen.setAdministrativePenalties(administrativePenaltyMapper.selectByRegistItemId(item.getId()));
		igreen.setFreezeStockRights(freezeStockRightMapper.selectByRegistItemId(item.getId()));
		igreen.setPledgeStockRights(pledgeStockRightMapper.selectByRegistItemId(item.getId()));
		igreen.setChattelMortgages(chattelMortgageMapper.selectByRegistItemId(item.getId()));
		igreen.setThingChattelMortgages(thingChattelMortgageMapper.selectByRegistItemId(item.getId()));
		
		//关联关系
		List<Branch> branchs = branchMapper.selectByRegistItemId(item.getId());
		if(!branchs.isEmpty())
			igreen.setBranch(branchs.get(0));
		igreen.setInvestments(investmentMapper.selectByRegistItemId(item.getId()));
		List<RelationCompany> relationCompanies = relationCompanyMapper.selectByRegistItemId(item.getId());
		Map<Integer, RelationCompanyView> relations = new HashMap<Integer, RelationCompanyView>();
		for(RelationCompany company:relationCompanies){
			if(relations.containsKey(company.getEmployeeId())){
				RelationCompanyView view = relations.get(company.getEmployeeId());
				List<RelationCompany> list = view.getRelationCompanies();
				list.add(company);
				view.setRelationCompanies(list);
				relations.put(company.getEmployeeId(), view);
				//relations.get(company.getEmployeeId()).getRelationCompanies().add(company);
			}else{
				List<RelationCompany> list = new ArrayList<RelationCompany>();
				list.add(company);
				relations.put(company.getEmployeeId(), new RelationCompanyView(company.getEmployeeName(), company.getEmployeeJob(), list));
			}
		}
		
		List<RelationCompanyView> companyViews = new ArrayList<RelationCompanyView>();
		for(RelationCompanyView view :relations.values()){
			companyViews.add(view);
		}
		igreen.setCompanyViews(companyViews);
		
		//经营信息
		igreen.setInvites(inviteMapper.selectByRegistItemId(item.getId()));
		
		//知识产权
		igreen.setPatents(patentMapper.selectByRegistItemId(item.getId()));
		igreen.setBrands(brandMapper.selectByRegistItemId(item.getId()));
		igreen.setCopyrights(copyrightMapper.selectByRegistItemId(item.getId()));
		igreen.setSoftwareCopyrights(softwareCopyrightMapper.selectByRegistItemId(item.getId()));
		igreen.setDomainNames(domainNameMapper.selectByRegistItemId(item.getId()));
		return igreen;
	}

	@Override
	public SearchCompanyInfo searchCompany(String companyName) {
		RegistItem registItem = registItemMapper.selectMaxIdByCompanyName(companyName);
		if(registItem != null){
			Integer registItemId = registItem.getId();
			PollutionDischargeLicense pollutionDischarge = pollutionDischargeLicenseMapper.selectByRegistItemId(registItemId);
			CleanProductionCompany cleanProduction = cleanProductionCompanyMapper.selectByRegistItemId(registItemId);
			List<IpeIndustryRecord> ipeIndustry = ipeIndustryRecordMapper.selectByRegistItemId(registItemId);
			MonitorCompany monitorCompany = new MonitorCompany();
			monitorCompany.setRegistItemId(registItemId);
			List<MonitorCompany> monitorCompanys = monitorCompanyMapper.selectByParameter(monitorCompany);
			EnvironmentalIssue environmentalIssue = new EnvironmentalIssue();
			environmentalIssue.setRegistItemId(registItemId);
			List<EnvironmentalIssue> environmentalIssues =  environmentalIssueMapper.selectByParameter(environmentalIssue);
			SearchCompanyInfo searchInfo = new SearchCompanyInfo();
			searchInfo.setCompanyName(registItem.getCompanyName());
			String region="";
			String industry = "";
			if(pollutionDischarge != null){
				String province = pollutionDischarge.getProvince();
				String city = pollutionDischarge.getCity();
				region = province + city;
				industry = pollutionDischarge.getIndustry();
				searchInfo.setCertificateDate(pollutionDischarge.getCertificateDateStr());
				searchInfo.setValidDate(pollutionDischarge.getValidDate());
			}
			searchInfo.setIpeIndustryRecord(ipeIndustry);
			if(cleanProduction != null){
				searchInfo.setSerialNumber(cleanProduction.getSerialNumber());
				searchInfo.setProductSalesAmount(cleanProduction.getProductSalesAmount());
				searchInfo.setReportTime(cleanProduction.getReportTime());
				searchInfo.setSubmitCheckTime(cleanProduction.getSubmitCheckTime());
				searchInfo.setCompleteEstimateTime(cleanProduction.getCompleteEstimateTime());
				searchInfo.setCompleteCheckTime(cleanProduction.getCompleteCheckTime());
				searchInfo.setCheckOrganization(cleanProduction.getCheckOrganization());
				if("".equals(industry)){
					industry = cleanProduction.getTrade();
				}
				if("".equals(region)){
					region = cleanProduction.getRegion();
				}
			}
			searchInfo.setIndustry(industry);
			searchInfo.setMonitorCompanys(monitorCompanys);
			searchInfo.setEnvironmentalIssues(environmentalIssues);
			searchInfo.setRegion(region);
			return searchInfo;
		}
		return null;
	}

	@Override
	public List<String> getRegation(String type){
		return null;
//		List<String> regationList = new ArrayList<String>();
//		if("1".equals(type)){
//			regationList = GetRegtionTaskJob.getCpcRegationList();
//		}else if("2".equals(type)){
//			regationList = GetRegtionTaskJob.getPdlRegationList();
//		}else if("3".equals(type)){
//			regationList = GetRegtionTaskJob.getIpeRegationList();
//		}
//		return regationList;
	}

	@Override
	public Result getRegation2(String province, String city) {
		int cpcNum = 0;
		int ipeNum = 0;
		int pdlNum = 0;
		if(StringUtils.isBlank(province) && StringUtils.isBlank(city)){
			cpcNum = GetRegtionTaskJob.getCpcRegationList().size();
			ipeNum = GetRegtionTaskJob.getIpeRegationList().size();
			pdlNum = GetRegtionTaskJob.getPdlRegationList().size();
		}else if(StringUtils.isBlank(city)){
			MapDto mapDto = GetRegtionTaskJob.getAllMapDate().get(province);
			cpcNum = mapDto.getCpcNum();
			ipeNum = mapDto.getIpeNum();
			pdlNum = mapDto.getPdlNum();
		}else{
			List<RegistItemLocation> registItemLocations = registItemLocationMapper.selectiveList(province, city);
			Set<Integer> set = new HashSet<Integer>();
			for(RegistItemLocation registItemLocation : registItemLocations){
				set.add(registItemLocation.getId());
			}
			
			for(CleanProductionCompany cleanProductionCompany : GetRegtionTaskJob.getCpcRegationList()){
				if(set.contains(cleanProductionCompany.getRegistItemId())){
					cpcNum++;
				}
			}
			
			for(IpeIndustryRecord ipeIndustryRecord : GetRegtionTaskJob.getIpeRegationList()){
				if(set.contains(ipeIndustryRecord.getRegistItemId())){
					ipeNum++;
				}
			}
			
			for(PollutionDischargeLicense pollutionDischargeLicense : GetRegtionTaskJob.getPdlRegationList()){
				if(set.contains(pollutionDischargeLicense.getRegistItemId())){
					pdlNum++;
				}
			}
		}
		MapDto mapDto = new MapDto();
		mapDto.setCpcNum(cpcNum);
		mapDto.setIpeNum(ipeNum);
		mapDto.setPdlNum(pdlNum);
		return new Result(200,"sucess",mapDto);
	}

	@Override
	public Result getAllProvinceMapDate() {
		Map<String, MapDto> data = GetRegtionTaskJob.getAllMapDate();
		if(!data.isEmpty()){
			return new Result(200,"sucess",data);
		}
		return new Result(500,"error");
	}

	@Override
	public IgreenSearch searchNew(String companyName) {

		//基本信息
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("companyName", companyName);
		params.put("status", 1);
		IgreenSearch igreen = new IgreenSearch();
		List<QichachaCompanyBase> items = qichachaCompanyBaseMapper.selectByCompanyNameAndStatus(params);
		if(!items.isEmpty()){
			QichachaCompanyBase item = items.get(0);
			igreen.setQichachaCompanyBase(item);

			// 专利信息
			igreen.setQichachaPatents(qichachaPatentMapper.selectByKeyNo(item.getKeyNo()));

			// 法院判决
			igreen.setQichachaJudgements(qichachaJudgementMapper.selectByKeyNo(item.getKeyNo()));

		}

		// 重点监管企业
		MonitorCompany monitorCompany = new MonitorCompany();
		//monitorCompany.setRegistItemId(rgItem.getId());
		monitorCompany.setCompanyName(companyName);
		List<MonitorCompany> monitorCompanys = monitorCompanyMapper.selectByParameter(monitorCompany);
		igreen.setMonitorCompanies(monitorCompanys);

		/*List<RegistItem> regItems = registItemMapper.selectByCompanyNameAndStatus(params);
		if(!regItems.isEmpty()){
			RegistItem rgItem = regItems.get(0);
			igreen.setRegistItem(rgItem);*/
			// 监管记录
			/*List<IpeIndustryRecord> ipeIndustry = ipeIndustryRecordMapper.selectByRegistItemId(rgItem.getId());
			igreen.setIpeIndustryRecords(ipeIndustry);*/

			// 群众举报案件
			/*EnvironmentalIssue environmentalIssue = new EnvironmentalIssue();
			environmentalIssue.setRegistItemId(rgItem.getId());
			List<EnvironmentalIssue> environmentalIssues =  environmentalIssueMapper.selectByParameter(environmentalIssue);
			igreen.setEnvironmentalIssues(environmentalIssues);*/

			// 排污许可
			/*PollutionDischargeLicense pollutionDischarge = pollutionDischargeLicenseMapper.selectByRegistItemId(rgItem.getId());
			igreen.setPollutionDischargeLicense(pollutionDischarge);
			if(pollutionDischarge != null){
				List<ExecutionRecord> executionRecords = new ArrayList<ExecutionRecord>();
				executionRecords.add(executionRecordMapper.selectById(rgItem.getId()));
				igreen.setExecutionRecords(executionRecords);
			}*/

			// 清洁生产企业
			/*CleanProductionCompany cleanProduction = cleanProductionCompanyMapper.selectByRegistItemId(rgItem.getId());
			igreen.setCleanProductionCompany(cleanProduction);*/
		/*}*/

		// 排污许可
		/*PollutionDischargeLicense pollutionDischarge = pollutionDischargeLicenseMapper.selectByCompayName(companyName);
		igreen.setPollutionDischargeLicense(pollutionDischarge);
		if(pollutionDischarge != null){
			List<ExecutionRecord> executionRecords = new ArrayList<ExecutionRecord>();
			executionRecords.add(executionRecordMapper.selectByPollutionId(pollutionDischarge.getId()));
			System.out.println("executionRecords====" + JSON.toJSONString(executionRecords));
			igreen.setExecutionRecords(executionRecords);
		}*/
		List<ExecutionRecord> executionRecords = executionRecordMapper.selectByCompanyName(companyName);
		igreen.setExecutionRecords(executionRecords);
		System.out.println("executionRecords====" + JSON.toJSONString(igreen.getExecutionRecords()));
		// 清洁生产企业
		CleanProductionCompany cleanProduction = cleanProductionCompanyMapper.selectByCompanyName(companyName);
		igreen.setCleanProductionCompany(cleanProduction);

		// 监管记录
		/*List<IpeIndustryRecord> ipeIndustry = ipeIndustryRecordMapper.selectByCompanyName(companyName);
		igreen.setIpeIndustryRecords(ipeIndustry);*/
		// 群众举报案件
		/*List<EnvironmentalIssue> environmentalIssues =  environmentalIssueMapper.selectByCompanyName(companyName);
		igreen.setEnvironmentalIssues(environmentalIssues);*/

		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < 4; i++) {
			map = new HashMap<>();
			map.put("company", companyName);
			map.put("year", "2019");
			map.put("season", (i+1)+"");
			map.put("mode", "company");
			list.add(map);
		}

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("reqstr", list);
		try {
			String result = HttpClientHelper.sendPost3("http://localhost:4400", param, "UTF-8");
			System.out.println("params="+JSON.toJSONString(param));
			System.out.println("result="+result);

			List<AiIpe> aiIpeList = convertModels(result);
			igreen.setAiIpeList(aiIpeList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 能效备案
		igreen.setExcelEnergyEfficiencyLabels(excelEnergyEfficiencyLabelMapper.selectByFilingCompany(params));

		return igreen;
	}

	@Override
	public IgreenSearch searchNewTab(String companyName, String tabName) {

		//基本信息
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("companyName", companyName);
		params.put("status", 1);
		IgreenSearch igreen = new IgreenSearch();

		if(tabName == null || "register".equals(tabName)) {
			List<QichachaCompanyBase> items = qichachaCompanyBaseMapper.selectByCompanyNameAndStatus(params);
			if(!items.isEmpty()){
				QichachaCompanyBase item = items.get(0);
				igreen.setQichachaCompanyBase(item);
				// 专利信息
				igreen.setQichachaPatents(qichachaPatentMapper.selectByKeyNo(item.getKeyNo()));
				// 法院判决
				igreen.setQichachaJudgements(qichachaJudgementMapper.selectByKeyNo(item.getKeyNo()));

			}
		} else if(tabName == null || "business".equals(tabName)) {
			// 重点监管企业
			MonitorCompany monitorCompany = new MonitorCompany();
			//monitorCompany.setRegistItemId(rgItem.getId());
			monitorCompany.setCompanyName(companyName);
			List<MonitorCompany> monitorCompanys = monitorCompanyMapper.selectByParameter(monitorCompany);
			igreen.setMonitorCompanies(monitorCompanys);
		} else if(tabName == null || "environment".equals(tabName)) {
			// 排污许可
			List<ExecutionRecord> executionRecords = executionRecordMapper.selectByCompanyName(companyName);
			igreen.setExecutionRecords(executionRecords);
			System.out.println("executionRecords====" + JSON.toJSONString(igreen.getExecutionRecords()));
			// 清洁生产企业
			CleanProductionCompany cleanProduction = cleanProductionCompanyMapper.selectByCompanyName(companyName);
			igreen.setCleanProductionCompany(cleanProduction);
			// 能效备案
			igreen.setExcelEnergyEfficiencyLabels(excelEnergyEfficiencyLabelMapper.selectByFilingCompany(params));
		} else if(tabName == null || "ipe".equals(tabName)) {
			List<Map<String, String>> list = new ArrayList<Map<String, String>>();
			Map<String, String> map = new HashMap<String, String>();

			for (int i = 0; i < 4; i++) {
				map = new HashMap<>();
				map.put("company", companyName);
				map.put("year", "2019");
				map.put("season", (i+1)+"");
				map.put("mode", "company");
				list.add(map);
			}

			Map<String, Object> param = new HashMap<String, Object>();
			param.put("reqstr", list);
			try {
				String result = HttpClientHelper.sendPost3("http://localhost:4400", param, "UTF-8");
				System.out.println("params="+JSON.toJSONString(param));
				System.out.println("result="+result);

				List<AiIpe> aiIpeList = convertModels(result);
				igreen.setAiIpeList(aiIpeList);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return igreen;
	}

	/**
	 * 获取监控表格数据
	 *
	 * @param configid 监控编码数据
	 * @return
	 */
	@Override
	public List<MonitorCompanyTable> getMonitorCompanyList(Integer configid) {
		// 基础数据
		List<CompanyQueryBase> baseList = detailService.selectCompanyBaseByConfigId(configid);

		Map<String, Integer> administrativePenaltyMap = null;
		List<Integer> registItemIds = getRegistItemIdList(baseList);
		if(CollectionUtils.isNotEmpty(registItemIds)){
			List<CompanyMonitorTemp> administrativePenaltyTempList = administrativePenaltyMapper.selectAdministrativePenaltyByResIds(registItemIds);
			administrativePenaltyMap = makeTempToMap(administrativePenaltyTempList, "registItemId");
		}

		// 诉讼（件）
		List<CompanyMonitorTemp> judgementsTempList = detailService.selectJudgementsCountByConfigId(configid);
		Map<String, Integer> judgementsMap = makeTempToMap(judgementsTempList, "keyNo");

		// 专利（件）
		List<CompanyMonitorTemp> patentCountTempList = detailService.selectPatentCountByConfigId(configid);
		Map<String, Integer> patentMap = makeTempToMap(patentCountTempList, "keyNo");

		// 重点监管企业数
		List<CompanyMonitorTemp> companiesCountTempList = detailService.selectCompaniesCountByConfigId(configid);
		Map<String, Integer> companiesMap = makeTempToMap(companiesCountTempList, "registItemId");

		// 排污许可数
		List<CompanyMonitorTemp> executionRecordsCountTempList = detailService.selectExecutionRecordsCountByConfigId(configid);
		Map<String, Integer> executionRecordsMap = makeTempToMap(executionRecordsCountTempList, "registItemId");

		return makeResultVo(baseList, judgementsMap, patentMap, companiesMap, executionRecordsMap, administrativePenaltyMap);
	}

	private List<Integer> getRegistItemIdList(List<CompanyQueryBase> baseList) {
		List<Integer> registItemIds = null;
		if(CollectionUtils.isNotEmpty(baseList)) {
			registItemIds = new ArrayList<>();
			for(CompanyQueryBase base : baseList) {
				registItemIds.add(base.getRegistItemId());
			}
		}

		return registItemIds;
	}
	/**
	 * 注册资本分布
	 *
	 * @param configid
	 * @return
	 */
	@Override
	public List<CompanyMonitorReportTemp> getRegistIndustry(Integer configid) {
		return detailService.getRegistIndustry(configid);
	}

	/**
	 * 地域分布
	 *
	 * @param configid
	 * @return
	 */
	@Override
	public List<CompanyMonitorReportTemp> getRegistProvince(Integer configid) {

		List<CompanyMonitorReportTemp> temps = null;
		List<CompanyMonitorReportTemp> tempList = detailService.getRegistProvince(configid);
		if(tempList != null && tempList.size() > 8) {
			int sum = 0;
			temps = new ArrayList<CompanyMonitorReportTemp>();
			Collections.sort(tempList, new CompanyMonitorReportTemp());

			temps.addAll(tempList.subList(0, 7));
			for (CompanyMonitorReportTemp temp : temps) {
				String code = temp.getCode();
				if(StringUtils.isNotBlank(code)) {
					String name = PropertiesUtil.getProvinceName(code);
					temp.setName(StringUtils.isBlank(name) ? "未知" : name);
				} else {
					temp.setName("未知");
				}
			}

			for(CompanyMonitorReportTemp temp : tempList.subList(7, tempList.size())) {
				sum += temp.getNameValue() == null ? 0 : temp.getNameValue();
			}
			CompanyMonitorReportTemp other = new CompanyMonitorReportTemp();
			other.setNameValue(sum);
			other.setName("其它");
			temps.add(other);
		} else {
			temps = tempList;
			for (CompanyMonitorReportTemp temp : temps) {
				String code = temp.getCode();
				if(StringUtils.isNotBlank(code)) {
					String name = PropertiesUtil.getProvinceName(code);
					temp.setName(StringUtils.isBlank(name) ? "未知" : name);
				} else {
					temp.setName("未知");
				}
			}
		}

		return temps;
	}

	/**
	 * 获取预测数据
	 *
	 * @param configid
	 * @return
	 */
	@Override
	public List<MonitorForeCast> getMonitorForeCast(Integer configid, Integer size) {
		List<AiIpeSum> aiIpeSums = detailService.getMonitorForeCast(configid);
		return makeForeCast(aiIpeSums, size == null ? 1 : size);
	}

	/**
	 * 预测折线图
	 * @param aiIpeSums
	 * @return
	 */
	private List<MonitorForeCast> makeForeCast(List<AiIpeSum> aiIpeSums, Integer size) {

		List<MonitorForeCast> foreCastList = new ArrayList<MonitorForeCast>();
		Map<String, List<Double>> tempMap = new HashMap<String, List<Double>>();
		Map<String, String> styleMap = new HashMap<String, String>();
		styleMap.put("暂扣、吊销许可证", "#0b97d4");
		styleMap.put("没收违法所得", "#fa682d");
		styleMap.put("行政拘留", "#70bf64");
		styleMap.put("责令停产整顿", "#ffcb38");
		styleMap.put("责令停产、停业、关闭", "#cdcdcd");
		for (AiIpeSum ipeSum : aiIpeSums) {
			if (tempMap.get("暂扣、吊销许可证") == null) {
				tempMap.put("暂扣、吊销许可证", new ArrayList<Double>());
			}
			tempMap.get("暂扣、吊销许可证").add(getTwoDecimal(ipeSum.getRevokedSum() / (double)size));

			if (tempMap.get("没收违法所得") == null) {
				tempMap.put("没收违法所得", new ArrayList<Double>());
			}
			tempMap.get("没收违法所得").add(getTwoDecimal(ipeSum.getConfiscateSum() / (double)size));

			if (tempMap.get("行政拘留") == null) {
				tempMap.put("行政拘留", new ArrayList<Double>());
			}
			tempMap.get("行政拘留").add(getTwoDecimal(ipeSum.getDetentionSum() / (double)size));

			if (tempMap.get("责令停产整顿") == null) {
				tempMap.put("责令停产整顿", new ArrayList<Double>());
			}
			tempMap.get("责令停产整顿").add(getTwoDecimal(ipeSum.getProductionSum() / (double)size));

			if (tempMap.get("责令停产、停业、关闭") == null) {
				tempMap.put("责令停产、停业、关闭", new ArrayList<Double>());
			}
			tempMap.get("责令停产、停业、关闭").add(getTwoDecimal(ipeSum.getInstructSum() / (double)size));
		}

		Iterator<Map.Entry<String, List<Double>>> iterator = tempMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, List<Double>> entry = iterator.next();
			MonitorForeCast foreCast = new MonitorForeCast();
			foreCast.setName(entry.getKey());
			foreCast.setData(entry.getValue());
			foreCast.setStyle(styleMap.get(entry.getKey()));
			foreCastList.add(foreCast);
		}
		return foreCastList;
	}

	private double getTwoDecimal(double num) {
		DecimalFormat dFormat = new DecimalFormat("#.00");
		String yearString = dFormat.format(num);
		Double temp = Double.valueOf(yearString);
		return temp;
	}

	private List<MonitorCompanyTable> makeResultVo(List<CompanyQueryBase> baseList,Map<String, Integer> judgementsMap,
												   Map<String, Integer> patentMap, Map<String, Integer> companiesMap, Map<String, Integer> executionRecordsMap, Map<String, Integer> administrativePenaltyMap) {

		List<MonitorCompanyTable> companyTableList = new ArrayList<MonitorCompanyTable>();
		for(CompanyQueryBase base : baseList){
			MonitorCompanyTable table = new MonitorCompanyTable();
			table.setCompanyName(base.getName());
			table.setIndustryName(base.getSubIndustry());
			table.setOrgNo(base.getOrgNo());
			String code = base.getProvince();
			if(StringUtils.isNotBlank(code)) {
				String name = PropertiesUtil.getProvinceName(code);
				table.setProvince(StringUtils.isBlank(name) ? "未知" : name);
			} else {
				table.setProvince("未知");
			}
			table.setJudgementsCount(judgementsMap.get(base.getKeyNo()) == null ? 0 : judgementsMap.get(base.getKeyNo()));
			table.setPatentCount(patentMap.get(base.getKeyNo()) == null ? 0 : patentMap.get(base.getKeyNo()));
			table.setMonitorCompaniesCount(companiesMap.get(base.getRegistItemId()) == null ? 0 : companiesMap.get(base.getRegistItemId()));
			table.setExecutionRecordsCount(executionRecordsMap.get(base.getRegistItemId()) == null ? 0 : executionRecordsMap.get(base.getRegistItemId()));
			table.setAdministrativePenaltyCount(administrativePenaltyMap.get(base.getRegistItemId()) == null ? 0 : administrativePenaltyMap.get(base.getRegistItemId()));
			companyTableList.add(table);
		}

		return companyTableList;
	}

	/**
	 * 转化map
	 * @param monitorTemps
	 * @param key
	 * @return
	 */
	private Map<String, Integer> makeTempToMap(List<CompanyMonitorTemp> monitorTemps, String key){
		Map<String, Integer> tempMap = new HashMap<String, Integer>();
		if(CollectionUtils.isNotEmpty(monitorTemps)) {
			for (CompanyMonitorTemp monitorTemp : monitorTemps) {
				String mapKey = null;
				if("registItemId".equals(key)) {
					mapKey = monitorTemp.getRegistItemId().toString();
				} else {
					mapKey = monitorTemp.getKeyNo();
				}
				tempMap.put(mapKey, monitorTemp.getCountNum());
			}
		}
		return tempMap;
	}



	private List<AiIpe> convertModels(String arrStr){
		List<AiIpe> aiIpeList = new ArrayList<>();
		if(org.springframework.util.StringUtils.isEmpty(arrStr) || arrStr.contains("The request key should contain")){
			return aiIpeList;
		}

		JSONArray array = JSON.parseArray(arrStr);
		for (int i = 0; i < array.size(); i++) {
			AiIpe aiIpe = new AiIpe();
			JSONArray arrValue = array.getJSONArray(i);
			aiIpe.setCompany(arrValue.getString(0));
			aiIpe.setFine(formatDouble(arrValue.getString(1)));
			aiIpe.setRevoked(formatDouble(arrValue.getString(2)));
			aiIpe.setConfiscate(formatDouble(arrValue.getString(3)));
			aiIpe.setDetention(formatDouble(arrValue.getString(4)));
			aiIpe.setProduction(formatDouble(arrValue.getString(5)));
			aiIpe.setInstruct(formatDouble(arrValue.getString(6)));

			double sum = 0D;
			for(int j = 0; j < 6; j++){
				sum += Double.valueOf(formatDouble(arrValue.getString(j+1)));
			}
			aiIpe.setTotalSum(formatDouble(String.valueOf(sum/100)));
			aiIpe.setOther(formatDouble(arrValue.getString(7)));
			aiIpe.setSeason(arrValue.getString(8));
			aiIpeList.add(aiIpe);
		}
		return aiIpeList;
	}

	public static String formatDouble(String d) {
		if(StringUtils.isEmpty(d)){
			return "0";
		}
		Double dv = Double.valueOf(d);
		NumberFormat nf = NumberFormat.getNumberInstance();
		// 保留两位小数
		nf.setMaximumFractionDigits(2);
		// 如果不需要四舍五入，可以使用RoundingMode.DOWN
		nf.setRoundingMode(RoundingMode.UP);
		return nf.format(dv * 100);
	}

}
