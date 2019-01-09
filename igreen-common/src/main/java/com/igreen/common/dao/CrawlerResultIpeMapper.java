package com.igreen.common.dao;

import com.igreen.common.model.WebCrawlerResultIpe;

import java.util.List;
import java.util.Map;

public interface CrawlerResultIpeMapper {
	
    /**
     * 根据主键删除对象
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加对象
     */
    int insert(WebCrawlerResultIpe result);

    /**
     * 根据主键查询对象
     */
    WebCrawlerResultIpe selectByPrimaryKey(Integer id);

    /**
	 * 根据域名查询
	 * @param webDomain
	 * @return
	 */
    WebCrawlerResultIpe findByDetailUrl(String webDomain);
	
    /**
     * 更新对象
     */
    int updateByPrimaryKey(WebCrawlerResultIpe result);
    
    int countCrawlerResult(Map<String, Object> map);

	List<WebCrawlerResultIpe> pageCrawlerResult(Map<String, Object> map);
	
}