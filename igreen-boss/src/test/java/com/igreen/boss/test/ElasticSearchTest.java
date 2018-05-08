package com.igreen.boss.test;

import java.io.IOException;
import java.net.InetAddress;

import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;

public class ElasticSearchTest {

	private static String CLUSTER_NAME = "elasticsearch";
	
	private static String INDEX = "ipe_search1";
	
	private static String TYPE = "ipe_type1";
	
	@Test
	public void updateTest() throws IOException{
		
		Settings settings = Settings.builder()
				.put("cluster.name", CLUSTER_NAME)
				.build();
		
		TransportClient client = new PreBuiltTransportClient(settings)
				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300)); 
				
		UpdateRequest update = new UpdateRequest(INDEX, TYPE, "4");
		update.doc(XContentFactory.jsonBuilder()
				.startObject()
				.field("industryTime", "2018-05-07")
				.field("keyWords", "{'责令停产整顿': '整顿规范'}")
				.endObject()
				).retryOnConflict(5);
		client.update(update).actionGet();
		
		client.close();
	}
}
