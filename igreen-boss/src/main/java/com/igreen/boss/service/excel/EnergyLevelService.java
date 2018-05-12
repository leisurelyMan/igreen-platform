package com.igreen.boss.service.excel;

import java.util.List;

import com.igreen.common.model.ExcelEnergyLevel;
import com.igreen.common.model.ExcelEnergyLevelExample;
import com.igreen.common.util.ListRange;

public interface EnergyLevelService {
	
    int countByExample(ExcelEnergyLevelExample example);

    int deleteByExample(ExcelEnergyLevelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExcelEnergyLevel record);

    int insertSelective(ExcelEnergyLevel record);

    List<ExcelEnergyLevel> selectByExample(ExcelEnergyLevelExample example);

    ExcelEnergyLevel selectByPrimaryKey(Long id);

    int updateByExampleSelective(ExcelEnergyLevel record, ExcelEnergyLevelExample example);

    int updateByExample(ExcelEnergyLevel record, ExcelEnergyLevelExample example);

    int updateByPrimaryKeySelective(ExcelEnergyLevel record);

    int updateByPrimaryKey(ExcelEnergyLevel record);
    
    public ListRange list(ExcelEnergyLevel record, Integer currentPage, Integer pageRows);
}
