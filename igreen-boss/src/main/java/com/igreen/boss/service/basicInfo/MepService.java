package com.igreen.boss.service.basicInfo;

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

public interface MepService {
	ListRange cleanCompanyList(CleanProductionCompany company,Integer currentPage,Integer pageRows);
	
	ListRange monitorCompanyList(MonitorCompany company,Integer currentPage,Integer pageRows);

	ListRange reportList(EnvironmentalIssue issue,Integer currentPage,Integer pageRows);
	
	ListRange airQualityList(AirQuality quality,Integer currentPage,Integer pageRows);
	
	ListRange pollutionLicenseList(PollutionDischargeLicense quality,Integer currentPage,Integer pageRows);
	
	ListRange executionRecordList(ExecutionRecord record,Integer currentPage,Integer pageRows);
	
	ListRange informationDisclosureList(InformationDisclosure record,Integer currentPage,Integer pageRows);
	
	ListRange managementRecordList(ManagementRecord record,Integer currentPage,Integer pageRows);
	
	ListRange otherInformationList(OtherInformation record,Integer currentPage,Integer pageRows);
}
