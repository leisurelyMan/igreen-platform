package com.igreen.boss.service.excel;

import java.util.List;

import com.igreen.common.model.ExcelNDRCEnergyFiling;
import com.igreen.common.model.ExcelNDRCEnergyFilingExample;
import com.igreen.common.util.ListRange;

public interface NDRCEnergyFilingService {

    int countByExample(ExcelNDRCEnergyFilingExample example);

    int deleteByExample(ExcelNDRCEnergyFilingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelNDRCEnergyFiling record);

    int insertSelective(ExcelNDRCEnergyFiling record);

    List<ExcelNDRCEnergyFiling> selectByExample(ExcelNDRCEnergyFilingExample example);

    ExcelNDRCEnergyFiling selectByPrimaryKey(Integer id);

    int updateByExampleSelective(ExcelNDRCEnergyFiling record, ExcelNDRCEnergyFilingExample example);

    int updateByExample(ExcelNDRCEnergyFiling record, ExcelNDRCEnergyFilingExample example);

    int updateByPrimaryKeySelective(ExcelNDRCEnergyFiling record);

    int updateByPrimaryKey(ExcelNDRCEnergyFiling record);
    
    public ListRange list(ExcelNDRCEnergyFiling record, Integer currentPage, Integer pageRows);
}
