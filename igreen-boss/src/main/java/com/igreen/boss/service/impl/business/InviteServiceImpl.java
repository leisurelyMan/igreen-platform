package com.igreen.boss.service.impl.business;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.business.InviteService;
import com.igreen.common.dao.InviteMapper;
import com.igreen.common.model.Invite;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class InviteServiceImpl implements InviteService {
	
	Logger log = Logger.getLogger(InviteServiceImpl.class);
	
	@Resource
	InviteMapper inviteMapper;

	@Override
	public ResponseModel addInvite(Invite invite, Integer userId) {
		try{
			if(StrUtil.isNull(invite.getId())){
				invite.setStatus(1);
				invite.setCreater(userId);
				invite.setCreatedTime(new Date());
				inviteMapper.insertSelective(invite);
			}
			else{
				invite.setUpdater(userId);
				invite.setUpdatedTime(new Date());
				inviteMapper.updateByPrimaryKeySelective(invite);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public Invite getOneInvite(Integer inviteId) {
		return inviteMapper.selectByPrimaryKey(inviteId);
	}

	@Override
	public ListRange inviteList(Invite invite, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(invite.getRegistItemId()))
			params.put("registItemId", invite.getRegistItemId()); 
		if(!StrUtil.isNull(invite.getJob()))
			params.put("job", invite.getJob()); 
		if(!StrUtil.isNull(invite.getAddress()))
			params.put("address", invite.getAddress());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(inviteMapper.pageInvite(params),
				inviteMapper.countInvite(params), currentPage, pageRows);
		return result;
	}

}
