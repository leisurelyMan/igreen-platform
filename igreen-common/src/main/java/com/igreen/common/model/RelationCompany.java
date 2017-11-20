package com.igreen.common.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:relation_company表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class RelationCompany {
	
    /**
     * id
     */
    private Integer id;
    
    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 主要人员信息ID
     */
    private Integer employeeId;
    
    /**
     * 关联人员姓名
     */
    private String employeeName;
    
    /**
     * 关联人员职务
     */
    private String employeeJob;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 任职
     */
    private String job;

    /**
     * 投资（万元）
     */
    private BigDecimal investment;

    /**
     * 持股比例
     */
    private String ratio;

    /**
     * 注册资本（万元）
     */
    private BigDecimal registAmount;

    /**
     * 注册资本币种
     */
    private String registCurrency;

    /**
     * 企业（机构）类型
     */
    private String companyType;

    /**
     * 注册号
     */
    private String registNo;

    /**
     * 登记机关
     */
    private String registOffice;

    /**
     * 企业状态
     */
    private String companyStatus;

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
     * 主要人员信息ID
     * @return employee_id 主要人员信息ID
     */
    public Integer getEmployeeId() {
        return employeeId;
    }
    
    public Integer getRegistItemId() {
		return registItemId;
	}

	public void setRegistItemId(Integer registItemId) {
		this.registItemId = registItemId;
	}

	/**
     * 主要人员信息ID
     * @param employeeId 主要人员信息ID
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    
    public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeJob() {
		return employeeJob;
	}

	public void setEmployeeJob(String employeeJob) {
		this.employeeJob = employeeJob;
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
     * 任职
     * @return job 任职
     */
    public String getJob() {
        return job;
    }

    /**
     * 任职
     * @param job 任职
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * 投资（万元）
     * @return investment 投资（万元）
     */
    public BigDecimal getInvestment() {
        return investment;
    }

    /**
     * 投资（万元）
     * @param investment 投资（万元）
     */
    public void setInvestment(BigDecimal investment) {
        this.investment = investment;
    }

    /**
     * 持股比例
     * @return ratio 持股比例
     */
    public String getRatio() {
        return ratio;
    }

    /**
     * 持股比例
     * @param ratio 持股比例
     */
    public void setRatio(String ratio) {
        this.ratio = ratio == null ? null : ratio.trim();
    }

    /**
     * 注册资本（万元）
     * @return regist_amount 注册资本（万元）
     */
    public BigDecimal getRegistAmount() {
        return registAmount;
    }

    /**
     * 注册资本（万元）
     * @param registAmount 注册资本（万元）
     */
    public void setRegistAmount(BigDecimal registAmount) {
        this.registAmount = registAmount;
    }

    /**
     * 注册资本币种
     * @return regist_currency 注册资本币种
     */
    public String getRegistCurrency() {
        return registCurrency;
    }

    /**
     * 注册资本币种
     * @param registCurrency 注册资本币种
     */
    public void setRegistCurrency(String registCurrency) {
        this.registCurrency = registCurrency == null ? null : registCurrency.trim();
    }

    /**
     * 企业（机构）类型
     * @return company_type 企业（机构）类型
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 企业（机构）类型
     * @param companyType 企业（机构）类型
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    /**
     * 注册号
     * @return regist_no 注册号
     */
    public String getRegistNo() {
        return registNo;
    }

    /**
     * 注册号
     * @param registNo 注册号
     */
    public void setRegistNo(String registNo) {
        this.registNo = registNo == null ? null : registNo.trim();
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
     * 企业状态
     * @return company_status 企业状态
     */
    public String getCompanyStatus() {
        return companyStatus;
    }

    /**
     * 企业状态
     * @param companyStatus 企业状态
     */
    public void setCompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus == null ? null : companyStatus.trim();
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