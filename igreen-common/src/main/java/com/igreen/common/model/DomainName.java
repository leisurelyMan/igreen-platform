package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:domain_name表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class DomainName {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 网址
     */
    private String location;

    /**
     * 网址名称
     */
    private String locationName;

    /**
     * 网站备案/许可证号
     */
    private String licenseKey;

    /**
     * 登记批准日期
     */
    private String approveRegistTime;

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
     * 网址
     * @return location 网址
     */
    public String getLocation() {
        return location;
    }

    /**
     * 网址
     * @param location 网址
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * 网址名称
     * @return location_name 网址名称
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * 网址名称
     * @param locationName 网址名称
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName == null ? null : locationName.trim();
    }

    /**
     * 网站备案/许可证号
     * @return license_key 网站备案/许可证号
     */
    public String getLicenseKey() {
        return licenseKey;
    }

    /**
     * 网站备案/许可证号
     * @param licenseKey 网站备案/许可证号
     */
    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey == null ? null : licenseKey.trim();
    }

    /**
     * 登记批准日期
     * @return approve_regist_time 登记批准日期
     */
    public String getApproveRegistTime() {
        return approveRegistTime;
    }

    /**
     * 登记批准日期
     * @param approveRegistTime 登记批准日期
     */
    public void setApproveRegistTime(String approveRegistTime) {
        this.approveRegistTime = approveRegistTime == null ? null : approveRegistTime.trim();
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