package com.igreen.boss.service.impl.businessRisk;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.businessRisk.ChattelMortgageService;
import com.igreen.common.dao.ChattelMortgageMapper;
import com.igreen.common.model.ChattelMortgage;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class ChattelMortgageServiceImpl implements ChattelMortgageService {
	
	Logger log = Logger.getLogger(ChattelMortgageServiceImpl.class);
	
	@Resource
	ChattelMortgageMapper chattelMortgageMapper;

	@Override
	public ResponseModel addChattelMortgage(ChattelMortgage chattelMortgage, Integer userId) {
		try{
			if(StrUtil.isNull(chattelMortgage.getId())){
				chattelMortgage.setStatus(1);
				chattelMortgage.setCreater(userId);
				chattelMortgage.setCreatedTime(new Date());
				chattelMortgageMapper.insertSelective(chattelMortgage);
			}
			else{
				chattelMortgage.setUpdater(userId);
				chattelMortgage.setUpdatedTime(new Date());
				chattelMortgageMapper.updateByPrimaryKeySelective(chattelMortgage);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public ChattelMortgage getOneChattelMortgage(Integer chattelMortgageId) {
		return chattelMortgageMapper.selectByPrimaryKey(chattelMortgageId);
	}

	@Override
	public ListRange chattelMortgageList(ChattelMortgage chattelMortgage, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(chattelMortgage.getRegistItemId()))
			params.put("registItemId", chattelMortgage.getRegistItemId()); 
		if(!StrUtil.isNull(chattelMortgage.getMortgagee()))
			params.put("mortgagee", chattelMortgage.getMortgagee());
		if(!StrUtil.isNull(chattelMortgage.getPledgee()))
			params.put("pledgee", chattelMortgage.getPledgee());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(chattelMortgageMapper.pageChattelMortgage(params), 
				chattelMortgageMapper.countChattelMortgage(params), currentPage, pageRows);
		return result;
	}

}
