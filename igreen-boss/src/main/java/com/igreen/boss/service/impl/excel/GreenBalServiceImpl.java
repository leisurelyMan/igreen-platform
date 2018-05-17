package com.igreen.boss.service.impl.excel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.excel.GreenBalService;
import com.igreen.common.dao.ExcelGreenBalMapper;
import com.igreen.common.model.ExcelGreenBal;
import com.igreen.common.model.ExcelGreenBalExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class GreenBalServiceImpl implements GreenBalService {

	@Resource
	ExcelGreenBalMapper greenBalMapper;
	
	@Override
	public int countByExample(ExcelGreenBalExample example) {
		return greenBalMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ExcelGreenBalExample example) {
		return greenBalMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return greenBalMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ExcelGreenBal record) {
		return greenBalMapper.insert(record);
	}

	@Override
	public int insertSelective(ExcelGreenBal record) {
		return greenBalMapper.insertSelective(record);
	}

	@Override
	public List<ExcelGreenBal> selectByExample(ExcelGreenBalExample example) {
		return greenBalMapper.selectByExample(example);
	}

	@Override
	public ExcelGreenBal selectByPrimaryKey(Integer id) {
		return greenBalMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ExcelGreenBal record, ExcelGreenBalExample example) {
		return greenBalMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ExcelGreenBal record, ExcelGreenBalExample example) {
		return greenBalMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ExcelGreenBal record) {
		return greenBalMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ExcelGreenBal record) {
		return greenBalMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange list(ExcelGreenBal record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		ExcelGreenBalExample example = new ExcelGreenBalExample();
		com.igreen.common.model.ExcelGreenBalExample.Criteria criteria = example.createCriteria();
/*		if (!StrUtil.isNull(hotWord.getId()))
			criteria.andIdEqualTo(hotWord.getId());*/
		if (!StrUtil.isNull(record.getCompanyName()))
			criteria.andCompanyNameLike("%"+record.getCompanyName()+"%");
		/*if (!StrUtil.isNull(hotWord.getStatas()))
			criteria.andStatasEqualTo(hotWord.getStatas());*/
		example.setOrderByClause("id desc");

		List<ExcelGreenBal> list = greenBalMapper.selectByExample(example);
		PageInfo<ExcelGreenBal> p = new PageInfo<ExcelGreenBal>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
