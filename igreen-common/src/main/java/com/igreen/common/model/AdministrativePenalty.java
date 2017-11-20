package com.igreen.common.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:administrative_penalty表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class AdministrativePenalty {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 案发时间
     */
    private String crimeTime;

    /**
     * 案由
     */
    private String crimeReason;

    /**
     * 案件类型
     */
    private String caseType;

    /**
     * 执行类别
     */
    private String executeType;

    /**
     * 案件结果
     */
    private String caseResult;

    /**
     * 处罚决定书签发日期
     */
    private String punishTime;

    /**
     * 处罚机关
     */
    private String punishOffice;

    /**
     * 主要违法事实
     */
    private String factMalfeasance;

    /**
     * 处罚依据
     */
    private String punishBase;

    /**
     * 处罚种类
     */
    private String punishType;

    /**
     * 处罚结果
     */
    private String punishResult;

    /**
     * 处罚金额
     */
    private BigDecimal punishAmount;

    /**
     * 处罚执行情况
     */
    private String punishment;

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
     * 案发时间
     * @return crime_time 案发时间
     */
    public String getCrimeTime() {
        return crimeTime;
    }

    /**
     * 案发时间
     * @param crimeTime 案发时间
     */
    public void setCrimeTime(String crimeTime) {
        this.crimeTime = crimeTime == null ? null : crimeTime.trim();
    }

    /**
     * 案由
     * @return crime_reason 案由
     */
    public String getCrimeReason() {
        return crimeReason;
    }

    /**
     * 案由
     * @param crimeReason 案由
     */
    public void setCrimeReason(String crimeReason) {
        this.crimeReason = crimeReason == null ? null : crimeReason.trim();
    }

    /**
     * 案件类型
     * @return case_type 案件类型
     */
    public String getCaseType() {
        return caseType;
    }

    /**
     * 案件类型
     * @param caseType 案件类型
     */
    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

    /**
     * 执行类别
     * @return execute_type 执行类别
     */
    public String getExecuteType() {
        return executeType;
    }

    /**
     * 执行类别
     * @param executeType 执行类别
     */
    public void setExecuteType(String executeType) {
        this.executeType = executeType == null ? null : executeType.trim();
    }

    /**
     * 案件结果
     * @return case_result 案件结果
     */
    public String getCaseResult() {
        return caseResult;
    }

    /**
     * 案件结果
     * @param caseResult 案件结果
     */
    public void setCaseResult(String caseResult) {
        this.caseResult = caseResult == null ? null : caseResult.trim();
    }

    /**
     * 处罚决定书签发日期
     * @return punish_time 处罚决定书签发日期
     */
    public String getPunishTime() {
        return punishTime;
    }

    /**
     * 处罚决定书签发日期
     * @param punishTime 处罚决定书签发日期
     */
    public void setPunishTime(String punishTime) {
        this.punishTime = punishTime == null ? null : punishTime.trim();
    }

    /**
     * 处罚机关
     * @return punish_office 处罚机关
     */
    public String getPunishOffice() {
        return punishOffice;
    }

    /**
     * 处罚机关
     * @param punishOffice 处罚机关
     */
    public void setPunishOffice(String punishOffice) {
        this.punishOffice = punishOffice == null ? null : punishOffice.trim();
    }

    /**
     * 主要违法事实
     * @return fact_malfeasance 主要违法事实
     */
    public String getFactMalfeasance() {
        return factMalfeasance;
    }

    /**
     * 主要违法事实
     * @param factMalfeasance 主要违法事实
     */
    public void setFactMalfeasance(String factMalfeasance) {
        this.factMalfeasance = factMalfeasance == null ? null : factMalfeasance.trim();
    }

    /**
     * 处罚依据
     * @return punish_base 处罚依据
     */
    public String getPunishBase() {
        return punishBase;
    }

    /**
     * 处罚依据
     * @param punishBase 处罚依据
     */
    public void setPunishBase(String punishBase) {
        this.punishBase = punishBase == null ? null : punishBase.trim();
    }

    /**
     * 处罚种类
     * @return punish_type 处罚种类
     */
    public String getPunishType() {
        return punishType;
    }

    /**
     * 处罚种类
     * @param punishType 处罚种类
     */
    public void setPunishType(String punishType) {
        this.punishType = punishType == null ? null : punishType.trim();
    }

    /**
     * 处罚结果
     * @return punish_result 处罚结果
     */
    public String getPunishResult() {
        return punishResult;
    }

    /**
     * 处罚结果
     * @param punishResult 处罚结果
     */
    public void setPunishResult(String punishResult) {
        this.punishResult = punishResult == null ? null : punishResult.trim();
    }

    /**
     * 处罚金额
     * @return punish_amount 处罚金额
     */
    public BigDecimal getPunishAmount() {
        return punishAmount;
    }

    /**
     * 处罚金额
     * @param punishAmount 处罚金额
     */
    public void setPunishAmount(BigDecimal punishAmount) {
        this.punishAmount = punishAmount;
    }

    /**
     * 处罚执行情况
     * @return punishment 处罚执行情况
     */
    public String getPunishment() {
        return punishment;
    }

    /**
     * 处罚执行情况
     * @param punishment 处罚执行情况
     */
    public void setPunishment(String punishment) {
        this.punishment = punishment == null ? null : punishment.trim();
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