package com.igreen.boss.service.crawler;

import com.igreen.common.model.ExcelIpeIndustryRecord;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import org.springframework.web.multipart.MultipartFile;

public interface ExcelIpeIndustryRecordService {

    ListRange pageList(ExcelIpeIndustryRecord record, Integer currentPage, Integer pageRows);


    ExcelIpeIndustryRecord getOne(Integer recordId);


    ResponseModel saveOrUpdate(ExcelIpeIndustryRecord record, Integer userId);


    ResponseModel importData(MultipartFile file, Integer userId);

    ResponseModel deleteRecord(Integer recordId, Integer userId);

    ResponseModel deleteAll(Integer userId);

    ResponseModel affirm(Integer userId);
}
