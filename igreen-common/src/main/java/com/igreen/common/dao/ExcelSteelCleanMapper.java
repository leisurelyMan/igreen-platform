package com.igreen.common.dao;

import com.igreen.common.model.ExcelSteelClean;
import com.igreen.common.model.ExcelSteelCleanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelSteelCleanMapper {
    int countByExample(ExcelSteelCleanExample example);

    int deleteByExample(ExcelSteelCleanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelSteelClean record);

    int insertSelective(ExcelSteelClean record);

    List<ExcelSteelClean> selectByExample(ExcelSteelCleanExample example);

    ExcelSteelClean selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExcelSteelClean record, @Param("example") ExcelSteelCleanExample example);

    int updateByExample(@Param("record") ExcelSteelClean record, @Param("example") ExcelSteelCleanExample example);

    int updateByPrimaryKeySelective(ExcelSteelClean record);

    int updateByPrimaryKey(ExcelSteelClean record);
}