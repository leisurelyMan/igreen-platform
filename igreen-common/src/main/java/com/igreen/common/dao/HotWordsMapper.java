package com.igreen.common.dao;

import com.igreen.common.model.HotWords;
import com.igreen.common.model.HotWordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotWordsMapper {
    int countByExample(HotWordsExample example);

    int deleteByExample(HotWordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotWords record);

    int insertSelective(HotWords record);

    List<HotWords> selectByExample(HotWordsExample example);

    HotWords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotWords record, @Param("example") HotWordsExample example);

    int updateByExample(@Param("record") HotWords record, @Param("example") HotWordsExample example);

    int updateByPrimaryKeySelective(HotWords record);

    int updateByPrimaryKey(HotWords record);
}