
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../ipesearch/ipeSearchList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>公司名称</b>','<b>省</b>','<b>市</b>','<b>县</b>','<b>行业</b>','<b>年度</b>','<b>标题</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'companyName',index:'companyName', width:80,sortable:false},
		 		    {name:'province',index:'province', width:80,sortable:false},
		 		    {name:'city',index:'city', width:80,sortable:false},
		 		   	{name:'district',index:'district', width:80,sortable:false},
		 		    {name:'tradeName',index:'tradeName', width:80,sortable:false},
					{name:'year',index:'year', width:80,sortable:false},
					{name:'title',index:'title', width:80,sortable:false},
					{name:'id',index:'id', width:230,formatter:getActions,sortable:false,resizable:false,align:'center'}
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
		caption : "注册信息列表"//表格的标题名字
	});
	
	
	$("#dialog").dialog({   //创建dialog弹窗
		title:'注册信息',
		autoOpen: false,     //不自动打开窗口 
		show:"slide",       //显示弹窗出现的效果，slide为滑动效果 
		hide:"explode",     //显示窗口消失的效果，explode为爆炸效果
		resizable: true,    //设置是否可拉动弹窗的大小，默认为true  
		modal: true,         //是否有遮罩模型  
		width: 600,
		zIndex: 2,
		buttons:[//定义两个button按钮
		    {
		    	text:"确定",
		    	id:'btn_ok',
		    	click:function(){
	    			$.ajax({
						type:'post',//可选get
						async:false,//同步
						url:'../hotWorld/addHotWord.do',//这里是接收数据的URL
						data:$('#registItemform').serialize(),//传给后台的数据，多个参数用&连接
						dataType:'json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
						success:function(msg){
							if(msg.code == -1){
								alert(msg.message);
								//验证插入后，刷新grid
							}else{
								alert("保存成功");
								$("#list2").trigger("reloadGrid");
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
	jQuery("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
	
	$("#add").click(function(){
		//清空原有值
		$('#id').val("");
		$('#word').val("");
		//打开对话表
		$("#dialog").dialog("open");
	});
	
	$("#search").click(function(){
		var searchwords = $('#searchwords').val();
		var province = $('#province').val();
		var city = $('#city').val();
		var district = $('#district').val();
		var searchyear = $('#searchyear').val();
		var searchcompanyname = $('#searchcompanyname').val();
		$("#list2").jqGrid("setGridParam",{postData:{words:searchwords,province:province,city:city,district:district,address:searchaddress,year:searchyear,companyName:searchcompanyname},page:1} );//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
});

function getActions(cellvalue, options, rowObject){
    //return '<a href="javascript:industry(\''+rowObject.id+'\')">查看详情</a>&nbsp;';
    return '<a href="http://47.94.240.82/ipe/'+rowObject.fileName+'" target="view_window">查看详情</a>'
}

/**
 * 编辑角色详情
 * @param userId
 */
function edit(worldId){
	//取得角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../hotWorld/getHotWord.do',//这里是接收数据的URL
		data:'worldId='+worldId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var userObj = eval("("+msg+")");
			
			//更新信息至roleform并dialog显示
			$('#id').val(userObj.id);
			$('#word').val(userObj.word);
			
			$("#dialog").dialog("open");
		},
		error:function(){//修理失败，未能连接
			alert("保存用户失败，请联系管理员");
		}
	});
}


function getStatus(cellvalue, options, rowObject){
	if(cellvalue == 1)
		return "有效";
	else
		return "无效";
}
