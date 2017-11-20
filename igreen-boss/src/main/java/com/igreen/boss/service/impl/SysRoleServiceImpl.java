package com.igreen.boss.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.SysRoleService;
import com.igreen.common.dao.SysRoleMapper;
import com.igreen.common.dao.SysRoleMenuMapper;
import com.igreen.common.model.SysRole;
import com.igreen.common.model.SysRoleMenu;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class SysRoleServiceImpl implements SysRoleService {
	
	Logger log = Logger.getLogger(SysRoleServiceImpl.class);
	
	@Resource
	SysRoleMapper roleMapper;
	
	@Resource
	SysRoleMenuMapper roleMenuMapper;

	@Override
	public ListRange roleList(SysRole role, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(role.getName()))
			params.put("name", role.getName());
		if(!StrUtil.isNull(role.getShortName()))
			params.put("shortName", role.getShortName());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(roleMapper.pageSysRole(params), roleMapper.countSysRole(params), currentPage, pageRows);
		return result;
	}

	@Override
	public ResponseModel addRole(SysRole role, Integer userId) {
		try{
			if(StrUtil.isNull(role.getId())){
				role.setStatus(1);
				role.setCreater(userId);
				role.setCreatedTime(new Date());
				roleMapper.insertSelective(role);
			}
			else{
				role.setUpdater(userId);
				role.setUpdatedTime(new Date());
				roleMapper.updateByPrimaryKeySelective(role);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public SysRole getOneRole(Integer roleId) {
		return roleMapper.selectByPrimaryKey(roleId);
	}

	@Override
	public void saveRoleMenu(Integer roleId, String menuIds, Integer userId) {
		//清空原数据
		roleMenuMapper.deleteByRoleId(roleId);
		
		//转化menuId数组，并循环插入
		String[] menuIdA = menuIds.split(",");
		for(int i=0;i<menuIdA.length;i++){
			SysRoleMenu roleMenu = new SysRoleMenu(roleId, Integer.parseInt(menuIdA[i]), userId);
			this.roleMenuMapper.insertSelective(roleMenu);
		}
	}

	@Override
	public List<SysRole> getUserRole(Integer userId) {
		return roleMapper.getUserRole(userId);
	}

}
