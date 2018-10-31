package com.igreen.web.view;

/**
 * 监控表格数据
 */
public class MonitorCompanyTable {

    // 公司名称
    private String companyName;
    // 组织机构代码
    private String orgNo;
    // 省市
    private String province;
    // 行业
    private String industryName;
    //诉讼（件）
    private int judgementsCount;
    // 专利（件）
    private int patentCount;
    // 重点监管企业数
    private int monitorCompaniesCount;
    // 排污许可数
    private int executionRecordsCount;
    // 环境违规数
    private int administrativePenaltyCount;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public int getJudgementsCount() {
        return judgementsCount;
    }

    public void setJudgementsCount(int judgementsCount) {
        this.judgementsCount = judgementsCount;
    }

    public int getPatentCount() {
        return patentCount;
    }

    public void setPatentCount(int patentCount) {
        this.patentCount = patentCount;
    }

    public int getMonitorCompaniesCount() {
        return monitorCompaniesCount;
    }

    public void setMonitorCompaniesCount(int monitorCompaniesCount) {
        this.monitorCompaniesCount = monitorCompaniesCount;
    }

    public int getExecutionRecordsCount() {
        return executionRecordsCount;
    }

    public void setExecutionRecordsCount(int executionRecordsCount) {
        this.executionRecordsCount = executionRecordsCount;
    }

    public int getAdministrativePenaltyCount() {
        return administrativePenaltyCount;
    }

    public void setAdministrativePenaltyCount(int administrativePenaltyCount) {
        this.administrativePenaltyCount = administrativePenaltyCount;
    }
}
