package com.igreen.boss.service;

import com.igreen.common.model.SysUser;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface SysUserService {

	/**
	 * 分页查询用户
	 * @param user
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange userList(SysUser user, Integer currentPage, Integer pageRows);

	/**
	 * 根据账号和密码查询用户
	 * @param userAccount
	 * @param userPassword
	 * @return
	 */
	SysUser findByUserAccountAndPassword(String userAccount, String userPassword);

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	ResponseModel addUser(SysUser user, Integer userId);

	/**
	 * 根据ID查询用户
	 * @param userId
	 * @return
	 */
	SysUser getOneUser(Integer userId);

	/**
	 * 添加用户角色
	 * @param userId
	 * @param roleIds
	 */
	void saveUserRole(Integer userId, String roleIds,Integer creater);

	
}
