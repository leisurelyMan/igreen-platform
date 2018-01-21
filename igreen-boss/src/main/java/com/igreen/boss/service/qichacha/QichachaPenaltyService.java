package com.igreen.boss.service.qichacha;

import java.util.List;

import com.igreen.common.model.QichachaPenalty;
import com.igreen.common.model.QichachaPenaltyExample;
import com.igreen.common.model.QichachaPenaltyWithBLOBs;
import com.igreen.common.util.ListRange;

public interface QichachaPenaltyService {

    int countByExample(QichachaPenaltyExample example);

    int deleteByExample(QichachaPenaltyExample example);

    int deleteByPrimaryKey(String id);

    int insert(QichachaPenaltyWithBLOBs record);

    int insertSelective(QichachaPenaltyWithBLOBs record);

    List<QichachaPenaltyWithBLOBs> selectByExampleWithBLOBs(QichachaPenaltyExample example);

    List<QichachaPenalty> selectByExample(QichachaPenaltyExample example);

    QichachaPenaltyWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(QichachaPenaltyWithBLOBs record, QichachaPenaltyExample example);

    int updateByExampleWithBLOBs(QichachaPenaltyWithBLOBs record, QichachaPenaltyExample example);

    int updateByExample(QichachaPenalty record,QichachaPenaltyExample example);

    int updateByPrimaryKeySelective(QichachaPenaltyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QichachaPenaltyWithBLOBs record);

    int updateByPrimaryKey(QichachaPenalty record);

	ListRange penaltyList(QichachaPenalty record, Integer currentPage, Integer pageRows);
    
}
