package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.DomainName;

public interface DomainNameMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(DomainName record);

    int insertSelective(DomainName record);

    DomainName selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DomainName record);

    int updateByPrimaryKey(DomainName record);

	List<DomainName> pageDomainName(Map<String, Object> params);

	Integer countDomainName(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<DomainName> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}