package com.igreen.boss.service.impl.businessRisk;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.businessRisk.AdministrativePenaltyService;
import com.igreen.common.dao.AdministrativePenaltyMapper;
import com.igreen.common.model.AdministrativePenalty;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class AdministrativePenaltyServiceImpl implements AdministrativePenaltyService {
	
	Logger log = Logger.getLogger(AdministrativePenaltyServiceImpl.class);
	
	@Resource
	AdministrativePenaltyMapper administrativePenaltyMapper;

	@Override
	public ResponseModel addAdministrativePenalty(AdministrativePenalty penalty, Integer userId) {
		try{
			if(StrUtil.isNull(penalty.getId())){
				penalty.setStatus(1);
				penalty.setCreater(userId);
				penalty.setCreatedTime(new Date());
				administrativePenaltyMapper.insertSelective(penalty);
			}
			else{
				penalty.setUpdater(userId);
				penalty.setUpdatedTime(new Date());
				administrativePenaltyMapper.updateByPrimaryKeySelective(penalty);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public AdministrativePenalty getOneAdministrativePenalty(Integer penaltyId) {
		return administrativePenaltyMapper.selectByPrimaryKey(penaltyId);
	}

	@Override
	public ListRange administrativePenaltyList(AdministrativePenalty penalty, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(penalty.getRegistItemId()))
			params.put("registItemId", penalty.getRegistItemId()); 
		if(!StrUtil.isNull(penalty.getCrimeReason()))
			params.put("crimeReason", penalty.getCrimeReason());
		if(!StrUtil.isNull(penalty.getCaseType()))
			params.put("caseType", penalty.getCaseType());
		if(!StrUtil.isNull(penalty.getExecuteType()))
			params.put("executeType", penalty.getExecuteType());
		if(!StrUtil.isNull(penalty.getPunishOffice()))
			params.put("punishOffice", penalty.getPunishOffice());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(administrativePenaltyMapper.pageAdministrativePenalty(params), 
				administrativePenaltyMapper.countAdministrativePenalty(params), currentPage, pageRows);
		return result;
	}

}
