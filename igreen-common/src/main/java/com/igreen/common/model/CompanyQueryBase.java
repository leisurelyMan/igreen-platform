package com.igreen.common.model;

import java.util.Date;

/**
 * @version
 * @author:  chenxy
 * @创建时间: 2018-09-24
 */
public class CompanyQueryBase {
    //
    private int id;
    //
    private int dataVersion;
    //
    private String keyNo;
    //公司名称
    private String name;
    //注册时间
    private String startDate;
    //省编码
    private String province;
    //行业编码
    private String industryCode;
    //细分行业编码
    private String subIndustryCode;
    //行业
    private String industry;
    //细分行业
    private String subIndustry;
    //注册编码
    private String creditCode;
    //注册资本
    private String registCapi;
    //经营形式
    private String econKind;
    //经营范围
    private String scope;
    //组织机构代码
    private String orgNo;
    //状态
    private String status;
    // 企业id
    private Integer registItemId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(int dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getKeyNo() {
        return keyNo;
    }

    public void setKeyNo(String keyNo) {
        this.keyNo = keyNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public String getSubIndustryCode() {
        return subIndustryCode;
    }

    public void setSubIndustryCode(String subIndustryCode) {
        this.subIndustryCode = subIndustryCode;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSubIndustry() {
        return subIndustry;
    }

    public void setSubIndustry(String subIndustry) {
        this.subIndustry = subIndustry;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getRegistCapi() {
        return registCapi;
    }

    public void setRegistCapi(String registCapi) {
        this.registCapi = registCapi;
    }

    public String getEconKind() {
        return econKind;
    }

    public void setEconKind(String econKind) {
        this.econKind = econKind;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRegistItemId() {
        return registItemId;
    }

    public void setRegistItemId(Integer registItemId) {
        this.registItemId = registItemId;
    }
}