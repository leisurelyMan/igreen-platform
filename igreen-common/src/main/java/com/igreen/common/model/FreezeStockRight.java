package com.igreen.common.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:freeze_stock_right表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class FreezeStockRight {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 冻结文号
     */
    private String freezeNo;

    /**
     * 冻结机关
     */
    private String freezeOffice;

    /**
     * 冻结起始日期
     */
    private String freezeBeginTime;

    /**
     * 冻结截至日期
     */
    private String freezeEndTime;

    /**
     * 冻结金额
     */
    private BigDecimal freezeAmount;

    /**
     * 解冻机关
     */
    private String unfreezeOffice;

    /**
     * 解冻文号
     */
    private String unfreezeNo;

    /**
     * 解冻日期
     */
    private String unfreezeTime;

    /**
     * 解冻说明
     */
    private String unfreezeExplain;

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
     * 冻结文号
     * @return freeze_no 冻结文号
     */
    public String getFreezeNo() {
        return freezeNo;
    }

    /**
     * 冻结文号
     * @param freezeNo 冻结文号
     */
    public void setFreezeNo(String freezeNo) {
        this.freezeNo = freezeNo == null ? null : freezeNo.trim();
    }

    /**
     * 冻结机关
     * @return freeze_office 冻结机关
     */
    public String getFreezeOffice() {
        return freezeOffice;
    }

    /**
     * 冻结机关
     * @param freezeOffice 冻结机关
     */
    public void setFreezeOffice(String freezeOffice) {
        this.freezeOffice = freezeOffice == null ? null : freezeOffice.trim();
    }

    /**
     * 冻结起始日期
     * @return freeze_begin_time 冻结起始日期
     */
    public String getFreezeBeginTime() {
        return freezeBeginTime;
    }

    /**
     * 冻结起始日期
     * @param freezeBeginTime 冻结起始日期
     */
    public void setFreezeBeginTime(String freezeBeginTime) {
        this.freezeBeginTime = freezeBeginTime == null ? null : freezeBeginTime.trim();
    }

    /**
     * 冻结截至日期
     * @return freeze_end_time 冻结截至日期
     */
    public String getFreezeEndTime() {
        return freezeEndTime;
    }

    /**
     * 冻结截至日期
     * @param freezeEndTime 冻结截至日期
     */
    public void setFreezeEndTime(String freezeEndTime) {
        this.freezeEndTime = freezeEndTime == null ? null : freezeEndTime.trim();
    }

    /**
     * 冻结金额
     * @return freeze_amount 冻结金额
     */
    public BigDecimal getFreezeAmount() {
        return freezeAmount;
    }

    /**
     * 冻结金额
     * @param freezeAmount 冻结金额
     */
    public void setFreezeAmount(BigDecimal freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    /**
     * 解冻机关
     * @return unfreeze_office 解冻机关
     */
    public String getUnfreezeOffice() {
        return unfreezeOffice;
    }

    /**
     * 解冻机关
     * @param unfreezeOffice 解冻机关
     */
    public void setUnfreezeOffice(String unfreezeOffice) {
        this.unfreezeOffice = unfreezeOffice == null ? null : unfreezeOffice.trim();
    }

    /**
     * 解冻文号
     * @return unfreeze_no 解冻文号
     */
    public String getUnfreezeNo() {
        return unfreezeNo;
    }

    /**
     * 解冻文号
     * @param unfreezeNo 解冻文号
     */
    public void setUnfreezeNo(String unfreezeNo) {
        this.unfreezeNo = unfreezeNo == null ? null : unfreezeNo.trim();
    }

    /**
     * 解冻日期
     * @return unfreeze_time 解冻日期
     */
    public String getUnfreezeTime() {
        return unfreezeTime;
    }

    /**
     * 解冻日期
     * @param unfreezeTime 解冻日期
     */
    public void setUnfreezeTime(String unfreezeTime) {
        this.unfreezeTime = unfreezeTime == null ? null : unfreezeTime.trim();
    }

    /**
     * 解冻说明
     * @return unfreeze_explain 解冻说明
     */
    public String getUnfreezeExplain() {
        return unfreezeExplain;
    }

    /**
     * 解冻说明
     * @param unfreezeExplain 解冻说明
     */
    public void setUnfreezeExplain(String unfreezeExplain) {
        this.unfreezeExplain = unfreezeExplain == null ? null : unfreezeExplain.trim();
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