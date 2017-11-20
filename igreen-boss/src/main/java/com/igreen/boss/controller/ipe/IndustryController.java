package com.igreen.boss.controller.ipe;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.ipe.IndustryService;
import com.igreen.common.model.IpeIndustryRecord;
import com.igreen.common.util.ListRange;

@Controller
@RequestMapping(value="/ipe")
public class IndustryController extends BaseController {

	@Resource
	IndustryService industryService;
	
	/**
	 * 跳转爬虫数据列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toIndustry")
	public ModelAndView toMepData(ModelMap model){
		return new ModelAndView("ipe/industry.jsp",model);
	}
	
	@RequestMapping(value="industryList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange reportList(IpeIndustryRecord industry,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return industryService.industryList(industry,currentPage,pageRows);
	}
}
