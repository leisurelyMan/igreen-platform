package com.igreen.boss.controller.lawRisk;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.lawRisk.OpenCourtService;
import com.igreen.common.model.OpenCourtNotice;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/lawRisk")
public class OpenCourtController extends BaseController {

	@Resource
	OpenCourtService openCourtService;
	
	/**
	 * 跳转开庭公告列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toOpenCourtList")
	public ModelAndView toOrganizationItemList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("lawRisk/openCourt.jsp",model);
	}
	
	
	/**
	 * 添加/修改开庭公告
	 * @param shareholder
	 * @return
	 */
	@RequestMapping(value="addOpenCourtNotice", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addOpenCourtNotice(OpenCourtNotice courtNotice,HttpServletRequest request,HttpServletResponse response){
		return openCourtService.addOpenCourtNotice(courtNotice, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询开庭公告
	 * @param shareholderId
	 * @return
	 */
	@RequestMapping(value="getOneOpenCourtNotice", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody OpenCourtNotice getOneOpenCourtNotice(Integer courtNoticeId){
		return openCourtService.getOneOpenCourtNotice(courtNoticeId);
	}
	
	/**
	 * 查询开庭公告列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="openCourtNoticeList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange courtNoticeList(OpenCourtNotice courtNotice,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return openCourtService.courtNoticeList(courtNotice,currentPage,pageRows);
	}
}
