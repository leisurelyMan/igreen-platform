package com.igreen.common.dto;

import java.util.List;

import com.igreen.common.model.Questionnaire;

public class QuestionnaireDto {
	
    /**
     * id
     */
    private Integer id;

    /**
     * 填表人企业
     */
    private Integer customerCompany;
    
    
    private String customerCompanyValue;
    
    /**
     * 填表人企业(其它)
     */
    private String customerCompanyOther;

    /**
     * 国家
     */
    private Integer country;
    
    
    private String countryValue;

    /**
     * 省
     */
    private Integer province;
    
    
    private String provinceValue;

    /**
     * 发行人性质
     */
    private Integer issuerQuality;
    
    
    private String issuerQualityValue;

    /**
     * 债券类型
     */
    private Integer bondType;
    
    
    private String bondTypeValue;

    /**
     * 发行债券类型(其它)
     */
    private String bondTypeOther;

    /**
     * 发行债券场所
     */
    private Integer issueBondsArea;
    
    
    private String issueBondsAreaValue;

    /**
     * 发行债券规模
     */
    private Integer issueBondsScope;
    
    
    private String bondsScopeValue;

    /**
     * 发行债券规模(具体值)
     */
    private String issueBondsScopeValue;

    /**
     * 发行人近三年发行债券记录
     */
    private Integer issueBondsRecords;
    
    
    private String issueBondsRecordsValue;

    /**
     * 发行绿债项目类型
     */
    private Integer greenBondsType;
    
    
    private String greenBondsTypeValue;

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
    
    private String complianceDocumentsValue;

    /**
     * 合规文件（其他）
     */
    private String complianceDocumentsOther;

    /**
     * 合规项目类型
     */
    private Integer complianceProjectType;
    
    
    private String complianceProjectTypeValue;

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
    
    
    private String awardedComplianceDocumentsValue;

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

	public QuestionnaireDto() {
		super();
	}

