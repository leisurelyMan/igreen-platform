package com.igreen.common.model;

public class EnvicloudParameter {
	private String sourceValue;
	/**
	 * 私钥
	 */
	public String accessKey;
	/**
	 * 城市编码
	 */
	public String cityCode;
	/**
	 * 起始坐标经度(东经)
	 */
	public String startLng;
	/**
	 * 起始坐标纬度(北纬)
	 */
	public String startLat;
	/**
	 * 结束坐标经度(东经)
	 */
	public String endLng;
	/**
	 * 结束坐标纬度(北纬)
	 */
	public String endLat;
	/**
	 * 查询类型(仅支持pre、avg、max和min，大小写不敏感)--气象数据服务
	 */
	public String type;
	/**
	 * 查询年份(1996-2015)
	 */
	public String year;
	/**
	 * 起始年份(1996-2015)
	 */
	public String startYear;
	/**
	 * 结束年份(1996-2015，不早于起始年份)
	 */
	public String endYear;
	/**
	 * 查询日期(yyyyMMdd)
	 */
	public String date;
	/**
	 * 省份
	 */
	public String province;
	/**
	 * 过滤条件，支持模糊匹配
	 */
	public String filter;
	
	
	public String getSourceValue() {
		return sourceValue;
	}
	public void setSourceValue(String sourceValue) {
		this.sourceValue = sourceValue;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	public String getEndYear() {
		return endYear;
	}
	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}
	public String getAccessKey() {
		return accessKey;
	}
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getStartLng() {
		return startLng;
	}
	public void setStartLng(String startLng) {
		this.startLng = startLng;
	}
	public String getStartLat() {
		return startLat;
	}
	public void setStartLat(String startLat) {
		this.startLat = startLat;
	}
	public String getEndLng() {
		return endLng;
	}
	public void setEndLng(String endLng) {
		this.endLng = endLng;
	}
	public String getEndLat() {
		return endLat;
	}
	public void setEndLat(String endLat) {
		this.endLat = endLat;
	}	
}
