package com.igreen.common.model;

/**
 * 描述:company_query_execution_record表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-09-20
 */
public class CompanyQueryExecutionRecord {
    /**
     * id
     */
    private Long id;

    /**
     * data_version
     */
    private Integer dataVersion;

    /**
     * execution_record_id
     */
    private Integer executionRecordId;

    /**
     * 排污许可信息表外键
     */
    private Integer pollutionId;

    /**
     * 上报频次
     */
    private String frequency;

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
     * execution_record_id
     * @return execution_record_id execution_record_id
     */
    public Integer getExecutionRecordId() {
        return executionRecordId;
    }

    /**
     * execution_record_id
     * @param executionRecordId execution_record_id
     */
    public void setExecutionRecordId(Integer executionRecordId) {
        this.executionRecordId = executionRecordId;
    }

    /**
     * 排污许可信息表外键
     * @return pollution_id 排污许可信息表外键
     */
    public Integer getPollutionId() {
        return pollutionId;
    }

    /**
     * 排污许可信息表外键
     * @param pollutionId 排污许可信息表外键
     */
    public void setPollutionId(Integer pollutionId) {
        this.pollutionId = pollutionId;
    }

    /**
     * 上报频次
     * @return frequency 上报频次
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * 上报频次
     * @param frequency 上报频次
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }
}