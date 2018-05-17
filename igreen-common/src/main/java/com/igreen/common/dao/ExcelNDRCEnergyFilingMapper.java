package com.igreen.common.dao;

import com.igreen.common.model.ExcelNDRCEnergyFiling;
import com.igreen.common.model.ExcelNDRCEnergyFilingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelNDRCEnergyFilingMapper {
    int countByExample(ExcelNDRCEnergyFilingExample example);

    int deleteByExample(ExcelNDRCEnergyFilingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelNDRCEnergyFiling record);

    int insertSelective(ExcelNDRCEnergyFiling record);

    List<ExcelNDRCEnergyFiling> selectByExample(ExcelNDRCEnergyFilingExample example);

    ExcelNDRCEnergyFiling selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExcelNDRCEnergyFiling record, @Param("example") ExcelNDRCEnergyFilingExample example);

    int updateByExample(@Param("record") ExcelNDRCEnergyFiling record, @Param("example") ExcelNDRCEnergyFilingExample example);

    int updateByPrimaryKeySelective(ExcelNDRCEnergyFiling record);

    int updateByPrimaryKey(ExcelNDRCEnergyFiling record);
}