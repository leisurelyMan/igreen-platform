/**
 * 
 */
package com.igreen.boss.service.crawler;

import com.igreen.common.model.WebCrawlerConfigIpe;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

/**
 * 爬虫配置信息
 * @author chenxy
 *
 */
public interface CrawlerConfigIpeService {

	/**
	 * 分页查询配置信息
	 * @param crawlerConfig
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	public ListRange configList(WebCrawlerConfigIpe crawlerConfig, Integer currentPage, Integer pageRows);

	/**
	 * 获取总条数
	 * @param crawlerConfig
	 * @return
	 */
	int configCount(WebCrawlerConfigIpe crawlerConfig);
	
	/**
	 * 添加修改配置信息
	 * @param crawlerConfig
	 * @return
	 */
	public ResponseModel addOrEditConfig(WebCrawlerConfigIpe crawlerConfig, Integer configId);
	
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
	WebCrawlerConfigIpe getWebCrawlerConfigById(Integer configId);
	
	WebCrawlerConfigIpe selectByPrimaryKey(Integer id);
}
