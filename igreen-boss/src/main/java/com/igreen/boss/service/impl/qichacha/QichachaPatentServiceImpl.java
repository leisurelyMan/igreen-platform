package com.igreen.boss.service.impl.qichacha;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.qichacha.QichachaPatentService;
import com.igreen.common.dao.QichachaPatentMapper;
import com.igreen.common.model.QichachaPatent;
import com.igreen.common.model.QichachaPatentExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class QichachaPatentServiceImpl implements QichachaPatentService {

	@Resource
	QichachaPatentMapper qichachaPatentMapper;
	
	@Override
	public int countByExample(QichachaPatentExample example) {
		return qichachaPatentMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(QichachaPatentExample example) {
		return qichachaPatentMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return qichachaPatentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(QichachaPatent record) {
		return qichachaPatentMapper.insert(record);
	}

	@Override
	public int insertSelective(QichachaPatent record) {
		return qichachaPatentMapper.insertSelective(record);
	}

	@Override
	public List<QichachaPatent> selectByExample(QichachaPatentExample example) {
		return qichachaPatentMapper.selectByExample(example);
	}

	@Override
	public QichachaPatent selectByPrimaryKey(String id) {
		return qichachaPatentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(QichachaPatent record, QichachaPatentExample example) {
		return qichachaPatentMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(QichachaPatent record, QichachaPatentExample example) {
		return qichachaPatentMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(QichachaPatent record) {
		return qichachaPatentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(QichachaPatent record) {
		return qichachaPatentMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange patentList(QichachaPatent record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		QichachaPatentExample example = new QichachaPatentExample();
		com.igreen.common.model.QichachaPatentExample.Criteria criteria = example.createCriteria();
		if (!StrUtil.isNull(record.getKeyNo()))
			criteria.andKeyNoEqualTo(record.getKeyNo());
		if (!StrUtil.isNull(record.getApplicationNumber()))
			criteria.andApplicationNumberLike("%"+record.getApplicationNumber()+"%");
		if (!StrUtil.isNull(record.getPublicationNumber()))
			criteria.andPublicationNumberLike("%"+record.getPublicationNumber()+"%");
		example.setOrderByClause("id desc");

		List<QichachaPatent> list = qichachaPatentMapper.selectByExample(example);
		PageInfo<QichachaPatent> p = new PageInfo<QichachaPatent>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
