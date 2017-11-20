package com.igreen.common.dao;

import java.util.List;

import com.igreen.common.model.SysMenu;

public interface SysMenuMapper {

	int deleteByPrimaryKey(Integer id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
    
    List<SysMenu> selectAll();
    
    List<SysMenu> selectMenuIdByRoleId(Integer roleId);
    
    List<SysMenu> selectUserMenu(Integer userId);
}