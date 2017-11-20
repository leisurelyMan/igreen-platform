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
import com.igreen.boss.service.intellectual.SoftwareCopyrightService;
import com.igreen.common.model.SoftwareCopyright;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/intellectual")
public class SoftwareCopyrightController extends BaseController{

	@Resource
	SoftwareCopyrightService softwareCopyrightService;
	
	/**
	 * 跳转软件著作权信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toSoftwareCopyrightList")
	public ModelAndView toSoftwareCopyrightList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("intellectual/softwareCopyright.jsp",model);
	}
	
	
	/**
	 * 添加/修改软件著作权信息
	 * @param softwareCopyright
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addSoftwareCopyright", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addSoftwareCopyright(SoftwareCopyright softwareCopyright,HttpServletRequest request,HttpServletResponse response){
		return softwareCopyrightService.addSoftwareCopyright(softwareCopyright, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询软件著作权信息
	 * @param softwareCopyrightId
	 * @return
	 */
	@RequestMapping(value="getOneSoftwareCopyright", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody SoftwareCopyright getOneSoftwareCopyright(Integer softwareCopyrightId){
		return softwareCopyrightService.getOneSoftwareCopyright(softwareCopyrightId);
	}
	
	/**
	 * 查询软件著作权信息列表
	 * @param softwareCopyright
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="softwareCopyrightList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange softwareCopyrightList(SoftwareCopyright softwareCopyright,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return softwareCopyrightService.softwareCopyrightList(softwareCopyright,currentPage,pageRows);
	}
}
