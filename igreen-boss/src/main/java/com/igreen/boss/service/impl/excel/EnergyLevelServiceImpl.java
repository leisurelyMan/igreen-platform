package com.igreen.boss.service.impl.excel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.excel.EnergyLevelService;
import com.igreen.common.dao.ExcelEnergyLevelMapper;
import com.igreen.common.model.ExcelEnergyLevel;
import com.igreen.common.model.ExcelEnergyLevelExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class EnergyLevelServiceImpl implements EnergyLevelService {

	@Resource
	ExcelEnergyLevelMapper energyLevelMapper;
	
	@Override
	public int countByExample(ExcelEnergyLevelExample example) {
		return energyLevelMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ExcelEnergyLevelExample example) {
		return energyLevelMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return energyLevelMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ExcelEnergyLevel record) {
		return energyLevelMapper.insert(record);
	}

	@Override
	public int insertSelective(ExcelEnergyLevel record) {
		return energyLevelMapper.insertSelective(record);
	}

	@Override
	public List<ExcelEnergyLevel> selectByExample(ExcelEnergyLevelExample example) {
		return energyLevelMapper.selectByExample(example);
	}

	@Override
	public ExcelEnergyLevel selectByPrimaryKey(Long id) {
		return energyLevelMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ExcelEnergyLevel record, ExcelEnergyLevelExample example) {
		return energyLevelMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ExcelEnergyLevel record, ExcelEnergyLevelExample example) {
		return energyLevelMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ExcelEnergyLevel record) {
		return energyLevelMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ExcelEnergyLevel record) {
		return energyLevelMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange list(ExcelEnergyLevel record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		ExcelEnergyLevelExample example = new ExcelEnergyLevelExample();
		com.igreen.common.model.ExcelEnergyLevelExample.Criteria criteria = example.createCriteria();
/*		if (!StrUtil.isNull(hotWord.getId()))
			criteria.andIdEqualTo(hotWord.getId());*/
		if (!StrUtil.isNull(record.getCompany()))
			criteria.andCompanyLike("%"+record.getCompany()+"%");
		/*if (!StrUtil.isNull(hotWord.getStatas()))
			criteria.andStatasEqualTo(hotWord.getStatas());*/
		example.setOrderByClause("id desc");

		List<ExcelEnergyLevel> list = energyLevelMapper.selectByExample(example);
		PageInfo<ExcelEnergyLevel> p = new PageInfo<ExcelEnergyLevel>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}
}
