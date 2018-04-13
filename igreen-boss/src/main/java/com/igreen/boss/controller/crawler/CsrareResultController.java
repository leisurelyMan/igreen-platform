package com.igreen.boss.controller.crawler;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.crawler.CrawlerResultService;
import com.igreen.boss.service.crawler.CsrareResultService;
import com.igreen.common.model.WebCrawlerResult;
import com.igreen.common.model.WebCsrcareResult;
import com.igreen.common.util.ListRange;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/csrare")
public class CsrareResultController extends BaseController{

	@Resource
	private CsrareResultService resultService;
	
	/**
	 * 结果列表页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="resultListPage")
	public ModelAndView listPage(ModelMap model){
		return new ModelAndView("csrare/resultListPage.jsp",model);
	}
	
	/**
	 * 查询配置列表信息
	 * @param result
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="resultList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange resultList(WebCsrcareResult result, Integer currentPage, Integer pageRows){
		if(currentPage == null){
			currentPage =1;
		}
		if(pageRows == null){
			pageRows = 15;
		}

		return resultService.resultList(result,currentPage,pageRows);
	}
	
	/**
	 * 根据ID查询配置信息
	 * @param resultId
	 * @return
	 */
	@RequestMapping(value="getWebCsrareResultById", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody WebCsrcareResult getWebCsrareResultById(Integer resultId){
		return resultService.getWebCsrcareResultById(resultId);
	}

}
