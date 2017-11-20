package com.igreen.boss.service.impl.intellectual;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.intellectual.CopyrightService;
import com.igreen.common.dao.CopyrightMapper;
import com.igreen.common.model.Copyright;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class CopyrightServiceImpl implements CopyrightService {
	
	Logger log = Logger.getLogger(CopyrightServiceImpl.class);

	@Resource
	CopyrightMapper copyrightMapper;
	
	@Override
	public ResponseModel addCopyright(Copyright copyright, Integer userId) {
		try{
			if(StrUtil.isNull(copyright.getId())){
				copyright.setStatus(1);
				copyright.setCreater(userId);
				copyright.setCreatedTime(new Date());
				copyrightMapper.insertSelective(copyright);
			}
			else{
				copyright.setUpdater(userId);
				copyright.setUpdatedTime(new Date());
				copyrightMapper.updateByPrimaryKeySelective(copyright);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public Copyright getOneCopyright(Integer copyrightId) {
		return copyrightMapper.selectByPrimaryKey(copyrightId);
	}

	@Override
	public ListRange copyrightList(Copyright copyright, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(copyright.getRegistItemId()))
			params.put("registItemId", copyright.getRegistItemId()); 
		if(!StrUtil.isNull(copyright.getProductionName()))
			params.put("productionName", copyright.getProductionName()); 
		if(!StrUtil.isNull(copyright.getProductionType()))
			params.put("productionType", copyright.getProductionType());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(copyrightMapper.pageCopyright(params),
				copyrightMapper.countCopyright(params), currentPage, pageRows);
		return result;
	}

}
