package com.igreen.boss.service.ipe;

import com.igreen.common.dto.IpeIndustryDto;
import com.igreen.common.util.ListRange;

public interface IndustryService {

	ListRange industryList(IpeIndustryDto industry, Integer currentPage, Integer pageRows);

}
