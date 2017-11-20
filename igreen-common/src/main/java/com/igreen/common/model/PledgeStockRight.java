package com.igreen.common.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:pledge_stock_right表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class PledgeStockRight {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 质权人姓名
     */
    private String pledgee;

    /**
     * 出质人类别
     */
    private String pledgeeType;

    /**
     * 出质金额
     */
    private BigDecimal pledgeAmount;

    /**
     * 出质备案日期
     */
    private String recordTime;

    /**
     * 出质审批部门
     */
    private String examinedOffice;

    /**
     * 出质批准日期
     */
    private String examinedTime;

    /**
     * 出质截至日期
     */
    private String examinedEndTime;

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
     * 质权人姓名
     * @return pledgee 质权人姓名
     */
    public String getPledgee() {
        return pledgee;
    }

    /**
     * 质权人姓名
     * @param pledgee 质权人姓名
     */
    public void setPledgee(String pledgee) {
        this.pledgee = pledgee == null ? null : pledgee.trim();
    }

    /**
     * 出质人类别
     * @return pledgee_type 出质人类别
     */
    public String getPledgeeType() {
        return pledgeeType;
    }

    /**
     * 出质人类别
     * @param pledgeeType 出质人类别
     */
    public void setPledgeeType(String pledgeeType) {
        this.pledgeeType = pledgeeType == null ? null : pledgeeType.trim();
    }

    /**
     * 出质金额
     * @return pledge_amount 出质金额
     */
    public BigDecimal getPledgeAmount() {
        return pledgeAmount;
    }

    /**
     * 出质金额
     * @param pledgeAmount 出质金额
     */
    public void setPledgeAmount(BigDecimal pledgeAmount) {
        this.pledgeAmount = pledgeAmount;
    }

    /**
     * 出质备案日期
     * @return record_time 出质备案日期
     */
    public String getRecordTime() {
        return recordTime;
    }

    /**
     * 出质备案日期
     * @param recordTime 出质备案日期
     */
    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime == null ? null : recordTime.trim();
    }

    /**
     * 出质审批部门
     * @return examined_office 出质审批部门
     */
    public String getExaminedOffice() {
        return examinedOffice;
    }

    /**
     * 出质审批部门
     * @param examinedOffice 出质审批部门
     */
    public void setExaminedOffice(String examinedOffice) {
        this.examinedOffice = examinedOffice == null ? null : examinedOffice.trim();
    }

    /**
     * 出质批准日期
     * @return examined_time 出质批准日期
     */
    public String getExaminedTime() {
        return examinedTime;
    }

    /**
     * 出质批准日期
     * @param examinedTime 出质批准日期
     */
    public void setExaminedTime(String examinedTime) {
        this.examinedTime = examinedTime == null ? null : examinedTime.trim();
    }

    /**
     * 出质截至日期
     * @return examined_end_time 出质截至日期
     */
    public String getExaminedEndTime() {
        return examinedEndTime;
    }

    /**
     * 出质截至日期
     * @param examinedEndTime 出质截至日期
     */
    public void setExaminedEndTime(String examinedEndTime) {
        this.examinedEndTime = examinedEndTime == null ? null : examinedEndTime.trim();
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