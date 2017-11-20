package com.igreen.boss.service.impl.intellectual;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.igreen.boss.service.intellectual.BrandService;
import com.igreen.common.dao.BrandMapper;
import com.igreen.common.model.Brand;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Service
public class BrandServiceImpl implements BrandService{
	
	Logger log = Logger.getLogger(BrandServiceImpl.class);
	
	@Resource
	BrandMapper brandMapper;

	@Override
	public ResponseModel addBrand(Brand brand, Integer userId) {
		try{
			if(StrUtil.isNull(brand.getId())){
				brand.setStatus(1);
				brand.setCreater(userId);
				brand.setCreatedTime(new Date());
				brandMapper.insertSelective(brand);
			}
			else{
				brand.setUpdater(userId);
				brand.setUpdatedTime(new Date());
				brandMapper.updateByPrimaryKeySelective(brand);
			}
			return new ResponseModel(1, "SUCCESS");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseModel(-1, "系统异常");
		}
	}

	@Override
	public Brand getOneBrand(Integer brandId) {
		return brandMapper.selectByPrimaryKey(brandId);
	}

	@Override
	public ListRange brandList(Brand brand, Integer currentPage, Integer pageRows) {
		Map<String, Object> params = new HashMap<String, Object>();
		if(!StrUtil.isNull(brand.getRegistItemId()))
			params.put("registItemId", brand.getRegistItemId()); 
		if(!StrUtil.isNull(brand.getBrandName()))
			params.put("brandName", brand.getBrandName()); 
		if(!StrUtil.isNull(brand.getBrandType()))
			params.put("brandType", brand.getBrandType());
		params.put("startRow", (currentPage-1)*pageRows);
		params.put("pageRows", pageRows);
		ListRange result = new ListRange(brandMapper.pageBrand(params),
				brandMapper.countBrand(params), currentPage, pageRows);
		return result;
	}

}
