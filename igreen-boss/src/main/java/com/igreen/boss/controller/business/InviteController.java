package com.igreen.boss.controller.business;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.business.InviteService;
import com.igreen.common.model.Invite;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/business")
public class InviteController extends BaseController{

	@Resource
	InviteService inviteService;
	
	/**
	 * 跳转招聘信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toInviteList")
	public ModelAndView toInviteList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("business/invite.jsp",model);
	}
	
	/**
	 * 添加/修改招聘信息
	 * @param investment
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addInvite", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addInvite(Invite invite,HttpServletRequest request,HttpServletResponse response){
		return inviteService.addInvite(invite, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询招聘信息
	 * @param investmentId
	 * @return
	 */
	@RequestMapping(value="getOneInvite", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody Invite getOneInvite(Integer inviteId){
		return inviteService.getOneInvite(inviteId);
	}
	
	/**
	 * 查询招聘信息列表
	 * @param invite
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="inviteList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange inviteList(Invite invite,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return inviteService.inviteList(invite,currentPage,pageRows);
	}
}
