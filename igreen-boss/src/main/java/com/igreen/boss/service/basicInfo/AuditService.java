package com.igreen.boss.service.basicInfo;

import com.igreen.common.util.ResponseModel;

public interface AuditService {

	/**
	 * 审核公司记录
	 * @param registId
	 * @return
	 */
	ResponseModel auditRegistItem(Integer registId);

}
