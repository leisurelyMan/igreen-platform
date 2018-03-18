package com.igreen.boss.service.impl.crawler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import com.igreen.boss.service.crawler.CrawlerConfigService;
import com.igreen.common.dao.CrawlerConfigMapper;
import com.igreen.common.model.WebCrawlerConfig;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class CrawlerConfigServiceImpl implements CrawlerConfigService{
	
	private static final Logger log = Logger.getLogger(CrawlerConfigServiceImpl.class);
	
	@Resource
    private CrawlerConfigMapper configMapper;
	
	@Override
	public ListRange configList(WebCrawlerConfig crawlerConfig, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(crawlerConfig.getWebName()))
			params.put("webName", crawlerConfig.getWebName());
		
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(configMapper.pageCrawlerConfig(params), configMapper.countCrawlerConfig(params), currentPage, pageRows);
		return result;
	}


	@Override
	public ResponseModel addOrEditConfig(WebCrawlerConfig crawlerConfig, Integer userId){
		try {
			
			WebCrawlerConfig config = configMapper.findByWebDomain(crawlerConfig.getWebDomain());
			if(config != null && crawlerConfig.getId() != config.getId())
				return new ResponseModel(-1, "该网站已经配置，无需重复配置");
			
			if(StrUtil.isNull(crawlerConfig.getId())){
				crawlerConfig.setCreater(userId);
				crawlerConfig.setCreatedTime(new Date());
				crawlerConfig.setUpdatedTime(new Date());
				configMapper.insert(crawlerConfig);
			}else{
				crawlerConfig.setUpdater(userId);
				crawlerConfig.setUpdatedTime(new Date());
				configMapper.updateByPrimaryKey(crawlerConfig);
			}
			
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}

	}

	@Override
	public ResponseModel delConfig(Integer configId) {
		int i = configMapper.deleteByPrimaryKey(configId);
		if(i > 0){
			return new ResponseModel(1, "SUCCESS");
		}
		return new ResponseModel(-1, "删除失败");
	}


	@Override
	public WebCrawlerConfig getWebCrawlerConfigById(Integer configId) {
		return configMapper.selectByPrimaryKey( configId);
	}


	@Override
	public WebCrawlerConfig selectByPrimaryKey(Integer id) {
		return configMapper.selectByPrimaryKey(id);
	}

}
