package com.igreen.common.dao;

import com.igreen.common.model.QichachaCompanyBase;
import com.igreen.common.model.QichachaCompanyBaseExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface QichachaCompanyBaseMapper {
	
    int countByExample(QichachaCompanyBaseExample example);

    int deleteByExample(QichachaCompanyBaseExample example);

    int deleteByPrimaryKey(String keyNo);

    int insert(QichachaCompanyBase record);

    int insertSelective(QichachaCompanyBase record);

    List<QichachaCompanyBase> selectByExampleWithBLOBs(QichachaCompanyBaseExample example);

    List<QichachaCompanyBase> selectByExample(QichachaCompanyBaseExample example);

    QichachaCompanyBase selectByPrimaryKey(String keyNo);

    int updateByExampleSelective(@Param("record") QichachaCompanyBase record, @Param("example") QichachaCompanyBaseExample example);

    int updateByExampleWithBLOBs(@Param("record") QichachaCompanyBase record, @Param("example") QichachaCompanyBaseExample example);

    int updateByExample(@Param("record") QichachaCompanyBase record, @Param("example") QichachaCompanyBaseExample example);

    int updateByPrimaryKeySelective(QichachaCompanyBase record);

    int updateByPrimaryKeyWithBLOBs(QichachaCompanyBase record);

    int updateByPrimaryKey(QichachaCompanyBase record);

    List<QichachaCompanyBase> selectByCompanyNameAndStatus(Map<String, Object> map);
}