package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.PledgeStockRight;

public interface PledgeStockRightMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(PledgeStockRight record);

    int insertSelective(PledgeStockRight record);

    PledgeStockRight selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PledgeStockRight record);

    int updateByPrimaryKey(PledgeStockRight record);

	List<PledgeStockRight> pagePledgeStockRight(Map<String, Object> params);

	Integer countPledgeStockRight(Map<String, Object> params);

	int deleteByRegistItemId(Integer id);
	
	List<PledgeStockRight> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}