package com.igreen.common.model;

import java.util.Date;
import java.util.Map;

import com.igreen.common.util.IgreenUtil;

/**
 * 描述:organization_item表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class OrganizationItem {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 机构代码
     */
    private String organizationCode;

    /**
     * 机构名称
     */
    private String organizationName;

    /**
     * 机构类型
     */
    private String organizationType;

    /**
     * 机构地址
     */
    private String organizationAddress;

    /**
     * 管辖机构
     */
    private String jurisdictionalAgency;

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
    
    public OrganizationItem() {
		super();
	}
    
    public OrganizationItem(Map<String, String> params) {
		super();
		this.registItemId = IgreenUtil.getInteger("registItemId", params);
	    this.organizationCode = IgreenUtil.getString("organizationCode", params);
	    this.organizationName = IgreenUtil.getString("organizationName", params);
	    this.organizationType = IgreenUtil.getString("organizationType", params);
	    this.organizationAddress = IgreenUtil.getString("organizationAddress", params);
	    this.jurisdictionalAgency = IgreenUtil.getString("jurisdictionalAgency", params);
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
     * 机构代码
     * @return organization_code 机构代码
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * 机构代码
     * @param organizationCode 机构代码
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    /**
     * 机构名称
     * @return organization_name 机构名称
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * 机构名称
     * @param organizationName 机构名称
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    /**
     * 机构类型
     * @return organization_type 机构类型
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * 机构类型
     * @param organizationType 机构类型
     */
    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType == null ? null : organizationType.trim();
    }

    /**
     * 机构地址
     * @return organization_address 机构地址
     */
    public String getOrganizationAddress() {
        return organizationAddress;
    }

    /**
     * 机构地址
     * @param organizationAddress 机构地址
     */
    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress == null ? null : organizationAddress.trim();
    }

    /**
     * 管辖机构
     * @return jurisdictional_agency 管辖机构
     */
    public String getJurisdictionalAgency() {
        return jurisdictionalAgency;
    }

    /**
     * 管辖机构
     * @param jurisdictionalAgency 管辖机构
     */
    public void setJurisdictionalAgency(String jurisdictionalAgency) {
        this.jurisdictionalAgency = jurisdictionalAgency == null ? null : jurisdictionalAgency.trim();
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