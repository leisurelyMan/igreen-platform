package com.igreen.boss.controller.excel;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.excel.EnvironmentalPollutionLiabilityInsuranceService;
import com.igreen.common.model.ExcelEnvironmentalPollutionLiabilityInsurance;
import com.igreen.common.util.ListRange;

@Controller
@RequestMapping(value="/environmentalPollutionLiabilityInsurance")
public class EnvironmentalPollutionLiabilityInsuranceController  extends BaseController{

	@Resource
	EnvironmentalPollutionLiabilityInsuranceService insuranceService;
	
	/**
	 * 跳转主要人员信息列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toHtml")
	public ModelAndView toEmployeeList(ModelMap model){
		return new ModelAndView("excel/environmentalPollutionLiabilityInsurance.html",model);
	}
	
	
	/**
	 * 查询主要人员信息列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="list", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange excelEnergyEfficiencyLabelList(ExcelEnvironmentalPollutionLiabilityInsurance record,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return insuranceService.list(record,currentPage,pageRows);
	}
}
