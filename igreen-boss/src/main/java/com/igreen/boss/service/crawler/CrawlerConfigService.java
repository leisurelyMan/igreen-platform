/**
 * 
 */
package com.igreen.boss.service.crawler;

import com.igreen.common.model.WebCrawlerConfig;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

/**
 * 爬虫配置信息
 * @author chenxy
 *
 */
public interface CrawlerConfigService {

	/**
	 * 分页查询配置信息
	 * @param crawlerConfig
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	public ListRange configList(WebCrawlerConfig crawlerConfig, Integer currentPage, Integer pageRows);
	
	/**
	 * 添加修改配置信息
	 * @param crawlerConfig
	 * @return
	 */
	public ResponseModel addOrEditConfig(WebCrawlerConfig crawlerConfig, Integer configId);
	
	/**
	 * 删除
	 * @param configId
	 * @return
	 */
	public ResponseModel delConfig(Integer configId);
	
	/**
	 * 根据ID获取配置信息
	 * @param configId
	 * @return
	 */
	WebCrawlerConfig getWebCrawlerConfigById(Integer configId);
	
	WebCrawlerConfig selectByPrimaryKey(Integer id);
}
