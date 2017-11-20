package com.igreen.common.model;

import java.util.Date;
import java.util.Map;

import com.igreen.common.util.IgreenUtil;

/**
 * 描述:executed_item表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class ExecutedItem {
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
     * 案件状态
     */
    private String caseStatus;

    /**
     * 案号
     */
    private String caseNo;

    /**
     * 执行标的
     */
    private String executeTarget;

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
    
    public ExecutedItem() {
		super();
	}
    
    public ExecutedItem(Map<String, String> params) {
		super();
		this.registItemId = IgreenUtil.getInteger("registItemId", params);
	    this.caseFilingTime = IgreenUtil.getString("caseFilingTime", params);
	    this.caseStatus = IgreenUtil.getString("caseStatus", params);
	    this.caseNo = IgreenUtil.getString("caseNo", params);
	    this.executeTarget = IgreenUtil.getString("executeTarget", params);
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
     * 案件状态
     * @return case_status 案件状态
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * 案件状态
     * @param caseStatus 案件状态
     */
    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus == null ? null : caseStatus.trim();
    }

    /**
     * 案号
     * @return case_no 案号
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * 案号
     * @param caseNo 案号
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    /**
     * 执行标的
     * @return execute_target 执行标的
     */
    public String getExecuteTarget() {
        return executeTarget;
    }

    /**
     * 执行标的
     * @param executeTarget 执行标的
     */
    public void setExecuteTarget(String executeTarget) {
        this.executeTarget = executeTarget == null ? null : executeTarget.trim();
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