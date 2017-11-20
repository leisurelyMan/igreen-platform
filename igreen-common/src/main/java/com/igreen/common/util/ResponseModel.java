package com.igreen.common.util;


public class ResponseModel {

	private Integer code;
	
	private String message;
	
	private Object obj;
	
	public ResponseModel() {
		super();
	}
	
	public ResponseModel(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
