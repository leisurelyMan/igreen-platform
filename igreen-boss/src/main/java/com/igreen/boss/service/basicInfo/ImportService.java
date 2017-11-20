package com.igreen.boss.service.basicInfo;

import java.util.List;

import org.apache.poi.ss.usermodel.Row;

import com.igreen.common.util.ResponseModel;

public interface ImportService {

	/**
	 * 导入数据
	 * @param rows
	 * @return
	 */
	ResponseModel importCompanyData(List<Row> rows,String override,Integer userId);

	
	public void deleteRegistItemById(Integer id);
}
