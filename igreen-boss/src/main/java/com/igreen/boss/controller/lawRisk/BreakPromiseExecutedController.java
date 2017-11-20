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
import com.igreen.boss.service.lawRisk.BreakPromiseExecutedService;
import com.igreen.common.model.BreakPromiseExecuted;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/lawRisk")
public class BreakPromiseExecutedController extends BaseController {

	@Resource
	BreakPromiseExecutedService breakPromiseExecutedService;
	
	/**
	 * 跳转失信被执行人信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toBreakPromiseExecutedList")
	public ModelAndView toBreakPromiseExecutedList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("lawRisk/breakPromiseExecuted.jsp",model);
	}
	
	
	/**
	 * 添加/修改失信被执行人信息
	 * @param breakPromiseExecuted
	 * @return
	 */
	@RequestMapping(value="addBreakPromiseExecuted", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addBreakPromiseExecuted(BreakPromiseExecuted breakPromiseExecuted,HttpServletRequest request,HttpServletResponse response){
		return breakPromiseExecutedService.addBreakPromiseExecuted(breakPromiseExecuted, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询失信被执行人信息
	 * @param breakPromiseId
	 * @return
	 */
	@RequestMapping(value="getOneBreakPromiseExecuted", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody BreakPromiseExecuted getOneBreakPromiseExecuted(Integer breakPromiseId){
		return breakPromiseExecutedService.getOneBreakPromiseExecuted(breakPromiseId);
	}
	
	/**
	 * 查询失信被执行人信息列表
	 * @param breakPromiseExecuted
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="breakPromiseExecutedList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange breakPromiseExecutedList(BreakPromiseExecuted breakPromiseExecuted,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return breakPromiseExecutedService.breakPromiseExecutedList(breakPromiseExecuted,currentPage,pageRows);
	}
}
