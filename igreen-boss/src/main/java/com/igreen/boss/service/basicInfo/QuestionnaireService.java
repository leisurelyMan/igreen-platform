package com.igreen.boss.service.basicInfo;

import com.igreen.common.dto.QuestionnaireDto;
import com.igreen.common.model.Questionnaire;
import com.igreen.common.util.ListRange;

public interface QuestionnaireService {

	/**
	 * 根据ID查询问卷调查
	 * @param questionnaireId
	 * @return
	 */
	QuestionnaireDto getOneQuestionnaire(Integer questionnaireId);

	/**
	 * 分页显示问卷调查信息
	 * @param questionnaire
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange questionnaireList(Questionnaire questionnaire, Integer currentPage, Integer pageRows);

}
