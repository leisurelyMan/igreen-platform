package com.igreen.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.igreen.common.model.Questionnaire;
import com.igreen.common.util.ResponseModel;
import com.igreen.web.service.QuestionnaireService;

@Controller
@RequestMapping(value="/questionnaire")
public class QuestionnaireController {

	@Resource
	QuestionnaireService questionnaireService;
	
	
	@RequestMapping(value="addQuestionnaire")
	public @ResponseBody ResponseModel addQuestionnaire(Questionnaire questionnaire){
		return questionnaireService.save(questionnaire);
	}
}
