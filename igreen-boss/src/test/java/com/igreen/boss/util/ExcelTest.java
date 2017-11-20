package com.igreen.boss.util;

import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;

public class ExcelTest {

	@Test
	public void testRead() {  
	    try {  
	          
	        ExcelUtil eu = new ExcelUtil();  
	        eu.setExcelPath("E:\\igreen\\1.xlsx"); 
	        eu.setPrintMsg(false);
	          
	        System.out.println("=======测试Excel 默认 读取========");  
	        List<Row> rows = eu.readExcel();
	        for(Row row : rows){
				 for (int j = 0; j < row.getLastCellNum(); j++) {
					 String value = ExcelUtil.getCellValue(row.getCell(j));
					 if (!value.equals("")) {
						 System.out.print(value+"|");
					 }
				 }
				 System.out.println("");
	        }

	          
	        System.out.println("\n=======测试Excel 从第四行读取，倒数第二行结束========");  
	        eu = eu.RestoreSettings();//还原设定  
	        eu.setStartReadPos(3);  
	        eu.setEndReadPos(-1);  
	        eu.setPrintMsg(false);
	        eu.readExcel();  
	          
	        System.out.println("\n=======测试Excel 读取第二个sheet========");  
	        eu = eu.RestoreSettings();//还原设定  
	        eu.setSelectedSheetIdx(1); 
	        eu.setPrintMsg(false);
	        eu.readExcel();  
	          
	        System.out.println("\n=======测试Excel 读取所有的sheet========");  
	        eu = eu.RestoreSettings();//还原设定  
	        eu.setOnlyReadOneSheet(false);  
	        eu.setPrintMsg(false);
	        eu.readExcel();  
	          
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }  
	}  
	
	@Test
	public void igreenReadTest(){
		try {
			ExcelUtil eu = new ExcelUtil();  
	        eu.setExcelPath("E:\\igreen\\2.xlsx"); 
	        eu.setOnlyReadOneSheet(false);
	        eu.readExcel();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
