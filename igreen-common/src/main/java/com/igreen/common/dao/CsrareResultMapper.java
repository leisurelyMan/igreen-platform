package com.igreen.common.dao;

import com.igreen.common.model.WebCrawlerResult;
import com.igreen.common.model.WebCsrcareResult;

import java.util.List;
import java.util.Map;

public interface CsrareResultMapper {
	
    /**
     * 根据主键删除对象
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加对象
     */
    int insert(WebCsrcareResult result);

    /**
     * 根据主键查询对象
     */
    WebCsrcareResult selectByPrimaryKey(Integer id);

    /**
	 * 根据域名查询
	 * @param webDomain
	 * @return
	 */
    WebCsrcareResult findByDetailUrl(String webDomain);
	
    /**
     * 更新对象
     */
    int updateByPrimaryKey(WebCsrcareResult result);
    
    int countCsrareResult(Map<String, Object> map);

	List<WebCsrcareResult> pageCsrareResult(Map<String, Object> map);
	
}