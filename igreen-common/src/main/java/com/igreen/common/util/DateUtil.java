package com.igreen.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/14.
 */
public class DateUtil {

    private static ThreadLocal<Map<String,SimpleDateFormat>> localFormat = new ThreadLocal<Map<String,SimpleDateFormat>>();

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


    public static String fromatDateStr(String dateStr){
        String result = "";
        if(RegularizationUtil.rularization("^\\d+{4}\\d",dateStr)){

        }


        return result;
    }




    public static void main(String[] args) {

    }
}
