package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.ExecutionRecord;
import com.igreen.common.model.InformationDisclosure;

public interface InformationDisclosureMapper {
	int insertSelective(InformationDisclosure info);
	
	int insertBatch(List<InformationDisclosure> list);
	
	List<ExecutionRecord> pageRecord(Map<String,Object> params);
	
	Integer countRecord(Map<String,Object> params);
}
