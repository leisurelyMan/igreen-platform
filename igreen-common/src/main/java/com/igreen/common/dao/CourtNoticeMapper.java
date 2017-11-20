package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.CourtNotice;

public interface CourtNoticeMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(CourtNotice record);

    int insertSelective(CourtNotice record);

    CourtNotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourtNotice record);

    int updateByPrimaryKey(CourtNotice record);

	Integer countCourtNotice(Map<String, Object> params);

	List<CourtNotice> pageCourtNotice(Map<String, Object> params);

	int deleteByRegistItemId(Integer registItemId);
	
	List<CourtNotice> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}