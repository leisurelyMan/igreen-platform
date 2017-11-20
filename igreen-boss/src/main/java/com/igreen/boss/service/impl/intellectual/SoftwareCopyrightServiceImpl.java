package com.igreen.boss.service.impl.intellectual;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.intellectual.SoftwareCopyrightService;
import com.igreen.common.dao.SoftwareCopyrightMapper;
import com.igreen.common.model.SoftwareCopyright;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class SoftwareCopyrightServiceImpl implements SoftwareCopyrightService {
	
	Logger log = Logger.getLogger(SoftwareCopyrightServiceImpl.class);
	
	@Resource
	SoftwareCopyrightMapper softwareCopyrightMapper;

	@Override
	public ResponseModel addSoftwareCopyright(SoftwareCopyright softwareCopyright, Integer userId) {
		try{
			if(StrUtil.isNull(softwareCopyright.getId())){
				softwareCopyright.setStatus(1);
				softwareCopyright.setCreater(userId);
				softwareCopyright.setCreatedTime(new Date());
				softwareCopyrightMapper.insertSelective(softwareCopyright);
			}
			else{
				softwareCopyright.setUpdater(userId);
				softwareCopyright.setUpdatedTime(new Date());
				softwareCopyrightMapper.updateByPrimaryKeySelective(softwareCopyright);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public SoftwareCopyright getOneSoftwareCopyright(Integer softwareCopyrightId) {
		return softwareCopyrightMapper.selectByPrimaryKey(softwareCopyrightId);
	}

	@Override
	public ListRange softwareCopyrightList(SoftwareCopyright softwareCopyright, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(softwareCopyright.getRegistItemId()))
			params.put("registItemId", softwareCopyright.getRegistItemId()); 
		if(!StrUtil.isNull(softwareCopyright.getSoftwareShopName()))
			params.put("softwareShopName", softwareCopyright.getSoftwareShopName()); 
		if(!StrUtil.isNull(softwareCopyright.getClassifyNo()))
			params.put("classifyNo", softwareCopyright.getClassifyNo());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(softwareCopyrightMapper.pageSoftwareCopyright(params),
				softwareCopyrightMapper.countSoftwareCopyright(params), currentPage, pageRows);
		return result;
	}

}
