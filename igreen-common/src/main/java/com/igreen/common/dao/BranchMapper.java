package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.Branch;

public interface BranchMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Branch record);

    int insertSelective(Branch record);

    Branch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Branch record);

    int updateByPrimaryKey(Branch record);

	List<Branch> pageBranch(Map<String, Object> params);

	Integer countBranch(Map<String, Object> params);

	int deleteByRegistItemId(Integer registItemId);
	
	List<Branch> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}