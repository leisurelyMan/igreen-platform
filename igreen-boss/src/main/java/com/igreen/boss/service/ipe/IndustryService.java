package com.igreen.boss.service.ipe;

import com.igreen.common.model.IpeIndustryRecord;
import com.igreen.common.util.ListRange;

public interface IndustryService {

	ListRange industryList(IpeIndustryRecord industry, Integer currentPage, Integer pageRows);

}
