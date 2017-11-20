package com.igreen.boss.service.relation;

import com.igreen.common.model.Branch;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface BranchService {

	/**
	 * 添加/修改分支机构信息
	 * @param branch
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addBranch(Branch branch, Integer id);

	/**
	 * 根据ID查询分支机构信息
	 * @param branchId
	 * @return
	 */
	Branch getOneBranch(Integer branchId);

	/**
	 * 查询分支机构信息列表
	 * @param branch
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange branchList(Branch branch, Integer currentPage, Integer pageRows);

}
