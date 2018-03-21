package com.igreen.boss.service.impl.crawler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import com.igreen.boss.service.crawler.CrawlerResultService;
import com.igreen.common.dao.CrawlerResultMapper;
import com.igreen.common.model.WebCrawlerResult;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class CrawlerResultServiceImpl implements CrawlerResultService{
	
	private static final Logger log = Logger.getLogger(CrawlerResultServiceImpl.class);
	
	@Resource
    private CrawlerResultMapper resultMapper;
	
	@Override
	public ListRange resultList(WebCrawlerResult webResult, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(webResult.getWebName())){
			params.put("webName", webResult.getWebName());
		}
		if(!StrUtil.isNull(webResult.getWebDetailName())){
			params.put("webDetailName", webResult.getWebDetailName());
		}

		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(resultMapper.pageCrawlerResult(params), resultMapper.countCrawlerResult(params), currentPage, pageRows);
		return result;
	}


	@Override
	public ResponseModel addOrEditResult(WebCrawlerResult webResult, Integer userId){
		try {
			
			WebCrawlerResult config = resultMapper.findByDetailUrl(webResult.getWebDetailUrl());
			if(config != null && webResult.getId() != config.getId())
				return new ResponseModel(-1, "该网站已经配置，无需重复配置");
			
			if(StrUtil.isNull(webResult.getId())){
				webResult.setCreater(userId);
				webResult.setCreatedTime(new Date());
				webResult.setUpdatedTime(new Date());
				resultMapper.insert(webResult);
			}else{
				webResult.setUpdater(userId);
				webResult.setUpdatedTime(new Date());
				resultMapper.updateByPrimaryKey(webResult);
			}
			
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}

	}

	@Override
	public ResponseModel delResult(Integer configId) {
		int i = resultMapper.deleteByPrimaryKey(configId);
		if(i > 0){
			return new ResponseModel(1, "SUCCESS");
		}
		return new ResponseModel(-1, "删除失败");
	}


	@Override
	public WebCrawlerResult getWebCrawlerResultById(Integer configId) {
		return resultMapper.selectByPrimaryKey( configId);
	}

}
