package com.igreen.web.view;

import java.util.Date;
import java.util.List;

import com.igreen.common.model.EnvironmentalIssue;
import com.igreen.common.model.IpeIndustryRecord;
import com.igreen.common.model.MonitorCompany;

public class SearchCompanyInfo {
	
	/*
	 * 公司名称
	 */
	private String companyName;
	
	/*
	 * 地区
	 */
	private String region;  
	
	/*
	 * 行业类别
	 */
	private String industry;
	
	/*
	 * ipe列表
	 */
	private List<IpeIndustryRecord> ipeIndustryRecord;
	
	/*
	* 有效期限-字符串表示
	*/
	private String validDate;
	
	/*
	* 发证日期
	*/
	private String certificateDate;
	
    /*
     * 编号
     */
    private String serialNumber;
   
    /*
     * 主要产品及年产量
     */
    private String productSalesAmount;
   
    /*
     *公布时间
     */
    private String reportTime;
    
    /*
     *提交审核时间
     */
    private String submitCheckTime;
    
    /*
     *完成评估时间
     */
    private String completeEstimateTime;
	    
    /*
     *完成验收时间
     */
    private String completeCheckTime;
   
    /*
     *审核咨询机构名称
     */
    private String checkOrganization;
    
    /**
     * 重点监管企业
     */
    private List<MonitorCompany> monitorCompanys;
    
    /**
     * 群众举报案件
     */
    private List<EnvironmentalIssue> environmentalIssues;
    
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public List<IpeIndustryRecord> getIpeIndustryRecord() {
		return ipeIndustryRecord;
	}

	public void setIpeIndustryRecord(List<IpeIndustryRecord> ipeIndustryRecord) {
		this.ipeIndustryRecord = ipeIndustryRecord;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

	public String getCertificateDate() {
		return certificateDate;
	}

	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getProductSalesAmount() {
		return productSalesAmount;
	}

	public void setProductSalesAmount(String productSalesAmount) {
		this.productSalesAmount = productSalesAmount;
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

	public List<MonitorCompany> getMonitorCompanys() {
		return monitorCompanys;
	}

	public void setMonitorCompanys(List<MonitorCompany> monitorCompanys) {
		this.monitorCompanys = monitorCompanys;
	}

	public List<EnvironmentalIssue> getEnvironmentalIssues() {
		return environmentalIssues;
	}

	public void setEnvironmentalIssues(List<EnvironmentalIssue> environmentalIssues) {
		this.environmentalIssues = environmentalIssues;
	}


	   
}
