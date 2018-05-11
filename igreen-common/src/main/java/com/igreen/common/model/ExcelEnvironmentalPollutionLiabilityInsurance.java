package com.igreen.common.model;

/**
 * 描述:excel_environmental_pollution_liability_insurance表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-05-11
 */
public class ExcelEnvironmentalPollutionLiabilityInsurance {
    /**
     * id
     */
    private Integer id;

    /**
     * 省份
     */
    private String provinceName;

    /**
     * 备案单位
     */
    private String companyName;

    /**
     * 年份
     */
    private String year;

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
     * 省份
     * @return province_name 省份
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 省份
     * @param provinceName 省份
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * 备案单位
     * @return company_name 备案单位
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 备案单位
     * @param companyName 备案单位
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 年份
     * @return year 年份
     */
    public String getYear() {
        return year;
    }

    /**
     * 年份
     * @param year 年份
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }
}