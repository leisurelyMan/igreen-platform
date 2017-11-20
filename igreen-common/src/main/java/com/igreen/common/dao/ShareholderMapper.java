package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.Shareholder;

public interface ShareholderMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Shareholder record);

    int insertSelective(Shareholder record);

    Shareholder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shareholder record);

    int updateByPrimaryKey(Shareholder record);

	Integer countShareholder(Map<String, Object> params);

	List<Shareholder> pageShareholder(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<Shareholder> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}