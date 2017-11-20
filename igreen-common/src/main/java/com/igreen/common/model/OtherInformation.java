package com.igreen.common.model;

/**
 * 描述:other_information表的实体类
 */
public class OtherInformation {
	private Integer id;
	/**
     * 排污许可信息表外键
     */
	private Integer pollutionId;
	/**
     * 其他控制及管理要求
     */
	private String managementRequirement;
	/**
     * 其他许可的内容
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
	public String getManagementRequirement() {
		return managementRequirement;
	}
	public void setManagementRequirement(String managementRequirement) {
		this.managementRequirement = managementRequirement;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
}
