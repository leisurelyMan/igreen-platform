package com.igreen.boss.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.DictionaryService;
import com.igreen.common.dao.SysDictionaryMapper;
import com.igreen.common.model.SysDictionary;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class DictionaryServiceImpl implements DictionaryService {
	
	Logger log = Logger.getLogger(DictionaryServiceImpl.class);
	
	@Resource
	SysDictionaryMapper sysDictionaryMapper;

	@Override
	public ResponseModel addDictionary(SysDictionary dictionary,Integer userId) {
		try {
			if(StrUtil.isNull(dictionary.getId())){
				dictionary.setStatus(0);
				dictionary.setCreater(userId);
				dictionary.setCreatedTime(new Date());
				sysDictionaryMapper.insertSelective(dictionary);
			}else{
				dictionary.setUpdater(userId);
				dictionary.setUpdatedTime(new Date());
				sysDictionaryMapper.updateByPrimaryKeySelective(dictionary);
			}
			
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public SysDictionary getOneDictionary(Integer dictionaryId) {
		return sysDictionaryMapper.selectByPrimaryKey(dictionaryId);
	}

	@Override
	public ListRange dictionaryList(SysDictionary dictionary, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(dictionary.getDicName()))
			params.put("dicName", dictionary.getDicName());
		if(!StrUtil.isNull(dictionary.getDicParentId()))
			params.put("dicParentId", dictionary.getDicParentId());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(sysDictionaryMapper.pageSysDictionary(params), sysDictionaryMapper.countSysDictionary(params), currentPage, pageRows);
		return result;
	}

	@Override
	public List<SysDictionary> getDictionaryByParentId(Integer parentId) {
		return sysDictionaryMapper.selectByPrentId(parentId);
	}

}
