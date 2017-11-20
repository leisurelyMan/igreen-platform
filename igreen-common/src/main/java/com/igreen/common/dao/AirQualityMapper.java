package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.AirQuality;

public interface AirQualityMapper {
	/**
	 * 插入空气质量指数
	 * @param airQuality 空气质量
	 * @return
	 */
	int insertSelective(AirQuality airQuality);
	
	int airQualityCount( );
	
	int insertBatch(List<AirQuality> list);
	
	List<AirQuality> selectByParameter(AirQuality query);
	
	List<AirQuality> pageAirQuality(Map<String, Object> params);
	
	Integer countAirQuality(Map<String, Object> params);
	
	List<AirQuality> selectByCityAndDate(AirQuality query);
}
