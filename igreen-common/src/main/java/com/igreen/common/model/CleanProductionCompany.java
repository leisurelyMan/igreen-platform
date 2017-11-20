package com.igreen.common.model;

import java.util.Date;

/**
 * 环保部清洁生产企业
 *
 */
public class CleanProductionCompany {
	/**
     * id
     */
    private Integer id;
    /**
     * 登记信息表主键
     */
    private Integer registItemId;
    /**
     * 年份
     */
    private String year;
    /**
     * 批次
     */
    private String batchNo;
    /**
     * 城市
     */
    private String city;
    /**
     * 编号
     */
    private String serialNumber;
    /**
     * 企业名称
     */
    private String companyName;
    /**
     * 行业
     */
    private String trade;
    /**
     * 主要产品及年产量
     */
    private String productSalesAmount;
    /**
     *所属地区
     */
    private String region;
    /**
     *地址
     */
    private String address;
    /**
     *公布时间
     */
    private String reportTime;
    /**
     *提交审核时间
     */
    private String submitCheckTime;
    /**
     *完成评估时间
     */
    private String completeEstimateTime;
    /**
     *完成验收时间
     */
    private String completeCheckTime;
    /**
     *审核咨询机构名称
     */
    private String checkOrganization;
    /**
     *创建时间
     */
    private Date createTm;
    
	public Date getCreateTm() {
		return createTm;
	}
	public void setCreateTm(Date createTm) {
		this.createTm = createTm;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getRegistItemId() {
		return registItemId;
	}
	public void setRegistItemId(Integer registItemId) {
		this.registItemId = registItemId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}
	public String getProductSalesAmount() {
		return productSalesAmount;
	}
	public void setProductSalesAmount(String productSalesAmount) {
		this.productSalesAmount = productSalesAmount;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReportTime() {
		return reportTime;
	}
	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}
	public String getSubmitCheckTime() {
		return submitCheckTime;
	}
	public void setSubmitCheckTime(String submitCheckTime) {
		this.submitCheckTime = submitCheckTime;
	}
	public String getCompleteEstimateTime() {
		return completeEstimateTime;
	}
	public void setCompleteEstimateTime(String completeEstimateTime) {
		this.completeEstimateTime = completeEstimateTime;
	}
	public String getCompleteCheckTime() {
		return completeCheckTime;
	}
	public void setCompleteCheckTime(String completeCheckTime) {
		this.completeCheckTime = completeCheckTime;
	}
	public String getCheckOrganization() {
		return checkOrganization;
	}
	public void setCheckOrganization(String checkOrganization) {
		this.checkOrganization = checkOrganization;
	}
}
