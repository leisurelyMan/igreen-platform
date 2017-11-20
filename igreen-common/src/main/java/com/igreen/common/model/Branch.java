package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:branch表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class Branch {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 分支机构名称
     */
    private String branchName;

    /**
     * 分支机构企业注册号
     */
    private String branchRegistNo;

    /**
     * 分支机构负责人
     */
    private String principal;

    /**
     * 一般经营项目
     */
    private String general;

    /**
     * 分支机构地址
     */
    private String address;

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
     * 分支机构名称
     * @return branch_name 分支机构名称
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * 分支机构名称
     * @param branchName 分支机构名称
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    /**
     * 分支机构企业注册号
     * @return branch_regist_no 分支机构企业注册号
     */
    public String getBranchRegistNo() {
        return branchRegistNo;
    }

    /**
     * 分支机构企业注册号
     * @param branchRegistNo 分支机构企业注册号
     */
    public void setBranchRegistNo(String branchRegistNo) {
        this.branchRegistNo = branchRegistNo == null ? null : branchRegistNo.trim();
    }

    /**
     * 分支机构负责人
     * @return principal 分支机构负责人
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * 分支机构负责人
     * @param principal 分支机构负责人
     */
    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    /**
     * 一般经营项目
     * @return general 一般经营项目
     */
    public String getGeneral() {
        return general;
    }

    /**
     * 一般经营项目
     * @param general 一般经营项目
     */
    public void setGeneral(String general) {
        this.general = general == null ? null : general.trim();
    }

    /**
     * 分支机构地址
     * @return address 分支机构地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 分支机构地址
     * @param address 分支机构地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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