package com.igreen.boss.controller.excel;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.excel.ExcelEnergyEfficiencyLabelService;
import com.igreen.common.model.ExcelEnergyEfficiencyLabel;
import com.igreen.common.util.ListRange;

@Controller
@RequestMapping(value="/excelEnergyEfficiencyLabel")
public class ExcelEnergyEfficiencyLabelController extends BaseController{

	@Resource
	ExcelEnergyEfficiencyLabelService energyEfficiencyLabelService;
	
	/**
	 * 跳转主要人员信息列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toExcelEnergyEfficiencyLabelList")
	public ModelAndView toEmployeeList(ModelMap model){
		return new ModelAndView("excel/energyEfficiencyLabel.html",model);
	}
	
	
	/**
	 * 查询主要人员信息列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="energyEfficiencyLabelList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange excelEnergyEfficiencyLabelList(ExcelEnergyEfficiencyLabel label,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return energyEfficiencyLabelService.excelEnergyEfficiencyLabelList(label,currentPage,pageRows);
	}
}
