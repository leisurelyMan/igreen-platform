package com.igreen.boss.controller.es;

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
import com.igreen.boss.dto.IpeSearchDto;
import com.igreen.boss.service.es.IpeIndustrySearch;
import com.igreen.common.util.ListRange;

@Controller
@RequestMapping(value="/ipesearch")
public class IpeSearchController extends BaseController{
	
	@Resource
	IpeIndustrySearch ipeIndustrySearch;

	/**
	 * 跳转列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toIpeSearchList")
	public ModelAndView toIpeSearchList(HttpServletRequest request,HttpServletResponse response, ModelMap model){
		return new ModelAndView("esSearch/ipesearch.html",model);
	}
	
	
	/**
	 * 分页显示
	 * @param 
	 * @param currentPage
	 * @param pageRows
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="ipeSearchList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange ipeSearchList(IpeSearchDto dto,Integer currentPage,Integer pageRows) throws Exception{
		if(dto.isEmpty())
			return new ListRange(null, 0, 1, 10);
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return ipeIndustrySearch.ipeIndustryList(dto,currentPage,pageRows);
	}
	
	@RequestMapping(value="addData", method = { RequestMethod.POST,RequestMethod.GET })
	public void addData() throws Exception{
		ipeIndustrySearch.bulkAdd();
	}
	
	@RequestMapping(value="addAnalyze", method = { RequestMethod.POST,RequestMethod.GET })
	public void addAnalyze(Integer startId,Integer endId) throws Exception{
		ipeIndustrySearch.addAnalyze(startId, endId);
	}
}
