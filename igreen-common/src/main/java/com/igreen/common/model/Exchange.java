package com.igreen.common.model;

import java.util.Date;
import java.util.Map;

import com.igreen.common.util.IgreenUtil;

/**
 * 描述:exchange表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class Exchange {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 变更事项
     */
    private String exchangeItem;

    /**
     * 变更前内容
     */
    private String beforeItem;

    /**
     * 变更后内容
     */
    private String afterItem;

    /**
     * 变更日期
     */
    private String exchangeTime;

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
    
    public Exchange() {
		super();
	}
    
    public Exchange(Map<String, String> params) {
		super();
		this.registItemId = IgreenUtil.getInteger("registItemId", params);
	    this.exchangeItem = IgreenUtil.getString("exchangeItem", params);
	    this.beforeItem = IgreenUtil.getString("beforeItem", params);
	    this.afterItem = IgreenUtil.getString("afterItem", params);
	    this.exchangeTime = IgreenUtil.getString("exchangeTime", params);
	    this.status = 1;
	    this.creater = IgreenUtil.getInteger("creater", params);
	    this.createdTime = new Date();
	}

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
     * 变更事项
     * @return exchange_item 变更事项
     */
    public String getExchangeItem() {
        return exchangeItem;
    }

    /**
     * 变更事项
     * @param exchangeItem 变更事项
     */
    public void setExchangeItem(String exchangeItem) {
        this.exchangeItem = exchangeItem == null ? null : exchangeItem.trim();
    }

    /**
     * 变更前内容
     * @return before_item 变更前内容
     */
    public String getBeforeItem() {
        return beforeItem;
    }

    /**
     * 变更前内容
     * @param beforeItem 变更前内容
     */
    public void setBeforeItem(String beforeItem) {
        this.beforeItem = beforeItem == null ? null : beforeItem.trim();
    }

    /**
     * 变更后内容
     * @return after_item 变更后内容
     */
    public String getAfterItem() {
        return afterItem;
    }

    /**
     * 变更后内容
     * @param afterItem 变更后内容
     */
    public void setAfterItem(String afterItem) {
        this.afterItem = afterItem == null ? null : afterItem.trim();
    }

    /**
     * 变更日期
     * @return exchange_time 变更日期
     */
    public String getExchangeTime() {
        return exchangeTime;
    }

    /**
     * 变更日期
     * @param exchangeTime 变更日期
     */
    public void setExchangeTime(String exchangeTime) {
        this.exchangeTime = exchangeTime == null ? null : exchangeTime.trim();
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