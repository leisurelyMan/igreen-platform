package com.igreen.boss.util;

import java.io.Serializable;

public class CrawlerFieldModel implements Serializable{

    // 爬虫配置对应解析字段
    private String field;
    // xpath: 表示xpath获取， value：直接设定值
    private String type;
    // 字段值或者解析规则
    private String pathValue;
    // attr:获取属性值，text:获取节点text值
    private String attrType;
    // attrType == attr时有效，值为attr的属性例如（href, id, name ,或者自定义的）
    private String attrDom;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPathValue() {
        return pathValue;
    }

    public void setPathValue(String pathValue) {
        this.pathValue = pathValue;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

    public String getAttrDom() {
        return attrDom;
    }

    public void setAttrDom(String attrDom) {
        this.attrDom = attrDom;
    }
}
