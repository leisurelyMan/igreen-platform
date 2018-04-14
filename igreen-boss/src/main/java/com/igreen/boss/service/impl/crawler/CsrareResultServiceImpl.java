package com.igreen.boss.service.impl.crawler;

import com.igreen.boss.service.crawler.CrawlerResultService;
import com.igreen.boss.service.crawler.CsrareResultService;
import com.igreen.boss.util.FileUtil;
import com.igreen.common.dao.CrawlerResultMapper;
import com.igreen.common.dao.CsrareResultMapper;
import com.igreen.common.model.WebCrawlerResult;
import com.igreen.common.model.WebCsrcareResult;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class CsrareResultServiceImpl implements CsrareResultService {
	
	private static final Logger log = Logger.getLogger(CsrareResultServiceImpl.class);
	
	@Resource
    private CsrareResultMapper resultMapper;
	
	@Override
	public ListRange resultList(WebCsrcareResult webResult, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(webResult.getWebName())){
			params.put("webName", webResult.getWebName());
		}
		if(!StrUtil.isNull(webResult.getWebDetailName())){
			params.put("webDetailName", webResult.getWebDetailName());
		}

		if(!StrUtil.isNull(webResult.getEffectStatus())){
			params.put("effectStatus", webResult.getEffectStatus());
		}
		if(!StrUtil.isNull(webResult.getApplicationArea())){
			params.put("applicationArea", webResult.getApplicationArea());
		}
		if(!StrUtil.isNull(webResult.getAttachType())){
			params.put("attachType", webResult.getAttachType());
		}
		if(!StrUtil.isNull(webResult.getEffectStartDate())){
			params.put("effectStartDate", webResult.getEffectStartDate());
		}
		if(!StrUtil.isNull(webResult.getEffectEndDate())){
			params.put("effectEndDate", webResult.getEffectEndDate());
		}
		if(!StrUtil.isNull(webResult.getPublishStartDate())){
			params.put("publishStartDate", webResult.getPublishStartDate());
		}
		if(!StrUtil.isNull(webResult.getPublishEndDate())){
			params.put("publishEndDate", webResult.getPublishEndDate());
		}

		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(resultMapper.pageCsrareResult(params), resultMapper.countCsrareResult(params), currentPage, pageRows);
		return result;
	}


	@Override
	public ResponseModel addOrEditResult(WebCsrcareResult webResult, Integer userId){
		try {

			WebCsrcareResult config = resultMapper.findByDetailUrl(webResult.getWebDetailUrl());
			if(config != null && webResult.getId() != config.getId()) {
				return new ResponseModel(-1, "该网站已经配置，无需重复配置");
			}

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
	public WebCsrcareResult getWebCsrcareResultById(Integer configId) {
		WebCsrcareResult crawler = resultMapper.selectByPrimaryKey( configId);
		crawler.setContent(FileUtil.readFile(crawler.getSavePath()));
		return crawler;
	}

}
