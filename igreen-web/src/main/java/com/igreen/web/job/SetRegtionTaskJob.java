package com.igreen.web.job;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.igreen.common.dao.RegistItemLocationMapper;
import com.igreen.common.dao.RegistItemMapper;
import com.igreen.common.model.RegistItem;
import com.igreen.common.model.RegistItemLocation;
import com.igreen.web.util.HttpUtils;
import com.igreen.web.util.SpringBeanManager;


/**
 * 刷新公司位置job
 * @author shuai
 *
 */
@DisallowConcurrentExecution 
public class SetRegtionTaskJob implements Job {
	

	private boolean continue_flag = true;   //当请求接口的数量达到最大时 当天不在发送请求
	public static final String DAILY_QUERY_OVER_LIMIT = "10003";  //达到请求高德地图接口上限返回的code
	public static final String RESPONSE_STATUS_SUCESS = "1";   //返回成功状态的status
	
	RegistItemMapper registItemMapper;
	RegistItemLocationMapper registItemLocationMapper;
	
	{
		registItemMapper = (RegistItemMapper) SpringBeanManager.getBean("registItemMapper");
		registItemLocationMapper = (RegistItemLocationMapper) SpringBeanManager.getBean("registItemLocationMapper");
	}
	
	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		try {
			long maxId = registItemLocationMapper.getMaxId();
			List<RegistItem> regionList = registItemMapper.getNeedUpdateRegion(maxId);
			int batchNum = 0;
			StringBuilder strs = new StringBuilder();
			StringBuilder ids = new StringBuilder();
			int size = regionList.size();
			for(int i=0;i<size;i++){
				if(!continue_flag) break;	
				batchNum ++;
				strs.append(regionList.get(i).getAddress()).append("|");
				ids.append(regionList.get(i).getId()).append(",");
				if(batchNum == 10 ||  i == (size-1)){
					updateRegist(strs.substring(0,strs.length()-1),ids.substring(0,ids.length()-1));
					strs = new StringBuilder();
					ids = new StringBuilder();
					batchNum = 0;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	private void updateRegist(String str,String ids){
		
		String url = "http://restapi.amap.com/v3/geocode/geo";
		Map<String, String> querys = new HashMap<String,String>();
		querys.put("address", str);
		querys.put("output", "JSON");
		querys.put("key", "71d18dbe24ca4f77f06b7baec8f807f2");
//		querys.put("key", "b5071c23909a352435b49d1de19c0b4f");  
//		querys.put("key", "d2c9a16f24dd744f108375bf6ba48102");  
//		querys.put("key", "60f08e04ebd6286b15d54ccad60b3158");  
//		querys.put("key", "cbbfec42eab754070225ba3fed1c3ac9");  
//		querys.put("key", "6de08cdc6440ee095a632c05eb4d92ca");
//		querys.put("key", "b2e93e044113e61bc4a7848cc20c44c3");
//		querys.put("key", "dcdc18ea05da88c923107a795080bbbc");
//		querys.put("key", "56c87e3f2d770df075e3a9f3eaffdc1f");
//		querys.put("key", "5cc4e6a768d4251a73b7d271b9152f89");
		querys.put("batch","true");
		
		try {
			HttpResponse response = HttpUtils.doGet(url, new HashMap<String, String>(), querys);
			String content= EntityUtils.toString(response.getEntity());
			JSONObject obj = JSON.parseObject(content);
			if(obj != null){
				if(DAILY_QUERY_OVER_LIMIT.equals(obj.getString("infocode")))   continue_flag=false;
				if(RESPONSE_STATUS_SUCESS.equals(obj.getString("status"))){
					JSONArray arr = obj.getJSONArray("geocodes");
					String [] arrids = ids.split(",");
					if(arr != null && arr.size()>0){
						for(int i=0;i<arr.size();i++){
							RegistItemLocation registItemLocation = new RegistItemLocation();
							JSONObject j_obj = arr.getJSONObject(i);
							registItemLocation.setId(Integer.parseInt(arrids[i]));
							registItemLocation.setProvince(j_obj.getString("province"));
							registItemLocation.setCity(j_obj.getString("city"));
							registItemLocation.setDistrict(j_obj.getString("district"));
							registItemLocation.setStreet(j_obj.getString("street"));
							registItemLocation.setNumber(j_obj.getString("number"));
							registItemLocation.setLocation(j_obj.getString("location"));
							registItemLocationMapper.insertSelective(registItemLocation);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
