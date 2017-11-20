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
import com.igreen.boss.service.lawRisk.WrittenJudgementService;
import com.igreen.common.model.WrittenJudgement;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/lawRisk")
public class WrittenJudgementController extends BaseController {

	@Resource
	WrittenJudgementService writtenJudgementService;
	
	/**
	 * 跳转裁判文书信息列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toWrittenJudgementList")
	public ModelAndView toWrittenJudgementList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("lawRisk/writtenJudgement.jsp",model);
	}
	
	
	/**
	 * 添加/修改裁判文书信息
	 * @param shareholder
	 * @return
	 */
	@RequestMapping(value="addWrittenJudgement", method = {RequestMethod.POST})
	public @ResponseBody ResponseModel addWrittenJudgement(WrittenJudgement writtenJudgement,HttpServletRequest request,HttpServletResponse response){
		return writtenJudgementService.addWrittenJudgement(writtenJudgement, this.getUser(request, response).getId());
	}
	
	/**
	 * 根据ID查询裁判文书信息
	 * @param shareholderId
	 * @return
	 */
	@RequestMapping(value="getOneWrittenJudgement", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody WrittenJudgement getOneWrittenJudgement(Integer judgementId){
		return writtenJudgementService.getOneWrittenJudgement(judgementId);
	}
	
	/**
	 * 查询裁判文书信息列表
	 * @param shareholder
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="writtenJudgementList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange writtenJudgementList(WrittenJudgement writtenJudgement,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return writtenJudgementService.writtenJudgementList(writtenJudgement,currentPage,pageRows);
	}
}
