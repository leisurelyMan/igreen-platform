package com.igreen.boss.controller.companyQuery;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.igreen.boss.controller.BaseController;
import com.igreen.boss.dto.CompanyQueryConfigDto;
import com.igreen.boss.dto.CompanyQueryDetailDto;
import com.igreen.boss.service.companyQuery.CompanyQueryConfigService;
import com.igreen.boss.service.companyQuery.CompanyQueryDetailService;
import com.igreen.common.model.CompanyQueryConfig;
import com.igreen.common.model.CompanyQueryDetail;
import com.igreen.common.model.CompanyQueryDetailExample;
import com.igreen.common.model.CompanyQueryDetailExample.Criteria;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/companyQuery")
@EnableAsync
public class CompanyQueryController extends BaseController{

	Logger log = Logger.getLogger(CompanyQueryController.class);

	@Resource
	CompanyQueryConfigService queryConfigService;
	
	@Resource
	CompanyQueryDetailService queryDetailService;
	
	
	/**
	 * 跳转列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toQueryConfigList")
	public ModelAndView toQueryConfigList(HttpServletRequest request,HttpServletResponse response){
		return new ModelAndView("companyQuery/queryConfig.html");
	}
	
	
	/**
	 * 分页显示
	 * @param 
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="queryConfigList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange queryConfigList(CompanyQueryConfig record,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return queryConfigService.queryConfigList(record,currentPage,pageRows);
	}
	
	/**
	 * 根据ID查询
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="getQueryConfig", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody CompanyQueryConfig getQueryConfig(Integer id){
		return queryConfigService.selectByPrimaryKey(id);
	}
	
	/**
	 * 跳转编辑页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toQueryConfigEdit")
	public ModelAndView toQueryConfigEdit(HttpServletRequest request,HttpServletResponse response,ModelMap model,
			CompanyQueryConfig searchRecord,Integer currentPage,Integer pageRows){
		log.info("toQueryConfigEdit request="+JSON.toJSONString(searchRecord)+",currentPage="+currentPage+",pageRows="+pageRows);
		model.put("searchRecord", searchRecord);
		model.put("currentPage", currentPage);
		model.put("pageRows", pageRows);
		return new ModelAndView("companyQuery/queryConfigEdit.jsp",model);
	}
	
	/**
	 * 添加/修改
	 * @param artical
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addQueryConfig", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addQueryConfig(@RequestBody CompanyQueryConfigDto queryConfigDto,
			HttpServletRequest request,HttpServletResponse response){
		log.info("addQueryConfig request="+JSON.toJSONString(queryConfigDto));
		ResponseModel result = new ResponseModel(1, "SUCCESS");
		CompanyQueryConfig config = new CompanyQueryConfig();
		BeanUtils.copyProperties(queryConfigDto,config);
		int opnum = 0;
		List<CompanyQueryDetail> details = new ArrayList<CompanyQueryDetail>();
		if(StringUtils.isEmpty(config.getId())){
			config.setCreater(this.getUser(request, response).getId());
			config.setCreatedTime(new Date());
			config.setUpdatedTime(new Date());
			opnum = queryConfigService.insertSelective(config);
			if(queryConfigDto.getCompanys() != null && queryConfigDto.getCompanys().size() > 0){
				for(CompanyQueryDetailDto relationdto:queryConfigDto.getCompanys()){
					CompanyQueryDetail relation = new CompanyQueryDetail();
					BeanUtils.copyProperties(relationdto,relation);
					relation.setConfigId(config.getId());
					relation.setState(0);
					relation.setCreater(this.getUser(request, response).getId());
					relation.setCreatedTime(new Date());
					relation.setUpdatedTime(new Date());
					queryDetailService.insertSelective(relation);
					details.add(relation);
				}
			}
			
		}else{
			config.setUpdater(this.getUser(request, response).getId());
			config.setUpdatedTime(new Date());
			opnum = queryConfigService.updateByPrimaryKeySelective(config);
			
			CompanyQueryDetailExample example = new CompanyQueryDetailExample();
			Criteria criteria = example.createCriteria();
			criteria.andConfigIdEqualTo(config.getId());
			queryDetailService.deleteByExample(example);
			if(queryConfigDto.getCompanys() != null && queryConfigDto.getCompanys().size() > 0){
				for(CompanyQueryDetailDto relationdto:queryConfigDto.getCompanys()){
					CompanyQueryDetail relation = new CompanyQueryDetail();
					BeanUtils.copyProperties(relationdto,relation);
					relation.setConfigId(config.getId());
					relation.setState(0);
					relation.setCreater(this.getUser(request, response).getId());
					relation.setCreatedTime(new Date());
					relation.setUpdatedTime(new Date());
					queryDetailService.insertSelective(relation);
					details.add(relation);
				}
			}

		}
		if(opnum <= 0)
			result.setCode(-1);
		queryDetailService.addDetails(details);
		log.info("addArticle response="+JSON.toJSONString(result));
		return result;
	}
	
	
	@RequestMapping(value="getOneConfig", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody CompanyQueryConfigDto getOneConfig(Integer configId){
		log.info("getOneConfig request="+JSON.toJSONString(configId));
		CompanyQueryConfigDto result = new CompanyQueryConfigDto();
		CompanyQueryConfig config = queryConfigService.selectByPrimaryKey(configId);
		BeanUtils.copyProperties(config,result);
		//配置详情
		CompanyQueryDetailExample example = new CompanyQueryDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andConfigIdEqualTo(configId);
		List<CompanyQueryDetail> companys = queryDetailService.selectByExample(example);
		List<CompanyQueryDetailDto> dtos = new ArrayList<CompanyQueryDetailDto>();
		for(CompanyQueryDetail company : companys){
			CompanyQueryDetailDto dto = new CompanyQueryDetailDto();
			BeanUtils.copyProperties(company,dto);
			dtos.add(dto);
		}
		result.setCompanys(dtos);
		log.info("getOneConfig response="+JSON.toJSONString(result));
		return result;
	}
}
