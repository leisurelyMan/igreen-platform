package com.igreen.boss.enums;

public enum ImportEnum {
	
	SUCCESS("成功"),
	EXISTST("该企业信息已存在"),
	REGISTNUMBER_ERROR("注册号不能为空"),
	ERROR("系统异常");
	
	private String strVal;
	
	private ImportEnum(String strVal){
		this.strVal = strVal;
	}
	
	public String getStrVal() {
		return strVal;
	}
}
