package com.igreen.boss.service.impl.lawRisk;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.lawRisk.CourtNoticeService;
import com.igreen.common.dao.CourtNoticeMapper;
import com.igreen.common.model.CourtNotice;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class CourtNoticeServiceImpl implements CourtNoticeService {

	Logger log = Logger.getLogger(CourtNoticeServiceImpl.class);
	
	@Resource
	CourtNoticeMapper courtNoticeMapper;
	
	@Override
	public ResponseModel addCourtNotice(CourtNotice courtNotice, Integer userId) {
		try{
			if(StrUtil.isNull(courtNotice.getId())){
				courtNotice.setStatus(1);
				courtNotice.setCreater(userId);
				courtNotice.setCreatedTime(new Date());
				courtNoticeMapper.insertSelective(courtNotice);
			}
			else{
				courtNotice.setUpdater(userId);
				courtNotice.setUpdatedTime(new Date());
				courtNoticeMapper.updateByPrimaryKeySelective(courtNotice);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public CourtNotice getOneCourtNotice(Integer courtNoticeId) {
		return courtNoticeMapper.selectByPrimaryKey(courtNoticeId);
	}

	@Override
	public ListRange courtNoticeList(CourtNotice courtNotice, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(courtNotice.getRegistItemId()))
			params.put("registItemId", courtNotice.getRegistItemId()); 
		if(!StrUtil.isNull(courtNotice.getNoticeType()))
			params.put("noticeType", courtNotice.getNoticeType());
		if(!StrUtil.isNull(courtNotice.getCourt()))
			params.put("court", courtNotice.getCourt());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(courtNoticeMapper.pageCourtNotice(params), courtNoticeMapper.countCourtNotice(params), currentPage, pageRows);
		return result;
	}

}
