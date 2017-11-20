package com.igreen.boss.controller.basicInfo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.basicInfo.ReptileService;
import com.igreen.boss.task.ReptileTask;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/basicInfo")
public class ReptileController extends BaseController {
	private static Logger logger = Logger.getLogger(ReptileController.class);

	@Resource
	ReptileService reptileService;
	
	/**
	 * 跳转爬虫数据列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toReptileList")
	public ModelAndView toReptileList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("basicInfo/reptile.jsp",model);
	}
	
	/**
	 * 爬取行政处罚信息
	 * @param override
	 * @return
	 */
	@RequestMapping(value="businessRiskReptile")
	public @ResponseBody ResponseModel businessRiskReptile(String incrementFlag,String beginCompnayId){
		if(ReptileTask.IPEFLAG){
			return new ResponseModel(1, "后台已有IPE爬虫爬取数据，请勿重复爬取!");
		}
		ReptileTask.IPEFLAG = true;
		int companyId = 1;
		if(incrementFlag.equalsIgnoreCase("1")){
			Integer maxCompanyId = null;
			if(beginCompnayId != null){
				beginCompnayId = beginCompnayId.trim();
				try{
					int begin = Integer.parseInt(beginCompnayId);
					maxCompanyId = begin;
				}catch(NumberFormatException e){
					logger.error(e.getMessage());
				}
			}
			
			if(maxCompanyId == null){
				maxCompanyId = reptileService.maxIpeCompanyId();
			}
			
			if(maxCompanyId == null){
				maxCompanyId = 1;
			}
			companyId = maxCompanyId + 1;
		}
		
		int totalCompany = ReptileTask.maxIpeComplayId - companyId;
		if(totalCompany <= 0){
			ReptileTask.IPEFLAG = false;
			return new ResponseModel(1, "请调整最大公司ID上限!");
		}
		
		List<ReptileTask.IPERunnable> ipeList = new ArrayList<ReptileTask.IPERunnable>( );
		int step = totalCompany / ReptileTask.maxIpeThread;
		int start = companyId;
		int end = companyId + step;
		
		for(int index = 0; index < ReptileTask.maxIpeThread; ++index){
			if(index == ReptileTask.maxIpeThread - 1){
				end = ReptileTask.maxIpeComplayId;
			}
			
			logger.info("爬虫线程开始爬取，start = " + start + ",end = " + end);
			ReptileTask.IPERunnable ipeRun = new ReptileTask.IPERunnable(reptileService,start,end);
			ipeList.add(ipeRun);
			start = end;
			end = start + step;
		}
		
		for(ReptileTask.IPERunnable ipe:ipeList){
			ReptileTask.ipeExecutor.submit(ipe);
		}
		
		return new ResponseModel(1, "IPE开始爬取，本次需爬取 " + totalCompany + "家公司!");
	}
	
	/**
	 * 爬取行政处罚信息
	 * @param override
	 * @return
	 */
	@RequestMapping(value="businessRiskReptileStop")
	public @ResponseBody Object businessRiskReptileStop( ){
		ReptileTask.IPEFLAG = false;
		return "succ";
	}
}
