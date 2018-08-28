package com.igreen.boss.service.impl.companyQuery;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.igreen.boss.service.companyQuery.CompanyQueryQichachaJudgementService;
import com.igreen.common.dao.CompanyQueryQichachaJudgementMapper;
import com.igreen.common.model.CompanyQueryQichachaJudgement;
import com.igreen.common.model.CompanyQueryQichachaJudgementExample;

@Service
public class CompanyQueryQichachaJudgementServiceImpl implements CompanyQueryQichachaJudgementService {

	@Resource
	CompanyQueryQichachaJudgementMapper companyQueryQichachaJudgementMapper;
	
	@Override
	public int countByExample(CompanyQueryQichachaJudgementExample example) {
		return companyQueryQichachaJudgementMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CompanyQueryQichachaJudgementExample example) {
		return companyQueryQichachaJudgementMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return companyQueryQichachaJudgementMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CompanyQueryQichachaJudgement record) {
		return companyQueryQichachaJudgementMapper.insert(record);
	}

	@Override
	public int insertSelective(CompanyQueryQichachaJudgement record) {
		return companyQueryQichachaJudgementMapper.insertSelective(record);
	}

	@Override
	public List<CompanyQueryQichachaJudgement> selectByExampleWithBLOBs(CompanyQueryQichachaJudgementExample example) {
		return companyQueryQichachaJudgementMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<CompanyQueryQichachaJudgement> selectByExample(CompanyQueryQichachaJudgementExample example) {
		return companyQueryQichachaJudgementMapper.selectByExample(example);
	}

	@Override
	public CompanyQueryQichachaJudgement selectByPrimaryKey(String id) {
		return companyQueryQichachaJudgementMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CompanyQueryQichachaJudgement record,
			CompanyQueryQichachaJudgementExample example) {
		return companyQueryQichachaJudgementMapper.updateByExampleSelective(record,example);
	}

	@Override
	public int updateByExampleWithBLOBs(CompanyQueryQichachaJudgement record,
			CompanyQueryQichachaJudgementExample example) {
		return companyQueryQichachaJudgementMapper.updateByExampleWithBLOBs(record,example);
	}

	@Override
	public int updateByExample(CompanyQueryQichachaJudgement record, CompanyQueryQichachaJudgementExample example) {
		return companyQueryQichachaJudgementMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CompanyQueryQichachaJudgement record) {
		return companyQueryQichachaJudgementMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(CompanyQueryQichachaJudgement record) {
		return companyQueryQichachaJudgementMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(CompanyQueryQichachaJudgement record) {
		return companyQueryQichachaJudgementMapper.updateByPrimaryKey(record);
	}

}
