package com.igreen.boss.service.impl.companyQuery;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.companyQuery.CompanyQueryExcelEnergyEfficiencyLabelService;
import com.igreen.common.dao.CompanyQueryExcelEnergyEfficiencyLabelMapper;
import com.igreen.common.model.CompanyQueryExcelEnergyEfficiencyLabel;
import com.igreen.common.model.CompanyQueryExcelEnergyEfficiencyLabelExample;

@Service
public class CompanyQueryExcelEnergyEfficiencyLabelServiceImpl
		implements CompanyQueryExcelEnergyEfficiencyLabelService {

	@Resource
	CompanyQueryExcelEnergyEfficiencyLabelMapper companyQueryExcelEnergyEfficiencyLabelMapper;
	
	@Override
	public int countByExample(CompanyQueryExcelEnergyEfficiencyLabelExample example) {
		return companyQueryExcelEnergyEfficiencyLabelMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CompanyQueryExcelEnergyEfficiencyLabelExample example) {
		return companyQueryExcelEnergyEfficiencyLabelMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return companyQueryExcelEnergyEfficiencyLabelMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CompanyQueryExcelEnergyEfficiencyLabel record) {
		return companyQueryExcelEnergyEfficiencyLabelMapper.insert(record);
	}

	@Override
	public int insertSelective(CompanyQueryExcelEnergyEfficiencyLabel record) {
		return companyQueryExcelEnergyEfficiencyLabelMapper.insertSelective(record);
	}

	@Override
	public List<CompanyQueryExcelEnergyEfficiencyLabel> selectByExample(
			CompanyQueryExcelEnergyEfficiencyLabelExample example) {
		return companyQueryExcelEnergyEfficiencyLabelMapper.selectByExample(example);
	}

	@Override
	public CompanyQueryExcelEnergyEfficiencyLabel selectByPrimaryKey(Long id) {
		return companyQueryExcelEnergyEfficiencyLabelMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CompanyQueryExcelEnergyEfficiencyLabel record,
			CompanyQueryExcelEnergyEfficiencyLabelExample example) {
		return companyQueryExcelEnergyEfficiencyLabelMapper.updateByExampleSelective(record,example);
	}

	@Override
	public int updateByExample(CompanyQueryExcelEnergyEfficiencyLabel record,
			CompanyQueryExcelEnergyEfficiencyLabelExample example) {
		return companyQueryExcelEnergyEfficiencyLabelMapper.updateByExample(record,example);
	}

	@Override
	public int updateByPrimaryKeySelective(CompanyQueryExcelEnergyEfficiencyLabel record) {
		return companyQueryExcelEnergyEfficiencyLabelMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CompanyQueryExcelEnergyEfficiencyLabel record) {
		return companyQueryExcelEnergyEfficiencyLabelMapper.updateByPrimaryKey(record);
	}

}
