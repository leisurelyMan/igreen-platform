package com.igreen.boss.controller.lawRisk;

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
import com.igreen.boss.service.lawRisk.ExecutedItemService;
import com.igreen.common.model.ExecutedItem;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/lawRisk")
public class ExecutedItemController extends BaseController {

	@Resource
	ExecutedItemService executedItemService;
	
	/**
	 * 跳转被执行人信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toExecutedItemList")
	public ModelAndView toExecutedItemList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("lawRisk/executedItem.jsp",model);
	}
	
	
	/**
	 * 添加/修改被执行人信息
	 * @param executedItem
	 * @return
	 */
	@RequestMapping(value="addExecutedItem", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addExecutedItem(ExecutedItem executedItem,HttpServletRequest request,HttpServletResponse response){
		return executedItemService.addExecutedItem(executedItem, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询被执行人信息
	 * @param executedItemId
	 * @return
	 */
	@RequestMapping(value="getOneExecutedItem", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody ExecutedItem getOneExecutedItem(Integer executedItemId){
		return executedItemService.getOneExecutedItem(executedItemId);
	}
	
	/**
	 * 查询被执行人信息列表
	 * @param executedItem
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="executedItemIdList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange executedItemIdList(ExecutedItem executedItem,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return executedItemService.executedItemIdList(executedItem,currentPage,pageRows);
	}
}
