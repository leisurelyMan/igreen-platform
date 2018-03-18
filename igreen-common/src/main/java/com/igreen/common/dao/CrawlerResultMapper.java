package com.igreen.common.dao;

import java.util.List;
import java.util.Map;
import com.igreen.common.model.WebCrawlerResult;

public interface CrawlerResultMapper {
	
    /**
     * 根据主键删除对象
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加对象
     */
    int insert(WebCrawlerResult result);

    /**
     * 根据主键查询对象
     */
    WebCrawlerResult selectByPrimaryKey(Integer id);

    /**
	 * 根据域名查询
	 * @param webDomain
	 * @return
	 */
    WebCrawlerResult findByDetailUrl(String webDomain);
	
    /**
     * 更新对象
     */
    int updateByPrimaryKey(WebCrawlerResult result);
    
    int countCrawlerResult(Map<String, Object> map);

	List<WebCrawlerResult> pageCrawlerResult(Map<String, Object> map);
	
}