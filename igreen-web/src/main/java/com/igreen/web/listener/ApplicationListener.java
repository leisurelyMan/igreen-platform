package com.igreen.web.listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.igreen.web.job.JobManager;
import com.igreen.web.util.SpringBeanManager;

public class ApplicationListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent evt) {


		ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(evt.getServletContext());
		SpringBeanManager.initContext(context);

		
		//启动任务
		JobManager jobManager = (JobManager) SpringBeanManager.getBean("jobManager");
		jobManager.startJob();

	}
	public void contextDestroyed(ServletContextEvent evt) {
	}
}
