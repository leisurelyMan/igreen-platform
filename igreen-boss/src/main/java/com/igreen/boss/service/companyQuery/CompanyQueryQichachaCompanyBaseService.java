package com.igreen.boss.service.companyQuery;

import java.util.List;

import com.igreen.common.model.CompanyQueryQichachaCompanyBase;
import com.igreen.common.model.CompanyQueryQichachaCompanyBaseExample;

public interface CompanyQueryQichachaCompanyBaseService {

    int countByExample(CompanyQueryQichachaCompanyBaseExample example);

    int deleteByExample(CompanyQueryQichachaCompanyBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyQueryQichachaCompanyBase record);

    int insertSelective(CompanyQueryQichachaCompanyBase record);

    List<CompanyQueryQichachaCompanyBase> selectByExampleWithBLOBs(CompanyQueryQichachaCompanyBaseExample example);

    List<CompanyQueryQichachaCompanyBase> selectByExample(CompanyQueryQichachaCompanyBaseExample example);

    CompanyQueryQichachaCompanyBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(CompanyQueryQichachaCompanyBase record, CompanyQueryQichachaCompanyBaseExample example);

    int updateByExampleWithBLOBs(CompanyQueryQichachaCompanyBase record, CompanyQueryQichachaCompanyBaseExample example);

    int updateByExample(CompanyQueryQichachaCompanyBase record, CompanyQueryQichachaCompanyBaseExample example);

    int updateByPrimaryKeySelective(CompanyQueryQichachaCompanyBase record);

    int updateByPrimaryKeyWithBLOBs(CompanyQueryQichachaCompanyBase record);

    int updateByPrimaryKey(CompanyQueryQichachaCompanyBase record);
}
