package com.igreen.boss.service.impl.es;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.elasticsearch.action.admin.indices.analyze.AnalyzeAction;
import org.elasticsearch.action.admin.indices.analyze.AnalyzeRequestBuilder;
import org.elasticsearch.action.admin.indices.analyze.AnalyzeResponse.AnalyzeToken;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
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
	
	Logger log = Logger.getLogger(IpeIndustrySearchImpl.class);
	
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
	
	private static String FILE_PATH="/data/files/ipe/";
	
	
	@Override
	public ListRange ipeIndustryList(IpeSearchDto dto, Integer currentPage, Integer pageRows) throws Exception{
		log.info("ipeIndustryList:"+JSON.toJSONString(dto));
		Settings settings = Settings.builder()
				.put("cluster.name", CLUSTER_NAME)
				.build();
		
		TransportClient client = new PreBuiltTransportClient(settings)
				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("172.17.215.144"), 9300)); 
	
		Map<String, Object> scriptParams = new HashMap<String, Object>();
		scriptParams.put("from", (currentPage-1)*pageRows);
		scriptParams.put("size", pageRows);
		if(!dto.wordsEmpty())
			scriptParams.put("fields", dto.getArray());
/*		if(!StrUtil.isNull(dto.getAddress()))
			scriptParams.put("address", dto.getAddress());*/
		if(!StrUtil.isNull(dto.getProvince()))
			scriptParams.put("province", dto.getProvince());
		if(!StrUtil.isNull(dto.getCity()))
			scriptParams.put("city", dto.getCity());
		if(!StrUtil.isNull(dto.getDistrict()))
			scriptParams.put("district", dto.getDistrict());
		if(!StrUtil.isNull(dto.getYear()))
			scriptParams.put("year", dto.getYear());
		if(!StrUtil.isNull(dto.getCompanyName()))
			scriptParams.put("company", dto.getCompanyName().split(","));
		
