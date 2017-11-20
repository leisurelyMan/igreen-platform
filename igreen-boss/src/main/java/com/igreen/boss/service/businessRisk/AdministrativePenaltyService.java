package com.igreen.boss.service.businessRisk;

import com.igreen.common.model.AdministrativePenalty;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface AdministrativePenaltyService {

	/**
	 * 添加/修改行政处罚信息
	 * @param courtNotice
	 * @return
	 */
	ResponseModel addAdministrativePenalty(AdministrativePenalty penalty, Integer id);

	/**
	 * 根据ID查询行政处罚信息
	 * @param penaltyId
	 * @return
	 */
	AdministrativePenalty getOneAdministrativePenalty(Integer penaltyId);

	/**
	 * 查询行政处罚信息列表
	 * @param penalty
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange administrativePenaltyList(AdministrativePenalty penalty, Integer currentPage, Integer pageRows);

}
