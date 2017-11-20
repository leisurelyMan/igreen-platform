package com.igreen.boss.service.impl.lawRisk;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.lawRisk.ExecutedItemService;
import com.igreen.common.dao.ExecutedItemMapper;
import com.igreen.common.model.ExecutedItem;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class ExecutedItemServiceImpl implements ExecutedItemService {
	
	Logger log = Logger.getLogger(ExecutedItemServiceImpl.class);
	
	@Resource
	ExecutedItemMapper executedItemMapper;

	@Override
	public ResponseModel addExecutedItem(ExecutedItem executedItem, Integer userId) {
		try{
			if(StrUtil.isNull(executedItem.getId())){
				executedItem.setStatus(1);
				executedItem.setCreater(userId);
				executedItem.setCreatedTime(new Date());
				executedItemMapper.insertSelective(executedItem);
			}
			else{
				executedItem.setUpdater(userId);
				executedItem.setUpdatedTime(new Date());
				executedItemMapper.updateByPrimaryKeySelective(executedItem);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public ExecutedItem getOneExecutedItem(Integer executedItemId) {
		return executedItemMapper.selectByPrimaryKey(executedItemId);
	}

	@Override
	public ListRange executedItemIdList(ExecutedItem executedItem, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(executedItem.getRegistItemId()))
			params.put("registItemId", executedItem.getRegistItemId()); 
		if(!StrUtil.isNull(executedItem.getCaseStatus()))
			params.put("caseStatus", executedItem.getCaseStatus());
		if(!StrUtil.isNull(executedItem.getCaseNo()))
			params.put("caseNo", executedItem.getCaseNo());
		if(!StrUtil.isNull(executedItem.getExecuteTarget()))
			params.put("executeTarget", executedItem.getExecuteTarget());
		if(!StrUtil.isNull(executedItem.getExecuteCourt()))
			params.put("executeCourt", executedItem.getExecuteCourt());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(executedItemMapper.pageExecutedItem(params), executedItemMapper.countExecutedItem(params), currentPage, pageRows);
		return result;
	}

}
