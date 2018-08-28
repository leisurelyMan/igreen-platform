package com.igreen.common.dao;

import com.igreen.common.model.CompanyQueryDetail;
import com.igreen.common.model.CompanyQueryDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyQueryDetailMapper {
    int countByExample(CompanyQueryDetailExample example);

    int deleteByExample(CompanyQueryDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyQueryDetail record);

    int insertSelective(CompanyQueryDetail record);

    List<CompanyQueryDetail> selectByExample(CompanyQueryDetailExample example);

    CompanyQueryDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyQueryDetail record, @Param("example") CompanyQueryDetailExample example);

    int updateByExample(@Param("record") CompanyQueryDetail record, @Param("example") CompanyQueryDetailExample example);

    int updateByPrimaryKeySelective(CompanyQueryDetail record);

    int updateByPrimaryKey(CompanyQueryDetail record);
}