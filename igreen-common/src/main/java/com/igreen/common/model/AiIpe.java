package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:ai_ipe表的实体类
 * @version
 * @author:  panjingxiao
 * @创建时间: 2018-09-22
 */
public class AiIpe {
    /**
     * id
     */
    private Integer id;

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
    private String fine;

    /**
     * 暂扣、吊销许可证
     */
    private String revoked;

    /**
     * 没收违法所得
     */
    private String confiscate;

    /**
     * 行政拘留
     */
    private String detention;

    /**
     * 责令停产整顿
     */
    private String production;

    /**
     * 责令停产、停业、关闭
     */
    private String instruct;

    /**
     * other
     */
    private String other;

    /**
     * 总计
     */
    private String totalSum;

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
     * 公司名称
     * @return company 公司名称
     */
    public String getCompany() {
        return company;
    }

    /**
     * 公司名称
     * @param company 公司名称
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * 季度
     * @return season 季度
     */
    public String getSeason() {
        return season;
    }

    /**
     * 季度
     * @param season 季度
     */
    public void setSeason(String season) {
        this.season = season == null ? null : season.trim();
    }

    /**
     * 罚款
     * @return fine 罚款
     */
    public String getFine() {
        return fine;
    }

    /**
     * 罚款
     * @param fine 罚款
     */
    public void setFine(String fine) {
        this.fine = fine == null ? null : fine.trim();
    }

    /**
     * 暂扣、吊销许可证
     * @return revoked 暂扣、吊销许可证
     */
    public String getRevoked() {
        return revoked;
    }

    /**
     * 暂扣、吊销许可证
     * @param revoked 暂扣、吊销许可证
     */
    public void setRevoked(String revoked) {
        this.revoked = revoked == null ? null : revoked.trim();
    }

    /**
     * 没收违法所得
     * @return confiscate 没收违法所得
     */
    public String getConfiscate() {
        return confiscate;
    }

    /**
     * 没收违法所得
     * @param confiscate 没收违法所得
     */
    public void setConfiscate(String confiscate) {
        this.confiscate = confiscate == null ? null : confiscate.trim();
    }

    /**
     * 行政拘留
     * @return detention 行政拘留
     */
    public String getDetention() {
        return detention;
    }

    /**
     * 行政拘留
     * @param detention 行政拘留
     */
    public void setDetention(String detention) {
        this.detention = detention == null ? null : detention.trim();
    }

    /**
     * 责令停产整顿
     * @return production 责令停产整顿
     */
    public String getProduction() {
        return production;
    }

    /**
     * 责令停产整顿
     * @param production 责令停产整顿
     */
    public void setProduction(String production) {
        this.production = production == null ? null : production.trim();
    }

    /**
     * 责令停产、停业、关闭
     * @return instruct 责令停产、停业、关闭
     */
    public String getInstruct() {
        return instruct;
    }

    /**
     * 责令停产、停业、关闭
     * @param instruct 责令停产、停业、关闭
     */
    public void setInstruct(String instruct) {
        this.instruct = instruct == null ? null : instruct.trim();
    }

    /**
     * other
     * @return other other
     */
    public String getOther() {
        return other;
    }

    /**
     * other
     * @param other other
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    /**
     * 总计
     * @return total_sum 总计
     */
    public String getTotalSum() {
        return totalSum;
    }

    /**
     * 总计
     * @param totalSum 总计
     */
    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum == null ? null : totalSum.trim();
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
}