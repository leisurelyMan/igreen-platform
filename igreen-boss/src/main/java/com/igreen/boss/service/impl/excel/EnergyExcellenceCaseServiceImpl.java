package com.igreen.boss.service.impl.excel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.excel.EnergyExcellenceCaseService;
import com.igreen.common.dao.ExcelEnergyExcellenceCaseMapper;
import com.igreen.common.model.ExcelEnergyExcellenceCase;
import com.igreen.common.model.ExcelEnergyExcellenceCaseExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class EnergyExcellenceCaseServiceImpl implements EnergyExcellenceCaseService {
	
	@Resource
	ExcelEnergyExcellenceCaseMapper energyExcellenceCaseMapper;

	@Override
	public int countByExample(ExcelEnergyExcellenceCaseExample example) {
		return energyExcellenceCaseMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ExcelEnergyExcellenceCaseExample example) {
		return energyExcellenceCaseMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return energyExcellenceCaseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ExcelEnergyExcellenceCase record) {
		return energyExcellenceCaseMapper.insert(record);
	}

	@Override
	public int insertSelective(ExcelEnergyExcellenceCase record) {
		return energyExcellenceCaseMapper.insertSelective(record);
	}

	@Override
	public List<ExcelEnergyExcellenceCase> selectByExample(ExcelEnergyExcellenceCaseExample example) {
		return energyExcellenceCaseMapper.selectByExample(example);
	}

	@Override
	public ExcelEnergyExcellenceCase selectByPrimaryKey(Integer id) {
		return energyExcellenceCaseMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ExcelEnergyExcellenceCase record, ExcelEnergyExcellenceCaseExample example) {
		return energyExcellenceCaseMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ExcelEnergyExcellenceCase record, ExcelEnergyExcellenceCaseExample example) {
		return energyExcellenceCaseMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ExcelEnergyExcellenceCase record) {
		return energyExcellenceCaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ExcelEnergyExcellenceCase record) {
		return energyExcellenceCaseMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange list(ExcelEnergyExcellenceCase record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		ExcelEnergyExcellenceCaseExample example = new ExcelEnergyExcellenceCaseExample();
		com.igreen.common.model.ExcelEnergyExcellenceCaseExample.Criteria criteria = example.createCriteria();
/*		if (!StrUtil.isNull(hotWord.getId()))
			criteria.andIdEqualTo(hotWord.getId());*/
		if (!StrUtil.isNull(record.getCompanyName()))
			criteria.andCompanyNameLike("%"+record.getCompanyName()+"%");
		/*if (!StrUtil.isNull(hotWord.getStatas()))
			criteria.andStatasEqualTo(hotWord.getStatas());*/
		example.setOrderByClause("id desc");

		List<ExcelEnergyExcellenceCase> list = energyExcellenceCaseMapper.selectByExample(example);
		PageInfo<ExcelEnergyExcellenceCase> p = new PageInfo<ExcelEnergyExcellenceCase>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
