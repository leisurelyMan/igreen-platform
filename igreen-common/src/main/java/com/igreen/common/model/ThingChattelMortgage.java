package com.igreen.common.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:thing_chattel_mortgage表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class ThingChattelMortgage {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 抵押ID
     */
    private String mortgageId;

    /**
     * 抵押物名称
     */
    private String thingName;

    /**
     * 数量
     */
    private Integer thingNum;

    /**
     * 价值(万元)
     */
    private BigDecimal thingAmount;

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
     * 抵押ID
     * @return mortgage_id 抵押ID
     */
    public String getMortgageId() {
        return mortgageId;
    }

    /**
     * 抵押ID
     * @param mortgageId 抵押ID
     */
    public void setMortgageId(String mortgageId) {
        this.mortgageId = mortgageId == null ? null : mortgageId.trim();
    }

    /**
     * 抵押物名称
     * @return thing_name 抵押物名称
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * 抵押物名称
     * @param thingName 抵押物名称
     */
    public void setThingName(String thingName) {
        this.thingName = thingName == null ? null : thingName.trim();
    }

    /**
     * 数量
     * @return thing_num 数量
     */
    public Integer getThingNum() {
        return thingNum;
    }

    /**
     * 数量
     * @param thingNum 数量
     */
    public void setThingNum(Integer thingNum) {
        this.thingNum = thingNum;
    }

    /**
     * 价值(万元)
     * @return thing_amount 价值(万元)
     */
    public BigDecimal getThingAmount() {
        return thingAmount;
    }

    /**
     * 价值(万元)
     * @param thingAmount 价值(万元)
     */
    public void setThingAmount(BigDecimal thingAmount) {
        this.thingAmount = thingAmount;
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