package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.SysDictionary;

public interface SysDictionaryMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(SysDictionary record);

    int insertSelective(SysDictionary record);

    SysDictionary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDictionary record);

    int updateByPrimaryKey(SysDictionary record);

	List<SysDictionary> pageSysDictionary(Map<String, Object> params);

	Integer countSysDictionary(Map<String, Object> params);
	
	List<SysDictionary> selectByPrentId(Integer dicParentId);
}