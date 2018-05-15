package com.igreen.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igreen.web.view.IgreenSearch;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.web.service.IndexService;
import com.igreen.web.util.Result;
import com.igreen.web.view.Igreen;
import com.igreen.web.view.SearchCompanyInfo;

@Controller
@RequestMapping(value="/index")
public class IndexController {
	
	@Resource
	IndexService indexService;
	
	/**
	 * 跳转到
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="search")
	public ModelAndView search(HttpServletRequest request,HttpServletResponse response, ModelMap model,String companyName){
		Igreen igreen = indexService.search(companyName);
		model.addAttribute("igreen", igreen);
		return new ModelAndView("search-result.jsp",model);
	}
	
	/**
	 * 通过公司搜索功能
	 * @param model
	 * @param companyName
	 * @return
	 */
	@RequestMapping(value="searchCompany")
	@ResponseBody
	public ModelAndView searchCompany(ModelMap model,String companyName) {
		if(companyName != null){
			SearchCompanyInfo searchInfo = indexService.searchCompany(companyName);
			model.addAttribute("searchInfo", searchInfo);
			return new ModelAndView("searchcompany-result.jsp",model);
		}
		return null;
	}
	
	
	
	@RequestMapping(value="getmap")
	@ResponseBody
	public Result getmap(HttpServletRequest request,HttpServletResponse response,@RequestParam String type) {
		List<String> regions = indexService.getRegation(type);
		return new Result(200, "获取成功", regions);
	}
	
	@RequestMapping(value="getmap2")
	@ResponseBody
	public Result getmap2(HttpServletRequest request,HttpServletResponse response, String provice, String city) {
		try {
			provice = new String(provice.getBytes("ISO-8859-1"),"UTF-8");
			city = new String(city.getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return indexService.getRegation2(provice, city);
	}
	
	@RequestMapping(value="getAllProvincesData")
	@ResponseBody
	public Result getAllProvincesData(HttpServletRequest request,HttpServletResponse response) {
		return indexService.getAllProvinceMapDate();
	}

	/**
	 * 跳转到
	 * @param model
	 * @return
	 */
	@RequestMapping(value="searchNew")
	public ModelAndView searchNew(ModelMap model,String companyName){
		IgreenSearch igreen = indexService.searchNew(companyName);
		model.addAttribute("igreen", igreen);
		return new ModelAndView("search-result_new.jsp",model);
	}
	
}
