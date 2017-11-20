package com.igreen.common.model;

import java.util.Date;

/**
 * 环保举报案件情况
 * @author cuiwei
 *
 */
public class EnvironmentalIssue {
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
    private String reportSequence;
    /**
     * 年份
     */
    private String reportYear;
    /**
     * 月份
     */
    private String reportMonth;
    /**
     * 省份
     */
    private String province;
    /**
     * 涉及企业
     */
    private String companyName;
    /**
     * 存在问题
     */
    private String reportIssue;
    /**
     * 处理情况
     */
    private String dealResult;
    /**
     * 备注
     */
    private String reportComment;
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

	public String getReportSequence() {
		return reportSequence;
	}

	public void setReportSequence(String reportSequence) {
		this.reportSequence = reportSequence;
	}

	public String getReportYear() {
		return reportYear;
	}

	public void setReportYear(String reportYear) {
		this.reportYear = reportYear;
	}

	public String getReportMonth() {
		return reportMonth;
	}

	public void setReportMonth(String reportMonth) {
		this.reportMonth = reportMonth;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getReportIssue() {
		return reportIssue;
	}

	public void setReportIssue(String reportIssue) {
		this.reportIssue = reportIssue;
	}

	public String getDealResult() {
		return dealResult;
	}

	public void setDealResult(String dealResult) {
		this.dealResult = dealResult;
	}

	public String getReportComment() {
		return reportComment;
	}

	public void setReportComment(String reportComment) {
		this.reportComment = reportComment;
	}
}
