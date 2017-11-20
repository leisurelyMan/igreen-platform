package com.igreen.common.model;

import java.util.Date;
import java.util.Map;

import com.igreen.common.util.IgreenUtil;

/**
 * 描述:break_promise_executed表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class BreakPromiseExecuted {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 立案时间
     */
    private String caseFilingTime;

    /**
     * 法定代表人
     */
    private String legalPerson;

    /**
     * 组织机构号
     */
    private String organizationNo;

    /**
     * 生效法律文书确定的义务
     */
    private String obligation;

    /**
     * 失信被执行人为具体情形
     */
    private String executedCondition;

    /**
     * 被执行人的履行情况
     */
    private String performCondition;

    /**
     * 全部未履行
     */
    private String nonperforming;

    /**
     * 公布时间
     */
    private String publishTime;

    /**
     * 省份
     */
    private String province;

    /**
     * 执行依据文号
     */
    private String accordingNo;

    /**
     * 执行法院
     */
    private String executeCourt;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建者
     */
    private Integer creater;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新者
     */
    private Integer updater;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 备注
     */
    private String remark;
    
    public BreakPromiseExecuted() {
		super();
	}
    
	public BreakPromiseExecuted(Map<String, String> params) {
		super();
		this.registItemId = IgreenUtil.getInteger("registItemId", params);
	    this.caseFilingTime = IgreenUtil.getString("caseFilingTime", params);
	    this.legalPerson = IgreenUtil.getString("legalPerson", params);
	    this.organizationNo = IgreenUtil.getString("organizationNo", params);
	    this.obligation = IgreenUtil.getString("obligation", params);
	    this.executedCondition = IgreenUtil.getString("executedCondition", params);
	    this.performCondition = IgreenUtil.getString("performCondition", params);
	    this.nonperforming = IgreenUtil.getString("nonperforming", params);
	    this.publishTime = IgreenUtil.getString("publishTime", params);
	    this.province = IgreenUtil.getString("province", params);
	    this.accordingNo = IgreenUtil.getString("accordingNo", params);
	    this.executeCourt = IgreenUtil.getString("executeCourt", params);
	    this.status = 1;
	    this.creater = IgreenUtil.getInteger("creater", params);
	    this.createdTime = new Date();
	}

	/**
     * id
     * @return id id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 登记信息ID
     * @return regist_item_id 登记信息ID
     */
    public Integer getRegistItemId() {
        return registItemId;
    }

    /**
     * 登记信息ID
     * @param registItemId 登记信息ID
     */
    public void setRegistItemId(Integer registItemId) {
        this.registItemId = registItemId;
    }

    /**
     * 立案时间
     * @return case_filing_time 立案时间
     */
    public String getCaseFilingTime() {
        return caseFilingTime;
    }

    /**
     * 立案时间
     * @param caseFilingTime 立案时间
     */
    public void setCaseFilingTime(String caseFilingTime) {
        this.caseFilingTime = caseFilingTime == null ? null : caseFilingTime.trim();
    }

    /**
     * 法定代表人
     * @return legal_person 法定代表人
     */
    public String getLegalPerson() {
        return legalPerson;
    }

    /**
     * 法定代表人
     * @param legalPerson 法定代表人
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    /**
     * 组织机构号
     * @return organization_no 组织机构号
     */
    public String getOrganizationNo() {
        return organizationNo;
    }

    /**
     * 组织机构号
     * @param organizationNo 组织机构号
     */
    public void setOrganizationNo(String organizationNo) {
        this.organizationNo = organizationNo == null ? null : organizationNo.trim();
    }

    /**
     * 生效法律文书确定的义务
     * @return obligation 生效法律文书确定的义务
     */
    public String getObligation() {
        return obligation;
    }

    /**
     * 生效法律文书确定的义务
     * @param obligation 生效法律文书确定的义务
     */
    public void setObligation(String obligation) {
        this.obligation = obligation == null ? null : obligation.trim();
    }

    /**
     * 失信被执行人为具体情形
     * @return executed_condition 失信被执行人为具体情形
     */
    public String getExecutedCondition() {
        return executedCondition;
    }

    /**
     * 失信被执行人为具体情形
     * @param executedCondition 失信被执行人为具体情形
     */
    public void setExecutedCondition(String executedCondition) {
        this.executedCondition = executedCondition == null ? null : executedCondition.trim();
    }

    /**
     * 被执行人的履行情况
     * @return perform_condition 被执行人的履行情况
     */
    public String getPerformCondition() {
        return performCondition;
    }

    /**
     * 被执行人的履行情况
     * @param performCondition 被执行人的履行情况
     */
    public void setPerformCondition(String performCondition) {
        this.performCondition = performCondition == null ? null : performCondition.trim();
    }

    /**
     * 全部未履行
     * @return nonperforming 全部未履行
     */
    public String getNonperforming() {
        return nonperforming;
    }

    /**
     * 全部未履行
     * @param nonperforming 全部未履行
     */
    public void setNonperforming(String nonperforming) {
        this.nonperforming = nonperforming == null ? null : nonperforming.trim();
    }

    /**
     * 公布时间
     * @return publish_time 公布时间
     */
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * 公布时间
     * @param publishTime 公布时间
     */
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
    }

    /**
     * 省份
     * @return province 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省份
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 执行依据文号
     * @return according_no 执行依据文号
     */
    public String getAccordingNo() {
        return accordingNo;
    }

    /**
     * 执行依据文号
     * @param accordingNo 执行依据文号
     */
    public void setAccordingNo(String accordingNo) {
        this.accordingNo = accordingNo == null ? null : accordingNo.trim();
    }

    /**
     * 执行法院
     * @return execute_court 执行法院
     */
    public String getExecuteCourt() {
        return executeCourt;
    }

    /**
     * 执行法院
     * @param executeCourt 执行法院
     */
    public void setExecuteCourt(String executeCourt) {
        this.executeCourt = executeCourt == null ? null : executeCourt.trim();
    }

    /**
     * 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建者
     * @return creater 创建者
     */
    public Integer getCreater() {
        return creater;
    }

    /**
     * 创建者
     * @param creater 创建者
     */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /**
     * 创建时间
     * @return created_time 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 创建时间
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 更新者
     * @return updater 更新者
     */
    public Integer getUpdater() {
        return updater;
    }

    /**
     * 更新者
     * @param updater 更新者
     */
    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    /**
     * 更新时间
     * @return updated_time 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 更新时间
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}