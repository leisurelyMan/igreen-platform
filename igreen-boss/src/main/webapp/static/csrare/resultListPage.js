
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list").jqGrid({
		url : '../csrare/resultList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : [/*'<b>网站名称</b>',*/'<b>详情标题</b>','<b>详情页原url</b>','<b>本站详情url</b>','<b>颁布机构</b>','<b>生效状态</b>','<b>所属类型</b>','<b>适用地区</b>','<b>适用领域</b>','<b>生效日期</b>','<b>颁布日期</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		   /* {name:'webName',index:'webName', width:80,sortable:false},*/
		 		    {name:'webDetailName',index:'webDetailName', width:80,sortable:false},
		 		    {name:'webDetailUrl',index:'webDetailUrl', width:80,sortable:false},
					{name:'webDetailResultUrl',index:'webDetailResultUrl', width:80,sortable:false},
					{name:'publishOrg',index:'publishOrg', width:80,sortable:false},
					{name:'effectStatus',index:'effectStatus', width:80,sortable:false},
					{name:'attachType',index:'attachType', width:80,sortable:false},
					{name:'applicationArea',index:'applicationArea', width:80,sortable:false},
					{name:'applicationDomain',index:'applicationDomain', width:80,sortable:false},
					{name:'effectDate',index:'effectDate', width:80,formatter:getDate,sortable:false},
					{name:'publishDate',index:'publishDate', width:80,formatter:getDate,sortable:false},
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
		zIndex: 2,
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

		var attachType = $('#attachType').val();
		var applicationDomain = $('#applicationDomain').val();
		var effectiveYear = $('#effectiveYear').val();
		var effectStatus = $('#effectStatus').val();
		var latelyMonth = $('#latelyMonth').val();

		
		$("#list").jqGrid("setGridParam",{postData:{webName:webName,webDetailName:webDetailName,attachType:attachType,applicationDomain:applicationDomain, effectiveYear:effectiveYear,effectStatus:effectStatus,latelyMonth:latelyMonth},page:1} );//设置查询参数
		$("#list").trigger("reloadGrid");
	});

});

function FormatDate(strTime) {
	var date = new Date(strTime);
	var month = date.getMonth()+1;
	if(month<10){
		month="0"+month;
	}
	var day = date.getDate();
	if(day<10){
		day="0"+day;
	}
	var hour = date.getHours();
	if(hour<10){
		hour = "0"+hour;
	}
	var minute = date.getMinutes();
	if(minute<10){
		minute = "0"+minute;
	}
	var second = date.getSeconds();
	if(second<10){
		second = "0"+second;
	}

	return date.getFullYear()+"-"+month+"-"+day;
}

function view(id){
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../csrare/getWebCsrareResultById.do',//这里是接收数据的URL
		data:'resultId='+id,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var obj = eval("("+msg+")");

			$('#fgtitle').text(obj.webDetailName);
			$('#org').text(obj.publishOrg);
			$('#effStatus').text(obj.effectStatus);
			$('#attrType').text(obj.attachType);
			$('#city').text(obj.applicationArea);
			$('#lingyu').text(obj.applicationDomain);
			$('#effDate').text(FormatDate(obj.effectDate));
			$('#pubDate').text(FormatDate(obj.publishDate));

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

function getDate(cellvalue, options, rowObject){
	return FormatDate(cellvalue);
}


