package com.igreen.boss.controller.basicInfo;

import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.igreen.boss.controller.BaseController;
import com.igreen.boss.service.basicInfo.ImportService;
import com.igreen.boss.util.ExcelUtil;
import com.igreen.common.util.ResponseModel;

@Controller
@RequestMapping(value="/basicInfo")
public class ImportController extends BaseController{
	
	@Resource
	ImportService importService;

	/**
	 * 跳转导入数据列表页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="toImportList")
	public ModelAndView toExchangeList(ModelMap model,Long id){
		model.addAttribute("id", id);
		return new ModelAndView("basicInfo/import.jsp",model);
	}
	
	/**
	 * 导入数据
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="uploadExcel",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody ResponseModel uploadExcel(HttpServletRequest request,HttpServletResponse response,String override) throws Exception{
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		MultipartFile file = multipartRequest.getFile("upfile");  
        if(file.isEmpty()){  
            throw new Exception("文件不存在！");  
        }
        InputStream in = file.getInputStream();
		ExcelUtil eu = new ExcelUtil();  
        eu.setOnlyReadOneSheet(false);
        eu.setPrintMsg(false);
        List<Row> rows = eu.analysisExcel(in);
        
		return importService.importCompanyData(rows,override,this.getUser(request, response).getId());
	}
}
