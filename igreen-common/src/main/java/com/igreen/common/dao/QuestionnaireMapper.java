package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.Questionnaire;

public interface QuestionnaireMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Questionnaire record);

    int insertSelective(Questionnaire record);

    Questionnaire selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Questionnaire record);

    int updateByPrimaryKey(Questionnaire record);

	Integer countQuestionnaire(Map<String, Object> params);

	List<Questionnaire> pageQuestionnaire(Map<String, Object> params);
	
	List<Questionnaire> selectByCustomerNameAndCustomerMobileAndCustomerMail(Map<String, Object> params);
}