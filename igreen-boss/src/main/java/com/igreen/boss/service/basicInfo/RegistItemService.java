package com.igreen.boss.service.basicInfo;

import com.igreen.common.model.RegistItem;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface RegistItemService {

	/**
	 * 登记注册信息
	 * @param registItem
	 * @param id
	 * @return
	 */
	ResponseModel addRegistItem(RegistItem registItem, Integer id);

	/**
	 * 查询注册信息
	 * @param registId
	 * @return
	 */
	RegistItem getOneRegistItem(Integer registId);

	/**
	 * 分页查询注册信息
	 * @param registItem
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange registItemList(RegistItem registItem, Integer currentPage, Integer pageRows);

	
}
