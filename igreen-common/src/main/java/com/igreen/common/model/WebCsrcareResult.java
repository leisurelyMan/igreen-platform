/**
 * 
 */
package com.igreen.common.model;

import java.util.Date;

/**
 * @author chenxy
 *
 */
public class WebCsrcareResult extends IdEntity {

    private String webName;// 网站名称
    private String webDomain;//网站域名
    private String webDetailName;//详情标题
    private String webDetailUrl;//详情页原url
    private String webDetailResultUrl;//抓取详情页url
    private String savePath; //保存路径
    private String content; //详情页内容
	private String attachmentPath;
	// 颁布机构
	private String publishOrg;
	//生效状态
	private String effectStatus;
	//所属类型
	private String attachType;
	//适用地区
	private String applicationArea;
	//适用领域
	private String applicationDomain;
	// 生效日期 2018/07/01
	private Date effectDate;
	// 颁布日期 2018/03/30
	private Date publishDate;

    
	public String getWebName() {
		return webName;
	}
	public void setWebName(String webName) {
		this.webName = webName;
	}
	public String getWebDomain() {
		return webDomain;
	}
	public void setWebDomain(String webDomain) {
		this.webDomain = webDomain;
	}
	public String getWebDetailName() {
		return webDetailName;
	}
	public void setWebDetailName(String webDetailName) {
		this.webDetailName = webDetailName;
	}
	public String getWebDetailUrl() {
		return webDetailUrl;
	}
	public void setWebDetailUrl(String webDetailUrl) {
		this.webDetailUrl = webDetailUrl;
	}
	public String getWebDetailResultUrl() {
		return webDetailResultUrl;
	}
	public void setWebDetailResultUrl(String webDetailResultUrl) {
		this.webDetailResultUrl = webDetailResultUrl;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public String getPublishOrg() {
		return publishOrg;
	}

	public void setPublishOrg(String publishOrg) {
		this.publishOrg = publishOrg;
	}

	public String getEffectStatus() {
		return effectStatus;
	}

	public void setEffectStatus(String effectStatus) {
		this.effectStatus = effectStatus;
	}

	public String getAttachType() {
		return attachType;
	}

	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}

	public String getApplicationArea() {
		return applicationArea;
	}

	public void setApplicationArea(String applicationArea) {
		this.applicationArea = applicationArea;
	}

	public String getApplicationDomain() {
		return applicationDomain;
	}

	public void setApplicationDomain(String applicationDomain) {
		this.applicationDomain = applicationDomain;
	}

	public Date getEffectDate() {
		return effectDate;
	}

	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getAttachmentPath() {
		return attachmentPath;
	}

	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}
}
