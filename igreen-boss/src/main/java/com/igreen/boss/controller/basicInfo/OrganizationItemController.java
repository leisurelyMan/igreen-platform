package com.igreen.boss.controller.basicInfo;

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
import com.igreen.boss.service.basicInfo.OrganizationItemService;
import com.igreen.common.model.OrganizationItem;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/basicInfo")
public class OrganizationItemController extends BaseController{

	@Resource
	OrganizationItemService organizationService;
	
	/**
	 * 跳转组织机构代码证信息列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toOrganizationItemList")
	public ModelAndView toOrganizationItemList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("basicInfo/organizationItem.jsp",model);
	}
	
	
	/**
	 * 添加/修改组织机构代码证信息
	 * @param shareholder
	 * @return
	 */
	@RequestMapping(value="addOrganizationItem", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addOrganizationItem(OrganizationItem organizationItem,HttpServletRequest request,HttpServletResponse response){
		return organizationService.addOrganizationItem(organizationItem, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询组织机构代码证信息
	 * @param shareholderId
	 * @return
	 */
	@RequestMapping(value="getOneOrganizationItem", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody OrganizationItem getOneOrganizationItem(Integer organizationItemId){
		return organizationService.getOneOrganizationItem(organizationItemId);
	}
	
	/**
	 * 查询组织机构代码证信息列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="organizationItemList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange organizationItemList(OrganizationItem organizationItem,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return organizationService.organizationItemList(organizationItem,currentPage,pageRows);
	}
}
