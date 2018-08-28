package com.igreen.common.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:regist_item表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-08-28
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
     * 数据来源，1手工录入，2excel导入，3网络爬虫
     */
    private Integer dataSource;

    /**
     * 公司在IPE的companyId
     */
    private Integer companyId;

    /**
     * 集团公司是否上市
     */
    private String groupCompanyPublic;

    /**
     * 集团公司名称
     */
    private String groupCompanyName;

    /**
     * 集团公司交易所名称
     */
    private String groupCompanyExchangeName;

    /**
     * 集团公司上市代码
     */
    private String groupCompanyStockCode;

    /**
     * 是否有污水处理设施
     */
    private String sewageFacility;

    /**
     * 是否有工业废气处理设施
     */
    private String processGasFacility;

    /**
     * 是否有锅炉废气处理设施
     */
    private String boilerGasFacility;

    /**
     * 工业污水去向
     */
    private String industrialSewageDischarge;

    /**
     * 生活污水去向
     */
    private String lifeSweageDischarge;

    /**
     * 工业污水排放标准
     */
    private String industrialSewageEmissionStandard;

    /**
     * 生活污水排放标准
     */
    private String lifeSweageEmissionStandard;

    /**
     * 废气执行排放标准
     */
    private String gasEmissionStandard;

    /**
     * 污染源类型
     */
    private String pollutantSource;

    /**
     * 生产经营主要产品
     */
    private String mainProduction;

    /**
     * 企业排污情况自述
     */
    private String pollutantDesc;

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
     * 数据来源，1手工录入，2excel导入，3网络爬虫
     * @return data_source 数据来源，1手工录入，2excel导入，3网络爬虫
     */
    public Integer getDataSource() {
        return dataSource;
    }

    /**
     * 数据来源，1手工录入，2excel导入，3网络爬虫
     * @param dataSource 数据来源，1手工录入，2excel导入，3网络爬虫
     */
    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 公司在IPE的companyId
     * @return company_id 公司在IPE的companyId
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 公司在IPE的companyId
     * @param companyId 公司在IPE的companyId
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 集团公司是否上市
     * @return group_company_public 集团公司是否上市
     */
    public String getGroupCompanyPublic() {
        return groupCompanyPublic;
    }

    /**
     * 集团公司是否上市
     * @param groupCompanyPublic 集团公司是否上市
     */
    public void setGroupCompanyPublic(String groupCompanyPublic) {
        this.groupCompanyPublic = groupCompanyPublic == null ? null : groupCompanyPublic.trim();
    }

    /**
     * 集团公司名称
     * @return group_company_name 集团公司名称
     */
    public String getGroupCompanyName() {
        return groupCompanyName;
    }

    /**
     * 集团公司名称
     * @param groupCompanyName 集团公司名称
     */
    public void setGroupCompanyName(String groupCompanyName) {
        this.groupCompanyName = groupCompanyName == null ? null : groupCompanyName.trim();
    }

    /**
     * 集团公司交易所名称
     * @return group_company_exchange_name 集团公司交易所名称
     */
    public String getGroupCompanyExchangeName() {
        return groupCompanyExchangeName;
    }

    /**
     * 集团公司交易所名称
     * @param groupCompanyExchangeName 集团公司交易所名称
     */
    public void setGroupCompanyExchangeName(String groupCompanyExchangeName) {
        this.groupCompanyExchangeName = groupCompanyExchangeName == null ? null : groupCompanyExchangeName.trim();
    }

    /**
     * 集团公司上市代码
     * @return group_company_stock_code 集团公司上市代码
     */
    public String getGroupCompanyStockCode() {
        return groupCompanyStockCode;
    }

    /**
     * 集团公司上市代码
     * @param groupCompanyStockCode 集团公司上市代码
     */
    public void setGroupCompanyStockCode(String groupCompanyStockCode) {
        this.groupCompanyStockCode = groupCompanyStockCode == null ? null : groupCompanyStockCode.trim();
    }

    /**
     * 是否有污水处理设施
     * @return sewage_facility 是否有污水处理设施
     */
    public String getSewageFacility() {
        return sewageFacility;
    }

    /**
     * 是否有污水处理设施
     * @param sewageFacility 是否有污水处理设施
     */
    public void setSewageFacility(String sewageFacility) {
        this.sewageFacility = sewageFacility == null ? null : sewageFacility.trim();
    }

    /**
     * 是否有工业废气处理设施
     * @return process_gas_facility 是否有工业废气处理设施
     */
    public String getProcessGasFacility() {
        return processGasFacility;
    }

    /**
     * 是否有工业废气处理设施
     * @param processGasFacility 是否有工业废气处理设施
     */
    public void setProcessGasFacility(String processGasFacility) {
        this.processGasFacility = processGasFacility == null ? null : processGasFacility.trim();
    }

    /**
     * 是否有锅炉废气处理设施
     * @return boiler_gas_facility 是否有锅炉废气处理设施
     */
    public String getBoilerGasFacility() {
        return boilerGasFacility;
    }

    /**
     * 是否有锅炉废气处理设施
     * @param boilerGasFacility 是否有锅炉废气处理设施
     */
    public void setBoilerGasFacility(String boilerGasFacility) {
        this.boilerGasFacility = boilerGasFacility == null ? null : boilerGasFacility.trim();
    }

    /**
     * 工业污水去向
     * @return industrial_sewage_discharge 工业污水去向
     */
    public String getIndustrialSewageDischarge() {
        return industrialSewageDischarge;
    }

    /**
     * 工业污水去向
     * @param industrialSewageDischarge 工业污水去向
     */
    public void setIndustrialSewageDischarge(String industrialSewageDischarge) {
        this.industrialSewageDischarge = industrialSewageDischarge == null ? null : industrialSewageDischarge.trim();
    }

    /**
     * 生活污水去向
     * @return life_sweage_discharge 生活污水去向
     */
    public String getLifeSweageDischarge() {
        return lifeSweageDischarge;
    }

    /**
     * 生活污水去向
     * @param lifeSweageDischarge 生活污水去向
     */
    public void setLifeSweageDischarge(String lifeSweageDischarge) {
        this.lifeSweageDischarge = lifeSweageDischarge == null ? null : lifeSweageDischarge.trim();
    }

    /**
     * 工业污水排放标准
     * @return industrial_sewage_emission_standard 工业污水排放标准
     */
    public String getIndustrialSewageEmissionStandard() {
        return industrialSewageEmissionStandard;
    }

    /**
     * 工业污水排放标准
     * @param industrialSewageEmissionStandard 工业污水排放标准
     */
    public void setIndustrialSewageEmissionStandard(String industrialSewageEmissionStandard) {
        this.industrialSewageEmissionStandard = industrialSewageEmissionStandard == null ? null : industrialSewageEmissionStandard.trim();
    }

    /**
     * 生活污水排放标准
     * @return life_sweage_emission_standard 生活污水排放标准
     */
    public String getLifeSweageEmissionStandard() {
        return lifeSweageEmissionStandard;
    }

    /**
     * 生活污水排放标准
     * @param lifeSweageEmissionStandard 生活污水排放标准
     */
    public void setLifeSweageEmissionStandard(String lifeSweageEmissionStandard) {
        this.lifeSweageEmissionStandard = lifeSweageEmissionStandard == null ? null : lifeSweageEmissionStandard.trim();
    }

    /**
     * 废气执行排放标准
     * @return gas_emission_standard 废气执行排放标准
     */
    public String getGasEmissionStandard() {
        return gasEmissionStandard;
    }

    /**
     * 废气执行排放标准
     * @param gasEmissionStandard 废气执行排放标准
     */
    public void setGasEmissionStandard(String gasEmissionStandard) {
        this.gasEmissionStandard = gasEmissionStandard == null ? null : gasEmissionStandard.trim();
    }

    /**
     * 污染源类型
     * @return pollutant_source 污染源类型
     */
    public String getPollutantSource() {
        return pollutantSource;
    }

    /**
     * 污染源类型
     * @param pollutantSource 污染源类型
     */
    public void setPollutantSource(String pollutantSource) {
        this.pollutantSource = pollutantSource == null ? null : pollutantSource.trim();
    }

    /**
     * 生产经营主要产品
     * @return main_production 生产经营主要产品
     */
    public String getMainProduction() {
        return mainProduction;
    }

    /**
     * 生产经营主要产品
     * @param mainProduction 生产经营主要产品
     */
    public void setMainProduction(String mainProduction) {
        this.mainProduction = mainProduction == null ? null : mainProduction.trim();
    }

    /**
     * 企业排污情况自述
     * @return pollutant_desc 企业排污情况自述
     */
    public String getPollutantDesc() {
        return pollutantDesc;
    }

    /**
     * 企业排污情况自述
     * @param pollutantDesc 企业排污情况自述
     */
    public void setPollutantDesc(String pollutantDesc) {
        this.pollutantDesc = pollutantDesc == null ? null : pollutantDesc.trim();
    }
}