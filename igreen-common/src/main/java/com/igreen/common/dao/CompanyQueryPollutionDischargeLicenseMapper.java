package com.igreen.common.dao;

import com.igreen.common.model.CompanyQueryPollutionDischargeLicense;
import com.igreen.common.model.CompanyQueryPollutionDischargeLicenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyQueryPollutionDischargeLicenseMapper {
    int countByExample(CompanyQueryPollutionDischargeLicenseExample example);

    int deleteByExample(CompanyQueryPollutionDischargeLicenseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyQueryPollutionDischargeLicense record);

    int insertSelective(CompanyQueryPollutionDischargeLicense record);

    List<CompanyQueryPollutionDischargeLicense> selectByExample(CompanyQueryPollutionDischargeLicenseExample example);

    CompanyQueryPollutionDischargeLicense selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyQueryPollutionDischargeLicense record, @Param("example") CompanyQueryPollutionDischargeLicenseExample example);

    int updateByExample(@Param("record") CompanyQueryPollutionDischargeLicense record, @Param("example") CompanyQueryPollutionDischargeLicenseExample example);

    int updateByPrimaryKeySelective(CompanyQueryPollutionDischargeLicense record);

    int updateByPrimaryKey(CompanyQueryPollutionDischargeLicense record);
}