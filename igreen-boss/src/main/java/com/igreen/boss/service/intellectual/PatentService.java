package com.igreen.boss.service.intellectual;

import com.igreen.common.model.Patent;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface PatentService {

	/**
	 * 添加/修改专利信息
	 * @param investment
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addPatent(Patent patent, Integer id);

	/**
	 * 根据ID查询专利信息
	 * @param patentId
	 * @return
	 */
	Patent getOnePatent(Integer patentId);

	/**
	 * 查询专利信息列表
	 * @param patent
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange patentList(Patent patent, Integer currentPage, Integer pageRows);

	
}
