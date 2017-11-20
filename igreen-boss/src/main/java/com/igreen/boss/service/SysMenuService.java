package com.igreen.boss.service;

import java.util.List;

import com.igreen.common.model.SysMenu;

public interface SysMenuService {

	/**
	 * 查询所有菜单
	 * @return
	 */
	public List<SysMenu> findUserMenus();

	/**
	 * 查询角色菜单
	 * @param roleId
	 * @return
	 */
	public List<SysMenu> getRoleMenuTree(Integer roleId);

	/**
	 * 查询用户菜单
	 * @param userId
	 * @return
	 */
	public List<SysMenu> getUserMenuTree(Integer userId);
}
