package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.CleanProductionCompany;

public interface CleanProductionCompanyMapper {
	/**
	 * 插入清洁生产企业
	 * @param company
	 * @return
	 */
	int insertSelective(CleanProductionCompany company);
	/**
	 * 根据条件查询清洁生产企业
	 * @param company
	 * @return List<CleanProductionCompany>
	 */
	List<CleanProductionCompany> selectByPatameter(CleanProductionCompany company);
	
	List<CleanProductionCompany> pageCleanProductionCompany(Map<String, Object> params);

	Integer countCleanProductionCompany(Map<String, Object> params);
}
