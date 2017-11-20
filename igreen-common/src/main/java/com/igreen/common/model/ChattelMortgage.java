package com.igreen.common.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:chattel_mortgage表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class ChattelMortgage {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 抵押ID
     */
    private String mortgageId;

    /**
     * 抵押人
     */
    private String mortgagee;

    /**
     * 抵押权人
     */
    private String pledgee;

    /**
     * 登记机关
     */
    private String registOffice;

    /**
     * 登记日期
     */
    private String registTime;

    /**
     * 状态标识
     */
    private String mortgageStatus;

    /**
     * 登记证号
     */
    private String registNo;

    /**
     * 申请抵押原因
     */
    private String mortgageReason;

    /**
     * 被担保主债权种类
     */
    private String creditorType;

    /**
     * 被担保主债权数额(万元)
     */
    private BigDecimal creditorAmount;

    /**
     * 履约起始日期
     */
    private String beginTime;

    /**
     * 履约截止日期
     */
    private String endTime;

    /**
     * 注销日期
     */
    private String cancelTime;

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
     * 抵押ID
     * @return mortgage_id 抵押ID
     */
    public String getMortgageId() {
        return mortgageId;
    }

    /**
     * 抵押ID
     * @param mortgageId 抵押ID
     */
    public void setMortgageId(String mortgageId) {
        this.mortgageId = mortgageId == null ? null : mortgageId.trim();
    }

    /**
     * 抵押人
     * @return mortgagee 抵押人
     */
    public String getMortgagee() {
        return mortgagee;
    }

    /**
     * 抵押人
     * @param mortgagee 抵押人
     */
    public void setMortgagee(String mortgagee) {
        this.mortgagee = mortgagee == null ? null : mortgagee.trim();
    }

    /**
     * 抵押权人
     * @return pledgee 抵押权人
     */
    public String getPledgee() {
        return pledgee;
    }

    /**
     * 抵押权人
     * @param pledgee 抵押权人
     */
    public void setPledgee(String pledgee) {
        this.pledgee = pledgee == null ? null : pledgee.trim();
    }

    /**
     * 登记机关
     * @return regist_office 登记机关
     */
    public String getRegistOffice() {
        return registOffice;
    }

    /**
     * 登记机关
     * @param registOffice 登记机关
     */
    public void setRegistOffice(String registOffice) {
        this.registOffice = registOffice == null ? null : registOffice.trim();
    }

    /**
     * 登记日期
     * @return regist_time 登记日期
     */
    public String getRegistTime() {
        return registTime;
    }

    /**
     * 登记日期
     * @param registTime 登记日期
     */
    public void setRegistTime(String registTime) {
        this.registTime = registTime == null ? null : registTime.trim();
    }

    /**
     * 状态标识
     * @return mortgage_status 状态标识
     */
    public String getMortgageStatus() {
        return mortgageStatus;
    }

    /**
     * 状态标识
     * @param mortgageStatus 状态标识
     */
    public void setMortgageStatus(String mortgageStatus) {
        this.mortgageStatus = mortgageStatus == null ? null : mortgageStatus.trim();
    }

    /**
     * 登记证号
     * @return regist_no 登记证号
     */
    public String getRegistNo() {
        return registNo;
    }

    /**
     * 登记证号
     * @param registNo 登记证号
     */
    public void setRegistNo(String registNo) {
        this.registNo = registNo == null ? null : registNo.trim();
    }

    /**
     * 申请抵押原因
     * @return mortgage_reason 申请抵押原因
     */
    public String getMortgageReason() {
        return mortgageReason;
    }

    /**
     * 申请抵押原因
     * @param mortgageReason 申请抵押原因
     */
    public void setMortgageReason(String mortgageReason) {
        this.mortgageReason = mortgageReason == null ? null : mortgageReason.trim();
    }

    /**
     * 被担保主债权种类
     * @return creditor_type 被担保主债权种类
     */
    public String getCreditorType() {
        return creditorType;
    }

    /**
     * 被担保主债权种类
     * @param creditorType 被担保主债权种类
     */
    public void setCreditorType(String creditorType) {
        this.creditorType = creditorType == null ? null : creditorType.trim();
    }

    /**
     * 被担保主债权数额(万元)
     * @return creditor_amount 被担保主债权数额(万元)
     */
    public BigDecimal getCreditorAmount() {
        return creditorAmount;
    }

    /**
     * 被担保主债权数额(万元)
     * @param creditorAmount 被担保主债权数额(万元)
     */
    public void setCreditorAmount(BigDecimal creditorAmount) {
        this.creditorAmount = creditorAmount;
    }

    /**
     * 履约起始日期
     * @return begin_time 履约起始日期
     */
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * 履约起始日期
     * @param beginTime 履约起始日期
     */
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    /**
     * 履约截止日期
     * @return end_time 履约截止日期
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 履约截止日期
     * @param endTime 履约截止日期
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * 注销日期
     * @return cancel_time 注销日期
     */
    public String getCancelTime() {
        return cancelTime;
    }

    /**
     * 注销日期
     * @param cancelTime 注销日期
     */
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime == null ? null : cancelTime.trim();
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