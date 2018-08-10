package com.igreen.boss.controller.ipe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.igreen.boss.controller.BaseController;
import com.igreen.common.dao.IpeAiResultMapper;
import com.igreen.common.model.IpeAiResult;
import com.igreen.common.model.IpeAiResultExample;

@Controller
@RequestMapping(value="/ipedata")
public class IpeDataController  extends BaseController{

	@Resource
	IpeAiResultMapper ipeAiResultMapper;
	
	@RequestMapping(value="toMepData", method = { RequestMethod.POST,RequestMethod.GET })
	public void toMepData(String source) throws Exception{
        //String csv = "D:\\个人\\igreen\\all_extract_2_14.txt";
        File file = new File(source);
        InputStream inputStream = new FileInputStream(file);
        String charset = "UTF-8";
        String line = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),charset));
        while((line = reader.readLine()) != null){
        	System.out.println(line);
        	String[] objs = line.split("	");
        	if(objs.length < 3)
        		continue;
        	IpeAiResult ipeAiResult = null;
        	IpeAiResultExample example = new IpeAiResultExample();
        	example.createCriteria().andFileUrlEqualTo(objs[0]);
        	List<IpeAiResult> list = ipeAiResultMapper.selectByExample(example);
        	if(list != null && list.size() > 0){
        		ipeAiResult = list.get(0);
        		ipeAiResult.setFileUrl(objs[0]);
        		ipeAiResult.setIndustryTime(objs[1]);
        		ipeAiResult.setCompanyName(objs[2]);
        		ipeAiResult.setKeyWords(objs[3]);
        		if(objs.length>=5)
        			ipeAiResult.setRegion(objs[4]);
        		ipeAiResult.setUpdatedTime(new Date());
        		ipeAiResultMapper.updateByPrimaryKeySelective(ipeAiResult);
        	}else{
        		ipeAiResult = new IpeAiResult();
        		ipeAiResult.setCreatedTime(new Date());
        		ipeAiResult.setFileUrl(objs[0]);
        		ipeAiResult.setIndustryTime(objs[1]);
        		ipeAiResult.setCompanyName(objs[2]);
        		ipeAiResult.setKeyWords(objs[3]);
        		if(objs.length>=5)
        			ipeAiResult.setRegion(objs[4]);
        		ipeAiResult.setState(1);
        		ipeAiResultMapper.insertSelective(ipeAiResult);
        	}
        }
	}
}
