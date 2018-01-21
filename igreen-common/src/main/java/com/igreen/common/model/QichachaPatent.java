package com.igreen.common.model;

/**
 * 描述:qichacha_patent表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2018-01-20
 */
public class QichachaPatent {
    /**
     * id
     */
    private String id;

    /**
     * key_no
     */
    private String keyNo;

    /**
     * key_nop
     */
    private String keyNop;

    /**
     * 专利类别
     */
    private String ipcList;

    /**
     * 种类code
     */
    private String kindCode;

    /**
     * 申请编号
     */
    private String applicationNumber;

    /**
     * 申请时间
     */
    private String applicationDate;

    /**
     * 发布编号
     */
    private String publicationNumber;

    /**
     * 发布时间
     */
    private String publicationDate;

    /**
     * 法定状态
     */
    private String legalStatus;

    /**
     * 法定状态描述
     */
    private String legalStatusDesc;

    /**
     * 标题
     */
    private String title;

    /**
     * 代理机构
     */
    private String agency;

    /**
     * 种类描述
     */
    private String kindCodeDesc;

    /**
     * 专利类别描述
     */
    private String ipcDesc;

    /**
     * 发明人
     */
    private String inventorStringList;

    /**
     * 代理人
     */
    private String assigneestringList;

    /**
     * id
     * @return id id
     */
    public String getId() {
        return id;
    }

    /**
     * id
     * @param id id
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
     * key_nop
     * @return key_nop key_nop
     */
    public String getKeyNop() {
        return keyNop;
    }

    /**
     * key_nop
     * @param keyNop key_nop
     */
    public void setKeyNop(String keyNop) {
        this.keyNop = keyNop == null ? null : keyNop.trim();
    }

    /**
     * 专利类别
     * @return ipc_list 专利类别
     */
    public String getIpcList() {
        return ipcList;
    }

    /**
     * 专利类别
     * @param ipcList 专利类别
     */
    public void setIpcList(String ipcList) {
        this.ipcList = ipcList == null ? null : ipcList.trim();
    }

    /**
     * 种类code
     * @return kind_code 种类code
     */
    public String getKindCode() {
        return kindCode;
    }

    /**
     * 种类code
     * @param kindCode 种类code
     */
    public void setKindCode(String kindCode) {
        this.kindCode = kindCode == null ? null : kindCode.trim();
    }

    /**
     * 申请编号
     * @return application_number 申请编号
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * 申请编号
     * @param applicationNumber 申请编号
     */
    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber == null ? null : applicationNumber.trim();
    }

    /**
     * 申请时间
     * @return application_date 申请时间
     */
    public String getApplicationDate() {
        return applicationDate;
    }

    /**
     * 申请时间
     * @param applicationDate 申请时间
     */
    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate == null ? null : applicationDate.trim();
    }

    /**
     * 发布编号
     * @return publication_number 发布编号
     */
    public String getPublicationNumber() {
        return publicationNumber;
    }

    /**
     * 发布编号
     * @param publicationNumber 发布编号
     */
    public void setPublicationNumber(String publicationNumber) {
        this.publicationNumber = publicationNumber == null ? null : publicationNumber.trim();
    }

    /**
     * 发布时间
     * @return publication_date 发布时间
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * 发布时间
     * @param publicationDate 发布时间
     */
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate == null ? null : publicationDate.trim();
    }

    /**
     * 法定状态
     * @return legal_status 法定状态
     */
    public String getLegalStatus() {
        return legalStatus;
    }

    /**
     * 法定状态
     * @param legalStatus 法定状态
     */
    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus == null ? null : legalStatus.trim();
    }

    /**
     * 法定状态描述
     * @return legal_status_desc 法定状态描述
     */
    public String getLegalStatusDesc() {
        return legalStatusDesc;
    }

    /**
     * 法定状态描述
     * @param legalStatusDesc 法定状态描述
     */
    public void setLegalStatusDesc(String legalStatusDesc) {
        this.legalStatusDesc = legalStatusDesc == null ? null : legalStatusDesc.trim();
    }

    /**
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 代理机构
     * @return agency 代理机构
     */
    public String getAgency() {
        return agency;
    }

    /**
     * 代理机构
     * @param agency 代理机构
     */
    public void setAgency(String agency) {
        this.agency = agency == null ? null : agency.trim();
    }

    /**
     * 种类描述
     * @return kind_code_desc 种类描述
     */
    public String getKindCodeDesc() {
        return kindCodeDesc;
    }

    /**
     * 种类描述
     * @param kindCodeDesc 种类描述
     */
    public void setKindCodeDesc(String kindCodeDesc) {
        this.kindCodeDesc = kindCodeDesc == null ? null : kindCodeDesc.trim();
    }

    /**
     * 专利类别描述
     * @return ipc_desc 专利类别描述
     */
    public String getIpcDesc() {
        return ipcDesc;
    }

    /**
     * 专利类别描述
     * @param ipcDesc 专利类别描述
     */
    public void setIpcDesc(String ipcDesc) {
        this.ipcDesc = ipcDesc == null ? null : ipcDesc.trim();
    }

    /**
     * 发明人
     * @return inventor_string_list 发明人
     */
    public String getInventorStringList() {
        return inventorStringList;
    }

    /**
     * 发明人
     * @param inventorStringList 发明人
     */
    public void setInventorStringList(String inventorStringList) {
        this.inventorStringList = inventorStringList == null ? null : inventorStringList.trim();
    }

    /**
     * 代理人
     * @return assigneestring_list 代理人
     */
    public String getAssigneestringList() {
        return assigneestringList;
    }

    /**
     * 代理人
     * @param assigneestringList 代理人
     */
    public void setAssigneestringList(String assigneestringList) {
        this.assigneestringList = assigneestringList == null ? null : assigneestringList.trim();
    }
}