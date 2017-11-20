package com.igreen.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrUtil {

	public static boolean isNull(String str){
		if(str == null || str.trim().length() == 0)
			return true;
		else
			return false;
	}
	
	
	public static boolean isNull(Object obj){
		if(obj == null || obj.toString().trim().length() == 0)
			return true;
		else
			return false;
	}
	
	public static String replaceBlank(String str) {
		String dest = "";
		if (str!=null) {
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
			Matcher m = p.matcher(str);
			dest = m.replaceAll("");
		}
		return dest;
	}
}
