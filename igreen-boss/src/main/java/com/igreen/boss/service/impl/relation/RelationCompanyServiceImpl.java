package com.igreen.boss.service.impl.relation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.relation.RelationCompanyService;
import com.igreen.common.dao.RelationCompanyMapper;
import com.igreen.common.model.RelationCompany;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class RelationCompanyServiceImpl implements RelationCompanyService{
	
	Logger log = Logger.getLogger(RelationCompanyServiceImpl.class);

	@Resource
	RelationCompanyMapper relationCompanyMapper;
	
	@Override
	public ResponseModel addRelationCompany(RelationCompany relationCompany, Integer userId) {
		try{
			if(StrUtil.isNull(relationCompany.getId())){
				relationCompany.setStatus(1);
				relationCompany.setCreater(userId);
				relationCompany.setCreatedTime(new Date());
				relationCompanyMapper.insertSelective(relationCompany);
			}
			else{
				relationCompany.setUpdater(userId);
				relationCompany.setUpdatedTime(new Date());
				relationCompanyMapper.updateByPrimaryKeySelective(relationCompany);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public RelationCompany getOneRelationCompany(Integer relationCompanyId) {
		return relationCompanyMapper.selectByPrimaryKey(relationCompanyId);
	}

	@Override
	public ListRange relationCompanyList(RelationCompany relationCompany, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(relationCompany.getRegistItemId()))
			params.put("registItemId", relationCompany.getRegistItemId()); 
		if(!StrUtil.isNull(relationCompany.getCompanyName()))
			params.put("companyName", relationCompany.getCompanyName()); 
		if(!StrUtil.isNull(relationCompany.getRegistNo()))
			params.put("registNo", relationCompany.getRegistNo());
		if(!StrUtil.isNull(relationCompany.getCompanyType()))
			params.put("companyType", relationCompany.getCompanyType());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(relationCompanyMapper.pageRelationCompany(params),
				relationCompanyMapper.countRelationCompany(params), currentPage, pageRows);
		return result;
	}

}
