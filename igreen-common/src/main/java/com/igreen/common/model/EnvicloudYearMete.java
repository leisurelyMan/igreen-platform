package com.igreen.common.model;

import java.util.List;

public class EnvicloudYearMete extends EnvicloudBase{
	private String citycode;
	private List<YearMete> info;
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public List<YearMete> getInfo() {
		return info;
	}
	public void setInfo(List<YearMete> info) {
		this.info = info;
	}
	
	@Override
	public String toString( ){
		StringBuilder result = new StringBuilder( );
		result.append("查询结果：").append(this.getRdesc()).append("\n");
		result.append("详情：").append("\n");
		if(info != null){
			for(YearMete m:info){
				result.append("年份：").append(m.getYear()).append("\t");
				if(m.getPre_full() != null){
					result.append("年降水量(mm)：").append(m.getPre_full()).append("\t\t");
				}
				if(m.getTem_jan() != null){
					result.append("一月平均气温(℃)：").append(m.getTem_jan()).append("\t\t");
				}
				if(m.getTem_july() != null){
					result.append("七月平均气温(℃)：").append(m.getTem_july()).append("\t\t");
				}
				result.append("\n");
			}
		}
		return result.toString();
	}
}

class YearMete{
	private String year;
	private String pre_full;
	private String tem_jan;
	private String tem_july;
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getPre_full() {
		return pre_full;
	}
	public void setPre_full(String pre_full) {
		this.pre_full = pre_full;
	}
	public String getTem_jan() {
		return tem_jan;
	}
	public void setTem_jan(String tem_jan) {
		this.tem_jan = tem_jan;
	}
	public String getTem_july() {
		return tem_july;
	}
	public void setTem_july(String tem_july) {
		this.tem_july = tem_july;
	}
}