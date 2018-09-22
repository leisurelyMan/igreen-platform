package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:company_query_clean_production_company表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-09-20
 */
public class CompanyQueryCleanProductionCompany {
    /**
     * id
     */
    private Long id;

    /**
     * data_version
     */
    private Integer dataVersion;

    /**
     * clean_production_company_id
     */
    private Integer cleanProductionCompanyId;

    /**
     * 登记企业主键
     */
    private Integer registItemId;

    /**
     * 年份
     */
    private String checkYear;

    /**
     * 批次
     */
    private String batchNo;

    /**
     * 城市
     */
    private String city;

    /**
     * 编号
     */
    private String serialNumber;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 行业
     */
    private String trade;

    /**
     * 主要产品及年产量
     */
    private String productSalesAmount;

    /**
     * 所属地区
     */
    private String region;

    /**
     * 地址
     */
    private String address;

    /**
     * 公布时间
     */
    private String reportTime;

    /**
     * 提交审核时间
     */
    private String submitCheckTime;

    /**
     * 完成评估时间
     */
    private String completeEstimateTime;

    /**
     * 完成验收时间
     */
    private String completeCheckTime;

    /**
     * 审核咨询机构名称
     */
    private String checkOrganization;

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
     * clean_production_company_id
     * @return clean_production_company_id clean_production_company_id
     */
    public Integer getCleanProductionCompanyId() {
        return cleanProductionCompanyId;
    }

    /**
     * clean_production_company_id
     * @param cleanProductionCompanyId clean_production_company_id
     */
    public void setCleanProductionCompanyId(Integer cleanProductionCompanyId) {
        this.cleanProductionCompanyId = cleanProductionCompanyId;
    }

    /**
     * 登记企业主键
     * @return regist_item_id 登记企业主键
     */
    public Integer getRegistItemId() {
        return registItemId;
    }

    /**
     * 登记企业主键
     * @param registItemId 登记企业主键
     */
    public void setRegistItemId(Integer registItemId) {
        this.registItemId = registItemId;
    }

    /**
     * 年份
     * @return check_year 年份
     */
    public String getCheckYear() {
        return checkYear;
    }

    /**
     * 年份
     * @param checkYear 年份
     */
    public void setCheckYear(String checkYear) {
        this.checkYear = checkYear == null ? null : checkYear.trim();
    }

    /**
     * 批次
     * @return batch_no 批次
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 批次
     * @param batchNo 批次
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
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
     * 编号
     * @return serial_number 编号
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 编号
     * @param serialNumber 编号
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
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
     * 行业
     * @return trade 行业
     */
    public String getTrade() {
        return trade;
    }

    /**
     * 行业
     * @param trade 行业
     */
    public void setTrade(String trade) {
        this.trade = trade == null ? null : trade.trim();
    }

    /**
     * 主要产品及年产量
     * @return product_sales_amount 主要产品及年产量
     */
    public String getProductSalesAmount() {
        return productSalesAmount;
    }

    /**
     * 主要产品及年产量
     * @param productSalesAmount 主要产品及年产量
     */
    public void setProductSalesAmount(String productSalesAmount) {
        this.productSalesAmount = productSalesAmount == null ? null : productSalesAmount.trim();
    }

    /**
     * 所属地区
     * @return region 所属地区
     */
    public String getRegion() {
        return region;
    }

    /**
     * 所属地区
     * @param region 所属地区
     */
    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    /**
     * 地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 公布时间
     * @return report_time 公布时间
     */
    public String getReportTime() {
        return reportTime;
    }

    /**
     * 公布时间
     * @param reportTime 公布时间
     */
    public void setReportTime(String reportTime) {
        this.reportTime = reportTime == null ? null : reportTime.trim();
    }

    /**
     * 提交审核时间
     * @return submit_check_time 提交审核时间
     */
    public String getSubmitCheckTime() {
        return submitCheckTime;
    }

    /**
     * 提交审核时间
     * @param submitCheckTime 提交审核时间
     */
    public void setSubmitCheckTime(String submitCheckTime) {
        this.submitCheckTime = submitCheckTime == null ? null : submitCheckTime.trim();
    }

    /**
     * 完成评估时间
     * @return complete_estimate_time 完成评估时间
     */
    public String getCompleteEstimateTime() {
        return completeEstimateTime;
    }

    /**
     * 完成评估时间
     * @param completeEstimateTime 完成评估时间
     */
    public void setCompleteEstimateTime(String completeEstimateTime) {
        this.completeEstimateTime = completeEstimateTime == null ? null : completeEstimateTime.trim();
    }

    /**
     * 完成验收时间
     * @return complete_check_time 完成验收时间
     */
    public String getCompleteCheckTime() {
        return completeCheckTime;
    }

    /**
     * 完成验收时间
     * @param completeCheckTime 完成验收时间
     */
    public void setCompleteCheckTime(String completeCheckTime) {
        this.completeCheckTime = completeCheckTime == null ? null : completeCheckTime.trim();
    }

    /**
     * 审核咨询机构名称
     * @return check_organization 审核咨询机构名称
     */
    public String getCheckOrganization() {
        return checkOrganization;
    }

    /**
     * 审核咨询机构名称
     * @param checkOrganization 审核咨询机构名称
     */
    public void setCheckOrganization(String checkOrganization) {
        this.checkOrganization = checkOrganization == null ? null : checkOrganization.trim();
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