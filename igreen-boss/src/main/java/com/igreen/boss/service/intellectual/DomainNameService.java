package com.igreen.boss.service.intellectual;

import com.igreen.common.model.DomainName;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface DomainNameService {

	/**
	 * 添加/修改域名信息
	 * @param domainName
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addDomainName(DomainName domainName, Integer id);

	/**
	 * 根据ID查询域名信息
	 * @param domainNameId
	 * @return
	 */
	DomainName getOneDomainName(Integer domainNameId);

	/**
	 * 查询域名信息列表
	 * @param domainName
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange domainNameList(DomainName domainName, Integer currentPage, Integer pageRows);

}
