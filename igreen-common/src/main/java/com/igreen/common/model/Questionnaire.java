package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:questionnaire表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-06-25
 */
public class Questionnaire {
    /**
     * id
     */
    private Integer id;

    /**
     * 填表人企业
     */
    private Integer customerCompany;
    
    /**
     * 填表人企业(其它)
     */
    private String customerCompanyOther;

    /**
     * 国家
     */
    private Integer country;

    /**
     * 省
     */
    private Integer province;

    /**
     * 发行人性质
     */
    private Integer issuerQuality;

    /**
     * 债券类型
     */
    private Integer bondType;

    /**
     * 发行债券类型(其它)
     */
    private String bondTypeOther;

    /**
     * 发行债券场所
     */
    private Integer issueBondsArea;

    /**
     * 发行债券规模
     */
    private Integer issueBondsScope;

    /**
     * 发行债券规模(具体值)
     */
    private String issueBondsScopeValue;

    /**
     * 发行人近三年发行债券记录
     */
    private Integer issueBondsRecords;

    /**
     * 发行绿债项目类型
     */
    private Integer greenBondsType;

    /**
     * 发行绿债项目类型(其他)
     */
    private String greenBondsTypeOther;

    /**
     * 发行绿债拟募投项目主要技术
     */
    private String majorTechnique;

    /**
     * 合规文件
     */
    private String complianceDocuments;

    /**
     * 合规文件（其他）
     */
    private String complianceDocumentsOther;

    /**
     * 合规项目类型
     */
    private Integer complianceProjectType;

    /**
     * 合规项目类型(其他)
     */
    private String complianceProjectTypeOther;

    /**
     * 专项计划的基础资产项目主要技术
     */
    private String baseProjectMajorTechnique;

    /**
     * 基础资产项目已获得合规文件
     */
    private String awardedComplianceDocuments;

    /**
     * 基础资产项目已获得合规文件(其它)
     */
    private String awardedComplianceDocumentsOther;

    /**
     * 填表人姓名
     */
    private String customerName;

    /**
     * 填表人电话
     */
    private String customerMobile;

    /**
     * 填表人邮箱
     */
    private String customerMail;

    /**
     * 填表人微信
     */
    private String customerWechart;

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
     * 邮件填表人企业
     */
    private String mailCustomerCompany;
    /**
     * 邮件募投项目所在地区
     */
    private String mailRaiseAddress;
    /**
     * 邮件发行人性质
     */
    private String mailIssuer;
    /**
     * 邮件拟发行绿色债券类型
     */
    private String mailBondType;
    /**
     * 邮件拟发行绿色债券场所
     */
    private String mailIssueBondsArea;
    /**
     * 邮件拟发行绿色债券规模
     */
    private String mailIssueBondsAreaAmount;
    /**
     * 邮件发行人近三年债券发行记录
     */
    private String mailIssueBondsRecords;
    /**
     * 邮件发行绿债拟募投项目类型--主类型
     */
    private String mailRaiseMainType;
    /**
     * 邮件发行绿债拟募投项目类型--次级类型
     */
    private String mailRaiseSubType;
    /**
     * 邮件发行绿债拟募投项目主要技术
     */
    private String mailTechnique;
    /**
     * 邮件合规性文件
     */
    private String mailDocuments;
    
    public String getMailCustomerCompany() {
		return mailCustomerCompany;
	}

	public void setMailCustomerCompany(String mailCustomerCompany) {
		this.mailCustomerCompany = mailCustomerCompany;
	}

	public String getMailRaiseAddress() {
		return mailRaiseAddress;
	}

	public void setMailRaiseAddress(String mailRaiseAddress) {
		this.mailRaiseAddress = mailRaiseAddress;
	}

	public String getMailIssuer() {
		return mailIssuer;
	}

	public void setMailIssuer(String mailIssuer) {
		this.mailIssuer = mailIssuer;
	}

	public String getMailBondType() {
		return mailBondType;
	}

