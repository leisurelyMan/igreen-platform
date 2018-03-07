package com.igreen.boss.dto;

import com.igreen.common.util.StrUtil;

public class IpeSearchDto {

	private String words;
	private String province;
	private String city;
	private String district;
	private String time;
	private String address;
	private String year;
	private String companyName;
	
	private static String keys = "总汞,总镉,总铬,六价铬,总砷,总铅,总镍,苯并(a)芘,总铍,总银,生化需氧量,BOD5,化学需氧量,COD,"
			+ "总有机碳,TOC,石油类,动植物油,挥发酚,总氰化物,硫化物,氨氮,氟化物,甲醛,苯胺类,硝基苯类,阴离子表面活性剂(LAS)总铜,总锌,"
			+ "总锰,彩色显影剂(CD-2),总磷,元素磷(以P计),有机磷农药(以P计),乐果,甲基对硫磷,马拉硫磷,对硫磷,.五氯酚及五氯酚钠(以五氯酚计),"
			+ "三氯甲烷,可吸附有机卤化物(AOX)(以Cl计),四氯化碳,三氯乙烯,四氯乙烯,.苯,甲苯乙苯,邻－二甲苯,对－二甲苯,间－二甲苯,氯苯,"
			+ "邻二氯苯,对二氯苯,对硝基氯苯,2.4－二硝基氯苯,苯酚,间－甲酚,2.4－二氯酚,2.4.6-三氯酚,邻苯二甲酸二丁脂,邻苯二甲酸二辛脂,"
			+ "丙烯腈,总硒0.02,PH值,色度,大肠菌群数,余氯量,粪便,江河,湖泊,运河,渠道,水库,下水道,排污口,"
			+ "水污染,水体,（生活/工业）废水,污水,排污费,雨污未分流,排污申报制度,"
			+ "污水排入城镇下水道水质标准,中华人民共和国水污染防治法,污水综合排放标准,中华人民共和国海洋环境保护法";
	
	public IpeSearchDto() {
		super();
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public boolean wordsEmpty(){
		if(StrUtil.isNull(words)&&StrUtil.isNull(province)&&StrUtil.isNull(city)&&StrUtil.isNull(time))
			return true;
		else
			return false;
	}
	
	public boolean isEmpty(){
		if(StrUtil.isNull(words) && StrUtil.isNull(province) 
				&& StrUtil.isNull(city) && StrUtil.isNull(time)
				&& StrUtil.isNull(address) && StrUtil.isNull(year) && StrUtil.isNull(companyName))
			return true;
		else
			return false;
	}
	
	public String[] getArray(){
		String result = "";
		if(words.equals("水污染"))
			words = keys;
		if(!StrUtil.isNull(words))
			result += words;
		if(!StrUtil.isNull(province))
			result += ","+province;
		if(!StrUtil.isNull(city))
			result += ","+city;
		if(!StrUtil.isNull(time))
			result += ","+time;
		return result.split(",");
	}
}
