package com.igreen.common.dao;

import com.igreen.common.model.ExcelEnergyPacemaker;
import com.igreen.common.model.ExcelEnergyPacemakerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelEnergyPacemakerMapper {
    int countByExample(ExcelEnergyPacemakerExample example);

    int deleteByExample(ExcelEnergyPacemakerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExcelEnergyPacemaker record);

    int insertSelective(ExcelEnergyPacemaker record);

    List<ExcelEnergyPacemaker> selectByExample(ExcelEnergyPacemakerExample example);

    ExcelEnergyPacemaker selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExcelEnergyPacemaker record, @Param("example") ExcelEnergyPacemakerExample example);

    int updateByExample(@Param("record") ExcelEnergyPacemaker record, @Param("example") ExcelEnergyPacemakerExample example);

    int updateByPrimaryKeySelective(ExcelEnergyPacemaker record);

    int updateByPrimaryKey(ExcelEnergyPacemaker record);
}