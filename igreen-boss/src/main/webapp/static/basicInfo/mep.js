
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#cleanCompany").jqGrid({
		url : '../basicInfo/cleanCompanyList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>年份</b>','<b>批次</b>','<b>城市</b>','<b>编号</b>','<b>公司名称</b>','<b>行业</b>','<b>主要产品及年产量</b>','<b>所属地区</b>','<b>地址</b>','<b>公布时间</b>','<b>提交审核时间</b>','<b>完成评估时间</b>','<b>完成验收时间</b>','<b>审核咨询机构名称</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'year',index:'year', width:40,sortable:false},
					{name:'batchNo',index:'batchNo', width:20,sortable:false},
					{name:'city',index:'city', width:40,sortable:false}, 
					{name:'serialNumber',index:'serialNumber', width:100,sortable:false},
					{name:'companyName',index:'companyName', width:200,sortable:false},
					{name:'trade',index:'trade', width:50,sortable:false},
					{name:'productSalesAmount',index:'productSalesAmount', width:120,sortable:false},
					{name:'region',index:'region', width:80,sortable:false},
					{name:'address',index:'address', width:80,sortable:false},
					{name:'reportTime',index:'reportTime', width:40,sortable:false},
					{name:'submitCheckTime',index:'submitCheckTime', width:40,sortable:false},
					{name:'completeEstimateTime',index:'completeEstimateTime', width:40,sortable:false},
					{name:'completeCheckTime',index:'completeCheckTime', width:40,sortable:false},
					{name:'checkOrganization',index:'checkOrganization', width:80,sortable:false}
		           ],
		rowNum : 10,//一页显示多少条
		rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
		pager : '#cleanCompanyPager',//表格页脚的占位符(一般是div)的id
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
	    prmNames:{
	    	page:'currentPage',
	    	rows:'pageRows'
	    },
		caption : "环保部清洁生产企业"//表格的标题名字
	});
	
	jQuery("#monitorCompany").jqGrid({
		url : '../basicInfo/monitorCompanyList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>序号</b>','<b>行政区划代码</b>','<b>法人代码</b>','<b>企业名称</b>','<b>监控类别</b>','<b>所属省份</b>','<b>所属年份</b>'],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'monitorSequence',index:'monitorSequence', width:20,sortable:false},
					{name:'regionCode',index:'regionCode', width:60,sortable:false},
					{name:'legalPersonCode',index:'legalPersonCode', width:80,sortable:false}, 
					{name:'companyName',index:'companyName', width:200,sortable:false},
					{name:'monitorType',index:'monitorType', width:60,sortable:false},
					{name:'province',index:'province', width:50,sortable:false},
					{name:'monitorYear',index:'monitorYear', width:20,sortable:false}
		           ],
		rowNum : 10,//一页显示多少条
		rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
		pager : '#monitorCompanyPager',//表格页脚的占位符(一般是div)的id
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
	    prmNames:{
	    	page:'currentPage',
	    	rows:'pageRows'
	    },
		caption : "国家重点监管企业"//表格的标题名字
	});
	
	jQuery("#report").jqGrid({
		url : '../basicInfo/reportList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>序号</b>','<b>年份</b>','<b>月份</b>','<b>省份</b>','<b>涉及企业</b>','<b>存在问题</b>','<b>处理情况</b>','<b>备注</b>'],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'reportSequence',index:'reportSequence', width:20,sortable:false},
					{name:'reportYear',index:'reportYear', width:20,sortable:false},
					{name:'reportMonth',index:'reportMonth', width:20,sortable:false}, 
					{name:'province',index:'province', width:20,sortable:false},
					{name:'companyName',index:'companyName', width:100,sortable:false},
					{name:'reportIssue',index:'reportIssue', width:100,sortable:false},
					{name:'dealResult',index:'dealResult', width:200,sortable:false},
					{name:'reportComment',index:'reportComment', width:120,sortable:false}
		           ],
		rowNum : 10,//一页显示多少条
		rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
		pager : '#reportPager',//表格页脚的占位符(一般是div)的id
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
	    prmNames:{
	    	page:'currentPage',
	    	rows:'pageRows'
	    },
		caption : "环保举报热线群众举报案件"//表格的标题名字
	});
	
	$("#search").click(function(){
		var sourceValue = $('#mepSource').val();//这就是selected的值 
		var searchName = $('#searchName').val();
		if(sourceValue == "1"){
			var year = $('#cleanYear').val();
			var batchNo = $('#cleanBatchNo').val();
			var city = $('#cleanCity').val();
			var serialNumber = $('#cleanSerialNumber').val();
			var companyName = $('#cleanCompanyName').val();
			var trade = $('#cleanTrade').val();
			var productSalesAmount = $('#cleanProductSalesAmount').val();
			var region = $('#cleanRegion').val();
			var address = $('#cleanAddress').val();
			var reportTime = $('#cleanReportTime').val();
			var submitCheckTime = $('#cleanSubmitCheckTime').val();
			var completeEstimateTime = $('#cleanCompleteEstimateTime').val();
			var completeCheckTime = $('#cleanCompleteCheckTime').val();
			var checkOrganization = $('#cleanCheckOrganization').val();
			
			var params = {year:year,batchNo:batchNo,city:city,serialNumber:serialNumber,
						  companyName:companyName,trade:trade,productSalesAmount:productSalesAmount,
						  region:region,address:address,reportTime:reportTime,submitCheckTime:submitCheckTime,
						  completeEstimateTime:completeEstimateTime,completeCheckTime:completeCheckTime,
						  checkOrganization:checkOrganization}
			
			$("#cleanCompany").jqGrid("setGridParam",{postData:params,page:1} );//设置查询参数
			$("#cleanCompany").trigger("reloadGrid");
		}else if(sourceValue == "2"){
			var monitorSequence = $('#monSequence').val();
			var regionCode = $('#monRegionCode').val();
			var legalPersonCode = $('#monLegalPersonCode').val();
			var companyName = $('#monCompanyName').val();
			var monitorType = $('#monType').val();
			var province = $('#monProvince').val();
			var monitorYear = $('#monYear').val();
			
			
			var params = {monitorSequence:monitorSequence,regionCode:regionCode,legalPersonCode:legalPersonCode,
						  companyName:companyName,
						  monitorType:monitorType,province:province,monitorYear:monitorYear}
			$("#monitorCompany").jqGrid("setGridParam",{postData:params,page:1} );//设置查询参数
			$("#monitorCompany").trigger("reloadGrid");
		}else if(sourceValue == "3"){
			var reportSequence = $('#reSequence').val();
			var reportYear = $('#reYear').val();
			var reportMonth = $('#reMonth').val();
			var province = $('#reProvince').val();
			var companyName = $('#reCompany').val();
			var reportIssue = $('#reProblem').val();
			var dealResult = $('#reDetail').val();
			
			var params = {reportSequence:reportSequence,reportYear:reportYear,reportMonth:reportMonth,
					province:province,
					companyName:companyName,reportIssue:reportIssue,dealResult:dealResult}
			$("#report").jqGrid("setGridParam",{postData:params,page:1} );//设置查询参数
			$("#report").trigger("reloadGrid");
		}
	});
	
	$('#mepSource').change(function(){
		var sourceValue = $(this).val();//这就是selected的值 
		if(sourceValue == "1"){
			$('#clean').show( );
			$('#monitor').hide( );
			$('#re').hide( );
			
			$("#cleanCom").show( );
			$("#monitorCom").hide( );
			$("#reCom").hide( );
			
			$('input[name="cleanfield"]').each(function(){$(this).val('');})
		}else if(sourceValue == "2"){
			$('#clean').hide( );
			$('#monitor').show( );
			$('#re').hide( );
			
			$("#cleanCom").hide( );
			$("#monitorCom").show( );
			$("#reCom").hide( );
			
			$('input[name="monfield"]').each(function(){$(this).val('');})
		}else if(sourceValue == "3"){
			$('#clean').hide( );
			$('#monitor').hide( );
			$('#re').show( );
			
			$("#cleanCom").hide( );
			$("#monitorCom").hide( );
			$("#reCom").show( );
			
			$('input[name="refield"]').each(function(){$(this).val('');})
		}
    }) 
    
    $("#mepSource").trigger("select");
	$('#clean').show( );
	$('#monitor').hide( );
	$('#re').hide( );
	
	$("#cleanCom").show( );
	$("#monitorCom").hide( );
	$("#reCom").hide( );
});


