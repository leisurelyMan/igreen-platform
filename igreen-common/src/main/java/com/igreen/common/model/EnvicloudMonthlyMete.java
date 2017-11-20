package com.igreen.common.model;

import java.util.List;

public class EnvicloudMonthlyMete extends EnvicloudBase{
	private String citycode;
	private List<MonthlyMete> info;
	
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public List<MonthlyMete> getInfo() {
		return info;
	}
	public void setInfo(List<MonthlyMete> info) {
		this.info = info;
	}
	
	@Override
	public String toString( ){
		StringBuilder result = new StringBuilder( );
		result.append("查询结果：").append(this.getRdesc()).append("\n");
		result.append("详情：").append("\n");
		if(info != null){
			for(MonthlyMete m:info){
				result.append("年份：").append(m.getYear()).append("\t\t");
				result.append("月份：").append(m.getMonth()).append("\t\t");
				result.append("降水量(mm)：").append(m.getPre()).append("\t\t");
				result.append("最高气温(℃)：").append(m.getTem_max()).append("\t\t");
				result.append("最低气温(℃)：").append(m.getTem_min()).append("\t\t");
				result.append("平均气温(℃)：").append(m.getTem_avg()).append("\n");
			}
		}
		return result.toString();
	}
}

class MonthlyMete{
	private String year;
	private String month;
	private String pre;
	private String tem_max;
	private String tem_min;
	private String tem_avg;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getPre() {
		return pre;
	}
	public void setPre(String pre) {
		this.pre = pre;
	}
	public String getTem_max() {
		return tem_max;
	}
	public void setTem_max(String tem_max) {
		this.tem_max = tem_max;
	}
	public String getTem_min() {
		return tem_min;
	}
	public void setTem_min(String tem_min) {
		this.tem_min = tem_min;
	}
	public String getTem_avg() {
		return tem_avg;
	}
	public void setTem_avg(String tem_avg) {
		this.tem_avg = tem_avg;
	}
}
