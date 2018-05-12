package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:excel_energy_pacemaker表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-05-12
 */
public class ExcelEnergyPacemaker {
    /**
     * ID
     */
    private Long id;

    /**
     * 公司
     */
    private String company;

    /**
     * 单位能耗
     */
    private String energy;

    /**
     * 原料
     */
    private String material;

    /**
     * 行业
     */
    private String domain;

    /**
     * 发布日期
     */
    private String publishBegin;

    /**
     * 状态
     */
    private Integer statas;

    /**
     * 创建者
     */
    private String creater;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新者
     */
    private String updater;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * ID
     * @return ID ID
     */
    public Long getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 公司
     * @return company 公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 公司
     * @param company 公司
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * 单位能耗
     * @return energy 单位能耗
     */
    public String getEnergy() {
        return energy;
    }

    /**
     * 单位能耗
     * @param energy 单位能耗
     */
    public void setEnergy(String energy) {
        this.energy = energy == null ? null : energy.trim();
    }

    /**
     * 原料
     * @return material 原料
     */
    public String getMaterial() {
        return material;
    }

    /**
     * 原料
     * @param material 原料
     */
    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    /**
     * 行业
     * @return domain 行业
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 行业
     * @param domain 行业
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * 发布日期
     * @return publish_begin 发布日期
     */
    public String getPublishBegin() {
        return publishBegin;
    }

    /**
     * 发布日期
     * @param publishBegin 发布日期
     */
    public void setPublishBegin(String publishBegin) {
        this.publishBegin = publishBegin == null ? null : publishBegin.trim();
    }

    /**
     * 状态
     * @return statas 状态
     */
    public Integer getStatas() {
        return statas;
    }

    /**
     * 状态
     * @param statas 状态
     */
    public void setStatas(Integer statas) {
        this.statas = statas;
    }

    /**
     * 创建者
     * @return creater 创建者
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 创建者
     * @param creater 创建者
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
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
    public String getUpdater() {
        return updater;
    }

    /**
     * 更新者
     * @param updater 更新者
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
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