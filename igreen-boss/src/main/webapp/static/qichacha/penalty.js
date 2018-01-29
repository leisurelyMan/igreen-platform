
jQuery(document).ready(function(){
    var keyNo = $("#keyNo").val();//获取供应链ID
	//创建jqGrid组件
	jQuery("#list1").jqGrid({
		url : '../../companybase/companybaseList.do?keyNo='+keyNo,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>企业名称</b>','<b>注册时间</b>','<b>注册编码</b>','<b>行业</b>','<b>细分行业</b>','<b>注册资本</b>','<b>组织机构代码</b>','<b>状态</b>'],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'name',index:'name', width:80,sortable:false},
					{name:'startDate',index:'startDate', width:80,sortable:false},
					{name:'creditCode',index:'creditCode', width:80,sortable:false},
					{name:'industry',index:'industry', width:80,sortable:false}, 
					{name:'subindustry',index:'subindustry', width:80,sortable:false},
					{name:'registCapi',index:'registCapi', width:50,sortable:false},
					{name:'orgNo',index:'orgNo', width:80,sortable:false},
					{name:'status',index:'status', width:80,sortable:false}
					//{name:'keyNo',index:'keyNo', width:230,formatter:getActions,sortable:false,resizable:false,align:'center'}
		           ],
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
		caption : "基本信息列表"//表格的标题名字
	});
	
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../../qichacha/penalty/penaltyList.do?keyNo='+keyNo,//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>处罚编号</b>','<b>文档编号</b>','<b>处罚类型</b>','<b>处罚机构</b>','<b>公布时间</b>','<b>处罚时间</b>','<b>注册编号</b>','<b>经营者</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'no',index:'no', width:40,sortable:false},
					{name:'docNo',index:'docNo', width:80,sortable:false},
					{name:'penaltyType',index:'penaltyType', width:80,sortable:false}, 
					{name:'officeName',index:'officeName', width:80,sortable:false},
					{name:'publicDate',index:'publicDate', width:80,sortable:false},
					{name:'penaltyDate',index:'penaltyDate', width:80,sortable:false},
					{name:'regNo',index:'regNo', width:120,sortable:false},
					{name:'operator',index:'operator', width:80,sortable:false},
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
		caption : "处罚信息列表"//表格的标题名字
	});
	
	$("#dialog").dialog({   //创建dialog弹窗
		title:'专利信息',
		autoOpen: false,     //不自动打开窗口 
		show:"slide",       //显示弹窗出现的效果，slide为滑动效果 
		hide:"explode",     //显示窗口消失的效果，explode为爆炸效果
		resizable: true,    //设置是否可拉动弹窗的大小，默认为true  
		modal: true,         //是否有遮罩模型  
		width: 600,
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
	
});

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:edit(\''+rowObject.id+'\')">查看详情</a>&nbsp;';
}

/**
 * 编辑角色详情
 * @param userId
 */
function edit(id){
	//取得角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../../qichacha/penalty/getOnePenalty.do',//这里是接收数据的URL
		data:'id='+id,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var userObj = eval("("+msg+")");
			
			//更新信息至roleform并dialog显示
		    /**
		     * 处罚编号
		     */
		    $('#no').val(userObj.no);

		    /**
		     * 文档编号
		     */
		    $('#docNo').val(userObj.docNo);

		    /**
		     * 处罚类型
		     */
		    $('#penaltyType').val(userObj.penaltyType);

		    /**
		     * 处罚机构
		     */
		    $('#officeName').val(userObj.officeName);

		    /**
		     * 公布时间
		     */
		    $('#publicDate').val(userObj.publicDate);

		    /**
		     * 处罚时间
		     */
		    $('#penaltyDate').val(userObj.penaltyDate);

		    /**
		     * 备注
		     */
		    $('#remark').val(userObj.remark);

		    /**
		     * 被处罚对象
		     */
		    $('#personName').val(userObj.personName);

		    /**
		     * 注册编号
		     */
		    $('#regNo').val(userObj.regNo);

		    /**
		     * 经营者
		     */
		    $('#operator').val(userObj.operator);

		    /**
		     * 处罚链接
		     */
		    $('#adPenaltyLink').val(userObj.adPenaltyLink);	
		    /**
		     * 处罚内容
		     */
		    $('#content').val(userObj.content);

		    /**
		     * 处罚内容
		     */
		    $('#adPenaltyDoc').val(userObj.adPenaltyDoc);
		    
		    
		    
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
