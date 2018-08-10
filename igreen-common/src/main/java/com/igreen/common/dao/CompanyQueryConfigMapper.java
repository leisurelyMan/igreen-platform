package com.igreen.common.dao;

import com.igreen.common.model.CompanyQueryConfig;
import com.igreen.common.model.CompanyQueryConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyQueryConfigMapper {
    int countByExample(CompanyQueryConfigExample example);

    int deleteByExample(CompanyQueryConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyQueryConfig record);

    int insertSelective(CompanyQueryConfig record);

    List<CompanyQueryConfig> selectByExample(CompanyQueryConfigExample example);

    CompanyQueryConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyQueryConfig record, @Param("example") CompanyQueryConfigExample example);

    int updateByExample(@Param("record") CompanyQueryConfig record, @Param("example") CompanyQueryConfigExample example);

    int updateByPrimaryKeySelective(CompanyQueryConfig record);

    int updateByPrimaryKey(CompanyQueryConfig record);
}