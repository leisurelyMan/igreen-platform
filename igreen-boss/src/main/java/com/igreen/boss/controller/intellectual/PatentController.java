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
import com.igreen.boss.service.intellectual.PatentService;
import com.igreen.common.model.Patent;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/intellectual")
public class PatentController extends BaseController{

	@Resource
	PatentService patentService;
	
	/**
	 * 跳转专利信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toPatentList")
	public ModelAndView toPatentList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("intellectual/patent.jsp",model);
	}
	
	/**
	 * 添加/修改专利信息
	 * @param investment
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addPatent", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addInvite(Patent patent,HttpServletRequest request,HttpServletResponse response){
		return patentService.addPatent(patent, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询专利信息
	 * @param patentId
	 * @return
	 */
	@RequestMapping(value="getOnePatent", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody Patent getOnePatent(Integer patentId){
		return patentService.getOnePatent(patentId);
	}
	
	/**
	 * 查询专利信息列表
	 * @param patent
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="patentList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange patentList(Patent patent,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return patentService.patentList(patent,currentPage,pageRows);
	}
}
