package com.igreen.common.dao;

import com.igreen.common.model.CompanyQueryQichachaJudgement;
import com.igreen.common.model.CompanyQueryQichachaJudgementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyQueryQichachaJudgementMapper {
    int countByExample(CompanyQueryQichachaJudgementExample example);

    int deleteByExample(CompanyQueryQichachaJudgementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyQueryQichachaJudgement record);

    int insertSelective(CompanyQueryQichachaJudgement record);

    List<CompanyQueryQichachaJudgement> selectByExampleWithBLOBs(CompanyQueryQichachaJudgementExample example);

    List<CompanyQueryQichachaJudgement> selectByExample(CompanyQueryQichachaJudgementExample example);

    CompanyQueryQichachaJudgement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyQueryQichachaJudgement record, @Param("example") CompanyQueryQichachaJudgementExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyQueryQichachaJudgement record, @Param("example") CompanyQueryQichachaJudgementExample example);

    int updateByExample(@Param("record") CompanyQueryQichachaJudgement record, @Param("example") CompanyQueryQichachaJudgementExample example);

    int updateByPrimaryKeySelective(CompanyQueryQichachaJudgement record);

    int updateByPrimaryKeyWithBLOBs(CompanyQueryQichachaJudgement record);

    int updateByPrimaryKey(CompanyQueryQichachaJudgement record);
}