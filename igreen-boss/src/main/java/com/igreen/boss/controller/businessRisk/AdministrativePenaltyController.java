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
import com.igreen.boss.service.businessRisk.AdministrativePenaltyService;
import com.igreen.common.model.AdministrativePenalty;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/businessRisk")
public class AdministrativePenaltyController extends BaseController{

	@Resource
	AdministrativePenaltyService administrativePenaltyService;
	
	/**
	 * 跳转行政处罚信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toAdministrativePenaltyList")
	public ModelAndView toAdministrativePenaltyList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("businessRisk/administrativePenalty.jsp",model);
	}
	
	
	/**
	 * 添加/修改行政处罚信息
	 * @param penalty
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addAdministrativePenalty", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addCourtNotice(AdministrativePenalty penalty,HttpServletRequest request,HttpServletResponse response){
		return administrativePenaltyService.addAdministrativePenalty(penalty, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询行政处罚信息
	 * @param penaltyId
	 * @return
	 */
	@RequestMapping(value="getOneAdministrativePenalty", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody AdministrativePenalty getOneAdministrativePenalty(Integer penaltyId){
		return administrativePenaltyService.getOneAdministrativePenalty(penaltyId);
	}
	
	/**
	 * 查询行政处罚信息列表
	 * @param penalty
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="administrativePenaltyList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange administrativePenaltyList(AdministrativePenalty penalty,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return administrativePenaltyService.administrativePenaltyList(penalty,currentPage,pageRows);
	}
	
}
