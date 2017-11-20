package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:copyright表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class Copyright {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 作品名称
     */
    private String productionName;

    /**
     * 登记号
     */
    private String registNo;

    /**
     * 类别
     */
    private String productionType;

    /**
     * 创作完成日期
     */
    private String completeTime;

    /**
     * 登记日期
     */
    private String registTime;

    /**
     * 首次发布日期
     */
    private String firstPublishTime;

    /**
     * 最后更新时间
     */
    private String lastUpdateTime;

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
     * 作品名称
     * @return production_name 作品名称
     */
    public String getProductionName() {
        return productionName;
    }

    /**
     * 作品名称
     * @param productionName 作品名称
     */
    public void setProductionName(String productionName) {
        this.productionName = productionName == null ? null : productionName.trim();
    }

    /**
     * 登记号
     * @return regist_no 登记号
     */
    public String getRegistNo() {
        return registNo;
    }

    /**
     * 登记号
     * @param registNo 登记号
     */
    public void setRegistNo(String registNo) {
        this.registNo = registNo == null ? null : registNo.trim();
    }

    /**
     * 类别
     * @return production_type 类别
     */
    public String getProductionType() {
        return productionType;
    }

    /**
     * 类别
     * @param productionType 类别
     */
    public void setProductionType(String productionType) {
        this.productionType = productionType == null ? null : productionType.trim();
    }

    /**
     * 创作完成日期
     * @return complete_time 创作完成日期
     */
    public String getCompleteTime() {
        return completeTime;
    }

    /**
     * 创作完成日期
     * @param completeTime 创作完成日期
     */
    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime == null ? null : completeTime.trim();
    }

    /**
     * 登记日期
     * @return regist_time 登记日期
     */
    public String getRegistTime() {
        return registTime;
    }

    /**
     * 登记日期
     * @param registTime 登记日期
     */
    public void setRegistTime(String registTime) {
        this.registTime = registTime == null ? null : registTime.trim();
    }

    /**
     * 首次发布日期
     * @return first_publish_time 首次发布日期
     */
    public String getFirstPublishTime() {
        return firstPublishTime;
    }

    /**
     * 首次发布日期
     * @param firstPublishTime 首次发布日期
     */
    public void setFirstPublishTime(String firstPublishTime) {
        this.firstPublishTime = firstPublishTime == null ? null : firstPublishTime.trim();
    }

    /**
     * 最后更新时间
     * @return last_update_time 最后更新时间
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 最后更新时间
     * @param lastUpdateTime 最后更新时间
     */
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
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
}