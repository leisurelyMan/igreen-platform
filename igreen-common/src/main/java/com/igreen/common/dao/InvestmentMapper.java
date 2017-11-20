package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.Investment;

public interface InvestmentMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Investment record);

    int insertSelective(Investment record);

    Investment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Investment record);

    int updateByPrimaryKey(Investment record);

	List<Investment> pageInvestment(Map<String, Object> params);

	Integer countInvestment(Map<String, Object> params);

	int deleteByRegistItemId(Integer registItemId);
	
	List<Investment> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}