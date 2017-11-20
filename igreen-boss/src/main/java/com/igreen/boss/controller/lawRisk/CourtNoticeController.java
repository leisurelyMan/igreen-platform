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
import com.igreen.boss.service.lawRisk.CourtNoticeService;
import com.igreen.common.model.CourtNotice;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/lawRisk")
public class CourtNoticeController extends BaseController {

	@Resource
	CourtNoticeService courtNoticeService;
	
	/**
	 * 跳转法院公告列表页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toCourtNoticeList")
	public ModelAndView toCourtNoticeList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("lawRisk/courtNotice.jsp",model);
	}
	
	
	/**
	 * 添加/修改法院公告
	 * @param courtNotice
	 * @return
	 */
	@RequestMapping(value="addCourtNotice", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addCourtNotice(CourtNotice courtNotice,HttpServletRequest request,HttpServletResponse response){
		return courtNoticeService.addCourtNotice(courtNotice, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询法院公告
	 * @param courtNoticeId
	 * @return
	 */
	@RequestMapping(value="getOneCourtNotice", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody CourtNotice getOneCourtNotice(Integer courtNoticeId){
		return courtNoticeService.getOneCourtNotice(courtNoticeId);
	}
	
	/**
	 * 查询法院公告列表
	 * @param courtNotice
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="courtNoticeList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange courtNoticeList(CourtNotice courtNotice,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return courtNoticeService.courtNoticeList(courtNotice,currentPage,pageRows);
	}
}
