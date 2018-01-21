package com.igreen.boss.service.qichacha;

import java.util.List;

import com.igreen.common.model.QichachaJudgement;
import com.igreen.common.model.QichachaJudgementExample;
import com.igreen.common.util.ListRange;

public interface QichachaJudgementService {

    int countByExample(QichachaJudgementExample example);

    int deleteByExample(QichachaJudgementExample example);

    int deleteByPrimaryKey(String id);

    int insert(QichachaJudgement record);

    int insertSelective(QichachaJudgement record);

    List<QichachaJudgement> selectByExampleWithBLOBs(QichachaJudgementExample example);

    List<QichachaJudgement> selectByExample(QichachaJudgementExample example);

    QichachaJudgement selectByPrimaryKey(String id);

    int updateByExampleSelective(QichachaJudgement record,  QichachaJudgementExample example);

    int updateByExampleWithBLOBs(QichachaJudgement record, QichachaJudgementExample example);

    int updateByExample( QichachaJudgement record, QichachaJudgementExample example);

    int updateByPrimaryKeySelective(QichachaJudgement record);

    int updateByPrimaryKeyWithBLOBs(QichachaJudgement record);

    int updateByPrimaryKey(QichachaJudgement record);

	ListRange judgementList(QichachaJudgement record, Integer currentPage, Integer pageRows);
}
