package com.igreen.boss.test;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PermitTest {

    @Test
    public void test() throws IOException {
        String url = "http://permit.mee.gov.cn/permitExt/syssb/xkgg/xkgg!licenseInformation.action";
        Map<String,Object> param = new HashMap<>();
        Connection con = Jsoup.connect(url);
        con.data("page.pageNo", 1+"");
        Document doc = con.post();

    }
}
