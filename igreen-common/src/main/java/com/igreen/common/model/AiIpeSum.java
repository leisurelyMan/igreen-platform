package com.igreen.common.model;

public class AiIpeSum {

    /**
     * 公司名称
     */
    private String company;

    /**
     * 季度
     */
    private String season;

    /**
     * 罚款
     */
    private Integer fineSum;

    /**
     * 暂扣、吊销许可证
     */
    private Integer revokedSum;

    /**
     * 没收违法所得
     */
    private Integer confiscateSum;

    /**
     * 行政拘留
     */
    private Integer detentionSum;

    /**
     * 责令停产整顿
     */
    private Integer productionSum;

    /**
     * 责令停产、停业、关闭
     */
    private Integer instructSum;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Integer getFineSum() {
        return fineSum;
    }

    public void setFineSum(Integer fineSum) {
        this.fineSum = fineSum;
    }

    public Integer getRevokedSum() {
        return revokedSum;
    }

    public void setRevokedSum(Integer revokedSum) {
        this.revokedSum = revokedSum;
    }

    public Integer getConfiscateSum() {
        return confiscateSum;
    }

    public void setConfiscateSum(Integer confiscateSum) {
        this.confiscateSum = confiscateSum;
    }

    public Integer getDetentionSum() {
        return detentionSum;
    }

    public void setDetentionSum(Integer detentionSum) {
        this.detentionSum = detentionSum;
    }

    public Integer getProductionSum() {
        return productionSum;
    }

    public void setProductionSum(Integer productionSum) {
        this.productionSum = productionSum;
    }

    public Integer getInstructSum() {
        return instructSum;
    }

    public void setInstructSum(Integer instructSum) {
        this.instructSum = instructSum;
    }
}