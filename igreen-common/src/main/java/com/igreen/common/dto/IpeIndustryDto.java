package com.igreen.common.dto;

import java.util.Date;

/**
 * 描述:ipe_industry_record表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-08-27
 */
public class IpeIndustryDto {
    /**
     * id
     */
    private Integer id;
    
    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 登记信息ID
     */
    private Integer registItemId;

    /**
     * 年度
     */
    private String year;

    /**
     * 标题
     */
    private String title;
    
    
    /**
     * 行业门类名称
     */
    private String tradeName;
    
    /**
     * 地址
     */
    private String address;
    
    private String province;
    
    private String city;
    
    private String district;

    /**
     * ipe记录ID
     */
    private Long ipeId;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 创建时间
     */
    private Date createdTime;

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
    
    public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
     * 年度
     * @return year 年度
     */
    public String getYear() {
        return year;
    }

    /**
     * 年度
     * @param year 年度
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * ipe记录ID
     * @return ipe_id ipe记录ID
     */
    public Long getIpeId() {
        return ipeId;
    }

    /**
     * ipe记录ID
     * @param ipeId ipe记录ID
     */
    public void setIpeId(Long ipeId) {
        this.ipeId = ipeId;
    }

    /**
     * 文件名称
     * @return file_name 文件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 文件名称
     * @param fileName 文件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
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

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
}