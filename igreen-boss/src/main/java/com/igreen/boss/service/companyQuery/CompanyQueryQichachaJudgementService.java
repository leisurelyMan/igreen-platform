package com.igreen.boss.service.companyQuery;

import java.util.List;

import com.igreen.common.model.CompanyQueryQichachaJudgement;
import com.igreen.common.model.CompanyQueryQichachaJudgementExample;

public interface CompanyQueryQichachaJudgementService {
    int countByExample(CompanyQueryQichachaJudgementExample example);

    int deleteByExample(CompanyQueryQichachaJudgementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyQueryQichachaJudgement record);

    int insertSelective(CompanyQueryQichachaJudgement record);

    List<CompanyQueryQichachaJudgement> selectByExampleWithBLOBs(CompanyQueryQichachaJudgementExample example);

    List<CompanyQueryQichachaJudgement> selectByExample(CompanyQueryQichachaJudgementExample example);

    CompanyQueryQichachaJudgement selectByPrimaryKey(Long id);

    int updateByExampleSelective(CompanyQueryQichachaJudgement record, CompanyQueryQichachaJudgementExample example);

    int updateByExampleWithBLOBs(CompanyQueryQichachaJudgement record, CompanyQueryQichachaJudgementExample example);

    int updateByExample(CompanyQueryQichachaJudgement record, CompanyQueryQichachaJudgementExample example);

    int updateByPrimaryKeySelective(CompanyQueryQichachaJudgement record);

    int updateByPrimaryKeyWithBLOBs(CompanyQueryQichachaJudgement record);

    int updateByPrimaryKey(CompanyQueryQichachaJudgement record);
}
