package com.igreen.web.view;

import com.igreen.common.model.*;

import java.util.List;

public class IgreenSearch {

	private RegistItem registItem;

	// 注册数据
	private QichachaCompanyBase qichachaCompanyBase;

	// 法院判决
	private List<QichachaJudgement> qichachaJudgements;

	//专利信息
	private List<QichachaPatent> qichachaPatents;

	// 重点监管企业
	private List<MonitorCompany> monitorCompanies;

	// 监管记录
	private List<IpeIndustryRecord> ipeIndustryRecords;

	// 群众举报案件
	private List<EnvironmentalIssue> environmentalIssues;

	// 排污许可
	private List<ExecutionRecord> executionRecords;

	private PollutionDischargeLicense pollutionDischargeLicense;

	// 清洁生产企业
	private CleanProductionCompany cleanProductionCompany;

	private List<ExcelEnergyEfficiencyLabel> excelEnergyEfficiencyLabels;

	// 预测
	public List<AiIpe> aiIpeList;

	public List<AiIpe> getAiIpeList() {
		return aiIpeList;
	}

	public void setAiIpeList(List<AiIpe> aiIpeList) {
		this.aiIpeList = aiIpeList;
	}

	public RegistItem getRegistItem() {
		return registItem;
	}

	public void setRegistItem(RegistItem registItem) {
		this.registItem = registItem;
	}

	public QichachaCompanyBase getQichachaCompanyBase() {
		return qichachaCompanyBase;
	}

	public void setQichachaCompanyBase(QichachaCompanyBase qichachaCompanyBase) {
		this.qichachaCompanyBase = qichachaCompanyBase;
	}

	public List<QichachaJudgement> getQichachaJudgements() {
		return qichachaJudgements;
	}

	public void setQichachaJudgements(List<QichachaJudgement> qichachaJudgements) {
		this.qichachaJudgements = qichachaJudgements;
	}

	public List<QichachaPatent> getQichachaPatents() {
		return qichachaPatents;
	}

	public void setQichachaPatents(List<QichachaPatent> qichachaPatents) {
		this.qichachaPatents = qichachaPatents;
	}

	public List<MonitorCompany> getMonitorCompanies() {
		return monitorCompanies;
	}

	public void setMonitorCompanies(List<MonitorCompany> monitorCompanies) {
		this.monitorCompanies = monitorCompanies;
	}

	public List<IpeIndustryRecord> getIpeIndustryRecords() {
		return ipeIndustryRecords;
	}

	public void setIpeIndustryRecords(List<IpeIndustryRecord> ipeIndustryRecords) {
		this.ipeIndustryRecords = ipeIndustryRecords;
	}

	public List<EnvironmentalIssue> getEnvironmentalIssues() {
		return environmentalIssues;
	}

	public void setEnvironmentalIssues(List<EnvironmentalIssue> environmentalIssues) {
		this.environmentalIssues = environmentalIssues;
	}

	public List<ExecutionRecord> getExecutionRecords() {
		return executionRecords;
	}

	public void setExecutionRecords(List<ExecutionRecord> executionRecords) {
		this.executionRecords = executionRecords;
	}

	public CleanProductionCompany getCleanProductionCompany() {
		return cleanProductionCompany;
	}

	public void setCleanProductionCompany(CleanProductionCompany cleanProductionCompany) {
		this.cleanProductionCompany = cleanProductionCompany;
	}

	public PollutionDischargeLicense getPollutionDischargeLicense() {
		return pollutionDischargeLicense;
	}

	public void setPollutionDischargeLicense(PollutionDischargeLicense pollutionDischargeLicense) {
		this.pollutionDischargeLicense = pollutionDischargeLicense;
	}

	public List<ExcelEnergyEfficiencyLabel> getExcelEnergyEfficiencyLabels() {
		return excelEnergyEfficiencyLabels;
	}

	public void setExcelEnergyEfficiencyLabels(List<ExcelEnergyEfficiencyLabel> excelEnergyEfficiencyLabels) {
		this.excelEnergyEfficiencyLabels = excelEnergyEfficiencyLabels;
	}
}
