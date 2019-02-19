package com.igreen.boss.task;

import com.igreen.boss.service.crawler.CrawlerConfigIpeService;
import com.igreen.boss.service.crawler.CrawlerResultIpeService;
import com.igreen.boss.util.CommonPageIpeProcessor;
import com.igreen.common.model.WebCrawlerConfigIpe;
import com.igreen.common.util.ListRange;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import javax.annotation.Resource;
import java.util.Iterator;
import java.util.concurrent.*;

/**
 * IPE 爬虫增量
 */
@Component
public class CrawlerWebIpeTask {

	// 固定页码
	private static final int PAGE_NUM_FIXED = 1;
	/**
	 * 每页条数
	 */
	private static final int PAGE_ROWS = 15;

	@Resource
	private CrawlerConfigIpeService configService;
	@Resource
	private CrawlerResultIpeService resultIpeService;

	/**
	 *  每个月的16号和26号，凌晨2点爬取环保部数据
	 */
	@Scheduled(cron="0 0 2 10,26 * ?")
	public void AirQualitySpider( ){
		int count = configService.configCount(null);
		final int totalPage = count / PAGE_ROWS + count % PAGE_ROWS;

		for(int i = 1; i < totalPage + 1; i++){

			ExecutorService executorService = Executors.newFixedThreadPool(PAGE_ROWS);
			CompletionService<String> executorCompletionService = new ExecutorCompletionService<String>(executorService);
			ListRange range = configService.configList(null,i,PAGE_ROWS);
			if(range != null && !CollectionUtils.isEmpty(range.getRows())){
				Iterator<WebCrawlerConfigIpe> iterator = (Iterator<WebCrawlerConfigIpe>) range.getRows().iterator();
				while (iterator.hasNext()){
					final WebCrawlerConfigIpe temp = iterator.next();
					temp.setPageUrlRegular(temp.getPageUrlRegular());
					temp.setWebSearchUrl(temp.getWebSearchUrl());
					temp.setMaxPage(3);
					Callable<String> call = new Callable<String>() {
						@Override
						public String call() throws Exception {
							CommonPageIpeProcessor comm = new CommonPageIpeProcessor(temp, resultIpeService, PAGE_NUM_FIXED);
							comm.startCrawler();
							return "success";
						}
					};
					executorCompletionService.submit(call);

				}
				try {
					for (int k = 0 ; k < range.getRows().size(); k ++){
						executorCompletionService.take();
					}
					executorService.shutdown();
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
