package com.igreen.boss.service.impl.es;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.es.StopWorldService;
import com.igreen.common.dao.HotStopwordsMapper;
import com.igreen.common.model.HotStopwords;
import com.igreen.common.model.HotStopwordsExample;
import com.igreen.common.model.HotStopwordsExample.Criteria;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class StopWorldServiceImpl implements StopWorldService {
	
	@Resource
	HotStopwordsMapper stopwordsMapper;

	@Override
	public int countByExample(HotStopwordsExample example) {
		return stopwordsMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HotStopwordsExample example) {
		return stopwordsMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return stopwordsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(HotStopwords record) {
		return stopwordsMapper.insert(record);
	}

	@Override
	public int insertSelective(HotStopwords record) {
		return stopwordsMapper.insertSelective(record);
	}

	@Override
	public List<HotStopwords> selectByExample(HotStopwordsExample example) {
		return stopwordsMapper.selectByExample(example);
	}

	@Override
	public HotStopwords selectByPrimaryKey(Integer id) {
		return stopwordsMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(HotStopwords record, HotStopwordsExample example) {
		return stopwordsMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(HotStopwords record, HotStopwordsExample example) {
		return stopwordsMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HotStopwords record) {
		return stopwordsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(HotStopwords record) {
		return stopwordsMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange stopWorldList(HotStopwords stopWorld, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		HotStopwordsExample example = new HotStopwordsExample();
		Criteria criteria = example.createCriteria();
		if (!StrUtil.isNull(stopWorld.getId()))
			criteria.andIdEqualTo(stopWorld.getId());
		if (!StrUtil.isNull(stopWorld.getWord()))
			criteria.andWordLike("%"+stopWorld.getWord()+"%");
		if (!StrUtil.isNull(stopWorld.getStatas()))
			criteria.andStatasEqualTo(stopWorld.getStatas());
		example.setOrderByClause("id desc");

		List<HotStopwords> list = stopwordsMapper.selectByExample(example);
		PageInfo<HotStopwords> p = new PageInfo<HotStopwords>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
