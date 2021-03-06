package com.igreen.boss.service.impl.crawler;

import com.igreen.boss.service.crawler.CrawlerConfigIpeService;
import com.igreen.common.dao.CrawlerConfigIpeMapper;
import com.igreen.common.dao.CrawlerConfigMapper;
import com.igreen.common.model.WebCrawlerConfig;
import com.igreen.common.model.WebCrawlerConfigIpe;
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
public class CrawlerConfigIpeServiceImpl implements CrawlerConfigIpeService {
	
	private static final Logger log = Logger.getLogger(CrawlerConfigIpeServiceImpl.class);
	
	@Resource
    private CrawlerConfigIpeMapper configMapper;
	
	@Override
	public ListRange configList(WebCrawlerConfigIpe crawlerConfig, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(crawlerConfig != null && !StrUtil.isNull(crawlerConfig.getWebName()))
			params.put("webName", crawlerConfig.getWebName());
		if(crawlerConfig != null && !StrUtil.isNull(crawlerConfig.getWebDomain()))
			params.put("webDomain", crawlerConfig.getWebDomain());

		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(configMapper.pageCrawlerConfig(params), configMapper.countCrawlerConfig(params), currentPage, pageRows);
		return result;
	}

	/**
	 * 获取总条数
	 *
	 * @param crawlerConfig
	 * @return
	 */
	@Override
	public int configCount(WebCrawlerConfigIpe crawlerConfig) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(crawlerConfig != null && !StrUtil.isNull(crawlerConfig.getWebName()))
			params.put("webName", crawlerConfig.getWebName());
		return configMapper.countCrawlerConfig(params);
	}


	@Override
	public ResponseModel addOrEditConfig(WebCrawlerConfigIpe crawlerConfig, Integer userId){
		try {

			WebCrawlerConfigIpe config = configMapper.findByWebDomain(crawlerConfig.getWebDomain());
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
	public WebCrawlerConfigIpe getWebCrawlerConfigById(Integer configId) {
		return configMapper.selectByPrimaryKey( configId);
	}


	@Override
	public WebCrawlerConfigIpe selectByPrimaryKey(Integer id) {
		return configMapper.selectByPrimaryKey(id);
	}

}
