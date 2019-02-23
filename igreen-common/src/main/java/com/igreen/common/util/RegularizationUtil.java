package com.igreen.common.util;





import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则验证工具类
 * @author panjingxiao
 *
 */
public class RegularizationUtil {

	
	/**
	 * rex正则表达式 ，reg验证的字符串
	 * 
	 * @param rex   正则表达式
	 * @param reg   验证的字符串
	 * @return
	 */
	public static boolean rularization(String rex, String reg) {
		boolean result = false;
		if (rex != null && reg != null && !"".equals(rex) && !"".equals(reg)) {
			Pattern pattern = Pattern.compile(rex);
			Matcher matcher = pattern.matcher(reg);
			return matcher.find();
		}
		return result;
	}
	
	/**
	 * 验证是否包含script
	 * @param arg
	 * @return
	 */
	public static boolean scriptVetiry(String arg){
		if( StrUtil.isNull(arg)){
			return false;
		}
		if(arg.indexOf("<script>")>=0){
			return false;
		}
		return true;
	}
	
	/**
	 * 邮箱验证
	 * @param email
	 * @return
	 */
	public static boolean emailVerify(String email){
		String rex = "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
		return rularization(rex, email);
	}
	
	/**
	 * 验证手机号码
	 * @param phone
	 * @return
	 */
	public static boolean phoneVerify(String phone){
		String rex = "\\d{11}";
		return rularization(rex, phone);
	}
	
	/**
	 * 用户名正则验证
	 * @param userName
	 * @return
	 */
	public static boolean userNameVerify(String userName){
		String rex = "\\w{3}\\w*";
		return rularization(rex, userName);
	}
	
	
	public static boolean numberVerify(String value){
		String rex = "\\d+(\\.\\d+)?";
		return rularization(rex, value);
	}
	
	
	public static boolean integerVerify(String value){
		String rex = "\\d+";
		return rularization(rex, value);
	}
	
	public static void main(String[] args) {
		System.out.println(rularization("^[\\u4e00-\\u9fa5（）()]+$","安顺市梅加瑞金属回收有限公司"));

		
	}
}
