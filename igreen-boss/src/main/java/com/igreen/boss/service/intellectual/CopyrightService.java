package com.igreen.boss.service.intellectual;

import com.igreen.common.model.Copyright;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface CopyrightService {

	/**
	 * 添加/修改著作权信息
	 * @param copyright
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addCopyright(Copyright copyright, Integer id);

	/**
	 * 根据ID查询著作权信息
	 * @param copyrightId
	 * @return
	 */
	Copyright getOneCopyright(Integer copyrightId);

	/**
	 * 查询著作权信息列表
	 * @param copyright
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange copyrightList(Copyright copyright, Integer currentPage, Integer pageRows);

}
