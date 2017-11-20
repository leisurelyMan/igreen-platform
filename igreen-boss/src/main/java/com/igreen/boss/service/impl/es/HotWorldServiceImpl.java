package com.igreen.boss.service.impl.es;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.es.HotWorldService;
import com.igreen.common.dao.HotWordsMapper;
import com.igreen.common.model.HotWords;
import com.igreen.common.model.HotWordsExample;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class HotWorldServiceImpl implements HotWorldService {
	
	@Resource
	HotWordsMapper hotWordsMapper;

	@Override
	public int countByExample(HotWordsExample example) {
		return hotWordsMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HotWordsExample example) {
		return hotWordsMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return hotWordsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(HotWords record) {
		return hotWordsMapper.insert(record);
	}

	@Override
	public int insertSelective(HotWords record) {
		return hotWordsMapper.insertSelective(record);
	}

	@Override
	public List<HotWords> selectByExample(HotWordsExample example) {
		return hotWordsMapper.selectByExample(example);
	}

	@Override
	public HotWords selectByPrimaryKey(Integer id) {
		return hotWordsMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(HotWords record, HotWordsExample example) {
		return hotWordsMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(HotWords record, HotWordsExample example) {
		return hotWordsMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HotWords record) {
		return hotWordsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(HotWords record) {
		return hotWordsMapper.updateByPrimaryKey(record);
	}

	@Override
	public ListRange hotWorldList(HotWords hotWord, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		HotWordsExample example = new HotWordsExample();
		com.igreen.common.model.HotWordsExample.Criteria criteria = example.createCriteria();
		if (!StrUtil.isNull(hotWord.getId()))
			criteria.andIdEqualTo(hotWord.getId());
		if (!StrUtil.isNull(hotWord.getWord()))
			criteria.andWordLike("%"+hotWord.getWord()+"%");
		if (!StrUtil.isNull(hotWord.getStatas()))
			criteria.andStatasEqualTo(hotWord.getStatas());
		example.setOrderByClause("id desc");

		List<HotWords> list = hotWordsMapper.selectByExample(example);
		PageInfo<HotWords> p = new PageInfo<HotWords>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
