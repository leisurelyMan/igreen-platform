package com.igreen.common.dao;

import com.igreen.common.model.IpeElasticsearch;
import com.igreen.common.model.IpeElasticsearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpeElasticsearchMapper {
    int countByExample(IpeElasticsearchExample example);

    int deleteByExample(IpeElasticsearchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IpeElasticsearch record);

    int insertSelective(IpeElasticsearch record);

    List<IpeElasticsearch> selectByExample(IpeElasticsearchExample example);

    IpeElasticsearch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IpeElasticsearch record, @Param("example") IpeElasticsearchExample example);

    int updateByExample(@Param("record") IpeElasticsearch record, @Param("example") IpeElasticsearchExample example);

    int updateByPrimaryKeySelective(IpeElasticsearch record);

    int updateByPrimaryKey(IpeElasticsearch record);
	
	int selectMaxIpeId();
}