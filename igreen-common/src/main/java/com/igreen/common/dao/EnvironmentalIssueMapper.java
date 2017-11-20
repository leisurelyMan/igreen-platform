package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.EnvironmentalIssue;

public interface EnvironmentalIssueMapper {
	/**
	 * 插入群众举报案件
	 * @param issue
	 * @return
	 */
	int insertSelective(EnvironmentalIssue issue);
	/**
	 * 查询举报事件
	 * @param issue
	 * @return List<EnvironmentalIssue>
	 */
	List<EnvironmentalIssue> selectByParameter(EnvironmentalIssue issue);
	
	List<EnvironmentalIssue> pageReport(Map<String, Object> params);

	Integer countReport(Map<String, Object> params);
}
