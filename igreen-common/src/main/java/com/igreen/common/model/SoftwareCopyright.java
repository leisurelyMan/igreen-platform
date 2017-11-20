package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:software_copyright表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class SoftwareCopyright {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 软件名称
     */
    private String softwareName;

    /**
     * 软件简称
     */
    private String softwareShopName;

    /**
     * 登记号
     */
    private String registNo;

    /**
     * 版本号
     */
    private String softwareVersion;

    /**
     * 分类号
     */
    private String classifyNo;

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
     * 软件名称
     * @return software_name 软件名称
     */
    public String getSoftwareName() {
        return softwareName;
    }

    /**
     * 软件名称
     * @param softwareName 软件名称
     */
    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName == null ? null : softwareName.trim();
    }

    /**
     * 软件简称
     * @return software_shop_name 软件简称
     */
    public String getSoftwareShopName() {
        return softwareShopName;
    }

    /**
     * 软件简称
     * @param softwareShopName 软件简称
     */
    public void setSoftwareShopName(String softwareShopName) {
        this.softwareShopName = softwareShopName == null ? null : softwareShopName.trim();
    }

    /**
     * 登记号
     * @return regist_no 登记号
     */
    public String getRegistNo() {
        return registNo;
    }

    /**
     * 登记号
     * @param registNo 登记号
     */
    public void setRegistNo(String registNo) {
        this.registNo = registNo == null ? null : registNo.trim();
    }

    /**
     * 版本号
     * @return software_version 版本号
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * 版本号
     * @param softwareVersion 版本号
     */
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion == null ? null : softwareVersion.trim();
    }

    /**
     * 分类号
     * @return classify_no 分类号
     */
    public String getClassifyNo() {
        return classifyNo;
    }

    /**
     * 分类号
     * @param classifyNo 分类号
     */
    public void setClassifyNo(String classifyNo) {
        this.classifyNo = classifyNo == null ? null : classifyNo.trim();
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