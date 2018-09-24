package com.igreen.common.dao;

import com.igreen.common.model.*;

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

    List<CompanyQueryDetail> selectByParam(CompanyQueryDetail example);

    int updateByPrimaryKey(CompanyQueryDetail record);

    List<CompanyQueryBase> selectCompanyBaseByConfigId(Integer configid);

    List<CompanyMonitorTemp> selectJudgementsCountByConfigId(Integer configid);

    List<CompanyMonitorTemp> selectPatentCountByConfigId(Integer configid);

    List<CompanyMonitorTemp> selectCompaniesCountByConfigId(Integer configid);

    List<CompanyMonitorTemp> selectExecutionRecordsCountByConfigId(Integer configid);

    List<CompanyMonitorReportTemp> getRegistIndustry(Integer configid);

    List<CompanyMonitorReportTemp> getRegistProvince(Integer configid);
}