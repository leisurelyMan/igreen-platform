package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:company_query_pollution_discharge_license表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-09-20
 */
public class CompanyQueryPollutionDischargeLicense {
    /**
     * id
     */
    private Long id;

    /**
     * data_version
     */
    private Integer dataVersion;

    /**
     * license_id
     */
    private Integer licenseId;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 省
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 许可证编号
     */
    private String licenseNumber;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 行业类别
     */
    private String industry;

    /**
     * 许可证有效日期
     */
    private String validDate;

    /**
     * 许可证有效起始日期
     */
    private Date startValidDate;

    /**
     * 许可证有效终止日期
     */
    private Date endValidDate;

    /**
     * 发证日期
     */
    private Date certificationDate;

    /**
     * 排污详情数据ID，爬虫用
     */
    private String dataId;

    /**
     * 公司地址
     */
    private String address;

    /**
     * 发证机关
     */
    private String certificateOrganization;

    /**
     * 主要污染类别
     */
    private String pollutionType;

    /**
     * 大气主要污染物种类
     */
    private String airPollutionType;

    /**
     * 大气污染物排放规律
     */
    private String airPollutionDischargeRule;

    /**
     * 大气污染物排放执行标准
     */
    private String airPollutionDischargeStandard;

    /**
     * 废水主要污染物种类
     */
    private String waterPollutionType;

    /**
     * 废水污染物排放规律
     */
    private String waterPollutionDischargeRule;

    /**
     * 废水污染物排放执行标准
     */
    private String waterPollutionDischargeStandard;

    /**
     * 排污权使用和交易信息
     */
    private String pollutionTrade;

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
     * license_id
     * @return license_id license_id
     */
    public Integer getLicenseId() {
        return licenseId;
    }

    /**
     * license_id
     * @param licenseId license_id
     */
    public void setLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
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
     * 省
     * @return province 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 城市
     * @return city 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 许可证编号
     * @return license_number 许可证编号
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * 许可证编号
     * @param licenseNumber 许可证编号
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
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
     * 行业类别
     * @return industry 行业类别
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 行业类别
     * @param industry 行业类别
     */
    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    /**
     * 许可证有效日期
     * @return valid_date 许可证有效日期
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * 许可证有效日期
     * @param validDate 许可证有效日期
     */
    public void setValidDate(String validDate) {
        this.validDate = validDate == null ? null : validDate.trim();
    }

    /**
     * 许可证有效起始日期
     * @return start_valid_date 许可证有效起始日期
     */
    public Date getStartValidDate() {
        return startValidDate;
    }

    /**
     * 许可证有效起始日期
     * @param startValidDate 许可证有效起始日期
     */
    public void setStartValidDate(Date startValidDate) {
        this.startValidDate = startValidDate;
    }

    /**
     * 许可证有效终止日期
     * @return end_valid_date 许可证有效终止日期
     */
    public Date getEndValidDate() {
        return endValidDate;
    }

    /**
     * 许可证有效终止日期
     * @param endValidDate 许可证有效终止日期
     */
    public void setEndValidDate(Date endValidDate) {
        this.endValidDate = endValidDate;
    }

    /**
     * 发证日期
     * @return certification_date 发证日期
     */
    public Date getCertificationDate() {
        return certificationDate;
    }

    /**
     * 发证日期
     * @param certificationDate 发证日期
     */
    public void setCertificationDate(Date certificationDate) {
        this.certificationDate = certificationDate;
    }

    /**
     * 排污详情数据ID，爬虫用
     * @return data_id 排污详情数据ID，爬虫用
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * 排污详情数据ID，爬虫用
     * @param dataId 排污详情数据ID，爬虫用
     */
    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    /**
     * 公司地址
     * @return address 公司地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 公司地址
     * @param address 公司地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 发证机关
     * @return certificate_organization 发证机关
     */
    public String getCertificateOrganization() {
        return certificateOrganization;
    }

    /**
     * 发证机关
     * @param certificateOrganization 发证机关
     */
    public void setCertificateOrganization(String certificateOrganization) {
        this.certificateOrganization = certificateOrganization == null ? null : certificateOrganization.trim();
    }

