package com.igreen.boss.service.companyQuery;

import java.util.List;

import com.igreen.common.model.CompanyQueryMonitorCompany;
import com.igreen.common.model.CompanyQueryMonitorCompanyExample;

public interface CompanyQueryMonitorCompanyService {
    int countByExample(CompanyQueryMonitorCompanyExample example);

    int deleteByExample(CompanyQueryMonitorCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyQueryMonitorCompany record);

    int insertSelective(CompanyQueryMonitorCompany record);

    List<CompanyQueryMonitorCompany> selectByExample(CompanyQueryMonitorCompanyExample example);

    CompanyQueryMonitorCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(CompanyQueryMonitorCompany record, CompanyQueryMonitorCompanyExample example);

    int updateByExample(CompanyQueryMonitorCompany record, CompanyQueryMonitorCompanyExample example);

    int updateByPrimaryKeySelective(CompanyQueryMonitorCompany record);

    int updateByPrimaryKey(CompanyQueryMonitorCompany record);
}
