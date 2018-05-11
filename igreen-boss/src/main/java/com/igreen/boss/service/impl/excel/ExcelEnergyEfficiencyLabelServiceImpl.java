package com.igreen.boss.service.impl.excel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.excel.ExcelEnergyEfficiencyLabelService;
import com.igreen.common.dao.ExcelEnergyEfficiencyLabelMapper;
import com.igreen.common.model.ExcelEnergyEfficiencyLabel;
import com.igreen.common.model.ExcelEnergyEfficiencyLabelExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class ExcelEnergyEfficiencyLabelServiceImpl implements ExcelEnergyEfficiencyLabelService {
	
	@Resource
	ExcelEnergyEfficiencyLabelMapper excelEnergyEfficiencyLabelMapper;

	@Override
	public int countByExample(ExcelEnergyEfficiencyLabelExample example) {
		return excelEnergyEfficiencyLabelMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ExcelEnergyEfficiencyLabelExample example) {
		return excelEnergyEfficiencyLabelMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return excelEnergyEfficiencyLabelMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ExcelEnergyEfficiencyLabel record) {
		return excelEnergyEfficiencyLabelMapper.insert(record);
	}

	@Override
	public int insertSelective(ExcelEnergyEfficiencyLabel record) {
		return excelEnergyEfficiencyLabelMapper.insertSelective(record);
	}

	@Override
	public List<ExcelEnergyEfficiencyLabel> selectByExample(ExcelEnergyEfficiencyLabelExample example) {
		return excelEnergyEfficiencyLabelMapper.selectByExample(example);
	}

	@Override
	public ExcelEnergyEfficiencyLabel selectByPrimaryKey(Long id) {
		return excelEnergyEfficiencyLabelMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ExcelEnergyEfficiencyLabel record, ExcelEnergyEfficiencyLabelExample example) {
		return excelEnergyEfficiencyLabelMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ExcelEnergyEfficiencyLabel record, ExcelEnergyEfficiencyLabelExample example) {
		return excelEnergyEfficiencyLabelMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ExcelEnergyEfficiencyLabel record) {
		return excelEnergyEfficiencyLabelMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ExcelEnergyEfficiencyLabel record) {
		return excelEnergyEfficiencyLabelMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange excelEnergyEfficiencyLabelList(ExcelEnergyEfficiencyLabel label, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		ExcelEnergyEfficiencyLabelExample example = new ExcelEnergyEfficiencyLabelExample();
		com.igreen.common.model.ExcelEnergyEfficiencyLabelExample.Criteria criteria = example.createCriteria();
/*		if (!StrUtil.isNull(hotWord.getId()))
			criteria.andIdEqualTo(hotWord.getId());*/
		if (!StrUtil.isNull(label.getFilingCompany()))
			criteria.andFilingCompanyLike("%"+label.getFilingCompany()+"%");
		/*if (!StrUtil.isNull(hotWord.getStatas()))
			criteria.andStatasEqualTo(hotWord.getStatas());*/
		example.setOrderByClause("id desc");

		List<ExcelEnergyEfficiencyLabel> list = excelEnergyEfficiencyLabelMapper.selectByExample(example);
		PageInfo<ExcelEnergyEfficiencyLabel> p = new PageInfo<ExcelEnergyEfficiencyLabel>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}
}
