package com.igreen.boss.controller.relation;

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
import com.igreen.boss.service.relation.InvestmentService;
import com.igreen.common.model.Investment;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/relation")
public class InvestmentController extends BaseController{

	@Resource
	InvestmentService investmentService;
	
	/**
	 * 跳转企业投资信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toInvestmentList")
	public ModelAndView toInvestmentList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("relation/investment.jsp",model);
	}
	
	/**
	 * 添加/修改企业投资信息
	 * @param investment
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addInvestment", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addInvestment(Investment investment,HttpServletRequest request,HttpServletResponse response){
		return investmentService.addInvestment(investment, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询企业投资信息
	 * @param investmentId
	 * @return
	 */
	@RequestMapping(value="getOneInvestment", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody Investment getOneInvestment(Integer investmentId){
		return investmentService.getOneInvestment(investmentId);
	}
	
	/**
	 * 查询企业投资信息列表
	 * @param branch
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="investmentList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange investmentList(Investment investment,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return investmentService.investmentList(investment,currentPage,pageRows);
	}
}
