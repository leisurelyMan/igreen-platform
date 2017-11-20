package com.igreen.boss.controller.basicInfo;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.util.EnvicloudUtil;
import com.igreen.common.dao.EnvicloudCityCodeMapper;
import com.igreen.common.model.EnvicloudBase;
import com.igreen.common.model.EnvicloudCityCode;
import com.igreen.common.model.EnvicloudParameter;

@Controller
@RequestMapping(value="/basicInfo")
public class EnvicloudController {
	@Resource
	EnvicloudCityCodeMapper cloudMapper;
	
	@RequestMapping(value="toEnviApi")
	public ModelAndView toMepData(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("basicInfo/envicloud.jsp",model);
	}
	
	@RequestMapping(value="getData")
	@ResponseBody
	public String getData(EnvicloudParameter pp) throws IOException{
		String source = pp.getSourceValue();
		EnvicloudBase o = null;
		if(source.equalsIgnoreCase("location")){
			EnvicloudCityCode code = new EnvicloudCityCode( );
			if(pp.getCityCode() != null && pp.getCityCode().length() > 0){
				code.setNameCn(pp.getCityCode());
			}
			if(pp.getProvince() != null && pp.getProvince().length() > 0){
				code.setProvCn(pp.getProvince());
			}
			List<String> cityCode = cloudMapper.selectByCityName(code);
			EnvicloudParameter query = new EnvicloudParameter( );
			query.setAccessKey(EnvicloudUtil.ACCESSKEY);
			if(cityCode != null && cityCode.size() > 0){
				query.setCityCode(cityCode.get(0));
			}
			o = EnvicloudUtil.getDataFromEnvicloud(EnvicloudUtil.LOCATION,query);
		}else if(source.equalsIgnoreCase("area")){
			EnvicloudParameter p = new EnvicloudParameter( );
			p.setAccessKey(EnvicloudUtil.ACCESSKEY);
			p.setStartLat(pp.getStartLat());
			p.setStartLng(pp.getStartLng());
			p.setEndLat(pp.getEndLat());
			p.setEndLng(pp.getEndLng());
			o = EnvicloudUtil.getDataFromEnvicloud(EnvicloudUtil.AREA,p);
		}else if(source.equalsIgnoreCase("monthlymete")){
			EnvicloudParameter p = new EnvicloudParameter( );
			p.setAccessKey(EnvicloudUtil.ACCESSKEY);
			EnvicloudCityCode code = new EnvicloudCityCode( );
			if(pp.getCityCode() != null && pp.getCityCode().length() > 0){
				code.setNameCn(pp.getCityCode());
			}
			if(pp.getProvince() != null && pp.getProvince().length() > 0){
				code.setProvCn(pp.getProvince());
			}
			List<String> cityCode = cloudMapper.selectByCityName(code);
			if(cityCode != null && cityCode.size() > 0){
				p.setCityCode(cityCode.get(0));
			}
			p.setYear(pp.getYear());
			String type = pp.getType();
			if(type != null && type.length() > 0){
				p.setType(pp.getType());
			}
			o = EnvicloudUtil.getDataFromEnvicloud(EnvicloudUtil.MONTHLYMETE,p);
		}else if(source.equalsIgnoreCase("yearlymete")){
			EnvicloudParameter p = new EnvicloudParameter( );
			p.setAccessKey(EnvicloudUtil.ACCESSKEY);
			EnvicloudCityCode code = new EnvicloudCityCode( );
			if(pp.getCityCode() != null && pp.getCityCode().length() > 0){
				code.setNameCn(pp.getCityCode());
			}
			if(pp.getProvince() != null && pp.getProvince().length() > 0){
				code.setProvCn(pp.getProvince());
			}
			List<String> cityCode = cloudMapper.selectByCityName(code);
			if(cityCode != null && cityCode.size() > 0){
				p.setCityCode(cityCode.get(0));
			}
			p.setStartYear(pp.getStartYear());
			p.setEndYear(pp.getEndYear());
			String type = pp.getType();
			if(type != null && type.length() > 0){
				p.setType(type);
			}
			o = EnvicloudUtil.getDataFromEnvicloud(EnvicloudUtil.YEARMETE,p);
		}else if(source.equalsIgnoreCase("citydailyair")){
			EnvicloudParameter p = new EnvicloudParameter( );
			p.setAccessKey(EnvicloudUtil.ACCESSKEY);
			EnvicloudCityCode code = new EnvicloudCityCode( );
			if(pp.getCityCode() != null && pp.getCityCode().length() > 0){
				code.setNameCn(pp.getCityCode());
			}
			if(pp.getProvince() != null && pp.getProvince().length() > 0){
				code.setProvCn(pp.getProvince());
			}
			List<String> cityCode = cloudMapper.selectByCityName(code);
			if(cityCode != null && cityCode.size() > 0){
				p.setCityCode(cityCode.get(0));
			}
			p.setDate(pp.getDate());
			String type = pp.getType();
			if(type != null && type.length() > 0){
				p.setType(pp.getType());
			}
			o = EnvicloudUtil.getDataFromEnvicloud(EnvicloudUtil.CITYDAILYAIR,p);
		}else if(source.equalsIgnoreCase("discharge")){
			EnvicloudParameter p = new EnvicloudParameter( );
			p.setAccessKey(EnvicloudUtil.ACCESSKEY);
			p.setYear(pp.getYear());
			String filter = pp.getFilter();
			if(filter != null && filter.length() > 0){
				p.setFilter(filter);
			}
			o = EnvicloudUtil.getDataFromEnvicloud(EnvicloudUtil.DISCHARGE,p);
		}else if(source.equalsIgnoreCase("periodicdischarge")){
			EnvicloudParameter p = new EnvicloudParameter( );
			p.setAccessKey(EnvicloudUtil.ACCESSKEY);
			p.setStartYear(pp.getStartYear());
			p.setEndYear(pp.getEndYear());
			p.setProvince(pp.getProvince());
			String filter = pp.getFilter();
			if(filter != null && filter.length() > 0){
				p.setFilter(filter);
			}
			o = EnvicloudUtil.getDataFromEnvicloud(EnvicloudUtil.PERIODICDISCHARGE,p);
		}
		
		return o.toString();
	}
}
