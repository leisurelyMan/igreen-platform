package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:brand表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class Brand {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 商标名称
     */
    private String brandName;

    /**
     * 申请日期
     */
    private String applyTime;

    /**
     * 商标状态
     */
    private String brandStatus;

    /**
     * 注册号
     */
    private String registNo;

    /**
     * 类别
     */
    private String brandType;

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
     * 商标名称
     * @return brand_name 商标名称
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 商标名称
     * @param brandName 商标名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * 申请日期
     * @return apply_time 申请日期
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * 申请日期
     * @param applyTime 申请日期
     */
    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    /**
     * 商标状态
     * @return brand_status 商标状态
     */
    public String getBrandStatus() {
        return brandStatus;
    }

    /**
     * 商标状态
     * @param brandStatus 商标状态
     */
    public void setBrandStatus(String brandStatus) {
        this.brandStatus = brandStatus == null ? null : brandStatus.trim();
    }

    /**
     * 注册号
     * @return regist_no 注册号
     */
    public String getRegistNo() {
        return registNo;
    }

    /**
     * 注册号
     * @param registNo 注册号
     */
    public void setRegistNo(String registNo) {
        this.registNo = registNo == null ? null : registNo.trim();
    }

    /**
     * 类别
     * @return brand_type 类别
     */
    public String getBrandType() {
        return brandType;
    }

    /**
     * 类别
     * @param brandType 类别
     */
    public void setBrandType(String brandType) {
        this.brandType = brandType == null ? null : brandType.trim();
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