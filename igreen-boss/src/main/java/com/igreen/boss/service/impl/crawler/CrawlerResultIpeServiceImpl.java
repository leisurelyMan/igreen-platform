package com.igreen.boss.service.impl.crawler;

import com.igreen.boss.service.crawler.CrawlerResultIpeService;
import com.igreen.boss.util.FileUtil;
import com.igreen.common.dao.CrawlerIpeIndustryRecordManualMapper;
import com.igreen.common.dao.CrawlerIpeIndustryRecordMapper;
import com.igreen.common.dao.CrawlerResultIpeMapper;
import com.igreen.common.dao.CrawlerResultMapper;
import com.igreen.common.model.CrawlerIpeIndustryRecord;
import com.igreen.common.model.WebCrawlerResult;
import com.igreen.common.model.WebCrawlerResultIpe;
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
public class CrawlerResultIpeServiceImpl implements CrawlerResultIpeService {
	
	private static final Logger log = Logger.getLogger(CrawlerResultIpeServiceImpl.class);
	
	@Resource
    private CrawlerIpeIndustryRecordMapper resultMapper;


	@Resource
	CrawlerIpeIndustryRecordManualMapper industryRecordManualMapper;
	
	@Override
	public ListRange resultList(CrawlerIpeIndustryRecord webResult, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(webResult.getWebName())){
			params.put("webName", webResult.getWebName());
		}
		if(!StrUtil.isNull(webResult.getWebDetailName())){
			params.put("webDetailName", webResult.getWebDetailName());
		}

		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(industryRecordManualMapper.pageCrawlerResult(params), industryRecordManualMapper.countCrawlerResult(params), currentPage, pageRows);
		return result;
	}


	@Override
	public ResponseModel addOrEditResult(CrawlerIpeIndustryRecord webResult, Integer userId){
		try {

			CrawlerIpeIndustryRecord config = industryRecordManualMapper.findByDetailUrl(webResult.getWebDetailUrl());
			if(config != null && webResult.getId() != config.getId())
				return new ResponseModel(-1, "该网站已经配置，无需重复配置");
			
			if(StrUtil.isNull(webResult.getId())){
				webResult.setCreater(userId);
				/*webResult。(new Date());
				webResult.setUpdatedTime(new Date());*/
				resultMapper.insert(webResult);
			}else{
				webResult.setUpdater(userId);
				/*webResult.setUpdatedTime(new Date());*/
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
	public CrawlerIpeIndustryRecord getWebCrawlerResultById(Integer configId) {
		CrawlerIpeIndustryRecord crawler = resultMapper.selectByPrimaryKey( configId);
		/*crawler.setContent(FileUtil.readFile(crawler.getSavePath()));*/
		return crawler;
	}

}
