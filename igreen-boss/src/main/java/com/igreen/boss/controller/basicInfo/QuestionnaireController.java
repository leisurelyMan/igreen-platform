package com.igreen.boss.controller.basicInfo;

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
import com.igreen.boss.service.basicInfo.QuestionnaireService;
import com.igreen.common.dto.QuestionnaireDto;
import com.igreen.common.model.Questionnaire;
import com.igreen.common.util.ListRange;

@Controller
@RequestMapping(value="/basicInfo")
public class QuestionnaireController extends BaseController{

	@Resource
	QuestionnaireService questionnaireService;
	
	/**
	 * 根据ID查询问卷调查
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="getOneQuestionnaire", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody QuestionnaireDto getOneQuestionnaire(Integer questionnaireId){
		return questionnaireService.getOneQuestionnaire(questionnaireId);
	}
	
	/**
	 * 跳转问卷调查列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toQuestionnaireList")
	public ModelAndView toQuestionnaireList(HttpServletRequest request,HttpServletResponse response, ModelMap model){
		return new ModelAndView("basicInfo/questionnaire.jsp",model);
	}
	
	/**
	 * 分页显示问卷调查信息
	 * @param user
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="questionnaireList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange questionnaireList(Questionnaire questionnaire,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage = 1;
		if(pageRows == null)
			pageRows = 15;
		return questionnaireService.questionnaireList(questionnaire,currentPage,pageRows);
	}
}
