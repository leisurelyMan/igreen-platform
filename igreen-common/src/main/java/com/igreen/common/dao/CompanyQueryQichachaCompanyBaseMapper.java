package com.igreen.common.dao;

import com.igreen.common.model.CompanyQueryQichachaCompanyBase;
import com.igreen.common.model.CompanyQueryQichachaCompanyBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyQueryQichachaCompanyBaseMapper {
    int countByExample(CompanyQueryQichachaCompanyBaseExample example);

    int deleteByExample(CompanyQueryQichachaCompanyBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyQueryQichachaCompanyBase record);

    int insertSelective(CompanyQueryQichachaCompanyBase record);

    List<CompanyQueryQichachaCompanyBase> selectByExampleWithBLOBs(CompanyQueryQichachaCompanyBaseExample example);

    List<CompanyQueryQichachaCompanyBase> selectByExample(CompanyQueryQichachaCompanyBaseExample example);

    CompanyQueryQichachaCompanyBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyQueryQichachaCompanyBase record, @Param("example") CompanyQueryQichachaCompanyBaseExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyQueryQichachaCompanyBase record, @Param("example") CompanyQueryQichachaCompanyBaseExample example);

    int updateByExample(@Param("record") CompanyQueryQichachaCompanyBase record, @Param("example") CompanyQueryQichachaCompanyBaseExample example);

    int updateByPrimaryKeySelective(CompanyQueryQichachaCompanyBase record);

    int updateByPrimaryKeyWithBLOBs(CompanyQueryQichachaCompanyBase record);

    int updateByPrimaryKey(CompanyQueryQichachaCompanyBase record);
}