package com.igreen.web.service;

import java.util.List;

import com.igreen.common.model.CompanyMonitorReportTemp;
import com.igreen.web.util.Result;
import com.igreen.web.view.Igreen;
import com.igreen.web.view.IgreenSearch;
import com.igreen.web.view.MonitorCompanyTable;
import com.igreen.web.view.SearchCompanyInfo;

public interface IndexService {

	public Igreen search(String companyName);
	
	public SearchCompanyInfo searchCompany(String companyName);
	
	public List<String> getRegation(String type);
	
	public Result getRegation2(String provice,String city);
	
	public Result getAllProvinceMapDate();

	public IgreenSearch searchNew(String companyName);

	public IgreenSearch searchNewTab(String companyName, String tabName);

	/**
	 * 获取监控表格数据
	 * @param configid 监控编码数据
	 * @return
	 */
    List<MonitorCompanyTable> getMonitorCompanyList(Integer configid);

	/**
	 * 注册资本分布
	 * @param configid
	 * @return
	 */
	List<CompanyMonitorReportTemp> getRegistIndustry(Integer configid);

	/**
	 * 地域分布
	 * @param configid
	 * @return
	 */
	List<CompanyMonitorReportTemp> getRegistProvince(Integer configid);
}
