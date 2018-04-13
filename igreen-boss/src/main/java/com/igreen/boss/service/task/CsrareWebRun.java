package com.igreen.boss.service.task;

import com.igreen.boss.service.crawler.CsrareResultService;
import com.igreen.boss.util.DownloadPdf;
import com.igreen.common.model.WebCrawlerConfig;
import com.igreen.common.model.WebCsrcareResult;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.select.Elements;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CsrareWebRun implements PageProcessor {

    private static ThreadLocal<Map<String,SimpleDateFormat>> localFormat = new ThreadLocal<Map<String,SimpleDateFormat>>();

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    private WebCrawlerConfig config;

    private CsrareResultService resultService;

    // 保存地址
    private static final String DISK_PATH = "/data/files/law/";
    // 访问地址http
    private  static final String VISIT_PATH = "/web/html/";
    private static final String SOURCE_DOMAIN = "http://www.csrcare.com/";

    public CsrareWebRun(WebCrawlerConfig config, CsrareResultService resultService){
        this.config = config;
        this.resultService = resultService;
    }

    @Override
    public void process(Page page) {

        page.addTargetRequests(page.getHtml().links().regex(config.getDetailUrlRegular()).all());
        //page.putField("title", page.getHtml().xpath(config.getDetailTitleRegular()).toString());
        if(page.getResultItems().get("title") == null){
            page.setSkip(true);
            return;
        }

        try {
            String url = page.getUrl().toString();
            String name = url.substring(url.lastIndexOf("/")+1);
            String fileName = name.substring(0, name.indexOf(".")) + ".html";
            String disk = DISK_PATH + config.getWebDomain() + "/";
            fileOut(disk, fileName, deleteCRLFOnce(page.getHtml().xpath(config.getDetailContentRegular()).toString()));

            Html html = page.getHtml();
            Elements eles =  html.getDocument().getAllElements();
            Elements trs = eles.get(0).select("div[class='fgxx'] tr");

            WebCsrcareResult result = new WebCsrcareResult();
            String title = page.getHtml().xpath(config.getDetailTitleRegular()).toString();
            result.setWebDetailName(title);
            if(!trs.isEmpty()){
                // 颁布机构
                String publishOrg = trs.get(0).select("td:eq(1)").text();
                result.setPublishOrg(publishOrg);

                //生效状态
                String effectStatus = trs.get(1).select("td:eq(1)").text();
                //所属类型
                String attachType = trs.get(1).select("td:eq(3)").text();
                result.setEffectStatus(effectStatus);
                result.setAttachType(attachType);

                //适用地区
                String applicationArea = trs.get(2).select("td:eq(1)").text();
                //适用领域
                String applicationDomain = trs.get(2).select("td:eq(3)").text();
                result.setApplicationArea(applicationArea);
                result.setApplicationDomain(applicationDomain);

                // 生效日期 2018/07/01
                String effectDate = trs.get(3).select("td:eq(1)").text();
                // 颁布日期 2018/03/30
                String publishDate = trs.get(3).select("td:eq(3)").text();

                result.setEffectDate(getFormatDate(effectDate.replaceAll("/", "")));
                result.setPublishDate(getFormatDate(publishDate.replaceAll("/", "")));

            }

            String pdf = eles.get(0).select("embed").attr("src");
            if(StringUtils.isNotBlank(pdf)){

                String source =SOURCE_DOMAIN + URLEncoder.encode(pdf.substring(1), "utf-8").replaceAll("\\+", "%20");
                String diskPath = DISK_PATH + config.getWebDomain() + "/pdf/"+ pdf.substring(pdf.lastIndexOf("\\"));
                DownloadPdf.downloadAndSave(source, diskPath);
                result.setAttachmentPath(diskPath);
            }


            result.setWebName(config.getWebName());
            result.setWebDetailName(page.getResultItems().get("title").toString());
            result.setWebDomain(config.getWebDomain());
            result.setWebDetailUrl(url);
            result.setWebDetailResultUrl(VISIT_PATH + config.getWebDomain() + fileName);
            result.setSavePath(disk + fileName);
            resultService.addOrEditResult(result, 0);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

    /***
     * delete CRLF; delete  empty line ;delete blank lines
     *
     * @param input
     * @return
     */
    private static String deleteCRLFOnce(String input) {

        return input.replaceAll("((\r\n)|\n)[\\s\t ]*(\\1)+", "$1");

    }

    private void fileOut(String disk, String fileName, String content){
        FileOutputStream outputStream = null;

        try{
            File file = new File(disk);
            if(!file.exists()){
                file.mkdirs();
            }
            String path = disk + fileName;
            File file2 = new File(path);
            outputStream = new FileOutputStream(file2);
            if(!file2.exists()){
                file2.createNewFile();
            }
            outputStream.write(content.getBytes());
            outputStream.flush();

        } catch (Exception e){
            e.printStackTrace();
        } finally {

            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public  void start() {
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        Html html = httpClientDownloader.download(config.getWebSearchUrl().replace("${page}", config.getStartPage().toString()));
        Elements eles =  html.getDocument().getAllElements();
        Spider spider = Spider.create(new CsrareWebRun(config, resultService));
        if(!eles.isEmpty()){
            int total = 0;
            if("attr".equals(config.getAttrType())){
                total = Integer.valueOf(eles.get(0).select(config.getPageResult()).attr(config.getAttrName()).replace("/Law?page=", ""));
            }
            for(int i = 0; i < (total > config.getMaxPage() ? config.getMaxPage() : total); i ++){
                System.out.println("total is :" + i + "==URL===:" + config.getPageUrlRegular().replace("${page}", String.valueOf(i)));
                spider.addUrl(config.getPageUrlRegular().replace("${page}", String.valueOf(i)));
            }
        }
        spider.run();
    }

    /***
     * 获取
     * @param current  yyyy-MM-dd hh:MM:ss
     * @return
     */
    public static Date getFormatDate(String current){
        SimpleDateFormat sf = simpleDateFormat("yyyyMMdd");
        try {
            return sf.parse(current);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static SimpleDateFormat simpleDateFormat(String pattern){
        Map<String,SimpleDateFormat> map = localFormat.get();
        if (map == null) {
            map = new HashMap<String, SimpleDateFormat>();
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            map.put(pattern,sdf);
            localFormat.set(map);
            return sdf;
        }else if(!map.containsKey(pattern)){
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            map.put(pattern,sdf);
            return sdf;
        }else {
            return map.get(pattern);
        }
    }
}
