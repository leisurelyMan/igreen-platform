package com.igreen.boss.service.impl.companyQuery;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.companyQuery.CompanyQueryConfigService;
import com.igreen.common.dao.CompanyQueryConfigMapper;
import com.igreen.common.model.CompanyQueryConfig;
import com.igreen.common.model.CompanyQueryConfigExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class CompanyQueryConfigServiceImpl implements CompanyQueryConfigService {

	@Resource
	CompanyQueryConfigMapper companyQueryConfigMapper;
	
	@Override
	public int countByExample(CompanyQueryConfigExample example) {
		return companyQueryConfigMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CompanyQueryConfigExample example) {
		return companyQueryConfigMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return companyQueryConfigMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CompanyQueryConfig record) {
		return companyQueryConfigMapper.insert(record);
	}

	@Override
	public int insertSelective(CompanyQueryConfig record) {
		return companyQueryConfigMapper.insertSelective(record);
	}

	@Override
	public List<CompanyQueryConfig> selectByExample(CompanyQueryConfigExample example) {
		return companyQueryConfigMapper.selectByExample(example);
	}

	@Override
	public CompanyQueryConfig selectByPrimaryKey(Integer id) {
		return companyQueryConfigMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CompanyQueryConfig record, CompanyQueryConfigExample example) {
		return companyQueryConfigMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CompanyQueryConfig record, CompanyQueryConfigExample example) {
		return companyQueryConfigMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CompanyQueryConfig record) {
		return companyQueryConfigMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CompanyQueryConfig record) {
		return companyQueryConfigMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange queryConfigList(CompanyQueryConfig record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		CompanyQueryConfigExample example = new CompanyQueryConfigExample();
		com.igreen.common.model.CompanyQueryConfigExample.Criteria criteria = example.createCriteria();
		if (!StrUtil.isNull(record.getName()))
			criteria.andNameLike("%"+record.getName()+"%");
		example.setOrderByClause("id desc");
		List<CompanyQueryConfig> list = companyQueryConfigMapper.selectByExample(example);
		PageInfo<CompanyQueryConfig> p = new PageInfo<CompanyQueryConfig>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
