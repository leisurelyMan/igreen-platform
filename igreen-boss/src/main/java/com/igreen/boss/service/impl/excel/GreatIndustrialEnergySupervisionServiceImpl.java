package com.igreen.boss.service.impl.excel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.excel.GreatIndustrialEnergySupervisionService;
import com.igreen.common.dao.ExcelGreatIndustrialEnergySupervisionMapper;
import com.igreen.common.model.ExcelGreatIndustrialEnergySupervision;
import com.igreen.common.model.ExcelGreatIndustrialEnergySupervisionExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class GreatIndustrialEnergySupervisionServiceImpl implements GreatIndustrialEnergySupervisionService {

	@Resource
	ExcelGreatIndustrialEnergySupervisionMapper greatIndustrialEnergySupervisionMapper;
	
	@Override
	public int countByExample(ExcelGreatIndustrialEnergySupervisionExample example) {
		return greatIndustrialEnergySupervisionMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ExcelGreatIndustrialEnergySupervisionExample example) {
		return greatIndustrialEnergySupervisionMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return greatIndustrialEnergySupervisionMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ExcelGreatIndustrialEnergySupervision record) {
		return greatIndustrialEnergySupervisionMapper.insert(record);
	}

	@Override
	public int insertSelective(ExcelGreatIndustrialEnergySupervision record) {
		return greatIndustrialEnergySupervisionMapper.insertSelective(record);
	}

	@Override
	public List<ExcelGreatIndustrialEnergySupervision> selectByExample(
			ExcelGreatIndustrialEnergySupervisionExample example) {
		return greatIndustrialEnergySupervisionMapper.selectByExample(example);
	}

	@Override
	public ExcelGreatIndustrialEnergySupervision selectByPrimaryKey(Integer id) {
		return greatIndustrialEnergySupervisionMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ExcelGreatIndustrialEnergySupervision record,
			ExcelGreatIndustrialEnergySupervisionExample example) {
		return greatIndustrialEnergySupervisionMapper.updateByExampleSelective(record,example);
	}

	@Override
	public int updateByExample(ExcelGreatIndustrialEnergySupervision record,
			ExcelGreatIndustrialEnergySupervisionExample example) {
		return greatIndustrialEnergySupervisionMapper.updateByExample(record,example);
	}

	@Override
	public int updateByPrimaryKeySelective(ExcelGreatIndustrialEnergySupervision record) {
		return greatIndustrialEnergySupervisionMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ExcelGreatIndustrialEnergySupervision record) {
		return greatIndustrialEnergySupervisionMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange list(ExcelGreatIndustrialEnergySupervision record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		ExcelGreatIndustrialEnergySupervisionExample example = new ExcelGreatIndustrialEnergySupervisionExample();
		com.igreen.common.model.ExcelGreatIndustrialEnergySupervisionExample.Criteria criteria = example.createCriteria();
/*		if (!StrUtil.isNull(hotWord.getId()))
			criteria.andIdEqualTo(hotWord.getId());*/
		if (!StrUtil.isNull(record.getCompanyName()))
			criteria.andCompanyNameLike("%"+record.getCompanyName()+"%");
		/*if (!StrUtil.isNull(hotWord.getStatas()))
			criteria.andStatasEqualTo(hotWord.getStatas());*/
		example.setOrderByClause("id desc");

		List<ExcelGreatIndustrialEnergySupervision> list = greatIndustrialEnergySupervisionMapper.selectByExample(example);
		PageInfo<ExcelGreatIndustrialEnergySupervision> p = new PageInfo<ExcelGreatIndustrialEnergySupervision>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
