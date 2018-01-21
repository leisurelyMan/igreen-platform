package com.igreen.common.model;

/**
 * 描述:qichacha_penalty表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2018-01-20
 */
public class QichachaPenalty {
    /**
     * ID
     */
    private String id;

    /**
     * key_no
     */
    private String keyNo;

    /**
     * 处罚编号
     */
    private String no;

    /**
     * 文档编号
     */
    private String docNo;

    /**
     * 处罚类型
     */
    private String penaltyType;

    /**
     * 处罚机构
     */
    private String officeName;

    /**
     * 公布时间
     */
    private String publicDate;

    /**
     * 处罚时间
     */
    private String penaltyDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 被处罚对象
     */
    private String personName;

    /**
     * 注册编号
     */
    private String regNo;

    /**
     * 经营者
     */
    private String operator;

    /**
     * 处罚链接
     */
    private String adPenaltyLink;

    /**
     * ID
     * @return id ID
     */
    public String getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
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
     * 处罚编号
     * @return no 处罚编号
     */
    public String getNo() {
        return no;
    }

    /**
     * 处罚编号
     * @param no 处罚编号
     */
    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    /**
     * 文档编号
     * @return doc_no 文档编号
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * 文档编号
     * @param docNo 文档编号
     */
    public void setDocNo(String docNo) {
        this.docNo = docNo == null ? null : docNo.trim();
    }

    /**
     * 处罚类型
     * @return penalty_type 处罚类型
     */
    public String getPenaltyType() {
        return penaltyType;
    }

    /**
     * 处罚类型
     * @param penaltyType 处罚类型
     */
    public void setPenaltyType(String penaltyType) {
        this.penaltyType = penaltyType == null ? null : penaltyType.trim();
    }

    /**
     * 处罚机构
     * @return office_name 处罚机构
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * 处罚机构
     * @param officeName 处罚机构
     */
    public void setOfficeName(String officeName) {
        this.officeName = officeName == null ? null : officeName.trim();
    }

    /**
     * 公布时间
     * @return public_date 公布时间
     */
    public String getPublicDate() {
        return publicDate;
    }

    /**
     * 公布时间
     * @param publicDate 公布时间
     */
    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate == null ? null : publicDate.trim();
    }

    /**
     * 处罚时间
     * @return penalty_date 处罚时间
     */
    public String getPenaltyDate() {
        return penaltyDate;
    }

    /**
     * 处罚时间
     * @param penaltyDate 处罚时间
     */
    public void setPenaltyDate(String penaltyDate) {
        this.penaltyDate = penaltyDate == null ? null : penaltyDate.trim();
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
     * 被处罚对象
     * @return person_name 被处罚对象
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * 被处罚对象
     * @param personName 被处罚对象
     */
    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    /**
     * 注册编号
     * @return reg_no 注册编号
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * 注册编号
     * @param regNo 注册编号
     */
    public void setRegNo(String regNo) {
        this.regNo = regNo == null ? null : regNo.trim();
    }

    /**
     * 经营者
     * @return operator 经营者
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 经营者
     * @param operator 经营者
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 处罚链接
     * @return ad_penalty_link 处罚链接
     */
    public String getAdPenaltyLink() {
        return adPenaltyLink;
    }

    /**
     * 处罚链接
     * @param adPenaltyLink 处罚链接
     */
    public void setAdPenaltyLink(String adPenaltyLink) {
        this.adPenaltyLink = adPenaltyLink == null ? null : adPenaltyLink.trim();
    }
}