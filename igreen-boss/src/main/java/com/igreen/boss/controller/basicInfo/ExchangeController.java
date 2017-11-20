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
import com.igreen.boss.service.basicInfo.ExchangeService;
import com.igreen.common.model.Exchange;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/basicInfo")
public class ExchangeController  extends BaseController{

	@Resource
	ExchangeService exchangeService;
	
	/**
	 * 跳转变更信息列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toExchangeList")
	public ModelAndView toExchangeList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("basicInfo/exchange.jsp",model);
	}
	
	
	/**
	 * 添加/修改变更信息
	 * @param shareholder
	 * @return
	 */
	@RequestMapping(value="addExchange", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addExchange(Exchange exchange,HttpServletRequest request,HttpServletResponse response){
		return exchangeService.addExchange(exchange, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询变更信息
	 * @param shareholderId
	 * @return
	 */
	@RequestMapping(value="getOneExchange", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody Exchange getOneExchange(Integer exchangeId){
		return exchangeService.getOneExchange(exchangeId);
	}
	
	/**
	 * 查询变更信息列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="exchangeList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange exchangeList(Exchange exchange,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return exchangeService.exchangeList(exchange,currentPage,pageRows);
	}
}
