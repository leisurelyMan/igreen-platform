package com.igreen.boss.service.businessRisk;

import com.igreen.common.model.ThingChattelMortgage;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface ThingChattelMortgageService {

	/**
	 * 添加/修改动产抵押物信息
	 * @param thingChattelMortgage
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addThingChattelMortgage(ThingChattelMortgage thingChattelMortgage, Integer id);

	/**
	 * 根据ID查询动产抵押物信息
	 * @param thingChattelMortgageId
	 * @return
	 */
	ThingChattelMortgage getOneThingChattelMortgage(Integer thingChattelMortgageId);

	/**
	 * 查询动产抵押物信息列表
	 * @param thingChattelMortgage
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange thingChattelMortgageList(ThingChattelMortgage thingChattelMortgage, Integer currentPage, Integer pageRows);

}
