package com.igreen.boss.service.impl.qichacha;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.qichacha.QichachaJudgementService;
import com.igreen.common.dao.QichachaJudgementMapper;
import com.igreen.common.model.QichachaJudgement;
import com.igreen.common.model.QichachaJudgementExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class QichachaJudgementServiceImpl implements QichachaJudgementService {
	
	@Resource
	QichachaJudgementMapper judgementMapper;

	@Override
	public int countByExample(QichachaJudgementExample example) {
		return judgementMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(QichachaJudgementExample example) {
		return judgementMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return judgementMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(QichachaJudgement record) {
		return judgementMapper.insert(record);
	}

	@Override
	public int insertSelective(QichachaJudgement record) {
		return judgementMapper.insertSelective(record);
	}

	@Override
	public List<QichachaJudgement> selectByExampleWithBLOBs(QichachaJudgementExample example) {
		return judgementMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<QichachaJudgement> selectByExample(QichachaJudgementExample example) {
		return judgementMapper.selectByExample(example);
	}

	@Override
	public QichachaJudgement selectByPrimaryKey(String id) {
		return judgementMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(QichachaJudgement record, QichachaJudgementExample example) {
		return judgementMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(QichachaJudgement record, QichachaJudgementExample example) {
		return judgementMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(QichachaJudgement record, QichachaJudgementExample example) {
		return judgementMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(QichachaJudgement record) {
		return judgementMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(QichachaJudgement record) {
		return judgementMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(QichachaJudgement record) {
		return judgementMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange judgementList(QichachaJudgement record, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		QichachaJudgementExample example = new QichachaJudgementExample();
		com.igreen.common.model.QichachaJudgementExample.Criteria criteria = example.createCriteria();
		if (!StrUtil.isNull(record.getKeyNo()))
			criteria.andKeyNoEqualTo(record.getKeyNo());
		if (!StrUtil.isNull(record.getCaseName()))
			criteria.andCaseNameLike("%"+record.getCaseName()+"%");
		if (!StrUtil.isNull(record.getCaseNo()))
			criteria.andCaseNoLike("%"+record.getCaseNo()+"%");
		example.setOrderByClause("id desc");

		List<QichachaJudgement> list = judgementMapper.selectByExample(example);
		PageInfo<QichachaJudgement> p = new PageInfo<QichachaJudgement>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
