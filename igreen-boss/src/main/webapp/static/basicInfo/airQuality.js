
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#airQualityTable").jqGrid({
		url : '../basicInfo/airQualityList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>日期</b>','<b>城市</b>','<b>AQI指数</b>','<b>首要污染物</b>','<b>空气质量级别</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'recordDataStr',index:'recordDataStr', width:40,sortable:false},
					{name:'city',index:'city', width:20,sortable:false},
					{name:'airQualityIndex',index:'airQualityIndex', width:40,sortable:false}, 
					{name:'mainPollutant',index:'mainPollutant', width:100,sortable:false},
					{name:'status',index:'status', width:200,sortable:false}
		           ],
		rowNum : 20,//一页显示多少条
		rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
		pager : '#airQualityPagin',//表格页脚的占位符(一般是div)的id
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
	    prmNames:{
	    	page:'currentPage',
	    	rows:'pageRows'
	    },
		caption : "空气质量日报分析"//表格的标题名字
	});
	
	$("#search").click(function(){
		var recordDate = $('#recordDate').val();
		var city = $('#city').val();
		var mainPollutant = $('#mainPollutant').val();
		var status = $('#status').val();
			
		var params = {recordDate:recordDate,city:city,mainPollutant:mainPollutant,
				status:status}
			
		$("#airQualityTable").jqGrid("setGridParam",{postData:params,page:1} );//设置查询参数
		$("#airQualityTable").trigger("reloadGrid");
	});
	
	$('#recordDate').datepicker({
	      changeMonth: true,
	      changeYear: true,
	      dateFormat:"yy-mm-dd"
	    });
})
	


