package com.igreen.boss.service.impl.basicInfo;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.basicInfo.AuditService;
import com.igreen.common.dao.AdministrativePenaltyMapper;
import com.igreen.common.dao.BranchMapper;
import com.igreen.common.dao.BrandMapper;
import com.igreen.common.dao.BreakPromiseExecutedMapper;
import com.igreen.common.dao.ChattelMortgageMapper;
import com.igreen.common.dao.CompanyEmployeeMapper;
import com.igreen.common.dao.CopyrightMapper;
import com.igreen.common.dao.CourtNoticeMapper;
import com.igreen.common.dao.DomainNameMapper;
import com.igreen.common.dao.ExchangeMapper;
import com.igreen.common.dao.ExecutedItemMapper;
import com.igreen.common.dao.FreezeStockRightMapper;
import com.igreen.common.dao.InvestmentMapper;
import com.igreen.common.dao.InviteMapper;
import com.igreen.common.dao.OpenCourtNoticeMapper;
import com.igreen.common.dao.OrganizationItemMapper;
import com.igreen.common.dao.PatentMapper;
import com.igreen.common.dao.PledgeStockRightMapper;
import com.igreen.common.dao.RegistItemMapper;
import com.igreen.common.dao.RelationCompanyMapper;
import com.igreen.common.dao.ShareholderMapper;
import com.igreen.common.dao.SoftwareCopyrightMapper;
import com.igreen.common.dao.ThingChattelMortgageMapper;
import com.igreen.common.dao.WrittenJudgementMapper;
import com.igreen.common.util.ResponseModel;

@Service
public class AuditServiceImpl implements AuditService {
	
	@Resource
	RegistItemMapper registItemMapper;
	
	@Resource
	ShareholderMapper shareholderMapper;
	
	@Resource
	CompanyEmployeeMapper companyEmployeeMapper;
	
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

	@Override
	public ResponseModel auditRegistItem(Integer registItemId) {
		try {
			shareholderMapper.auditByRegistItemId(registItemId);
			companyEmployeeMapper.auditByRegistItemId(registItemId);
			exchangeMapper.auditByRegistItemId(registItemId);
			organizationItemMapper.auditByRegistItemId(registItemId);
			openCourtNoticeMapper.auditByRegistItemId(registItemId);
			writtenJudgementMapper.auditByRegistItemId(registItemId);
			executedItemMapper.auditByRegistItemId(registItemId);
			breakPromiseExecutedMapper.auditByRegistItemId(registItemId);
			courtNoticeMapper.auditByRegistItemId(registItemId);
			administrativePenaltyMapper.auditByRegistItemId(registItemId);
			freezeStockRightMapper.auditByRegistItemId(registItemId);
			pledgeStockRightMapper.auditByRegistItemId(registItemId);
			chattelMortgageMapper.auditByRegistItemId(registItemId);
			thingChattelMortgageMapper.auditByRegistItemId(registItemId);
			branchMapper.auditByRegistItemId(registItemId);
			investmentMapper.auditByRegistItemId(registItemId);
			relationCompanyMapper.auditByRegistItemId(registItemId);
			inviteMapper.auditByRegistItemId(registItemId);
			patentMapper.auditByRegistItemId(registItemId);
			brandMapper.auditByRegistItemId(registItemId);
			copyrightMapper.auditByRegistItemId(registItemId);
			softwareCopyrightMapper.auditByRegistItemId(registItemId);
			domainNameMapper.auditByRegistItemId(registItemId);
			
			registItemMapper.auditById(registItemId);
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseModel(-1, "系统异常");
		}
	}
}
