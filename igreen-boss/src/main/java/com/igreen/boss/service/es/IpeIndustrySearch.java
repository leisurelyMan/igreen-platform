package com.igreen.boss.service.es;

import com.igreen.common.util.ListRange;

public interface IpeIndustrySearch {

	ListRange ipeIndustryList(String words, Integer currentPage, Integer pageRows)throws Exception;
	
	void bulkAdd()throws Exception;
}
