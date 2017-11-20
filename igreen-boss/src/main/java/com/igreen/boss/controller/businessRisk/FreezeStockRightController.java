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
import com.igreen.boss.service.businessRisk.FreezeStockRightService;
import com.igreen.common.model.FreezeStockRight;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/businessRisk")
public class FreezeStockRightController extends BaseController{

	@Resource
	FreezeStockRightService freezeStockRightService;
	
	/**
	 * 跳转股权冻结信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toFreezeStockRightList")
	public ModelAndView toFreezeStockRightList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("businessRisk/freezeStockRight.jsp",model);
	}
	
	/**
	 * 添加/修改股权冻结信息
	 * @param penalty
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addFreezeStockRight", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addFreezeStockRight(FreezeStockRight freezeStockRight,HttpServletRequest request,HttpServletResponse response){
		return freezeStockRightService.addFreezeStockRight(freezeStockRight, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询股权冻结信息
	 * @param penaltyId
	 * @return
	 */
	@RequestMapping(value="getOneFreezeStockRight", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody FreezeStockRight getOneFreezeStockRight(Integer freezeStockRightId){
		return freezeStockRightService.getOneFreezeStockRight(freezeStockRightId);
	}
	
	/**
	 * 查询股权冻结信息列表
	 * @param penalty
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="freezeStockRightList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange freezeStockRightList(FreezeStockRight freezeStockRight,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return freezeStockRightService.freezeStockRightList(freezeStockRight,currentPage,pageRows);
	}
}
