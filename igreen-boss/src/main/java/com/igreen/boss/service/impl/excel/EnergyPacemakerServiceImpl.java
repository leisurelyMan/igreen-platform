package com.igreen.boss.service.impl.excel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.excel.EnergyPacemakerService;
import com.igreen.common.dao.ExcelEnergyPacemakerMapper;
import com.igreen.common.model.ExcelEnergyPacemaker;
import com.igreen.common.model.ExcelEnergyPacemakerExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class EnergyPacemakerServiceImpl implements EnergyPacemakerService {

	@Resource
	ExcelEnergyPacemakerMapper energyPacemakerMapper;
	
	@Override
	public int countByExample(ExcelEnergyPacemakerExample example) {
		return energyPacemakerMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ExcelEnergyPacemakerExample example) {
		return energyPacemakerMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return energyPacemakerMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ExcelEnergyPacemaker record) {
		return energyPacemakerMapper.insert(record);
	}

	@Override
	public int insertSelective(ExcelEnergyPacemaker record) {
		return energyPacemakerMapper.insertSelective(record);
	}

	@Override
	public List<ExcelEnergyPacemaker> selectByExample(ExcelEnergyPacemakerExample example) {
		return energyPacemakerMapper.selectByExample(example);
	}

	@Override
	public ExcelEnergyPacemaker selectByPrimaryKey(Long id) {
		return energyPacemakerMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ExcelEnergyPacemaker record, ExcelEnergyPacemakerExample example) {
		return energyPacemakerMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ExcelEnergyPacemaker record, ExcelEnergyPacemakerExample example) {
		return energyPacemakerMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ExcelEnergyPacemaker record) {
		return energyPacemakerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ExcelEnergyPacemaker record) {
		return energyPacemakerMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange list(ExcelEnergyPacemaker record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		ExcelEnergyPacemakerExample example = new ExcelEnergyPacemakerExample();
		com.igreen.common.model.ExcelEnergyPacemakerExample.Criteria criteria = example.createCriteria();
/*		if (!StrUtil.isNull(hotWord.getId()))
			criteria.andIdEqualTo(hotWord.getId());*/
		if (!StrUtil.isNull(record.getCompany()))
			criteria.andCompanyLike("%"+record.getCompany()+"%");
		/*if (!StrUtil.isNull(hotWord.getStatas()))
			criteria.andStatasEqualTo(hotWord.getStatas());*/
		example.setOrderByClause("id desc");

		List<ExcelEnergyPacemaker> list = energyPacemakerMapper.selectByExample(example);
		PageInfo<ExcelEnergyPacemaker> p = new PageInfo<ExcelEnergyPacemaker>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
