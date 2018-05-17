package com.igreen.boss.service.impl.excel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.excel.EPACreditGradeService;
import com.igreen.common.dao.ExcelEPACreditGradeMapper;
import com.igreen.common.model.ExcelEPACreditGrade;
import com.igreen.common.model.ExcelEPACreditGradeExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class EPACreditGradeServiceImpl implements EPACreditGradeService {

	@Resource
	ExcelEPACreditGradeMapper ePACreditGradeMapper;
	
	@Override
	public int countByExample(ExcelEPACreditGradeExample example) {
		return ePACreditGradeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ExcelEPACreditGradeExample example) {
		return ePACreditGradeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return ePACreditGradeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ExcelEPACreditGrade record) {
		return ePACreditGradeMapper.insert(record);
	}

	@Override
	public int insertSelective(ExcelEPACreditGrade record) {
		return ePACreditGradeMapper.insertSelective(record);
	}

	@Override
	public List<ExcelEPACreditGrade> selectByExample(ExcelEPACreditGradeExample example) {
		return ePACreditGradeMapper.selectByExample(example);
	}

	@Override
	public ExcelEPACreditGrade selectByPrimaryKey(Integer id) {
		return ePACreditGradeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ExcelEPACreditGrade record, ExcelEPACreditGradeExample example) {
		return ePACreditGradeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ExcelEPACreditGrade record, ExcelEPACreditGradeExample example) {
		return ePACreditGradeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ExcelEPACreditGrade record) {
		return ePACreditGradeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ExcelEPACreditGrade record) {
		return ePACreditGradeMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange list(ExcelEPACreditGrade record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		ExcelEPACreditGradeExample example = new ExcelEPACreditGradeExample();
		com.igreen.common.model.ExcelEPACreditGradeExample.Criteria criteria = example.createCriteria();
/*		if (!StrUtil.isNull(hotWord.getId()))
			criteria.andIdEqualTo(hotWord.getId());*/
		if (!StrUtil.isNull(record.getCompanyName()))
			criteria.andCompanyNameLike("%"+record.getCompanyName()+"%");
		/*if (!StrUtil.isNull(hotWord.getStatas()))
			criteria.andStatasEqualTo(hotWord.getStatas());*/
		example.setOrderByClause("id desc");

		List<ExcelEPACreditGrade> list = ePACreditGradeMapper.selectByExample(example);
		PageInfo<ExcelEPACreditGrade> p = new PageInfo<ExcelEPACreditGrade>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
