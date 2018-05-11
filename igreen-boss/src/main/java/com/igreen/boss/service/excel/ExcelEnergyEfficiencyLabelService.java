package com.igreen.boss.service.excel;

import java.util.List;

import com.igreen.common.model.ExcelEnergyEfficiencyLabel;
import com.igreen.common.model.ExcelEnergyEfficiencyLabelExample;
import com.igreen.common.util.ListRange;

public interface ExcelEnergyEfficiencyLabelService {

    int countByExample(ExcelEnergyEfficiencyLabelExample example);

    int deleteByExample(ExcelEnergyEfficiencyLabelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExcelEnergyEfficiencyLabel record);

    int insertSelective(ExcelEnergyEfficiencyLabel record);

    List<ExcelEnergyEfficiencyLabel> selectByExample(ExcelEnergyEfficiencyLabelExample example);

    ExcelEnergyEfficiencyLabel selectByPrimaryKey(Long id);

    int updateByExampleSelective(ExcelEnergyEfficiencyLabel record, ExcelEnergyEfficiencyLabelExample example);

    int updateByExample(ExcelEnergyEfficiencyLabel record, ExcelEnergyEfficiencyLabelExample example);

    int updateByPrimaryKeySelective(ExcelEnergyEfficiencyLabel record);

    int updateByPrimaryKey(ExcelEnergyEfficiencyLabel record);
    
    public ListRange excelEnergyEfficiencyLabelList(ExcelEnergyEfficiencyLabel label, Integer currentPage, Integer pageRows);
}
