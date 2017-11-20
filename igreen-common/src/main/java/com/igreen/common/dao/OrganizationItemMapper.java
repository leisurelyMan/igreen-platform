package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.OrganizationItem;

public interface OrganizationItemMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(OrganizationItem record);

    int insertSelective(OrganizationItem record);

    OrganizationItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrganizationItem record);

    int updateByPrimaryKey(OrganizationItem record);

	Integer countOrganizationItem(Map<String, Object> params);

	List<OrganizationItem> pageOrganizationItem(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<OrganizationItem> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}