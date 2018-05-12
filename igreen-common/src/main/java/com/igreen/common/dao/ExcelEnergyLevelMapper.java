package com.igreen.common.dao;

import com.igreen.common.model.ExcelEnergyLevel;
import com.igreen.common.model.ExcelEnergyLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelEnergyLevelMapper {
    int countByExample(ExcelEnergyLevelExample example);

    int deleteByExample(ExcelEnergyLevelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExcelEnergyLevel record);

    int insertSelective(ExcelEnergyLevel record);

    List<ExcelEnergyLevel> selectByExample(ExcelEnergyLevelExample example);

    ExcelEnergyLevel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExcelEnergyLevel record, @Param("example") ExcelEnergyLevelExample example);

    int updateByExample(@Param("record") ExcelEnergyLevel record, @Param("example") ExcelEnergyLevelExample example);

    int updateByPrimaryKeySelective(ExcelEnergyLevel record);

    int updateByPrimaryKey(ExcelEnergyLevel record);
}