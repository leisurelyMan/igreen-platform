package com.igreen.boss.controller.businessRisk;

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
import com.igreen.boss.service.businessRisk.ThingChattelMortgageService;
import com.igreen.common.model.ThingChattelMortgage;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/businessRisk")
public class ThingChattelMortgageController extends BaseController {
	
	@Resource
	ThingChattelMortgageService thingChattelMortgageService;

	/**
	 * 跳转动产抵押物信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toThingChattelMortgageList")
	public ModelAndView toThingChattelMortgageList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("businessRisk/thingChattelMortgage.jsp",model);
	}
	
	/**
	 * 添加/修改动产抵押物信息
	 * @param thingChattelMortgage
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addThingChattelMortgage", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addThingChattelMortgage(ThingChattelMortgage thingChattelMortgage,HttpServletRequest request,HttpServletResponse response){
		return thingChattelMortgageService.addThingChattelMortgage(thingChattelMortgage, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询动产抵押物信息
	 * @param thingChattelMortgageId
	 * @return
	 */
	@RequestMapping(value="getOneThingChattelMortgage", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody ThingChattelMortgage getOneThingChattelMortgage(Integer thingChattelMortgageId){
		return thingChattelMortgageService.getOneThingChattelMortgage(thingChattelMortgageId);
	}
	
	/**
	 * 查询动产抵押物信息列表
	 * @param thingChattelMortgage
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="thingChattelMortgageList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange thingChattelMortgageList(ThingChattelMortgage thingChattelMortgage,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return thingChattelMortgageService.thingChattelMortgageList(thingChattelMortgage,currentPage,pageRows);
	}
}
