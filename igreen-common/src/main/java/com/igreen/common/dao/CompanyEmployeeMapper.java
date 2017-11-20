package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.CompanyEmployee;

public interface CompanyEmployeeMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(CompanyEmployee record);

    int insertSelective(CompanyEmployee record);

    CompanyEmployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyEmployee record);

    int updateByPrimaryKey(CompanyEmployee record);

	List<CompanyEmployee> pageEmployee(Map<String, Object> params);

	Integer countEmployee(Map<String, Object> params);

	List<CompanyEmployee> selectByRegistItemId(Integer registItemId);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<CompanyEmployee> selectByRegistItemIdAndName(Map<String, Object> map);

	void auditByRegistItemId(Integer registItemId);
}