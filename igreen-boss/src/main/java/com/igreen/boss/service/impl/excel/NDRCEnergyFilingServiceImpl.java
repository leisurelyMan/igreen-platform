package com.igreen.boss.service.impl.excel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.excel.NDRCEnergyFilingService;
import com.igreen.common.dao.ExcelNDRCEnergyFilingMapper;
import com.igreen.common.model.ExcelNDRCEnergyFiling;
import com.igreen.common.model.ExcelNDRCEnergyFilingExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class NDRCEnergyFilingServiceImpl implements NDRCEnergyFilingService {

	@Resource
	ExcelNDRCEnergyFilingMapper ndrcEnergyFilingMapper;
	
	@Override
	public int countByExample(ExcelNDRCEnergyFilingExample example) {
		return ndrcEnergyFilingMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ExcelNDRCEnergyFilingExample example) {
		return ndrcEnergyFilingMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return ndrcEnergyFilingMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ExcelNDRCEnergyFiling record) {
		return ndrcEnergyFilingMapper.insert(record);
	}

	@Override
	public int insertSelective(ExcelNDRCEnergyFiling record) {
		return ndrcEnergyFilingMapper.insertSelective(record);
	}

	@Override
	public List<ExcelNDRCEnergyFiling> selectByExample(ExcelNDRCEnergyFilingExample example) {
		return ndrcEnergyFilingMapper.selectByExample(example);
	}

	@Override
	public ExcelNDRCEnergyFiling selectByPrimaryKey(Integer id) {
		return ndrcEnergyFilingMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ExcelNDRCEnergyFiling record, ExcelNDRCEnergyFilingExample example) {
		return ndrcEnergyFilingMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ExcelNDRCEnergyFiling record, ExcelNDRCEnergyFilingExample example) {
		return ndrcEnergyFilingMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ExcelNDRCEnergyFiling record) {
		return ndrcEnergyFilingMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ExcelNDRCEnergyFiling record) {
		return ndrcEnergyFilingMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange list(ExcelNDRCEnergyFiling record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		ExcelNDRCEnergyFilingExample example = new ExcelNDRCEnergyFilingExample();
		com.igreen.common.model.ExcelNDRCEnergyFilingExample.Criteria criteria = example.createCriteria();
/*		if (!StrUtil.isNull(hotWord.getId()))
			criteria.andIdEqualTo(hotWord.getId());*/
		if (!StrUtil.isNull(record.getCompanyName()))
			criteria.andCompanyNameLike("%"+record.getCompanyName()+"%");
		/*if (!StrUtil.isNull(hotWord.getStatas()))
			criteria.andStatasEqualTo(hotWord.getStatas());*/
		example.setOrderByClause("id desc");

		List<ExcelNDRCEnergyFiling> list = ndrcEnergyFilingMapper.selectByExample(example);
		PageInfo<ExcelNDRCEnergyFiling> p = new PageInfo<ExcelNDRCEnergyFiling>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
