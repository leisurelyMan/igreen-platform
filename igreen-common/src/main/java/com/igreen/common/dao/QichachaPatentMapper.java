package com.igreen.common.dao;

import com.igreen.common.model.QichachaPatent;
import com.igreen.common.model.QichachaPatentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QichachaPatentMapper {
	
    int countByExample(QichachaPatentExample example);

    int deleteByExample(QichachaPatentExample example);

    int deleteByPrimaryKey(String id);

    int insert(QichachaPatent record);

    int insertSelective(QichachaPatent record);

    List<QichachaPatent> selectByExample(QichachaPatentExample example);

    QichachaPatent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") QichachaPatent record, @Param("example") QichachaPatentExample example);

    int updateByExample(@Param("record") QichachaPatent record, @Param("example") QichachaPatentExample example);

    int updateByPrimaryKeySelective(QichachaPatent record);

    int updateByPrimaryKey(QichachaPatent record);

    List<QichachaPatent> selectByKeyNo(String keyNo);
}