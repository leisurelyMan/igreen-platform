package com.igreen.common.model;

/**
 * 描述:company_query_execution_record表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-08-27
 */
public class CompanyQueryExecutionRecord {
    /**
     * id
     */
    private Integer id;

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