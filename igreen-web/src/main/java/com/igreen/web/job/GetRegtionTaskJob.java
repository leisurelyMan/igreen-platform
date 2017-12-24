package com.igreen.web.job;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.StringUtils;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.igreen.common.dao.CleanProductionCompanyMapper;
import com.igreen.common.dao.IpeIndustryRecordMapper;
import com.igreen.common.dao.PollutionDischargeLicenseMapper;
import com.igreen.common.dao.RegistItemLocationMapper;
import com.igreen.common.model.CleanProductionCompany;
import com.igreen.common.model.IpeIndustryRecord;
import com.igreen.common.model.PollutionDischargeLicense;
import com.igreen.common.model.RegistItemLocation;
import com.igreen.web.util.SpringBeanManager;

@DisallowConcurrentExecution
public class GetRegtionTaskJob implements Job {
	
    public static volatile ConcurrentHashMap<Integer, String> regationMap = new ConcurrentHashMap<Integer, String>();
    public static volatile List<String> pdlRegationList = new ArrayList<String>();
	public static volatile List<String> cpcRegationList = new ArrayList<String>();
    public static volatile List<String> ipeRegationList = new ArrayList<String>();
    
	public static  ConcurrentHashMap<Integer, String> getRegationMap() {
		return regationMap;
	}

	public static void setRegationMap(ConcurrentHashMap<Integer, String> regationMap) {
		GetRegtionTaskJob.regationMap = regationMap;
	}

	public static List<String> getPdlRegationList() {
		return pdlRegationList;
	}

	public static void setPdlRegationList(List<String> pdlRegationList) {
		GetRegtionTaskJob.pdlRegationList = pdlRegationList;
	}

	public static List<String> getCpcRegationList() {
		return cpcRegationList;
	}

	public static void setCpcRegationList(List<String> cpcRegationList) {
		GetRegtionTaskJob.cpcRegationList = cpcRegationList;
	}

	public static List<String> getIpeRegationList() {
		return ipeRegationList;
	}

	public static void setIpeRegationList(List<String> ipeRegationList) {
		GetRegtionTaskJob.ipeRegationList = ipeRegationList;
	}
	
	
	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		
		RegistItemLocationMapper registItemLocationMapper = (RegistItemLocationMapper) SpringBeanManager.getBean("registItemLocationMapper");
		List<RegistItemLocation> registItemLocations = registItemLocationMapper.selectLocationList();
		for(RegistItemLocation registItemLocation : registItemLocations){
			regationMap.put(registItemLocation.getId(), registItemLocation.getLocation());
		}
		
		PollutionDischargeLicenseMapper pollutionDischargeLicenseMapper = (PollutionDischargeLicenseMapper) SpringBeanManager.getBean("pollutionDischargeLicenseMapper");
		List<PollutionDischargeLicense> list_1 = pollutionDischargeLicenseMapper.getRegion();
		for(PollutionDischargeLicense pollutionDischargeLicense : list_1){
			Integer registItemId = pollutionDischargeLicense.getRegistItemId();
			String location = regationMap.get(registItemId);
			if(!StringUtils.isBlank(location)){
				pdlRegationList.add(location);
			}
		}
		
		CleanProductionCompanyMapper cleanProductionCompanyMapper = (CleanProductionCompanyMapper) SpringBeanManager.getBean("cleanProductionCompanyMapper");
		List<CleanProductionCompany> list_2 = cleanProductionCompanyMapper.getRegion();
		for(CleanProductionCompany cleanProductionCompany : list_2){
			Integer registItemId = cleanProductionCompany.getRegistItemId();
			String location = regationMap.get(registItemId);
			if(!StringUtils.isBlank(location)){
				cpcRegationList.add(location);
			}
		}
		
		IpeIndustryRecordMapper ipeIndustryRecordMapper = (IpeIndustryRecordMapper) SpringBeanManager.getBean("ipeIndustryRecordMapper");
		List<IpeIndustryRecord> list_3 = ipeIndustryRecordMapper.getRegion();
		for(IpeIndustryRecord ipeIndustryRecord : list_3){
			Integer registItemId = ipeIndustryRecord.getRegistItemId();
			String location = regationMap.get(registItemId);
			if(!StringUtils.isBlank(location)){
				ipeRegationList.add(location);
			}
		}
		System.out.println("地区经纬度加载完毕！！！！");
	}
}
