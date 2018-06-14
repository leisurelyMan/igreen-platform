package com.igreen.boss.service.impl.qichacha;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.dto.QichachaCompanyBaseDto;
import com.igreen.boss.service.qichacha.QichachaCompanyBaseService;
import com.igreen.common.dao.QichachaCompanyBaseMapper;
import com.igreen.common.model.QichachaCompanyBase;
import com.igreen.common.model.QichachaCompanyBaseExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class QichachaCompanyBaseServiceImpl implements QichachaCompanyBaseService {
	
	@Resource
	QichachaCompanyBaseMapper companyBaseMapper;

	@Override
	public int countByExample(QichachaCompanyBaseExample example) {
		return companyBaseMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(QichachaCompanyBaseExample example) {
		return companyBaseMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String keyNo) {
		return companyBaseMapper.deleteByPrimaryKey(keyNo);
	}

	@Override
	public int insert(QichachaCompanyBase record) {
		return companyBaseMapper.insert(record);
	}

	@Override
	public int insertSelective(QichachaCompanyBase record) {
		return companyBaseMapper.insertSelective(record);
	}

	@Override
	public List<QichachaCompanyBase> selectByExampleWithBLOBs(QichachaCompanyBaseExample example) {
		return companyBaseMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<QichachaCompanyBase> selectByExample(QichachaCompanyBaseExample example) {
		return companyBaseMapper.selectByExample(example);
	}

	@Override
	public QichachaCompanyBase selectByPrimaryKey(String keyNo) {
		return companyBaseMapper.selectByPrimaryKey(keyNo);
	}

	@Override
	public int updateByExampleSelective(QichachaCompanyBase record, QichachaCompanyBaseExample example) {
		return companyBaseMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(QichachaCompanyBase record, QichachaCompanyBaseExample example) {
		return companyBaseMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(QichachaCompanyBase record, QichachaCompanyBaseExample example) {
		return companyBaseMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(QichachaCompanyBase record) {
		return companyBaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(QichachaCompanyBase record) {
		return companyBaseMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(QichachaCompanyBase record) {
		return companyBaseMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange companybaseList(QichachaCompanyBaseDto record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		QichachaCompanyBaseExample example = new QichachaCompanyBaseExample();
		com.igreen.common.model.QichachaCompanyBaseExample.Criteria criteria = example.createCriteria();
		if (!StrUtil.isNull(record.getKeyNo()))
			criteria.andKeyNoEqualTo(record.getKeyNo());
		if (!StrUtil.isNull(record.getName()))
			criteria.andNameLike("%"+record.getName()+"%");
		if (!StrUtil.isNull(record.getCompanyNames()))
			criteria.andNameIn(Arrays.asList(record.getCompanyNames().split("\n")));
		if (!StrUtil.isNull(record.getCreditCode()))
			criteria.andCreditCodeLike("%"+record.getCreditCode()+"%");
		example.setOrderByClause("key_no desc");

		List<QichachaCompanyBase> list = companyBaseMapper.selectByExample(example);
		PageInfo<QichachaCompanyBase> p = new PageInfo<QichachaCompanyBase>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

	@Override
	public List<QichachaCompanyBase> selectIndustryByParam(Map<String, Object> param) {
		return companyBaseMapper.selectIndustryByParam(param);
	}

	@Override
	public List<QichachaCompanyBase> selectSubIndustryByParam(Map<String, Object> param) {
		return companyBaseMapper.selectSubIndustryByParam(param);
	}

}
