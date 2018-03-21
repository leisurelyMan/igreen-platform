
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list").jqGrid({
		url : '../crawler/resultList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>网站名称</b>','<b>网站域名</b>','<b>详情标题</b>','<b>详情页原url</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'webName',index:'webName', width:80,sortable:false},
		 		    {name:'webDomain',index:'webDomain', width:80,sortable:false},
		 		    {name:'webDetailName',index:'webDetailName', width:80,sortable:false},
		 		    {name:'webDetailUrl',index:'webDetailUrl', width:80,sortable:false},
					{name:'id',index:'id', width:130,formatter:getActions,sortable:false,resizable:false,align:'center'}
		           ],
		rowNum : 10,//一页显示多少条
		rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
		pager : '#pager',//表格页脚的占位符(一般是div)的id
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
	    prmNames:{
	    	page:'currentPage',
	    	rows:'pageRows'
	    },
		caption : "爬虫结果"//表格的标题名字
	});
	
	jQuery("#list").jqGrid('navGrid', '#pager', {edit : false,add : false,del : false});
	
	$("#search").click(function(){
		var webName = $('#searchWebName').val();
		var webDetailName = $('#searchWebDetailName').val();
		
		$("#list").jqGrid("setGridParam",{postData:{webName:webName,webDetailName:webDetailName},page:1} );//设置查询参数
		$("#list").trigger("reloadGrid");
	});
});

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:edit(\''+rowObject.id+'\')">编辑</a>&nbsp;';
}


