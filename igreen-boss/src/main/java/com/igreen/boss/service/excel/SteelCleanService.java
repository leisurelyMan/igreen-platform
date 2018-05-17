package com.igreen.boss.service.excel;

import java.util.List;

import com.igreen.common.model.ExcelSteelClean;
import com.igreen.common.model.ExcelSteelCleanExample;
import com.igreen.common.util.ListRange;

public interface SteelCleanService {

    int countByExample(ExcelSteelCleanExample example);

    int deleteByExample(ExcelSteelCleanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelSteelClean record);

    int insertSelective(ExcelSteelClean record);

    List<ExcelSteelClean> selectByExample(ExcelSteelCleanExample example);

    ExcelSteelClean selectByPrimaryKey(Integer id);

    int updateByExampleSelective(ExcelSteelClean record, ExcelSteelCleanExample example);

    int updateByExample(ExcelSteelClean record, ExcelSteelCleanExample example);

    int updateByPrimaryKeySelective(ExcelSteelClean record);

    int updateByPrimaryKey(ExcelSteelClean record);
    
    public ListRange list(ExcelSteelClean record, Integer currentPage, Integer pageRows);
}
