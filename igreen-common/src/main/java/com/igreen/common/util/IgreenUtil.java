package com.igreen.common.util;

import java.math.BigDecimal;
import java.util.Map;

public class IgreenUtil {

	public static String getString(String key,Map<String, String> params){
		if(params.containsKey(key))
			return params.get(key).trim();
		return null;
	}
	
	
	public static BigDecimal getBigDecimal(String key,Map<String, String> params){
		if(params.containsKey(key) && RegularizationUtil.numberVerify(params.get(key)))
			return new BigDecimal(params.get(key).trim());
		return null;
	}
	
	
	public static Integer getInteger(String key,Map<String, String> params){
		if(params.containsKey(key) && RegularizationUtil.integerVerify(params.get(key)))
			return Integer.parseInt(params.get(key).trim());
		return null;
	}
}