	public void setMailBondType(String mailBondType) {
		this.mailBondType = mailBondType;
	}

	public String getMailIssueBondsArea() {
		return mailIssueBondsArea;
	}

	public void setMailIssueBondsArea(String mailIssueBondsArea) {
		this.mailIssueBondsArea = mailIssueBondsArea;
	}

	public String getMailIssueBondsAreaAmount() {
		return mailIssueBondsAreaAmount;
	}

	public void setMailIssueBondsAreaAmount(String mailIssueBondsAreaAmount) {
		this.mailIssueBondsAreaAmount = mailIssueBondsAreaAmount;
	}

	public String getMailIssueBondsRecords() {
		return mailIssueBondsRecords;
	}

	public void setMailIssueBondsRecords(String mailIssueBondsRecords) {
		this.mailIssueBondsRecords = mailIssueBondsRecords;
	}

	public String getMailRaiseMainType() {
		return mailRaiseMainType;
	}

	public void setMailRaiseMainType(String mailRaiseMainType) {
		this.mailRaiseMainType = mailRaiseMainType;
	}

	public String getMailRaiseSubType() {
		return mailRaiseSubType;
	}

	public void setMailRaiseSubType(String mailRaiseSubType) {
		this.mailRaiseSubType = mailRaiseSubType;
	}

	public String getMailTechnique() {
		return mailTechnique;
	}

	public void setMailTechnique(String mailTechnique) {
		this.mailTechnique = mailTechnique;
	}

	public String getMailDocuments() {
		return mailDocuments;
	}

