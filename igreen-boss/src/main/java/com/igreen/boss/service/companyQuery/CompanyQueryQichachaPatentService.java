package com.igreen.boss.service.companyQuery;

import java.util.List;

import com.igreen.common.model.CompanyQueryQichachaPatent;
import com.igreen.common.model.CompanyQueryQichachaPatentExample;

public interface CompanyQueryQichachaPatentService {
    int countByExample(CompanyQueryQichachaPatentExample example);

    int deleteByExample(CompanyQueryQichachaPatentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyQueryQichachaPatent record);

    int insertSelective(CompanyQueryQichachaPatent record);

    List<CompanyQueryQichachaPatent> selectByExample(CompanyQueryQichachaPatentExample example);

    CompanyQueryQichachaPatent selectByPrimaryKey(Long id);

    int updateByExampleSelective(CompanyQueryQichachaPatent record, CompanyQueryQichachaPatentExample example);

    int updateByExample(CompanyQueryQichachaPatent record, CompanyQueryQichachaPatentExample example);

    int updateByPrimaryKeySelective(CompanyQueryQichachaPatent record);

    int updateByPrimaryKey(CompanyQueryQichachaPatent record);
}
