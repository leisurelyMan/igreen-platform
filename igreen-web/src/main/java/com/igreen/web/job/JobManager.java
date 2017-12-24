package com.igreen.web.job;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.stereotype.Component;


@Component
public class JobManager {


	public static final String REGTION_JOB_GROUP = "regtion_job_group"; 
	
	public void startJob() {
		try {
			
			SchedulerFactory schedulerFactory = new StdSchedulerFactory();
			
			Scheduler setRegtionJobScheduler = schedulerFactory.getScheduler();
			buildSetRegtionScheduler(setRegtionJobScheduler);
			setRegtionJobScheduler.start();
			
			Scheduler getRegtionJobScheduler = schedulerFactory.getScheduler();
			buildGetRegtionScheduler(getRegtionJobScheduler);
			getRegtionJobScheduler.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * 获得地图需要的信息 30分钟执行一次
	 * @param scheduler
	 * @throws Exception
	 */
	public void buildGetRegtionScheduler(Scheduler scheduler) throws Exception {
		JobDetail job = JobBuilder.newJob(GetRegtionTaskJob.class).withIdentity("GetRegtionTaskJob").build();
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity(new TriggerKey("GetRegtionTaskJob", REGTION_JOB_GROUP)).startNow()
				.withSchedule(SimpleScheduleBuilder.repeatMinutelyForever(30))
			    .build();
		scheduler.scheduleJob(job, trigger);
	}

	
	/**
	 * 获得公司位置信息  20分钟执行一次
	 * @param scheduler
	 * @throws Exception
	 */
	public void buildSetRegtionScheduler(Scheduler scheduler) throws Exception {
		JobDetail job = JobBuilder.newJob(SetRegtionTaskJob.class).withIdentity("SetRegtionTaskJob").build();
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity(new TriggerKey("SetRegtionTaskJob", REGTION_JOB_GROUP)).startNow()
				.withSchedule(SimpleScheduleBuilder.repeatMinutelyForever(20)) 
			    .build();
		scheduler.scheduleJob(job, trigger);
	}




	

}
