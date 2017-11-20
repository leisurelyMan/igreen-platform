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
import com.igreen.boss.service.businessRisk.ChattelMortgageService;
import com.igreen.common.model.ChattelMortgage;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/businessRisk")
public class ChattelMortgageController extends BaseController{

	@Resource
	ChattelMortgageService chattelMortgageService;
	
	/**
	 * 跳转动产抵押信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toChattelMortgageList")
	public ModelAndView toChattelMortgageList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("businessRisk/chattelMortgage.jsp",model);
	}
	
	
	/**
	 * 添加/修改动产抵押信息
	 * @param penalty
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addChattelMortgage", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addChattelMortgage(ChattelMortgage chattelMortgage,HttpServletRequest request,HttpServletResponse response){
		return chattelMortgageService.addChattelMortgage(chattelMortgage, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询动产抵押信息
	 * @param penaltyId
	 * @return
	 */
	@RequestMapping(value="getOneChattelMortgage", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody ChattelMortgage getOneChattelMortgage(Integer chattelMortgageId){
		return chattelMortgageService.getOneChattelMortgage(chattelMortgageId);
	}
	
	/**
	 * 查询动产抵押信息列表
	 * @param penalty
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="chattelMortgageList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange chattelMortgageList(ChattelMortgage chattelMortgage,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return chattelMortgageService.chattelMortgageList(chattelMortgage,currentPage,pageRows);
	}
}