    /**
     * 主要污染类别
     * @return pollution_type 主要污染类别
     */
    public String getPollutionType() {
        return pollutionType;
    }

    /**
     * 主要污染类别
     * @param pollutionType 主要污染类别
     */
    public void setPollutionType(String pollutionType) {
        this.pollutionType = pollutionType == null ? null : pollutionType.trim();
    }

    /**
     * 大气主要污染物种类
     * @return air_pollution_type 大气主要污染物种类
     */
    public String getAirPollutionType() {
        return airPollutionType;
    }

    /**
     * 大气主要污染物种类
     * @param airPollutionType 大气主要污染物种类
     */
    public void setAirPollutionType(String airPollutionType) {
        this.airPollutionType = airPollutionType == null ? null : airPollutionType.trim();
    }

    /**
     * 大气污染物排放规律
     * @return air_pollution_discharge_rule 大气污染物排放规律
     */
    public String getAirPollutionDischargeRule() {
        return airPollutionDischargeRule;
    }

    /**
     * 大气污染物排放规律
     * @param airPollutionDischargeRule 大气污染物排放规律
     */
    public void setAirPollutionDischargeRule(String airPollutionDischargeRule) {
        this.airPollutionDischargeRule = airPollutionDischargeRule == null ? null : airPollutionDischargeRule.trim();
    }

    /**
     * 大气污染物排放执行标准
     * @return air_pollution_discharge_standard 大气污染物排放执行标准
     */
    public String getAirPollutionDischargeStandard() {
        return airPollutionDischargeStandard;
    }

    /**
     * 大气污染物排放执行标准
     * @param airPollutionDischargeStandard 大气污染物排放执行标准
     */
    public void setAirPollutionDischargeStandard(String airPollutionDischargeStandard) {
        this.airPollutionDischargeStandard = airPollutionDischargeStandard == null ? null : airPollutionDischargeStandard.trim();
    }

    /**
     * 废水主要污染物种类
     * @return water_pollution_type 废水主要污染物种类
     */
    public String getWaterPollutionType() {
        return waterPollutionType;
    }

    /**
     * 废水主要污染物种类
     * @param waterPollutionType 废水主要污染物种类
     */
    public void setWaterPollutionType(String waterPollutionType) {
        this.waterPollutionType = waterPollutionType == null ? null : waterPollutionType.trim();
    }

    /**
     * 废水污染物排放规律
     * @return water_pollution_discharge_rule 废水污染物排放规律
     */
    public String getWaterPollutionDischargeRule() {
        return waterPollutionDischargeRule;
    }

    /**
     * 废水污染物排放规律
     * @param waterPollutionDischargeRule 废水污染物排放规律
     */
    public void setWaterPollutionDischargeRule(String waterPollutionDischargeRule) {
        this.waterPollutionDischargeRule = waterPollutionDischargeRule == null ? null : waterPollutionDischargeRule.trim();
    }

    /**
     * 废水污染物排放执行标准
     * @return water_pollution_discharge_standard 废水污染物排放执行标准
     */
    public String getWaterPollutionDischargeStandard() {
        return waterPollutionDischargeStandard;
    }

    /**
     * 废水污染物排放执行标准
     * @param waterPollutionDischargeStandard 废水污染物排放执行标准
     */
    public void setWaterPollutionDischargeStandard(String waterPollutionDischargeStandard) {
        this.waterPollutionDischargeStandard = waterPollutionDischargeStandard == null ? null : waterPollutionDischargeStandard.trim();
    }

    /**
     * 排污权使用和交易信息
     * @return pollution_trade 排污权使用和交易信息
     */
    public String getPollutionTrade() {
        return pollutionTrade;
    }

    /**
     * 排污权使用和交易信息
     * @param pollutionTrade 排污权使用和交易信息
     */
    public void setPollutionTrade(String pollutionTrade) {
        this.pollutionTrade = pollutionTrade == null ? null : pollutionTrade.trim();
    }
}