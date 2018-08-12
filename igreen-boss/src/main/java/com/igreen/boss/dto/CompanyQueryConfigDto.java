package com.igreen.boss.dto;

import java.io.Serializable;
import java.util.List;

public class CompanyQueryConfigDto implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -2047181542357481528L;

	/**
     * id
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;
    
    private List<CompanyQueryDetailDto> companys;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CompanyQueryDetailDto> getCompanys() {
		return companys;
	}

	public void setCompanys(List<CompanyQueryDetailDto> companys) {
		this.companys = companys;
	}
    
}
