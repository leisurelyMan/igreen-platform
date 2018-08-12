package com.igreen.boss.dto;

import java.io.Serializable;

public class CompanyQueryDetailDto implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -6851617770047665147L;

	/**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司ID
     */
    private Integer registItemId;

    /**
     * 配置ID
     */
    private Integer configId;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getRegistItemId() {
		return registItemId;
	}

	public void setRegistItemId(Integer registItemId) {
		this.registItemId = registItemId;
	}

	public Integer getConfigId() {
		return configId;
	}

	public void setConfigId(Integer configId) {
		this.configId = configId;
	}
    
}
