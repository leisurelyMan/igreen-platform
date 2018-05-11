package com.igreen.common.dao;

import com.igreen.common.model.ExcelEnvironmentalPollutionLiabilityInsurance;
import com.igreen.common.model.ExcelEnvironmentalPollutionLiabilityInsuranceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelEnvironmentalPollutionLiabilityInsuranceMapper {
	
    int countByExample(ExcelEnvironmentalPollutionLiabilityInsuranceExample example);

    int deleteByExample(ExcelEnvironmentalPollutionLiabilityInsuranceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExcelEnvironmentalPollutionLiabilityInsurance record);

    int insertSelective(ExcelEnvironmentalPollutionLiabilityInsurance record);

    List<ExcelEnvironmentalPollutionLiabilityInsurance> selectByExample(ExcelEnvironmentalPollutionLiabilityInsuranceExample example);

    ExcelEnvironmentalPollutionLiabilityInsurance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExcelEnvironmentalPollutionLiabilityInsurance record, @Param("example") ExcelEnvironmentalPollutionLiabilityInsuranceExample example);

    int updateByExample(@Param("record") ExcelEnvironmentalPollutionLiabilityInsurance record, @Param("example") ExcelEnvironmentalPollutionLiabilityInsuranceExample example);

    int updateByPrimaryKeySelective(ExcelEnvironmentalPollutionLiabilityInsurance record);

    int updateByPrimaryKey(ExcelEnvironmentalPollutionLiabilityInsurance record);
}