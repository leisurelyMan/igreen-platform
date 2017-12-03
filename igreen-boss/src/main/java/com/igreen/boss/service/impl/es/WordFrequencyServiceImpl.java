package com.igreen.boss.service.impl.es;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igreen.boss.service.es.WordFrequencyService;
import com.igreen.common.dao.WordFrequencyMapper;
import com.igreen.common.model.WordFrequency;
import com.igreen.common.model.WordFrequencyExample;
import com.igreen.common.model.WordFrequencyExample.Criteria;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class WordFrequencyServiceImpl implements WordFrequencyService {
	
	@Resource
	WordFrequencyMapper wordFrequencyMapper;

	@Override
	public int countByExample(WordFrequencyExample example) {
		return wordFrequencyMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(WordFrequencyExample example) {
		return wordFrequencyMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return wordFrequencyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(WordFrequency record) {
		return wordFrequencyMapper.insert(record);
	}

	@Override
	public int insertSelective(WordFrequency record) {
		return wordFrequencyMapper.insertSelective(record);
	}

	@Override
	public List<WordFrequency> selectByExample(WordFrequencyExample example) {
		return wordFrequencyMapper.selectByExample(example);
	}

	@Override
	public WordFrequency selectByPrimaryKey(Integer id) {
		return wordFrequencyMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(WordFrequency record, WordFrequencyExample example) {
		return wordFrequencyMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(WordFrequency record, WordFrequencyExample example) {
		return wordFrequencyMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(WordFrequency record) {
		return wordFrequencyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WordFrequency record) {
		return wordFrequencyMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateTimes(String word) {
		WordFrequencyExample example = new WordFrequencyExample();
		Criteria criteria = example.createCriteria();
		criteria.andWordEqualTo(word);
		List<WordFrequency> frequencies = wordFrequencyMapper.selectByExample(example);
		int num = 0;
		if(frequencies == null || frequencies.size() == 0){
			WordFrequency frequency = new WordFrequency();
			frequency.setWord(word);
			frequency.setTimes(1);
			num = wordFrequencyMapper.insertSelective(frequency);
		}else{
			WordFrequency frequency = frequencies.get(0);
			frequency.setTimes(frequency.getTimes()+1);
			num = wordFrequencyMapper.updateByPrimaryKeySelective(frequency);
		}
		return num;
	}

	@Override
	public ListRange wordFrequencyList(WordFrequency frequency, Integer currentPage, Integer pageRows) {
		PageHelper.startPage(currentPage, pageRows);
		WordFrequencyExample example = new WordFrequencyExample();
		Criteria criteria = example.createCriteria();
		if (!StrUtil.isNull(frequency.getId()))
			criteria.andIdEqualTo(frequency.getId());
		if (!StrUtil.isNull(frequency.getWord()))
			criteria.andWordLike("%"+frequency.getWord()+"%");
		if (!StrUtil.isNull(frequency.getStatas()))
			criteria.andStatasEqualTo(frequency.getStatas());
		example.setOrderByClause("times desc,id desc");

		List<WordFrequency> list = wordFrequencyMapper.selectByExample(example);
		PageInfo<WordFrequency> p = new PageInfo<WordFrequency>(list);
		return new ListRange(p.getList(), Integer.parseInt(p.getTotal() + ""), p.getPageNum(), p.getPageSize());
	}

}
