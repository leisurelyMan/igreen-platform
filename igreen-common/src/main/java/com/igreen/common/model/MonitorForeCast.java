package com.igreen.common.model;

import java.util.List;

public class MonitorForeCast {

    private String name;
    // 数量
    private List<Double> data;
    // 样式
    private String style;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getData() {
        return data;
    }

    public void setData(List<Double> data) {
        this.data = data;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
