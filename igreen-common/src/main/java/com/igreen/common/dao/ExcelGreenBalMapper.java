package com.igreen.common.dao;

import com.igreen.common.model.ExcelGreenBal;
import com.igreen.common.model.ExcelGreenBalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelGreenBalMapper {
    int countByExample(ExcelGreenBalExample example);

    int deleteByExample(ExcelGreenBalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelGreenBal record);

    int insertSelective(ExcelGreenBal record);

    List<ExcelGreenBal> selectByExample(ExcelGreenBalExample example);

    ExcelGreenBal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExcelGreenBal record, @Param("example") ExcelGreenBalExample example);

    int updateByExample(@Param("record") ExcelGreenBal record, @Param("example") ExcelGreenBalExample example);

    int updateByPrimaryKeySelective(ExcelGreenBal record);

    int updateByPrimaryKey(ExcelGreenBal record);
}