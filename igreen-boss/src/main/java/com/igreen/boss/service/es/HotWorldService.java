package com.igreen.boss.service.es;

import java.util.List;

import com.igreen.common.model.HotWords;
import com.igreen.common.model.HotWordsExample;
import com.igreen.common.util.ListRange;

public interface HotWorldService {

    int countByExample(HotWordsExample example);

    int deleteByExample(HotWordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotWords record);

    int insertSelective(HotWords record);

    List<HotWords> selectByExample(HotWordsExample example);

    HotWords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(HotWords record, HotWordsExample example);

    int updateByExample(HotWords record, HotWordsExample example);

    int updateByPrimaryKeySelective(HotWords record);

    int updateByPrimaryKey(HotWords record);

	ListRange hotWorldList(HotWords hotWord, Integer currentPage, Integer pageRows);
}
