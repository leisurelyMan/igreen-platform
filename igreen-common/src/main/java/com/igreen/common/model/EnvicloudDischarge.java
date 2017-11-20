package com.igreen.common.model;

import java.util.List;

public class EnvicloudDischarge extends EnvicloudBase{
	private Integer count;
	private String year;
	private List<Discharge> info;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public List<Discharge> getInfo() {
		return info;
	}
	public void setInfo(List<Discharge> info) {
		this.info = info;
	}
	
	@Override
	public String toString( ){
		StringBuilder result = new StringBuilder( );
		result.append("查询结果：").append(this.getRdesc()).append("\n");
		result.append("详情：").append("\n");
		if(info != null){
			for(Discharge d:info){
				result.append("省份名称：").append(d.getProvince()).append("\t\t");
				result.append("指标种类：").append(d.getCategory()).append("\t\t");
				result.append("具体指标：").append(d.getIndex()).append("\t\t");
				result.append("排放量：").append(d.getValue()).append("\n");
			}
		}
		
		return result.toString();
	}
}

class Discharge{
	private String province;
	private String category;
	private String index;
	private String value;
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
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
