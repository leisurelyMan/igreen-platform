package com.igreen.common.dao;

import com.igreen.common.model.CompanyQueryMonitorCompany;
import com.igreen.common.model.CompanyQueryMonitorCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyQueryMonitorCompanyMapper {
    int countByExample(CompanyQueryMonitorCompanyExample example);

    int deleteByExample(CompanyQueryMonitorCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyQueryMonitorCompany record);

    int insertSelective(CompanyQueryMonitorCompany record);

    List<CompanyQueryMonitorCompany> selectByExample(CompanyQueryMonitorCompanyExample example);

    CompanyQueryMonitorCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyQueryMonitorCompany record, @Param("example") CompanyQueryMonitorCompanyExample example);

    int updateByExample(@Param("record") CompanyQueryMonitorCompany record, @Param("example") CompanyQueryMonitorCompanyExample example);

    int updateByPrimaryKeySelective(CompanyQueryMonitorCompany record);

    int updateByPrimaryKey(CompanyQueryMonitorCompany record);
}