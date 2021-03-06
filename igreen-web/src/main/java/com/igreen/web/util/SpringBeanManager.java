package com.igreen.web.util;
import org.springframework.context.ApplicationContext;

/**
 * spring 手动获取bean
 */
public class SpringBeanManager {
	
	private static ApplicationContext context;

	public static void initContext(ApplicationContext ctx) {
		context = ctx;
	}

	public static Object getBean(String name) {
		return context.getBean(name);
	}

	public static <T> T getBean(String name, Class<T> cls) {
		return context.getBean(name, cls);
	}
	
	/**
	 * 根据类型获取bean,bean名称为class.getSimpleName(首字母改为小写)
	 */
	public static <T> T getBean(Class<T> cls) {
		String name = cls.getSimpleName();
		if(name !=null&&name.length()>1){
			name = name.substring(0,1).toLowerCase()+name.substring(1);
		}
		return context.getBean(name, cls);
	}
	
}
