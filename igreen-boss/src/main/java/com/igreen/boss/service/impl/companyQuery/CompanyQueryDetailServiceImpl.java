package com.igreen.boss.service.impl.companyQuery;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.igreen.boss.service.companyQuery.CompanyQueryDetailService;
import com.igreen.common.dao.CompanyQueryDetailMapper;
import com.igreen.common.dao.CompanyQueryExcelEnergyEfficiencyLabelMapper;
import com.igreen.common.dao.CompanyQueryExecutionRecordMapper;
import com.igreen.common.dao.CompanyQueryMonitorCompanyMapper;
import com.igreen.common.dao.CompanyQueryPollutionDischargeLicenseMapper;
import com.igreen.common.dao.CompanyQueryQichachaCompanyBaseMapper;
import com.igreen.common.dao.CompanyQueryQichachaJudgementMapper;
import com.igreen.common.dao.CompanyQueryQichachaPatentMapper;
import com.igreen.common.dao.ExcelEnergyEfficiencyLabelMapper;
import com.igreen.common.dao.ExecutionRecordMapper;
import com.igreen.common.dao.MonitorCompanyMapper;
import com.igreen.common.dao.PollutionDischargeLicenseMapper;
import com.igreen.common.dao.QichachaCompanyBaseMapper;
import com.igreen.common.dao.QichachaJudgementMapper;
import com.igreen.common.dao.QichachaPatentMapper;
import com.igreen.common.dao.RegistItemMapper;
import com.igreen.common.model.CompanyQueryDetail;
import com.igreen.common.model.CompanyQueryDetailExample;
import com.igreen.common.model.CompanyQueryExcelEnergyEfficiencyLabel;
import com.igreen.common.model.CompanyQueryExcelEnergyEfficiencyLabelExample;
import com.igreen.common.model.CompanyQueryExecutionRecordWithBLOBs;
import com.igreen.common.model.CompanyQueryMonitorCompany;
import com.igreen.common.model.CompanyQueryMonitorCompanyExample;
import com.igreen.common.model.CompanyQueryPollutionDischargeLicense;
import com.igreen.common.model.CompanyQueryPollutionDischargeLicenseExample;
import com.igreen.common.model.CompanyQueryQichachaCompanyBase;
import com.igreen.common.model.CompanyQueryQichachaCompanyBaseExample;
import com.igreen.common.model.CompanyQueryQichachaJudgement;
import com.igreen.common.model.CompanyQueryQichachaJudgementExample;
import com.igreen.common.model.CompanyQueryQichachaPatent;
import com.igreen.common.model.CompanyQueryQichachaPatentExample;
import com.igreen.common.model.ExcelEnergyEfficiencyLabel;
import com.igreen.common.model.ExcelEnergyEfficiencyLabelExample;
import com.igreen.common.model.ExecutionRecord;
import com.igreen.common.model.MonitorCompany;
import com.igreen.common.model.PollutionDischargeLicense;
import com.igreen.common.model.QichachaCompanyBase;
import com.igreen.common.model.QichachaCompanyBaseExample;
import com.igreen.common.model.QichachaJudgement;
import com.igreen.common.model.QichachaJudgementExample;
import com.igreen.common.model.QichachaPatent;
import com.igreen.common.model.QichachaPatentExample;
import com.igreen.common.model.RegistItem;

@Service
public class CompanyQueryDetailServiceImpl implements CompanyQueryDetailService {

	@Resource
	CompanyQueryDetailMapper companyQueryDetailMapper;
	
	@Resource
	RegistItemMapper registItemMapper;
	
	@Resource
	QichachaCompanyBaseMapper qichachaCompanyBaseMapper;
	
	@Resource
	CompanyQueryQichachaCompanyBaseMapper companyQueryQichachaCompanyBaseMapper;
	
	@Resource
	QichachaJudgementMapper qichachaJudgementMapper;
	
	@Resource
	CompanyQueryQichachaJudgementMapper companyQueryQichachaJudgementMapper;
	
