package com.igreen.boss.service.impl.companyQuery;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.companyQuery.CompanyQueryMonitorCompanyService;
import com.igreen.common.dao.CompanyQueryMonitorCompanyMapper;
import com.igreen.common.model.CompanyQueryMonitorCompany;
import com.igreen.common.model.CompanyQueryMonitorCompanyExample;

@Service
public class CompanyQueryMonitorCompanyServiceImpl implements CompanyQueryMonitorCompanyService {

	@Resource
	CompanyQueryMonitorCompanyMapper companyQueryMonitorCompanyMapper;
	
	@Override
	public int countByExample(CompanyQueryMonitorCompanyExample example) {
		return companyQueryMonitorCompanyMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CompanyQueryMonitorCompanyExample example) {
		return companyQueryMonitorCompanyMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return companyQueryMonitorCompanyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CompanyQueryMonitorCompany record) {
		return companyQueryMonitorCompanyMapper.insert(record);
	}

	@Override
	public int insertSelective(CompanyQueryMonitorCompany record) {
		return companyQueryMonitorCompanyMapper.insertSelective(record);
	}

	@Override
	public List<CompanyQueryMonitorCompany> selectByExample(CompanyQueryMonitorCompanyExample example) {
		return companyQueryMonitorCompanyMapper.selectByExample(example);
	}

	@Override
	public CompanyQueryMonitorCompany selectByPrimaryKey(Long id) {
		return companyQueryMonitorCompanyMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CompanyQueryMonitorCompany record, CompanyQueryMonitorCompanyExample example) {
		return companyQueryMonitorCompanyMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CompanyQueryMonitorCompany record, CompanyQueryMonitorCompanyExample example) {
		return companyQueryMonitorCompanyMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CompanyQueryMonitorCompany record) {
		return companyQueryMonitorCompanyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CompanyQueryMonitorCompany record) {
		return companyQueryMonitorCompanyMapper.updateByPrimaryKey(record);
	}

}
