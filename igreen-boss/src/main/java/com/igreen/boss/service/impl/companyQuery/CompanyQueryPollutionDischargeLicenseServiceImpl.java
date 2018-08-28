package com.igreen.boss.service.impl.companyQuery;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.companyQuery.CompanyQueryPollutionDischargeLicenseService;
import com.igreen.common.dao.CompanyQueryPollutionDischargeLicenseMapper;
import com.igreen.common.model.CompanyQueryPollutionDischargeLicense;
import com.igreen.common.model.CompanyQueryPollutionDischargeLicenseExample;

@Service
public class CompanyQueryPollutionDischargeLicenseServiceImpl implements CompanyQueryPollutionDischargeLicenseService {

	@Resource
	CompanyQueryPollutionDischargeLicenseMapper companyQueryPollutionDischargeLicenseMapper;
	
	@Override
	public int countByExample(CompanyQueryPollutionDischargeLicenseExample example) {
		return companyQueryPollutionDischargeLicenseMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CompanyQueryPollutionDischargeLicenseExample example) {
		return companyQueryPollutionDischargeLicenseMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return companyQueryPollutionDischargeLicenseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CompanyQueryPollutionDischargeLicense record) {
		return companyQueryPollutionDischargeLicenseMapper.insert(record);
	}

	@Override
	public int insertSelective(CompanyQueryPollutionDischargeLicense record) {
		return companyQueryPollutionDischargeLicenseMapper.insertSelective(record);
	}

	@Override
	public List<CompanyQueryPollutionDischargeLicense> selectByExample(
			CompanyQueryPollutionDischargeLicenseExample example) {
		return companyQueryPollutionDischargeLicenseMapper.selectByExample(example);
	}

	@Override
	public CompanyQueryPollutionDischargeLicense selectByPrimaryKey(Integer id) {
		return companyQueryPollutionDischargeLicenseMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CompanyQueryPollutionDischargeLicense record,
			CompanyQueryPollutionDischargeLicenseExample example) {
		return companyQueryPollutionDischargeLicenseMapper.updateByExampleSelective(record,example);
	}

	@Override
	public int updateByExample(CompanyQueryPollutionDischargeLicense record,
			CompanyQueryPollutionDischargeLicenseExample example) {
		return companyQueryPollutionDischargeLicenseMapper.updateByExample(record,example);
	}

	@Override
	public int updateByPrimaryKeySelective(CompanyQueryPollutionDischargeLicense record) {
		return companyQueryPollutionDischargeLicenseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CompanyQueryPollutionDischargeLicense record) {
		return companyQueryPollutionDischargeLicenseMapper.updateByPrimaryKey(record);
	}

}
