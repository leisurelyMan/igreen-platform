package com.igreen.boss.service.impl.businessRisk;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.businessRisk.FreezeStockRightService;
import com.igreen.common.dao.FreezeStockRightMapper;
import com.igreen.common.model.FreezeStockRight;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class FreezeStockRightServiceImpl implements FreezeStockRightService {
	
	Logger log = Logger.getLogger(FreezeStockRightServiceImpl.class);
	
	@Resource
	FreezeStockRightMapper freezeStockRightMapper;

	@Override
	public ResponseModel addFreezeStockRight(FreezeStockRight freezeStockRight, Integer userId) {
		try{
			if(StrUtil.isNull(freezeStockRight.getId())){
				freezeStockRight.setStatus(1);
				freezeStockRight.setCreater(userId);
				freezeStockRight.setCreatedTime(new Date());
				freezeStockRightMapper.insertSelective(freezeStockRight);
			}
			else{
				freezeStockRight.setUpdater(userId);
				freezeStockRight.setUpdatedTime(new Date());
				freezeStockRightMapper.updateByPrimaryKeySelective(freezeStockRight);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public FreezeStockRight getOneFreezeStockRight(Integer freezeStockRightId) {
		return freezeStockRightMapper.selectByPrimaryKey(freezeStockRightId);
	}

	@Override
	public ListRange freezeStockRightList(FreezeStockRight freezeStockRight, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(freezeStockRight.getRegistItemId()))
			params.put("registItemId", freezeStockRight.getRegistItemId()); 
		if(!StrUtil.isNull(freezeStockRight.getFreezeNo()))
			params.put("freezeNo", freezeStockRight.getFreezeNo());
		if(!StrUtil.isNull(freezeStockRight.getFreezeOffice()))
			params.put("freezeOffice", freezeStockRight.getFreezeOffice());
		if(!StrUtil.isNull(freezeStockRight.getUnfreezeNo()))
			params.put("unfreezeNo", freezeStockRight.getUnfreezeNo());
		if(!StrUtil.isNull(freezeStockRight.getUnfreezeOffice()))
			params.put("unfreezeOffice", freezeStockRight.getUnfreezeOffice());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(freezeStockRightMapper.pageFreezeStockRight(params), 
				freezeStockRightMapper.countFreezeStockRight(params), currentPage, pageRows);
		return result;
	}

}
