package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.Invite;

public interface InviteMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Invite record);

    int insertSelective(Invite record);

    Invite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Invite record);

    int updateByPrimaryKey(Invite record);

	List<Invite> pageInvite(Map<String, Object> params);

	Integer countInvite(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<Invite> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}