package com.igreen.boss.service.impl.companyQuery;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.companyQuery.CompanyQueryCleanProductionCompanyService;
import com.igreen.common.dao.CompanyQueryCleanProductionCompanyMapper;
import com.igreen.common.model.CompanyQueryCleanProductionCompany;
import com.igreen.common.model.CompanyQueryCleanProductionCompanyExample;

@Service
public class CompanyQueryCleanProductionCompanyServiceImpl implements CompanyQueryCleanProductionCompanyService {

	@Resource
	CompanyQueryCleanProductionCompanyMapper companyQueryCleanProductionCompanyMapper;
	
	@Override
	public int countByExample(CompanyQueryCleanProductionCompanyExample example) {
		return companyQueryCleanProductionCompanyMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CompanyQueryCleanProductionCompanyExample example) {
		return companyQueryCleanProductionCompanyMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return companyQueryCleanProductionCompanyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CompanyQueryCleanProductionCompany record) {
		return companyQueryCleanProductionCompanyMapper.insert(record);
	}

	@Override
	public int insertSelective(CompanyQueryCleanProductionCompany record) {
		return companyQueryCleanProductionCompanyMapper.insertSelective(record);
	}

	@Override
	public List<CompanyQueryCleanProductionCompany> selectByExample(CompanyQueryCleanProductionCompanyExample example) {
		return companyQueryCleanProductionCompanyMapper.selectByExample(example);
	}

	@Override
	public CompanyQueryCleanProductionCompany selectByPrimaryKey(Long id) {
		return companyQueryCleanProductionCompanyMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CompanyQueryCleanProductionCompany record,
			CompanyQueryCleanProductionCompanyExample example) {
		return companyQueryCleanProductionCompanyMapper.updateByExampleSelective(record,example);
	}

	@Override
	public int updateByExample(CompanyQueryCleanProductionCompany record,
			CompanyQueryCleanProductionCompanyExample example) {
		return companyQueryCleanProductionCompanyMapper.updateByExample(record,example);
	}

	@Override
	public int updateByPrimaryKeySelective(CompanyQueryCleanProductionCompany record) {
		return companyQueryCleanProductionCompanyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CompanyQueryCleanProductionCompany record) {
		return companyQueryCleanProductionCompanyMapper.updateByPrimaryKey(record);
	}

}
