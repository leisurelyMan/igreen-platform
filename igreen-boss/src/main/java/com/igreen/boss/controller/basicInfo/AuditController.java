package com.igreen.boss.controller.basicInfo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.basicInfo.AuditService;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/basicInfo")
public class AuditController extends BaseController{

	@Resource
	AuditService auditService;
	
	/**
	 * 跳转导入数据列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toAuditList")
	public ModelAndView toExchangeList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("basicInfo/audit.html",model);
	}
	
	/**
	 * 审核公司记录
	 * @param registId
	 * @return
	 */
	@RequestMapping(value="auditRegistItem", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody ResponseModel auditRegistItem(Integer registId){
		return auditService.auditRegistItem(registId);
	}
}
