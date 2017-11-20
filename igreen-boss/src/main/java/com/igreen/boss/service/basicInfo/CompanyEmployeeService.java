package com.igreen.boss.service.basicInfo;

import java.util.List;

import com.igreen.common.model.CompanyEmployee;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.SelectOption;

public interface CompanyEmployeeService {

	/**
	 * 添加/修改主要人员信息
	 * @param shareholder
	 * @return
	 */
	ResponseModel addEmployee(CompanyEmployee employee, Integer id);

	/**
	 * 根据ID查询主要人员信息
	 * @param shareholderId
	 * @return
	 */
	CompanyEmployee getOneEmployee(Integer employeeId);

	/**
	 * 查询主要人员信息列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange employeeList(CompanyEmployee employee, Integer currentPage, Integer pageRows);

	
	List<SelectOption> getEmployeeOption(Integer registItemId);

}
