package com.igreen.boss.service.intellectual;

import com.igreen.common.model.Brand;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface BrandService {

	/**
	 * 添加/修改商标信息
	 * @param brand
	 * @param request
	 * @param response
	 * @return
	 */
	ResponseModel addBrand(Brand brand, Integer id);

	/**
	 * 根据ID查询商标信息
	 * @param brandId
	 * @return
	 */
	Brand getOneBrand(Integer brandId);

	/**
	 * 查询商标信息列表
	 * @param brand
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	ListRange brandList(Brand brand, Integer currentPage, Integer pageRows);

}
