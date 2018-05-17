package com.igreen.boss.service.impl.excel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.excel.SteelCleanService;
import com.igreen.common.dao.ExcelSteelCleanMapper;
import com.igreen.common.model.ExcelSteelClean;
import com.igreen.common.model.ExcelSteelCleanExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class SteelCleanServiceImpl implements SteelCleanService {
	
	@Resource
	ExcelSteelCleanMapper steelCleanMapper;

	@Override
	public int countByExample(ExcelSteelCleanExample example) {
		return steelCleanMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ExcelSteelCleanExample example) {
		return steelCleanMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return steelCleanMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ExcelSteelClean record) {
		return steelCleanMapper.insert(record);
	}

	@Override
	public int insertSelective(ExcelSteelClean record) {
		return steelCleanMapper.insertSelective(record);
	}

	@Override
	public List<ExcelSteelClean> selectByExample(ExcelSteelCleanExample example) {
		return steelCleanMapper.selectByExample(example);
	}

	@Override
	public ExcelSteelClean selectByPrimaryKey(Integer id) {
		return steelCleanMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ExcelSteelClean record, ExcelSteelCleanExample example) {
		return steelCleanMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ExcelSteelClean record, ExcelSteelCleanExample example) {
		return steelCleanMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ExcelSteelClean record) {
		return steelCleanMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ExcelSteelClean record) {
		return steelCleanMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange list(ExcelSteelClean record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		ExcelSteelCleanExample example = new ExcelSteelCleanExample();
		com.igreen.common.model.ExcelSteelCleanExample.Criteria criteria = example.createCriteria();
/*		if (!StrUtil.isNull(hotWord.getId()))
			criteria.andIdEqualTo(hotWord.getId());*/
		if (!StrUtil.isNull(record.getCompanyName()))
			criteria.andCompanyNameLike("%"+record.getCompanyName()+"%");
		/*if (!StrUtil.isNull(hotWord.getStatas()))
			criteria.andStatasEqualTo(hotWord.getStatas());*/
		example.setOrderByClause("id desc");

		List<ExcelSteelClean> list = steelCleanMapper.selectByExample(example);
		PageInfo<ExcelSteelClean> p = new PageInfo<ExcelSteelClean>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
