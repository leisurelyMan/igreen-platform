package com.igreen.common.dao;

import java.util.List;

import com.igreen.common.model.EnvicloudCityCode;

public interface EnvicloudCityCodeMapper {
	/**
	 * 插入环境云城市编码
	 * @param cityCode 城市编码
	 * @return
	 */
	int insertSelective(EnvicloudCityCode cityCode);
	/**
	 * 根据城市名称选择城市码
	 * @param code 城市名称
	 * @return List<String>
	 */
	List<String> selectByCityName(EnvicloudCityCode code);
}
