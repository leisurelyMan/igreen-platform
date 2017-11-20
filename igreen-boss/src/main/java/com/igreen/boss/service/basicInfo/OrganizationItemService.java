package com.igreen.boss.service.basicInfo;

import com.igreen.common.model.OrganizationItem;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface OrganizationItemService {

	ResponseModel addOrganizationItem(OrganizationItem organizationItem, Integer id);

	OrganizationItem getOneOrganizationItem(Integer organizationItemId);

	ListRange organizationItemList(OrganizationItem organizationItem, Integer currentPage, Integer pageRows);

}
