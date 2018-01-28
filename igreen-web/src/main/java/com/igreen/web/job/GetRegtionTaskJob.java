package com.igreen.web.job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.igreen.common.dao.CleanProductionCompanyMapper;
import com.igreen.common.dao.IpeIndustryRecordMapper;
import com.igreen.common.dao.PollutionDischargeLicenseMapper;
import com.igreen.common.dao.RegistItemLocationMapper;
import com.igreen.common.dto.MapDto;
import com.igreen.common.model.CleanProductionCompany;
import com.igreen.common.model.IpeIndustryRecord;
import com.igreen.common.model.PollutionDischargeLicense;
import com.igreen.common.model.RegistItemLocation;
import com.igreen.web.util.SpringBeanManager;

@DisallowConcurrentExecution
public class GetRegtionTaskJob implements Job {
	
    public static volatile List<PollutionDischargeLicense> pdlRegationList = new ArrayList<PollutionDischargeLicense>();
	public static volatile List<CleanProductionCompany> cpcRegationList = new ArrayList<CleanProductionCompany>();
    public static volatile List<IpeIndustryRecord> ipeRegationList = new ArrayList<IpeIndustryRecord>();

    public static volatile Map<String,MapDto> allMapDate = new HashMap<String,MapDto>();
	public static Map<String, MapDto> getAllMapDate() {
		return allMapDate;
	}

	public static void setAllMapDate(Map<String, MapDto> allMapDate) {
		GetRegtionTaskJob.allMapDate = allMapDate;
	}


	private static final String provinces ="北京市,澳门特别行政区,重庆市,福建省,广东省,广西壮族自治区,海南省,贵州省,山西省,台湾省,河南省,甘肃省,湖南省,河北省,安徽省,上海市,湖北省,黑龙江省,内蒙古自治区,江苏省,吉林省,宁夏回族自治区,江西省,山东省,辽宁省,陕西省,青海省,新疆维吾尔自治区,天津市,香港特别行政区,四川省,西藏自治区,云南省,浙江省";
	
	public static List<PollutionDischargeLicense> getPdlRegationList() {
		return pdlRegationList;
	}

	public static void setPdlRegationList(List<PollutionDischargeLicense> list_1) {
		GetRegtionTaskJob.pdlRegationList = list_1;
	}

	public static List<CleanProductionCompany> getCpcRegationList() {
		return cpcRegationList;
	}

	public static void setCpcRegationList(List<CleanProductionCompany> list_2) {
		GetRegtionTaskJob.cpcRegationList = list_2;
	}

	public static List<IpeIndustryRecord> getIpeRegationList() {
		return ipeRegationList;
	}

	public static void setIpeRegationList(List<IpeIndustryRecord> list_3) {
		GetRegtionTaskJob.ipeRegationList = list_3;
	}
	
	
	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		RegistItemLocationMapper registItemLocationMapper = (RegistItemLocationMapper) SpringBeanManager.getBean("registItemLocationMapper");
		PollutionDischargeLicenseMapper pollutionDischargeLicenseMapper = (PollutionDischargeLicenseMapper) SpringBeanManager.getBean("pollutionDischargeLicenseMapper");
		List<PollutionDischargeLicense> list_1 = pollutionDischargeLicenseMapper.getRegion();
	    setPdlRegationList(list_1);
		
		CleanProductionCompanyMapper cleanProductionCompanyMapper = (CleanProductionCompanyMapper) SpringBeanManager.getBean("cleanProductionCompanyMapper");
		List<CleanProductionCompany> list_2 = cleanProductionCompanyMapper.getRegion();
		setCpcRegationList(list_2);
		
		IpeIndustryRecordMapper ipeIndustryRecordMapper = (IpeIndustryRecordMapper) SpringBeanManager.getBean("ipeIndustryRecordMapper");
		List<IpeIndustryRecord> list_3 = ipeIndustryRecordMapper.getRegion();
		setIpeRegationList(list_3);
		System.out.println("地区经纬度加载完毕！！！！");
		long startTime = System.currentTimeMillis();
		for(String province : provinces.split(",")){
			int cpcNum = 0;
			int ipeNum = 0;
			int pdlNum = 0;
			List<RegistItemLocation> registItemLocations = registItemLocationMapper.selectiveList(province, null);
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
			MapDto mapDto = new MapDto();
			mapDto.setCpcNum(cpcNum);
			mapDto.setIpeNum(ipeNum);
			mapDto.setPdlNum(pdlNum);
			allMapDate.put(province,mapDto);
		}
		System.out.println("所有省的地图数据加载完毕！耗时(ms)："+(System.currentTimeMillis()-startTime));
		
	}
}
