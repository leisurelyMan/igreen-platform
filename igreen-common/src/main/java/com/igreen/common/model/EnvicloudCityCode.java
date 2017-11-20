package com.igreen.common.model;

/**
 * 环境云城市编码表
 * @author cuiwei
 *
 */
public class EnvicloudCityCode {
	private Integer id;
	/**
	 * 城市编码
	 */
	private String areaId;
	/**
	 * 城市名称-英文
	 */
	private String nameEn;
	/**
	 * 城市名称-中文
	 */
	private String nameCn;
	/**
	 * 自治区名称-英文
	 */
	private String districtEn;
	/**
	 * 自治区名称-中文
	 */
	private String districtCn;
	/**
	 * 省名称-英文
	 */
	private String provEn;
	/**
	 * 省名称-中文
	 */
	private String provCn;
	/**
	 * 国家名称-英文
	 */
	private String nationEn;
	/**
	 * 国家名称-中文
	 */
	private String nationCn;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getNameEn() {
		return nameEn;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}
	public String getNameCn() {
		return nameCn;
	}
	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}
	public String getDistrictEn() {
		return districtEn;
	}
	public void setDistrictEn(String districtEn) {
		this.districtEn = districtEn;
	}
	public String getDistrictCn() {
		return districtCn;
	}
	public void setDistrictCn(String districtCn) {
		this.districtCn = districtCn;
	}
	public String getProvEn() {
		return provEn;
	}
	public void setProvEn(String provEn) {
		this.provEn = provEn;
	}
	public String getProvCn() {
		return provCn;
	}
	public void setProvCn(String provCn) {
		this.provCn = provCn;
	}
	public String getNationEn() {
		return nationEn;
	}
	public void setNationEn(String nationEn) {
		this.nationEn = nationEn;
	}
	public String getNationCn() {
		return nationCn;
	}
	public void setNationCn(String nationCn) {
		this.nationCn = nationCn;
	}
}
