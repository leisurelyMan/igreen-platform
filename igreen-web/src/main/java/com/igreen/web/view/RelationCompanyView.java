package com.igreen.web.view;

import java.util.List;

import com.igreen.common.model.RelationCompany;

public class RelationCompanyView {

	private String name;
	
	private String job;
	
	private List<RelationCompany> relationCompanies;
	
	public RelationCompanyView() {
		super();
	}

	public RelationCompanyView(String name, String job, List<RelationCompany> relationCompanies) {
		super();
		this.name = name;
		this.job = job;
		this.relationCompanies = relationCompanies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public List<RelationCompany> getRelationCompanies() {
		return relationCompanies;
	}

	public void setRelationCompanies(List<RelationCompany> relationCompanies) {
		this.relationCompanies = relationCompanies;
	}
	
}
