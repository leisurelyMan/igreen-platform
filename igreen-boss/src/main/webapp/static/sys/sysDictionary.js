//定义角色用户ID
var userId_Role = ""; 
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../sys/dictionaryList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : [ '<b>Id</b>','<b>字典名称</b>', '<b>上级字典ID</b>', '<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		            {name:'id',index:'id1', width:80,sortable:false},
		 		    {name:'dicName',index:'dicName', width:80,sortable:false},
					{name:'dicParentId',index:'dicParentId', width:80,sortable:false},
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
		title:'用户管理',
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
						url:'../sys/addDictionary.do',//这里是接收数据的URL
						data:$('#dictionaryform').serialize(),//传给后台的数据，多个参数用&连接
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
							alert("保存用户失败，请联系管理员");
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
	
	//设置角色对话框
	$("#childDialog").dialog({   //创建dialog弹窗
		title:'用户角色管理',
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
								url:'../sys/addDictionary.do',//这里是接收数据的URL
								data:{"dicParentId":$("#childdicParentId").val(),"dicName":$("#childdicName").val()},//传给后台的数据，多个参数用&连接
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
		$('#dicParentId').val("");
		$('#dicName').val("");
		initParentDic("dicParentId",null,null);
		//打开对话表
		$("#dialog").dialog("open");
	});
	
	$("#search").click(function(){
		var searchDicParentId = $('#searchDicParentId').val();
		var searchDicName = $('#searchDicName').val();
		var searchStatus = $('#searchStatus').val();
		$("#list2").jqGrid("setGridParam",{postData:{dicParentId:searchDicParentId, dicName:searchDicName,status:searchStatus},page:1} );//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
	
	initParentDic("searchDicParentId",null,null);
});

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:editDictionary(\''+rowObject.id+'\')">编辑</a>&nbsp;'
    +'<a href="javascript:addChild(\''+rowObject.id+'\',\''+rowObject.dicName+'\')">添加子元素</a>&nbsp;&nbsp;';
}

function initParentDic(selectObj,parentId,selectedObj){
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../sys/getDictionaryByParentId.do',//这里是接收数据的URL
		data:'parentId='+parentId==null?"":parentId,//传给后台的数据，多个参数用&连接
		dataType:'json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(data){
			$('#'+selectObj).html('');
			$('#'+selectObj).append("<option value=''>请选择</option>");
			for(var x=0;x<data.length;x++){
				var str="<option value='";
				str = str + data[x].id;
				
				if(data[x].value == selectedObj){
					str = str + "' selected='selected'>";
				}else{
					str = str + "'>";
				}
				str = str + data[x].dicName;
				str = str + "</option>";
				$('#'+selectObj).append(str);
			}
		},
		error:function(){//修理失败，未能连接
			alert("保存用户失败，请联系管理员");
		}
	});
}

/**
 * 编辑用户详情
 * @param userId
 */
function editDictionary(dictionaryId){
	//取得用户信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../sys/getOneDictionary.do',//这里是接收数据的URL
		data:'dictionaryId='+dictionaryId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var obj = eval("("+msg+")");
			
			//更新信息至userform并dialog显示
			$('#id').val(obj.id);
			$('#dicName').val(obj.dicName);
			initParentDic("dicParentId",null,obj.dicParentId);
			
			$("#dialog").dialog("open");
		},
		error:function(){//修理失败，未能连接
			alert("保存用户失败，请联系管理员");
		}
	});
}


function addChild(dicParentId,parentName){
	//清空原有值
	$('#parentName').val(parentName);
	$('#childdicParentId').val(dicParentId);
	$('#childdicName').val("");
	//打开对话表
	$("#childDialog").dialog("open");
}