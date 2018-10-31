package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.AdministrativePenalty;
import com.igreen.common.model.CompanyMonitorTemp;
import org.apache.ibatis.annotations.Param;

public interface AdministrativePenaltyMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(AdministrativePenalty record);

    int insertSelective(AdministrativePenalty record);

    AdministrativePenalty selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdministrativePenalty record);

    int updateByPrimaryKey(AdministrativePenalty record);

	List<AdministrativePenalty> pageAdministrativePenalty(Map<String, Object> params);

	Integer countAdministrativePenalty(Map<String, Object> params);

	int deleteByRegistItemId(Integer registItemId);
	
	List<AdministrativePenalty> selectByRegistItemId(Integer registItemId);

	void auditByRegistItemId(Integer registItemId);

    List<CompanyMonitorTemp> selectAdministrativePenaltyByResIds(@Param("regIds") List<Integer> regIds);
}