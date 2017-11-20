package com.igreen.boss.service.impl.businessRisk;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.businessRisk.PledgeStockRightService;
import com.igreen.common.dao.PledgeStockRightMapper;
import com.igreen.common.model.PledgeStockRight;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class PledgeStockRightServiceImpl implements PledgeStockRightService {
	
	Logger log = Logger.getLogger(PledgeStockRightServiceImpl.class);

	@Resource
	PledgeStockRightMapper pledgeStockRightMapper;
	
	@Override
	public ResponseModel addPledgeStockRight(PledgeStockRight pledgeStockRight, Integer userId) {
		try{
			if(StrUtil.isNull(pledgeStockRight.getId())){
				pledgeStockRight.setStatus(1);
				pledgeStockRight.setCreater(userId);
				pledgeStockRight.setCreatedTime(new Date());
				pledgeStockRightMapper.insertSelective(pledgeStockRight);
			}
			else{
				pledgeStockRight.setUpdater(userId);
				pledgeStockRight.setUpdatedTime(new Date());
				pledgeStockRightMapper.updateByPrimaryKeySelective(pledgeStockRight);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public PledgeStockRight getOnePledgeStockRight(Integer pledgeStockRightId) {
		return pledgeStockRightMapper.selectByPrimaryKey(pledgeStockRightId);
	}

	@Override
	public ListRange pledgeStockRightIdList(PledgeStockRight pledgeStockRight, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(pledgeStockRight.getRegistItemId()))
			params.put("registItemId", pledgeStockRight.getRegistItemId()); 
		if(!StrUtil.isNull(pledgeStockRight.getPledgee()))
			params.put("pledgee", pledgeStockRight.getPledgee());
		if(!StrUtil.isNull(pledgeStockRight.getPledgeeType()))
			params.put("pledgeeType", pledgeStockRight.getPledgeeType());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(pledgeStockRightMapper.pagePledgeStockRight(params), 
				pledgeStockRightMapper.countPledgeStockRight(params), currentPage, pageRows);
		return result;
	}

}
