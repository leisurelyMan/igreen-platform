package com.igreen.common.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import com.igreen.common.util.IgreenUtil;

/**
 * 描述:shareholder表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class Shareholder {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 股东名称
     */
    private String shareholderName;

    /**
     * 认缴出资额(万元)
     */
    private BigDecimal capital;

    /**
     * 币种
     */
    private String currency;

    /**
     * 出资比例
     */
    private String ratio;

    /**
     * 出资日期
     */
    private String contributiveTime;

    /**
     * 国籍
     */
    private String nationality;

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
    
    public Shareholder() {
		super();
	}
    
    public Shareholder(Map<String, String> params) {
		super();
		this.registItemId = IgreenUtil.getInteger("registItemId", params);
	    this.shareholderName = IgreenUtil.getString("shareholderName", params);
	    this.capital = IgreenUtil.getBigDecimal("capital", params);
	    this.currency = IgreenUtil.getString("currency", params);
	    this.ratio = IgreenUtil.getString("ratio", params);
	    this.contributiveTime = IgreenUtil.getString("contributiveTime", params);
	    this.nationality = IgreenUtil.getString("nationality", params);
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
     * 股东名称
     * @return shareholder_name 股东名称
     */
    public String getShareholderName() {
        return shareholderName;
    }

    /**
     * 股东名称
     * @param shareholderName 股东名称
     */
    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName == null ? null : shareholderName.trim();
    }

    /**
     * 认缴出资额(万元)
     * @return capital 认缴出资额(万元)
     */
    public BigDecimal getCapital() {
        return capital;
    }

    /**
     * 认缴出资额(万元)
     * @param capital 认缴出资额(万元)
     */
    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    /**
     * 币种
     * @return currency 币种
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 币种
     * @param currency 币种
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * 出资比例
     * @return ratio 出资比例
     */
    public String getRatio() {
        return ratio;
    }

    /**
     * 出资比例
     * @param ratio 出资比例
     */
    public void setRatio(String ratio) {
        this.ratio = ratio == null ? null : ratio.trim();
    }

    /**
     * 出资日期
     * @return contributive_time 出资日期
     */
    public String getContributiveTime() {
        return contributiveTime;
    }

    /**
     * 出资日期
     * @param contributiveTime 出资日期
     */
    public void setContributiveTime(String contributiveTime) {
        this.contributiveTime = contributiveTime == null ? null : contributiveTime.trim();
    }

    /**
     * 国籍
     * @return nationality 国籍
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 国籍
     * @param nationality 国籍
     */
    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
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