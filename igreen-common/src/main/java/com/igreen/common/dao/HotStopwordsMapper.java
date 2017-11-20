package com.igreen.common.dao;

import com.igreen.common.model.HotStopwords;
import com.igreen.common.model.HotStopwordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotStopwordsMapper {
    int countByExample(HotStopwordsExample example);

    int deleteByExample(HotStopwordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotStopwords record);

    int insertSelective(HotStopwords record);

    List<HotStopwords> selectByExample(HotStopwordsExample example);

    HotStopwords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotStopwords record, @Param("example") HotStopwordsExample example);

    int updateByExample(@Param("record") HotStopwords record, @Param("example") HotStopwordsExample example);

    int updateByPrimaryKeySelective(HotStopwords record);

    int updateByPrimaryKey(HotStopwords record);
}