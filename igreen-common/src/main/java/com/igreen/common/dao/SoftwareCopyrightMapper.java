package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.SoftwareCopyright;

public interface SoftwareCopyrightMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(SoftwareCopyright record);

    int insertSelective(SoftwareCopyright record);

    SoftwareCopyright selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SoftwareCopyright record);

    int updateByPrimaryKey(SoftwareCopyright record);

	List<SoftwareCopyright> pageSoftwareCopyright(Map<String, Object> params);

	Integer countSoftwareCopyright(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<SoftwareCopyright> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}