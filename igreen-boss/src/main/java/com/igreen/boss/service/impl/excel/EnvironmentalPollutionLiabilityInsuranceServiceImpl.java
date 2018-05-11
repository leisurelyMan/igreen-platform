package com.igreen.boss.service.impl.excel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.excel.EnvironmentalPollutionLiabilityInsuranceService;
import com.igreen.common.dao.ExcelEnvironmentalPollutionLiabilityInsuranceMapper;
import com.igreen.common.model.ExcelEnvironmentalPollutionLiabilityInsurance;
import com.igreen.common.model.ExcelEnvironmentalPollutionLiabilityInsuranceExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class EnvironmentalPollutionLiabilityInsuranceServiceImpl
		implements EnvironmentalPollutionLiabilityInsuranceService {

	@Resource
	ExcelEnvironmentalPollutionLiabilityInsuranceMapper insuranceMapper;
	
	@Override
	public int countByExample(ExcelEnvironmentalPollutionLiabilityInsuranceExample example) {
		return insuranceMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ExcelEnvironmentalPollutionLiabilityInsuranceExample example) {
		return insuranceMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return insuranceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ExcelEnvironmentalPollutionLiabilityInsurance record) {
		return insuranceMapper.insert(record);
	}

	@Override
	public int insertSelective(ExcelEnvironmentalPollutionLiabilityInsurance record) {
		return insuranceMapper.insertSelective(record);
	}

	@Override
	public List<ExcelEnvironmentalPollutionLiabilityInsurance> selectByExample(
			ExcelEnvironmentalPollutionLiabilityInsuranceExample example) {
		return insuranceMapper.selectByExample(example);
	}

	@Override
	public ExcelEnvironmentalPollutionLiabilityInsurance selectByPrimaryKey(Integer id) {
		return insuranceMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ExcelEnvironmentalPollutionLiabilityInsurance record,
			ExcelEnvironmentalPollutionLiabilityInsuranceExample example) {
		return insuranceMapper.updateByExampleSelective(record,example);
	}

	@Override
	public int updateByExample(ExcelEnvironmentalPollutionLiabilityInsurance record,
			ExcelEnvironmentalPollutionLiabilityInsuranceExample example) {
		return insuranceMapper.updateByExample(record,example);
	}

	@Override
	public int updateByPrimaryKeySelective(ExcelEnvironmentalPollutionLiabilityInsurance record) {
		return insuranceMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ExcelEnvironmentalPollutionLiabilityInsurance record) {
		return insuranceMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange list(ExcelEnvironmentalPollutionLiabilityInsurance record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		ExcelEnvironmentalPollutionLiabilityInsuranceExample example = new ExcelEnvironmentalPollutionLiabilityInsuranceExample();
		com.igreen.common.model.ExcelEnvironmentalPollutionLiabilityInsuranceExample.Criteria criteria = example.createCriteria();
/*		if (!StrUtil.isNull(hotWord.getId()))
			criteria.andIdEqualTo(hotWord.getId());*/
		if (!StrUtil.isNull(record.getCompanyName()))
			criteria.andCompanyNameLike("%"+record.getCompanyName()+"%");
		/*if (!StrUtil.isNull(hotWord.getStatas()))
			criteria.andStatasEqualTo(hotWord.getStatas());*/
		example.setOrderByClause("id desc");

		List<ExcelEnvironmentalPollutionLiabilityInsurance> list = insuranceMapper.selectByExample(example);
		PageInfo<ExcelEnvironmentalPollutionLiabilityInsurance> p = new PageInfo<ExcelEnvironmentalPollutionLiabilityInsurance>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
