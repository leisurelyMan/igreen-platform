package com.igreen.boss.util;

import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.client.transport.TransportClient;

public class ElasticSearchUtil {

	public static boolean deleteById(TransportClient client, String index, String type, String id) {
		DeleteResponse dResponse = client.prepareDelete(index, type, id).execute().actionGet();
		if ("OK".equals(dResponse.status())) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
