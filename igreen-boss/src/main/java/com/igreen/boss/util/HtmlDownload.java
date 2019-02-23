package com.igreen.boss.util;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.selector.Html;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * 页面下载工具
 * @author chenxy
 */
public class HtmlDownload {

    /**
     * 需要下载的附件类型
      */
    private static final String[] FILE_SUFFIXS = new String[]{".doc",".docx",".pdf",".jpg",".xls",".xlsx",".zip",".rar",".DOC",".DOCX",".PDF",".JPG",".XLS",".XLSX"};
    public static final List<String> FILE_LIST =  Arrays.asList(FILE_SUFFIXS);

    /**
     * 保存地址
     */
    public static final String DISK_PATH = "/data/files/";
    public static final String IMAGE_VISIT_PATH = "http://img.igreenbank.cn/";

    /**
     * 访问地址http
     */
    public  static final String VISIT_PATH = "http://img.igreenbank.cn/html/";

    /**
     * 根据入参url 下载页面
     * @param url
     * @return
     */
    public static String download(String url) {
        String returnUrl = null;
        try {
            HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
            Html html = httpClientDownloader.download(url);
            Elements eles =  html.getDocument().getAllElements();
            URI uri = getIP(url);

            if(eles != null && eles.size() > 0) {
                String fileName = getFileName(url);
                String domain = uri != null ? uri.getHost() : null;
                String content = crawlerFiles("body ", eles, url, eles.html(), domain);
                String disk = DISK_PATH + domain + "/";
                fileOut(disk, getFileName(url), content);

                returnUrl = VISIT_PATH + (domain.contains(".") ? domain.split("\\.")[1] : domain)  + "/" + fileName;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return returnUrl;
    }

    /**
     *
     * @param url
     * @return
     */
    public static String getFileName(String url) {
        String name = url.substring(url.lastIndexOf("/")+1);
        String fileName = "";
        if(StringUtil.isBlank(name)){
            fileName = UUID.randomUUID() + ".html";
        }else if(name.contains(".")){
            fileName = name.substring(0, name.indexOf(".")) + Math.random() + ".html";
        } else if(fileName.contains("=")){
            fileName = name.substring(name.indexOf("="))  + Math.random() + ".html";
        } else {
            fileName = name.length() > 30 ? UUID.randomUUID().toString() : name + ".html";
        }
        return fileName;
    }

    /**
     * 下载内容中的附件
     * @param selectQue
     * @param eles
     * @param url
     * @param content
     * @return
     */
    private static String crawlerFiles(String selectQue, Elements eles, String url, String content, String domain) {

        try {
            Elements files = eles.get(0).select(selectQue + "a");
            if(files != null && files.size() > 0){
                for(Element file : files){
                    String sourcePath = "";
                    String source = "";
                    String href = file.attr("href");

                    String suffix = getFileSuffix(href);
                    if(StringUtils.isEmpty(suffix)) {
                        return content;
                    }

                    if(!href.contains("http://") && !href.contains("http://")){
                        if(href.contains("./")){ // 附件在当前目录
                            sourcePath = url.substring(0, url.lastIndexOf("/")) + "/";
                        } else {
                            String temp = url.replaceAll("http://", "").replaceAll("http://", "");
                            sourcePath = "http://" + (temp.contains("/") ? temp.substring(0, temp.indexOf("/")) : temp) + "/";
                        }
                        source =sourcePath + href;
                    } else {
                        source = href;
                    }

                    String imageFile = (domain.contains(".") ? domain.split("\\.")[1] : domain) + "/" + suffix.replaceAll(".", "").toLowerCase()+ "/"+ href.substring(href.lastIndexOf("//") + 1);
                    String diskPath = DISK_PATH + imageFile;
                    DownloadPdf.downloadAndSave(source, diskPath);
                    content = content.replace(href, IMAGE_VISIT_PATH + imageFile);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return content;
    }

    /**
     * 是否存在附件
     * @return
     */
    private static String getFileSuffix(String href) {
        String suffix = null;
        for (String fileStr : HtmlDownload.FILE_LIST) {
            if(href.contains(fileStr)) {
                suffix = fileStr;
                break;
            }
        }

        return suffix;
    }

    /**
     * 获取地址域名
     * @param url
     * @return
     */
    private static URI getIP(String url) {
        URI effectiveURI = null;
        try {
            URI uri = URI.create(url);
            effectiveURI = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), null, null, null);
        } catch (Throwable var4) {
            var4.printStackTrace();
            effectiveURI = null;
        }

        return effectiveURI;
    }

    public static void fileOut(String disk, String fileName, String content){
        fileName = fileName.replace("?","");
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

    public static void main(String[] args) {
        System.out.println(download("https://www.cnblogs.com/ningvsban/p/3590722.html"));
    }
}
