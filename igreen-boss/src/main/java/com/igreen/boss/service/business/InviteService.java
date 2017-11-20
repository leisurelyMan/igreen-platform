package com.igreen.boss.service.business;

import com.igreen.common.model.Invite;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface InviteService {

	/**
	 * 添加/修改招聘信息
	 * @param invite
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addInvite(Invite invite, Integer id);

	/**
	 * 根据ID查询招聘信息
	 * @param inviteId
	 * @return
	 */
	Invite getOneInvite(Integer inviteId);

	/**
	 * 查询招聘信息列表
	 * @param invite
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange inviteList(Invite invite, Integer currentPage, Integer pageRows);

}
