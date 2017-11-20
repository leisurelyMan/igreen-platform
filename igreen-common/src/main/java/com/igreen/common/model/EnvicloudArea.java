package com.igreen.common.model;

import java.util.List;

public class EnvicloudArea extends EnvicloudBase{
	private Integer count;
	private List<CityInfo> cities;
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<CityInfo> getCities() {
		return cities;
	}
	public void setCities(List<CityInfo> cities) {
		this.cities = cities;
	}
	
	@Override
	public String toString( ){
		StringBuilder result = new StringBuilder( );
		result.append("查询结果：").append(this.getRdesc()).append("\n");
		result.append("详情：").append("\n");
		if(cities != null){
			for(CityInfo info:cities){
				result.append("城市名称：").append(info.getCityname()).append("\t\t");
				result.append("城市经度：").append(info.getLongitude()).append("\t\t");
				result.append("城市纬度：").append(info.getLatitude()).append("\n");
			}
		}
		return result.toString();
	}
}

class CityInfo{
	private String citycode;
	private String cityname;
	private String longitude;
	private String latitude;
	
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
}
