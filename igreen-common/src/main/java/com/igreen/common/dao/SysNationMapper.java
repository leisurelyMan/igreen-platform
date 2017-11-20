package com.igreen.common.dao;

import com.igreen.common.model.SysNation;

public interface SysNationMapper {
	
    int deleteByPrimaryKey(Long id);

    int insert(SysNation record);

    int insertSelective(SysNation record);

    SysNation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysNation record);

    int updateByPrimaryKey(SysNation record);
}