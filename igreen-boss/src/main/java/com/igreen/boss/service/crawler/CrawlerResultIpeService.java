/**
 * 
 */
package com.igreen.boss.service.crawler;

import com.igreen.common.model.CrawlerIpeIndustryRecord;
import com.igreen.common.model.WebCrawlerResult;
import com.igreen.common.model.WebCrawlerResultIpe;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

import java.util.List;

/**
 * 爬虫结果信息
 * @author chenxy
 *
 */
public interface CrawlerResultIpeService {

	/**
	 * 分页查询结果信息
	 * @param result
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	public ListRange resultList(CrawlerIpeIndustryRecord result, Integer currentPage, Integer pageRows);
	
	/**
	 * 添加修改结果信息
	 * @param result
	 * @return
	 */
	public ResponseModel addOrEditResult(CrawlerIpeIndustryRecord result, Integer configId);
	
	/**
	 * 删除
	 * @param configId
	 * @return
	 */
	public ResponseModel delResult(Integer configId);
	
	/**
	 * 根据ID获取结果信息
	 * @param configId
	 * @return
	 */
	CrawlerIpeIndustryRecord getWebCrawlerResultById(Integer configId);

	/**
	 * 批量插入
	 * @param recordList
	 */
	public ResponseModel addOrEditResultList(List<CrawlerIpeIndustryRecord> recordList, String webDetailUrl);
}
