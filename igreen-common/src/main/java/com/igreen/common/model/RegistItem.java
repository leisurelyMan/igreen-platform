package com.igreen.common.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import com.igreen.common.util.IgreenUtil;

/**
 * 描述:regist_item表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class RegistItem {
    /**
     * id
     */
    private Integer id;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 法人代表姓名
     */
    private String legalRepresentative;

    /**
     * 注册号
     */
    private String registNumber;

    /**
     * 原注册号
     */
    private String oldRegistNumber;

    /**
     * 注册资本(万元)
     */
    private BigDecimal registeredCapital;

    /**
     * 实收资本 (万元)
     */
    private BigDecimal paidInCapital;

    /**
     * 币种
     */
    private String currency;

    /**
     * 企业(机构)类型
     */
    private String companyType;

    /**
     * 经营状态
     */
    private String operateState;

    /**
     * 经营期限 自
     */
    private String startTime;

    /**
     * 经营期限 至
     */
    private String endTime;

    /**
     * 开业日期
     */
    private String openTime;

    /**
     * 注销日期
     */
    private String cancelTime;

    /**
     * 吊销日期
     */
    private String revokeTime;

    /**
     * 登记机关
     */
    private String registOffice;

    /**
     * 地址
     */
    private String address;

    /**
     * 最后年检年度
     */
    private String annualYear;

    /**
     * 最后年检日期
     */
    private String annualDay;

    /**
     * 行业门类代码
     */
    private String tradeCode;

    /**
     * 行业门类名称
     */
    private String tradeName;

    /**
     * 国民经济行业代码
     */
    private String countryTradeCode;

    /**
     * 国民经济行业名称
     */
    private String countryTradeName;

    /**
     * 许可经营项目
     */
    private String permission;

    /**
     * 一般经营项目
     */
    private String general;

    /**
     * 经营(业务)范围
     */
    private String businessScope;

    /**
     * 经营(业务)范围及方式
     */
    private String businessWay;
    
    /**
     * 数据来源，1手工录入，2excel导入，3网络爬虫
     */
    private Integer dataSource;

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
    private Date createdTime = new Date();

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
     * 公司在IPE上的ID
     */
    private Integer companyId;
    
    
    private String groupCompanyPublic;
    
    private String groupCompanyName;
    
    private String groupCompanyExchangeName;
    
    private String groupCompanyStockCode;
    
    private String sweageFacility;
    
    private String processGasFacility;
    
    private String boilerGasFacility;
    
    private String industrialSweageDischarge;
    
    private String lifeSewageDischarge;
    
    private String indistrialSweageEmissionStandard;
    
    private String lifeSweageEmissionStandard;
    
    private String gasEmissionStandard;
    
    private String pollutantSource;
    
    private String mainProduction;
    
    private String pollutantDesc;
        
    public String getGroupCompanyPublic() {
		return groupCompanyPublic;
	}

	public void setGroupCompanyPublic(String groupCompanyPublic) {
		this.groupCompanyPublic = groupCompanyPublic;
	}

	public String getGroupCompanyName() {
		return groupCompanyName;
	}

	public void setGroupCompanyName(String groupCompanyName) {
		this.groupCompanyName = groupCompanyName;
	}

	public String getGroupCompanyExchangeName() {
		return groupCompanyExchangeName;
	}

	public void setGroupCompanyExchangeName(String groupCompanyExchangeName) {
		this.groupCompanyExchangeName = groupCompanyExchangeName;
	}

	public String getGroupCompanyStockCode() {
		return groupCompanyStockCode;
	}

	public void setGroupCompanyStockCode(String groupCompanyStockCode) {
		this.groupCompanyStockCode = groupCompanyStockCode;
	}

	public String getSweageFacility() {
		return sweageFacility;
	}

	public void setSweageFacility(String sweageFacility) {
		this.sweageFacility = sweageFacility;
	}

	public String getProcessGasFacility() {
		return processGasFacility;
	}

	public void setProcessGasFacility(String processGasFacility) {
		this.processGasFacility = processGasFacility;
	}

	public String getBoilerGasFacility() {
		return boilerGasFacility;
	}

	public void setBoilerGasFacility(String boilerGasFacility) {
		this.boilerGasFacility = boilerGasFacility;
	}

	public String getIndustrialSweageDischarge() {
		return industrialSweageDischarge;
	}

	public void setIndustrialSweageDischarge(String industrialSweageDischarge) {
		this.industrialSweageDischarge = industrialSweageDischarge;
	}

	public String getLifeSewageDischarge() {
		return lifeSewageDischarge;
	}

	public void setLifeSewageDischarge(String lifeSewageDischarge) {
		this.lifeSewageDischarge = lifeSewageDischarge;
	}

	public String getIndistrialSweageEmissionStandard() {
		return indistrialSweageEmissionStandard;
	}

	public void setIndistrialSweageEmissionStandard(
			String indistrialSweageEmissionStandard) {
		this.indistrialSweageEmissionStandard = indistrialSweageEmissionStandard;
	}

	public String getLifeSweageEmissionStandard() {
		return lifeSweageEmissionStandard;
	}

	public void setLifeSweageEmissionStandard(String lifeSweageEmissionStandard) {
		this.lifeSweageEmissionStandard = lifeSweageEmissionStandard;
	}

	public String getGasEmissionStandard() {
		return gasEmissionStandard;
	}

	public void setGasEmissionStandard(String gasEmissionStandard) {
		this.gasEmissionStandard = gasEmissionStandard;
	}

	public String getPollutantSource() {
		return pollutantSource;
	}

	public void setPollutantSource(String pollutantSource) {
		this.pollutantSource = pollutantSource;
	}

	public String getMainProduction() {
		return mainProduction;
	}

	public void setMainProduction(String mainProduction) {
		this.mainProduction = mainProduction;
	}

	public String getPollutantDesc() {
		return pollutantDesc;
	}

	public void setPollutantDesc(String pollutantDesc) {
		this.pollutantDesc = pollutantDesc;
	}

	public RegistItem() {
		super();
	}
    
    public RegistItem(Map<String, String> params) {
		super();
	    this.companyName = IgreenUtil.getString("companyName", params);
	    this.legalRepresentative = IgreenUtil.getString("legalRepresentative", params);
	    this.registNumber = IgreenUtil.getString("registNumber", params);
	    this.oldRegistNumber = IgreenUtil.getString("oldRegistNumber", params);
	    this.registeredCapital = IgreenUtil.getBigDecimal("registeredCapital", params);
	    this.paidInCapital = IgreenUtil.getBigDecimal("paidInCapital", params);
	    this.currency = IgreenUtil.getString("currency", params);
	    this.companyType = IgreenUtil.getString("companyType", params);
	    this.operateState = IgreenUtil.getString("operateState", params);
	    this.startTime = IgreenUtil.getString("startTime", params);
	    this.endTime = IgreenUtil.getString("endTime", params);
	    this.openTime = IgreenUtil.getString("openTime", params);
	    this.cancelTime = IgreenUtil.getString("cancelTime", params);
	    this.revokeTime = IgreenUtil.getString("revokeTime", params);
	    this.registOffice = IgreenUtil.getString("registOffice", params);
	    this.address = IgreenUtil.getString("address", params);
	    this.annualYear = IgreenUtil.getString("annualYear", params);
	    this.annualDay = IgreenUtil.getString("annualDay", params);
	    this.tradeCode = IgreenUtil.getString("tradeCode", params);
	    this.tradeName = IgreenUtil.getString("tradeName", params);
	    this.countryTradeCode = IgreenUtil.getString("countryTradeCode", params);
	    this.countryTradeName = IgreenUtil.getString("countryTradeName", params);
	    this.permission = IgreenUtil.getString("permission", params);
	    this.general = IgreenUtil.getString("general", params);
	    this.businessScope = IgreenUtil.getString("businessScope", params);
	    this.businessWay = IgreenUtil.getString("businessWay", params);
	    this.status = 1;
	    this.creater = IgreenUtil.getInteger("creater", params);
	    this.createdTime = new Date();
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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
     * 企业名称
     * @return company_name 企业名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 企业名称
     * @param companyName 企业名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 法人代表姓名
     * @return legal_representative 法人代表姓名
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    /**
     * 法人代表姓名
     * @param legalRepresentative 法人代表姓名
     */
    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative == null ? null : legalRepresentative.trim();
    }

    /**
     * 注册号
     * @return regist_number 注册号
     */
    public String getRegistNumber() {
        return registNumber;
    }

    /**
     * 注册号
     * @param registNumber 注册号
     */
    public void setRegistNumber(String registNumber) {
        this.registNumber = registNumber == null ? null : registNumber.trim();
    }

    /**
     * 原注册号
     * @return old_regist_number 原注册号
     */
    public String getOldRegistNumber() {
        return oldRegistNumber;
    }

    /**
     * 原注册号
     * @param oldRegistNumber 原注册号
     */
    public void setOldRegistNumber(String oldRegistNumber) {
        this.oldRegistNumber = oldRegistNumber == null ? null : oldRegistNumber.trim();
    }

    /**
     * 注册资本(万元)
     * @return registered_capital 注册资本(万元)
     */
    public BigDecimal getRegisteredCapital() {
        return registeredCapital;
    }

    /**
     * 注册资本(万元)
     * @param registeredCapital 注册资本(万元)
     */
    public void setRegisteredCapital(BigDecimal registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    /**
     * 实收资本 (万元)
     * @return paid_in_capital 实收资本 (万元)
     */
    public BigDecimal getPaidInCapital() {
        return paidInCapital;
    }

    /**
     * 实收资本 (万元)
     * @param paidInCapital 实收资本 (万元)
     */
    public void setPaidInCapital(BigDecimal paidInCapital) {
        this.paidInCapital = paidInCapital;
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
     * 企业(机构)类型
     * @return company_type 企业(机构)类型
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 企业(机构)类型
     * @param companyType 企业(机构)类型
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    /**
     * 经营状态
     * @return operate_state 经营状态
     */
    public String getOperateState() {
        return operateState;
    }

    /**
     * 经营状态
     * @param operateState 经营状态
     */
    public void setOperateState(String operateState) {
        this.operateState = operateState == null ? null : operateState.trim();
    }

    /**
     * 经营期限 自
     * @return start_time 经营期限 自
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 经营期限 自
     * @param startTime 经营期限 自
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * 经营期限 至
     * @return end_time 经营期限 至
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 经营期限 至
     * @param endTime 经营期限 至
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * 开业日期
     * @return open_time 开业日期
     */
    public String getOpenTime() {
        return openTime;
    }

    /**
     * 开业日期
     * @param openTime 开业日期
     */
    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    /**
     * 注销日期
     * @return cancel_time 注销日期
     */
    public String getCancelTime() {
        return cancelTime;
    }

    /**
     * 注销日期
     * @param cancelTime 注销日期
     */
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime == null ? null : cancelTime.trim();
    }

    /**
     * 吊销日期
     * @return revoke_time 吊销日期
     */
    public String getRevokeTime() {
        return revokeTime;
    }

    /**
     * 吊销日期
     * @param revokeTime 吊销日期
     */
    public void setRevokeTime(String revokeTime) {
        this.revokeTime = revokeTime == null ? null : revokeTime.trim();
    }

    /**
     * 登记机关
     * @return regist_office 登记机关
     */
    public String getRegistOffice() {
        return registOffice;
    }

    /**
     * 登记机关
     * @param registOffice 登记机关
     */
    public void setRegistOffice(String registOffice) {
        this.registOffice = registOffice == null ? null : registOffice.trim();
    }

    /**
     * 地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 最后年检年度
     * @return annual_year 最后年检年度
     */
    public String getAnnualYear() {
        return annualYear;
    }

    /**
     * 最后年检年度
     * @param annualYear 最后年检年度
     */
    public void setAnnualYear(String annualYear) {
        this.annualYear = annualYear == null ? null : annualYear.trim();
    }

    /**
     * 最后年检日期
     * @return annual_day 最后年检日期
     */
    public String getAnnualDay() {
        return annualDay;
    }

    /**
     * 最后年检日期
     * @param annualDay 最后年检日期
     */
    public void setAnnualDay(String annualDay) {
        this.annualDay = annualDay == null ? null : annualDay.trim();
    }

    /**
     * 行业门类代码
     * @return trade_code 行业门类代码
     */
    public String getTradeCode() {
        return tradeCode;
    }

    /**
     * 行业门类代码
     * @param tradeCode 行业门类代码
     */
    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode == null ? null : tradeCode.trim();
    }

    /**
     * 行业门类名称
     * @return trade_name 行业门类名称
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * 行业门类名称
     * @param tradeName 行业门类名称
     */
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName == null ? null : tradeName.trim();
    }

    /**
     * 国民经济行业代码
     * @return country_trade_code 国民经济行业代码
     */
    public String getCountryTradeCode() {
        return countryTradeCode;
    }

    /**
     * 国民经济行业代码
     * @param countryTradeCode 国民经济行业代码
     */
    public void setCountryTradeCode(String countryTradeCode) {
        this.countryTradeCode = countryTradeCode == null ? null : countryTradeCode.trim();
    }

    /**
     * 国民经济行业名称
     * @return country_trade_name 国民经济行业名称
     */
    public String getCountryTradeName() {
        return countryTradeName;
    }

    /**
     * 国民经济行业名称
     * @param countryTradeName 国民经济行业名称
     */
    public void setCountryTradeName(String countryTradeName) {
        this.countryTradeName = countryTradeName == null ? null : countryTradeName.trim();
    }

    /**
     * 许可经营项目
     * @return permission 许可经营项目
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 许可经营项目
     * @param permission 许可经营项目
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * 一般经营项目
     * @return general 一般经营项目
     */
    public String getGeneral() {
        return general;
    }

    /**
     * 一般经营项目
     * @param general 一般经营项目
     */
    public void setGeneral(String general) {
        this.general = general == null ? null : general.trim();
    }

    /**
     * 经营(业务)范围
     * @return business_scope 经营(业务)范围
     */
    public String getBusinessScope() {
        return businessScope;
    }

    /**
     * 经营(业务)范围
     * @param businessScope 经营(业务)范围
     */
    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    /**
     * 经营(业务)范围及方式
     * @return business_way 经营(业务)范围及方式
     */
    public String getBusinessWay() {
        return businessWay;
    }

    /**
     * 经营(业务)范围及方式
     * @param businessWay 经营(业务)范围及方式
     */
    public void setBusinessWay(String businessWay) {
        this.businessWay = businessWay == null ? null : businessWay.trim();
    }
    
    public Integer getDataSource() {
		return dataSource;
	}

	public void setDataSource(Integer dataSource) {
		this.dataSource = dataSource;
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