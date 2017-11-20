package com.igreen.boss.service.impl.basicInfo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.basicInfo.RegistItemService;
import com.igreen.common.dao.RegistItemMapper;
import com.igreen.common.model.RegistItem;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class RegistItemServiceImpl implements RegistItemService {
	
	Logger log = Logger.getLogger(RegistItemServiceImpl.class);
	
	@Resource
	RegistItemMapper registItemMapper;

	@Override
	public ResponseModel addRegistItem(RegistItem registItem, Integer userId) {
		try{
			if(StrUtil.isNull(registItem.getId())){
				registItem.setStatus(1);
				registItem.setCreater(userId);
				registItem.setCreatedTime(new Date());
				registItemMapper.insertSelective(registItem);
			}
			else{
				registItem.setUpdater(userId);
				registItem.setUpdatedTime(new Date());
				registItemMapper.updateByPrimaryKeySelective(registItem);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public RegistItem getOneRegistItem(Integer registId) {
		return registItemMapper.selectByPrimaryKey(registId);
	}

	@Override
	public ListRange registItemList(RegistItem registItem, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(registItem.getId()))
			params.put("id", registItem.getId());
		if(!StrUtil.isNull(registItem.getCompanyName()))
			params.put("companyName", registItem.getCompanyName());
		if(!StrUtil.isNull(registItem.getRegistNumber()))
			params.put("registNumber", registItem.getRegistNumber());
		if(!StrUtil.isNull(registItem.getStatus()))
			params.put("status", registItem.getStatus());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(registItemMapper.pageRegistItem(params), registItemMapper.countRegistItem(params), currentPage, pageRows);
		return result;
	}

}
