package com.igreen.boss.service.impl.basicInfo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.basicInfo.OrganizationItemService;
import com.igreen.common.dao.OrganizationItemMapper;
import com.igreen.common.model.OrganizationItem;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class OrganizationItemServiceImpl implements OrganizationItemService {

	Logger log = Logger.getLogger(OrganizationItemServiceImpl.class);
	
	@Resource
	OrganizationItemMapper organizationItemMapper;
	
	@Override
	public ResponseModel addOrganizationItem(OrganizationItem organizationItem, Integer userId) {
		try{
			if(StrUtil.isNull(organizationItem.getId())){
				organizationItem.setStatus(1);
				organizationItem.setCreater(userId);
				organizationItem.setCreatedTime(new Date());
				organizationItemMapper.insertSelective(organizationItem);
			}
			else{
				organizationItem.setUpdater(userId);
				organizationItem.setUpdatedTime(new Date());
				organizationItemMapper.updateByPrimaryKeySelective(organizationItem);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public OrganizationItem getOneOrganizationItem(Integer organizationItemId) {
		return organizationItemMapper.selectByPrimaryKey(organizationItemId);
	}

	@Override
	public ListRange organizationItemList(OrganizationItem organizationItem, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(organizationItem.getRegistItemId()))
			params.put("registItemId", organizationItem.getRegistItemId()); 
		if(!StrUtil.isNull(organizationItem.getOrganizationCode()))
			params.put("organizationCode", organizationItem.getOrganizationCode());
		if(!StrUtil.isNull(organizationItem.getOrganizationName()))
			params.put("organizationName", organizationItem.getOrganizationName());
		if(!StrUtil.isNull(organizationItem.getOrganizationType()))
			params.put("organizationType", organizationItem.getOrganizationType());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(organizationItemMapper.pageOrganizationItem(params), organizationItemMapper.countOrganizationItem(params), currentPage, pageRows);
		return result;
	}

}
