package com.igreen.boss.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.service.DictionaryService;
import com.igreen.common.model.SysDictionary;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/sys")
public class DictionaryController extends BaseController{
	
	@Resource
	DictionaryService dictionaryService;

	/**
	 * 添加/修改字典
	 * @param user
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addDictionary", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addDictionary(SysDictionary dictionary,String roleIds,HttpServletRequest request,HttpServletResponse response){
		return dictionaryService.addDictionary(dictionary,this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询字典
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="getOneDictionary", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody SysDictionary getOneDictionary(Integer dictionaryId){
		return dictionaryService.getOneDictionary(dictionaryId);
	}
	
	/**
	 * 跳转字典列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toSysDictionaryList")
	public ModelAndView toSysDictionaryList(HttpServletRequest request,HttpServletResponse response, ModelMap model){
		return new ModelAndView("sys/sysDictionary.jsp",model);
	}
	
	/**
	 * 分页显示字典
	 * @param user
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="dictionaryList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange dictionaryList(SysDictionary dictionary,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage = 1;
		if(pageRows == null)
			pageRows = 15;
		return dictionaryService.dictionaryList(dictionary,currentPage,pageRows);
	}
	
	/**
	 * 查询一级字典
	 * @return
	 */
	@RequestMapping(value="getDictionaryByParentId", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody List<SysDictionary> getDictionaryByParentId(Integer parentId){
		return dictionaryService.getDictionaryByParentId(parentId);
	}
	
}
