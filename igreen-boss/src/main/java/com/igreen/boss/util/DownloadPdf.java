package com.igreen.boss.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Downloads
 *
 * @author
 *
 */
public class DownloadPdf {

    /**
     * @param args
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        String domain = "http://www.csrcare.com/";
        String p = "master law\\法规\\法规性文件GW\\GW1000-000919-2018电器电子产品有害物质限制使用达标管理目录(第一批)、达标管理目录限用物质应用例外清单.pdf";
        String url = domain + URLEncoder.encode(p, "utf-8").replaceAll("\\+", "%20");
        downloadAndSave(url, p.substring(p.lastIndexOf("\\")));
        System.out.println("恭喜你，全部下载成功！");
    }

    /**
     * 从网页中读取文件名列表 
     *
     * @param urlString
     * @return
     */
    public static String[] readList(String urlString) {

        String[] lists = new String[6734];
        try {
            URL url = new URL(urlString);
            Scanner scanner = new Scanner(url.openStream());
            int i = 0;
            int up = 6960; // 226  
            while (scanner.hasNextLine() && i < up) {
                String line = scanner.nextLine();
                if (i >= 226) {
                    lists[i - 226] = dealString(line);
                }
                i++;
            }
            scanner.close();
        } catch (MalformedURLException e) {
            System.out.println("URL格式出错，请检查");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(lists[0]);
        System.out.println(lists[6733]);
        return lists;

    }

    /**
     * 从网页的<li>元素中提取文件名 
     *
     * @param source
     *            待处理的<li>元素 
     * @return 处理后的文件名
     */
    public static String dealString(String source) {
        String string = source;
        String result = string;
        String patterString = ">\\s.+.pdf";
        Pattern pattern = Pattern.compile(patterString);
        Matcher macher = pattern.matcher(string);
        while (macher.find()) {
            int start = macher.start();
            int end = macher.end();
            result = string.substring(start, end);
        }
        result = result.substring(2, result.length());
        return result;
    }

    /**
     * @param source
     *            the url of PDF to be downloaded 
     * @param destination
     *            the destination to be saved 
     */
    public static void downloadAndSave(String source, String destination){
        try {
            URL url = new URL(source);
            url.openConnection().addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
            File file = new File(destination);
            FileUtils.copyURLToFile(url, file);
            System.out.println(source + "下载完成");
        } catch (MalformedURLException e) {
            System.out.println("URL格式出错，请检查");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("I/O 错误");
            e.printStackTrace();
        }
    }

}  