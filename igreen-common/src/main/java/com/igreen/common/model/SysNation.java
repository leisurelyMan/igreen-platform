package com.igreen.common.model;

import java.util.Date;

/**
 * 描述:sys_nation表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-06-25
 */
public class SysNation {
    /**
     * id
     */
    private Long id;

    /**
     * 地区代码
     */
    private String code;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 父级行政区划ID
     */
    private Long parentId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 县/区
     */
    private String district;

    /**
     * 最后修改时间
     */
    private Date lastUpdateTime;

    /**
     * 操作人
     */
    private Long operator;

    /**
     * 操作人IP
     */
    private String operatorIp;

    /**
     * id
     * @return id id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 地区代码
     * @return code 地区代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 地区代码
     * @param code 地区代码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 省份
     * @return province 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省份
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 城市
     * @return city 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 父级行政区划ID
     * @return parent_id 父级行政区划ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 父级行政区划ID
     * @param parentId 父级行政区划ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 县/区
     * @return district 县/区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 县/区
     * @param district 县/区
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * 最后修改时间
     * @return last_update_time 最后修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 最后修改时间
     * @param lastUpdateTime 最后修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 操作人
     * @return operator 操作人
     */
    public Long getOperator() {
        return operator;
    }

    /**
     * 操作人
     * @param operator 操作人
     */
    public void setOperator(Long operator) {
        this.operator = operator;
    }

    /**
     * 操作人IP
     * @return operator_ip 操作人IP
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * 操作人IP
     * @param operatorIp 操作人IP
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }
}