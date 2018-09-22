package com.igreen.boss.service.impl.companyQuery;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.igreen.boss.service.companyQuery.CompanyQueryDetailService;
import com.igreen.boss.util.HttpClientHelper;
import com.igreen.common.dao.AiIpeMapper;
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
import com.igreen.common.model.AiIpe;
import com.igreen.common.model.AiIpeExample;
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
	
	@Resource
	AiIpeMapper aiIpeMapper;
	
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
						companyQueryQichachaCompanyBase.setId(null);
						companyQueryQichachaCompanyBase.setDataVersion(1);
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
						companyQueryQichachaJudgement.setJudgementId(judgement.getId());
						companyQueryQichachaJudgement.setId(null);
						companyQueryQichachaJudgement.setDataVersion(1);
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
						companyQueryQichachaPatent.setPatentId(patent.getId());
						companyQueryQichachaPatent.setId(null);
						companyQueryQichachaPatent.setDataVersion(1);
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
						queryMonitorCompany.setMonitorCompanyId(monitorCompany.getId());
						queryMonitorCompany.setId(null);
						queryMonitorCompany.setDataVersion(1);
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
						companyQueryPollutionDischargeLicense.setLicenseId(license.getId());
						companyQueryPollutionDischargeLicense.setId(null);
						companyQueryPollutionDischargeLicense.setDataVersion(1);
						companyQueryPollutionDischargeLicenseMapper.insertSelective(companyQueryPollutionDischargeLicense);
						//company_query_execution_record
						ExecutionRecord executionRecord = executionRecordMapper.selectByPollutionId(license.getId());
						CompanyQueryExecutionRecordWithBLOBs companyQueryExecutionRecord = new CompanyQueryExecutionRecordWithBLOBs();
						if(executionRecord != null){
							BeanUtils.copyProperties(executionRecord,companyQueryExecutionRecord);
							companyQueryExecutionRecord.setExecutionRecordId(executionRecord.getId());
							companyQueryExecutionRecord.setId(null);
							companyQueryExecutionRecord.setDataVersion(1);
							companyQueryExecutionRecordMapper.insertSelective(companyQueryExecutionRecord);
						}
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
						companyQueryExcelEnergyEfficiencyLabel.setEnergyEfficiencyLabelId(efficiencyLabel.getId());
						companyQueryExcelEnergyEfficiencyLabel.setId(null);
						companyQueryExcelEnergyEfficiencyLabel.setDataVersion(1);
						companyQueryExcelEnergyEfficiencyLabelMapper.insertSelective(companyQueryExcelEnergyEfficiencyLabel);
					}
				}
			}
			
			List<Map<String, String>> list = new ArrayList<Map<String, String>>();
			Map<String, String> map = new HashMap<String, String>();
			for (int i = 0; i < 4; i++) {
				map = new HashMap<>();
				map.put("company", detail.getCompanyName());
				map.put("year", "2019");
				map.put("season", (i+1)+"");
				map.put("mode", "company");
				list.add(map);
			}

			Map<String, Object> param = new HashMap<String, Object>();
			param.put("reqstr", list);
			try {
				String result = HttpClientHelper.sendPost3("http://localhost:4400", param, "UTF-8");
				System.out.println("params="+JSON.toJSONString(param));
				System.out.println("result="+result);
				List<AiIpe> aiIpeList = convertModels(result);
				for(AiIpe aiIpe:aiIpeList){
					AiIpeExample aiIpeExample = new AiIpeExample();
					aiIpeExample.createCriteria()
						.andCompanyEqualTo(aiIpe.getCompany())
						.andSeasonEqualTo(aiIpe.getSeason());
					List<AiIpe> aiIpes = aiIpeMapper.selectByExample(aiIpeExample);
					if(aiIpes == null || aiIpes.size() == 0){
						aiIpe.setCreatedTime(new Date());
						aiIpeMapper.insertSelective(aiIpe);
					}else{
						aiIpe.setUpdatedTime(new Date());
						aiIpe.setId(aiIpes.get(0).getId());
						aiIpeMapper.updateByPrimaryKeySelective(aiIpe);
					}
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	private List<AiIpe> convertModels(String arrStr){
		List<AiIpe> aiIpeList = new ArrayList<>();
		if(org.springframework.util.StringUtils.isEmpty(arrStr) || arrStr.contains("The request key should contain")){
			return aiIpeList;
		}

		JSONArray array = JSON.parseArray(arrStr);
		for (int i = 0; i < array.size(); i++) {
			AiIpe aiIpe = new AiIpe();
			JSONArray arrValue = array.getJSONArray(i);
			aiIpe.setCompany(arrValue.getString(0));
			aiIpe.setFine(formatDouble(arrValue.getString(1)));
			aiIpe.setRevoked(formatDouble(arrValue.getString(2)));
			aiIpe.setConfiscate(formatDouble(arrValue.getString(3)));
			aiIpe.setDetention(formatDouble(arrValue.getString(4)));
			aiIpe.setProduction(formatDouble(arrValue.getString(5)));
			aiIpe.setInstruct(formatDouble(arrValue.getString(6)));

			double sum = 0D;
			for(int j = 0; j < 6; j++){
				sum += Double.valueOf(formatDouble(arrValue.getString(j+1)));
			}
			aiIpe.setTotalSum(formatDouble(String.valueOf(sum/100)));
			aiIpe.setOther(formatDouble(arrValue.getString(7)));
			aiIpe.setSeason(arrValue.getString(8));
			aiIpeList.add(aiIpe);
		}
		return aiIpeList;
	}
	
	public static String formatDouble(String d) {
		if(StringUtils.isEmpty(d)){
			return "0";
		}
		Double dv = Double.valueOf(d);
		NumberFormat nf = NumberFormat.getNumberInstance();
		// 保留两位小数
		nf.setMaximumFractionDigits(2);
		// 如果不需要四舍五入，可以使用RoundingMode.DOWN
		nf.setRoundingMode(RoundingMode.UP);
		return nf.format(dv * 100);
	}
	
	
}
