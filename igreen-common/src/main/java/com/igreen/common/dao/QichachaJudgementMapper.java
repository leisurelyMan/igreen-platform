package com.igreen.common.dao;

import com.igreen.common.model.QichachaJudgement;
import com.igreen.common.model.QichachaJudgementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QichachaJudgementMapper {
	
    int countByExample(QichachaJudgementExample example);

    int deleteByExample(QichachaJudgementExample example);

    int deleteByPrimaryKey(String id);

    int insert(QichachaJudgement record);

    int insertSelective(QichachaJudgement record);

    List<QichachaJudgement> selectByExampleWithBLOBs(QichachaJudgementExample example);

    List<QichachaJudgement> selectByExample(QichachaJudgementExample example);

    QichachaJudgement selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") QichachaJudgement record, @Param("example") QichachaJudgementExample example);

    int updateByExampleWithBLOBs(@Param("record") QichachaJudgement record, @Param("example") QichachaJudgementExample example);

    int updateByExample(@Param("record") QichachaJudgement record, @Param("example") QichachaJudgementExample example);

    int updateByPrimaryKeySelective(QichachaJudgement record);

    int updateByPrimaryKeyWithBLOBs(QichachaJudgement record);

    int updateByPrimaryKey(QichachaJudgement record);

    List<QichachaJudgement> selectByKeyNo(String keyNo);
}