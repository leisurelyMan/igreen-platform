package com.igreen.boss.service.impl.basicInfo;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.basicInfo.MepService;
import com.igreen.common.dao.AirQualityMapper;
import com.igreen.common.dao.CleanProductionCompanyMapper;
import com.igreen.common.dao.EnvironmentalIssueMapper;
import com.igreen.common.dao.ExecutionRecordMapper;
import com.igreen.common.dao.InformationDisclosureMapper;
import com.igreen.common.dao.ManagementRecordMapper;
import com.igreen.common.dao.MonitorCompanyMapper;
import com.igreen.common.dao.OtherInformationMapper;
import com.igreen.common.dao.PollutionDischargeLicenseMapper;
import com.igreen.common.model.AirQuality;
import com.igreen.common.model.CleanProductionCompany;
import com.igreen.common.model.EnvironmentalIssue;
import com.igreen.common.model.ExecutionRecord;
import com.igreen.common.model.InformationDisclosure;
import com.igreen.common.model.ManagementRecord;
import com.igreen.common.model.MonitorCompany;
import com.igreen.common.model.OtherInformation;
import com.igreen.common.model.PollutionDischargeLicense;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class MepServiceImpl implements MepService{
	@Resource
	CleanProductionCompanyMapper cleanMapper;
	
	@Resource
	MonitorCompanyMapper monitorMapper;
	
	@Resource
	EnvironmentalIssueMapper issueMapper;
	
	@Resource
	AirQualityMapper airQualityMapper;
	
	@Resource
	PollutionDischargeLicenseMapper licenseMapper;
	
	@Resource
	ExecutionRecordMapper executionMapper;
	
	@Resource
	InformationDisclosureMapper disclosureMapper;
	
	@Resource
	ManagementRecordMapper managementMapper;
	
	@Resource
	OtherInformationMapper otherMapper;

	@Override
	public ListRange cleanCompanyList(CleanProductionCompany company,Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(company.getYear()))
			params.put("year", company.getYear());
		if(!StrUtil.isNull(company.getBatchNo()))
			params.put("batchNo", company.getBatchNo());
		if(!StrUtil.isNull(company.getCity()))
			params.put("city", company.getCity());
		if(!StrUtil.isNull(company.getSerialNumber()))
			params.put("serialNumber", company.getSerialNumber());
		if(!StrUtil.isNull(company.getSerialNumber()))
			params.put("serialNumber", company.getSerialNumber());
		if(!StrUtil.isNull(company.getCompanyName()))
			params.put("companyName", company.getCompanyName());
		if(!StrUtil.isNull(company.getTrade()))
			params.put("trade", company.getTrade());
		if(!StrUtil.isNull(company.getProductSalesAmount()))
			params.put("productSalesAmount", company.getProductSalesAmount());
		if(!StrUtil.isNull(company.getRegion()))
			params.put("region", company.getRegion());
		if(!StrUtil.isNull(company.getAddress()))
			params.put("address", company.getAddress());
		if(!StrUtil.isNull(company.getReportTime()))
			params.put("reportTime", company.getReportTime());
		if(!StrUtil.isNull(company.getSubmitCheckTime()))
			params.put("submitCheckTime", company.getSubmitCheckTime());
		if(!StrUtil.isNull(company.getCompleteEstimateTime()))
			params.put("completeEstimateTime", company.getCompleteEstimateTime());
		if(!StrUtil.isNull(company.getCompleteCheckTime()))
			params.put("completeCheckTime", company.getCompleteCheckTime());
		if(!StrUtil.isNull(company.getCheckOrganization()))
			params.put("checkOrganization", company.getCheckOrganization());
		
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(cleanMapper.pageCleanProductionCompany(params), cleanMapper.countCleanProductionCompany(params), currentPage, pageRows);
		return result;
	}

	@Override
	public ListRange monitorCompanyList(MonitorCompany company,
			Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(company.getMonitorSequence()))
			params.put("monitorSequence", company.getMonitorSequence());
		if(!StrUtil.isNull(company.getRegionCode()))
			params.put("regionCode", company.getRegionCode());
		if(!StrUtil.isNull(company.getLegalPersonCode()))
			params.put("legalPersonCode", company.getLegalPersonCode());
		if(!StrUtil.isNull(company.getCompanyName()))
			params.put("companyName", company.getCompanyName());
		if(!StrUtil.isNull(company.getMonitorType()))
			params.put("monitorType", company.getMonitorType());
		if(!StrUtil.isNull(company.getProvince()))
			params.put("province", company.getProvince());
		if(!StrUtil.isNull(company.getMonitorYear()))
			params.put("monitorYear", company.getMonitorYear());
		
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(monitorMapper.pageMonitorCompany(params), monitorMapper.countMonitorCompany(params), currentPage, pageRows);
		return result;
	}
	
	@Override
	public ListRange reportList(EnvironmentalIssue issue,
			Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(issue.getReportSequence()))
			params.put("reportSequence", issue.getReportSequence());
		if(!StrUtil.isNull(issue.getReportYear()))
			params.put("reportYear", issue.getReportYear());
		if(!StrUtil.isNull(issue.getReportMonth()))
			params.put("reportMonth", issue.getReportMonth());
		if(!StrUtil.isNull(issue.getProvince()))
			params.put("province", issue.getProvince());
		if(!StrUtil.isNull(issue.getCompanyName()))
			params.put("companyName", issue.getCompanyName());
		if(!StrUtil.isNull(issue.getReportIssue()))
			params.put("reportIssue", issue.getReportIssue());
		if(!StrUtil.isNull(issue.getDealResult()))
			params.put("dealResult", issue.getDealResult());
		
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(issueMapper.pageReport(params), issueMapper.countReport(params), currentPage, pageRows);
		return result;
	}

	@Override
	public ListRange airQualityList(AirQuality quality, Integer currentPage,
			Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(quality.getRecordDate()))
			params.put("recordDate", quality.getRecordDate());
		if(!StrUtil.isNull(quality.getCity()))
			params.put("city", quality.getCity());
		if(!StrUtil.isNull(quality.getAirQualityIndex()))
			params.put("airQualityIndex", quality.getAirQualityIndex());
		if(!StrUtil.isNull(quality.getMainPollutant()))
			params.put("mainPollutant", quality.getMainPollutant());
		if(!StrUtil.isNull(quality.getStatus()))
			params.put("status", quality.getStatus());
		
		
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(airQualityMapper.pageAirQuality(params), airQualityMapper.countAirQuality(params), currentPage, pageRows);
		return result;
	}

	@Override
	public ListRange pollutionLicenseList(PollutionDischargeLicense quality,
			Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(quality.getId()))
			params.put("id", quality.getId());
		if(!StrUtil.isNull(quality.getProvince()))
			params.put("province", quality.getProvince());
		if(!StrUtil.isNull(quality.getCity()))
			params.put("city", quality.getCity());
		if(!StrUtil.isNull(quality.getAddress()))
			params.put("address", quality.getAddress());
		if(!StrUtil.isNull(quality.getCompanyName()))
			params.put("companyName", quality.getCompanyName());
		if(!StrUtil.isNull(quality.getIndustry()))
			params.put("industry", quality.getIndustry());
		
		
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(licenseMapper.pageLicense(params), licenseMapper.countLicense(params), currentPage, pageRows);
		return result;
	}

	@Override
	public ListRange executionRecordList(ExecutionRecord record,
			Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(record.getId()))
			params.put("id", record.getId());
		
		
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(executionMapper.pageRecord(params), executionMapper.countRecord(params), currentPage, pageRows);
		return result;
	}

	@Override
	public ListRange informationDisclosureList(InformationDisclosure record,
			Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(record.getId()))
			params.put("id", record.getId());
		
		
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(disclosureMapper.pageRecord(params), disclosureMapper.countRecord(params), currentPage, pageRows);
		return result;
	}

	@Override
	public ListRange managementRecordList(ManagementRecord record,
			Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(record.getId()))
			params.put("id", record.getId());
		
		
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(managementMapper.pageRecord(params), managementMapper.countRecord(params), currentPage, pageRows);
		return result;
	}

	@Override
	public ListRange otherInformationList(OtherInformation record,
			Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(record.getId()))
			params.put("id", record.getId());
		
		
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(otherMapper.pageRecord(params), otherMapper.countRecord(params), currentPage, pageRows);
		return result;
	}

}
