package com.igreen.common.dao;

import com.igreen.common.model.ExcelIpeIndustryRecord;
import com.igreen.common.model.ExcelIpeIndustryRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelIpeIndustryRecordMapper {
    int countByExample(ExcelIpeIndustryRecordExample example);

    int deleteByExample(ExcelIpeIndustryRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelIpeIndustryRecord record);

    int insertSelective(ExcelIpeIndustryRecord record);

    List<ExcelIpeIndustryRecord> selectByExample(ExcelIpeIndustryRecordExample example);

    ExcelIpeIndustryRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExcelIpeIndustryRecord record, @Param("example") ExcelIpeIndustryRecordExample example);

    int updateByExample(@Param("record") ExcelIpeIndustryRecord record, @Param("example") ExcelIpeIndustryRecordExample example);

    int updateByPrimaryKeySelective(ExcelIpeIndustryRecord record);

    int updateByPrimaryKey(ExcelIpeIndustryRecord record);
}