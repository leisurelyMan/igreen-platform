package com.igreen.boss.controller.crawler;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.basicInfo.RegistItemService;
import com.igreen.boss.service.crawler.CrawlerConfigIpeService;
import com.igreen.boss.service.crawler.CrawlerResultIpeService;
import com.igreen.boss.service.crawler.CrawlerResultService;
import com.igreen.boss.util.CommonPageIpeProcessor;
import com.igreen.common.model.RegistItem;
import com.igreen.common.model.WebCrawlerConfigIpe;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.*;

@Controller
@RequestMapping(value="/crawlerIpe")
public class CrawlerConfigIpeController extends BaseController{

	@Resource
	private CrawlerConfigIpeService configService;
	
	@Resource
	private CrawlerResultIpeService resultService;

	@Resource
	private RegistItemService registItemService;

	
	/**
	 * 配置列表页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="listPage")
	public ModelAndView listPage(ModelMap model){
		return new ModelAndView("crawlerIpe/listPage.jsp",model);
	}
	
	/**
	 * 查询配置列表信息
	 * @param crawler
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="list", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange list(WebCrawlerConfigIpe crawler,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return configService.configList(crawler,currentPage,pageRows);
	}
	
	/**
	 * 根据ID查询配置信息
	 * @return
	 */
	@RequestMapping(value="getWebCrawlerConfigById", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody WebCrawlerConfigIpe getWebCrawlerConfigById(Integer configId){
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
	public @ResponseBody ResponseModel addOrEditConfig(WebCrawlerConfigIpe crawler,HttpServletRequest request,HttpServletResponse response){
		return configService.addOrEditConfig(crawler, this.getUser(request, response).getId());
	}
	
	/**
	 * 抓取
	 * @return
	 */
	@RequestMapping(value="startCrawler", method = {RequestMethod.GET})
	public @ResponseBody void startCrawler(Integer configId) throws InvocationTargetException, IllegalAccessException {

		WebCrawlerConfigIpe config = configService.selectByPrimaryKey(configId);

		if(config != null){
			CommonPageIpeProcessor comm = new CommonPageIpeProcessor(config, resultService, 1);
			comm.startCrawler();
			return ;
		}

	}

	/**
	 * 抓取 Test
	 * @return
	 */
	@RequestMapping(value="startCrawlerTest", method = {RequestMethod.GET})
	public @ResponseBody void startCrawlerTest(Integer configId){
		WebCrawlerConfigIpe temp = configService.selectByPrimaryKey(configId);
		temp.setPageUrlRegular(temp.getPageUrlRegular().replace("${searchKey}", "上海"));
		temp.setWebSearchUrl(temp.getWebSearchUrl().replace("${searchKey}", "上海"));
		temp.setSearchId(-1);
		temp.setSearchName("上海");
		temp.setMaxPage(2);
		CommonPageIpeProcessor comm = new CommonPageIpeProcessor(temp, resultService, 1);
		comm.startCrawler();
	}
	
}
