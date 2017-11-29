package com.igreen.web.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.common.dao.AdministrativePenaltyMapper;
import com.igreen.common.dao.BranchMapper;
import com.igreen.common.dao.BrandMapper;
import com.igreen.common.dao.BreakPromiseExecutedMapper;
import com.igreen.common.dao.ChattelMortgageMapper;
import com.igreen.common.dao.CleanProductionCompanyMapper;
import com.igreen.common.dao.CompanyEmployeeMapper;
import com.igreen.common.dao.CopyrightMapper;
import com.igreen.common.dao.CourtNoticeMapper;
import com.igreen.common.dao.DomainNameMapper;
import com.igreen.common.dao.ExchangeMapper;
import com.igreen.common.dao.ExecutedItemMapper;
import com.igreen.common.dao.FreezeStockRightMapper;
import com.igreen.common.dao.InvestmentMapper;
import com.igreen.common.dao.InviteMapper;
import com.igreen.common.dao.IpeIndustryRecordMapper;
import com.igreen.common.dao.OpenCourtNoticeMapper;
import com.igreen.common.dao.OrganizationItemMapper;
import com.igreen.common.dao.PatentMapper;
import com.igreen.common.dao.PledgeStockRightMapper;
import com.igreen.common.dao.PollutionDischargeLicenseMapper;
import com.igreen.common.dao.RegistItemMapper;
import com.igreen.common.dao.RelationCompanyMapper;
import com.igreen.common.dao.ShareholderMapper;
import com.igreen.common.dao.SoftwareCopyrightMapper;
import com.igreen.common.dao.ThingChattelMortgageMapper;
import com.igreen.common.dao.WrittenJudgementMapper;
import com.igreen.common.model.Branch;
import com.igreen.common.model.CleanProductionCompany;
import com.igreen.common.model.Exchange;
import com.igreen.common.model.IpeIndustryRecord;
import com.igreen.common.model.OrganizationItem;
import com.igreen.common.model.PollutionDischargeLicense;
import com.igreen.common.model.RegistItem;
import com.igreen.common.model.RelationCompany;
import com.igreen.web.service.IndexService;
import com.igreen.web.view.Igreen;
import com.igreen.web.view.RelationCompanyView;
import com.igreen.web.view.SearchCompanyInfo;

@Service
public class IndexServiceImpl implements IndexService{
	
	@Resource
	RegistItemMapper registItemMapper;
	
	@Resource
	ShareholderMapper shareholderMapper;
	
	@Resource
	CompanyEmployeeMapper CompanyEmployeeMapper;
	
	@Resource
	ExchangeMapper exchangeMapper;
	
	@Resource
	OrganizationItemMapper organizationItemMapper;
	
	@Resource
	OpenCourtNoticeMapper openCourtNoticeMapper;
	
	@Resource
	WrittenJudgementMapper writtenJudgementMapper;
	
	@Resource
	ExecutedItemMapper executedItemMapper;
	
	@Resource
	BreakPromiseExecutedMapper breakPromiseExecutedMapper;
	
	@Resource
	CourtNoticeMapper courtNoticeMapper;
	
	@Resource
	AdministrativePenaltyMapper administrativePenaltyMapper;
	
	@Resource
	FreezeStockRightMapper freezeStockRightMapper;
	
	@Resource
	PledgeStockRightMapper pledgeStockRightMapper;
	
	@Resource
	ChattelMortgageMapper chattelMortgageMapper;
	
	@Resource
	ThingChattelMortgageMapper thingChattelMortgageMapper;
	
	//关联关系
	@Resource
	BranchMapper branchMapper;
	
	@Resource
	InvestmentMapper investmentMapper;
	
	@Resource
	RelationCompanyMapper relationCompanyMapper;
	
	@Resource
	InviteMapper inviteMapper;
	
	@Resource
	PatentMapper patentMapper;
	
	@Resource
	BrandMapper brandMapper;
	
	@Resource
	CopyrightMapper copyrightMapper;
	
	@Resource
	SoftwareCopyrightMapper softwareCopyrightMapper;
	
	@Resource
	DomainNameMapper domainNameMapper;
	
	
	@Resource
	PollutionDischargeLicenseMapper pollutionDischargeLicenseMapper;
	
	@Resource 
	CleanProductionCompanyMapper cleanProductionCompanyMapper;
	
	@Resource
	IpeIndustryRecordMapper ipeIndustryRecordMapper;
	
