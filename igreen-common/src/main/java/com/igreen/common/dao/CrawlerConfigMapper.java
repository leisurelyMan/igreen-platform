package com.igreen.common.dao;

import java.util.List;
import java.util.Map;
import com.igreen.common.model.WebCrawlerConfig;

public interface CrawlerConfigMapper {
	
    /**
     * 根据主键删除对象
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加对象
     */
    int insert(WebCrawlerConfig config);

    /**
     * 根据主键查询对象
     */
    WebCrawlerConfig selectByPrimaryKey(Integer id);

    /**
	 * 根据域名查询
	 * @param webDomain
	 * @return
	 */
    WebCrawlerConfig findByWebDomain(String webDomain);
	
    /**
     * 更新对象
     */
    int updateByPrimaryKey(WebCrawlerConfig config);
    
    int countCrawlerConfig(Map<String, Object> map);

	List<WebCrawlerConfig> pageCrawlerConfig(Map<String, Object> map);
	
}