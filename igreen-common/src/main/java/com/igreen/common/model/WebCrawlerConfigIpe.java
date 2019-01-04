/**
 * 
 */
package com.igreen.common.model;

/**
 * @author chenxy
 *
 */
public class WebCrawlerConfigIpe extends IdEntity {

    private String webName;// 网站名称
    private String webDomain;//网站域名
    private String webSearchUrl;//全文检索URL
    private String pageUrlRegular;//分页url正则表达式
    private String pageType;//分页类型
    private String pageReqMethod;//分页请求返回方式
    private String pageResult;//分页结果
    private String replaceRegular;// 分页数据替换无用字符正则表达式
    private String detailUrlRegular;//详情页url匹配正则表达式
    private String detailTitleRegular;//详情页title xpath

    private Integer maxPage;// 最大分页
    private Integer startPage;//开始分页
    private String attrType;// 获取分页数据类型
    private String attrName;// 获取分页数据对应的名称
    private String detailContentRegular;//详情页内容获取 xpath

    private String searchName; //搜索url关键词
    private Integer searchId; // 搜索关键词id

    private String city; // 城市
    private String area; // 区域
    private String sourceType; // 来源类型
    // 字段获取xpath配置格式[{field:"xx",type:\'xpath 或者 value\',"pathValue":"xpath规则或者固定值"},{field:"xx",type:\'xpath 或者 value\',"pathValue":"xpath规则或者固定值"},...]
    private String fieldPropertyRegular;


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

    public String getWebSearchUrl() {
        return webSearchUrl;
    }

    public void setWebSearchUrl(String webSearchUrl) {
        this.webSearchUrl = webSearchUrl;
    }

    public String getPageUrlRegular() {
        return pageUrlRegular;
    }

    public void setPageUrlRegular(String pageUrlRegular) {
        this.pageUrlRegular = pageUrlRegular;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public String getPageReqMethod() {
        return pageReqMethod;
    }

    public void setPageReqMethod(String pageReqMethod) {
        this.pageReqMethod = pageReqMethod;
    }

    public String getPageResult() {
        return pageResult;
    }

    public void setPageResult(String pageResult) {
        this.pageResult = pageResult;
    }

    public String getDetailUrlRegular() {
        return detailUrlRegular;
    }

    public void setDetailUrlRegular(String detailUrlRegular) {
        this.detailUrlRegular = detailUrlRegular;
    }

    public String getDetailTitleRegular() {
        return detailTitleRegular;
    }

    public void setDetailTitleRegular(String detailTitleRegular) {
        this.detailTitleRegular = detailTitleRegular;
    }

    public Integer getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(Integer maxPage) {
        this.maxPage = maxPage;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getDetailContentRegular() {
        return detailContentRegular;
    }

    public void setDetailContentRegular(String detailContentRegular) {
        this.detailContentRegular = detailContentRegular;
    }

    public String getReplaceRegular() {
        return replaceRegular;
    }

    public void setReplaceRegular(String replaceRegular) {
        this.replaceRegular = replaceRegular;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getFieldPropertyRegular() {
        return fieldPropertyRegular;
    }

    public void setFieldPropertyRegular(String fieldPropertyRegular) {
        this.fieldPropertyRegular = fieldPropertyRegular;
    }
}
