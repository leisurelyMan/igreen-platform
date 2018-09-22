package com.igreen.boss.service.impl.companyQuery;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.companyQuery.CompanyQueryQichachaPatentService;
import com.igreen.common.dao.CompanyQueryQichachaPatentMapper;
import com.igreen.common.model.CompanyQueryQichachaPatent;
import com.igreen.common.model.CompanyQueryQichachaPatentExample;

@Service
public class CompanyQueryQichachaPatentServiceImpl implements CompanyQueryQichachaPatentService {

	@Resource
	CompanyQueryQichachaPatentMapper companyQueryQichachaPatentMapper;
	
	@Override
	public int countByExample(CompanyQueryQichachaPatentExample example) {
		return companyQueryQichachaPatentMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CompanyQueryQichachaPatentExample example) {
		return companyQueryQichachaPatentMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return companyQueryQichachaPatentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CompanyQueryQichachaPatent record) {
		return companyQueryQichachaPatentMapper.insert(record);
	}

	@Override
	public int insertSelective(CompanyQueryQichachaPatent record) {
		return companyQueryQichachaPatentMapper.insertSelective(record);
	}

	@Override
	public List<CompanyQueryQichachaPatent> selectByExample(CompanyQueryQichachaPatentExample example) {
		return companyQueryQichachaPatentMapper.selectByExample(example);
	}

	@Override
	public CompanyQueryQichachaPatent selectByPrimaryKey(Long id) {
		return companyQueryQichachaPatentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CompanyQueryQichachaPatent record, CompanyQueryQichachaPatentExample example) {
		return companyQueryQichachaPatentMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CompanyQueryQichachaPatent record, CompanyQueryQichachaPatentExample example) {
		return companyQueryQichachaPatentMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CompanyQueryQichachaPatent record) {
		return companyQueryQichachaPatentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CompanyQueryQichachaPatent record) {
		return companyQueryQichachaPatentMapper.updateByPrimaryKey(record);
	}

}
