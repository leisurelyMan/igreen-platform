package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.ChattelMortgage;

public interface ChattelMortgageMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(ChattelMortgage record);

    int insertSelective(ChattelMortgage record);

    ChattelMortgage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChattelMortgage record);

    int updateByPrimaryKey(ChattelMortgage record);

	List<ChattelMortgage> pageChattelMortgage(Map<String, Object> params);

	Integer countChattelMortgage(Map<String, Object> params);

	int deleteByRegistItemId(Integer registItemId);
	
	List<ChattelMortgage> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}