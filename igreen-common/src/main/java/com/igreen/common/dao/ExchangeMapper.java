package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.Exchange;

public interface ExchangeMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Exchange record);

    int insertSelective(Exchange record);

    Exchange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Exchange record);

    int updateByPrimaryKey(Exchange record);

	Integer countExchange(Map<String, Object> params);

	List<Exchange> pageExchange(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<Exchange> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}