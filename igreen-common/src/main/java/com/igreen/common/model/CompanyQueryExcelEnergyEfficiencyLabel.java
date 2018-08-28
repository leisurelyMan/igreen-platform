package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:company_query_excel_energy_efficiency_label表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-08-27
 */
public class CompanyQueryExcelEnergyEfficiencyLabel {
    /**
     * ID
     */
    private Long id;

    /**
     * 公司信息ID
     */
    private Integer registItemId;

    /**
     * 公告号
     */
    private String noticeNo;

    /**
     * 备案单位
     */
    private String filingCompany;

    /**
     * 公司类型
     */
    private String companyType;

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
     * 公司信息ID
     * @return regist_item_id 公司信息ID
     */
    public Integer getRegistItemId() {
        return registItemId;
    }

    /**
     * 公司信息ID
     * @param registItemId 公司信息ID
     */
    public void setRegistItemId(Integer registItemId) {
        this.registItemId = registItemId;
    }

    /**
     * 公告号
     * @return notice_no 公告号
     */
    public String getNoticeNo() {
        return noticeNo;
    }

    /**
     * 公告号
     * @param noticeNo 公告号
     */
    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo == null ? null : noticeNo.trim();
    }

    /**
     * 备案单位
     * @return filing_company 备案单位
     */
    public String getFilingCompany() {
        return filingCompany;
    }

    /**
     * 备案单位
     * @param filingCompany 备案单位
     */
    public void setFilingCompany(String filingCompany) {
        this.filingCompany = filingCompany == null ? null : filingCompany.trim();
    }

    /**
     * 公司类型
     * @return company_type 公司类型
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 公司类型
     * @param companyType 公司类型
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
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