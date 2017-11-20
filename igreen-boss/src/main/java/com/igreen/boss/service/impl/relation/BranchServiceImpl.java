package com.igreen.boss.service.impl.relation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.relation.BranchService;
import com.igreen.common.dao.BranchMapper;
import com.igreen.common.model.Branch;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class BranchServiceImpl implements BranchService {
	
	Logger log = Logger.getLogger(BranchServiceImpl.class);
	
	@Resource
	BranchMapper branchMapper;

	@Override
	public ResponseModel addBranch(Branch branch, Integer userId) {
		try{
			if(StrUtil.isNull(branch.getId())){
				branch.setStatus(1);
				branch.setCreater(userId);
				branch.setCreatedTime(new Date());
				branchMapper.insertSelective(branch);
			}
			else{
				branch.setUpdater(userId);
				branch.setUpdatedTime(new Date());
				branchMapper.updateByPrimaryKeySelective(branch);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public Branch getOneBranch(Integer branchId) {
		return branchMapper.selectByPrimaryKey(branchId);
	}

	@Override
	public ListRange branchList(Branch branch, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(branch.getRegistItemId()))
			params.put("registItemId", branch.getRegistItemId()); 
		if(!StrUtil.isNull(branch.getBranchName()))
			params.put("branchName", branch.getBranchName()); 
		if(!StrUtil.isNull(branch.getBranchRegistNo()))
			params.put("branchRegistNo", branch.getBranchRegistNo());
		if(!StrUtil.isNull(branch.getPrincipal()))
			params.put("principal", branch.getPrincipal());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(branchMapper.pageBranch(params), 
				branchMapper.countBranch(params), currentPage, pageRows);
		return result;
	}

}
