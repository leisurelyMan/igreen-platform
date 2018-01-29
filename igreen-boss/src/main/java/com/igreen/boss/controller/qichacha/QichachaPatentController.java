package com.igreen.boss.controller.qichacha;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.igreen.boss.controller.BaseController;
import com.igreen.boss.dto.QichachaCompanyBaseDto;
import com.igreen.boss.service.qichacha.QichachaPatentService;
import com.igreen.common.model.QichachaPatent;
import com.igreen.common.util.ListRange;

@Controller
@RequestMapping(value="/qichacha/patent")
public class QichachaPatentController extends BaseController{
	
	Logger log = Logger.getLogger(QichachaPatentController.class);

	@Resource
	QichachaPatentService patentService;
	
	/**
	 * 跳转登记信息列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toPatentList")
	public ModelAndView toPatentList(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			QichachaCompanyBaseDto record,Integer currentPage,Integer pageRows){
		log.info("toPatentList request="+JSON.toJSONString(record)+",currentPage="+currentPage+",pageRows="+pageRows);
		model.put("company", record);
		model.put("currentPage", currentPage==null?1:currentPage);
		model.put("pageRows", pageRows==null?10:pageRows);
		return new ModelAndView("qichacha/patent.jsp",model);
	}
	
	
	/**
	 * 分页显示
	 * @param 
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="patentList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange patentList(QichachaPatent record,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return patentService.patentList(record,currentPage,pageRows);
	}
	
	/**
	 * 根据ID查询
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="getPatent", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody QichachaPatent getPatent(String id){
		return patentService.selectByPrimaryKey(id);
	}
}
