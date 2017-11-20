package com.igreen.web.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.igreen.common.dao.QuestionnaireMapper;
import com.igreen.common.model.Questionnaire;
import com.igreen.common.util.ResponseModel;
import com.igreen.web.service.QuestionnaireService;
import com.igreen.web.util.MailSenderUtil;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {
	
	@Resource
	QuestionnaireMapper questionnaireMapper;

	@Override
	public ResponseModel save(Questionnaire questionnaire) {
		System.out.println(JSON.toJSONString(questionnaire));
		ResponseModel result = new ResponseModel();
		try {
			if(questionnaire.getComplianceProjectTypeOther().equals("请填写项目名称"))
				questionnaire.setComplianceProjectTypeOther("");
			if(questionnaire.getGreenBondsTypeOther().equals("请填写项目名称"))
				questionnaire.setGreenBondsTypeOther("");
			questionnaire.setStatus(0);
			questionnaire.setCountry(1);
			//查询重复
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("customerName", questionnaire.getCustomerName());
			params.put("customerMobile", questionnaire.getCustomerMobile());
			params.put("customerMail", questionnaire.getCustomerMail());
			List<Questionnaire> questionnaires = questionnaireMapper.selectByCustomerNameAndCustomerMobileAndCustomerMail(params);
			if(questionnaires.isEmpty()){
				questionnaire.setCreatedTime(new Date());
				questionnaireMapper.insertSelective(questionnaire);
			}else{
				questionnaire.setUpdatedTime(new Date());
				questionnaire.setId(questionnaires.get(0).getId());
			}
			result.setCode(1);
		} catch (Exception e) {
			e.printStackTrace();
			result.setCode(0);
		}
		MailSenderUtil.sendMail(questionnaire);
		return result;
	}

}
