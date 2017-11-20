
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../basicInfo/registItemList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>企业名称</b>','<b>法人代表姓名</b>','<b>注册号</b>','<b>注册资本(万元)</b>','<b>实收资本(万元)</b>','<b>币种</b>','<b>企业(机构)类型</b>','<b>经营状态</b>','<b>行业门类代码</b>','<b>国民经济行业代码</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'companyName',index:'companyName', width:80,sortable:false},
					{name:'legalRepresentative',index:'legalRepresentative', width:80,sortable:false},
					{name:'registNumber',index:'registNumber', width:80,sortable:false}, 
					{name:'registeredCapital',index:'registeredCapital', width:80,sortable:false},
					{name:'paidInCapital',index:'paidInCapital', width:80,sortable:false},
					{name:'currency',index:'currency', width:50,sortable:false},
					{name:'companyType',index:'companyType', width:80,sortable:false},
					{name:'operateState',index:'operateState', width:80,sortable:false},
					{name:'tradeCode',index:'tradeCode', width:80,sortable:false},
					{name:'countryTradeCode',index:'countryTradeCode', width:80,sortable:false},
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
						url:'../basicInfo/addRegistItem.do',//这里是接收数据的URL
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
		$('#companyName').val("");
		$('#legalRepresentative').val("");
		$('#registNumber').val("");
		$('#oldRegistNumber').val("");
		$('#registeredCapital').val("");
		$('#paidInCapital').val("");
		$('#currency').val("");
		$('#companyType').val("");
		$('#operateState').val("");
		$('#startTime').val("");
		$('#endTime').val("");
		$('#openTime').val("");
		$('#cancelTime').val("");
		$('#revokeTime').val("");
		$('#registOffice').val("");
		$('#address').val("");
		$('#annualYear').val("");
		$('#annualDay').val("");
		$('#tradeCode').val("");
		$('#tradeName').val("");
		$('#countryTradeCode').val("");
		$('#countryTradeName').val("");
		$('#permission').val("");
		$('#general').val("");
		$('#businessScope').val("");
		$('#businessWay').val("");
		//打开对话表
		$("#dialog").dialog("open");
	});
	
	$("#search").click(function(){
		var searchName = $('#searchName').val();
		var searchShortName = $('#searchShortName').val();
		$("#list2").jqGrid("setGridParam",{postData:{name:searchName, shortName:searchShortName},page:1} );//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
});

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:edit(\''+rowObject.id+'\')">编辑</a>&nbsp;'
    		+'<a href="../basicInfo/toShareholderList.do?id='+rowObject.id+'">基本信息</a>&nbsp;'
    		+'<a href="../lawRisk/toOpenCourtList.do?id='+rowObject.id+'">法律风险</a>&nbsp;'
    		+'<a href="../businessRisk/toAdministrativePenaltyList.do?id='+rowObject.id+'">经营风险</a>&nbsp;'
    		+'<a href="../relation/toBranchList.do?id='+rowObject.id+'">关联关系</a>&nbsp;'
    		+'<a href="../business/toInviteList.do?id='+rowObject.id+'">经营信息</a>&nbsp;'
    		+'<a href="../intellectual/toPatentList.do?id='+rowObject.id+'">知识产权</a>';
}

/**
 * 编辑角色详情
 * @param userId
 */
function edit(registId){
	//取得角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../basicInfo/getOneRegistItem.do',//这里是接收数据的URL
		data:'registId='+registId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var userObj = eval("("+msg+")");
			
			//更新信息至roleform并dialog显示
			$('#id').val(userObj.id);
			$('#companyName').val(userObj.companyName);
			$('#legalRepresentative').val(userObj.legalRepresentative);
			$('#registNumber').val(userObj.registNumber);
			$('#oldRegistNumber').val(userObj.oldRegistNumber);
			$('#registeredCapital').val(userObj.registeredCapital);
			$('#paidInCapital').val(userObj.paidInCapital);
			$('#currency').val(userObj.currency);
			$('#companyType').val(userObj.companyType);
			$('#operateState').val(userObj.operateState);
			$('#startTime').val(userObj.startTime);
			$('#endTime').val(userObj.endTime);
			$('#openTime').val(userObj.openTime);
			$('#cancelTime').val(userObj.cancelTime);
			$('#revokeTime').val(userObj.revokeTime);
			$('#registOffice').val(userObj.registOffice);
			$('#address').val(userObj.address);
			$('#annualYear').val(userObj.annualYear);
			$('#annualDay').val(userObj.annualDay);
			$('#tradeCode').val(userObj.tradeCode);
			$('#tradeName').val(userObj.tradeName);
			$('#countryTradeCode').val(userObj.countryTradeCode);
			$('#countryTradeName').val(userObj.countryTradeName);
			$('#permission').val(userObj.permission);
			$('#general').val(userObj.general);
			$('#businessScope').val(userObj.businessScope);
			$('#businessWay').val(userObj.businessWay);
			
			
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
