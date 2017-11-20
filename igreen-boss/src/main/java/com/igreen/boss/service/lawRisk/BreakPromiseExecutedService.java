package com.igreen.boss.service.lawRisk;

import com.igreen.common.model.BreakPromiseExecuted;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface BreakPromiseExecutedService {

	/**
	 * 添加/修改失信被执行人信息
	 * @param breakPromiseExecuted
	 * @return
	 */
	ResponseModel addBreakPromiseExecuted(BreakPromiseExecuted breakPromiseExecuted, Integer id);

	/**
	 * 根据ID查询失信被执行人信息
	 * @param breakPromiseId
	 * @return
	 */
	BreakPromiseExecuted getOneBreakPromiseExecuted(Integer breakPromiseId);

	/**
	 * 查询失信被执行人信息列表
	 * @param breakPromiseExecuted
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange breakPromiseExecutedList(BreakPromiseExecuted breakPromiseExecuted, Integer currentPage, Integer pageRows);

}
