package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.OtherInformation;

public interface OtherInformationMapper {
	int insertSelective(OtherInformation info);
	
	List<OtherInformation> pageRecord(Map<String,Object> params);
	
	Integer countRecord(Map<String,Object> params);
}
