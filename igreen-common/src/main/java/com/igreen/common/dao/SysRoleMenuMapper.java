package com.igreen.common.dao;

import com.igreen.common.model.SysRoleMenu;

public interface SysRoleMenuMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);

	void deleteByRoleId(Integer roleId);
    
}