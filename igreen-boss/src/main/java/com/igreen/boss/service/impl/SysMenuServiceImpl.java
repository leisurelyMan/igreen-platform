package com.igreen.boss.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.SysMenuService;
import com.igreen.common.dao.SysMenuMapper;
import com.igreen.common.model.SysMenu;

@Service
public class SysMenuServiceImpl implements SysMenuService{
	
	@Resource
	SysMenuMapper menuMapper;

	@Override
	public List<SysMenu> findUserMenus() {
		return menuMapper.selectAll();
	}

	@Override
	public List<SysMenu> getRoleMenuTree(Integer roleId) {
		List<SysMenu> menus = menuMapper.selectAll();
		List<SysMenu> checkedMenuIds = menuMapper.selectMenuIdByRoleId(roleId);
		for(SysMenu menu : menus){
			menu.setChecked(false);
			for(SysMenu checkedMenu : checkedMenuIds){
				if(checkedMenu.getId().intValue() == menu.getId().intValue()){
					menu.setChecked(true);
					break;
				}
			}
		}
		return menus;
	}

	@Override
	public List<SysMenu> getUserMenuTree(Integer userId) {
		return menuMapper.selectUserMenu(userId);
	}

}
