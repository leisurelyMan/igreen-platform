package com.igreen.common.model;

public class EnvicloudCityDailyAir extends EnvicloudBase{
	private String citycode;
	private String date;
	private String AQI_max;
	private String AQI_min;
	private String AQI_avg;
	private String PM25_max;
	private String PM25_min;
	private String PM25_avg;
	private String PM10_max;
	
	private String PM10_min;
	private String PM10_avg;
	private String CO_max;
	private String CO_min;
	private String CO_avg;
	private String SO2_max;
	private String SO2_min;
	private String SO2_avg;
	private String NO2_max;
	
	private String NO2_min;
	private String NO2_avg;
	private String o3_max;
	private String o3_min;
	private String o3_avg;
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAQI_max() {
		return AQI_max;
	}
	public void setAQI_max(String aQI_max) {
		AQI_max = aQI_max;
	}
	public String getAQI_min() {
		return AQI_min;
	}
	public void setAQI_min(String aQI_min) {
		AQI_min = aQI_min;
	}
	public String getAQI_avg() {
		return AQI_avg;
	}
	public void setAQI_avg(String aQI_avg) {
		AQI_avg = aQI_avg;
	}
	public String getPM25_max() {
		return PM25_max;
	}
	public void setPM25_max(String pM25_max) {
		PM25_max = pM25_max;
	}
	public String getPM25_min() {
		return PM25_min;
	}
	public void setPM25_min(String pM25_min) {
		PM25_min = pM25_min;
	}
	public String getPM25_avg() {
		return PM25_avg;
	}
	public void setPM25_avg(String pM25_avg) {
		PM25_avg = pM25_avg;
	}
	public String getPM10_max() {
		return PM10_max;
	}
	public void setPM10_max(String pM10_max) {
		PM10_max = pM10_max;
	}
	public String getPM10_min() {
		return PM10_min;
	}
	public void setPM10_min(String pM10_min) {
		PM10_min = pM10_min;
	}
	public String getPM10_avg() {
		return PM10_avg;
	}
	public void setPM10_avg(String pM10_avg) {
		PM10_avg = pM10_avg;
	}
	public String getCO_max() {
		return CO_max;
	}
	public void setCO_max(String cO_max) {
		CO_max = cO_max;
	}
	public String getCO_min() {
		return CO_min;
	}
	public void setCO_min(String cO_min) {
		CO_min = cO_min;
	}
	public String getCO_avg() {
		return CO_avg;
	}
	public void setCO_avg(String cO_avg) {
		CO_avg = cO_avg;
	}
	public String getSO2_max() {
		return SO2_max;
	}
	public void setSO2_max(String sO2_max) {
		SO2_max = sO2_max;
	}
	public String getSO2_min() {
		return SO2_min;
	}
	public void setSO2_min(String sO2_min) {
		SO2_min = sO2_min;
	}
	public String getSO2_avg() {
		return SO2_avg;
	}
	public void setSO2_avg(String sO2_avg) {
		SO2_avg = sO2_avg;
	}
	public String getNO2_max() {
		return NO2_max;
	}
	public void setNO2_max(String nO2_max) {
		NO2_max = nO2_max;
	}
	public String getNO2_min() {
		return NO2_min;
	}
	public void setNO2_min(String nO2_min) {
		NO2_min = nO2_min;
	}
	public String getNO2_avg() {
		return NO2_avg;
	}
	public void setNO2_avg(String nO2_avg) {
		NO2_avg = nO2_avg;
	}
	public String getO3_max() {
		return o3_max;
	}
	public void setO3_max(String o3_max) {
		this.o3_max = o3_max;
	}
	public String getO3_min() {
		return o3_min;
	}
	public void setO3_min(String o3_min) {
		this.o3_min = o3_min;
	}
	public String getO3_avg() {
		return o3_avg;
	}
	public void setO3_avg(String o3_avg) {
		this.o3_avg = o3_avg;
	}
	
	@Override
	public String toString( ){
		StringBuilder result = new StringBuilder( );
		result.append("查询结果：").append(this.getRdesc()).append("\n");
		result.append("详情：").append("\n");
		result.append("最高空气质量指数：").append(this.getAQI_max()).append("\n");
		result.append("最低空气质量指数：").append(this.getAQI_min()).append("\n");
		result.append("平均空气质量指数：").append(this.getAQI_avg()).append("\n");
		result.append("最高PM2.5浓度(μg/m3)：").append(this.getPM25_max()).append("\n");
		result.append("最低PM2.5浓度(μg/m3)：").append(this.getPM25_min()).append("\n");
		result.append("平均PM2.5浓度(μg/m3)：").append(this.getPM25_avg()).append("\n");
		result.append("最高PM10浓度(μg/m3)：").append(this.getPM10_max()).append("\n");
		result.append("最低PM10浓度(μg/m3)：").append(this.getPM10_min()).append("\n");
		result.append("平均PM10浓度(μg/m3)：").append(this.getPM10_avg()).append("\n");
		result.append("最高一氧化碳浓度(mg/m3)：").append(this.getCO_max()).append("\n");
		result.append("最低一氧化碳浓度(mg/m3)：").append(this.getCO_min()).append("\n");
		result.append("平均一氧化碳浓度(mg/m3)：").append(this.getCO_avg()).append("\n");
		result.append("最高二氧化硫浓度(μg/m3)：").append(this.getSO2_max()).append("\n");
		result.append("最低二氧化硫浓度(μg/m3)：").append(this.getSO2_min()).append("\n");
		result.append("平均二氧化硫浓度(μg/m3)：").append(this.getSO2_avg()).append("\n");
		result.append("最高二氧化氮浓度(μg/m3)：").append(this.getNO2_max()).append("\n");
		result.append("最低二氧化氮浓度(μg/m3)：").append(this.getNO2_min()).append("\n");
		result.append("平均二氧化氮浓度(μg/m3)：").append(this.getNO2_avg()).append("\n");
		result.append("最高臭氧浓度(μg/m3)：").append(this.getO3_max()).append("\n");
		result.append("最低臭氧浓度(μg/m3)：").append(this.getO3_min()).append("\n");
		result.append("平均臭氧浓度(μg/m3)：").append(this.getO3_avg()).append("\n");
		
		return result.toString();
	}
}
