package com.igreen.common.dao;

import com.igreen.common.model.CrawlerIpeIndustryRecord;

import java.util.List;
import java.util.Map;

public interface CrawlerIpeIndustryRecordManualMapper {

    List<CrawlerIpeIndustryRecord> pageCrawlerResult(Map<String, Object> params);

    Integer countCrawlerResult(Map<String, Object> params);

    CrawlerIpeIndustryRecord findByDetailUrl(String webDetailUrl);


    Integer commitRecord(List<Integer> ids);
}