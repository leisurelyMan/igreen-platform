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
import com.igreen.boss.service.businessRisk.PledgeStockRightService;
import com.igreen.common.model.PledgeStockRight;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/businessRisk")
public class PledgeStockRightController extends BaseController{
	
	@Resource
	PledgeStockRightService pledgeStockRightService;

	/**
	 * 跳转股权质押信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toPledgeStockRightList")
	public ModelAndView toPledgeStockRightList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("businessRisk/pledgeStockRight.jsp",model);
	}
	
	
	/**
	 * 添加/修改股权质押信息
	 * @param penalty
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addPledgeStockRight", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addPledgeStockRight(PledgeStockRight pledgeStockRight,HttpServletRequest request,HttpServletResponse response){
		return pledgeStockRightService.addPledgeStockRight(pledgeStockRight, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询股权质押信息
	 * @param penaltyId
	 * @return
	 */
	@RequestMapping(value="getOnePledgeStockRight", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody PledgeStockRight getOnePledgeStockRight(Integer pledgeStockRightId){
		return pledgeStockRightService.getOnePledgeStockRight(pledgeStockRightId);
	}
	
	/**
	 * 查询股权质押信息列表
	 * @param penalty
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="pledgeStockRightIdList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange pledgeStockRightIdList(PledgeStockRight pledgeStockRight,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return pledgeStockRightService.pledgeStockRightIdList(pledgeStockRight,currentPage,pageRows);
	}
}
