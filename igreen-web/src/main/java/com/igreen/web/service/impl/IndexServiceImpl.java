package com.igreen.web.service.impl;

import java.util.*;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.igreen.common.dao.*;
import com.igreen.common.model.*;
import com.igreen.common.util.ListRange;
import com.igreen.web.util.HttpClientHelper;
import com.igreen.web.view.IgreenSearch;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.igreen.common.dto.MapDto;
import com.igreen.web.job.GetRegtionTaskJob;
import com.igreen.web.service.IndexService;
import com.igreen.web.util.Result;
import com.igreen.web.view.Igreen;
import com.igreen.web.view.RelationCompanyView;
import com.igreen.web.view.SearchCompanyInfo;

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

		}
		// 法院判决
		igreen.setQichachaJudgements(qichachaJudgementMapper.selectByKeyNo(companyName));
		// 重点监管企业
		MonitorCompany monitorCompany = new MonitorCompany();
		//monitorCompany.setRegistItemId(rgItem.getId());
		monitorCompany.setCompanyName(companyName);
		List<MonitorCompany> monitorCompanys = monitorCompanyMapper.selectByParameter(monitorCompany);
		igreen.setMonitorCompanies(monitorCompanys);

		List<RegistItem> regItems = registItemMapper.selectByCompanyNameAndStatus(params);
		if(!regItems.isEmpty()){
			RegistItem rgItem = regItems.get(0);
			igreen.setRegistItem(rgItem);
			// 监管记录
			/*List<IpeIndustryRecord> ipeIndustry = ipeIndustryRecordMapper.selectByRegistItemId(rgItem.getId());
			igreen.setIpeIndustryRecords(ipeIndustry);*/

			// 群众举报案件
			/*EnvironmentalIssue environmentalIssue = new EnvironmentalIssue();
			environmentalIssue.setRegistItemId(rgItem.getId());
			List<EnvironmentalIssue> environmentalIssues =  environmentalIssueMapper.selectByParameter(environmentalIssue);
			igreen.setEnvironmentalIssues(environmentalIssues);*/

			// 排污许可
			PollutionDischargeLicense pollutionDischarge = pollutionDischargeLicenseMapper.selectByRegistItemId(rgItem.getId());
			igreen.setPollutionDischargeLicense(pollutionDischarge);
			if(pollutionDischarge != null){
				List<ExecutionRecord> executionRecords = new ArrayList<ExecutionRecord>();
				executionRecords.add(executionRecordMapper.selectById(rgItem.getId()));
				igreen.setExecutionRecords(executionRecords);
			}

			// 清洁生产企业
			CleanProductionCompany cleanProduction = cleanProductionCompanyMapper.selectByRegistItemId(rgItem.getId());
			igreen.setCleanProductionCompany(cleanProduction);
		}

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
			list.add(map);
		}

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("reqstr", list);
		String result = HttpClientHelper.sendPost3("http://localhost:4411", param, "UTF-8");
		System.out.println("params="+JSON.toJSONString(param));
		System.out.println("result="+result);

		List<AiIpe> aiIpeList = convertModels(result);
		igreen.setAiIpeList(aiIpeList);
		// 能效备案
		igreen.setExcelEnergyEfficiencyLabels(excelEnergyEfficiencyLabelMapper.selectByFilingCompany(params));

		return igreen;
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
			aiIpe.setFine(arrValue.getString(1));
			aiIpe.setRevoke(arrValue.getString(2));
			aiIpe.setConfiscate(arrValue.getString(3));
			aiIpe.setDetention(arrValue.getString(4));
			aiIpe.setProduction(arrValue.getString(5));
			aiIpe.setInstruct(arrValue.getString(6));
			aiIpe.setOther(arrValue.getString(7));
			aiIpe.setSeason(arrValue.getString(8));
			aiIpeList.add(aiIpe);
		}

		return aiIpeList;
	}

}
