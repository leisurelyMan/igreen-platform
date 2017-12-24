package com.igreen.web.service;

import java.util.List;

import com.igreen.web.view.Igreen;
import com.igreen.web.view.SearchCompanyInfo;

public interface IndexService {

	public Igreen search(String companyName);
	
	public SearchCompanyInfo searchCompany(String companyName);
	
	public List<String> getRegation(String type);
}
