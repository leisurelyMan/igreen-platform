package com.igreen.boss.service.qichacha;

import java.util.List;

import com.igreen.boss.dto.QichachaCompanyBaseDto;
import com.igreen.common.model.QichachaCompanyBase;
import com.igreen.common.model.QichachaCompanyBaseExample;
import com.igreen.common.util.ListRange;

public interface QichachaCompanyBaseService {

    int countByExample(QichachaCompanyBaseExample example);

    int deleteByExample(QichachaCompanyBaseExample example);

    int deleteByPrimaryKey(String keyNo);

    int insert(QichachaCompanyBase record);

    int insertSelective(QichachaCompanyBase record);

    List<QichachaCompanyBase> selectByExampleWithBLOBs(QichachaCompanyBaseExample example);

    List<QichachaCompanyBase> selectByExample(QichachaCompanyBaseExample example);

    QichachaCompanyBase selectByPrimaryKey(String keyNo);

    int updateByExampleSelective(QichachaCompanyBase record, QichachaCompanyBaseExample example);

    int updateByExampleWithBLOBs(QichachaCompanyBase record, QichachaCompanyBaseExample example);

    int updateByExample(QichachaCompanyBase record, QichachaCompanyBaseExample example);

    int updateByPrimaryKeySelective(QichachaCompanyBase record);

    int updateByPrimaryKeyWithBLOBs(QichachaCompanyBase record);

    int updateByPrimaryKey(QichachaCompanyBase record);
    
    public ListRange companybaseList(QichachaCompanyBaseDto record, Integer currentPage, Integer pageRows);
}
