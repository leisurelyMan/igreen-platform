package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.RelationCompany;

public interface RelationCompanyMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(RelationCompany record);

    int insertSelective(RelationCompany record);

    RelationCompany selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelationCompany record);

    int updateByPrimaryKey(RelationCompany record);

	List<RelationCompany> pageRelationCompany(Map<String, Object> params);

	Integer countRelationCompany(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<RelationCompany> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}