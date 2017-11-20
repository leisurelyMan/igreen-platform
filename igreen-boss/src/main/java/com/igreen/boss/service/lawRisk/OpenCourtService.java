package com.igreen.boss.service.lawRisk;

import com.igreen.common.model.OpenCourtNotice;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface OpenCourtService {

	/**
	 * 添加/修改开庭公告
	 * @param shareholder
	 * @return
	 */
	ResponseModel addOpenCourtNotice(OpenCourtNotice courtNotice, Integer id);

	/**
	 * 根据ID查询开庭公告
	 * @param shareholderId
	 * @return
	 */
	OpenCourtNotice getOneOpenCourtNotice(Integer courtNoticeId);

	/**
	 * 查询开庭公告列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange courtNoticeList(OpenCourtNotice courtNotice, Integer currentPage, Integer pageRows);

}
