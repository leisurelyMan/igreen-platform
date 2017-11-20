package com.igreen.boss.service.impl.businessRisk;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.businessRisk.ThingChattelMortgageService;
import com.igreen.common.dao.ThingChattelMortgageMapper;
import com.igreen.common.model.ThingChattelMortgage;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class ThingChattelMortgageServiceImpl implements ThingChattelMortgageService {
	
	Logger log = Logger.getLogger(ThingChattelMortgageServiceImpl.class);
	
	@Resource
	ThingChattelMortgageMapper thingChattelMortgageMapper;

	@Override
	public ResponseModel addThingChattelMortgage(ThingChattelMortgage thingChattelMortgage, Integer userId) {
		try{
			if(StrUtil.isNull(thingChattelMortgage.getId())){
				thingChattelMortgage.setStatus(1);
				thingChattelMortgage.setCreater(userId);
				thingChattelMortgage.setCreatedTime(new Date());
				thingChattelMortgageMapper.insertSelective(thingChattelMortgage);
			}
			else{
				thingChattelMortgage.setUpdater(userId);
				thingChattelMortgage.setUpdatedTime(new Date());
				thingChattelMortgageMapper.updateByPrimaryKeySelective(thingChattelMortgage);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public ThingChattelMortgage getOneThingChattelMortgage(Integer thingChattelMortgageId) {
		return thingChattelMortgageMapper.selectByPrimaryKey(thingChattelMortgageId);
	}

	@Override
	public ListRange thingChattelMortgageList(ThingChattelMortgage thingChattelMortgage, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(thingChattelMortgage.getRegistItemId()))
			params.put("registItemId", thingChattelMortgage.getRegistItemId()); 
		if(!StrUtil.isNull(thingChattelMortgage.getMortgageId()))
			params.put("mortgageId", thingChattelMortgage.getMortgageId()); 
		if(!StrUtil.isNull(thingChattelMortgage.getThingName()))
			params.put("thingName", thingChattelMortgage.getThingName());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(thingChattelMortgageMapper.pageThingChattelMortgage(params), 
				thingChattelMortgageMapper.countThingChattelMortgage(params), currentPage, pageRows);
		return result;
	}

}
