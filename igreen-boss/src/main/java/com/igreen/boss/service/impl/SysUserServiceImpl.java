package com.igreen.boss.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.SysUserService;
import com.igreen.common.dao.SysUserMapper;
import com.igreen.common.dao.SysUserRoleMapper;
import com.igreen.common.model.SysUser;
import com.igreen.common.model.SysUserRole;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class SysUserServiceImpl implements SysUserService{
	
	Logger log = Logger.getLogger(SysUserServiceImpl.class);
	
	@Resource
	SysUserMapper sysUserMapper;
	
	@Resource
	SysUserRoleMapper userRoleMapper;

	@Override
	public ListRange userList(SysUser user, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(user.getUserAccount()))
			params.put("userAccount", user.getUserAccount());
		if(!StrUtil.isNull(user.getUserName()))
			params.put("userAccount", user.getUserName());
		if(!StrUtil.isNull(user.getEmail()))
			params.put("userAccount", user.getEmail());
		if(!StrUtil.isNull(user.getMobile()))
			params.put("userAccount", user.getMobile());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(sysUserMapper.pageUserAccount(params), sysUserMapper.countUserAccount(params), currentPage, pageRows);
		return result;
	}

	@Override
	public SysUser findByUserAccountAndPassword(String userAccount, String userPassword) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("userAccount", userAccount);
		map.put("userPassword", userPassword);
		return sysUserMapper.findByUserAccountAndUserPassword(map);
	}

	@Override
	public ResponseModel addUser(SysUser user, Integer userId) {
		try {
			if(user.getUserAccount() == null)
				return new ResponseModel(-1, "用户名不能为空");
			
			if(user.getUserPassword() == null)
				return new ResponseModel(-1, "密码不能为空");
			
			SysUser user1 = sysUserMapper.findByUserAccount(user.getUserAccount());
			if(user1 != null && user1.getId() != user.getId())
				return new ResponseModel(-1, "用户名重复");
			
			if(StrUtil.isNull(user.getId())){
				user.setStatus(1);
				user.setCreater(userId);
				user.setCreatedTime(new Date());
				sysUserMapper.insertSelective(user);
			}else{
				user.setUpdater(userId);
				user.setUpdatedTime(new Date());
				sysUserMapper.updateByPrimaryKeySelective(user);
			}
			
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}

	}

	@Override
	public SysUser getOneUser(Integer userId) {
		return sysUserMapper.selectByPrimaryKey(userId);
	}

	@Override
	public void saveUserRole(Integer userId, String roleIds,Integer creater) {
		//删除原有权限
		userRoleMapper.deleteByUserId(userId);
		//保存现有
		//分解得所有角色ID
		String[] roleIdA = roleIds.split(",");
		for(String roleId:roleIdA){
			SysUserRole userRole = new SysUserRole(Integer.parseInt(roleId), userId, creater);
			userRoleMapper.insertSelective(userRole);
		}
	}

}
