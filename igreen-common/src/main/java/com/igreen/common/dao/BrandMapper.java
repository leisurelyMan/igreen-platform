package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.Brand;

public interface BrandMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);

	List<Brand> pageBrand(Map<String, Object> params);

	Integer countBrand(Map<String, Object> params);
	
	int deleteByRegistItemId(Integer registItemId);
	
	List<Brand> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);
}