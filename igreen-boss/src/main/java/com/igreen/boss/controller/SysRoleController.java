package com.igreen.boss.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.service.SysRoleService;
import com.igreen.common.model.SysRole;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/sys")
public class SysRoleController extends BaseController{
	
	@Resource
	SysRoleService roleService;
	
	/**
	 * 跳转角色列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toSysRoleList")
	public ModelAndView toSysMenuList(HttpServletRequest request,HttpServletResponse response, ModelMap model){
		return new ModelAndView("sys/role.html",model);
	}
	
	/**
	 * 添加/修改角色
	 * @param role
	 * @return
	 */
	@RequestMapping(value="addRole", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addRole(SysRole role,HttpServletRequest request,HttpServletResponse response){
		return roleService.addRole(role, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询角色
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value="getOneRole", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody SysRole getOneRole(Integer roleId){
		return roleService.getOneRole(roleId);
	}
	
	/**
	 * 查询角色列表
	 * @param role
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="roleList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange roleList(SysRole role,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return roleService.roleList(role,currentPage,pageRows);
	}
	
	
	/**
	 * 添加角色菜单
	 * @param roleId
	 * @param menuIds
	 * @return
	 */
	@RequestMapping(value="saveRoleMenu")
	public @ResponseBody String saveRoleMenu(Integer roleId,String menuIds,HttpServletRequest request,HttpServletResponse response){
		roleService.saveRoleMenu(roleId, menuIds, this.getUser(request, response).getId());
		return "1";
	}
	
	/**
	 * 查询用户角色
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="getUserRole")
	public @ResponseBody List<SysRole> getUserRole(Integer userId){
		return roleService.getUserRole(userId);
	}
}
