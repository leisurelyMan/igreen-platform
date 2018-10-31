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
    private Double fineSum;

    /**
     * 暂扣、吊销许可证
     */
    private Double revokedSum;

    /**
     * 没收违法所得
     */
    private Double confiscateSum;

    /**
     * 行政拘留
     */
    private Double detentionSum;

    /**
     * 责令停产整顿
     */
    private Double productionSum;

    /**
     * 责令停产、停业、关闭
     */
    private Double instructSum;

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

    public Double getFineSum() {
        return fineSum;
    }

    public void setFineSum(Double fineSum) {
        this.fineSum = fineSum;
    }

    public Double getRevokedSum() {
        return revokedSum;
    }

    public void setRevokedSum(Double revokedSum) {
        this.revokedSum = revokedSum;
    }

    public Double getConfiscateSum() {
        return confiscateSum;
    }

    public void setConfiscateSum(Double confiscateSum) {
        this.confiscateSum = confiscateSum;
    }

    public Double getDetentionSum() {
        return detentionSum;
    }

    public void setDetentionSum(Double detentionSum) {
        this.detentionSum = detentionSum;
    }

    public Double getProductionSum() {
        return productionSum;
    }

    public void setProductionSum(Double productionSum) {
        this.productionSum = productionSum;
    }

    public Double getInstructSum() {
        return instructSum;
    }

    public void setInstructSum(Double instructSum) {
        this.instructSum = instructSum;
    }
}