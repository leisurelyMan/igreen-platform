package com.igreen.common.dao;

import com.igreen.common.model.IpeIndustryRecord1;
import com.igreen.common.model.IpeIndustryRecord1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpeIndustryRecord1Mapper {
    int countByExample(IpeIndustryRecord1Example example);

    int deleteByExample(IpeIndustryRecord1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(IpeIndustryRecord1 record);

    int insertSelective(IpeIndustryRecord1 record);

    List<IpeIndustryRecord1> selectByExample(IpeIndustryRecord1Example example);

    IpeIndustryRecord1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IpeIndustryRecord1 record, @Param("example") IpeIndustryRecord1Example example);

    int updateByExample(@Param("record") IpeIndustryRecord1 record, @Param("example") IpeIndustryRecord1Example example);

    int updateByPrimaryKeySelective(IpeIndustryRecord1 record);

    int updateByPrimaryKey(IpeIndustryRecord1 record);
}