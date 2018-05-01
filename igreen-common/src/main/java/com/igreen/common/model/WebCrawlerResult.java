/**
 * 
 */
package com.igreen.common.model;

/**
 * @author chenxy
 *
 */
public class WebCrawlerResult extends IdEntity {

    private String webName;// 网站名称
    private String webDomain;//网站域名
    private String webDetailName;//详情标题
    private String webDetailUrl;//详情页原url
    private String webDetailResultUrl;//抓取详情页url
    private String savePath; //保存路径
    private String content; //详情页内容

	private String searchName; //搜索url关键词
	private Integer searchId; // 搜索关键词id
    
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

	public String getSearchName() {
		return searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	public Integer getSearchId() {
		return searchId;
	}

	public void setSearchId(Integer searchId) {
		this.searchId = searchId;
	}
}
