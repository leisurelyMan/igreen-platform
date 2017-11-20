package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.FreezeStockRight;

public interface FreezeStockRightMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(FreezeStockRight record);

    int insertSelective(FreezeStockRight record);

    FreezeStockRight selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FreezeStockRight record);

    int updateByPrimaryKey(FreezeStockRight record);

	List<FreezeStockRight> pageFreezeStockRight(Map<String, Object> params);

	Integer countFreezeStockRight(Map<String, Object> params);

	int deleteByRegistItemId(Integer registItemId);
	
	List<FreezeStockRight> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}