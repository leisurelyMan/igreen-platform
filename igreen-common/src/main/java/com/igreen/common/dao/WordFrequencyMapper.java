package com.igreen.common.dao;

import com.igreen.common.model.WordFrequency;
import com.igreen.common.model.WordFrequencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WordFrequencyMapper {
	
    int countByExample(WordFrequencyExample example);

    int deleteByExample(WordFrequencyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WordFrequency record);

    int insertSelective(WordFrequency record);

    List<WordFrequency> selectByExample(WordFrequencyExample example);

    WordFrequency selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WordFrequency record, @Param("example") WordFrequencyExample example);

    int updateByExample(@Param("record") WordFrequency record, @Param("example") WordFrequencyExample example);

    int updateByPrimaryKeySelective(WordFrequency record);

    int updateByPrimaryKey(WordFrequency record);
}