package com.igreen.boss.util;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class OkHttpUtil {

	public static void main(String[] args) throws IOException {
		OkHttpClient client = new OkHttpClient();

		String url = "http://service.envicloud.cn:8082/v2/weatherforecast/CMF0DGXLC25HA2U2MJAXNTAZMJE3NDYZODK1/101010100";
		//String url = "http://service.envicloud.cn:8082/v2/monthlymete/BGVPC3VYZWX5BWFUMTUWMDEWNTQZOTA5MG==/101010100/2000";
		Request request = new Request.Builder()
		  .url(url)
		  .get()
		  .build();

		Response response = client.newCall(request).execute();
		System.out.println(response.code());
		System.out.println(response.body().toString());
		System.out.println(response.body().string());
	}
}
