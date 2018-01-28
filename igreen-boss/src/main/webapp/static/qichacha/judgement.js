
jQuery(document).ready(function(){
    var keyNo = $("#keyNo").val();//获取供应链ID
	//创建jqGrid组件
	jQuery("#list1").jqGrid({
		url : '../../companybase/companybaseList.do?keyNo='+keyNo,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>企业名称</b>','<b>注册时间</b>','<b>注册编码</b>','<b>行业</b>','<b>细分行业</b>','<b>注册资本</b>','<b>组织机构代码</b>','<b>状态</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'name',index:'name', width:80,sortable:false},
					{name:'startDate',index:'startDate', width:80,sortable:false},
					{name:'creditCode',index:'creditCode', width:80,sortable:false},
					{name:'industry',index:'industry', width:80,sortable:false}, 
					{name:'subindustry',index:'subindustry', width:80,sortable:false},
					{name:'registCapi',index:'registCapi', width:50,sortable:false},
					{name:'orgNo',index:'orgNo', width:80,sortable:false},
					{name:'status',index:'status', width:80,sortable:false}
		           ],
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
		caption : "基本信息列表"//表格的标题名字
	});
	
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../../qichacha/judgement/judgementList.do?keyNo='+keyNo,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>执行法院</b>','<b>处罚名称</b>','<b>处罚编号</b>','<b>提交时间</b>','<b>是否为起诉人</b>','<b>是否为被告</b>','<b>更新时间</b>','<b>年度</b>','<b>角色</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'court',index:'court', width:80,sortable:false},
					{name:'caseName',index:'caseName', width:80,sortable:false},
					{name:'caseNo',index:'caseNo', width:80,sortable:false}, 
					{name:'submitDate',index:'submitDate', width:80,sortable:false},
					{name:'isProsecutor',index:'isProsecutor', width:80,sortable:false},
					{name:'isDefendant',index:'isDefendant', width:80,sortable:false},
					{name:'updateDate',index:'updateDate', width:80,sortable:false},
					{name:'courtYear',index:'courtYear', width:80,sortable:false},
					{name:'caseRole',index:'caseRole', width:80,sortable:false}
					//{name:'id',index:'id', width:130,formatter:getActions,sortable:false,resizable:false,align:'center'}
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
		caption : "法院判决信息列表"//表格的标题名字
	});
	
	$("#dialog").dialog({   //创建dialog弹窗
		title:'股东出资信息',
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
						url:'../basicInfo/addShareholder.do',//这里是接收数据的URL
						data:$('#shareholderform').serialize(),//传给后台的数据，多个参数用&连接
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
		$('#shareholderName').val("");
		$('#capital').val("");
		$('#currency').val("");
		$('#ratio').val("");
		$('#contributiveTime').val("");
		$('#nationality').val("");
		
		//打开对话表
		$("#dialog").dialog("open");
	});
	
	$("#search").click(function(){
		var searchShareholderName = $('#searchShareholderName').val();
		$("#list2").jqGrid("setGridParam",{postData:{shareholderName:searchShareholderName},page:1} );//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
	
	
	$("#returnbtn").click(function(){
		var searchNameinput = $('<input type="hidden" name="name" value="'+$('#searchName').val()+'"/>');
		var searchCreditCodeinput = $('<input type="hidden" name="creditCode" value="'+$('#searchCreditCode').val()+'"/>');
		var searchOrgNoinput = $('<input type="hidden" name="orgNo" value="'+$('#searchOrgNo').val()+'"/>');
		var searchCompanyNamesinput = $('<input type="hidden" name="companyNames" value="'+$('#searchCompanyNames').val()+'"/>');
	    // 取得要提交页面的URL  
	    var action = "../../companybase/toCompanyBaseList.do";  
	    // 创建Form  
	    var form = $('<form id="hiddenform"></form>');
	    // 设置属性  
	    form.attr('action', action);  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  
	    // _self -> 当前页面 _blank -> 新页面  
	    form.attr('target', '_self');  
	    // 附加到Form 
	    form.append(searchNameinput);
	    form.append(searchCreditCodeinput);
	    form.append(searchOrgNoinput);
	    form.append(searchCompanyNamesinput);
	    $("#hiddendiv").empty().append(form);
	    // 提交表单  
	    $("#hiddenform").submit();
	});
	
});

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:edit(\''+rowObject.id+'\')">编辑</a>&nbsp;';
}

/**
 * 编辑角色详情
 * @param userId
 */
function edit(shareholderId){
	//取得角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../basicInfo/getOneShareholder.do',//这里是接收数据的URL
		data:'shareholderId='+shareholderId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var userObj = eval("("+msg+")");
			
			//更新信息至roleform并dialog显示
			$('#id').val(userObj.id);
			$('#shareholderName').val(userObj.shareholderName);
			$('#capital').val(userObj.capital);
			$('#currency').val(userObj.currency);
			$('#ratio').val(userObj.ratio);
			$('#contributiveTime').val(userObj.contributiveTime);
			$('#nationality').val(userObj.nationality);
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
