package com.igreen.common.model;

import java.util.Date;

public class SysRole {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String shortName;
    
    /**
     * 选中状态，用于前台树生成
     */
    private boolean checked;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
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

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	@Override
	public String toString() {
		return "SysRole [id=" + id + ", name=" + name + ", shortName=" + shortName + ", checked=" + checked
				+ ", status=" + status + ", creater=" + creater + ", createdTime=" + createdTime + ", updater="
				+ updater + ", updatedTime=" + updatedTime + ", remark=" + remark + "]";
	}
    
}