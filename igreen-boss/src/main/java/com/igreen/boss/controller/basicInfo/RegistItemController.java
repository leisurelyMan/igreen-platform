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
import com.igreen.boss.service.basicInfo.RegistItemService;
import com.igreen.common.model.RegistItem;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/basicInfo")
public class RegistItemController extends BaseController{

	@Resource
	RegistItemService registItemService;
	
	/**
	 * 跳转登记信息列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toRegistItemList")
	public ModelAndView toRegistItemList(HttpServletRequest request,HttpServletResponse response, ModelMap model){
		return new ModelAndView("basicInfo/registItem.html",model);
	}
	
	
	/**
	 * 添加/修改注册信息
	 * @param role
	 * @return
	 */
	@RequestMapping(value="addRegistItem", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addRegistItem(RegistItem registItem,HttpServletRequest request,HttpServletResponse response){
		registItem.setDataSource(1);
		return registItemService.addRegistItem(registItem, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询注册信息
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value="getOneRegistItem", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody RegistItem getOneRegistItem(Integer registId){
		return registItemService.getOneRegistItem(registId);
	}
	
	/**
	 * 查询注册信息列表
	 * @param role
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="registItemList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange registItemList(RegistItem registItem,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return registItemService.registItemList(registItem,currentPage,pageRows);
	}
}
