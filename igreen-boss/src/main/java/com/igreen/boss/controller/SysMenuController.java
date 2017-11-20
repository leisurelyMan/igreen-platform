package com.igreen.boss.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.service.SysMenuService;
import com.igreen.common.model.SysMenu;

@Controller
@RequestMapping(value="/sys")
public class SysMenuController extends BaseController{
	
	@Resource
	SysMenuService sysMenuService;
	
	/**
	 * 跳转到
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toSysMenuList")
	public ModelAndView toSysMenuList(HttpServletRequest request,HttpServletResponse response, ModelMap model){
		return new ModelAndView("right.html",model);
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value="getUserMenuTree")
	public @ResponseBody List<SysMenu> getUserMenuTree(HttpServletRequest request,HttpServletResponse response){
		return sysMenuService.getUserMenuTree(this.getUser(request, response).getId());
	}
	
	/**
	 * 
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value="getRoleMenuTree")
	public @ResponseBody List<SysMenu> getRoleMenuTree(Integer roleId){
		return sysMenuService.getRoleMenuTree(roleId);
	}
	
}
