package com.igreen.common.dao;

import java.util.List;

import com.igreen.common.model.IpeCountry;

public interface IpeCountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IpeCountry record);

    int insertSelective(IpeCountry record);

    IpeCountry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IpeCountry record);

    int updateByPrimaryKey(IpeCountry record);
    
    List<IpeCountry> selectByParentCode(String parentCode);
}