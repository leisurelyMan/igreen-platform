package com.igreen.boss.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.igreen.common.dao.AirQualityMapper;
import com.igreen.common.dao.EnvicloudCityCodeMapper;
import com.igreen.common.model.AirQuality;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class EnvironCloudMapperTest {
	@Resource
	EnvicloudCityCodeMapper codeMapper;
	
	@Resource
	AirQualityMapper airQualityMapper;
	
	@Test
	public void test( ){
		AirQuality a1 = new AirQuality( );
		a1.setRecordDate(new Date( ));
		a1.setCity("北京");
		a1.setAirQualityIndex("123");
		a1.setMainPollutant("333");
		a1.setStatus("444");
		
		List<AirQuality> list = new ArrayList<AirQuality>( );
		list.add(a1);
		airQualityMapper.insertBatch(list);
	}
	
//	@Test
//	public void testCodeMapper( ) throws BiffException, IOException{
//		jxl.Workbook readwb = null;   
//		  
//  
//            //构建Workbook对象, 只读Workbook对象   
//  
//            //直接从本地文件创建Workbook   
//  
//            InputStream instream = new FileInputStream("D:\\areaid.xls");   
//  
//            readwb = Workbook.getWorkbook(instream);   
//  
//    
//  
//            //Sheet的下标是从0开始   
//  
//            //获取第一张Sheet表   
//  
//            Sheet readsheet = readwb.getSheet(0);
//  
//            //获取Sheet表中所包含的总行数   
//  
//            int rsRows = readsheet.getRows();   
//  
//            //获取指定单元格的对象引用   
//  
//            for (int i = 1; i < rsRows; i++)   
//  
//            {   
//            	EnvicloudCityCode cityCode = new EnvicloudCityCode( );
//            	cityCode.setAreaId(readsheet.getCell(0, i).getContents());
//            	cityCode.setNameEn(readsheet.getCell(1, i).getContents());
//            	cityCode.setNameCn(readsheet.getCell(2, i).getContents());
//            	cityCode.setDistrictEn(readsheet.getCell(3, i).getContents());
//            	cityCode.setDistrictCn(readsheet.getCell(4, i).getContents());
//            	cityCode.setProvEn(readsheet.getCell(5, i).getContents());
//            	cityCode.setProvCn(readsheet.getCell(6, i).getContents());
//            	cityCode.setNationEn(readsheet.getCell(7, i).getContents());
//            	cityCode.setNationCn(readsheet.getCell(8, i).getContents());
//            	codeMapper.insertSelective(cityCode);
//            }
//
//	}
  
}
