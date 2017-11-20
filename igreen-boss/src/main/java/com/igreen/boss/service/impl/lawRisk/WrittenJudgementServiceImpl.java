package com.igreen.boss.service.impl.lawRisk;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.lawRisk.WrittenJudgementService;
import com.igreen.common.dao.WrittenJudgementMapper;
import com.igreen.common.model.WrittenJudgement;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class WrittenJudgementServiceImpl implements WrittenJudgementService {
	
	Logger log = Logger.getLogger(WrittenJudgementServiceImpl.class);
	
	@Resource
	WrittenJudgementMapper writtenJudgementMapper;

	@Override
	public ResponseModel addWrittenJudgement(WrittenJudgement writtenJudgement, Integer userId) {
		try{
			if(StrUtil.isNull(writtenJudgement.getId())){
				writtenJudgement.setStatus(1);
				writtenJudgement.setCreater(userId);
				writtenJudgement.setCreatedTime(new Date());
				writtenJudgementMapper.insertSelective(writtenJudgement);
			}
			else{
				writtenJudgement.setUpdater(userId);
				writtenJudgement.setUpdatedTime(new Date());
				writtenJudgementMapper.updateByPrimaryKeySelective(writtenJudgement);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public WrittenJudgement getOneWrittenJudgement(Integer judgementId) {
		return writtenJudgementMapper.selectByPrimaryKey(judgementId);
	}

	@Override
	public ListRange writtenJudgementList(WrittenJudgement writtenJudgement, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(writtenJudgement.getRegistItemId()))
			params.put("registItemId", writtenJudgement.getRegistItemId()); 
		if(!StrUtil.isNull(writtenJudgement.getCaseTitle()))
			params.put("caseTitle", writtenJudgement.getCaseTitle());
		if(!StrUtil.isNull(writtenJudgement.getCaseType()))
			params.put("caseType", writtenJudgement.getCaseType());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(writtenJudgementMapper.pageWrittenJudgement(params), writtenJudgementMapper.countWrittenJudgement(params), currentPage, pageRows);
		return result;
	}

}
