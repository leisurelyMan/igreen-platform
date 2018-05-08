package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:ipe_ai_result表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-05-08
 */
public class IpeAiResult {
    /**
     * id
     */
    private Integer id;

    /**
     * 基础记录ID
     */
    private Integer registItemId;

    /**
     * 
     */
    private Integer ipeRecordId;

    /**
     * 文件路径
     */
    private String fileUrl;

    /**
     * 监管时间
     */
    private String industryTime;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 关键词
     */
    private String keyWords;

    /**
     * 状态
     */
    private Integer state;

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
     * 基础记录ID
     * @return regist_item_id 基础记录ID
     */
    public Integer getRegistItemId() {
        return registItemId;
    }

    /**
     * 基础记录ID
     * @param registItemId 基础记录ID
     */
    public void setRegistItemId(Integer registItemId) {
        this.registItemId = registItemId;
    }

    /**
     * 
     * @return ipe_record_id 
     */
    public Integer getIpeRecordId() {
        return ipeRecordId;
    }

    /**
     * 
     * @param ipeRecordId 
     */
    public void setIpeRecordId(Integer ipeRecordId) {
        this.ipeRecordId = ipeRecordId;
    }

    /**
     * 文件路径
     * @return file_url 文件路径
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * 文件路径
     * @param fileUrl 文件路径
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * 监管时间
     * @return industry_time 监管时间
     */
    public String getIndustryTime() {
        return industryTime;
    }

    /**
     * 监管时间
     * @param industryTime 监管时间
     */
    public void setIndustryTime(String industryTime) {
        this.industryTime = industryTime == null ? null : industryTime.trim();
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
     * 关键词
     * @return key_words 关键词
     */
    public String getKeyWords() {
        return keyWords;
    }

    /**
     * 关键词
     * @param keyWords 关键词
     */
    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords == null ? null : keyWords.trim();
    }

    /**
     * 状态
     * @return state 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态
     * @param state 状态
     */
    public void setState(Integer state) {
        this.state = state;
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
}