package com.igreen.boss.service.impl.ipe;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.ipe.IndustryService;
import com.igreen.common.dao.IpeIndustryRecordMapper;
import com.igreen.common.dto.IpeIndustryDto;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class IndustryServiceImpl implements IndustryService {
	
	@Resource
	IpeIndustryRecordMapper ipeIndustryRecordMapper;

	@Override
	public ListRange industryList(IpeIndustryDto industry, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(industry.getCompanyName()))
			params.put("companyName", industry.getCompanyName());
		if(!StrUtil.isNull(industry.getYear()))
			params.put("year", industry.getYear());
		if(!StrUtil.isNull(industry.getTitle()))
			params.put("title", industry.getTitle());
		if(!StrUtil.isNull(industry.getAddress()))
			params.put("address", industry.getAddress());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(ipeIndustryRecordMapper.pageIpeIndustryDto(params), ipeIndustryRecordMapper.countIpeIndustryDto(params), currentPage, pageRows);
		return result;
	}

}
