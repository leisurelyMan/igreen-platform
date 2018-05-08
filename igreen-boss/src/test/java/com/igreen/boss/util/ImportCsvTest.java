package com.igreen.boss.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/spring-mybatis.xml"})
public class ImportCsvTest {

	@Resource(name="dataSource")
	DruidDataSource dataSource;
	
	
	@Test
    public void importtest() throws Exception{
        byte[] b = new byte[3];
        String csv = "F:\\igreen\\85W\\85W_qichacha_patent.csv";
        File file = new File(csv);
        InputStream inputStream = new FileInputStream(file);
        
        inputStream.read(b);
        String charset = "UTF-8";
/*        if (b[0] == -17 && b[1] == -69 && b[2] == -65)
            charset="UTF-8";
        else
            charset="GBK";*/
        String csvSplitBy = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";
        String line ="";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),charset));
        int i = 0;

        String[] columns=null;
        StringBuffer prefixsql = new StringBuffer();
        //prefixsql.append("insert into qichacha_company_base(");
        prefixsql.append("insert into qichacha_patent(");
        StringBuffer suffixsql = new StringBuffer();
        suffixsql.append(" values(");
        String sql = "";
        Connection conn = dataSource.getConnection();
        conn.setAutoCommit(true);
        PreparedStatement statement = null;
        
        File errorfile = new File("F:\\igreen\\85W\\85W_qichacha_patent_error.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(errorfile));
        while((line = reader.readLine()) != null){
            if(i++ == 0){
                columns = line.split(csvSplitBy);
                System.out.println(JSON.toJSON(columns));
                int j=0;
                for(String column:columns){
                	if(j++==0){
                    	prefixsql.append(column.replaceAll("\"", ""));
                        suffixsql.append("?");
                	}else{
                    	prefixsql.append(","+column.replaceAll("\"", ""));
                        suffixsql.append(",?");
                	}
                }
                
                prefixsql.append(")");
                suffixsql.append(")");
                sql = prefixsql.toString()+suffixsql.toString();
                statement = conn.prepareStatement(sql);
                continue;
            }

            try {
                if(statement==null)
                	statement = conn.prepareStatement(sql);
                

                System.out.println(line);
                String[] major = line.split(csvSplitBy);
                if(major.length < 3){
    	        	out.write(line);
    	        	out.write("\r\n"); // \r\n即为换行  
                }
                System.out.println(JSON.toJSON(major));
                System.out.println(major.length);
                int j=1;
                //statement.setString(j++, UUID.randomUUID().toString());
                for(String value : major){
                    if(value.equals(""))
                        value=null;
                    statement.setString(j++, value.replaceAll("\"", ""));
                }
                //补全末尾的空值
                while(j<columns.length){
                    statement.setString(j++, null);
                }
            	statement.execute();
			} catch (Exception e) {
				e.printStackTrace();
	        	out.write(line);
	        	out.write("\r\n"); // \r\n即为换行  
				continue;
			}
            
/*            statement.addBatch();
            if(i%100 == 0){
                statement.executeBatch();
                conn.commit();
            }*/
        }
        
        out.flush(); // 把缓存区内容压入文件  
        out.close(); // 最后记得关闭文件 

        
        
/*        statement.executeBatch();
        conn.commit();
        conn.setAutoCommit(true);*/
    }
	
	
	public static void main(String[] args) throws IOException {
        String csv = "D:\\个人\\igreen\\all_extract_2_14.txt";
        File file = new File(csv);
        InputStream inputStream = new FileInputStream(file);
        String charset = "UTF-8";
        String line = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),charset));
        while((line = reader.readLine()) != null){
        	System.out.println(line);
        	String[] objs = line.split("	");
        	for(String obj:objs){
        		System.out.println(obj);
        	}
        }
        
	}
	
}
