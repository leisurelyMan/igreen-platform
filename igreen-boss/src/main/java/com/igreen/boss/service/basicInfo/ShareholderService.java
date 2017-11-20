package com.igreen.boss.service.basicInfo;

import com.igreen.common.model.Shareholder;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface ShareholderService {

	/**
	 * 添加/修改股东及出资信息
	 * @param shareholder
	 * @return
	 */
	ResponseModel addShareholder(Shareholder shareholder, Integer id);

	/**
	 * 根据ID查询股东及出资信息
	 * @param shareholderId
	 * @return
	 */
	Shareholder getOneShareholder(Integer shareholderId);

	/**
	 * 查询股东及出资信息列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange shareholderList(Shareholder shareholder, Integer currentPage, Integer pageRows);

}
