package com.igreen.common.enums;

public enum PunishTypeEnum {

    IS_NULL("-1","空"),
    NOT_EQUAL("-2","不符"),


    FINE("1","责令改正"),
    REVOKE("2","责令限停产或停建"),
    CONFISCATE("3","查封或关闭"),
    DETENTION("4","严重违法"),
    CORRECT("5","仅罚款"),
    STOP_PRODUCTION("6","其他")
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
