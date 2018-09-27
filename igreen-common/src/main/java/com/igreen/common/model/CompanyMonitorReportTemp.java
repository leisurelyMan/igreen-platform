package com.igreen.common.model;

import java.util.*;

public class CompanyMonitorReportTemp implements Comparator<CompanyMonitorReportTemp> {

    private String name;
    // 数量
    private Integer nameValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNameValue() {
        return nameValue;
    }

    public void setNameValue(Integer nameValue) {
        this.nameValue = nameValue;
    }

    /**
     * 根据nameValue 降序排列
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(CompanyMonitorReportTemp o1, CompanyMonitorReportTemp o2) {
        return o2.getNameValue()-o1.getNameValue();
    }


    public static void main(String[] args)
    {
        List<CompanyMonitorReportTemp> tempList = new ArrayList<CompanyMonitorReportTemp>();
        for(int i = 0; i < 10; i ++) {
            CompanyMonitorReportTemp temp = new CompanyMonitorReportTemp();
            temp.setName("aa" + i);
            temp.setNameValue(i);
            tempList.add(temp);
        }
        System.out.println("排序前");
        for (CompanyMonitorReportTemp person : tempList)
        {
            System.out.print("  " + person.getName()+":"+person.getNameValue());
        }
        //Arrays.sort(tempList,new CompanyMonitorReportTemp());
        Collections.sort(tempList, new CompanyMonitorReportTemp());
        System.out.println("\n排序后");
        for (CompanyMonitorReportTemp person : tempList.subList(0, 8))
        {
            System.out.print("  " + person.getName()+":"+person.getNameValue());
        }
        System.out.println("\n排序后");
        for (CompanyMonitorReportTemp person : tempList.subList(8, tempList.size()))
        {
            System.out.print("  " + person.getName()+":"+person.getNameValue());
        }
    }
}
