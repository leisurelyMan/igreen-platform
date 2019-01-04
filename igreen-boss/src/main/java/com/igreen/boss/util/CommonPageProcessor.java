package com.igreen.boss.util;

import org.eclipse.jetty.util.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.igreen.boss.service.crawler.CrawlerResultService;
import com.igreen.common.model.WebCrawlerConfig;
import com.igreen.common.model.WebCrawlerResult;
import org.springframework.util.StringUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class CommonPageProcessor  implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    private WebCrawlerConfig config;

    private CrawlerResultService resultService;
    
    // 保存地址
    private static final String DISK_PATH = "/data/files/";
    // 访问地址http
    private  static final String VISIT_PATH = "http://img.igreenbank.cn/html/";

    private  static final String IMAGE_VISIT_PATH = "http://img.igreenbank.cn/";
    
    private int pageNumber;

    public CommonPageProcessor(WebCrawlerConfig config, CrawlerResultService resultService, int pageNumber){
        this.config = config;
        this.resultService = resultService;
        this.pageNumber = pageNumber;
    }

    @Override
    public void process(Page page) {

        String detailUrl = config.getDetailUrlRegular();
        String[] urls = detailUrl.split("@");
        for(String url : urls){
            page.addTargetRequests(page.getHtml().links().regex(url).all());
        }

        String title = null;
        String[] detailTitles = config.getDetailTitleRegular().split("#");
        for(String detailTitle : detailTitles){
            title = page.getHtml().xpath(detailTitle).toString();
            if(!StringUtil.isBlank(title)){
                break;
            }
        }

        if(StringUtil.isBlank(title)){
            //skip this page
            page.setSkip(true);
            return;
        }

        try {
            String url = page.getUrl().toString();
            String name = url.substring(url.lastIndexOf("/")+1);
            String fileName = "";
            if(StringUtil.isBlank(name)){
                fileName = UUID.randomUUID() + ".html";
            }else if(name.contains(".")){
                fileName = name.substring(0, name.indexOf(".")) + ".html";
            } else if(fileName.contains("=")){
                fileName = name.substring(name.indexOf("=")) + ".html";
            } else {
                fileName = name.length() > 30 ? UUID.randomUUID().toString() : name + ".html";
            }
            String disk = DISK_PATH + config.getWebDomain() + "/";

            String content = null;
            String selectQue = "";
            String[] contentRegs = config.getDetailContentRegular().split("#");
            for(String contentReg : contentRegs){
                content = page.getHtml().xpath(contentReg).toString();
                if(!StringUtil.isBlank(content)){
                    selectQue = contentReg.substring(0, contentReg.lastIndexOf("/")).replaceAll("//", "").replaceAll("@", "").replaceAll("/", " ") + " ";
                    break;
                }
            }

            Html html = page.getHtml();
            Elements eles =  html.getDocument().getAllElements();
            WebCrawlerResult result = new WebCrawlerResult();
            Elements imgs = eles.get(0).select(selectQue + "img");
            if(imgs != null && imgs.size() > 0){
                for(Element img : imgs){
                    String src = img.attr("src");
                    String sourcePath = "";
                    String source = "";
                    if(!src.contains("http://") && !src.contains("http://")){
                        if(src.contains("./")){ // 图片在当前目录
                            sourcePath = url.substring(0, url.lastIndexOf("/")) + "/";
                        } else {
                            String temp = url.replaceAll("http://", "").replaceAll("http://", "");
                            sourcePath = "http://" + (temp.contains("/") ? temp.substring(0, temp.indexOf("/")) : temp) + "/";
                        }
                        source =sourcePath + src;
                    } else {
                        source = src;
                    }

                    String imageFile = (config.getWebDomain().contains(".") ? config.getWebDomain().split("\\.")[1] : config.getWebDomain()) + "/img/"+ src.substring(src.lastIndexOf("//") + 1);
                    String diskPath = DISK_PATH + imageFile;
                    DownloadPdf.downloadAndSave(source, diskPath);
                    /*result.setAttachmentPath(diskPath);*/
                    content = content.replace(src, IMAGE_VISIT_PATH + imageFile);
                }

            }
            fileOut(disk, fileName, content);

        	result.setWebName(config.getWebName());
            result.setWebDetailName(title);
            result.setWebDomain(config.getWebDomain());
            result.setWebDetailUrl(url);
            result.setWebDetailResultUrl(VISIT_PATH + (config.getWebDomain().contains(".") ? config.getWebDomain().split("\\.")[1] : config.getWebDomain())  + "/" + fileName);
            result.setSavePath(disk + fileName);
            result.setSearchId(config.getSearchId());
            result.setSearchName(config.getSearchName());
            result.setArea(config.getArea());
            result.setCity(config.getCity());
            result.setSourceType(config.getSourceType());
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

    public  void startCrawler() {
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        Html html = httpClientDownloader.download(config.getWebSearchUrl().replace("${page}", config.getStartPage().toString()));
        Elements eles =  html.getDocument().getAllElements();
        //System.out.println(html);
        if(!eles.isEmpty()){
            String pageParam = "0";
            if("attr".equals(config.getAttrType())){
                pageParam = getElementByConfig(eles,config.getPageResult()).attr(config.getAttrName());
            } else if("text".equals(config.getAttrType())){
                String num = getElementByConfig(eles,config.getPageResult()).text();
                pageParam = StringUtils.trimAllWhitespace(StringUtil.isBlank(num) ? "0" : num.replaceAll(" ", ""));
            } else if("href".equals(config.getAttrType())){
                String href = getElementByConfig(eles,config.getPageResult()).attr(config.getAttrType());
                if(!StringUtil.isBlank(href)){
                    href = href.substring(href.indexOf("?") + 1);
                    if(!StringUtil.isBlank(href)){
                        String[] hreArr = href.contains("&") ? href.split("&") : new String[]{href};
                        for(String hre : hreArr){
                            String hres = StringUtils.trimAllWhitespace(hre).replace(" ", "");
                            if(hres.contains(config.getAttrName())){
                                pageParam = hres.replace(config.getAttrName(), "");
                                break;
                            }
                        }
                    }
                }
            }

            int total = 0;
            if(!StringUtil.isBlank(config.getReplaceRegular())){
                total = Integer.parseInt(pageParam.replaceAll(config.getReplaceRegular(), ""));
            } else {
                total = Integer.parseInt(pageParam);
            }

            if("1".equals(config.getPageType())){ //已知总条数
                int pageSize = config.getMaxPage(); //已知总条数时，代表每页条数
                if(pageSize > 0){
                    total = total / pageSize + (total % pageSize > 0 ? 1 : 0);
                }
            }

            if(config.getMaxPage() != null && config.getMaxPage() != 0){
                total =  total > config.getMaxPage() ? config.getMaxPage() : total;
            }
            for(int i = 0; i < total; i ++){
                Spider spider = Spider.create(new CommonPageProcessor(config, resultService, pageNumber));
                //System.out.println("total is :" + i + "==URL===:" + config.getPageUrlRegular().replace("${page}", String.valueOf(i)));
                spider.addUrl(config.getPageUrlRegular().replace("${page}", String.valueOf(i)));
                spider.run();
            }
        }
    }

    private Elements getElementByConfig(Elements eles, String pageResult){
        Elements element = null;
        if(pageResult.contains("@last")){
            element = eles.get(0).select(config.getPageResult().replace("@last", "")).last().getAllElements();
        } else {
            element = eles.get(0).select(config.getPageResult());
        }
        return element;
    }

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

    
}
