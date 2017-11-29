package com.igreen.common.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PollutionDischargeLicense {
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	private Integer id;
	/*
	 * 企业表主键
	 */
	private Integer registItemId;
	/*
	 * 省/直辖市
	 */
	private String province;
	/*
	 * 城市
	 */
	private String city;
	/*
	* 许可证编号
	*/
	private String licenseNumber;
	/*
	* 单位名称
	*/
	private String companyName;
	/*
	* 行业类别
	*/
	private String industry;
	/*
	* 有效期限-字符串表示
	*/
	private String validDate;
	/*
	* 有效起始期限
	*/
	private Date startValidDate;
	/*
	* 有效截止期限
	*/
	private Date endValidDate;
	/*
	* 发证日期
	*/
	private Date certificateDate;
	/*
	* 详细信息ID
	*/
	private String dataId;
	/*
	* 公司地址
	*/
	private String address;
	/*
	* 发证机关
	*/
	private String certificateOrganization;
	/*
	* 主要污染物类别
	*/
	private String pollutionType;
	/*
	* 大气主要污染物种类
	*/
	private String airPollutionType;
	/*
	* 大气污染物排放规律
	*/
	private String airPollutionDischargeRule;
	/*
	* 大气污染物排放执行标准
	*/
	private String airPollutionDischargeStandard;
	/*
	* 废水主要污染物种类
	*/
	private String waterPollutionType;
	/*
	* 废水污染物排放规律
	*/
	private String waterPollutionDischargeRule;
	/*
	* 废水污染物排放执行标准
	*/
	private String waterPollutionDischargeStandard;
	/*
	* 排污权使用和交易信息
	*/
	private String pollutionTrade;
	
	public String getCertificateDateStr( ){
		return certificateDate !=null ? sdf.format(this.certificateDate) : "";
	}
	
	public Integer getRegistItemId() {
		return registItemId;
	}

	public void setRegistItemId(Integer registItemId) {
		this.registItemId = registItemId;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Date getStartValidDate() {
		return startValidDate;
	}

	public void setStartValidDate(Date startValidDate) {
		this.startValidDate = startValidDate;
	}

	public Date getEndValidDate() {
		return endValidDate;
	}

	public void setEndValidDate(Date endValidDate) {
		this.endValidDate = endValidDate;
	}

	public Date getCertificateDate() {
		return certificateDate;
	}

	public void setCertificateDate(Date certificateDate) {
		this.certificateDate = certificateDate;
	}

	public String getDataId() {
		return dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCertificateOrganization() {
		return certificateOrganization;
	}

	public void setCertificateOrganization(String certificateOrganization) {
		this.certificateOrganization = certificateOrganization;
	}

	public String getPollutionType() {
		return pollutionType;
	}

	public void setPollutionType(String pollutionType) {
		this.pollutionType = pollutionType;
	}

	public String getAirPollutionType() {
		return airPollutionType;
	}

	public void setAirPollutionType(String airPollutionType) {
		this.airPollutionType = airPollutionType;
	}

	public String getAirPollutionDischargeRule() {
		return airPollutionDischargeRule;
	}

	public void setAirPollutionDischargeRule(String airPollutionDischargeRule) {
		this.airPollutionDischargeRule = airPollutionDischargeRule;
	}

	public String getAirPollutionDischargeStandard() {
		return airPollutionDischargeStandard;
	}

	public void setAirPollutionDischargeStandard(
			String airPollutionDischargeStandard) {
		this.airPollutionDischargeStandard = airPollutionDischargeStandard;
	}

	public String getWaterPollutionType() {
		return waterPollutionType;
	}

	public void setWaterPollutionType(String waterPollutionType) {
		this.waterPollutionType = waterPollutionType;
	}

	public String getWaterPollutionDischargeRule() {
		return waterPollutionDischargeRule;
	}

	public void setWaterPollutionDischargeRule(String waterPollutionDischargeRule) {
		this.waterPollutionDischargeRule = waterPollutionDischargeRule;
	}

	public String getWaterPollutionDischargeStandard() {
		return waterPollutionDischargeStandard;
	}

	public void setWaterPollutionDischargeStandard(
			String waterPollutionDischargeStandard) {
		this.waterPollutionDischargeStandard = waterPollutionDischargeStandard;
	}

	public String getPollutionTrade() {
		return pollutionTrade;
	}

	public void setPollutionTrade(String pollutionTrade) {
		this.pollutionTrade = pollutionTrade;
	}
}
