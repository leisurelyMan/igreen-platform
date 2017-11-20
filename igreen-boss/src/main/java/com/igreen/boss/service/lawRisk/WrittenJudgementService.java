package com.igreen.boss.service.lawRisk;

import com.igreen.common.model.WrittenJudgement;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface WrittenJudgementService {

	/**
	 * 添加/修改裁判文书信息
	 * @param writtenJudgement
	 * @return
	 */
	ResponseModel addWrittenJudgement(WrittenJudgement writtenJudgement, Integer id);

	/**
	 * 根据ID查询裁判文书信息
	 * @param judgementId
	 * @return
	 */
	WrittenJudgement getOneWrittenJudgement(Integer judgementId);

	/**
	 * 查询裁判文书信息列表
	 * @param writtenJudgement
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange writtenJudgementList(WrittenJudgement writtenJudgement, Integer currentPage, Integer pageRows);

}
