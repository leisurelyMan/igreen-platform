package com.igreen.boss.controller.intellectual;

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
import com.igreen.boss.service.intellectual.BrandService;
import com.igreen.common.model.Brand;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/intellectual")
public class BrandController extends BaseController{

	@Resource
	BrandService brandService;
	
	/**
	 * 跳转商标信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toBrandList")
	public ModelAndView toBrandList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("intellectual/brand.jsp",model);
	}
	
	/**
	 * 添加/修改商标信息
	 * @param brand
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addBrand", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addBrand(Brand brand,HttpServletRequest request,HttpServletResponse response){
		return brandService.addBrand(brand, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询商标信息
	 * @param brandId
	 * @return
	 */
	@RequestMapping(value="getOneBrand", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody Brand getOneBrand(Integer brandId){
		return brandService.getOneBrand(brandId);
	}
	
	/**
	 * 查询商标信息列表
	 * @param brand
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="brandList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange brandList(Brand brand,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return brandService.brandList(brand,currentPage,pageRows);
	}
}
