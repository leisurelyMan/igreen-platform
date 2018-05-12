package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:excel_energy_level表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-05-12
 */
public class ExcelEnergyLevel {
    /**
     * ID
     */
    private Long id;

    /**
     * 公司
     */
    private String company;

    /**
     * 领域
     */
    private String domain;

    /**
     * 级别
     */
    private String level;

    /**
     * 证书编号
     */
    private String certificateNumber;

    /**
     * 发证日期
     */
    private String certificateBegin;

    /**
     * 有效期截止时间
     */
    private String certificateEnd;

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
     * 领域
     * @return domain 领域
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 领域
     * @param domain 领域
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * 级别
     * @return level 级别
     */
    public String getLevel() {
        return level;
    }

    /**
     * 级别
     * @param level 级别
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * 证书编号
     * @return certificate_number 证书编号
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * 证书编号
     * @param certificateNumber 证书编号
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
    }

    /**
     * 发证日期
     * @return certificate_begin 发证日期
     */
    public String getCertificateBegin() {
        return certificateBegin;
    }

    /**
     * 发证日期
     * @param certificateBegin 发证日期
     */
    public void setCertificateBegin(String certificateBegin) {
        this.certificateBegin = certificateBegin == null ? null : certificateBegin.trim();
    }

    /**
     * 有效期截止时间
     * @return certificate_end 有效期截止时间
     */
    public String getCertificateEnd() {
        return certificateEnd;
    }

    /**
     * 有效期截止时间
     * @param certificateEnd 有效期截止时间
     */
    public void setCertificateEnd(String certificateEnd) {
        this.certificateEnd = certificateEnd == null ? null : certificateEnd.trim();
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