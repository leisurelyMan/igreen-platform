package com.igreen.common.dao;

import com.igreen.common.model.IpeAiResult;
import com.igreen.common.model.IpeAiResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpeAiResultMapper {
    int countByExample(IpeAiResultExample example);

    int deleteByExample(IpeAiResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IpeAiResult record);

    int insertSelective(IpeAiResult record);

    List<IpeAiResult> selectByExample(IpeAiResultExample example);

    IpeAiResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IpeAiResult record, @Param("example") IpeAiResultExample example);

    int updateByExample(@Param("record") IpeAiResult record, @Param("example") IpeAiResultExample example);

    int updateByPrimaryKeySelective(IpeAiResult record);

    int updateByPrimaryKey(IpeAiResult record);
}