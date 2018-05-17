package com.igreen.boss.service.excel;

import java.util.List;

import com.igreen.common.model.ExcelEnergyExcellenceCase;
import com.igreen.common.model.ExcelEnergyExcellenceCaseExample;
import com.igreen.common.util.ListRange;

public interface EnergyExcellenceCaseService {

    int countByExample(ExcelEnergyExcellenceCaseExample example);

    int deleteByExample(ExcelEnergyExcellenceCaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelEnergyExcellenceCase record);

    int insertSelective(ExcelEnergyExcellenceCase record);

    List<ExcelEnergyExcellenceCase> selectByExample(ExcelEnergyExcellenceCaseExample example);

    ExcelEnergyExcellenceCase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(ExcelEnergyExcellenceCase record, ExcelEnergyExcellenceCaseExample example);

    int updateByExample(ExcelEnergyExcellenceCase record, ExcelEnergyExcellenceCaseExample example);

    int updateByPrimaryKeySelective(ExcelEnergyExcellenceCase record);

    int updateByPrimaryKey(ExcelEnergyExcellenceCase record);
    
    public ListRange list(ExcelEnergyExcellenceCase record, Integer currentPage, Integer pageRows);
}
