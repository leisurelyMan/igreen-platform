package com.igreen.boss.controller.crawler;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igreen.boss.service.basicInfo.RegistItemService;
import com.igreen.common.model.RegistItem;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.*;

@Controller
@RequestMapping(value="/crawler")
public class CrawlerConfigController extends BaseController{

	@Resource
	private CrawlerConfigService configService;
	
	@Resource
	private CrawlerResultService resultService;

	@Resource
	private RegistItemService registItemService;

	
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
	 * @return
	 */
	@RequestMapping(value="startCrawler", method = {RequestMethod.GET})
	public @ResponseBody void startCrawler(Integer configId) throws InvocationTargetException, IllegalAccessException {

		final Integer currentPage = 1;
		final Integer pageRows = 10;
		final RegistItem registItem = new RegistItem();

		int count = registItemService.getCountRegistItem(registItem);
		int totalPage = count / pageRows + count % pageRows;


		final WebCrawlerConfig config = configService.selectByPrimaryKey(configId);

		if(!config.getPageUrlRegular().contains("${searchKey}")){
			CommonPageProcessor comm = new CommonPageProcessor(config, resultService, 1);
			comm.startCrawler();
			return ;
		}

		for(int i = 1; i < totalPage + 1; i++){

			ExecutorService executorService = Executors.newFixedThreadPool(pageRows);
			CompletionService<String> completionService = new ExecutorCompletionService<String>(executorService);
			ListRange range = registItemService.registItemList(registItem,i,pageRows);
			if(range != null && !CollectionUtils.isEmpty(range.getRows())){
				Iterator<RegistItem> iterator = (Iterator<RegistItem>) range.getRows().iterator();
				while (iterator.hasNext()){
					final WebCrawlerConfig temp = new WebCrawlerConfig();
					BeanUtils.copyProperties(temp, config);
					RegistItem item = iterator.next();
					temp.setPageUrlRegular(temp.getPageUrlRegular().replace("${searchKey}", item.getCompanyName()));
					temp.setWebSearchUrl(temp.getWebSearchUrl().replace("${searchKey}", item.getCompanyName()));
					temp.setSearchId(item.getId());
					temp.setSearchName(item.getCompanyName());
					Callable<String> call = new Callable<String>() {
						@Override
						public String call() throws Exception {
							CommonPageProcessor comm = new CommonPageProcessor(temp, resultService, 1);
							comm.startCrawler();
							return "success";
						}
					};
					completionService.submit(call);

				}
				try {
					for (int k = 0 ; k < range.getRows().size(); k ++){
						completionService.take();
					}

					executorService.shutdown();
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	/**
	 * 抓取 Test
	 * @return
	 */
	@RequestMapping(value="startCrawlerTest", method = {RequestMethod.GET})
	public @ResponseBody void startCrawlerTest(Integer configId){
		WebCrawlerConfig temp = configService.selectByPrimaryKey(configId);
		temp.setPageUrlRegular(temp.getPageUrlRegular().replace("${searchKey}", "上海"));
		temp.setWebSearchUrl(temp.getWebSearchUrl().replace("${searchKey}", "上海"));
		temp.setSearchId(-1);
		temp.setSearchName("上海");
		temp.setMaxPage(3);
		CommonPageProcessor comm = new CommonPageProcessor(temp, resultService, 1);
		comm.startCrawler();
	}
	
}
