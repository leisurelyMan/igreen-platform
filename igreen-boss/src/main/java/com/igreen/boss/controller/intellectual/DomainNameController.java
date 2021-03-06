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
import com.igreen.boss.service.intellectual.DomainNameService;
import com.igreen.common.model.DomainName;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/intellectual")
public class DomainNameController extends BaseController{

	@Resource
	DomainNameService domainNameService;
	
	/**
	 * 跳转域名信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toDomainNameList")
	public ModelAndView toDomainNameList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("intellectual/domainName.jsp",model);
	}
	
	/**
	 * 添加/修改域名信息
	 * @param domainName
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addDomainName", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addDomainName(DomainName domainName,HttpServletRequest request,HttpServletResponse response){
		return domainNameService.addDomainName(domainName, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询域名信息
	 * @param domainNameId
	 * @return
	 */
	@RequestMapping(value="getOneDomainName", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody DomainName getOneDomainName(Integer domainNameId){
		return domainNameService.getOneDomainName(domainNameId);
	}
	
	/**
	 * 查询域名信息列表
	 * @param domainName
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="domainNameList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange domainNameList(DomainName domainName,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return domainNameService.domainNameList(domainName,currentPage,pageRows);
	}
}
