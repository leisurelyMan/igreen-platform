package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:crawler_ipe_industry_record表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2019-01-10
 */
public class CrawlerIpeIndustryRecord {
    /**
     * 
     */
    private Integer id;

    /**
     * 网站名称
     */
    private String webName;

    /**
     * 网站域名
     */
    private String webDomain;

    /**
     * 年度
     */
    private String year;

    /**
     * 详情标题 对应title
     */
    private String webDetailName;

    /**
     * 详情页原url
     */
    private String webDetailUrl;

    /**
     * 抓取详情页url 对应file_name
     */
    private String webDetailResultUrl;

    /**
     * 
     */
    private String savePath;

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
     * 配置更新时间
     */
    private Date updateTime;

    /**
     * 创建者
     */
    private Integer creater;

    /**
     * 更新者
     */
    private Integer updater;

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
     * 网站名称
     * @return web_name 网站名称
     */
    public String getWebName() {
        return webName;
    }

    /**
     * 网站名称
     * @param webName 网站名称
     */
    public void setWebName(String webName) {
        this.webName = webName == null ? null : webName.trim();
    }

    /**
     * 网站域名
     * @return web_domain 网站域名
     */
    public String getWebDomain() {
        return webDomain;
    }

    /**
     * 网站域名
     * @param webDomain 网站域名
     */
    public void setWebDomain(String webDomain) {
        this.webDomain = webDomain == null ? null : webDomain.trim();
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
     * 详情标题 对应title
     * @return web_detail_name 详情标题 对应title
     */
    public String getWebDetailName() {
        return webDetailName;
    }

    /**
     * 详情标题 对应title
     * @param webDetailName 详情标题 对应title
     */
    public void setWebDetailName(String webDetailName) {
        this.webDetailName = webDetailName == null ? null : webDetailName.trim();
    }

    /**
     * 详情页原url
     * @return web_detail_url 详情页原url
     */
    public String getWebDetailUrl() {
        return webDetailUrl;
    }

    /**
     * 详情页原url
     * @param webDetailUrl 详情页原url
     */
    public void setWebDetailUrl(String webDetailUrl) {
        this.webDetailUrl = webDetailUrl == null ? null : webDetailUrl.trim();
    }

    /**
     * 抓取详情页url 对应file_name
     * @return web_detail_result_url 抓取详情页url 对应file_name
     */
    public String getWebDetailResultUrl() {
        return webDetailResultUrl;
    }

    /**
     * 抓取详情页url 对应file_name
     * @param webDetailResultUrl 抓取详情页url 对应file_name
     */
    public void setWebDetailResultUrl(String webDetailResultUrl) {
        this.webDetailResultUrl = webDetailResultUrl == null ? null : webDetailResultUrl.trim();
    }

    /**
     * 
     * @return save_path 
     */
    public String getSavePath() {
        return savePath;
    }

    /**
     * 
     * @param savePath 
     */
    public void setSavePath(String savePath) {
        this.savePath = savePath == null ? null : savePath.trim();
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
     * 配置更新时间
     * @return update_time 配置更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 配置更新时间
     * @param updateTime 配置更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
}