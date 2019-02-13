package com.igreen.boss.util;

public class RegularTest {

    public static void main(String[] args) {
        String str = "黔东南州环境保护局行政处罚决定书（黔东南环罚[2018]10号）-贵州省岑巩县久通冶金有限公司";
        String str1 = "责令改正违法行为决定书（贵州东鑫纸业有限公司）";
        String str2 = "黔东南州环境保护局行政处罚决定书(贵州千里山生态食品股份有限公司)";
        String str3 = "黔东南环罚[2018]1号-贵州华胜投资开发集团有限公司";
        System.out.println(str.replaceAll("(\\S+号）-)|(\\S+（|）)|(\\S+\\(|\\))",""));
        System.out.println(str1.replaceAll("(\\S+（|）)|(\\S+号-)|(\\S+\\(|\\))",""));
        System.out.println(str2.replaceAll("(\\S+（|）)|(\\S+号-)|(\\S+\\(|\\))",""));
        System.out.println(str3.replaceAll("(\\S+（|）)|(\\S+号-)|(\\S+\\(|\\))",""));
    }
}
