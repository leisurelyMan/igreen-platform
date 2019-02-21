package com.igreen.common.dao;

import com.igreen.common.model.CrawlerIpeIndustryRecord;
import com.igreen.common.model.CrawlerIpeIndustryRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrawlerIpeIndustryRecordMapper {
    int countByExample(CrawlerIpeIndustryRecordExample example);

    int deleteByExample(CrawlerIpeIndustryRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrawlerIpeIndustryRecord record);

    int insertSelective(CrawlerIpeIndustryRecord record);

    List<CrawlerIpeIndustryRecord> selectByExample(CrawlerIpeIndustryRecordExample example);

    CrawlerIpeIndustryRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrawlerIpeIndustryRecord record, @Param("example") CrawlerIpeIndustryRecordExample example);

    int updateByExample(@Param("record") CrawlerIpeIndustryRecord record, @Param("example") CrawlerIpeIndustryRecordExample example);

    int updateByPrimaryKeySelective(CrawlerIpeIndustryRecord record);

    int updateByPrimaryKey(CrawlerIpeIndustryRecord record);

    void insertByBatch(List<CrawlerIpeIndustryRecord> recordList);
}