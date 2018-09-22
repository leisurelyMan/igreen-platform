
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../companybase/companybaseList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		postData:{name:$('#searchName').val(), creditCode:$('#searchCreditCode').val(),orgNo:$('#searchOrgNo').val(),companyNames:$('#searchCompanyNames').val()},
		colNames : ['<b>企业名称</b>','<b>注册时间</b>','<b>注册编码</b>','<b>行业</b>','<b>细分行业</b>','<b>注册资本</b>','<b>组织机构代码</b>','<b>状态</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'name',index:'name', width:80,sortable:false},
					{name:'startDate',index:'startDate', width:80,sortable:false},
					{name:'creditCode',index:'creditCode', width:80,sortable:false},
					{name:'industry',index:'industry', width:80,sortable:false}, 
					{name:'subindustry',index:'subindustry', width:80,sortable:false},
					{name:'registCapi',index:'registCapi', width:50,sortable:false},
					{name:'orgNo',index:'orgNo', width:80,sortable:false},
					{name:'status',index:'status', width:80,sortable:false},
					{name:'keyNo',index:'keyNo', width:230,formatter:getActions,sortable:false,resizable:false,align:'center'}
		           ],
		rowNum : $('#pageRows').val(),//一页显示多少条
		page : $('#currentPage').val(),
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
	
	jQuery("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
	
	var configid = $("#id").val();
	if(configid != null && configid != ""){
		edit(configid);
	}
	
	$("#search").click(function(){
		var searchName = $('#searchName').val();
		var searchCreditCode = $('#searchCreditCode').val();
		var searchOrgNo = $('#searchOrgNo').val();
		var searchCompanyNames = $('#searchCompanyNames').val();
		$("#list2").jqGrid("setGridParam",{postData:{name:searchName, creditCode:searchCreditCode,
			orgNo:searchOrgNo,companyNames:searchCompanyNames},page:1} );//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
	
	$("#tablebody").on("click",".tablelink",function(){
		$(this).parent().parent().remove();
	});
	
	$("#saveButton").click(function(){
    	var param = {
    			"id":$("#id").val(),
    			"name":$("#name").val(),
    			"companys":getDetails()
    	};
    	
		$.ajax({
			type:'post',//可选get
			async:false,//同步
			contentType: "application/json",
			url:'../companyQuery/addQueryConfig.do',//这里是接收数据的URL
			data:JSON.stringify(param),//传给后台的数据，多个参数用&连接
			dataType:'json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
			success:function(msg){
				if(msg.code == -1){
					alert("保存失败");
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
	});
	
});

function getDetails(){
	var details = [];
	
	$("#tablebody").children("tr").each(function(){
		var qichachaKeyNo;
		var companyName;
		$(this).children("td").each(function(i){
			if(i == 0)
				qichachaKeyNo = $(this).html();
			else if(i == 1)
				companyName = $(this).html();
		});
		var detail = {
				"qichachaKeyNo":qichachaKeyNo,
				"companyName":companyName
		};
		details.push(detail);
	});
	
	return details;
}

/**
 * 编辑
 * @param id
 */
function edit(id){
	//取得详细信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../companyQuery/getOneConfig.do',//这里是接收数据的URL
		data:'configId='+id,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var obj = eval("("+msg+")");
			$('#id').val(obj.id);
			$('#name').val(obj.name);
			
        	if(obj.companys != null){
        		var detailsArry = new Array();
        		$.each(obj.companys, function(j, detail){
		    		var domobj = "<tr>";
		    		domobj += "<td>"+detail.qichachaKeyNo+"</td>";
		    		domobj += "<td>"+detail.companyName+"</td>";
		    		domobj += "<td><a href=\"#\" class=\"tablelink\">删除</a></td>";
		    		domobj += "</tr>";
		    		detailsArry.push(domobj);
        		});
        		$("#tablebody").html(detailsArry.join(""));
        	}
		},
		error:function(){//修理失败，未能连接
			alert("保存失败，请联系管理员");
		}
	});
}

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:selectCompany(\''+rowObject.keyNo+'\',\''+rowObject.name+'\')">选择</a>&nbsp;';
}
/**
 * @param companyId
 * @param companyName
 */
function selectCompany(qichachaKeyNo,companyName){
	var domobj = "<tr>";
	domobj += "<td>"+qichachaKeyNo+"</td>";
	domobj += "<td>"+companyName+"</td>";
	domobj += "<td><a href=\"#\" class=\"tablelink\">删除</a></td>";
	domobj += "</tr>";
	$("#tablebody").append(domobj);
}


function getStatus(cellvalue, options, rowObject){
	if(cellvalue == 1)
		return "有效";
	else
		return "无效";
}
