
jQuery(document).ready(function(){
    var pollutionId = $("#pollutionId").val();//获取供应链ID
	//创建jqGrid组件
	jQuery("#list1").jqGrid({
		url : '../basicInfo/pollutionLicenseList.do?id='+pollutionId,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>发证机关</b>','<b>主要污染类别</b>','<b>大气主要污染物种类</b>',
		            '<b>大气污染物排放规律</b>','<b>大气污染物排放执行标准</b>','<b>废水主要污染物种类</b>',
		            '<b>废水污染物排放规律</b>','<b>废水污染物排放执行标准</b>','<b>排污权使用和交易信息</b>'],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'certificateOrganization',index:'certificateOrganization', width:60,sortable:false},
					{name:'pollutionType',index:'pollutionType', width:60,sortable:false},
					{name:'airPollutionType',index:'airPollutionType', width:80,sortable:false}, 
					{name:'airPollutionDischargeRule',index:'airPollutionDischargeRule', width:80,sortable:false},
					{name:'airPollutionDischargeStandard',index:'airPollutionDischargeStandard', width:80,sortable:false},
					{name:'waterPollutionType',index:'waterPollutionType', width:80,sortable:false},
					{name:'waterPollutionDischargeRule',index:'waterPollutionDischargeRule', width:80,sortable:false},
					{name:'waterPollutionDischargeStandard',index:'waterPollutionDischargeStandard', width:80,sortable:false},
					{name:'pollutionTrade',index:'pollutionTrade', width:80,sortable:false}
		           ],
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
		caption : "污染详情"//表格的标题名字
	});
	
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../basicInfo/executionRecordList.do?id='+pollutionId,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>主要内容</b>','<b>上报频次</b>','<b>其他信息</b>'],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'content',index:'content', width:80,sortable:false},
					{name:'frequency',index:'frequency', width:80,sortable:false},
					{name:'otherInfo',index:'otherInfo', width:80,sortable:false}
		           ],
        autowidth : true,
   		height: 'auto',
   		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
   		viewrecords : true,
		caption : "执行（守法）报告"//表格的标题名字
	});
	
	//创建jqGrid组件
	jQuery("#list3").jqGrid({
		url : '../basicInfo/informationDisclosureList.do?id='+pollutionId,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>主要内容</b>','<b>上报频次</b>','<b>其他信息</b>'],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'content',index:'content', width:80,sortable:false},
					{name:'frequency',index:'frequency', width:80,sortable:false},
					{name:'otherInfo',index:'otherInfo', width:80,sortable:false}
		           ],
        autowidth : true,
   		height: 'auto',
   		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
   		viewrecords : true,
		caption : "信息公开"//表格的标题名字
	});
	
	//创建jqGrid组件
	jQuery("#list4").jqGrid({
		url : '../basicInfo/managementList.do?id='+pollutionId,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>设施类别</b>','<b>操作参数</b>','<b>记录内容</b>','<b>记录频次</b>','<b>记录形式</b>'
		            ,'<b>其他信息</b>'],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'facilityType',index:'facilityType', width:80,sortable:false},
					{name:'operateParameter',index:'operateParameter', width:80,sortable:false},
					{name:'content',index:'content', width:80,sortable:false},
					{name:'frequency',index:'frequency', width:80,sortable:false},
					{name:'recordType',index:'recordType', width:80,sortable:false},
					{name:'otherInfo',index:'otherInfo', width:80,sortable:false}
		           ],
        autowidth : true,
   		height: 'auto',
   		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
   		viewrecords : true,
		caption : "环境管理台账记录要求"//表格的标题名字
	});
	
	//创建jqGrid组件
	jQuery("#list5").jqGrid({
		url : '../basicInfo/otherList.do?id='+pollutionId,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>其他控制及管理要求</b>','<b>其他许可的内容</b>'],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'managementRequirement',index:'managementRequirement', width:80,sortable:false},
					{name:'otherInfo',index:'otherInfo', width:80,sortable:false}
		           ],
        autowidth : true,
   		height: 'auto',
   		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
   		viewrecords : true,
		caption : "其他许可内容"//表格的标题名字
	});
})
	
	