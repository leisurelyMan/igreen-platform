package com.igreen.common.enums;

public enum IpeIndustryRecordSourceEnum {

    IPE(1,"IPE"),
    CRAW(2,"爬虫"),
    EXCEL(3,"EXCEL导入"),
    ;

    private int value;
    private String name;

    IpeIndustryRecordSourceEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static IpeIndustryRecordSourceEnum getEnumByValue(int value){
        for(IpeIndustryRecordSourceEnum punishTypeEnum :IpeIndustryRecordSourceEnum.values()){
            if(punishTypeEnum.value==value)
                return punishTypeEnum;
        }
        return null;
    }
}
