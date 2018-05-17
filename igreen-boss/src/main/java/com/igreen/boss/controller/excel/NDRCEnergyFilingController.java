package com.igreen.boss.controller.excel;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.service.excel.NDRCEnergyFilingService;
import com.igreen.common.model.ExcelNDRCEnergyFiling;
import com.igreen.common.util.ListRange;

@Controller
@RequestMapping(value="/ndrcEnergyFiling")
public class NDRCEnergyFilingController {

	
	@Resource
	NDRCEnergyFilingService ndrcEnergyFilingService;
	
	/**
	 * 跳转列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toHtml")
	public ModelAndView toEmployeeList(ModelMap model){
		return new ModelAndView("excel/ndrcEnergyFiling.html",model);
	}
	
	
	/**
	 * 查询信息列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="list", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange list(ExcelNDRCEnergyFiling record,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return ndrcEnergyFilingService.list(record,currentPage,pageRows);
	}
}
