package com.igreen.boss.controller.es;

import java.util.Date;

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
import com.igreen.boss.service.es.StopWorldService;
import com.igreen.common.model.HotStopwords;
import com.igreen.common.model.HotStopwordsExample;
import com.igreen.common.model.HotStopwordsExample.Criteria;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Controller
@RequestMapping(value="/stopWorld")
public class StopWorldController extends BaseController{

	@Resource
	StopWorldService stopWorldService;
	
	/**
	 * 跳转列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toStopWorldList")
	public ModelAndView toStopWorldList(HttpServletRequest request,HttpServletResponse response, ModelMap model){
		return new ModelAndView("stopWorld/stopWorld.html",model);
	}
	
	
	/**
	 * 分页显示
	 * @param label
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="stopWorldList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange stopWorldList(HotStopwords stopWorld,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return stopWorldService.stopWorldList(stopWorld,currentPage,pageRows);
	}
	
	
	/**
	 * 添加/修改
	 * @param user
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addStopword", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addStopword(HotStopwords stopWorld,HttpServletRequest request,HttpServletResponse response){
		ResponseModel result = new ResponseModel(1, "SUCCESS");
		int opnum = 0;
		if(StrUtil.isNull(stopWorld.getId())){
			stopWorld.setCreater(this.getUser(request, response).getId());
			stopWorld.setCreatedTime(new Date());
			opnum = stopWorldService.insertSelective(stopWorld);
		}else{
			HotStopwordsExample example = new HotStopwordsExample();
			Criteria  criteria = example.createCriteria();
			if(!StrUtil.isNull(stopWorld.getId()))
				criteria.andIdEqualTo(stopWorld.getId());
			
			stopWorld.setId(null);
			stopWorld.setUpdater(this.getUser(request, response).getId());
			stopWorld.setUpdatedTime(new Date());
			opnum = stopWorldService.updateByExampleSelective(stopWorld, example);
		}
		if(opnum <= 0)
			result.setCode(-1);
		return result;
	}
	
	/**
	 * 根据ID查询
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="getOneStopword", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody HotStopwords getOneStopword(Integer worldId){
		return stopWorldService.selectByPrimaryKey(worldId);
	}
}
