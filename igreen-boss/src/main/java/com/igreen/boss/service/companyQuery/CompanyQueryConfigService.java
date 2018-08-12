package com.igreen.boss.service.companyQuery;

import java.util.List;

import com.igreen.common.model.CompanyQueryConfig;
import com.igreen.common.model.CompanyQueryConfigExample;
import com.igreen.common.util.ListRange;

public interface CompanyQueryConfigService {

    int countByExample(CompanyQueryConfigExample example);

    int deleteByExample(CompanyQueryConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyQueryConfig record);

    int insertSelective(CompanyQueryConfig record);

    List<CompanyQueryConfig> selectByExample(CompanyQueryConfigExample example);

    CompanyQueryConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(CompanyQueryConfig record, CompanyQueryConfigExample example);

    int updateByExample(CompanyQueryConfig record, CompanyQueryConfigExample example);

    int updateByPrimaryKeySelective(CompanyQueryConfig record);

    int updateByPrimaryKey(CompanyQueryConfig record);

	ListRange queryConfigList(CompanyQueryConfig record, Integer currentPage, Integer pageRows);
}
