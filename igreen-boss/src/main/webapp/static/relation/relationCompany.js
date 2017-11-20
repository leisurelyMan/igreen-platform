
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
		url : '../relation/relationCompanyList.do?registItemId='+registItemId,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>关联人员姓名</b>','<b>关联人员职务</b>','<b>企业名称</b>','<b>任职</b>','<b>投资(万元)</b>','<b>持股比例</b>','<b>注册资本(万元)</b>','<b>注册资本币种</b>','<b>企业(机构)类型</b>','<b>注册号</b>','<b>登记机关</b>','<b>企业状态</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'employeeName',index:'employeeName', width:80,sortable:false},
		 		    {name:'employeeJob',index:'employeeJob', width:80,sortable:false},
		 		    {name:'companyName',index:'companyName', width:80,sortable:false},
		 		    {name:'job',index:'job', width:80,sortable:false},
		 		    {name:'investment',index:'investment', width:80,sortable:false},
		 		    {name:'ratio',index:'ratio', width:80,sortable:false},
		 		    {name:'registAmount',index:'registAmount', width:80,sortable:false},
		 		    {name:'registCurrency',index:'registCurrency', width:80,sortable:false},
		 		    {name:'companyType',index:'companyType', width:80,sortable:false},
		 		    {name:'registNo',index:'registNo', width:80,sortable:false},
		 		    {name:'registOffice',index:'registOffice', width:80,sortable:false},
		 		    {name:'companyStatus',index:'companyStatus', width:80,sortable:false},
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
		caption : "企业投资信息"//表格的标题名字
	});
	
	$("#dialog").dialog({   //创建dialog弹窗
		title:'企业投资信息',
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
						url:'../relation/addRelationCompany.do',//这里是接收数据的URL
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
		getEmployees("employeeId",registItemId,null,true);
		//$('#employeeId').val("");
	    $('#companyName').val("");
	    $('#job').val("");
	    $('#investment').val("");
	    $('#ratio').val("");
	    $('#registAmount').val("");
	    $('#registCurrency').val("");
	    $('#companyType').val("");
	    $('#registNo').val("");
	    $('#registOffice').val("");
	    $('#companyStatus').val("");
	    
		//打开对话表
		$("#dialog").dialog("open");
	});
	
	$("#search").click(function(){
		var searchCompanyName = $('#searchCompanyName').val();
		var searchRegistNo = $('#searchRegistNo').val();
		var searchCompanyType = $('#searchCompanyType').val();
		
		$("#list2").jqGrid("setGridParam",{postData:{companyName:searchCompanyName,registNo:searchRegistNo,companyType:searchCompanyType},page:1} );//设置查询参数
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
function edit(relationCompanyId){
	//取得角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../relation/getOneRelationCompany.do',//这里是接收数据的URL
		data:'relationCompanyId='+relationCompanyId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var userObj = eval("("+msg+")");
			
			//更新信息至roleform并dialog显示
			$('#id').val(userObj.id);
			getEmployees("employeeId",userObj.registItemId,userObj.employeeId,true);
			//$('#employeeId').val(userObj.employeeId);
		    $('#companyName').val(userObj.companyName);
		    $('#job').val(userObj.job);
		    $('#investment').val(userObj.investment);
		    $('#ratio').val(userObj.ratio);
		    $('#registAmount').val(userObj.registAmount);
		    $('#registCurrency').val(userObj.registCurrency);
		    $('#companyType').val(userObj.companyType);
		    $('#registNo').val(userObj.registNo);
		    $('#registOffice').val(userObj.registOffice);
		    $('#companyStatus').val(userObj.companyStatus);
			
			//打开对话表
			$("#dialog").dialog("open");
		},
		error:function(){//修理失败，未能连接
			alert("保存失败，请联系管理员");
		}
	});
}


/**
 * selectObj	select标签的ID
 * dicType		字典类型
 * selectedObj	选中的值
 * isemp		是否有请选择项
 */
function getEmployees(selectObj,registItemId,selectedObj,isemp){
	$.ajax({
		type:'post',
		async:false,//同步
		url:'../basicInfo/getEmployeeOption.do',//这里是接收数据的URL
		data:'registItemId='+registItemId,//传给后台的数据，多个参数用&连接
		dataType:'json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(data){
			$('#'+selectObj).html('');
			if(isemp){
				$('#'+selectObj).append("<option value=''>请选择</option>");
			}
			for(var x=0;x<data.length;x++){
				var str="<option value='";
				str = str + data[x].value;
				
				if(data[x].value == selectedObj){
					str = str + "' selected='selected'>";
				}else{
					str = str + "'>";
				}
				str = str + data[x].describe;
				str = str + "</option>";
				$('#'+selectObj).append(str);
			}
		},
		error:function(){//修理失败，未能连接
			alert("获取数据字典失败，请联系管理员");
		}
	});
}

function getStatus(cellvalue, options, rowObject){
	if(cellvalue == 1)
		return "有效";
	else
		return "无效";
}
