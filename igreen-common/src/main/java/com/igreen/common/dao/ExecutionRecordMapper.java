package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.ExecutionRecord;

public interface ExecutionRecordMapper {
	int insertSelective(ExecutionRecord record);
	
	int insertBatch(List<ExecutionRecord> list);
	
	List<ExecutionRecord> pageRecord(Map<String,Object> params);
	
	Integer countRecord(Map<String,Object> params);

	ExecutionRecord selectByPollutionId(Integer id);
}
