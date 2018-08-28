package com.igreen.boss.service.companyQuery;

import java.util.List;

import com.igreen.boss.dto.CompanyQueryConfigDto;
import com.igreen.common.model.CompanyQueryDetail;
import com.igreen.common.model.CompanyQueryDetailExample;

public interface CompanyQueryDetailService {

    int countByExample(CompanyQueryDetailExample example);

    int deleteByExample(CompanyQueryDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyQueryDetail record);

    int insertSelective(CompanyQueryDetail record);

    List<CompanyQueryDetail> selectByExample(CompanyQueryDetailExample example);

    CompanyQueryDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(CompanyQueryDetail record, CompanyQueryDetailExample example);

    int updateByExample(CompanyQueryDetail record, CompanyQueryDetailExample example);

    int updateByPrimaryKeySelective(CompanyQueryDetail record);

    int updateByPrimaryKey(CompanyQueryDetail record);
    
    void addDetails(List<CompanyQueryDetail> details);
}
