package com.igreen.boss.service.impl.companyQuery;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.companyQuery.CompanyQueryDetailService;
import com.igreen.common.dao.CompanyQueryDetailMapper;
import com.igreen.common.model.CompanyQueryDetail;
import com.igreen.common.model.CompanyQueryDetailExample;

@Service
public class CompanyQueryDetailServiceImpl implements CompanyQueryDetailService {

	@Resource
	CompanyQueryDetailMapper companyQueryDetailMapper;
	
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

}
