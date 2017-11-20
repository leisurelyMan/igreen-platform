package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.ThingChattelMortgage;

public interface ThingChattelMortgageMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(ThingChattelMortgage record);

    int insertSelective(ThingChattelMortgage record);

    ThingChattelMortgage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ThingChattelMortgage record);

    int updateByPrimaryKey(ThingChattelMortgage record);

	List<ThingChattelMortgage> pageThingChattelMortgage(Map<String, Object> params);

	Integer countThingChattelMortgage(Map<String, Object> params);

	int deleteByRegistItemId(Integer registItemId);
	
	List<ThingChattelMortgage> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}