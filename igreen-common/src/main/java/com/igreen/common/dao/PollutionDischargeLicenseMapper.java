package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.PollutionDischargeLicense;

public interface PollutionDischargeLicenseMapper {
	int insertSelective(PollutionDischargeLicense license);
	
	int updateByPrimaryKeySelective(PollutionDischargeLicense license);
	
	List<PollutionDischargeLicense> selectByParameter(PollutionDischargeLicense license);
	
	List<PollutionDischargeLicense> selectNullPollutionTypeRecords(Map<String,Object> params);
	
	List<PollutionDischargeLicense> pageLicense(Map<String,Object> params);
	
	Integer countLicense(Map<String,Object> params);
	
	PollutionDischargeLicense selectByRegistItemId(Integer registItemId);
}
