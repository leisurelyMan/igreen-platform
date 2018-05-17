package com.igreen.common.dao;

import com.igreen.common.model.ExcelGreatIndustrialEnergySupervision;
import com.igreen.common.model.ExcelGreatIndustrialEnergySupervisionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelGreatIndustrialEnergySupervisionMapper {
    int countByExample(ExcelGreatIndustrialEnergySupervisionExample example);

    int deleteByExample(ExcelGreatIndustrialEnergySupervisionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelGreatIndustrialEnergySupervision record);

    int insertSelective(ExcelGreatIndustrialEnergySupervision record);

    List<ExcelGreatIndustrialEnergySupervision> selectByExample(ExcelGreatIndustrialEnergySupervisionExample example);

    ExcelGreatIndustrialEnergySupervision selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExcelGreatIndustrialEnergySupervision record, @Param("example") ExcelGreatIndustrialEnergySupervisionExample example);

    int updateByExample(@Param("record") ExcelGreatIndustrialEnergySupervision record, @Param("example") ExcelGreatIndustrialEnergySupervisionExample example);

    int updateByPrimaryKeySelective(ExcelGreatIndustrialEnergySupervision record);

    int updateByPrimaryKey(ExcelGreatIndustrialEnergySupervision record);
}