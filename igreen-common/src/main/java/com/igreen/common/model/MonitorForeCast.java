package com.igreen.common.model;

import java.util.List;

public class MonitorForeCast {

    private String name;
    // 数量
    private List<Integer> data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}
