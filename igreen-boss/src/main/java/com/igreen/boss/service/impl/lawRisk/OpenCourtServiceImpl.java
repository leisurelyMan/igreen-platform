package com.igreen.boss.service.impl.lawRisk;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.lawRisk.OpenCourtService;
import com.igreen.common.dao.OpenCourtNoticeMapper;
import com.igreen.common.model.OpenCourtNotice;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class OpenCourtServiceImpl implements OpenCourtService {
	
	Logger log = Logger.getLogger(OpenCourtServiceImpl.class);
	
	@Resource
	OpenCourtNoticeMapper openCourtNoticeMapper;

	@Override
	public ResponseModel addOpenCourtNotice(OpenCourtNotice courtNotice, Integer userId) {
		try{
			if(StrUtil.isNull(courtNotice.getId())){
				courtNotice.setStatus(1);
				courtNotice.setCreater(userId);
				courtNotice.setCreatedTime(new Date());
				openCourtNoticeMapper.insertSelective(courtNotice);
			}
			else{
				courtNotice.setUpdater(userId);
				courtNotice.setUpdatedTime(new Date());
				openCourtNoticeMapper.updateByPrimaryKeySelective(courtNotice);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public OpenCourtNotice getOneOpenCourtNotice(Integer courtNoticeId) {
		return openCourtNoticeMapper.selectByPrimaryKey(courtNoticeId);
	}

	@Override
	public ListRange courtNoticeList(OpenCourtNotice courtNotice, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(courtNotice.getRegistItemId()))
			params.put("registItemId", courtNotice.getRegistItemId()); 
		if(!StrUtil.isNull(courtNotice.getTitle()))
			params.put("title", courtNotice.getTitle());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(openCourtNoticeMapper.pageOpenCourtNotice(params), openCourtNoticeMapper.countOpenCourtNotice(params), currentPage, pageRows);
		return result;
	}

}
