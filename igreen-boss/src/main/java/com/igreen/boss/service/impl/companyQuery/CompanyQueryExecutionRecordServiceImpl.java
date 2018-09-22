package com.igreen.boss.service.impl.companyQuery;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.companyQuery.CompanyQueryExecutionRecordService;
import com.igreen.common.dao.CompanyQueryExecutionRecordMapper;
import com.igreen.common.model.CompanyQueryExecutionRecord;
import com.igreen.common.model.CompanyQueryExecutionRecordExample;
import com.igreen.common.model.CompanyQueryExecutionRecordWithBLOBs;

@Service
public class CompanyQueryExecutionRecordServiceImpl implements CompanyQueryExecutionRecordService {

	@Resource
	CompanyQueryExecutionRecordMapper companyQueryExecutionRecordMapper;
	
	@Override
	public int countByExample(CompanyQueryExecutionRecordExample example) {
		return companyQueryExecutionRecordMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CompanyQueryExecutionRecordExample example) {
		return companyQueryExecutionRecordMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return companyQueryExecutionRecordMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CompanyQueryExecutionRecordWithBLOBs record) {
		return companyQueryExecutionRecordMapper.insert(record);
	}

	@Override
	public int insertSelective(CompanyQueryExecutionRecordWithBLOBs record) {
		return companyQueryExecutionRecordMapper.insertSelective(record);
	}

	@Override
	public List<CompanyQueryExecutionRecordWithBLOBs> selectByExampleWithBLOBs(
			CompanyQueryExecutionRecordExample example) {
		return companyQueryExecutionRecordMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<CompanyQueryExecutionRecord> selectByExample(CompanyQueryExecutionRecordExample example) {
		return companyQueryExecutionRecordMapper.selectByExample(example);
	}

	@Override
	public CompanyQueryExecutionRecordWithBLOBs selectByPrimaryKey(Long id) {
		return companyQueryExecutionRecordMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CompanyQueryExecutionRecordWithBLOBs record,
			CompanyQueryExecutionRecordExample example) {
		return companyQueryExecutionRecordMapper.updateByExampleSelective(record,example);
	}

	@Override
	public int updateByExampleWithBLOBs(CompanyQueryExecutionRecordWithBLOBs record,
			CompanyQueryExecutionRecordExample example) {
		return companyQueryExecutionRecordMapper.updateByExampleWithBLOBs(record,example);
	}

	@Override
	public int updateByExample(CompanyQueryExecutionRecord record, CompanyQueryExecutionRecordExample example) {
		return companyQueryExecutionRecordMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CompanyQueryExecutionRecordWithBLOBs record) {
		return companyQueryExecutionRecordMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(CompanyQueryExecutionRecordWithBLOBs record) {
		return companyQueryExecutionRecordMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(CompanyQueryExecutionRecord record) {
		return companyQueryExecutionRecordMapper.updateByPrimaryKey(record);
	}

}
