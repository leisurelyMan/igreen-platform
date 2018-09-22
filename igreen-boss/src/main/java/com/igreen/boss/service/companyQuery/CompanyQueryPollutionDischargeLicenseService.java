package com.igreen.boss.service.companyQuery;

import java.util.List;

import com.igreen.common.model.CompanyQueryPollutionDischargeLicense;
import com.igreen.common.model.CompanyQueryPollutionDischargeLicenseExample;

public interface CompanyQueryPollutionDischargeLicenseService {
    int countByExample(CompanyQueryPollutionDischargeLicenseExample example);

    int deleteByExample(CompanyQueryPollutionDischargeLicenseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyQueryPollutionDischargeLicense record);

    int insertSelective(CompanyQueryPollutionDischargeLicense record);

    List<CompanyQueryPollutionDischargeLicense> selectByExample(CompanyQueryPollutionDischargeLicenseExample example);

    CompanyQueryPollutionDischargeLicense selectByPrimaryKey(Long id);

    int updateByExampleSelective(CompanyQueryPollutionDischargeLicense record, CompanyQueryPollutionDischargeLicenseExample example);

    int updateByExample(CompanyQueryPollutionDischargeLicense record, CompanyQueryPollutionDischargeLicenseExample example);

    int updateByPrimaryKeySelective(CompanyQueryPollutionDischargeLicense record);

    int updateByPrimaryKey(CompanyQueryPollutionDischargeLicense record);
}
