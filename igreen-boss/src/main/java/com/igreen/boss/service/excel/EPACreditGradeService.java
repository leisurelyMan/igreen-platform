package com.igreen.boss.service.excel;

import java.util.List;

import com.igreen.common.model.ExcelEPACreditGrade;
import com.igreen.common.model.ExcelEPACreditGradeExample;
import com.igreen.common.util.ListRange;

public interface EPACreditGradeService {

    int countByExample(ExcelEPACreditGradeExample example);

    int deleteByExample(ExcelEPACreditGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelEPACreditGrade record);

    int insertSelective(ExcelEPACreditGrade record);

    List<ExcelEPACreditGrade> selectByExample(ExcelEPACreditGradeExample example);

    ExcelEPACreditGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(ExcelEPACreditGrade record, ExcelEPACreditGradeExample example);

    int updateByExample(ExcelEPACreditGrade record, ExcelEPACreditGradeExample example);

    int updateByPrimaryKeySelective(ExcelEPACreditGrade record);

    int updateByPrimaryKey(ExcelEPACreditGrade record);
    
    public ListRange list(ExcelEPACreditGrade record, Integer currentPage, Integer pageRows);
}