	@Resource
	QichachaPatentMapper qichachaPatentMapper;
	
	@Resource
	CompanyQueryQichachaPatentMapper companyQueryQichachaPatentMapper;
	
	@Resource
	MonitorCompanyMapper monitorCompanyMapper;
	
	@Resource
	CompanyQueryMonitorCompanyMapper companyQueryMonitorCompanyMapper;
	
	@Resource
	PollutionDischargeLicenseMapper pollutionDischargeLicenseMapper;
	
	@Resource
	CompanyQueryPollutionDischargeLicenseMapper companyQueryPollutionDischargeLicenseMapper;
	
	@Resource
	ExecutionRecordMapper executionRecordMapper;
	
	@Resource
	CompanyQueryExecutionRecordMapper companyQueryExecutionRecordMapper;
	
	@Resource
	ExcelEnergyEfficiencyLabelMapper excelEnergyEfficiencyLabelMapper;
	
	@Resource
	CompanyQueryExcelEnergyEfficiencyLabelMapper companyQueryExcelEnergyEfficiencyLabelMapper;
	
	@Override
	public int countByExample(CompanyQueryDetailExample example) {
		return companyQueryDetailMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CompanyQueryDetailExample example) {
		return companyQueryDetailMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return companyQueryDetailMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CompanyQueryDetail record) {
		return companyQueryDetailMapper.insert(record);
	}

	@Override
	public int insertSelective(CompanyQueryDetail record) {
		return companyQueryDetailMapper.insertSelective(record);
	}

	@Override
	public List<CompanyQueryDetail> selectByExample(CompanyQueryDetailExample example) {
		return companyQueryDetailMapper.selectByExample(example);
	}

	@Override
	public CompanyQueryDetail selectByPrimaryKey(Integer id) {
		return companyQueryDetailMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CompanyQueryDetail record, CompanyQueryDetailExample example) {
		return companyQueryDetailMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CompanyQueryDetail record, CompanyQueryDetailExample example) {
		return companyQueryDetailMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CompanyQueryDetail record) {
		return companyQueryDetailMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CompanyQueryDetail record) {
		return companyQueryDetailMapper.updateByPrimaryKey(record);
	}

