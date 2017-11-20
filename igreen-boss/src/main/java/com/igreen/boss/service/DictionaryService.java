package com.igreen.boss.service;

import java.util.List;

import com.igreen.common.model.SysDictionary;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface DictionaryService {

	/**
	 * 添加字典
	 * @param dictionary
	 * @return
	 */
	ResponseModel addDictionary(SysDictionary dictionary,Integer userId);

	/**
	 * 根据ID查询字典
	 * @param dictionaryId
	 * @return
	 */
	SysDictionary getOneDictionary(Integer dictionaryId);

	/**
	 * 分页显示字典
	 * @param dictionary
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange dictionaryList(SysDictionary dictionary, Integer currentPage, Integer pageRows);

	/**
	 * 查询一级字典
	 * @return
	 */
	List<SysDictionary> getDictionaryByParentId(Integer parentId);

}
