package com.igreen.common.dao;

import java.util.List;
import java.util.Map;

import com.igreen.common.model.CleanProductionCompany;
import com.igreen.common.model.IpeIndustryRecord;

public interface IpeIndustryRecordMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(IpeIndustryRecord record);

    int insertSelective(IpeIndustryRecord record);

    IpeIndustryRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IpeIndustryRecord record);

    int updateByPrimaryKey(IpeIndustryRecord record);

	Integer countIpeIndustry(Map<String, Object> params);

	List<IpeIndustryRecord> pageIpeIndustry(Map<String, Object> params);
	
	List<IpeIndustryRecord> selectByIpeId(Long ipeId);
	
	/**
	 * 删除IPE爬虫爬取重复的数据
	 * @return
	 */
	List<IpeIndustryRecord> duplicateIpe( );
	
	List<IpeIndustryRecord> selectRecordById(Integer id);
	
	List<IpeIndustryRecord> selectById(Map<String, Integer> params);
	List<IpeIndustryRecord> selectByRegistItemId(Integer registItemId);
	
	List<IpeIndustryRecord> getRegion();
}