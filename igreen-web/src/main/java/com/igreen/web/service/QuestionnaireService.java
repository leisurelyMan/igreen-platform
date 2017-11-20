package com.igreen.web.service;

import com.igreen.common.model.Questionnaire;
import com.igreen.common.util.ResponseModel;

public interface QuestionnaireService {

	/**
	 * 保存问卷调查对象
	 * @param questionnaire
	 * @return
	 */
	ResponseModel save(Questionnaire questionnaire);

}
