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
import com.igreen.boss.service.es.HotWorldService;
import com.igreen.common.model.HotWords;
import com.igreen.common.model.HotWordsExample;
import com.igreen.common.model.HotWordsExample.Criteria;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Controller
@RequestMapping(value="/hotWorld")
public class HotWorldController extends BaseController{
	
	@Resource
	HotWorldService hotWorldService;
	
	/**
	 * 跳转列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toHotWorldList")
	public ModelAndView toHotWorldList(HttpServletRequest request,HttpServletResponse response, ModelMap model){
		return new ModelAndView("hotWorld/hotWorld.html",model);
	}
	
	
	/**
	 * 分页显示
	 * @param 
	 * @param currentPage
	 * @param pageRows
	 * @return
	 */
	@RequestMapping(value="hotWorldList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange hotWorldList(HotWords hotWord,Integer currentPage,Integer pageRows){
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return hotWorldService.hotWorldList(hotWord,currentPage,pageRows);
	}
	
	
	/**
	 * 添加/修改
	 * @param user
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="addHotWord", method = { RequestMethod.POST})
	public @ResponseBody ResponseModel addHotWord(HotWords hotWord,HttpServletRequest request,HttpServletResponse response){
		ResponseModel result = new ResponseModel(1, "SUCCESS");
		int opnum = 0;
		if(StrUtil.isNull(hotWord.getId())){
			hotWord.setCreater(this.getUser(request, response).getId());
			hotWord.setCreatedTime(new Date());
			opnum = hotWorldService.insertSelective(hotWord);
		}else{
			HotWordsExample example = new HotWordsExample();
			Criteria  criteria = example.createCriteria();
			if(!StrUtil.isNull(hotWord.getId()))
				criteria.andIdEqualTo(hotWord.getId());
			
			hotWord.setId(null);
			hotWord.setUpdater(this.getUser(request, response).getId());
			hotWord.setUpdatedTime(new Date());
			opnum = hotWorldService.updateByExampleSelective(hotWord, example);
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
	@RequestMapping(value="getHotWord", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody HotWords getHotWord(Integer worldId){
		return hotWorldService.selectByPrimaryKey(worldId);
	}
}
