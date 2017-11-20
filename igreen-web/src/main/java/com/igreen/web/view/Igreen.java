package com.igreen.web.view;

import java.util.List;

import com.igreen.common.model.AdministrativePenalty;
import com.igreen.common.model.Branch;
import com.igreen.common.model.Brand;
import com.igreen.common.model.BreakPromiseExecuted;
import com.igreen.common.model.ChattelMortgage;
import com.igreen.common.model.CompanyEmployee;
import com.igreen.common.model.Copyright;
import com.igreen.common.model.CourtNotice;
import com.igreen.common.model.DomainName;
import com.igreen.common.model.Exchange;
import com.igreen.common.model.ExecutedItem;
import com.igreen.common.model.FreezeStockRight;
import com.igreen.common.model.Investment;
import com.igreen.common.model.Invite;
import com.igreen.common.model.OpenCourtNotice;
import com.igreen.common.model.OrganizationItem;
import com.igreen.common.model.Patent;
import com.igreen.common.model.PledgeStockRight;
import com.igreen.common.model.RegistItem;
import com.igreen.common.model.Shareholder;
import com.igreen.common.model.SoftwareCopyright;
import com.igreen.common.model.ThingChattelMortgage;
import com.igreen.common.model.WrittenJudgement;

public class Igreen {

	private RegistItem registItem;
	
	private List<Shareholder> shareholders;
	
	private List<CompanyEmployee> employees;
	
	private Exchange exchange;
	
	private OrganizationItem organizationItem;
	
	List<OpenCourtNotice> openCourtNotices; 
	
	List<WrittenJudgement> writtenJudgements;
	
	List<ExecutedItem> executedItems;
	
	List<BreakPromiseExecuted> breakPromiseExecuteds;
	
	List<CourtNotice> courtNotices;
	
	//经营风险
	List<AdministrativePenalty> administrativePenalties;
	
	List<FreezeStockRight> freezeStockRights;
	
	List<PledgeStockRight> pledgeStockRights;
	
	List<ChattelMortgage> chattelMortgages;
	
	List<ThingChattelMortgage> thingChattelMortgages;
	
	//关联关系
	Branch branch;
	
	List<Investment> investments;
	
	List<RelationCompanyView> companyViews;
	
	//经营信息
	List<Invite> invites;
	
	//知识产权
	List<Patent> patents;
	
	List<Brand> brands;
	
	List<Copyright> copyrights;
	
	List<SoftwareCopyright> softwareCopyrights;
	
	List<DomainName> domainNames;
	
	//TODO

	public RegistItem getRegistItem() {
		return registItem;
	}

	public void setRegistItem(RegistItem registItem) {
		this.registItem = registItem;
	}

	public List<Shareholder> getShareholders() {
		return shareholders;
	}

	public void setShareholders(List<Shareholder> shareholders) {
		this.shareholders = shareholders;
	}

	public List<CompanyEmployee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<CompanyEmployee> employees) {
		this.employees = employees;
	}

	public Exchange getExchange() {
		return exchange;
	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	public OrganizationItem getOrganizationItem() {
		return organizationItem;
	}

	public void setOrganizationItem(OrganizationItem organizationItem) {
		this.organizationItem = organizationItem;
	}

	public List<OpenCourtNotice> getOpenCourtNotices() {
		return openCourtNotices;
	}

	public void setOpenCourtNotices(List<OpenCourtNotice> openCourtNotices) {
		this.openCourtNotices = openCourtNotices;
	}

	public List<WrittenJudgement> getWrittenJudgements() {
		return writtenJudgements;
	}

	public void setWrittenJudgements(List<WrittenJudgement> writtenJudgements) {
		this.writtenJudgements = writtenJudgements;
	}

	public List<ExecutedItem> getExecutedItems() {
		return executedItems;
	}

	public void setExecutedItems(List<ExecutedItem> executedItems) {
		this.executedItems = executedItems;
	}

	public List<BreakPromiseExecuted> getBreakPromiseExecuteds() {
		return breakPromiseExecuteds;
	}

	public void setBreakPromiseExecuteds(List<BreakPromiseExecuted> breakPromiseExecuteds) {
		this.breakPromiseExecuteds = breakPromiseExecuteds;
	}

	public List<CourtNotice> getCourtNotices() {
		return courtNotices;
	}

	public void setCourtNotices(List<CourtNotice> courtNotices) {
		this.courtNotices = courtNotices;
	}

	public List<AdministrativePenalty> getAdministrativePenalties() {
		return administrativePenalties;
	}

	public void setAdministrativePenalties(List<AdministrativePenalty> administrativePenalties) {
		this.administrativePenalties = administrativePenalties;
	}

	public List<FreezeStockRight> getFreezeStockRights() {
		return freezeStockRights;
	}

	public void setFreezeStockRights(List<FreezeStockRight> freezeStockRights) {
		this.freezeStockRights = freezeStockRights;
	}

	public List<PledgeStockRight> getPledgeStockRights() {
		return pledgeStockRights;
	}

	public void setPledgeStockRights(List<PledgeStockRight> pledgeStockRights) {
		this.pledgeStockRights = pledgeStockRights;
	}

	public List<ChattelMortgage> getChattelMortgages() {
		return chattelMortgages;
	}

	public void setChattelMortgages(List<ChattelMortgage> chattelMortgages) {
		this.chattelMortgages = chattelMortgages;
	}

	public List<ThingChattelMortgage> getThingChattelMortgages() {
		return thingChattelMortgages;
	}

	public void setThingChattelMortgages(List<ThingChattelMortgage> thingChattelMortgages) {
		this.thingChattelMortgages = thingChattelMortgages;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public List<Investment> getInvestments() {
		return investments;
	}

	public void setInvestments(List<Investment> investments) {
		this.investments = investments;
	}

	public List<RelationCompanyView> getCompanyViews() {
		return companyViews;
	}

	public void setCompanyViews(List<RelationCompanyView> companyViews) {
		this.companyViews = companyViews;
	}

	public List<Invite> getInvites() {
		return invites;
	}

	public void setInvites(List<Invite> invites) {
		this.invites = invites;
	}

	public List<Patent> getPatents() {
		return patents;
	}

	public void setPatents(List<Patent> patents) {
		this.patents = patents;
	}

	public List<Brand> getBrands() {
		return brands;
	}

	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	public List<Copyright> getCopyrights() {
		return copyrights;
	}

	public void setCopyrights(List<Copyright> copyrights) {
		this.copyrights = copyrights;
	}

	public List<SoftwareCopyright> getSoftwareCopyrights() {
		return softwareCopyrights;
	}

	public void setSoftwareCopyrights(List<SoftwareCopyright> softwareCopyrights) {
		this.softwareCopyrights = softwareCopyrights;
	}

	public List<DomainName> getDomainNames() {
		return domainNames;
	}

	public void setDomainNames(List<DomainName> domainNames) {
		this.domainNames = domainNames;
	}
	
}
