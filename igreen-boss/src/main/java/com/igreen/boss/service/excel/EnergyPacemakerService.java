package com.igreen.boss.service.excel;

import java.util.List;

import com.igreen.common.model.ExcelEnergyPacemaker;
import com.igreen.common.model.ExcelEnergyPacemakerExample;
import com.igreen.common.util.ListRange;

public interface EnergyPacemakerService {

    int countByExample(ExcelEnergyPacemakerExample example);

    int deleteByExample(ExcelEnergyPacemakerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExcelEnergyPacemaker record);

    int insertSelective(ExcelEnergyPacemaker record);

    List<ExcelEnergyPacemaker> selectByExample(ExcelEnergyPacemakerExample example);

    ExcelEnergyPacemaker selectByPrimaryKey(Long id);

    int updateByExampleSelective(ExcelEnergyPacemaker record, ExcelEnergyPacemakerExample example);

    int updateByExample(ExcelEnergyPacemaker record, ExcelEnergyPacemakerExample example);

    int updateByPrimaryKeySelective(ExcelEnergyPacemaker record);

    int updateByPrimaryKey(ExcelEnergyPacemaker record);
    
    public ListRange list(ExcelEnergyPacemaker record, Integer currentPage, Integer pageRows);
}
