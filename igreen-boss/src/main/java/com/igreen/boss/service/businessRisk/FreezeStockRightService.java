package com.igreen.boss.service.businessRisk;

import com.igreen.common.model.FreezeStockRight;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface FreezeStockRightService {

	/**
	 * 添加/修改股权冻结信息
	 * @param penalty
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addFreezeStockRight(FreezeStockRight freezeStockRight, Integer id);

	/**
	 * 根据ID查询股权冻结信息
	 * @param penaltyId
	 * @return
	 */
	FreezeStockRight getOneFreezeStockRight(Integer freezeStockRightId);

	/**
	 * 查询股权冻结信息列表
	 * @param penalty
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange freezeStockRightList(FreezeStockRight freezeStockRight, Integer currentPage, Integer pageRows);

}
