package com.igreen.boss.service.companyQuery;

import java.util.List;

import com.igreen.common.model.CompanyQueryExecutionRecord;
import com.igreen.common.model.CompanyQueryExecutionRecordExample;
import com.igreen.common.model.CompanyQueryExecutionRecordWithBLOBs;

public interface CompanyQueryExecutionRecordService {
    int countByExample(CompanyQueryExecutionRecordExample example);

    int deleteByExample(CompanyQueryExecutionRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyQueryExecutionRecordWithBLOBs record);

    int insertSelective(CompanyQueryExecutionRecordWithBLOBs record);

    List<CompanyQueryExecutionRecordWithBLOBs> selectByExampleWithBLOBs(CompanyQueryExecutionRecordExample example);

    List<CompanyQueryExecutionRecord> selectByExample(CompanyQueryExecutionRecordExample example);

    CompanyQueryExecutionRecordWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(CompanyQueryExecutionRecordWithBLOBs record, CompanyQueryExecutionRecordExample example);

    int updateByExampleWithBLOBs(CompanyQueryExecutionRecordWithBLOBs record, CompanyQueryExecutionRecordExample example);

    int updateByExample(CompanyQueryExecutionRecord record, CompanyQueryExecutionRecordExample example);

    int updateByPrimaryKeySelective(CompanyQueryExecutionRecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompanyQueryExecutionRecordWithBLOBs record);

    int updateByPrimaryKey(CompanyQueryExecutionRecord record);
}