	public void setMailDocuments(String mailDocuments) {
		this.mailDocuments = mailDocuments;
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
     * 填表人企业
     * @return customer_company 填表人企业
     */
    public Integer getCustomerCompany() {
        return customerCompany;
    }

    /**
     * 填表人企业
     * @param customerCompany 填表人企业
     */
    public void setCustomerCompany(Integer customerCompany) {
        this.customerCompany = customerCompany;
    }

    /**
     * 填表人企业(其它)
     * @return customer_company_other 填表人企业(其它)
     */
    public String getCustomerCompanyOther() {
        return customerCompanyOther;
    }

    /**
     * 填表人企业(其它)
     * @param customerCompanyOther 填表人企业(其它)
     */
    public void setCustomerCompanyOther(String customerCompanyOther) {
        this.customerCompanyOther = customerCompanyOther == null ? null : customerCompanyOther.trim();
    }

    /**
     * 国家
     * @return country 国家
     */
    public Integer getCountry() {
        return country;
    }

    /**
     * 国家
     * @param country 国家
     */
    public void setCountry(Integer country) {
        this.country = country;
    }

    /**
     * 省
     * @return province 省
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * 省
     * @param province 省
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * 发行人性质
     * @return issuer_quality 发行人性质
     */
    public Integer getIssuerQuality() {
        return issuerQuality;
    }

    /**
     * 发行人性质
     * @param issuerQuality 发行人性质
     */
    public void setIssuerQuality(Integer issuerQuality) {
        this.issuerQuality = issuerQuality;
    }

    /**
     * 债券类型
     * @return Bond_type 债券类型
     */
    public Integer getBondType() {
        return bondType;
    }

    /**
     * 债券类型
     * @param bondType 债券类型
     */
    public void setBondType(Integer bondType) {
        this.bondType = bondType;
    }

    /**
     * 发行债券类型(其它)
     * @return Bond_type_other 发行债券类型(其它)
     */
    public String getBondTypeOther() {
        return bondTypeOther;
    }

    /**
     * 发行债券类型(其它)
     * @param bondTypeOther 发行债券类型(其它)
     */
    public void setBondTypeOther(String bondTypeOther) {
        this.bondTypeOther = bondTypeOther == null ? null : bondTypeOther.trim();
    }

    /**
     * 发行债券场所
     * @return issue_bonds_area 发行债券场所
     */
    public Integer getIssueBondsArea() {
        return issueBondsArea;
    }

    /**
     * 发行债券场所
     * @param issueBondsArea 发行债券场所
     */
    public void setIssueBondsArea(Integer issueBondsArea) {
        this.issueBondsArea = issueBondsArea;
    }

    /**
     * 发行债券规模
     * @return issue_bonds_scope 发行债券规模
     */
    public Integer getIssueBondsScope() {
        return issueBondsScope;
    }

    /**
     * 发行债券规模
     * @param issueBondsScope 发行债券规模
     */
    public void setIssueBondsScope(Integer issueBondsScope) {
        this.issueBondsScope = issueBondsScope;
    }

    /**
     * 发行债券规模(具体值)
     * @return issue_bonds_scope_value 发行债券规模(具体值)
     */
    public String getIssueBondsScopeValue() {
        return issueBondsScopeValue;
    }

    /**
     * 发行债券规模(具体值)
     * @param issueBondsScopeValue 发行债券规模(具体值)
     */
    public void setIssueBondsScopeValue(String issueBondsScopeValue) {
        this.issueBondsScopeValue = issueBondsScopeValue == null ? null : issueBondsScopeValue.trim();
    }

    /**
     * 发行人近三年发行债券记录
     * @return issue_bonds_records 发行人近三年发行债券记录
     */
    public Integer getIssueBondsRecords() {
        return issueBondsRecords;
    }

    /**
     * 发行人近三年发行债券记录
     * @param issueBondsRecords 发行人近三年发行债券记录
     */
    public void setIssueBondsRecords(Integer issueBondsRecords) {
        this.issueBondsRecords = issueBondsRecords;
    }

    /**
     * 发行绿债项目类型
     * @return green_bonds_type 发行绿债项目类型
     */
    public Integer getGreenBondsType() {
        return greenBondsType;
    }

    /**
     * 发行绿债项目类型
     * @param greenBondsType 发行绿债项目类型
     */
    public void setGreenBondsType(Integer greenBondsType) {
        this.greenBondsType = greenBondsType;
    }

    /**
     * 发行绿债项目类型(其他)
     * @return green_bonds_type_other 发行绿债项目类型(其他)
     */
    public String getGreenBondsTypeOther() {
        return greenBondsTypeOther;
    }

    /**
     * 发行绿债项目类型(其他)
     * @param greenBondsTypeOther 发行绿债项目类型(其他)
     */
    public void setGreenBondsTypeOther(String greenBondsTypeOther) {
        this.greenBondsTypeOther = greenBondsTypeOther == null ? null : greenBondsTypeOther.trim();
    }

    /**
     * 发行绿债拟募投项目主要技术
     * @return major_technique 发行绿债拟募投项目主要技术
     */
    public String getMajorTechnique() {
        return majorTechnique;
    }

    /**
     * 发行绿债拟募投项目主要技术
     * @param majorTechnique 发行绿债拟募投项目主要技术
     */
    public void setMajorTechnique(String majorTechnique) {
        this.majorTechnique = majorTechnique == null ? null : majorTechnique.trim();
    }

    /**
     * 合规文件
     * @return compliance_documents 合规文件
     */
    public String getComplianceDocuments() {
        return complianceDocuments;
    }

    /**
     * 合规文件
     * @param complianceDocuments 合规文件
     */
    public void setComplianceDocuments(String complianceDocuments) {
        this.complianceDocuments = complianceDocuments == null ? null : complianceDocuments.trim();
    }

    /**
     * 合规文件（其他）
     * @return compliance_documents_other 合规文件（其他）
     */
    public String getComplianceDocumentsOther() {
        return complianceDocumentsOther;
    }

    /**
     * 合规文件（其他）
     * @param complianceDocumentsOther 合规文件（其他）
     */
    public void setComplianceDocumentsOther(String complianceDocumentsOther) {
        this.complianceDocumentsOther = complianceDocumentsOther == null ? null : complianceDocumentsOther.trim();
    }

    /**
     * 合规项目类型
     * @return compliance_project_type 合规项目类型
     */
    public Integer getComplianceProjectType() {
        return complianceProjectType;
    }

    /**
     * 合规项目类型
     * @param complianceProjectType 合规项目类型
     */
    public void setComplianceProjectType(Integer complianceProjectType) {
        this.complianceProjectType = complianceProjectType;
    }

    /**
     * 合规项目类型(其他)
     * @return compliance_project_type_other 合规项目类型(其他)
     */
    public String getComplianceProjectTypeOther() {
        return complianceProjectTypeOther;
    }

    /**
     * 合规项目类型(其他)
     * @param complianceProjectTypeOther 合规项目类型(其他)
     */
    public void setComplianceProjectTypeOther(String complianceProjectTypeOther) {
        this.complianceProjectTypeOther = complianceProjectTypeOther == null ? null : complianceProjectTypeOther.trim();
    }

    /**
     * 专项计划的基础资产项目主要技术
     * @return base_project_major_technique 专项计划的基础资产项目主要技术
     */
    public String getBaseProjectMajorTechnique() {
        return baseProjectMajorTechnique;
    }

    /**
     * 专项计划的基础资产项目主要技术
     * @param baseProjectMajorTechnique 专项计划的基础资产项目主要技术
     */
    public void setBaseProjectMajorTechnique(String baseProjectMajorTechnique) {
        this.baseProjectMajorTechnique = baseProjectMajorTechnique == null ? null : baseProjectMajorTechnique.trim();
    }

    /**
     * 基础资产项目已获得合规文件
     * @return Awarded_compliance_documents 基础资产项目已获得合规文件
     */
    public String getAwardedComplianceDocuments() {
        return awardedComplianceDocuments;
    }

    /**
     * 基础资产项目已获得合规文件
     * @param awardedComplianceDocuments 基础资产项目已获得合规文件
     */
    public void setAwardedComplianceDocuments(String awardedComplianceDocuments) {
        this.awardedComplianceDocuments = awardedComplianceDocuments == null ? null : awardedComplianceDocuments.trim();
    }

    /**
     * 基础资产项目已获得合规文件(其它)
     * @return Awarded_compliance_documents_other 基础资产项目已获得合规文件(其它)
     */
    public String getAwardedComplianceDocumentsOther() {
        return awardedComplianceDocumentsOther;
    }

    /**
     * 基础资产项目已获得合规文件(其它)
     * @param awardedComplianceDocumentsOther 基础资产项目已获得合规文件(其它)
     */
    public void setAwardedComplianceDocumentsOther(String awardedComplianceDocumentsOther) {
        this.awardedComplianceDocumentsOther = awardedComplianceDocumentsOther == null ? null : awardedComplianceDocumentsOther.trim();
    }

    /**
     * 填表人姓名
     * @return customer_name 填表人姓名
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 填表人姓名
     * @param customerName 填表人姓名
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 填表人电话
     * @return customer_mobile 填表人电话
     */
    public String getCustomerMobile() {
        return customerMobile;
    }

    /**
     * 填表人电话
     * @param customerMobile 填表人电话
     */
    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile == null ? null : customerMobile.trim();
    }

    /**
     * 填表人邮箱
     * @return customer_mail 填表人邮箱
     */
    public String getCustomerMail() {
        return customerMail;
    }

    /**
     * 填表人邮箱
     * @param customerMail 填表人邮箱
     */
    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail == null ? null : customerMail.trim();
    }

    /**
     * 填表人微信
     * @return customer_wechart 填表人微信
     */
    public String getCustomerWechart() {
        return customerWechart;
    }

    /**
     * 填表人微信
     * @param customerWechart 填表人微信
     */
    public void setCustomerWechart(String customerWechart) {
        this.customerWechart = customerWechart == null ? null : customerWechart.trim();
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