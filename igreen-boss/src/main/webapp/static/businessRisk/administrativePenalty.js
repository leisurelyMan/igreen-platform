
jQuery(document).ready(function(){
    var registItemId = $("#registItemId").val();//获取供应链ID
	//创建jqGrid组件
	jQuery("#list1").jqGrid({
		url : '../basicInfo/registItemList.do?id='+registItemId,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>企业名称</b>','<b>法人代表姓名</b>','<b>注册号</b>','<b>注册资本(万元)</b>','<b>实收资本(万元)</b>','<b>币种</b>','<b>企业(机构)类型</b>','<b>经营状态</b>','<b>行业门类代码</b>','<b>国民经济行业代码</b>'],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'companyName',index:'companyName', width:80,sortable:false},
					{name:'legalRepresentative',index:'legalRepresentative', width:80,sortable:false},
					{name:'registNumber',index:'registNumber', width:80,sortable:false}, 
					{name:'registeredCapital',index:'registeredCapital', width:80,sortable:false},
					{name:'paidInCapital',index:'paidInCapital', width:80,sortable:false},
					{name:'currency',index:'currency', width:80,sortable:false},
					{name:'companyType',index:'companyType', width:80,sortable:false},
					{name:'operateState',index:'operateState', width:80,sortable:false},
					{name:'tradeCode',index:'tradeCode', width:80,sortable:false},
					{name:'countryTradeCode',index:'countryTradeCode', width:80,sortable:false}
		           ],
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
		caption : "注册信息列表"//表格的标题名字
	});
	
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../businessRisk/administrativePenaltyList.do?registItemId='+registItemId,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>案发时间</b>','<b>案由</b>','<b>案件类型</b>','<b>执行类别</b>','<b>案件结果</b>','<b>处罚决定书签发日期</b>','<b>处罚机关</b>','<b>主要违法事实</b>','<b>处罚依据</b>','<b>处罚种类</b>','<b>处罚结果</b>','<b>处罚金额</b>','<b>处罚执行情况</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'crimeTime',index:'crimeTime', width:80,sortable:false},
		 		    {name:'crimeReason',index:'crimeReason', width:80,sortable:false},
		 		    {name:'caseType',index:'caseType', width:80,sortable:false},
		 		    {name:'executeType',index:'executeType', width:80,sortable:false},
		 		    {name:'caseResult',index:'caseResult', width:80,sortable:false},
		 		    {name:'punishTime',index:'punishTime', width:80,sortable:false},
		 		    {name:'punishOffice',index:'punishOffice', width:80,sortable:false},
		 		    {name:'factMalfeasance',index:'factMalfeasance', width:80,sortable:false},
		 		    {name:'punishBase',index:'punishBase', width:80,sortable:false},
		 		    {name:'punishType',index:'punishType', width:80,sortable:false},
		 		    {name:'punishResult',index:'punishResult', width:80,sortable:false},
		 		    {name:'punishAmount',index:'punishAmount', width:80,sortable:false},
		 		    {name:'punishment',index:'punishment', width:80,sortable:false},
					{name:'id',index:'id', width:130,formatter:getActions,sortable:false,resizable:false,align:'center'}
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
		caption : "行政处罚信息"//表格的标题名字
	});
	
	$("#dialog").dialog({   //创建dialog弹窗
		title:'行政处罚信息',
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
						url:'../businessRisk/addAdministrativePenalty.do',//这里是接收数据的URL
						data:$('#executedItemform').serialize(),//传给后台的数据，多个参数用&连接
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
		$('#crimeTime').val("");
		$('#crimeReason').val("");
		$('#caseType').val("");
		$('#executeType').val("");
		$('#caseResult').val("");
		$('#punishTime').val("");
		$('#punishOffice').val("");
		$('#factMalfeasance').val("");
		$('#punishBase').val("");
		$('#punishType').val("");
		$('#punishResult').val("");
		$('#punishAmount').val("");
		$('#punishment').val("");
		//打开对话表
		$("#dialog").dialog("open");
	});
	
	$("#search").click(function(){
		var searchCrimeReason = $('#searchCrimeReason').val();
		var searchCaseType = $('#searchCaseType').val();
		var searchExecuteType = $('#searchExecuteType').val();
		var searchPunishOffice = $('#searchPunishOffice').val();
		
		$("#list2").jqGrid("setGridParam",{postData:{crimeReason:searchCrimeReason,caseType:searchCaseType,executeType:searchExecuteType,punishOffice:searchPunishOffice},page:1} );//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
});

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:edit(\''+rowObject.id+'\')">编辑</a>&nbsp;';
}

/**
 * 编辑角色详情
 * @param userId
 */
function edit(penaltyId){
	//取得角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../businessRisk/getOneAdministrativePenalty.do',//这里是接收数据的URL
		data:'penaltyId='+penaltyId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var userObj = eval("("+msg+")");
			
			//更新信息至roleform并dialog显示
			$('#id').val(userObj.id);
			$('#crimeTime').val(userObj.crimeTime);
			$('#crimeReason').val(userObj.crimeReason);
			$('#caseType').val(userObj.caseType);
			$('#executeType').val(userObj.executeType);
			$('#caseResult').val(userObj.caseResult);
			$('#punishTime').val(userObj.punishTime);
			$('#punishOffice').val(userObj.punishOffice);
			$('#factMalfeasance').val(userObj.factMalfeasance);
			$('#punishBase').val(userObj.punishBase);
			$('#punishType').val(userObj.punishType);
			$('#punishResult').val(userObj.punishResult);
			$('#punishAmount').val(userObj.punishAmount);
			$('#punishment').val(userObj.punishment);
			
			//打开对话表
			$("#dialog").dialog("open");
		},
		error:function(){//修理失败，未能连接
			alert("保存失败，请联系管理员");
		}
	});
}


function getStatus(cellvalue, options, rowObject){
	if(cellvalue == 1)
		return "有效";
	else
		return "无效";
}
