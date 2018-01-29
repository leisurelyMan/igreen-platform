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
import com.igreen.boss.service.qichacha.QichachaPenaltyService;
import com.igreen.common.model.QichachaPenalty;
import com.igreen.common.model.QichachaPenaltyWithBLOBs;
import com.igreen.common.util.ListRange;

@Controller
@RequestMapping(value="/qichacha/penalty")
public class QichachaPenaltyController extends BaseController{
	
	Logger log = Logger.getLogger(QichachaPenaltyController.class);

	@Resource
	QichachaPenaltyService qichachaPenaltyService;
	
	/**
	 * 跳转登记信息列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toPenaltyList")
	public ModelAndView toPenaltyList(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			QichachaCompanyBaseDto record,Integer currentPage,Integer pageRows){
		log.info("toPenaltyList request="+JSON.toJSONString(record)+",currentPage="+currentPage+",pageRows="+pageRows);
		model.put("company", record);
		model.put("currentPage", currentPage==null?1:currentPage);
		model.put("pageRows", pageRows==null?10:pageRows);
		return new ModelAndView("qichacha/penalty.jsp",model);
	}
	
	
	/**
	 * 分页显示
	 * @param 
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="penaltyList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange penaltyList(QichachaPenalty record,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return qichachaPenaltyService.penaltyList(record,currentPage,pageRows);
	}
	
	/**
	 * 根据ID查询
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="getOnePenalty", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody QichachaPenaltyWithBLOBs getOnePenalty(String id){
		return qichachaPenaltyService.selectByPrimaryKey(id);
	}
}
