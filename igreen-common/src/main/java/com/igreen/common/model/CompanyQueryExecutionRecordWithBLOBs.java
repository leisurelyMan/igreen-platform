package com.igreen.common.model;

public class CompanyQueryExecutionRecordWithBLOBs extends CompanyQueryExecutionRecord {
    /**
     * 主要内容
     */
    private String content;

    /**
     * 其他信息
     */
    private String otherInfo;

    /**
     * 主要内容
     * @return content 主要内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 主要内容
     * @param content 主要内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 其他信息
     * @return other_info 其他信息
     */
    public String getOtherInfo() {
        return otherInfo;
    }

    /**
     * 其他信息
     * @param otherInfo 其他信息
     */
    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo == null ? null : otherInfo.trim();
    }
}