	@Override
	@Async
	public void addDetails(List<CompanyQueryDetail> details) {
		for(CompanyQueryDetail detail:details){
			if(StringUtils.isEmpty(detail.getCompanyName()) || StringUtils.isEmpty(detail.getQichachaKeyNo()))
				continue;
			//查询registitem
			List<RegistItem> registItems = registItemMapper.selectByCompanyName(detail.getCompanyName());
			if(registItems != null && registItems.size() > 0){
				detail.setRegistItemId(registItems.get(0).getId());
				detail.setState(1);
				detail.setUpdatedTime(new Date());
				companyQueryDetailMapper.updateByPrimaryKeySelective(detail);
				//company_query_qichacha_company_base
				//判断是否存在
				CompanyQueryQichachaCompanyBaseExample companyQueryQichachaCompanyBaseExample = new CompanyQueryQichachaCompanyBaseExample();
				companyQueryQichachaCompanyBaseExample.createCriteria().andKeyNoEqualTo(detail.getQichachaKeyNo());
				List<CompanyQueryQichachaCompanyBase> companyQueryQichachaCompanyBases = companyQueryQichachaCompanyBaseMapper.selectByExample(companyQueryQichachaCompanyBaseExample);
				if(companyQueryQichachaCompanyBases == null || companyQueryQichachaCompanyBases.size() == 0){
					QichachaCompanyBaseExample qichachaCompanyBaseExample = new QichachaCompanyBaseExample();
					qichachaCompanyBaseExample.createCriteria().andKeyNoEqualTo(detail.getQichachaKeyNo());
					List<QichachaCompanyBase> qichachaCompanyBases = qichachaCompanyBaseMapper.selectByExampleWithBLOBs(qichachaCompanyBaseExample);
					for(QichachaCompanyBase companyBase : qichachaCompanyBases){
						CompanyQueryQichachaCompanyBase companyQueryQichachaCompanyBase = new CompanyQueryQichachaCompanyBase();
						BeanUtils.copyProperties(companyBase,companyQueryQichachaCompanyBase);
						companyQueryQichachaCompanyBaseMapper.insertSelective(companyQueryQichachaCompanyBase);
					}
				}
				
				//company_query_qichacha_judgement
				CompanyQueryQichachaJudgementExample companyQueryQichachaJudgementExample = new CompanyQueryQichachaJudgementExample();
				companyQueryQichachaJudgementExample.createCriteria().andKeyNoEqualTo(detail.getQichachaKeyNo());
				List<CompanyQueryQichachaJudgement> companyQueryQichachaJudgements = companyQueryQichachaJudgementMapper.selectByExample(companyQueryQichachaJudgementExample);
				if(companyQueryQichachaJudgements == null || companyQueryQichachaJudgements.size() == 0){
					QichachaJudgementExample qichachaJudgementExample = new QichachaJudgementExample();
					qichachaJudgementExample.createCriteria().andKeyNoEqualTo(detail.getQichachaKeyNo());
					List<QichachaJudgement> judgements = qichachaJudgementMapper.selectByExample(qichachaJudgementExample);
					for(QichachaJudgement judgement : judgements){
						CompanyQueryQichachaJudgement companyQueryQichachaJudgement = new CompanyQueryQichachaJudgement();
						BeanUtils.copyProperties(judgement,companyQueryQichachaJudgement);
						companyQueryQichachaJudgementMapper.insertSelective(companyQueryQichachaJudgement);
					}
				}
				
				//company_query_qichacha_patent
				CompanyQueryQichachaPatentExample companyQueryQichachaPatentExample = new CompanyQueryQichachaPatentExample();
				companyQueryQichachaPatentExample.createCriteria().andKeyNoEqualTo(detail.getQichachaKeyNo());
				List<CompanyQueryQichachaPatent> companyQueryQichachaPatents = companyQueryQichachaPatentMapper.selectByExample(companyQueryQichachaPatentExample);
				if(companyQueryQichachaPatents == null || companyQueryQichachaPatents.size() == 0){
					QichachaPatentExample qichachaPatentExample = new QichachaPatentExample();
					qichachaPatentExample.createCriteria().andKeyNoEqualTo(detail.getQichachaKeyNo());
					List<QichachaPatent> qichachaPatents = qichachaPatentMapper.selectByExample(qichachaPatentExample);
					for(QichachaPatent patent : qichachaPatents){
						CompanyQueryQichachaPatent companyQueryQichachaPatent = new CompanyQueryQichachaPatent();
						BeanUtils.copyProperties(patent,companyQueryQichachaPatent);
						companyQueryQichachaPatentMapper.insertSelective(companyQueryQichachaPatent);
					}
				}
				
				//company_query_monitor_company
				CompanyQueryMonitorCompanyExample queryMonitorCompanyExample = new CompanyQueryMonitorCompanyExample();
				queryMonitorCompanyExample.createCriteria().andRegistItemIdEqualTo(detail.getRegistItemId());
				List<CompanyQueryMonitorCompany> queryMonitorCompanies = companyQueryMonitorCompanyMapper.selectByExample(queryMonitorCompanyExample);
				if(queryMonitorCompanies == null || queryMonitorCompanies.size() == 0){
					MonitorCompany monitorCompanyExample = new MonitorCompany();
					monitorCompanyExample.setRegistItemId(detail.getRegistItemId());
					List<MonitorCompany> monitorCompanies = monitorCompanyMapper.selectByParameter(monitorCompanyExample);
					for(MonitorCompany monitorCompany : monitorCompanies){
						CompanyQueryMonitorCompany queryMonitorCompany = new CompanyQueryMonitorCompany();
						BeanUtils.copyProperties(monitorCompany,queryMonitorCompany);
						companyQueryMonitorCompanyMapper.insertSelective(queryMonitorCompany);
					}
				}
				
				//company_query_pollution_discharge_license
				CompanyQueryPollutionDischargeLicenseExample companyQueryPollutionDischargeLicenseExample = new CompanyQueryPollutionDischargeLicenseExample();
				companyQueryPollutionDischargeLicenseExample.createCriteria().andRegistItemIdEqualTo(detail.getRegistItemId());
				List<CompanyQueryPollutionDischargeLicense> companyQueryPollutionDischargeLicenses = 
						companyQueryPollutionDischargeLicenseMapper.selectByExample(companyQueryPollutionDischargeLicenseExample);
				if(companyQueryPollutionDischargeLicenses == null || companyQueryPollutionDischargeLicenses.size() == 0){
					PollutionDischargeLicense pollutionDischargeLicenseExample = new PollutionDischargeLicense();
					pollutionDischargeLicenseExample.setRegistItemId(detail.getRegistItemId());
					List<PollutionDischargeLicense> pollutionDischargeLicenses = 
							pollutionDischargeLicenseMapper.selectByParameter(pollutionDischargeLicenseExample);
					for(PollutionDischargeLicense license : pollutionDischargeLicenses){
						CompanyQueryPollutionDischargeLicense companyQueryPollutionDischargeLicense = new CompanyQueryPollutionDischargeLicense();
						BeanUtils.copyProperties(license,companyQueryPollutionDischargeLicense);
						companyQueryPollutionDischargeLicenseMapper.insertSelective(companyQueryPollutionDischargeLicense);
						//company_query_execution_record
						ExecutionRecord executionRecord = executionRecordMapper.selectByPollutionId(license.getId());
						CompanyQueryExecutionRecordWithBLOBs companyQueryExecutionRecord = new CompanyQueryExecutionRecordWithBLOBs();
						BeanUtils.copyProperties(executionRecord,companyQueryExecutionRecord);
						companyQueryExecutionRecordMapper.insertSelective(companyQueryExecutionRecord);
					}
				}
				
				//company_query_excel_energy_efficiency_label
				CompanyQueryExcelEnergyEfficiencyLabelExample companyQueryExcelEnergyEfficiencyLabelExample = 
						new CompanyQueryExcelEnergyEfficiencyLabelExample();
				companyQueryExcelEnergyEfficiencyLabelExample.createCriteria().andRegistItemIdEqualTo(detail.getRegistItemId());
				List<CompanyQueryExcelEnergyEfficiencyLabel> companyQueryExcelEnergyEfficiencyLabels = 
						companyQueryExcelEnergyEfficiencyLabelMapper.selectByExample(companyQueryExcelEnergyEfficiencyLabelExample);
				if(companyQueryExcelEnergyEfficiencyLabels == null || companyQueryExcelEnergyEfficiencyLabels.size() == 0){
					ExcelEnergyEfficiencyLabelExample excelEnergyEfficiencyLabelExample = new ExcelEnergyEfficiencyLabelExample();
					excelEnergyEfficiencyLabelExample.createCriteria().andRegistItemIdEqualTo(detail.getRegistItemId());
					List<ExcelEnergyEfficiencyLabel> excelEnergyEfficiencyLabels = 
							excelEnergyEfficiencyLabelMapper.selectByExample(excelEnergyEfficiencyLabelExample);
					for(ExcelEnergyEfficiencyLabel efficiencyLabel : excelEnergyEfficiencyLabels){
						CompanyQueryExcelEnergyEfficiencyLabel companyQueryExcelEnergyEfficiencyLabel = new CompanyQueryExcelEnergyEfficiencyLabel();
						BeanUtils.copyProperties(efficiencyLabel,companyQueryExcelEnergyEfficiencyLabel);
						companyQueryExcelEnergyEfficiencyLabelMapper.insertSelective(companyQueryExcelEnergyEfficiencyLabel);
					}
				}
			}
		}
	}

}
