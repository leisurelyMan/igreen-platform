package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.Copyright;

public interface CopyrightMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Copyright record);

    int insertSelective(Copyright record);

    Copyright selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Copyright record);

    int updateByPrimaryKey(Copyright record);

	List<Copyright> pageCopyright(Map<String, Object> params);

	Integer countCopyright(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<Copyright> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}