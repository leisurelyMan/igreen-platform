package com.igreen.common.dao;

import java.util.List;
import com.igreen.common.model.RegistItemLocation;

public interface RegistItemLocationMapper {

    int insertSelective(RegistItemLocation record);

	List<RegistItemLocation> selectLocationList();
	
	long getMaxId();

}