package com.igreen.boss.service.impl.basicInfo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.basicInfo.ShareholderService;
import com.igreen.common.dao.ShareholderMapper;
import com.igreen.common.model.Shareholder;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class ShareholderServiceImpl implements ShareholderService {
	
	Logger log = Logger.getLogger(ShareholderServiceImpl.class);
	
	@Resource
	ShareholderMapper shareholderMapper;

	@Override
	public ResponseModel addShareholder(Shareholder shareholder, Integer userId) {
		try{
			if(StrUtil.isNull(shareholder.getId())){
				shareholder.setStatus(1);
				shareholder.setCreater(userId);
				shareholder.setCreatedTime(new Date());
				shareholderMapper.insertSelective(shareholder);
			}
			else{
				shareholder.setUpdater(userId);
				shareholder.setUpdatedTime(new Date());
				shareholderMapper.updateByPrimaryKeySelective(shareholder);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public Shareholder getOneShareholder(Integer shareholderId) {
		return shareholderMapper.selectByPrimaryKey(shareholderId);
	}

	@Override
	public ListRange shareholderList(Shareholder shareholder, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(shareholder.getRegistItemId()))
			params.put("registItemId", shareholder.getRegistItemId()); 
		if(!StrUtil.isNull(shareholder.getShareholderName()))
			params.put("companyName", shareholder.getShareholderName());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(shareholderMapper.pageShareholder(params), shareholderMapper.countShareholder(params), currentPage, pageRows);
		return result;
	}

}
