package com.igreen.boss.service.lawRisk;

import com.igreen.common.model.CourtNotice;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface CourtNoticeService {

	/**
	 * 添加/修改法院公告
	 * @param courtNotice
	 * @return
	 */
	ResponseModel addCourtNotice(CourtNotice courtNotice, Integer id);

	/**
	 * 根据ID查询法院公告
	 * @param courtNoticeId
	 * @return
	 */
	CourtNotice getOneCourtNotice(Integer courtNoticeId);

	/**
	 * 查询法院公告列表
	 * @param courtNotice
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange courtNoticeList(CourtNotice courtNotice, Integer currentPage, Integer pageRows);

}
