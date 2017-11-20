package com.igreen.boss.service.basicInfo;

import com.igreen.common.model.Exchange;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface ExchangeService {

	/**
	 * 添加/修改变更信息
	 * @param shareholder
	 * @return
	 */
	ResponseModel addExchange(Exchange exchange, Integer id);

	/**
	 * 根据ID查询变更信息
	 * @param shareholderId
	 * @return
	 */
	Exchange getOneExchange(Integer exchangeId);

	/**
	 * 查询主要人员信息列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange exchangeList(Exchange exchange, Integer currentPage, Integer pageRows);

}
