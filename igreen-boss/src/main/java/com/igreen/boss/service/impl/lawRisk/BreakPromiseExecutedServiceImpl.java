package com.igreen.boss.service.impl.lawRisk;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.lawRisk.BreakPromiseExecutedService;
import com.igreen.common.dao.BreakPromiseExecutedMapper;
import com.igreen.common.model.BreakPromiseExecuted;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class BreakPromiseExecutedServiceImpl implements BreakPromiseExecutedService {

	Logger log = Logger.getLogger(BreakPromiseExecutedServiceImpl.class);
	
	@Resource
	BreakPromiseExecutedMapper breakPromiseExecutedMapper;
	
	@Override
	public ResponseModel addBreakPromiseExecuted(BreakPromiseExecuted breakPromiseExecuted, Integer userId) {
		try{
			if(StrUtil.isNull(breakPromiseExecuted.getId())){
				breakPromiseExecuted.setStatus(1);
				breakPromiseExecuted.setCreater(userId);
				breakPromiseExecuted.setCreatedTime(new Date());
				breakPromiseExecutedMapper.insertSelective(breakPromiseExecuted);
			}
			else{
				breakPromiseExecuted.setUpdater(userId);
				breakPromiseExecuted.setUpdatedTime(new Date());
				breakPromiseExecutedMapper.updateByPrimaryKeySelective(breakPromiseExecuted);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public BreakPromiseExecuted getOneBreakPromiseExecuted(Integer breakPromiseId) {
		return breakPromiseExecutedMapper.selectByPrimaryKey(breakPromiseId);
	}

	@Override
	public ListRange breakPromiseExecutedList(BreakPromiseExecuted breakPromiseExecuted, Integer currentPage,Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(breakPromiseExecuted.getRegistItemId()))
			params.put("registItemId", breakPromiseExecuted.getRegistItemId()); 
		if(!StrUtil.isNull(breakPromiseExecuted.getLegalPerson()))
			params.put("legalPerson", breakPromiseExecuted.getLegalPerson());
		if(!StrUtil.isNull(breakPromiseExecuted.getOrganizationNo()))
			params.put("organizationNo", breakPromiseExecuted.getOrganizationNo());
		if(!StrUtil.isNull(breakPromiseExecuted.getAccordingNo()))
			params.put("accordingNo", breakPromiseExecuted.getAccordingNo());
		if(!StrUtil.isNull(breakPromiseExecuted.getExecuteCourt()))
			params.put("executeCourt", breakPromiseExecuted.getExecuteCourt());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(breakPromiseExecutedMapper.pageBreakPromiseExecuted(params), 
				breakPromiseExecutedMapper.countBreakPromiseExecuted(params), currentPage, pageRows);
		return result;
	}

}
