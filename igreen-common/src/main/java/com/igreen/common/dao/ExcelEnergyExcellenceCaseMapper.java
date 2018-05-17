package com.igreen.common.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.igreen.common.model.ExcelEnergyExcellenceCase;
import com.igreen.common.model.ExcelEnergyExcellenceCaseExample;

public interface ExcelEnergyExcellenceCaseMapper {
    int countByExample(ExcelEnergyExcellenceCaseExample example);

    int deleteByExample(ExcelEnergyExcellenceCaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelEnergyExcellenceCase record);

    int insertSelective(ExcelEnergyExcellenceCase record);

    List<ExcelEnergyExcellenceCase> selectByExample(ExcelEnergyExcellenceCaseExample example);

    ExcelEnergyExcellenceCase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExcelEnergyExcellenceCase record, @Param("example") ExcelEnergyExcellenceCaseExample example);

    int updateByExample(@Param("record") ExcelEnergyExcellenceCase record, @Param("example") ExcelEnergyExcellenceCaseExample example);

    int updateByPrimaryKeySelective(ExcelEnergyExcellenceCase record);

    int updateByPrimaryKey(ExcelEnergyExcellenceCase record);
}