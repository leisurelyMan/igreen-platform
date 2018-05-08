package com.igreen.boss.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.igreen.common.dao.IpeAiResultMapper;
import com.igreen.common.model.IpeAiResult;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class IpeAiResultMapperTest {

	@Resource
	IpeAiResultMapper ipeAiResultMapper;
	
	@Test
	public void readTxt() throws Exception{
        String csv = "D:\\个人\\igreen\\all_extract_2_14.txt";
        File file = new File(csv);
        InputStream inputStream = new FileInputStream(file);
        String charset = "UTF-8";
        String line = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),charset));
        while((line = reader.readLine()) != null){
        	System.out.println(line);
        	String[] objs = line.split("	");
    		IpeAiResult ipeAiResult = new IpeAiResult();
    		ipeAiResult.setCreatedTime(new Date());
    		ipeAiResult.setFileUrl(objs[0]);
    		ipeAiResult.setIndustryTime(objs[1]);
    		ipeAiResult.setCompanyName(objs[2]);
    		ipeAiResult.setKeyWords(objs[3]);
    		ipeAiResult.setState(1);
    		ipeAiResultMapper.insertSelective(ipeAiResult);
        }
	}
}
