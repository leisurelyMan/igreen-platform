package com.igreen.boss.service.businessRisk;

import com.igreen.common.model.ChattelMortgage;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface ChattelMortgageService {

	/**
	 * 添加/修改动产抵押信息
	 * @param penalty
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addChattelMortgage(ChattelMortgage chattelMortgage, Integer id);

	/**
	 * 根据ID查询动产抵押信息
	 * @param penaltyId
	 * @return
	 */
	ChattelMortgage getOneChattelMortgage(Integer chattelMortgageId);

	/**
	 * 查询动产抵押信息列表
	 * @param penalty
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange chattelMortgageList(ChattelMortgage chattelMortgage, Integer currentPage, Integer pageRows);

}
