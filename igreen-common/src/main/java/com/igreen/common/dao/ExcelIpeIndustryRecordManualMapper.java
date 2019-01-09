package com.igreen.common.dao;

import com.igreen.common.model.ExcelIpeIndustryRecord;

import java.util.List;

public interface ExcelIpeIndustryRecordManualMapper {

    int insertBatch(List<ExcelIpeIndustryRecord> record);
}