	public QuestionnaireDto(Questionnaire questionnaire) {
		super();
		this.id = questionnaire.getId();
		this.customerCompany = questionnaire.getCustomerCompany();
		this.customerCompanyOther = questionnaire.getCustomerCompanyOther();
		this.country = questionnaire.getCountry();
		this.province = questionnaire.getProvince();
		this.issuerQuality = questionnaire.getIssuerQuality();
		this.bondType = questionnaire.getBondType();
		this.bondTypeOther = questionnaire.getBondTypeOther();
		this.issueBondsArea = questionnaire.getIssueBondsArea();
		this.issueBondsScope = questionnaire.getIssueBondsScope();
		this.issueBondsScopeValue = questionnaire.getIssueBondsScopeValue();
		this.issueBondsRecords = questionnaire.getIssueBondsRecords();
		this.greenBondsType = questionnaire.getGreenBondsType();
		this.greenBondsTypeOther = questionnaire.getGreenBondsTypeOther();
		this.majorTechnique = questionnaire.getMajorTechnique();
		this.complianceDocuments = questionnaire.getComplianceDocuments();
		this.complianceDocumentsOther = questionnaire.getComplianceDocumentsOther();
		this.complianceProjectType = questionnaire.getComplianceProjectType();
		this.complianceProjectTypeOther = questionnaire.getComplianceProjectTypeOther();
		this.baseProjectMajorTechnique = questionnaire.getBaseProjectMajorTechnique();
		this.awardedComplianceDocuments = questionnaire.getAwardedComplianceDocuments();
		this.awardedComplianceDocumentsOther = questionnaire.getAwardedComplianceDocumentsOther();
		this.customerName = questionnaire.getCustomerName();
		this.customerMobile = questionnaire.getCustomerMobile();
		this.customerMail = questionnaire.getCustomerMail();
		this.customerWechart = questionnaire.getCustomerWechart();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerCompany() {
		return customerCompany;
	}

	public void setCustomerCompany(Integer customerCompany) {
		this.customerCompany = customerCompany;
	}

	public String getCustomerCompanyValue() {
		return customerCompanyValue;
	}

	public void setCustomerCompanyValue(String customerCompanyValue) {
		this.customerCompanyValue = customerCompanyValue;
	}

	public String getCustomerCompanyOther() {
		return customerCompanyOther;
	}

	public void setCustomerCompanyOther(String customerCompanyOther) {
		this.customerCompanyOther = customerCompanyOther;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public String getCountryValue() {
		return countryValue;
	}

	public void setCountryValue(String countryValue) {
		this.countryValue = countryValue;
	}

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public String getProvinceValue() {
		return provinceValue;
	}

	public void setProvinceValue(String provinceValue) {
		this.provinceValue = provinceValue;
	}

	public Integer getIssuerQuality() {
		return issuerQuality;
	}

	public void setIssuerQuality(Integer issuerQuality) {
		this.issuerQuality = issuerQuality;
	}

	public String getIssuerQualityValue() {
		return issuerQualityValue;
	}

	public void setIssuerQualityValue(String issuerQualityValue) {
		this.issuerQualityValue = issuerQualityValue;
	}

	public Integer getBondType() {
		return bondType;
	}

	public void setBondType(Integer bondType) {
		this.bondType = bondType;
	}

	public String getBondTypeValue() {
		return bondTypeValue;
	}

	public void setBondTypeValue(String bondTypeValue) {
		this.bondTypeValue = bondTypeValue;
	}

	public String getBondTypeOther() {
		return bondTypeOther;
	}

	public void setBondTypeOther(String bondTypeOther) {
		this.bondTypeOther = bondTypeOther;
	}

	public Integer getIssueBondsArea() {
		return issueBondsArea;
	}

	public void setIssueBondsArea(Integer issueBondsArea) {
		this.issueBondsArea = issueBondsArea;
	}

	public String getIssueBondsAreaValue() {
		return issueBondsAreaValue;
	}

	public void setIssueBondsAreaValue(String issueBondsAreaValue) {
		this.issueBondsAreaValue = issueBondsAreaValue;
	}

	public Integer getIssueBondsScope() {
		return issueBondsScope;
	}

	public void setIssueBondsScope(Integer issueBondsScope) {
		this.issueBondsScope = issueBondsScope;
	}

	public String getBondsScopeValue() {
		return bondsScopeValue;
	}

	public void setBondsScopeValue(String bondsScopeValue) {
		this.bondsScopeValue = bondsScopeValue;
	}

	public String getIssueBondsScopeValue() {
		return issueBondsScopeValue;
	}

	public void setIssueBondsScopeValue(String issueBondsScopeValue) {
		this.issueBondsScopeValue = issueBondsScopeValue;
	}

	public Integer getIssueBondsRecords() {
		return issueBondsRecords;
	}

	public void setIssueBondsRecords(Integer issueBondsRecords) {
		this.issueBondsRecords = issueBondsRecords;
	}

	public String getIssueBondsRecordsValue() {
		return issueBondsRecordsValue;
	}

	public void setIssueBondsRecordsValue(String issueBondsRecordsValue) {
		this.issueBondsRecordsValue = issueBondsRecordsValue;
	}

	public Integer getGreenBondsType() {
		return greenBondsType;
	}

	public void setGreenBondsType(Integer greenBondsType) {
		this.greenBondsType = greenBondsType;
	}

	public String getGreenBondsTypeValue() {
		return greenBondsTypeValue;
	}

	public void setGreenBondsTypeValue(String greenBondsTypeValue) {
		this.greenBondsTypeValue = greenBondsTypeValue;
	}

	public String getGreenBondsTypeOther() {
		return greenBondsTypeOther;
	}

	public void setGreenBondsTypeOther(String greenBondsTypeOther) {
		this.greenBondsTypeOther = greenBondsTypeOther;
	}

	public String getMajorTechnique() {
		return majorTechnique;
	}

	public void setMajorTechnique(String majorTechnique) {
		this.majorTechnique = majorTechnique;
	}

	public String getComplianceDocuments() {
		return complianceDocuments;
	}

	public void setComplianceDocuments(String complianceDocuments) {
		this.complianceDocuments = complianceDocuments;
	}

	public String getComplianceDocumentsValue() {
		return complianceDocumentsValue;
	}

	public void setComplianceDocumentsValue(String complianceDocumentsValue) {
		this.complianceDocumentsValue = complianceDocumentsValue;
	}

	public String getComplianceDocumentsOther() {
		return complianceDocumentsOther;
	}

	public void setComplianceDocumentsOther(String complianceDocumentsOther) {
		this.complianceDocumentsOther = complianceDocumentsOther;
	}

	public Integer getComplianceProjectType() {
		return complianceProjectType;
	}

	public void setComplianceProjectType(Integer complianceProjectType) {
		this.complianceProjectType = complianceProjectType;
	}

	public String getComplianceProjectTypeValue() {
		return complianceProjectTypeValue;
	}

	public void setComplianceProjectTypeValue(String complianceProjectTypeValue) {
		this.complianceProjectTypeValue = complianceProjectTypeValue;
	}

	public String getComplianceProjectTypeOther() {
		return complianceProjectTypeOther;
	}

	public void setComplianceProjectTypeOther(String complianceProjectTypeOther) {
		this.complianceProjectTypeOther = complianceProjectTypeOther;
	}

	public String getBaseProjectMajorTechnique() {
		return baseProjectMajorTechnique;
	}

	public void setBaseProjectMajorTechnique(String baseProjectMajorTechnique) {
		this.baseProjectMajorTechnique = baseProjectMajorTechnique;
	}

	public String getAwardedComplianceDocuments() {
		return awardedComplianceDocuments;
	}

	public void setAwardedComplianceDocuments(String awardedComplianceDocuments) {
		this.awardedComplianceDocuments = awardedComplianceDocuments;
	}

	public String getAwardedComplianceDocumentsValue() {
		return awardedComplianceDocumentsValue;
	}

	public void setAwardedComplianceDocumentsValue(String awardedComplianceDocumentsValue) {
		this.awardedComplianceDocumentsValue = awardedComplianceDocumentsValue;
	}

	public String getAwardedComplianceDocumentsOther() {
		return awardedComplianceDocumentsOther;
	}

	public void setAwardedComplianceDocumentsOther(String awardedComplianceDocumentsOther) {
		this.awardedComplianceDocumentsOther = awardedComplianceDocumentsOther;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerMail() {
		return customerMail;
	}

	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}

	public String getCustomerWechart() {
		return customerWechart;
	}

	public void setCustomerWechart(String customerWechart) {
		this.customerWechart = customerWechart;
	}
    
}
