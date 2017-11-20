package com.igreen.boss.service.businessRisk;

import com.igreen.common.model.PledgeStockRight;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface PledgeStockRightService {

	/**
	 * 添加/修改股权质押信息
	 * @param penalty
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addPledgeStockRight(PledgeStockRight pledgeStockRight, Integer id);

	/**
	 * 根据ID查询股权质押信息
	 * @param penaltyId
	 * @return
	 */
	PledgeStockRight getOnePledgeStockRight(Integer pledgeStockRightId);

	/**
	 * 查询股权质押信息列表
	 * @param penalty
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange pledgeStockRightIdList(PledgeStockRight pledgeStockRight, Integer currentPage, Integer pageRows);

}
