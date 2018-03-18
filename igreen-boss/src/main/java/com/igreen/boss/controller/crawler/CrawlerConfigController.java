package com.igreen.boss.controller.crawler;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.crawler.CrawlerConfigService;
import com.igreen.boss.service.crawler.CrawlerResultService;
import com.igreen.boss.util.CommonPageProcessor;
import com.igreen.common.model.WebCrawlerConfig;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/crawler")
public class CrawlerConfigController extends BaseController{

	@Resource
	private CrawlerConfigService configService;
	
	@Resource
	private CrawlerResultService resultService;
	
	/**
	 * 配置列表页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="listPage")
	public ModelAndView listPage(ModelMap model){
		return new ModelAndView("crawler/listPage.jsp",model);
	}
	
	/**
	 * 查询配置列表信息
	 * @param crawler
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="list", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange list(WebCrawlerConfig crawler,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return configService.configList(crawler,currentPage,pageRows);
	}
	
	/**
	 * 根据ID查询配置信息
	 * @param investmentId
	 * @return
	 */
	@RequestMapping(value="getWebCrawlerConfigById", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody WebCrawlerConfig getWebCrawlerConfigById(Integer configId){
		return configService.getWebCrawlerConfigById(configId);
	}
	
	/**
	 * 添加/修改配置信息
	 * @param crawler
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addOrEditConfig", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addOrEditConfig(WebCrawlerConfig crawler,HttpServletRequest request,HttpServletResponse response){
		return configService.addOrEditConfig(crawler, this.getUser(request, response).getId());
	}
	
	/**
	 * 抓取
	 * @param crawler
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="startCrawler", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel startCrawler(Integer configId){
		WebCrawlerConfig config = configService.selectByPrimaryKey(configId);
		if(config == null){
			return new ResponseModel(-1, "爬虫失败");
		}
		
	    CommonPageProcessor comm = new CommonPageProcessor(config, resultService, 1);
	    comm.startCrawler();
		return new ResponseModel(1, "SUCCESS");
	}
	
}
