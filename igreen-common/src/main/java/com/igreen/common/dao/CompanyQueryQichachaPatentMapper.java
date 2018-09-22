package com.igreen.common.dao;

import com.igreen.common.model.CompanyQueryQichachaPatent;
import com.igreen.common.model.CompanyQueryQichachaPatentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyQueryQichachaPatentMapper {
    int countByExample(CompanyQueryQichachaPatentExample example);

    int deleteByExample(CompanyQueryQichachaPatentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyQueryQichachaPatent record);

    int insertSelective(CompanyQueryQichachaPatent record);

    List<CompanyQueryQichachaPatent> selectByExample(CompanyQueryQichachaPatentExample example);

    CompanyQueryQichachaPatent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyQueryQichachaPatent record, @Param("example") CompanyQueryQichachaPatentExample example);

    int updateByExample(@Param("record") CompanyQueryQichachaPatent record, @Param("example") CompanyQueryQichachaPatentExample example);

    int updateByPrimaryKeySelective(CompanyQueryQichachaPatent record);

    int updateByPrimaryKey(CompanyQueryQichachaPatent record);
}