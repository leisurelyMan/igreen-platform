package com.igreen.boss.service.excel;

import java.util.List;

import com.igreen.common.model.ExcelGreenBal;
import com.igreen.common.model.ExcelGreenBalExample;
import com.igreen.common.util.ListRange;

public interface GreenBalService {

    int countByExample(ExcelGreenBalExample example);

    int deleteByExample(ExcelGreenBalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelGreenBal record);

    int insertSelective(ExcelGreenBal record);

    List<ExcelGreenBal> selectByExample(ExcelGreenBalExample example);

    ExcelGreenBal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(ExcelGreenBal record, ExcelGreenBalExample example);

    int updateByExample(ExcelGreenBal record, ExcelGreenBalExample example);

    int updateByPrimaryKeySelective(ExcelGreenBal record);

    int updateByPrimaryKey(ExcelGreenBal record);
    
    public ListRange list(ExcelGreenBal record, Integer currentPage, Integer pageRows);
}
