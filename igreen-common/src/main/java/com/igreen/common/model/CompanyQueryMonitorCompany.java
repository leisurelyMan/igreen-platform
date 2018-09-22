package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:company_query_monitor_company表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-09-20
 */
public class CompanyQueryMonitorCompany {
    /**
     * id
     */
    private Long id;

    /**
     * data_version
     */
    private Integer dataVersion;

    /**
     * monitor_company_id
     */
    private Integer monitorCompanyId;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 序号
     */
    private Integer monitorSequence;

    /**
     * 行政区划代码
     */
    private String regionCode;

    /**
     * 法人代码
     */
    private String legalPersonCode;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 监控类别
     */
    private String monitorType;

    /**
     * 所属省份
     */
    private String province;

    /**
     * 所属年份
     */
    private String monitorYear;

    /**
     * 
     */
    private Date createTm;

    /**
     * id
     * @return id id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * data_version
     * @return data_version data_version
     */
    public Integer getDataVersion() {
        return dataVersion;
    }

    /**
     * data_version
     * @param dataVersion data_version
     */
    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    /**
     * monitor_company_id
     * @return monitor_company_id monitor_company_id
     */
    public Integer getMonitorCompanyId() {
        return monitorCompanyId;
    }

    /**
     * monitor_company_id
     * @param monitorCompanyId monitor_company_id
     */
    public void setMonitorCompanyId(Integer monitorCompanyId) {
        this.monitorCompanyId = monitorCompanyId;
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
     * 序号
     * @return monitor_sequence 序号
     */
    public Integer getMonitorSequence() {
        return monitorSequence;
    }

    /**
     * 序号
     * @param monitorSequence 序号
     */
    public void setMonitorSequence(Integer monitorSequence) {
        this.monitorSequence = monitorSequence;
    }

    /**
     * 行政区划代码
     * @return region_code 行政区划代码
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 行政区划代码
     * @param regionCode 行政区划代码
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    /**
     * 法人代码
     * @return legal_person_code 法人代码
     */
    public String getLegalPersonCode() {
        return legalPersonCode;
    }

    /**
     * 法人代码
     * @param legalPersonCode 法人代码
     */
    public void setLegalPersonCode(String legalPersonCode) {
        this.legalPersonCode = legalPersonCode == null ? null : legalPersonCode.trim();
    }

    /**
     * 企业名称
     * @return company_name 企业名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 企业名称
     * @param companyName 企业名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 监控类别
     * @return monitor_type 监控类别
     */
    public String getMonitorType() {
        return monitorType;
    }

    /**
     * 监控类别
     * @param monitorType 监控类别
     */
    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType == null ? null : monitorType.trim();
    }

    /**
     * 所属省份
     * @return province 所属省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 所属省份
     * @param province 所属省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 所属年份
     * @return monitor_year 所属年份
     */
    public String getMonitorYear() {
        return monitorYear;
    }

    /**
     * 所属年份
     * @param monitorYear 所属年份
     */
    public void setMonitorYear(String monitorYear) {
        this.monitorYear = monitorYear == null ? null : monitorYear.trim();
    }

    /**
     * 
     * @return create_tm 
     */
    public Date getCreateTm() {
        return createTm;
    }

    /**
     * 
     * @param createTm 
     */
    public void setCreateTm(Date createTm) {
        this.createTm = createTm;
    }
}