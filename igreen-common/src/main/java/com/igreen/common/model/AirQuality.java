package com.igreen.common.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AirQuality {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	private Integer id;
	 /**
     * 日期
     */
	private Date recordDate;
	/**
     * 城市
     */
	private String city;
	/**
     * 空气质量指数
     */
	private String airQualityIndex;
	/**
     * 主要污染物
     */
	private String mainPollutant;
	/**
     * 状态
     */
	private String status;
	
	
	public String getRecordDataStr() {
		return sdf.format(recordDate);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAirQualityIndex() {
		return airQualityIndex;
	}
	public void setAirQualityIndex(String airQualityIndex) {
		this.airQualityIndex = airQualityIndex;
	}
	public String getMainPollutant() {
		return mainPollutant;
	}
	public void setMainPollutant(String mainPollutant) {
		this.mainPollutant = mainPollutant;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
