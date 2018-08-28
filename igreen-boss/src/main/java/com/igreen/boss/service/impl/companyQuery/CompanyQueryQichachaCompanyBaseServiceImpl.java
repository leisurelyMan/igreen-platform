package com.igreen.boss.service.impl.companyQuery;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.companyQuery.CompanyQueryQichachaCompanyBaseService;
import com.igreen.common.dao.CompanyQueryQichachaCompanyBaseMapper;
import com.igreen.common.model.CompanyQueryQichachaCompanyBase;
import com.igreen.common.model.CompanyQueryQichachaCompanyBaseExample;

@Service
public class CompanyQueryQichachaCompanyBaseServiceImpl implements CompanyQueryQichachaCompanyBaseService {

	@Resource
	CompanyQueryQichachaCompanyBaseMapper companyQueryQichachaCompanyBaseMapper;
	
	@Override
	public int countByExample(CompanyQueryQichachaCompanyBaseExample example) {
		return companyQueryQichachaCompanyBaseMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CompanyQueryQichachaCompanyBaseExample example) {
		return companyQueryQichachaCompanyBaseMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return companyQueryQichachaCompanyBaseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CompanyQueryQichachaCompanyBase record) {
		return companyQueryQichachaCompanyBaseMapper.insert(record);
	}

	@Override
	public int insertSelective(CompanyQueryQichachaCompanyBase record) {
		return companyQueryQichachaCompanyBaseMapper.insertSelective(record);
	}

	@Override
	public List<CompanyQueryQichachaCompanyBase> selectByExampleWithBLOBs(
			CompanyQueryQichachaCompanyBaseExample example) {
		return companyQueryQichachaCompanyBaseMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<CompanyQueryQichachaCompanyBase> selectByExample(CompanyQueryQichachaCompanyBaseExample example) {
		return companyQueryQichachaCompanyBaseMapper.selectByExample(example);
	}

	@Override
	public CompanyQueryQichachaCompanyBase selectByPrimaryKey(Integer id) {
		return companyQueryQichachaCompanyBaseMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CompanyQueryQichachaCompanyBase record,
			CompanyQueryQichachaCompanyBaseExample example) {
		return companyQueryQichachaCompanyBaseMapper.updateByExampleSelective(record,example);
	}

	@Override
	public int updateByExampleWithBLOBs(CompanyQueryQichachaCompanyBase record,
			CompanyQueryQichachaCompanyBaseExample example) {
		return companyQueryQichachaCompanyBaseMapper.updateByExampleWithBLOBs(record,example);
	}

	@Override
	public int updateByExample(CompanyQueryQichachaCompanyBase record, CompanyQueryQichachaCompanyBaseExample example) {
		return companyQueryQichachaCompanyBaseMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CompanyQueryQichachaCompanyBase record) {
		return companyQueryQichachaCompanyBaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(CompanyQueryQichachaCompanyBase record) {
		return companyQueryQichachaCompanyBaseMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(CompanyQueryQichachaCompanyBase record) {
		return companyQueryQichachaCompanyBaseMapper.updateByPrimaryKey(record);
	}

}
