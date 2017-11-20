package com.igreen.boss.service.es;

import java.util.List;

import com.igreen.common.model.HotStopwords;
import com.igreen.common.model.HotStopwordsExample;
import com.igreen.common.util.ListRange;

public interface StopWorldService {

    int countByExample(HotStopwordsExample example);

    int deleteByExample(HotStopwordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotStopwords record);

    int insertSelective(HotStopwords record);

    List<HotStopwords> selectByExample(HotStopwordsExample example);

    HotStopwords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(HotStopwords record, HotStopwordsExample example);

    int updateByExample(HotStopwords record, HotStopwordsExample example);

    int updateByPrimaryKeySelective(HotStopwords record);

    int updateByPrimaryKey(HotStopwords record);

	ListRange stopWorldList(HotStopwords stopWorld, Integer currentPage, Integer pageRows);
}
