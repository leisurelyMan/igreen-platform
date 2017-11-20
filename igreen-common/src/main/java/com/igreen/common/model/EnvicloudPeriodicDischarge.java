package com.igreen.common.model;

import java.util.List;

public class EnvicloudPeriodicDischarge extends EnvicloudBase{
	private Integer count;
	private String province;
	private List<PeriodicDischarge> info;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public List<PeriodicDischarge> getInfo() {
		return info;
	}
	public void setInfo(List<PeriodicDischarge> info) {
		this.info = info;
	}
	
	@Override
	public String toString( ){
		StringBuilder result = new StringBuilder( );
		result.append("查询结果：").append(this.getRdesc()).append("\n");
		result.append("详情：").append("\n");
		if(info != null){
			for(PeriodicDischarge d:info){
				result.append("年份：").append(d.getYear()).append("\t\t");
				result.append("指标种类：").append(d.getCategory()).append("\t\t");
				result.append("具体指标：").append(d.getIndex()).append("\t\t");
				result.append("排放量：").append(d.getValue()).append("\n");
			}
		}
		return result.toString();
	}
}

class PeriodicDischarge{
	private String year;
	private String category;
	private String index;
	private String value;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
