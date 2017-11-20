package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.SysUser;

public interface SysUserMapper {
	
    /**
     * 根据主键删除对象
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加对象
     */
    int insert(SysUser record);

    /**
     * 添加对象
     */
    int insertSelective(SysUser record);

    /**
     * 根据主键查询对象
     */
    SysUser selectByPrimaryKey(Integer id);

    /**
     * 更新对象
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * 更新对象
     */
    int updateByPrimaryKey(SysUser record);

    /**
     * 根据用户账号和密码查询用户对象
     * @param map
     * @return
     */
	SysUser findByUserAccountAndUserPassword(Map<String, String> map);

	/**
	 * 根据用户账号查询用户对象
	 * @param userAccount
	 * @return
	 */
	SysUser findByUserAccount(String userAccount);
	
	
	int countUserAccount(Map<String, Object> map);
	
	
	List<SysUser> pageUserAccount(Map<String, Object> map);
	
}