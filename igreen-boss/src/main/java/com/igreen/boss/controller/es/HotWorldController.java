package com.igreen.boss.controller.es;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.igreen.boss.service.es.HotWorldService;
import com.igreen.boss.util.HttpClientHelper;
import com.igreen.common.model.HotWords;
import com.igreen.common.model.HotWordsExample;
import com.igreen.common.model.HotWordsExample.Criteria;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;
import com.igreen.common.util.StrUtil;

@Controller
@RequestMapping(value="/hotWorld")
public class HotWorldController extends BaseController{
	
	Logger log = Logger.getLogger(HotWorldController.class);
	
	@Resource
	HotWorldService hotWorldService;
	
	@RequestMapping(value="ipeai")
	public void ipeai(){
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put("companyName", "江苏长虹建设工程有限公司");
		map.put("address", "蚌埠 / 安徽");
		map.put("fileName", "10508.html");
		map.put("title", "统计情况表");
		list.add(map);
		
		Map<String, String> param = new HashMap<String, String>();
		param.put("reqstr", JSON.toJSONString(list));
		log.info("params="+JSON.toJSONString(param));
		String result = HttpClientHelper.sendPost("http://localhost:1234", param, "UTF-8");
		log.info("result="+result);
	}
	
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
	 * @param hotWord
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
	 * @param worldId
	 * @return
	 */
	@RequestMapping(value="getHotWord", method = { RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody HotWords getHotWord(Integer worldId){
		return hotWorldService.selectByPrimaryKey(worldId);
	}
}
