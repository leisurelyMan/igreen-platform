
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list").jqGrid({
		url : '../crawlerIpeIndustry/pageList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>网站名称</b>','<b>网站域名</b>','<b>年度</b>','<b>标题</b>','<b>url</b>','<b>公司名称</b>','<b>省</b>','<b>市</b>','<b>县</b>','<b>处罚类型</b>','<b>处罚公布时间</b>','<b>处罚金额</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'webName',index:'webName', width:80,sortable:false},
		 		    {name:'webDomain',index:'webDomain', width:80,sortable:false},
                    {name:'year',index:'year', width:20,sortable:false},
                    {name:'webDetailName',index:'webDetailName', width:80,sortable:false},
                    {name:'webDetailUrl',index:'webDetailUrl', width:80,sortable:false},
                    {name:'companyName',index:'companyName', width:80,sortable:false},
                    {name:'province',index:'province', width:80,sortable:false},
                    {name:'city',index:'city', width:80,sortable:false},
                    {name:'district',index:'district', width:80,sortable:false},
                    {name:'punishType',index:'punishType', width:80,sortable:false},
                    {name:'punishTime',index:'punishTime', width:80,sortable:false},
                    {name:'punishMoney',index:'punishMoney', width:80,sortable:false},
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
	
	$("#dialog").dialog({   //创建dialog弹窗
		title:'详情',
		autoOpen: false,     //不自动打开窗口 
		show:"slide",       //显示弹窗出现的效果，slide为滑动效果 
		hide:"explode",     //显示窗口消失的效果，explode为爆炸效果
		resizable: true,    //设置是否可拉动弹窗的大小，默认为true  
		autoScroll: true,
		modal: true,         //是否有遮罩模型  
		width: 800,
		height: 820,
		buttons:[//定义两个button按钮
		    {
		    	text:"取消",
		    	click:function(){
		    	$(this).dialog("close");
		    }
		    }
		]
	});
	
	$("#search").click(function(){
		var webName = $('#searchWebName').val();
		var webDetailName = $('#searchWebDetailName').val();
		var searchName = $('#searchName').val();
		
		$("#list").jqGrid("setGridParam",{postData:{webName:webName,webDetailName:webDetailName,searchName:searchName},page:1} );//设置查询参数
		$("#list").trigger("reloadGrid");
	});
});

function view(id){
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../crawler/getWebCrawlerResultById.do',//这里是接收数据的URL
		data:'resultId='+id,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var obj = eval("("+msg+")");
			$('#content').html(obj.content);
		    
			//打开对话表
			$("#dialog").dialog("open");
		},
		error:function(){//修理失败，未能连接
			alert("查看失败，请联系管理员");
		}
	});
}


function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:view(\''+rowObject.id+'\')">查看</a>&nbsp;';
}

