package com.igreen.common.dao;

import com.igreen.common.model.QichachaPenalty;
import com.igreen.common.model.QichachaPenaltyExample;
import com.igreen.common.model.QichachaPenaltyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QichachaPenaltyMapper {
	
    int countByExample(QichachaPenaltyExample example);

    int deleteByExample(QichachaPenaltyExample example);

    int deleteByPrimaryKey(String id);

    int insert(QichachaPenaltyWithBLOBs record);

    int insertSelective(QichachaPenaltyWithBLOBs record);

    List<QichachaPenaltyWithBLOBs> selectByExampleWithBLOBs(QichachaPenaltyExample example);

    List<QichachaPenalty> selectByExample(QichachaPenaltyExample example);

    QichachaPenaltyWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") QichachaPenaltyWithBLOBs record, @Param("example") QichachaPenaltyExample example);

    int updateByExampleWithBLOBs(@Param("record") QichachaPenaltyWithBLOBs record, @Param("example") QichachaPenaltyExample example);

    int updateByExample(@Param("record") QichachaPenalty record, @Param("example") QichachaPenaltyExample example);

    int updateByPrimaryKeySelective(QichachaPenaltyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QichachaPenaltyWithBLOBs record);

    int updateByPrimaryKey(QichachaPenalty record);
}