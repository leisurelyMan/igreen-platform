package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.ExecutedItem;

public interface ExecutedItemMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(ExecutedItem record);

    int insertSelective(ExecutedItem record);

    ExecutedItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExecutedItem record);

    int updateByPrimaryKey(ExecutedItem record);

	Integer countExecutedItem(Map<String, Object> params);

	List<ExecutedItem> pageExecutedItem(Map<String, Object> params);

	int deleteByRegistItemId(Integer registItemId);
	
	List<ExecutedItem> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}