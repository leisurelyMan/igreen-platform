package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.MonitorCompany;

public interface MonitorCompanyMapper {
	/**
	 * 插入国家重点监控企业
	 * @param company
	 * @return
	 */
	int insertSelective(MonitorCompany company);
	/**
	 * 查询监管企业
	 * @param company
	 * @return List<MonitorCompany>
	 */
	List<MonitorCompany> selectByParameter(MonitorCompany company);
	
	List<MonitorCompany> pageMonitorCompany(Map<String, Object> params);

	Integer countMonitorCompany(Map<String, Object> params);
}