	@Override
	public Igreen search(String companyName) {
		
		//基本信息
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("companyName", companyName);
		params.put("status", 1);
		List<RegistItem> items = registItemMapper.selectByCompanyNameAndStatus(params);
		if(items.isEmpty())
			return null;
		Igreen igreen = new Igreen();
		RegistItem item = items.get(0);
		igreen.setRegistItem(item);
		igreen.setShareholders(shareholderMapper.selectByRegistItemId(item.getId()));
		igreen.setEmployees(CompanyEmployeeMapper.selectByRegistItemId(item.getId()));
		List<Exchange> exchanges = exchangeMapper.selectByRegistItemId(item.getId());
		if(!exchanges.isEmpty())
			igreen.setExchange(exchanges.get(0));
		
		List<OrganizationItem> organizationItems = organizationItemMapper.selectByRegistItemId(item.getId());
		if(!organizationItems.isEmpty())
			igreen.setOrganizationItem(organizationItems.get(0));
		
		//法律风险
		igreen.setOpenCourtNotices(openCourtNoticeMapper.selectByRegistItemId(item.getId()));
		igreen.setWrittenJudgements(writtenJudgementMapper.selectByRegistItemId(item.getId()));
		igreen.setExecutedItems(executedItemMapper.selectByRegistItemId(item.getId()));
		igreen.setBreakPromiseExecuteds(breakPromiseExecutedMapper.selectByRegistItemId(item.getId()));
		igreen.setCourtNotices(courtNoticeMapper.selectByRegistItemId(item.getId()));
		//经营风险
		igreen.setAdministrativePenalties(administrativePenaltyMapper.selectByRegistItemId(item.getId()));
		igreen.setFreezeStockRights(freezeStockRightMapper.selectByRegistItemId(item.getId()));
		igreen.setPledgeStockRights(pledgeStockRightMapper.selectByRegistItemId(item.getId()));
		igreen.setChattelMortgages(chattelMortgageMapper.selectByRegistItemId(item.getId()));
		igreen.setThingChattelMortgages(thingChattelMortgageMapper.selectByRegistItemId(item.getId()));
		
		//关联关系
		List<Branch> branchs = branchMapper.selectByRegistItemId(item.getId());
		if(!branchs.isEmpty())
			igreen.setBranch(branchs.get(0));
		igreen.setInvestments(investmentMapper.selectByRegistItemId(item.getId()));
		List<RelationCompany> relationCompanies = relationCompanyMapper.selectByRegistItemId(item.getId());
		Map<Integer, RelationCompanyView> relations = new HashMap<Integer, RelationCompanyView>();
		for(RelationCompany company:relationCompanies){
			if(relations.containsKey(company.getEmployeeId())){
				RelationCompanyView view = relations.get(company.getEmployeeId());
				List<RelationCompany> list = view.getRelationCompanies();
				list.add(company);
				view.setRelationCompanies(list);
				relations.put(company.getEmployeeId(), view);
				//relations.get(company.getEmployeeId()).getRelationCompanies().add(company);
			}else{
				List<RelationCompany> list = new ArrayList<RelationCompany>();
				list.add(company);
				relations.put(company.getEmployeeId(), new RelationCompanyView(company.getEmployeeName(), company.getEmployeeJob(), list));
			}
		}
		
		List<RelationCompanyView> companyViews = new ArrayList<RelationCompanyView>();
		for(RelationCompanyView view :relations.values()){
			companyViews.add(view);
		}
		igreen.setCompanyViews(companyViews);
		
		//经营信息
		igreen.setInvites(inviteMapper.selectByRegistItemId(item.getId()));
		
		//知识产权
		igreen.setPatents(patentMapper.selectByRegistItemId(item.getId()));
		igreen.setBrands(brandMapper.selectByRegistItemId(item.getId()));
		igreen.setCopyrights(copyrightMapper.selectByRegistItemId(item.getId()));
		igreen.setSoftwareCopyrights(softwareCopyrightMapper.selectByRegistItemId(item.getId()));
		igreen.setDomainNames(domainNameMapper.selectByRegistItemId(item.getId()));
		return igreen;
	}

	@Override
	public SearchCompanyInfo searchCompany(String companyName) {
		// TODO Auto-generated method stub
		RegistItem registItem = registItemMapper.selectMaxIdByCompanyName(companyName);
		if(registItem != null){
			Integer registItemId = registItem.getId();
			PollutionDischargeLicense pollutionDischarge = pollutionDischargeLicenseMapper.selectByRegistItemId(registItemId);
			CleanProductionCompany cleanProduction = cleanProductionCompanyMapper.selectByRegistItemId(registItemId);
			List<IpeIndustryRecord> ipeIndustry = ipeIndustryRecordMapper.selectByRegistItemId(registItemId);
			SearchCompanyInfo searchInfo = new SearchCompanyInfo();
			searchInfo.setCompanyName(registItem.getCompanyName());
			String region="";
			String industry = "";
			if(pollutionDischarge != null){
				String province = pollutionDischarge.getProvince();
				String city = pollutionDischarge.getCity();
				region = province + city;
				industry = pollutionDischarge.getIndustry();
				searchInfo.setCertificateDate(pollutionDischarge.getCertificateDateStr());
				searchInfo.setValidDate(pollutionDischarge.getValidDate());
			}
			searchInfo.setIpeIndustryRecord(ipeIndustry);
			if(cleanProduction != null){
				searchInfo.setSerialNumber(cleanProduction.getSerialNumber());
				searchInfo.setProductSalesAmount(cleanProduction.getProductSalesAmount());
				searchInfo.setReportTime(cleanProduction.getReportTime());
				searchInfo.setSubmitCheckTime(cleanProduction.getSubmitCheckTime());
				searchInfo.setCompleteEstimateTime(cleanProduction.getCompleteEstimateTime());
				searchInfo.setCompleteCheckTime(cleanProduction.getCompleteCheckTime());
				searchInfo.setCheckOrganization(cleanProduction.getCheckOrganization());
				if("".equals(industry)){
					industry = cleanProduction.getTrade();
				}
				if("".equals(region)){
					region = cleanProduction.getRegion();
				}
			}
			searchInfo.setIndustry(industry);
			searchInfo.setRegion(region);
			return searchInfo;
		}
		return null;
	}

	
	
}
