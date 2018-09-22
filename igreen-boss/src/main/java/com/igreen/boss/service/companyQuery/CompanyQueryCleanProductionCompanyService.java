package com.igreen.boss.service.companyQuery;

import java.util.List;

import com.igreen.common.model.CompanyQueryCleanProductionCompany;
import com.igreen.common.model.CompanyQueryCleanProductionCompanyExample;

public interface CompanyQueryCleanProductionCompanyService {
    int countByExample(CompanyQueryCleanProductionCompanyExample example);

    int deleteByExample(CompanyQueryCleanProductionCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyQueryCleanProductionCompany record);

    int insertSelective(CompanyQueryCleanProductionCompany record);

    List<CompanyQueryCleanProductionCompany> selectByExample(CompanyQueryCleanProductionCompanyExample example);

    CompanyQueryCleanProductionCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(CompanyQueryCleanProductionCompany record, CompanyQueryCleanProductionCompanyExample example);

    int updateByExample(CompanyQueryCleanProductionCompany record, CompanyQueryCleanProductionCompanyExample example);

    int updateByPrimaryKeySelective(CompanyQueryCleanProductionCompany record);

    int updateByPrimaryKey(CompanyQueryCleanProductionCompany record);
}
