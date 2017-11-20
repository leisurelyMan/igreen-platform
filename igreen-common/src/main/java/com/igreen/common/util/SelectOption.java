package com.igreen.common.util;

public class SelectOption {

	/**
	 * value 值
	 */
	private Integer value;
	
	/**
	 * 描述
	 */
	private String describe;
	
	public SelectOption() {
		super();
	}

	public SelectOption(Integer value, String describe) {
		super();
		this.value = value;
		this.describe = describe;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	
}
