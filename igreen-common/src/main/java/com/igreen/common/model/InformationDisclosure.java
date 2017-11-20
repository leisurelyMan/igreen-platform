package com.igreen.common.model;

/**
 * 描述:information_disclosure表的实体类
 */
public class InformationDisclosure {
	private Integer id;
	/**
     * 排污许可信息表外键
     */
	private Integer pollutionId;
	/**
     * 公开方式
     */
	private String disclosureType;
	/**
     * 时间节点
     */
	private String timePoint;
	/**
     * 公开内容
     */
	private String content;
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

	public String getDisclosureType() {
		return disclosureType;
	}

	public void setDisclosureType(String disclosureType) {
		this.disclosureType = disclosureType;
	}

	public String getTimePoint() {
		return timePoint;
	}

	public void setTimePoint(String timePoint) {
		this.timePoint = timePoint;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
}
