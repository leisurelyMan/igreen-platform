package com.igreen.boss.controller.relation;

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
import com.igreen.boss.service.relation.RelationCompanyService;
import com.igreen.common.model.RelationCompany;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/relation")
public class RelationCompanyController extends BaseController{

	@Resource
	RelationCompanyService relationCompanyService;
	
	/**
	 * 跳转关联企业信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toRelationCompanyList")
	public ModelAndView toRelationCompanyList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("relation/relationCompany.jsp",model);
	}
	
	/**
	 * 添加/修改关联企业信息
	 * @param investment
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addRelationCompany", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addRelationCompany(RelationCompany relationCompany,HttpServletRequest request,HttpServletResponse response){
		return relationCompanyService.addRelationCompany(relationCompany, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询关联企业信息
	 * @param investmentId
	 * @return
	 */
	@RequestMapping(value="getOneRelationCompany", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody RelationCompany getOneRelationCompany(Integer relationCompanyId){
		return relationCompanyService.getOneRelationCompany(relationCompanyId);
	}
	
	/**
	 * 查询关联企业信息列表
	 * @param relationCompany
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="relationCompanyList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange relationCompanyList(RelationCompany relationCompany,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return relationCompanyService.relationCompanyList(relationCompany,currentPage,pageRows);
	}
}
