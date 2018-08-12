
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../basicInfo/registItemList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>企业名称</b>','<b>法人代表姓名</b>','<b>地址</b>','<b>集团公司是否上市</b>','<b>集团公司名称</b>','<b>集团公司上市代码</b>','<b>行业类别</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'companyName',index:'companyName', width:120,sortable:false},
					{name:'legalRepresentative',index:'legalRepresentative', width:80,sortable:false},
					{name:'address',index:'address', width:80,sortable:false}, 
					{name:'groupCompanyPublic',index:'groupCompanyPublic', width:80,sortable:false},
					{name:'groupCompanyName',index:'groupCompanyName', width:80,sortable:false},
					{name:'groupCompanyExchangeName',index:'groupCompanyExchangeName', width:50,sortable:false},
					{name:'tradeName',index:'tradeName', width:80,sortable:false},
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
	
	jQuery("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
	
	var configid = $("#id").val();
	if(configid != null && configid != ""){
		edit(configid);
	}
	
	$("#search").click(function(){
		var searchName = $('#searchName').val();
		var searchAddress = $('#searchAddress').val();
		var searchGroupName = $('#searchGroupName').val();
		var searchGroupPublic = $('#searchGroupPublic').val();
		$("#list2").jqGrid("setGridParam",{postData:{companyName:searchName, address:searchAddress,
			groupCompanyName:searchGroupName,groupCompanyPublic:searchGroupPublic},page:1} );//设置查询参数
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
		var companyId;
		var companyName;
		$(this).children("td").each(function(i){
			if(i == 0)
				companyId = $(this).html();
			else if(i == 1)
				companyName = $(this).html();
		});
		var detail = {
				"registItemId":companyId,
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
		    		domobj += "<td>"+detail.registItemId+"</td>";
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
    return '<a href="javascript:selectCompany(\''+rowObject.id+'\',\''+rowObject.companyName+'\')">选择</a>&nbsp;';
}
/**
 * @param companyId
 * @param companyName
 */
function selectCompany(companyId,companyName){
	var domobj = "<tr>";
	domobj += "<td>"+companyId+"</td>";
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
