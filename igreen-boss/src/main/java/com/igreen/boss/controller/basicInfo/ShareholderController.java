package com.igreen.boss.controller.basicInfo;

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
import com.igreen.boss.service.basicInfo.ShareholderService;
import com.igreen.common.model.Shareholder;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/basicInfo")
public class ShareholderController extends BaseController{

	@Resource
	ShareholderService shareholderService;
	
	/**
	 * 跳转股东及出资信息列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toShareholderList")
	public ModelAndView toRegistItemList(ModelMap model,Long id){
		System.out.println(id);
		model.addAttribute("id", id);
		return new ModelAndView("basicInfo/shareholder.jsp",model);
	}
	
	
	/**
	 * 添加/修改股东及出资信息
	 * @param shareholder
	 * @return
	 */
	@RequestMapping(value="addShareholder", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addShareholder(Shareholder shareholder,HttpServletRequest request,HttpServletResponse response){
		return shareholderService.addShareholder(shareholder, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询股东及出资信息
	 * @param shareholderId
	 * @return
	 */
	@RequestMapping(value="getOneShareholder", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody Shareholder getOneShareholder(Integer shareholderId){
		return shareholderService.getOneShareholder(shareholderId);
	}
	
	/**
	 * 查询股东及出资信息列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="shareholderList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange shareholderList(Shareholder shareholder,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return shareholderService.shareholderList(shareholder,currentPage,pageRows);
	}
}
