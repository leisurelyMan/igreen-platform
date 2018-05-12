
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../energyLevel/list.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>id</b>','<b>公司</b>','<b>领域</b>','<b>级别</b>','<b>证书编号</b>','<b>发证日期</b>','<b>有效期截止时间</b>','<b>备注</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'id',index:'id', width:80,sortable:false},
					{name:'company',index:'company', width:80,sortable:false},
					{name:'domain',index:'domain', width:200,sortable:false},
					{name:'level',index:'level', width:80,sortable:false},
					{name:'certificateNumber',index:'certificateNumber', width:80,sortable:false},
					{name:'certificateBegin',index:'certificateBegin', width:80,sortable:false},
					{name:'certificateEnd',index:'certificateEnd', width:80,sortable:false},
					{name:'remark',index:'remark', width:80,sortable:false}
					//{name:'id',index:'id', width:10,formatter:getActions,sortable:false,resizable:false,align:'center'}
		           ],
		rowNum : 10,//一页显示多少条
		rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
		pager : '#pager2',//表格页脚的占位符(一般是div)的id
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
	    prmNames:{
	    	page:'currentPage',
	    	rows:'pageRows'
	    },
		caption : "节能服务公司评级"//表格的标题名字
	});
	
	
	jQuery("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
	
	$("#add").click(function(){
		//清空原有值
		$('#id').val("");
		$('#word').val("");
		//打开对话表
		$("#dialog").dialog("open");
	});
	
	$("#search").click(function(){
		var searchName = $('#searchName').val();
		$("#list2").jqGrid("setGridParam",{postData:{filingCompany:searchName},page:1} );//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
});

function getActions(cellvalue, options, rowObject){
    //return '<a href="javascript:edit(\''+rowObject.id+'\')">编辑</a>&nbsp;';
	return '';
}


function getStatus(cellvalue, options, rowObject){
	if(cellvalue == 1)
		return "有效";
	else
		return "无效";
}
