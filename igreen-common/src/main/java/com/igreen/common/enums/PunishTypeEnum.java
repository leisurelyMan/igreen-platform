package com.igreen.common.enums;

public enum PunishTypeEnum {

    IS_NULL("-1","空"),
    FINE("1","罚款"),
    REVOKE("2","暂扣、吊销许可证"),
    CONFISCATE("3","没收违法所得"),
    DETENTION("4","行政拘留"),
    CORRECT("5","责令改正"),
    STOP_PRODUCTION("6","责令限停产或停建"),
    OTHER("7","其他"),
    ;

    private String value;
    private String name;

    PunishTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static PunishTypeEnum getEnumByValue(String value){
        for(PunishTypeEnum punishTypeEnum :PunishTypeEnum.values()){
            if(punishTypeEnum.value.equals(value))
                return punishTypeEnum;
        }
        return null;
    }
}