/*		SearchTemplateRequestBuilder builder = new SearchTemplateRequestBuilder(client);
		builder.setScriptType(ScriptType.FILE).setScriptParams(scriptParams).setRequest(new SearchRequest(INDEX).types(TYPE));
		if(!StrUtil.isNull(dto.getAddress()) && StrUtil.isNull(dto.getYear()) && StrUtil.isNull(dto.getCompanyName()))
			builder.setScript("address_must");
		if(!StrUtil.isNull(dto.getYear()) && StrUtil.isNull(dto.getAddress()) && StrUtil.isNull(dto.getCompanyName()))
			builder.setScript("year_must");
		if(!StrUtil.isNull(dto.getCompanyName()) && StrUtil.isNull(dto.getYear()) && StrUtil.isNull(dto.getAddress()))
			builder.setScript("company_must");
		if(!StrUtil.isNull(dto.getYear()) && !StrUtil.isNull(dto.getCompanyName()) && StrUtil.isNull(dto.getAddress()))
			builder.setScript("year_company_must");
		if(!StrUtil.isNull(dto.getYear()) && !StrUtil.isNull(dto.getAddress()) && StrUtil.isNull(dto.getCompanyName()))
			builder.setScript("year_address_must");
		if(!StrUtil.isNull(dto.getAddress()) && !StrUtil.isNull(dto.getCompanyName()) && StrUtil.isNull(dto.getYear()))
			builder.setScript("company_address_must");
		if(!StrUtil.isNull(dto.getAddress()) && !StrUtil.isNull(dto.getCompanyName()) && !StrUtil.isNull(dto.getYear()))
			builder.setScript("year_company_address_must");
		else
			builder.setScript("mul_match");
		SearchResponse searchResponse = builder.get().getResponse();*/
		log.info("scriptParams="+JSON.toJSONString(scriptParams));
		String script = getScript(dto);
		log.info("script="+script);
		SearchResponse searchResponse = new SearchTemplateRequestBuilder(client)
				.setScript(script)
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
	
	
	private String getScript(IpeSearchDto dto){
		if(!StrUtil.isNull(dto.getCompanyName()) && !StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getDistrict())){//县+公司名称+时间
			return "district_company_year";
		}else if(!StrUtil.isNull(dto.getCompanyName()) && StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getDistrict())){//县+公司名称
			return "district_company";
		}else if(StrUtil.isNull(dto.getCompanyName()) && !StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getDistrict())){//县+时间
			return "district_year";
		}else if(StrUtil.isNull(dto.getCompanyName()) && StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getDistrict())){//县
			return "district";
		}else if(!StrUtil.isNull(dto.getCompanyName()) && !StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getCity())){//市+公司名称+时间
			return "city_company_year";
		}else if(!StrUtil.isNull(dto.getCompanyName()) && StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getCity())){//市+公司名称
			return "city_company";
		}else if(StrUtil.isNull(dto.getCompanyName()) && !StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getCity())){//市+时间
			return "city_year";
		}else if(StrUtil.isNull(dto.getCompanyName()) && StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getCity())){//市
			return "city";
		}else if(!StrUtil.isNull(dto.getCompanyName()) && !StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getProvince())){//省+公司名称+时间
			return "province_company_year";
		}else if(!StrUtil.isNull(dto.getCompanyName()) && StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getProvince())){//公司名称+省
			return "province_company";
		}else if(StrUtil.isNull(dto.getCompanyName()) && !StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getProvince())){//省+时间
			return "province_year";
		}else if(StrUtil.isNull(dto.getCompanyName()) && StrUtil.isNull(dto.getYear()) 
				&& !StrUtil.isNull(dto.getProvince())){//省
			return "province";
		}else if(!StrUtil.isNull(dto.getCompanyName()) && !StrUtil.isNull(dto.getYear()) 
				&& StrUtil.isNull(dto.getProvince())){//公司名称+时间
			return "company_year";
		}else if(!StrUtil.isNull(dto.getCompanyName()) && StrUtil.isNull(dto.getYear()) 
				&& StrUtil.isNull(dto.getProvince())){//公司名称
			return "company";
		}else if(StrUtil.isNull(dto.getCompanyName()) && !StrUtil.isNull(dto.getYear()) 
				&& StrUtil.isNull(dto.getProvince())){//时间
			return "year";
		}else{
			return "mul_match";
		}
		
	}

	@Override
	public void bulkAdd() throws Exception{
		
		Integer maxId = ipeElasticsearchMapper.selectMaxIpeId();
		
		List<IpeIndustryRecord> records = ipeIndustryRecordMapper.selectRecordById(maxId);
		maxId = records.get(records.size()-1).getId();
		Settings settings = Settings.builder()
				.put("cluster.name", CLUSTER_NAME)
				.build();
		
		TransportClient client = new PreBuiltTransportClient(settings)
				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("172.17.215.144"), 9300)); 
		
		while(records != null && records.size() >0){
			//addData(records, client);
			updateData(records, client);
			records = ipeIndustryRecordMapper.selectRecordById(maxId);
			if(records != null && records.size() >0)
				maxId = records.get(records.size()-1).getId();
		}
		
		client.close();
	}

	private void addData(List<IpeIndustryRecord> records, TransportClient client) throws IOException {
		
		BulkRequestBuilder bulkRequestBuilder = client.prepareBulk();
		for(IpeIndustryRecord record : records){
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
									.field("province", record.getProvince())
									.field("city", record.getCity())
									.field("district", record.getDistrict())
									.field("tradeName", item.getTradeName())
									.field("ipeField", filestr)
								.endObject());
			bulkRequestBuilder.add(indexRequestBuilder);
			BulkResponse bulkResponse = bulkRequestBuilder.get();
			
			if(bulkResponse.getItems() != null && bulkResponse.getItems().length>0){
				IpeElasticsearch es = new IpeElasticsearch();
				es.setEsId(Integer.parseInt(bulkResponse.getItems()[0].getId()));
				es.setCreatedTime(new Date());
				ipeElasticsearchMapper.insertSelective(es);
			}
/*			for(BulkItemResponse bulkItemResponse : bulkResponse.getItems()) {
				IpeElasticsearch es = new IpeElasticsearch();
				es.setEsId(Integer.parseInt(bulkItemResponse.getId()));
				es.setCreatedTime(new Date());
				ipeElasticsearchMapper.insertSelective(es);
			}*/
			//ananyziWord(client,filestr);
			
		}
	}
	
	
	private void updateData(List<IpeIndustryRecord> records, TransportClient client) throws IOException {
		
		BulkRequestBuilder bulkRequestBuilder = client.prepareBulk();
		for(IpeIndustryRecord record : records){
			RegistItem item = registItemMapper.selectByPrimaryKey(record.getRegistItemId());
			
			UpdateRequest update = new UpdateRequest(INDEX, TYPE, record.getId().toString());
			update.doc(XContentFactory.jsonBuilder()
					.startObject()
					.field("company", record.getCompanyName())
					.field("province", record.getProvince())
					.field("city", record.getCity())
					.field("district", record.getDistrict())
					.endObject()
					).retryOnConflict(5);
			client.update(update).actionGet();
			
			IpeElasticsearch es = new IpeElasticsearch();
			es.setEsId(record.getId().intValue());
			es.setCreatedTime(new Date());
			ipeElasticsearchMapper.insertSelective(es);
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
