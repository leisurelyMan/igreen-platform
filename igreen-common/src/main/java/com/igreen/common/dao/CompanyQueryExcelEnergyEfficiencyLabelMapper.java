package com.igreen.common.dao;

import com.igreen.common.model.CompanyQueryExcelEnergyEfficiencyLabel;
import com.igreen.common.model.CompanyQueryExcelEnergyEfficiencyLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyQueryExcelEnergyEfficiencyLabelMapper {
    int countByExample(CompanyQueryExcelEnergyEfficiencyLabelExample example);

    int deleteByExample(CompanyQueryExcelEnergyEfficiencyLabelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyQueryExcelEnergyEfficiencyLabel record);

    int insertSelective(CompanyQueryExcelEnergyEfficiencyLabel record);

    List<CompanyQueryExcelEnergyEfficiencyLabel> selectByExample(CompanyQueryExcelEnergyEfficiencyLabelExample example);

    CompanyQueryExcelEnergyEfficiencyLabel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyQueryExcelEnergyEfficiencyLabel record, @Param("example") CompanyQueryExcelEnergyEfficiencyLabelExample example);

    int updateByExample(@Param("record") CompanyQueryExcelEnergyEfficiencyLabel record, @Param("example") CompanyQueryExcelEnergyEfficiencyLabelExample example);

    int updateByPrimaryKeySelective(CompanyQueryExcelEnergyEfficiencyLabel record);

    int updateByPrimaryKey(CompanyQueryExcelEnergyEfficiencyLabel record);
}