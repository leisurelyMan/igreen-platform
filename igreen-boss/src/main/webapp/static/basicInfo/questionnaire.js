//定义角色用户ID
var userId_Role = ""; 
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../basicInfo/questionnaireList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : [ '<b>填表人姓名</b>', '<b>填表人电话</b>', '<b>填表人邮箱</b>', '<b>填表人微信</b>', '<b>状态</b>', '<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'customerName',index:'customerName', width:80,sortable:false},
					{name:'customerMobile',index:'customerMobile', width:80,sortable:false},
		 		    {name:'customerMail',index:'customerMail', width:80,sortable:false},
					{name:'customerWechart',index:'customerWechart', width:80,sortable:false},
					{name:'status',index:'status', width:80,sortable:false},
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
		caption : "JSON Example"//表格的标题名字
	});
	
	$("#dialog").dialog({   //创建dialog弹窗
		title:'问卷调查详情',
		autoOpen: false,     //不自动打开窗口 
		show:"slide",       //显示弹窗出现的效果，slide为滑动效果 
		hide:"explode",     //显示窗口消失的效果，explode为爆炸效果
		resizable: true,    //设置是否可拉动弹窗的大小，默认为true  
		modal: true,         //是否有遮罩模型  
		width: 800,
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
	
	$("#search").click(function(){
		var searchDicParentId = $('#searchDicParentId').val();
		var searchDicName = $('#searchDicName').val();
		var searchStatus = $('#searchStatus').val();
		var searchCustomerName = $('#searchCustomerName').val( );
		var searchCustomerMobile = $('#searchCustomerMobile').val( );
		var searchCustomerMail = $('#searchCustomerMail').val( );
		var searchCustomerWechart = $('#searchCustomerWechart').val( );
		$("#list2").jqGrid("setGridParam",{
			postData:{dicParentId:searchDicParentId, dicName:searchDicName,status:searchStatus,
				customerName:searchCustomerName,customerMobile:searchCustomerMobile,
				customerMail:searchCustomerMail,customerWechart:searchCustomerWechart
				},
			page:1} 
		);//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
	
});

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:questionnaireDetail(\''+rowObject.id+'\')">查看详情</a>&nbsp;';
}

/**
 * 编辑用户详情
 * @param userId
 */
function questionnaireDetail(questionnaireId){
	//取得用户信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../basicInfo/getOneQuestionnaire.do',//这里是接收数据的URL
		data:'questionnaireId='+questionnaireId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var obj = eval("("+msg+")");
			
			$("#customerCompanyValue").html(obj.customerCompanyValue+"&nbsp;&nbsp;"+obj.customerCompanyOther);
			$("#countryValue").html(obj.countryValue+"&nbsp;&nbsp;"+obj.provinceValue);
			$("#issuerQualityValue").html(obj.issuerQualityValue);
			$("#bondTypeValue").html(obj.bondTypeValue+"&nbsp;&nbsp;"+obj.bondTypeOther);
			$("#issueBondsAreaValue").html(obj.issueBondsAreaValue);
			$("#bondsScopeValue").html(obj.bondsScopeValue+"&nbsp;&nbsp;"+obj.issueBondsScopeValue);
			$("#issueBondsRecordsValue").html(obj.issueBondsRecordsValue);
			$("#greenBondsTypeValue").html(obj.greenBondsTypeValue+"&nbsp;&nbsp;"+obj.greenBondsTypeOther);
			$("#majorTechnique").html(obj.majorTechnique);
			$("#complianceDocumentsValue").html(obj.complianceDocumentsValue+"&nbsp;&nbsp;"+obj.complianceDocumentsOther);
			$("#complianceProjectTypeValue").html(obj.complianceProjectTypeValue+"&nbsp;&nbsp;"+obj.complianceProjectTypeOther);
			$("#baseProjectMajorTechnique").html(obj.baseProjectMajorTechnique);
			$("#awardedComplianceDocumentsValue").html(obj.awardedComplianceDocumentsValue+"&nbsp;&nbsp;"+obj.awardedComplianceDocumentsOther);
			$("#customerName").html(obj.customerName);
			$("#customerMobile").html(obj.customerMobile);
			$("#customerMail").html(obj.customerMail);
			$("#customerWechart").html(obj.customerWechart);
			
			$("#dialog").dialog("open");
		},
		error:function(){//修理失败，未能连接
			alert("保存用户失败，请联系管理员");
		}
	});
}
