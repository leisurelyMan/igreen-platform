package com.igreen.boss.service.es;

import java.util.List;

import com.igreen.common.model.WordFrequency;
import com.igreen.common.model.WordFrequencyExample;
import com.igreen.common.util.ListRange;

public interface WordFrequencyService {

    int countByExample(WordFrequencyExample example);

    int deleteByExample(WordFrequencyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WordFrequency record);

    int insertSelective(WordFrequency record);

    List<WordFrequency> selectByExample(WordFrequencyExample example);

    WordFrequency selectByPrimaryKey(Integer id);

    int updateByExampleSelective(WordFrequency record, WordFrequencyExample example);

    int updateByExample(WordFrequency record, WordFrequencyExample example);

    int updateByPrimaryKeySelective(WordFrequency record);

    int updateByPrimaryKey(WordFrequency record);
    
    int updateTimes(String word);

	ListRange wordFrequencyList(WordFrequency frequency, Integer currentPage, Integer pageRows);
}
