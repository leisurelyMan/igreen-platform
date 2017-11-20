package com.igreen.common.model;

import java.util.Date;

public class SysMenu {
	
    /**
     * ID
     */
    private Integer id;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单链接
     */
    private String url;

    /**
     * 上级菜单序号
     */
    private Integer parentId;

    /**
     * 排序号
     */
    private Integer orderNum;
    
    /**
     * 选中状态，用于前台树生成
     */
    private boolean checked;

    /**
     */
    private String closeIcon;

    /**
     */
    private String openIcon;

    /**
     */
    private Integer status;

    /**
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getCloseIcon() {
        return closeIcon;
    }

    public void setCloseIcon(String closeIcon) {
        this.closeIcon = closeIcon == null ? null : closeIcon.trim();
    }

    public String getOpenIcon() {
        return openIcon;
    }

    public void setOpenIcon(String openIcon) {
        this.openIcon = openIcon == null ? null : openIcon.trim();
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
		return "SysMenu [id=" + id + ", name=" + name + ", url=" + url + ", parentId=" + parentId + ", orderNum="
				+ orderNum + ", checked=" + checked + ", closeIcon=" + closeIcon + ", openIcon=" + openIcon
				+ ", status=" + status + ", creater=" + creater + ", createdTime=" + createdTime + ", updater="
				+ updater + ", updatedTime=" + updatedTime + ", remark=" + remark + "]";
	}
    
    
}