package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.RegistItem;

public interface RegistItemMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(RegistItem record);

    int insertSelective(RegistItem record);

    RegistItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegistItem record);

    int updateByPrimaryKey(RegistItem record);

	List<RegistItem> pageRegistItem(Map<String, Object> params);

	Integer countRegistItem(Map<String, Object> params);
	
	Integer countByRegistNumber(String registNumber);
	
	List<RegistItem> selectByRegistNumber(String registNumber);

	List<RegistItem> selectByCompanyName(String companyName);
	
	List<RegistItem> selectByIPECompanyId(String companyId);
	
	List<RegistItem> selectByCompanyNameAndStatus(Map<String, Object> map);

	void auditById(Integer id);
	
	Integer selectMaxCompanyId( );
}