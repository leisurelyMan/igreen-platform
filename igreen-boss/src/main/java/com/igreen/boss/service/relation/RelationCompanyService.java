package com.igreen.boss.service.relation;

import com.igreen.common.model.RelationCompany;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface RelationCompanyService {

	/**
	 * 添加/修改关联企业信息
	 * @param relationCompany
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addRelationCompany(RelationCompany relationCompany, Integer id);

	/**
	 * 根据ID查询关联企业信息
	 * @param relationCompanyId
	 * @return
	 */
	RelationCompany getOneRelationCompany(Integer relationCompanyId);

	/**
	 * 查询关联企业信息列表
	 * @param relationCompany
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange relationCompanyList(RelationCompany relationCompany, Integer currentPage, Integer pageRows);

}
