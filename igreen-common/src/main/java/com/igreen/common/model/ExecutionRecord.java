package com.igreen.common.model;

/**
 * 描述:execution_record表的实体类
 */
public class ExecutionRecord {
	private Integer id;
	/**
     * 排污许可信息表外键
     */
	private Integer pollutionId;
	/**
     * 主要内容
     */
	private String content;
	/**
     * 上报频次
     */
	private String frequency;
	/**
     * 其他信息
     */
	private String otherInfo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPollutionId() {
		return pollutionId;
	}
	public void setPollutionId(Integer pollutionId) {
		this.pollutionId = pollutionId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
}
