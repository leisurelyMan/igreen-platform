package com.igreen.boss.service.es;

import com.igreen.boss.dto.IpeSearchDto;
import com.igreen.common.util.ListRange;

public interface IpeIndustrySearch {

	ListRange ipeIndustryList(IpeSearchDto dto, Integer currentPage, Integer pageRows)throws Exception;
	
	void bulkAdd()throws Exception;
	
	public void addAnalyze(Integer startId,Integer endId)throws Exception;
}
