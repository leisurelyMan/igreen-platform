package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.BreakPromiseExecuted;

public interface BreakPromiseExecutedMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(BreakPromiseExecuted record);

    int insertSelective(BreakPromiseExecuted record);

    BreakPromiseExecuted selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BreakPromiseExecuted record);

    int updateByPrimaryKey(BreakPromiseExecuted record);

	List<BreakPromiseExecuted> pageBreakPromiseExecuted(Map<String, Object> params);

	Integer countBreakPromiseExecuted(Map<String, Object> params);

	int deleteByRegistItemId(Integer registItemId);
	
	List<BreakPromiseExecuted> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}