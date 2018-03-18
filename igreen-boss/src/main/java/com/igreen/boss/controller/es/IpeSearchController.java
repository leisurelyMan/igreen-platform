package com.igreen.boss.controller.es;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.dto.IpeSearchDto;
import com.igreen.boss.service.es.IpeIndustrySearch;
import com.igreen.boss.util.ExcelUtil;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/ipesearch")
public class IpeSearchController extends BaseController{
	
	Logger log = Logger.getLogger(IpeSearchController.class);
	
	@Resource
	IpeIndustrySearch ipeIndustrySearch;

	/**
	 * 跳转列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toIpeSearchList")
	public ModelAndView toIpeSearchList(HttpServletRequest request,HttpServletResponse response, ModelMap model){
		return new ModelAndView("esSearch/ipesearch.html",model);
	}
	
	
	/**
	 * 分页显示
	 * @param 
	 * @param currentPage
	 * @param pageRows
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="ipeSearchList", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody ListRange ipeSearchList(IpeSearchDto dto,Integer currentPage,Integer pageRows) throws Exception{
		if(dto.isEmpty())
			return new ListRange(null, 0, 1, 10);
		if(currentPage == null)
			currentPage =1;
		if(pageRows == null)
			pageRows = 15;
		return ipeIndustrySearch.ipeIndustryList(dto,currentPage,pageRows);
	}
	
	@RequestMapping(value="addData", method = { RequestMethod.POST,RequestMethod.GET })
	public void addData() throws Exception{
		ipeIndustrySearch.bulkAdd();
	}
	
	@RequestMapping(value="addAnalyze", method = { RequestMethod.POST,RequestMethod.GET })
	public void addAnalyze(Integer startId,Integer endId) throws Exception{
		ipeIndustrySearch.addAnalyze(startId, endId);
	}
	
	/**
	 * 导入数据
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="uploadCompany",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody ResponseModel uploadMail(@RequestParam(value = "upexcel", required = false) MultipartFile upexcel,
			Integer programId,HttpServletResponse response,HttpServletRequest request) throws Exception{
        if(upexcel.isEmpty()){  
            throw new Exception("文件不存在！");  
        }
        InputStream in = upexcel.getInputStream();
		ExcelUtil eu = new ExcelUtil();
        eu.setOnlyReadOneSheet(false);
        eu.setPrintMsg(false);
        List<Row> rows = eu.analysisExcel(in);
        List<String> list = new ArrayList<String>();
        for(Row row:rows){
			log.info(row.getRowNum());
			if(row.getRowNum() == 0)
				continue;
			String value = ExcelUtil.getCellValue(row.getCell(0));
			if(StringUtils.isEmpty(value)){
				break;
			}
			list.add(value);
        }
        ResponseModel result = new ResponseModel(1, "success");
        if(list.size()>0){
        	String companys = StringUtils.collectionToDelimitedString(list, ",");
        	result.setObj(companys);
        }
         
		return result;
	}
}
