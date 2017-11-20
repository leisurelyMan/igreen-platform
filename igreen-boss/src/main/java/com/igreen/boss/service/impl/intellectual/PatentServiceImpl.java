package com.igreen.boss.service.impl.intellectual;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.intellectual.PatentService;
import com.igreen.common.dao.PatentMapper;
import com.igreen.common.model.Patent;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class PatentServiceImpl implements PatentService {
	
	Logger log = Logger.getLogger(PatentServiceImpl.class);
	
	@Resource
	PatentMapper patentMapper;

	@Override
	public ResponseModel addPatent(Patent patent, Integer userId) {
		try{
			if(StrUtil.isNull(patent.getId())){
				patent.setStatus(1);
				patent.setCreater(userId);
				patent.setCreatedTime(new Date());
				patentMapper.insertSelective(patent);
			}
			else{
				patent.setUpdater(userId);
				patent.setUpdatedTime(new Date());
				patentMapper.updateByPrimaryKeySelective(patent);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public Patent getOnePatent(Integer patentId) {
		return patentMapper.selectByPrimaryKey(patentId);
	}

	@Override
	public ListRange patentList(Patent patent, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(patent.getRegistItemId()))
			params.put("registItemId", patent.getRegistItemId()); 
		if(!StrUtil.isNull(patent.getPatentType()))
			params.put("patentType", patent.getPatentName()); 
		if(!StrUtil.isNull(patent.getPatentName()))
			params.put("patentName", patent.getPatentName());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(patentMapper.pagePatent(params),
				patentMapper.countPatent(params), currentPage, pageRows);
		return result;
	}

}
