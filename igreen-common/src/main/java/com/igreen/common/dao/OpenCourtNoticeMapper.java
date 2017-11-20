package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.OpenCourtNotice;

public interface OpenCourtNoticeMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(OpenCourtNotice record);

    int insertSelective(OpenCourtNotice record);

    OpenCourtNotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpenCourtNotice record);

    int updateByPrimaryKey(OpenCourtNotice record);

	Integer countOpenCourtNotice(Map<String, Object> params);

	List<OpenCourtNotice> pageOpenCourtNotice(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<OpenCourtNotice> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}