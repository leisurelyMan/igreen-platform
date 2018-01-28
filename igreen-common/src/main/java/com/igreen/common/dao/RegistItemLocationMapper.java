package com.igreen.common.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.igreen.common.model.RegistItemLocation;

public interface RegistItemLocationMapper {

    int insertSelective(RegistItemLocation record);

	List<RegistItemLocation> selectLocationList();
	
	long getMaxId();
	
	List<RegistItemLocation> selectiveList(@Param("province") String province, @Param("city") String city);
}