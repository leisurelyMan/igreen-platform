package com.igreen.boss.service.excel;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.igreen.common.model.ExcelEnvironmentalPollutionLiabilityInsurance;
import com.igreen.common.model.ExcelEnvironmentalPollutionLiabilityInsuranceExample;
import com.igreen.common.util.ListRange;

public interface EnvironmentalPollutionLiabilityInsuranceService {

    int countByExample(ExcelEnvironmentalPollutionLiabilityInsuranceExample example);

    int deleteByExample(ExcelEnvironmentalPollutionLiabilityInsuranceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelEnvironmentalPollutionLiabilityInsurance record);

    int insertSelective(ExcelEnvironmentalPollutionLiabilityInsurance record);

    List<ExcelEnvironmentalPollutionLiabilityInsurance> selectByExample(ExcelEnvironmentalPollutionLiabilityInsuranceExample example);

    ExcelEnvironmentalPollutionLiabilityInsurance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(ExcelEnvironmentalPollutionLiabilityInsurance record, @Param("example") ExcelEnvironmentalPollutionLiabilityInsuranceExample example);

    int updateByExample(ExcelEnvironmentalPollutionLiabilityInsurance record, @Param("example") ExcelEnvironmentalPollutionLiabilityInsuranceExample example);

    int updateByPrimaryKeySelective(ExcelEnvironmentalPollutionLiabilityInsurance record);

    int updateByPrimaryKey(ExcelEnvironmentalPollutionLiabilityInsurance record);
    
    public ListRange list(ExcelEnvironmentalPollutionLiabilityInsurance record, Integer currentPage, Integer pageRows);
}
