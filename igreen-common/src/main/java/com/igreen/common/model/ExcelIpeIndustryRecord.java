package com.igreen.common.model;

/**
 * 描述:excel_ipe_industry_record表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2019-03-24
 */
public class ExcelIpeIndustryRecord {
    /**
     * 
     */
    private Integer id;

    /**
     * 年度
     */
    private String year;

    /**
     * 
     */
    private String webDetailUrl;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 县
     */
    private String district;

    /**
     * 处罚类型
     */
    private String punishType;

    /**
     * 处罚公布时间
     */
    private String punishTime;

    /**
     * 处罚金额
     */
    private String punishMoney;

    /**
     * 处罚编号
     */
    private String punishNo;

    /**
     * 创建者
     */
    private Integer creater;

    /**
     * 更新者
     */
    private Integer updater;

    /**
     * 处罚原因
     */
    private String punishReason;

    /**
     * 污染类型
     */
    private String majorityType;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 年度
     * @return year 年度
     */
    public String getYear() {
        return year;
    }

    /**
     * 年度
     * @param year 年度
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * 
     * @return web_detail_url 
     */
    public String getWebDetailUrl() {
        return webDetailUrl;
    }

    /**
     * 
     * @param webDetailUrl 
     */
    public void setWebDetailUrl(String webDetailUrl) {
        this.webDetailUrl = webDetailUrl == null ? null : webDetailUrl.trim();
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
     * 市
     * @return city 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 市
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 县
     * @return district 县
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 县
     * @param district 县
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * 处罚类型
     * @return punish_type 处罚类型
     */
    public String getPunishType() {
        return punishType;
    }

    /**
     * 处罚类型
     * @param punishType 处罚类型
     */
    public void setPunishType(String punishType) {
        this.punishType = punishType == null ? null : punishType.trim();
    }

    /**
     * 处罚公布时间
     * @return punish_time 处罚公布时间
     */
    public String getPunishTime() {
        return punishTime;
    }

    /**
     * 处罚公布时间
     * @param punishTime 处罚公布时间
     */
    public void setPunishTime(String punishTime) {
        this.punishTime = punishTime == null ? null : punishTime.trim();
    }

    /**
     * 处罚金额
     * @return punish_money 处罚金额
     */
    public String getPunishMoney() {
        return punishMoney;
    }

    /**
     * 处罚金额
     * @param punishMoney 处罚金额
     */
    public void setPunishMoney(String punishMoney) {
        this.punishMoney = punishMoney == null ? null : punishMoney.trim();
    }

    /**
     * 处罚编号
     * @return punish_no 处罚编号
     */
    public String getPunishNo() {
        return punishNo;
    }

    /**
     * 处罚编号
     * @param punishNo 处罚编号
     */
    public void setPunishNo(String punishNo) {
        this.punishNo = punishNo == null ? null : punishNo.trim();
    }

    /**
     * 创建者
     * @return creater 创建者
     */
    public Integer getCreater() {
        return creater;
    }

    /**
     * 创建者
     * @param creater 创建者
     */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /**
     * 更新者
     * @return updater 更新者
     */
    public Integer getUpdater() {
        return updater;
    }

    /**
     * 更新者
     * @param updater 更新者
     */
    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    /**
     * 处罚原因
     * @return punish_reason 处罚原因
     */
    public String getPunishReason() {
        return punishReason;
    }

    /**
     * 处罚原因
     * @param punishReason 处罚原因
     */
    public void setPunishReason(String punishReason) {
        this.punishReason = punishReason == null ? null : punishReason.trim();
    }

    /**
     * 污染类型
     * @return majority_type 污染类型
     */
    public String getMajorityType() {
        return majorityType;
    }

    /**
     * 污染类型
     * @param majorityType 污染类型
     */
    public void setMajorityType(String majorityType) {
        this.majorityType = majorityType == null ? null : majorityType.trim();
    }
}