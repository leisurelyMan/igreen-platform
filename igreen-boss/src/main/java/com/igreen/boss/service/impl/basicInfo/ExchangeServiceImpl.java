package com.igreen.boss.service.impl.basicInfo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.basicInfo.ExchangeService;
import com.igreen.common.dao.ExchangeMapper;
import com.igreen.common.model.Exchange;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class ExchangeServiceImpl implements ExchangeService {
	
	Logger log = Logger.getLogger(ExchangeServiceImpl.class);
	
	@Resource
	ExchangeMapper exchangeMapper;

	@Override
	public ResponseModel addExchange(Exchange exchange, Integer userId) {
		try{
			if(StrUtil.isNull(exchange.getId())){
				exchange.setStatus(1);
				exchange.setCreater(userId);
				exchange.setCreatedTime(new Date());
				exchangeMapper.insertSelective(exchange);
			}
			else{
				exchange.setUpdater(userId);
				exchange.setUpdatedTime(new Date());
				exchangeMapper.updateByPrimaryKeySelective(exchange);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public Exchange getOneExchange(Integer exchangeId) {
		return exchangeMapper.selectByPrimaryKey(exchangeId);
	}

	@Override
	public ListRange exchangeList(Exchange exchange, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(exchange.getRegistItemId()))
			params.put("registItemId", exchange.getRegistItemId()); 
		if(!StrUtil.isNull(exchange.getExchangeItem()))
			params.put("exchangeItem", exchange.getExchangeItem());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(exchangeMapper.pageExchange(params), exchangeMapper.countExchange(params), currentPage, pageRows);
		return result;
	}

}
