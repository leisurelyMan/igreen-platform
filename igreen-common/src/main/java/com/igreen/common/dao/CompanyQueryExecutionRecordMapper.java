package com.igreen.common.dao;

import com.igreen.common.model.CompanyQueryExecutionRecord;
import com.igreen.common.model.CompanyQueryExecutionRecordExample;
import com.igreen.common.model.CompanyQueryExecutionRecordWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyQueryExecutionRecordMapper {
    int countByExample(CompanyQueryExecutionRecordExample example);

    int deleteByExample(CompanyQueryExecutionRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyQueryExecutionRecordWithBLOBs record);

    int insertSelective(CompanyQueryExecutionRecordWithBLOBs record);

    List<CompanyQueryExecutionRecordWithBLOBs> selectByExampleWithBLOBs(CompanyQueryExecutionRecordExample example);

    List<CompanyQueryExecutionRecord> selectByExample(CompanyQueryExecutionRecordExample example);

    CompanyQueryExecutionRecordWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyQueryExecutionRecordWithBLOBs record, @Param("example") CompanyQueryExecutionRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyQueryExecutionRecordWithBLOBs record, @Param("example") CompanyQueryExecutionRecordExample example);

    int updateByExample(@Param("record") CompanyQueryExecutionRecord record, @Param("example") CompanyQueryExecutionRecordExample example);

    int updateByPrimaryKeySelective(CompanyQueryExecutionRecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompanyQueryExecutionRecordWithBLOBs record);

    int updateByPrimaryKey(CompanyQueryExecutionRecord record);
}