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
import com.igreen.boss.service.relation.BranchService;
import com.igreen.common.model.Branch;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/relation")
public class BranchController extends BaseController {
	
	@Resource
	BranchService branchService;

	/**
	 * 跳转分支机构信息列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toBranchList")
	public ModelAndView toBranchList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("relation/branch.jsp",model);
	}
	
	/**
	 * 添加/修改分支机构信息
	 * @param branch
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addBranch", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addBranch(Branch branch,HttpServletRequest request,HttpServletResponse response){
		return branchService.addBranch(branch, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询分支机构信息
	 * @param branchId
	 * @return
	 */
	@RequestMapping(value="getOneBranch", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody Branch getOneBranch(Integer branchId){
		return branchService.getOneBranch(branchId);
	}
	
	/**
	 * 查询分支机构信息列表
	 * @param branch
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="branchList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange branchList(Branch branch,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return branchService.branchList(branch,currentPage,pageRows);
	}
}
