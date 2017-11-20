package com.igreen.boss.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.igreen.common.dao.CleanProductionCompanyMapper;
import com.igreen.common.dao.EnvironmentalIssueMapper;
import com.igreen.common.dao.MonitorCompanyMapper;
import com.igreen.common.dao.ShareholderMapper;
import com.igreen.common.model.CleanProductionCompany;
import com.igreen.common.model.EnvironmentalIssue;
import com.igreen.common.model.MonitorCompany;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class ShareholderMapperTest {

	@Resource
	ShareholderMapper mapper;
	
	@Resource
	CleanProductionCompanyMapper cleanMapper;
	
	@Resource
	EnvironmentalIssueMapper issueMapper;
	
	@Resource
	MonitorCompanyMapper monitorMapper;
	
	@Test
	public void auditByRegistItemIdTest(){
		CleanProductionCompany company = new CleanProductionCompany( );
		company.setYear("2012");
		company.setSerialNumber("120106000219");
		List<CleanProductionCompany> list = cleanMapper.selectByPatameter(company);
		System.out.println("-----------" + list.size());
		
		EnvironmentalIssue issue = new EnvironmentalIssue( );
		issue.setReportIssue("废气污染；废气污染");
		List<EnvironmentalIssue> list1 = issueMapper.selectByParameter(issue);
		System.out.println("-------------------" + list1.size());
		
		MonitorCompany monitor = new MonitorCompany( );
		monitor.setCompanyName("山东海天生物化工有限公司");
		List<MonitorCompany> list2 = monitorMapper.selectByParameter(monitor);
		System.out.println("-------------------" + list2.size());
		
	}
}
