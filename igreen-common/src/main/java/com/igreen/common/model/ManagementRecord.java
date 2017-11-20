package com.igreen.common.model;

/**
 * 描述:management_record表的实体类
 */
public class ManagementRecord {
	private Integer id;
	/**
     * 排污许可信息表外键
     */
	private Integer pollutionId;
	/**
     * 设施类别
     */
	private String facilityType;
	/**
     * 操作参数
     */
	private String operateParameter;
	/**
     * 记录内容
     */
	private String content;
	/**
     * 记录频次
     */
	private String frequency;
	/**
     * 记录形式
     */
	private String recordType;
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
	public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	public String getOperateParameter() {
		return operateParameter;
	}
	public void setOperateParameter(String operateParameter) {
		this.operateParameter = operateParameter;
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
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
}
