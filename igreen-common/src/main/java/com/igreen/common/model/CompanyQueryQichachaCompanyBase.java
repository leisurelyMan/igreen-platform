package com.igreen.common.model;

/**
 * 描述:company_query_qichacha_company_base表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-09-22
 */
public class CompanyQueryQichachaCompanyBase {
    /**
     * id
     */
    private Integer id;

    /**
     * data_version
     */
    private Integer dataVersion;

    /**
     * KeyNo
     */
    private String keyNo;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 注册时间
     */
    private String startDate;

    /**
     * 省编码
     */
    private String province;

    /**
     * 行业编码
     */
    private String industryCode;

    /**
     * 细分行业编码
     */
    private String subindustryCode;

    /**
     * 行业
     */
    private String industry;

    /**
     * 细分行业
     */
    private String subindustry;

    /**
     * 注册编码
     */
    private String creditCode;

    /**
     * 注册资本
     */
    private String registCapi;

    /**
     * 经营形式
     */
    private String econKind;

    /**
     * 组织机构代码
     */
    private String orgNo;

    /**
     * 状态
     */
    private String status;

    /**
     * 经营范围
     */
    private String scope;

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
     * KeyNo
     * @return key_no KeyNo
     */
    public String getKeyNo() {
        return keyNo;
    }

    /**
     * KeyNo
     * @param keyNo KeyNo
     */
    public void setKeyNo(String keyNo) {
        this.keyNo = keyNo == null ? null : keyNo.trim();
    }

    /**
     * 公司名称
     * @return name 公司名称
     */
    public String getName() {
        return name;
    }

    /**
     * 公司名称
     * @param name 公司名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 注册时间
     * @return start_date 注册时间
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 注册时间
     * @param startDate 注册时间
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    /**
     * 省编码
     * @return province 省编码
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省编码
     * @param province 省编码
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 行业编码
     * @return industry_code 行业编码
     */
    public String getIndustryCode() {
        return industryCode;
    }

    /**
     * 行业编码
     * @param industryCode 行业编码
     */
    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode == null ? null : industryCode.trim();
    }

    /**
     * 细分行业编码
     * @return subIndustry_code 细分行业编码
     */
    public String getSubindustryCode() {
        return subindustryCode;
    }

    /**
     * 细分行业编码
     * @param subindustryCode 细分行业编码
     */
    public void setSubindustryCode(String subindustryCode) {
        this.subindustryCode = subindustryCode == null ? null : subindustryCode.trim();
    }

    /**
     * 行业
     * @return industry 行业
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 行业
     * @param industry 行业
     */
    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    /**
     * 细分行业
     * @return subIndustry 细分行业
     */
    public String getSubindustry() {
        return subindustry;
    }

    /**
     * 细分行业
     * @param subindustry 细分行业
     */
    public void setSubindustry(String subindustry) {
        this.subindustry = subindustry == null ? null : subindustry.trim();
    }

    /**
     * 注册编码
     * @return credit_code 注册编码
     */
    public String getCreditCode() {
        return creditCode;
    }

    /**
     * 注册编码
     * @param creditCode 注册编码
     */
    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode == null ? null : creditCode.trim();
    }

    /**
     * 注册资本
     * @return regist_capi 注册资本
     */
    public String getRegistCapi() {
        return registCapi;
    }

    /**
     * 注册资本
     * @param registCapi 注册资本
     */
    public void setRegistCapi(String registCapi) {
        this.registCapi = registCapi == null ? null : registCapi.trim();
    }

    /**
     * 经营形式
     * @return econ_kind 经营形式
     */
    public String getEconKind() {
        return econKind;
    }

    /**
     * 经营形式
     * @param econKind 经营形式
     */
    public void setEconKind(String econKind) {
        this.econKind = econKind == null ? null : econKind.trim();
    }

    /**
     * 组织机构代码
     * @return org_no 组织机构代码
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 组织机构代码
     * @param orgNo 组织机构代码
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    /**
     * 状态
     * @return status 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 经营范围
     * @return scope 经营范围
     */
    public String getScope() {
        return scope;
    }

    /**
     * 经营范围
     * @param scope 经营范围
     */
    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }
}