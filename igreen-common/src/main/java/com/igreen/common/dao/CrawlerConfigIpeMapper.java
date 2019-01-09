package com.igreen.common.dao;

import com.igreen.common.model.WebCrawlerConfigIpe;

import java.util.List;
import java.util.Map;

public interface CrawlerConfigIpeMapper {
	
    /**
     * 根据主键删除对象
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加对象
     */
    int insert(WebCrawlerConfigIpe config);

    /**
     * 根据主键查询对象
     */
    WebCrawlerConfigIpe selectByPrimaryKey(Integer id);

    /**
	 * 根据域名查询
	 * @param webDomain
	 * @return
	 */
    WebCrawlerConfigIpe findByWebDomain(String webDomain);
	
    /**
     * 更新对象
     */
    int updateByPrimaryKey(WebCrawlerConfigIpe config);
    
    int countCrawlerConfig(Map<String, Object> map);

	List<WebCrawlerConfigIpe> pageCrawlerConfig(Map<String, Object> map);
	
}