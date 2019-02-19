package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:ipe_industry_record表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2019-02-19
 */
public class IpeIndustryRecord1 {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 年度
     */
    private String year;

    /**
     * 标题
     */
    private String title;

    /**
     * ipe记录ID
     */
    private Long ipeId;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建者
     */
    private Integer creater;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新者
     */
    private Integer updater;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 备注
     */
    private String remark;

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
     * 详情页原url
     */
    private String webDetailUrl;

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
     * 数据来源：1ipe,2爬虫，3Excel导入
     */
    private Integer source;

    /**
     * 处罚原因
     */
    private String punishReason;

    /**
     * 污染类型
     */
    private String majorityType;

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
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * ipe记录ID
     * @return ipe_id ipe记录ID
     */
    public Long getIpeId() {
        return ipeId;
    }

    /**
     * ipe记录ID
     * @param ipeId ipe记录ID
     */
    public void setIpeId(Long ipeId) {
        this.ipeId = ipeId;
    }

    /**
     * 文件名称
     * @return file_name 文件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 文件名称
     * @param fileName 文件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 数据来源：1ipe,2爬虫，3Excel导入
     * @return source 数据来源：1ipe,2爬虫，3Excel导入
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 数据来源：1ipe,2爬虫，3Excel导入
     * @param source 数据来源：1ipe,2爬虫，3Excel导入
     */
    public void setSource(Integer source) {
        this.source = source;
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