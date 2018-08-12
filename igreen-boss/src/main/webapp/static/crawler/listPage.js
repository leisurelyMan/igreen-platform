
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list").jqGrid({
		url : '../crawler/list.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>网站名称</b>','<b>网站域名</b>','<b>地区</b>','<b>区域</b>','<b>来源</b>','<b>全文检索URL</b>','<b>分页url正则表达式</b>','<b>分页类型</b>','<b>分页请求返回方式</b>','<b>分页结果</b>','<b>详情页url匹配正则表达式</b>','<b>详情页title xpath</b>','<b>最大分页</b>','<b>开始分页</b>','<b>获取分页数据类型</b>','<b>获取分页数据对应的名称</b>','<b>详情页内容获取 xpath</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'webName',index:'webName', width:80,sortable:false},
		 		    {name:'webDomain',index:'webDomain', width:80,sortable:false},
			{name:'city',index:'city', width:80,sortable:false},
			{name:'area',index:'area', width:80,sortable:false},
			{name:'sourceType',index:'sourceType', width:80,sortable:false},
		 		    {name:'webSearchUrl',index:'webSearchUrl', width:80,sortable:false},
		 		    {name:'pageUrlRegular',index:'pageUrlRegular', width:80,sortable:false},
		 		    {name:'pageType',index:'pageType', width:80,sortable:false},
		 		    {name:'pageReqMethod',index:'pageReqMethod', width:80,sortable:false},
		 		    {name:'pageResult',index:'pageResult', width:80,sortable:false},
		 		    {name:'detailUrlRegular',index:'detailUrlRegular', width:80,sortable:false},
		 		    {name:'detailTitleRegular',index:'detailTitleRegular', width:80,sortable:false},
		 		    {name:'maxPage',index:'maxPage', width:80,sortable:false},
			 		{name:'startPage',index:'startPage', width:80,sortable:false},
			 		{name:'attrType',index:'attrType', width:80,sortable:false},
			 		{name:'attrName',index:'attrName', width:80,sortable:false},
			 		{name:'detailContentRegular',index:'detailContentRegular', width:80,sortable:false},
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
		caption : "爬虫配置"//表格的标题名字
	});
	
	$("#dialog").dialog({   //创建dialog弹窗
		title:'爬虫配置',
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
		    	text:"确定",
		    	id:'btn_ok',
		    	click:function(){
	    			$.ajax({
						type:'post',//可选get
						async:false,//同步
						url:'../crawler/addOrEditConfig.do',//这里是接收数据的URL
						data:$('#executedItemform').serialize(),//传给后台的数据，多个参数用&连接
						dataType:'json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
						success:function(msg){
							if(msg.code == -1){
								alert(msg.message);
								//验证插入后，刷新grid
							}else{
								alert("保存成功");
								$("#list").trigger("reloadGrid");
								$("#dialog").dialog("close");
							}
						},
						error:function(){//修理失败，未能连接
							alert("保存失败，请联系管理员");
						}
					});
		    	}
		    },
		    {
		    	text:"取消",
		    	click:function(){
		    	$(this).dialog("close");
		    }
		    }
		]
	});
	jQuery("#list").jqGrid('navGrid', '#pager', {edit : false,add : false,del : false});
	
	$("#add").click(function(){
		//清空原有值
		$('#id').val("");
		$('#webName').val("");
		$('#city').val("");
		$('#area').val("");
		$('#sourceType').val("");
	    $('#webDomain').val("");
	    $('#webSearchUrl').val("");
	    $('#pageUrlRegular').val("");
	    $('#pageType').val("");
	    $('#pageReqMethod').val("");
	    $('#pageResult').val("");
        $('#replaceRegular').val("");
	    $('#detailUrlRegular').val("");
	    $('#detailTitleRegular').val("");
	    $('#maxPage').val("");
	    $('#startPage').val("");
	    $('#attrType').val("");
	    $('#attrName').val("");
	    $('#detailContentRegular').val("");
	    
		//打开对话表
		$("#dialog").dialog("open");
	});
	
	$("#search").click(function(){
		var webName = $('#searchWebName').val();
		var webDomain = $('#searchWebDomain').val();
		
		$("#list").jqGrid("setGridParam",{postData:{webName:webName,webDomain:webDomain},page:1} );//设置查询参数
		$("#list").trigger("reloadGrid");
	});
});

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:edit(\''+rowObject.id+'\')">编辑</a>&nbsp;<a href="javascript:crawler(\''+rowObject.id+'\')">手动爬虫</a>&nbsp;<a href="javascript:crawlerTest(\''+rowObject.id+'\')">测试</a>';
}

/**
 * 编辑角色详情
 * @param userId
 */
function edit(configId){
	//取得角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../crawler/getWebCrawlerConfigById.do',//这里是接收数据的URL
		data:'configId='+configId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var obj = eval("("+msg+")");

			//更新信息至roleform并dialog显示
			$('#id').val(obj.id);
			$('#webName').val(obj.webName);
			$('#webDomain').val(obj.webDomain);
			$('#webSearchUrl').val(obj.webSearchUrl);

			$('#city').val(obj.city);
			$('#area').val(obj.area);
			$('#sourceType').val(obj.sourceType);

			$('#pageUrlRegular').val(obj.pageUrlRegular);
			$('#pageType').val(obj.pageType);
			$('#pageReqMethod').val(obj.pageReqMethod);
			$('#pageResult').val(obj.pageResult);
            $('#replaceRegular').val(obj.replaceRegular);
			$('#detailUrlRegular').val(obj.detailUrlRegular);
			$('#detailTitleRegular').val(obj.detailTitleRegular);
			$('#maxPage').val(obj.maxPage);
			$('#startPage').val(obj.startPage);
			$('#attrType').val(obj.attrType);
			$('#attrName').val(obj.attrName);
			$('#detailContentRegular').val(obj.detailContentRegular);
		    
			//打开对话表
			$("#dialog").dialog("open");
		},
		error:function(){//修理失败，未能连接
			alert("保存失败，请联系管理员");
		}
	});
}

/**
 * 爬虫测试
 * @param userId
 */
function crawler(configId){
    window.open("../crawler/startCrawler.do?configId=" + configId);
    //取得角色信息
	/*$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../crawler/startCrawler.do',//这里是接收数据的URL
		data:'configId='+configId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			/!*if(msg.code == -1){
				alert(msg.message);
			}else{
				alert("测试成功");
			}*!/
		},
		error:function(){//修理失败，未能连接
			alert("保存失败，请联系管理员");
		}
	});*/
}

/**
 * 爬虫测试
 * @param userId
 */
function crawlerTest(configId){
	window.open("../crawler/startCrawlerTest.do?configId=" + configId);
}

function getStatus(cellvalue, options, rowObject){
	if(cellvalue == 1)
		return "有效";
	else
		return "无效";
}
