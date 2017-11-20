package com.igreen.common.model;

public class EnvicloudBase {
	private String rcode;
	private String rdesc;
	
	public String getRcode() {
		return rcode;
	}
	public void setRcode(String rcode) {
		this.rcode = rcode;
	}
	public String getRdesc() {
		return rdesc;
	}
	public void setRdesc(String rdesc) {
		this.rdesc = rdesc;
	}
	
	@Override
	public String toString( ){
		StringBuilder result = new StringBuilder( );
		result.append("查询结果：").append(this.getRdesc()).append("\n");
		return result.toString();
	}
}
