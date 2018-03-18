/**
 * 
 */
package com.igreen.boss.service.crawler;

import com.igreen.common.model.WebCrawlerResult;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

/**
 * 爬虫结果信息
 * @author chenxy
 *
 */
public interface CrawlerResultService {

	/**
	 * 分页查询结果信息
	 * @param crawlerConfig
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	public ListRange configList(WebCrawlerResult result, Integer currentPage, Integer pageRows);
	
	/**
	 * 添加修改结果信息
	 * @param crawlerConfig
	 * @return
	 */
	public ResponseModel addOrEditResult(WebCrawlerResult result, Integer configId);
	
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
	WebCrawlerResult getWebCrawlerResultById(Integer configId);
}
