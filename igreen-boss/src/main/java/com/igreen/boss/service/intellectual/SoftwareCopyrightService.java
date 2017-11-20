package com.igreen.boss.service.intellectual;

import com.igreen.common.model.SoftwareCopyright;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface SoftwareCopyrightService {

	/**
	 * 添加/修改软件著作权信息
	 * @param softwareCopyright
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addSoftwareCopyright(SoftwareCopyright softwareCopyright, Integer id);

	/**
	 * 根据ID查询软件著作权信息
	 * @param softwareCopyrightId
	 * @return
	 */
	SoftwareCopyright getOneSoftwareCopyright(Integer softwareCopyrightId);

	/**
	 * 查询软件著作权信息列表
	 * @param softwareCopyright
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange softwareCopyrightList(SoftwareCopyright softwareCopyright, Integer currentPage, Integer pageRows);

}
