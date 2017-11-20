package com.igreen.boss.service.impl.intellectual;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.intellectual.DomainNameService;
import com.igreen.common.dao.DomainNameMapper;
import com.igreen.common.model.DomainName;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class DomainNameServiceImpl implements DomainNameService {
	
	Logger log = Logger.getLogger(DomainNameServiceImpl.class);
	
	@Resource
	DomainNameMapper domainNameMapper;

	@Override
	public ResponseModel addDomainName(DomainName domainName, Integer userId) {
		try{
			if(StrUtil.isNull(domainName.getId())){
				domainName.setStatus(1);
				domainName.setCreater(userId);
				domainName.setCreatedTime(new Date());
				domainNameMapper.insertSelective(domainName);
			}
			else{
				domainName.setUpdater(userId);
				domainName.setUpdatedTime(new Date());
				domainNameMapper.updateByPrimaryKeySelective(domainName);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public DomainName getOneDomainName(Integer domainNameId) {
		return domainNameMapper.selectByPrimaryKey(domainNameId);
	}

	@Override
	public ListRange domainNameList(DomainName domainName, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(domainName.getRegistItemId()))
			params.put("registItemId", domainName.getRegistItemId()); 
		if(!StrUtil.isNull(domainName.getLocation()))
			params.put("location", domainName.getLocation()); 
		if(!StrUtil.isNull(domainName.getLocationName()))
			params.put("locationName", domainName.getLocationName());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(domainNameMapper.pageDomainName(params),
				domainNameMapper.countDomainName(params), currentPage, pageRows);
		return result;
	}

}
