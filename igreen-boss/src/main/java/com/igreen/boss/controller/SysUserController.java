package com.igreen.boss.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.service.SysUserService;
import com.igreen.common.model.SysUser;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.MD5Util;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Controller
@RequestMapping(value="/sys")
public class SysUserController  extends BaseController{
	
	@Resource
	SysUserService sysUserService;
	
	/**
	 * 登录
	 * @param userAccount
	 * @param userPassword
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="login")
	public ModelAndView login(String userAccount,String userPassword,HttpServletRequest request,
			HttpServletResponse response, HttpSession session, ModelMap model){
		System.out.println(userAccount);
		System.out.println(userPassword);
		SysUser user = sysUserService.findByUserAccountAndPassword(userAccount,userPassword);
		if(user == null){
			return new ModelAndView("login",model);
		}
		session.setAttribute("user", user);
		return new ModelAndView("main.html",model);
	}
	
	/**
	 * 添加/修改用户
	 * @param user
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addUser", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addUser(SysUser user,HttpServletRequest request,HttpServletResponse response){
		if(StrUtil.isNull(user.getId())){
			user.setUserPassword(MD5Util.to32md5("123456"));
		}
		return sysUserService.addUser(user, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询用户
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="getOneUser", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody SysUser getOneUser(Integer userId){
		return sysUserService.getOneUser(userId);
	}
	
	/**
	 * 跳转用户列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toSysUserList")
	public ModelAndView toSysMenuList(HttpServletRequest request,HttpServletResponse response, ModelMap model){
		return new ModelAndView("sys/user.html",model);
	}
	
	/**
	 * 分页显示用户
	 * @param user
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="userList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange userList(SysUser user,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return sysUserService.userList(user,currentPage,pageRows);
	}
	
	/**
	 * 添加用户角色
	 */
	@RequestMapping(value="saveUserRole", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody String saveUserRole(Integer userId,String roleIds,HttpServletRequest request,HttpServletResponse response){
		sysUserService.saveUserRole(userId,roleIds,this.getUser(request, response).getId());
		return "1";
	}
	
}
