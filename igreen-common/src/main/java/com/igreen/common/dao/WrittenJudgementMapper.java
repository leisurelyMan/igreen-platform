package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.WrittenJudgement;

public interface WrittenJudgementMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(WrittenJudgement record);

    int insertSelective(WrittenJudgement record);

    WrittenJudgement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WrittenJudgement record);

    int updateByPrimaryKey(WrittenJudgement record);

	List<WrittenJudgement> pageWrittenJudgement(Map<String, Object> params);

	Integer countWrittenJudgement(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<WrittenJudgement> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}