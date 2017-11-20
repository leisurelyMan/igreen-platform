package com.igreen.common.dao;

import com.igreen.common.model.SysUserRole;

public interface SysUserRoleMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
    
    int deleteByUserId(Integer userId);
}