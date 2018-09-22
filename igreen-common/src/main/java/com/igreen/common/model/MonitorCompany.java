package com.igreen.common.model;

import java.util.Date;

/**
 * 国家重点监控企业
 * @author cuiwei
 *
 */
public class MonitorCompany {
	/**
     * id
     */
    private Integer id;
    /**
     * 登记信息表主键
     */
    private Integer registItemId;
    /**
     * 序列
     */
    private String monitorSequence;
    /**
     * 行政区划代码
     */
    private String regionCode;
    /**
     * 法人代码
     */
    private String legalPersonCode;
    /**
     * 涉及企业
     */
    private String companyName;
    /**
     * 监控类别
     */
    private String monitorType;
    /**
     * 所属省份
     */
    private String province;
    /**
     * 所属年份
     */
    private String monitorYear;
    /**
     * 创建时间
     */
    private Date createTm;
    
	public Date getCreateTm() {
		return createTm;
	}
	public void setCreateTm(Date createTm) {
		this.createTm = createTm;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRegistItemId() {
		return registItemId;
	}
	public void setRegistItemId(Integer registItemId) {
		this.registItemId = registItemId;
	}
	public String getMonitorSequence() {
		return monitorSequence;
	}
	public void setMonitorSequence(String monitorSequence) {
		this.monitorSequence = monitorSequence;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getLegalPersonCode() {
		return legalPersonCode;
	}
	public void setLegalPersonCode(String legalPersonCode) {
		this.legalPersonCode = legalPersonCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getMonitorType() {
		return monitorType;
	}
	public void setMonitorType(String monitorType) {
		this.monitorType = monitorType;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getMonitorYear() {
		return monitorYear;
	}
	public void setMonitorYear(String monitorYear) {
		this.monitorYear = monitorYear;
	}
}
