package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.ManagementRecord;

public interface ManagementRecordMapper {
	int insertSelective(ManagementRecord record);
	
	int insertBatch(List<ManagementRecord> list);
	
	List<ManagementRecord> pageRecord(Map<String,Object> params);
	
	Integer countRecord(Map<String,Object> params);
}
