package com.igreen.boss.service.impl.es;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.elasticsearch.action.admin.indices.analyze.AnalyzeAction;
import org.elasticsearch.action.admin.indices.analyze.AnalyzeRequestBuilder;
import org.elasticsearch.action.admin.indices.analyze.AnalyzeResponse.AnalyzeToken;
import org.elasticsearch.action.bulk.BulkItemResponse;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.script.ScriptType;
import org.elasticsearch.script.mustache.SearchTemplateRequestBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.igreen.boss.dto.IpeSearchDto;
import com.igreen.boss.service.es.IpeIndustrySearch;
import com.igreen.boss.service.es.WordFrequencyService;
import com.igreen.boss.util.FileUtil;
import com.igreen.common.dao.IpeElasticsearchMapper;
import com.igreen.common.dao.IpeIndustryRecordMapper;
import com.igreen.common.dao.RegistItemMapper;
import com.igreen.common.dto.IpeIndustryDto;
import com.igreen.common.model.IpeElasticsearch;
import com.igreen.common.model.IpeIndustryRecord;
import com.igreen.common.model.RegistItem;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.StrUtil;

@Service
public class IpeIndustrySearchImpl implements IpeIndustrySearch {
	
	@Resource
	IpeElasticsearchMapper ipeElasticsearchMapper;
	
	@Resource
	IpeIndustryRecordMapper ipeIndustryRecordMapper;
	
	@Resource
	WordFrequencyService wordFrequencyService;
	
	@Resource
	RegistItemMapper registItemMapper;

	private static String CLUSTER_NAME = "elasticsearch";
	
	private static String INDEX = "igreen_ipe";
	
	private static String TYPE = "ipe_type";
	
	private static String FILE_PATH="/opt/files/ipe/";
	
	
	@Override
	public ListRange ipeIndustryList(IpeSearchDto dto, Integer currentPage, Integer pageRows) throws Exception{
		Settings settings = Settings.builder()
				.put("cluster.name", CLUSTER_NAME)
				.build();
		
		TransportClient client = new PreBuiltTransportClient(settings)
				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300)); 
	
		System.out.println(dto.getArray());
		Map<String, Object> scriptParams = new HashMap<String, Object>();
		scriptParams.put("from", (currentPage-1)*pageRows);
		scriptParams.put("size", pageRows);
		scriptParams.put("fields", dto.getArray());
		if(!StrUtil.isNull(dto.getAddress()))
			scriptParams.put("companyName", dto.getAddress());
		
		SearchResponse searchResponse = new SearchTemplateRequestBuilder(client)
				.setScript("mul_match")
				.setScriptType(ScriptType.FILE)
				.setScriptParams(scriptParams)
				.setRequest(new SearchRequest(INDEX).types(TYPE))
				.get()
				.getResponse();
		List<IpeIndustryDto> list = new ArrayList<IpeIndustryDto>();
		for(SearchHit searchHit : searchResponse.getHits().getHits()) {
			//System.out.println(searchHit.getSourceAsString());
			IpeIndustryDto ipe = JSONObject.parseObject(searchHit.getSourceAsString(), IpeIndustryDto.class);
			list.add(ipe);
		}
		
		ListRange result = new ListRange(list,
				(int)searchResponse.getHits().getTotalHits(), currentPage, pageRows);
		client.close();
		return result;
	}

	@Override
	public void bulkAdd() throws Exception{
		
		int maxId = ipeElasticsearchMapper.selectMaxIpeId();
		
		List<IpeIndustryRecord> records = ipeIndustryRecordMapper.selectRecordById(maxId);
		maxId = records.get(records.size()-1).getId();
		Settings settings = Settings.builder()
				.put("cluster.name", CLUSTER_NAME)
				.build();
		
		TransportClient client = new PreBuiltTransportClient(settings)
				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300)); 
		
		while(records != null && records.size() >0){
			addData(records, client,maxId);
			records = ipeIndustryRecordMapper.selectRecordById(maxId);
			//if(records != null && records.size() >0)
				//maxId = records.get(records.size()-1).getId();
		}
		
		client.close();
	}

	private void addData(List<IpeIndustryRecord> records, TransportClient client,int maxId) throws IOException {
		
		BulkRequestBuilder bulkRequestBuilder = client.prepareBulk();
		for(IpeIndustryRecord record : records){
			if(record.getId().intValue() > maxId)
				maxId = record.getId().intValue();
			RegistItem item = registItemMapper.selectByPrimaryKey(record.getRegistItemId());
			String filestr = FileUtil.readFile(FILE_PATH+record.getFileName());
			IndexRequestBuilder indexRequestBuilder = client.prepareIndex(INDEX, TYPE, record.getId().toString()) 
					.setSource(XContentFactory.jsonBuilder()
								.startObject()
									.field("id", record.getId())
									.field("companyName", record.getCompanyName())
									.field("registItemId", record.getRegistItemId())
									.field("year", record.getYear())
									.field("title", record.getTitle())
									.field("ipeId", record.getIpeId())
									.field("fileName", record.getFileName())
									.field("createdTime", record.getCreatedTime())
									.field("address", item.getAddress())
									.field("tradeName", item.getTradeName())
									.field("ipeField", filestr)
								.endObject());
			bulkRequestBuilder.add(indexRequestBuilder);
			BulkResponse bulkResponse = bulkRequestBuilder.get();
			
			for(BulkItemResponse bulkItemResponse : bulkResponse.getItems()) {
				IpeElasticsearch es = new IpeElasticsearch();
				es.setEsId(Integer.parseInt(bulkItemResponse.getId()));
				es.setCreatedTime(new Date());
				ipeElasticsearchMapper.insertSelective(es);
			}
			ananyziWord(client,filestr);
			
		}
	}

	private void ananyziWord(TransportClient client,String filestr) {
		AnalyzeRequestBuilder analyzeRequestBuilder = new AnalyzeRequestBuilder(client, AnalyzeAction.INSTANCE, "igreen_ipe", filestr);
		analyzeRequestBuilder.setAnalyzer("igreen_ik");
		List<AnalyzeToken> listAnalysis = analyzeRequestBuilder.execute().actionGet().getTokens();
		System.out.println(JSON.toJSONString(listAnalysis));
		for(AnalyzeToken analyzeToken : listAnalysis){
			wordFrequencyService.updateTimes(analyzeToken.getTerm());
		}
	}

	@Override
	public void addAnalyze(Integer startId,Integer endId) throws Exception {
		Settings settings = Settings.builder()
				.put("cluster.name", CLUSTER_NAME)
				.build();
		TransportClient client = new PreBuiltTransportClient(settings)
				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300)); 
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startId", startId);
		map.put("endId", endId);
		List<IpeIndustryRecord> records = ipeIndustryRecordMapper.selectById(map);
		for(IpeIndustryRecord record:records){
			String filestr = FileUtil.readFile(FILE_PATH+record.getFileName());
			ananyziWord(client,filestr);
		}
		client.close();
	}


	
}
