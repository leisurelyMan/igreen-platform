package com.igreen.boss.controller.basicInfo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.basicInfo.MepService;
import com.igreen.common.model.AirQuality;
import com.igreen.common.model.CleanProductionCompany;
import com.igreen.common.model.EnvironmentalIssue;
import com.igreen.common.model.ExecutionRecord;
import com.igreen.common.model.InformationDisclosure;
import com.igreen.common.model.ManagementRecord;
import com.igreen.common.model.MonitorCompany;
import com.igreen.common.model.OtherInformation;
import com.igreen.common.model.PollutionDischargeLicense;
import com.igreen.common.util.ListRange;

@Controller
@RequestMapping(value="/basicInfo")
public class MepController extends BaseController{
	@Resource
	MepService mepService;
	
	@InitBinder    
    protected void initBinder(HttpServletRequest request,  
        ServletRequestDataBinder binder) throws Exception {  
        binder.registerCustomEditor(Date.class,   
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));  
    }  
	
	
	/**
	 * 跳转爬虫数据列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toMepData")
	public ModelAndView toMepData(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("basicInfo/mep.jsp",model);
	}
	
	@RequestMapping(value="cleanCompanyList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange cleanCompanyList(CleanProductionCompany company,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return mepService.cleanCompanyList(company,currentPage,pageRows);
	}
	
	@RequestMapping(value="monitorCompanyList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange monitorCompanyList(MonitorCompany company,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return mepService.monitorCompanyList(company,currentPage,pageRows);
	}
	
	@RequestMapping(value="reportList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange reportList(EnvironmentalIssue issue,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return mepService.reportList(issue,currentPage,pageRows);
	}
	
	/**
	 * 跳转空气质量页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toAirQuality")
	public ModelAndView toAirQuality(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("basicInfo/airQuality.jsp",model);
	}
	
	@RequestMapping(value="airQualityList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange airQualityList(AirQuality quality,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return mepService.airQualityList(quality,currentPage,pageRows);
	}
	
	/**
	 * 跳转污染企业页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toPollutionLicense")
	public ModelAndView toPollutionLicense(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("basicInfo/pollutionLicense.jsp",model);
	}
	
	/**
	 * 跳转污染企业详情页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toPollutionLicenseDetail")
	public ModelAndView toPollutionLicenseDetail(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("pollution/pollutiondetail.jsp",model);
	}
	
	@RequestMapping(value="executionRecordList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange executionRecordList(ExecutionRecord record,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return mepService.executionRecordList(record,currentPage,pageRows);
	}
	
	@RequestMapping(value="pollutionLicenseList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange pollutionLicenseList(PollutionDischargeLicense license,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return mepService.pollutionLicenseList(license,currentPage,pageRows);
	}
	
	@RequestMapping(value="informationDisclosureList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange informationDisclosureList(InformationDisclosure record,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return mepService.informationDisclosureList(record,currentPage,pageRows);
	}
	
	@RequestMapping(value="managementList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange managementList(ManagementRecord record,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return mepService.managementRecordList(record,currentPage,pageRows);
	}
	
	@RequestMapping(value="otherList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange otherList(OtherInformation record,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return mepService.otherInformationList(record,currentPage,pageRows);
	}
}
