package com.igreen.common.model;

/**
 * 描述:company_query_qichacha_judgement表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-08-27
 */
public class CompanyQueryQichachaJudgement {
    /**
     * row_content
     */
    private String id;

    /**
     * key_no
     */
    private String keyNo;

    /**
     * t_id
     */
    private String tId;

    /**
     * 执行法院
     */
    private String court;

    /**
     * 处罚名称
     */
    private String caseName;

    /**
     * 处罚编号
     */
    private String caseNo;

    /**
     * 处罚类型
     */
    private String caseType;

    /**
     * 提交时间
     */
    private String submitDate;

    /**
     * 是否为起诉人
     */
    private String isProsecutor;

    /**
     * 是否为被告
     */
    private String isDefendant;

    /**
     * 更新时间
     */
    private String updateDate;

    /**
     * 年度
     */
    private String courtYear;

    /**
     * 角色
     */
    private String caseRole;

    /**
     * row_content
     * @return id row_content
     */
    public String getId() {
        return id;
    }

    /**
     * row_content
     * @param id row_content
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * key_no
     * @return key_no key_no
     */
    public String getKeyNo() {
        return keyNo;
    }

    /**
     * key_no
     * @param keyNo key_no
     */
    public void setKeyNo(String keyNo) {
        this.keyNo = keyNo == null ? null : keyNo.trim();
    }

    /**
     * t_id
     * @return t_id t_id
     */
    public String gettId() {
        return tId;
    }

    /**
     * t_id
     * @param tId t_id
     */
    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    /**
     * 执行法院
     * @return court 执行法院
     */
    public String getCourt() {
        return court;
    }

    /**
     * 执行法院
     * @param court 执行法院
     */
    public void setCourt(String court) {
        this.court = court == null ? null : court.trim();
    }

    /**
     * 处罚名称
     * @return case_name 处罚名称
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * 处罚名称
     * @param caseName 处罚名称
     */
    public void setCaseName(String caseName) {
        this.caseName = caseName == null ? null : caseName.trim();
    }

    /**
     * 处罚编号
     * @return case_no 处罚编号
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * 处罚编号
     * @param caseNo 处罚编号
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    /**
     * 处罚类型
     * @return case_type 处罚类型
     */
    public String getCaseType() {
        return caseType;
    }

    /**
     * 处罚类型
     * @param caseType 处罚类型
     */
    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

    /**
     * 提交时间
     * @return submit_date 提交时间
     */
    public String getSubmitDate() {
        return submitDate;
    }

    /**
     * 提交时间
     * @param submitDate 提交时间
     */
    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate == null ? null : submitDate.trim();
    }

    /**
     * 是否为起诉人
     * @return is_prosecutor 是否为起诉人
     */
    public String getIsProsecutor() {
        return isProsecutor;
    }

    /**
     * 是否为起诉人
     * @param isProsecutor 是否为起诉人
     */
    public void setIsProsecutor(String isProsecutor) {
        this.isProsecutor = isProsecutor == null ? null : isProsecutor.trim();
    }

    /**
     * 是否为被告
     * @return is_defendant 是否为被告
     */
    public String getIsDefendant() {
        return isDefendant;
    }

    /**
     * 是否为被告
     * @param isDefendant 是否为被告
     */
    public void setIsDefendant(String isDefendant) {
        this.isDefendant = isDefendant == null ? null : isDefendant.trim();
    }

    /**
     * 更新时间
     * @return update_date 更新时间
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     * @param updateDate 更新时间
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }

    /**
     * 年度
     * @return court_year 年度
     */
    public String getCourtYear() {
        return courtYear;
    }

    /**
     * 年度
     * @param courtYear 年度
     */
    public void setCourtYear(String courtYear) {
        this.courtYear = courtYear == null ? null : courtYear.trim();
    }

    /**
     * 角色
     * @return case_role 角色
     */
    public String getCaseRole() {
        return caseRole;
    }

    /**
     * 角色
     * @param caseRole 角色
     */
    public void setCaseRole(String caseRole) {
        this.caseRole = caseRole == null ? null : caseRole.trim();
    }
}