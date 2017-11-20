package com.igreen.boss.controller.basicInfo;

import java.util.List;

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
import com.igreen.boss.service.basicInfo.CompanyEmployeeService;
import com.igreen.common.model.CompanyEmployee;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.SelectOption;

@Controller
@RequestMapping(value="/basicInfo")
public class CompanyEmployeeController  extends BaseController{

	@Resource
	CompanyEmployeeService employeeService;
	
	/**
	 * 跳转主要人员信息列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toEmployeeList")
	public ModelAndView toEmployeeList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("basicInfo/employee.jsp",model);
	}
	
	
	/**
	 * 添加/修改主要人员信息
	 * @param shareholder
	 * @return
	 */
	@RequestMapping(value="addEmployee", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addEmployee(CompanyEmployee employee,HttpServletRequest request,HttpServletResponse response){
		return employeeService.addEmployee(employee, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询主要人员信息
	 * @param shareholderId
	 * @return
	 */
	@RequestMapping(value="getOneEmployee", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody CompanyEmployee getOneEmployee(Integer employeeId){
		return employeeService.getOneEmployee(employeeId);
	}
	
	/**
	 * 查询主要人员信息列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="employeeList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange employeeList(CompanyEmployee employee,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return employeeService.employeeList(employee,currentPage,pageRows);
	}
	
	
	@RequestMapping(value="getEmployeeOption", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody List<SelectOption> getEmployeeOption(Integer registItemId){
		return employeeService.getEmployeeOption(registItemId);
	}
}
