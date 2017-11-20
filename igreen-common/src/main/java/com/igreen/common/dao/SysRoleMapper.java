package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.SysRole;

public interface SysRoleMapper {

	int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

	List<SysRole> pageSysRole(Map<String, Object> params);

	Integer countSysRole(Map<String, Object> params);

	List<SysRole> getUserRole(Integer userId);
}