package com.igreen.boss.service;

import java.util.List;

import com.igreen.common.model.SysRole;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface SysRoleService {

	/**
	 * 分页查询角色
	 * @param role
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange roleList(SysRole role, Integer currentPage, Integer pageRows);

	/**
	 * 添加/修改角色
	 * @param role
	 * @return
	 */
	ResponseModel addRole(SysRole role, Integer userId);

	/**
	 * 根据ID查询角色
	 * @param roleId
	 * @return
	 */
	SysRole getOneRole(Integer roleId);

	/**
	 * 保存角色关联的菜单
	 * @param roleId
	 * @param menuIds
	 * @param id
	 */
	void saveRoleMenu(Integer roleId, String menuIds, Integer userId);

	/**
	 * 查询用户角色
	 * @param userId
	 * @return
	 */
	List<SysRole> getUserRole(Integer userId);

}
