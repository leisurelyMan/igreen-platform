package com.igreen.common.dao;

import com.igreen.common.model.ExcelEnergyEfficiencyLabel;
import com.igreen.common.model.ExcelEnergyEfficiencyLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelEnergyEfficiencyLabelMapper {
    int countByExample(ExcelEnergyEfficiencyLabelExample example);

    int deleteByExample(ExcelEnergyEfficiencyLabelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExcelEnergyEfficiencyLabel record);

    int insertSelective(ExcelEnergyEfficiencyLabel record);

    List<ExcelEnergyEfficiencyLabel> selectByExample(ExcelEnergyEfficiencyLabelExample example);

    ExcelEnergyEfficiencyLabel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExcelEnergyEfficiencyLabel record, @Param("example") ExcelEnergyEfficiencyLabelExample example);

    int updateByExample(@Param("record") ExcelEnergyEfficiencyLabel record, @Param("example") ExcelEnergyEfficiencyLabelExample example);

    int updateByPrimaryKeySelective(ExcelEnergyEfficiencyLabel record);

    int updateByPrimaryKey(ExcelEnergyEfficiencyLabel record);
}