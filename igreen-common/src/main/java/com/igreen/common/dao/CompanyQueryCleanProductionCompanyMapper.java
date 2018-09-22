package com.igreen.common.dao;

import com.igreen.common.model.CompanyQueryCleanProductionCompany;
import com.igreen.common.model.CompanyQueryCleanProductionCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyQueryCleanProductionCompanyMapper {
    int countByExample(CompanyQueryCleanProductionCompanyExample example);

    int deleteByExample(CompanyQueryCleanProductionCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyQueryCleanProductionCompany record);

    int insertSelective(CompanyQueryCleanProductionCompany record);

    List<CompanyQueryCleanProductionCompany> selectByExample(CompanyQueryCleanProductionCompanyExample example);

    CompanyQueryCleanProductionCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyQueryCleanProductionCompany record, @Param("example") CompanyQueryCleanProductionCompanyExample example);

    int updateByExample(@Param("record") CompanyQueryCleanProductionCompany record, @Param("example") CompanyQueryCleanProductionCompanyExample example);

    int updateByPrimaryKeySelective(CompanyQueryCleanProductionCompany record);

    int updateByPrimaryKey(CompanyQueryCleanProductionCompany record);
}