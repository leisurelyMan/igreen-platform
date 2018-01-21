package com.igreen.boss.service.impl.qichacha;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.qichacha.QichachaPenaltyService;
import com.igreen.common.dao.QichachaPenaltyMapper;
import com.igreen.common.model.QichachaPenalty;
import com.igreen.common.model.QichachaPenaltyExample;
import com.igreen.common.model.QichachaPenaltyWithBLOBs;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class QichachaPenaltyServiceImpl implements QichachaPenaltyService {
	
	@Resource
	QichachaPenaltyMapper qichachaPenaltyMapper;

	@Override
	public int countByExample(QichachaPenaltyExample example) {
		return qichachaPenaltyMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(QichachaPenaltyExample example) {
		return qichachaPenaltyMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return qichachaPenaltyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(QichachaPenaltyWithBLOBs record) {
		return qichachaPenaltyMapper.insert(record);
	}

	@Override
	public int insertSelective(QichachaPenaltyWithBLOBs record) {
		return qichachaPenaltyMapper.insertSelective(record);
	}

	@Override
	public List<QichachaPenaltyWithBLOBs> selectByExampleWithBLOBs(QichachaPenaltyExample example) {
		return qichachaPenaltyMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<QichachaPenalty> selectByExample(QichachaPenaltyExample example) {
		return qichachaPenaltyMapper.selectByExample(example);
	}

	@Override
	public QichachaPenaltyWithBLOBs selectByPrimaryKey(String id) {
		return qichachaPenaltyMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(QichachaPenaltyWithBLOBs record, QichachaPenaltyExample example) {
		return qichachaPenaltyMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(QichachaPenaltyWithBLOBs record, QichachaPenaltyExample example) {
		return qichachaPenaltyMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(QichachaPenalty record, QichachaPenaltyExample example) {
		return qichachaPenaltyMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(QichachaPenaltyWithBLOBs record) {
		return qichachaPenaltyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(QichachaPenaltyWithBLOBs record) {
		return qichachaPenaltyMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(QichachaPenalty record) {
		return qichachaPenaltyMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange penaltyList(QichachaPenalty record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		QichachaPenaltyExample example = new QichachaPenaltyExample();
		com.igreen.common.model.QichachaPenaltyExample.Criteria criteria = example.createCriteria();
		if (!StrUtil.isNull(record.getKeyNo()))
			criteria.andKeyNoEqualTo(record.getKeyNo());
		if (!StrUtil.isNull(record.getNo()))
			criteria.andNoLike("%"+record.getNo()+"%");
		if (!StrUtil.isNull(record.getRegNo()))
			criteria.andRegNoLike("%"+record.getRegNo()+"%");
		example.setOrderByClause("id desc");

		List<QichachaPenalty> list = qichachaPenaltyMapper.selectByExample(example);
		PageInfo<QichachaPenalty> p = new PageInfo<QichachaPenalty>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
