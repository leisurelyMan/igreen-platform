package com.igreen.common.dao;

import com.igreen.common.model.AiIpe;
import com.igreen.common.model.AiIpeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AiIpeMapper {
    int countByExample(AiIpeExample example);

    int deleteByExample(AiIpeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AiIpe record);

    int insertSelective(AiIpe record);

    List<AiIpe> selectByExample(AiIpeExample example);

    AiIpe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AiIpe record, @Param("example") AiIpeExample example);

    int updateByExample(@Param("record") AiIpe record, @Param("example") AiIpeExample example);

    int updateByPrimaryKeySelective(AiIpe record);

    int updateByPrimaryKey(AiIpe record);
}