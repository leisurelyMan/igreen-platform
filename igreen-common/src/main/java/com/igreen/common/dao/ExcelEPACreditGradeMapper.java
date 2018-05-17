package com.igreen.common.dao;

import com.igreen.common.model.ExcelEPACreditGrade;
import com.igreen.common.model.ExcelEPACreditGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelEPACreditGradeMapper {
    int countByExample(ExcelEPACreditGradeExample example);

    int deleteByExample(ExcelEPACreditGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelEPACreditGrade record);

    int insertSelective(ExcelEPACreditGrade record);

    List<ExcelEPACreditGrade> selectByExample(ExcelEPACreditGradeExample example);

    ExcelEPACreditGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExcelEPACreditGrade record, @Param("example") ExcelEPACreditGradeExample example);

    int updateByExample(@Param("record") ExcelEPACreditGrade record, @Param("example") ExcelEPACreditGradeExample example);

    int updateByPrimaryKeySelective(ExcelEPACreditGrade record);

    int updateByPrimaryKey(ExcelEPACreditGrade record);
}