package com.igreen.boss.service.qichacha;

import java.util.List;

import com.igreen.common.model.QichachaPatent;
import com.igreen.common.model.QichachaPatentExample;
import com.igreen.common.util.ListRange;

public interface QichachaPatentService {

    int countByExample(QichachaPatentExample example);

    int deleteByExample(QichachaPatentExample example);

    int deleteByPrimaryKey(String id);

    int insert(QichachaPatent record);

    int insertSelective(QichachaPatent record);

    List<QichachaPatent> selectByExample(QichachaPatentExample example);

    QichachaPatent selectByPrimaryKey(String id);

    int updateByExampleSelective(QichachaPatent record, QichachaPatentExample example);

    int updateByExample(QichachaPatent record, QichachaPatentExample example);

    int updateByPrimaryKeySelective(QichachaPatent record);

    int updateByPrimaryKey(QichachaPatent record);

	ListRange patentList(QichachaPatent record, Integer currentPage, Integer pageRows);
}
