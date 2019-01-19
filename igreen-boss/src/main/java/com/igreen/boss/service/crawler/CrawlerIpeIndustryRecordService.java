package com.igreen.boss.service.crawler;

import com.igreen.common.model.CrawlerIpeIndustryRecord;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public interface CrawlerIpeIndustryRecordService {


    ListRange pageList(CrawlerIpeIndustryRecord record, Integer currentPage, Integer pageRows);

    CrawlerIpeIndustryRecord getOne(Integer recordId);

    ResponseModel saveOrUpdate(CrawlerIpeIndustryRecord record, Integer userId);

    ResponseModel affirm(List<Integer> recordIdList, Integer userId);
}
