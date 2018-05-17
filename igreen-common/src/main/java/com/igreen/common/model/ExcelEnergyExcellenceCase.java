package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:excel_energy_excellence_case表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-05-16
 */
public class ExcelEnergyExcellenceCase {
    /**
     * id
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 类别
     */
    private String companyType;

    /**
     * 文件路径
     */
    private String dataSources;

    /**
     * 发布机构
     */
    private String publishedOrganization;

    /**
     * 更新时间
     */
    private String updateAt;

    /**
     * 发布时间
     */
    private String publishAt;

    /**
     * 状态
     */
    private Integer state;

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
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 公司名称
     * @return company_name 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 公司名称
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 类别
     * @return company_type 类别
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 类别
     * @param companyType 类别
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    /**
     * 文件路径
     * @return data_sources 文件路径
     */
    public String getDataSources() {
        return dataSources;
    }

    /**
     * 文件路径
     * @param dataSources 文件路径
     */
    public void setDataSources(String dataSources) {
        this.dataSources = dataSources == null ? null : dataSources.trim();
    }

    /**
     * 发布机构
     * @return published_organization 发布机构
     */
    public String getPublishedOrganization() {
        return publishedOrganization;
    }

    /**
     * 发布机构
     * @param publishedOrganization 发布机构
     */
    public void setPublishedOrganization(String publishedOrganization) {
        this.publishedOrganization = publishedOrganization == null ? null : publishedOrganization.trim();
    }

    /**
     * 更新时间
     * @return update_at 更新时间
     */
    public String getUpdateAt() {
        return updateAt;
    }

    /**
     * 更新时间
     * @param updateAt 更新时间
     */
    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt == null ? null : updateAt.trim();
    }

    /**
     * 发布时间
     * @return publish_at 发布时间
     */
    public String getPublishAt() {
        return publishAt;
    }

    /**
     * 发布时间
     * @param publishAt 发布时间
     */
    public void setPublishAt(String publishAt) {
        this.publishAt = publishAt == null ? null : publishAt.trim();
    }

    /**
     * 状态
     * @return state 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态
     * @param state 状态
     */
    public void setState(Integer state) {
        this.state = state;
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
}