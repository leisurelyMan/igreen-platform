package com.igreen.common.model;

public class QichachaPenaltyWithBLOBs extends QichachaPenalty {
    /**
     * 处罚内容
     */
    private String content;

    /**
     * 处罚内容
     */
    private String adPenaltyDoc;

    /**
     * 处罚内容
     * @return content 处罚内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 处罚内容
     * @param content 处罚内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 处罚内容
     * @return ad_penalty_doc 处罚内容
     */
    public String getAdPenaltyDoc() {
        return adPenaltyDoc;
    }

    /**
     * 处罚内容
     * @param adPenaltyDoc 处罚内容
     */
    public void setAdPenaltyDoc(String adPenaltyDoc) {
        this.adPenaltyDoc = adPenaltyDoc == null ? null : adPenaltyDoc.trim();
    }
}