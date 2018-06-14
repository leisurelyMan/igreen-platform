package com.igreen.common.model;

/**
 *
 * Created by chenxy on 2018/6/10.
 */
public class AiIpe {

    //公司名称
    private String company;
    // 季度
    private String season;
    //'罚款',
    private String fine;
    // '暂扣、吊销许可证',
    private String revoke;
    // '没收违法所得',
    private String confiscate;
    // '行政拘留',
    private String detention;
    // '责令停产整顿',
    private String production;
    // '责令停产、停业、关闭',
    private String instruct;
    // 'other'
    private String other;

    // 总计
    private String totalSum;

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

    public String getFine() {
        return fine;
    }

    public void setFine(String fine) {
        this.fine = fine;
    }

    public String getRevoke() {
        return revoke;
    }

    public void setRevoke(String revoke) {
        this.revoke = revoke;
    }

    public String getConfiscate() {
        return confiscate;
    }

    public void setConfiscate(String confiscate) {
        this.confiscate = confiscate;
    }

    public String getDetention() {
        return detention;
    }

    public void setDetention(String detention) {
        this.detention = detention;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getInstruct() {
        return instruct;
    }

    public void setInstruct(String instruct) {
        this.instruct = instruct;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum;
    }
}
