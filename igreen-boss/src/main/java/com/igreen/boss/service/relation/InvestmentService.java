package com.igreen.boss.service.relation;

import com.igreen.common.model.Investment;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface InvestmentService {

	/**
	 * 添加/修改企业投资信息
	 * @param investment
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addInvestment(Investment investment, Integer id);

	/**
	 * 根据ID查询企业投资信息
	 * @param investmentId
	 * @return
	 */
	Investment getOneInvestment(Integer investmentId);

	/**
	 * 查询企业投资信息列表
	 * @param branch
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange investmentList(Investment investment, Integer currentPage, Integer pageRows);

}
