package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:ipe_elasticsearch表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2017-11-17
 */
public class IpeElasticsearch {
    /**
     * ID
     */
    private Integer id;

    /**
     * esID即ipe_id
     */
    private Integer esId;

    /**
     * 状态
     */
    private Integer statas;

    /**
     * 创建者
     */
    private String creater;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新者
     */
    private String updater;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * ID
     * @return ID ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * esID即ipe_id
     * @return es_id esID即ipe_id
     */
    public Integer getEsId() {
        return esId;
    }

    /**
     * esID即ipe_id
     * @param esId esID即ipe_id
     */
    public void setEsId(Integer esId) {
        this.esId = esId;
    }

    /**
     * 状态
     * @return statas 状态
     */
    public Integer getStatas() {
        return statas;
    }

    /**
     * 状态
     * @param statas 状态
     */
    public void setStatas(Integer statas) {
        this.statas = statas;
    }

    /**
     * 创建者
     * @return creater 创建者
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 创建者
     * @param creater 创建者
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
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
    public String getUpdater() {
        return updater;
    }

    /**
     * 更新者
     * @param updater 更新者
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
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
}