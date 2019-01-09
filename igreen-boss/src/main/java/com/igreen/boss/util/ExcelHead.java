package com.igreen.boss.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.igreen.common.util.RegularizationUtil;

import java.util.ArrayList;
import java.util.List;

public class ExcelHead {

    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 列位置
     */
    private Integer cellNum;

    /**
     * 正则表达式
     */
    private String regular;

    public ExcelHead() {
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Integer getCellNum() {
        return cellNum;
    }

    public void setCellNum(Integer cellNum) {
        this.cellNum = cellNum;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }


    public static void main(String[] args) {
        List<ExcelHead> list = new ArrayList<ExcelHead>();
        ExcelHead webDetailUrl = new ExcelHead();
        webDetailUrl.setCellNum(7);
        webDetailUrl.setFieldName("webDetailUrl");
        webDetailUrl.setRegular("^(http|https|ftp|ftps)://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$");
        list.add(webDetailUrl);

        ExcelHead companyName = new ExcelHead();
        companyName.setCellNum(0);
        companyName.setFieldName("companyName");
        companyName.setRegular("^[\\u4e00-\\u9fa5]+$");
        list.add(companyName);

        ExcelHead province = new ExcelHead();
        province.setCellNum(1);
        province.setFieldName("province");
        province.setRegular("^[\\u4e00-\\u9fa5]+$");
        list.add(province);

        ExcelHead city = new ExcelHead();
        city.setCellNum(2);
        city.setFieldName("city");
        city.setRegular("^[\\u4e00-\\u9fa5]+$");
        list.add(city);

        ExcelHead punishType = new ExcelHead();
        punishType.setCellNum(5);
        punishType.setFieldName("punishType");
        punishType.setRegular("^[\\u4e00-\\u9fa5]+$");
        list.add(punishType);

        ExcelHead punishTime = new ExcelHead();
        punishTime.setCellNum(3);
        punishTime.setFieldName("punishTime");
        punishTime.setRegular("^\\d{4}\\.\\d{2}\\.\\d{2}$");
        list.add(punishTime);

        ExcelHead punishMoney = new ExcelHead();
        punishMoney.setCellNum(6);
        punishMoney.setFieldName("punishMoney");
        punishMoney.setRegular("^\\d+(\\.\\d+)?$");
        list.add(punishMoney);


        //兖矿新疆煤化工有限公司	新疆	乌鲁木齐	2018.02.09	责令立即改正	责令改正	30000	http://www.urumqi.gov.cn/fjbm/shbj/hjjg/384163.htm
        String jsonstr = "[{\"cellNum\":7,\"fieldName\":\"webDetailUrl\",\"regular\":\"^(http|https|ftp|ftps)://([\\\\w-]+\\\\.)+[\\\\w-]+(/[\\\\w-./?%&=]*)?$\"}]";
        JSONArray jsonArray = JSONArray.parseArray(jsonstr);
        List<ExcelHead> headlist = jsonArray.toJavaList(ExcelHead.class);

/*        System.out.println(JSON.toJSONString(list));
        System.out.println(RegularizationUtil.rularization(webDetailUrl.getRegular(),"http://www.urumqi.gov.cn/fjbm/shbj/hjjg/384163.htm"));
        System.out.println(RegularizationUtil.rularization(companyName.getRegular(),"兖矿新疆煤化工有限公司"));
        System.out.println(RegularizationUtil.rularization(province.getRegular(),"新疆"));
        System.out.println(RegularizationUtil.rularization(city.getRegular(),"乌鲁木齐"));
        System.out.println(RegularizationUtil.rularization(punishType.getRegular(),"责令改正"));
        System.out.println(RegularizationUtil.rularization(punishTime.getRegular(),"2018.02.09"));
        System.out.println(RegularizationUtil.rularization(punishMoney.getRegular(),"30000"));

        System.out.println(list.subList(0,4).size());
        System.out.println(list.subList(4,7).size());*/
    }
}
