package com.igreen.common.model;

import java.util.Date;
import java.util.Map;

import com.igreen.common.util.IgreenUtil;

/**
 * 描述:court_notice表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-04-17
 */
public class CourtNotice {
    /**
     * id
     */
    private Integer id;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 时间
     */
    private String noticeTime;

    /**
     * 公告类型
     */
    private String noticeType;

    /**
     * 法院
     */
    private String court;

    /**
     * 公告内容
     */
    private String notice;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建者
     */
    private Integer creater;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新者
     */
    private Integer updater;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 备注
     */
    private String remark;
    
    public CourtNotice() {
		super();
	}
    
    public CourtNotice(Map<String, String> params) {
		super();
		this.registItemId = IgreenUtil.getInteger("registItemId", params);
	    this.noticeTime = IgreenUtil.getString("noticeTime", params);
	    this.noticeType = IgreenUtil.getString("noticeType", params);
	    this.court = IgreenUtil.getString("court", params);
	    this.notice = IgreenUtil.getString("notice", params);
	    this.status = 1;
	    this.creater = IgreenUtil.getInteger("creater", params);
	    this.createdTime = new Date();
	}

	/**
     * id
     * @return id id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 登记信息ID
     * @return regist_item_id 登记信息ID
     */
    public Integer getRegistItemId() {
        return registItemId;
    }

    /**
     * 登记信息ID
     * @param registItemId 登记信息ID
     */
    public void setRegistItemId(Integer registItemId) {
        this.registItemId = registItemId;
    }

    /**
     * 时间
     * @return notice_time 时间
     */
    public String getNoticeTime() {
        return noticeTime;
    }

    /**
     * 时间
     * @param noticeTime 时间
     */
    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime == null ? null : noticeTime.trim();
    }

    /**
     * 公告类型
     * @return notice_type 公告类型
     */
    public String getNoticeType() {
        return noticeType;
    }

    /**
     * 公告类型
     * @param noticeType 公告类型
     */
    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType == null ? null : noticeType.trim();
    }

    /**
     * 法院
     * @return court 法院
     */
    public String getCourt() {
        return court;
    }

    /**
     * 法院
     * @param court 法院
     */
    public void setCourt(String court) {
        this.court = court == null ? null : court.trim();
    }

    /**
     * 公告内容
     * @return notice 公告内容
     */
    public String getNotice() {
        return notice;
    }

    /**
     * 公告内容
     * @param notice 公告内容
     */
    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    /**
     * 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建者
     * @return creater 创建者
     */
    public Integer getCreater() {
        return creater;
    }

    /**
     * 创建者
     * @param creater 创建者
     */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /**
     * 创建时间
     * @return created_time 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 创建时间
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 更新者
     * @return updater 更新者
     */
    public Integer getUpdater() {
        return updater;
    }

    /**
     * 更新者
     * @param updater 更新者
     */
    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    /**
     * 更新时间
     * @return updated_time 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 更新时间
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public String toString() {
		return "CourtNotice [id=" + id + ", registItemId=" + registItemId + ", noticeTime=" + noticeTime
				+ ", noticeType=" + noticeType + ", court=" + court + ", notice=" + notice + ", status=" + status
				+ ", creater=" + creater + ", createdTime=" + createdTime + ", updater=" + updater + ", updatedTime="
				+ updatedTime + ", remark=" + remark + "]";
	}
    
}