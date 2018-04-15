package com.igreen.boss.task;

import com.igreen.boss.service.crawler.CsrareResultService;
import com.igreen.boss.service.task.CsrareWebRun;
import com.igreen.common.model.WebCrawlerConfig;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.Date;

@Component
public class CrawlerWebTask {

	@Resource
	private CsrareResultService resultService;

	/**
	 *  每个月的16号和26号，凌晨2点爬取环保部数据
	 */
	@Scheduled(cron="0 0 2 15,26 * ?")
	public void AirQualitySpider( ){
		WebCrawlerConfig commonPageBean = new WebCrawlerConfig();
		commonPageBean.setId(1);
		commonPageBean.setWebName("合规网");
		commonPageBean.setWebDomain("csrcare");
		commonPageBean.setWebSearchUrl("http://www.csrcare.com/Law");
		commonPageBean.setPageUrlRegular("http://www.csrcare.com/Law?page=${page}");
		commonPageBean.setPageType("1");
		commonPageBean.setPageReqMethod("1");
		commonPageBean.setPageResult("a:contains(尾页)");
		commonPageBean.setDetailUrlRegular("http://www.csrcare.com/Law/Show\\?id=\\d+");
		commonPageBean.setDetailTitleRegular("//h1[@class='fgtitle']/tidyText()");
		commonPageBean.setCreatedTime(new Date());
		commonPageBean.setUpdatedTime(new Date());
		/*commonPageBean.setMaxPage(1);*/
		commonPageBean.setStartPage(0);
		commonPageBean.setAttrType("attr");
		commonPageBean.setAttrName("href");
		commonPageBean.setDetailContentRegular("//div[@class='show']/html()");

		CsrareWebRun comm = new CsrareWebRun(commonPageBean, resultService);

		comm.start();

	}
}
