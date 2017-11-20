package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.Patent;

public interface PatentMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Patent record);

    int insertSelective(Patent record);

    Patent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Patent record);

    int updateByPrimaryKey(Patent record);

	List<Patent> pagePatent(Map<String, Object> params);

	Integer countPatent(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<Patent> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}