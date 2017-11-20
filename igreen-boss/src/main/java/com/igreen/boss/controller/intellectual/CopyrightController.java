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
import com.igreen.boss.service.intellectual.CopyrightService;
import com.igreen.common.model.Copyright;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/intellectual")
public class CopyrightController extends BaseController{

	@Resource
	CopyrightService copyrightService;
	
	/**
	 * 跳转著作权信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toCopyrightList")
	public ModelAndView toCopyrightList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("intellectual/copyright.jsp",model);
	}
	
	/**
	 * 添加/修改著作权信息
	 * @param copyright
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addCopyright", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addCopyright(Copyright copyright,HttpServletRequest request,HttpServletResponse response){
		return copyrightService.addCopyright(copyright, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询著作权信息
	 * @param copyrightId
	 * @return
	 */
	@RequestMapping(value="getOneCopyright", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody Copyright getOneCopyright(Integer copyrightId){
		return copyrightService.getOneCopyright(copyrightId);
	}
	
	/**
	 * 查询著作权信息列表
	 * @param copyright
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="copyrightList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange copyrightList(Copyright copyright,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return copyrightService.copyrightList(copyright,currentPage,pageRows);
	}
}
