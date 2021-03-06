package com.igreen.common.model;

import java.util.Date;

public class SysUserRole {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private Integer roleId;

    /**
     *
     */
    private Integer userId;

    /**
     *
     */
    private Integer status;

    /**
     *
     */
    private Integer creater;

    /**
     *
     */
    private Date createdTime;

    /**
     *
     */
    private Integer updater;

    /**
     *
     */
    private Date updatedTime;

    /**
     *
     */
    private String remark;
    
    public SysUserRole() {
		super();
	}
    
	public SysUserRole(Integer roleId, Integer userId, Integer creater) {
		super();
		this.roleId = roleId;
		this.userId = userId;
		this.creater = creater;
		this.status = 1;
		this.createdTime = new Date();
	}



	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreater() {
        return creater;
    }

    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUpdater() {
        return updater;
    }

    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}