package com.igreen.boss.service.excel;

import java.util.List;

import com.igreen.common.model.ExcelGreatIndustrialEnergySupervision;
import com.igreen.common.model.ExcelGreatIndustrialEnergySupervisionExample;
import com.igreen.common.util.ListRange;

public interface GreatIndustrialEnergySupervisionService {
	
    int countByExample(ExcelGreatIndustrialEnergySupervisionExample example);

    int deleteByExample(ExcelGreatIndustrialEnergySupervisionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelGreatIndustrialEnergySupervision record);

    int insertSelective(ExcelGreatIndustrialEnergySupervision record);

    List<ExcelGreatIndustrialEnergySupervision> selectByExample(ExcelGreatIndustrialEnergySupervisionExample example);

    ExcelGreatIndustrialEnergySupervision selectByPrimaryKey(Integer id);

    int updateByExampleSelective(ExcelGreatIndustrialEnergySupervision record, ExcelGreatIndustrialEnergySupervisionExample example);

    int updateByExample(ExcelGreatIndustrialEnergySupervision record, ExcelGreatIndustrialEnergySupervisionExample example);

    int updateByPrimaryKeySelective(ExcelGreatIndustrialEnergySupervision record);

    int updateByPrimaryKey(ExcelGreatIndustrialEnergySupervision record);
    
    public ListRange list(ExcelGreatIndustrialEnergySupervision record, Integer currentPage, Integer pageRows);
}
