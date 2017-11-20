//定义角色用户ID
var userId_Role = ""; 
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../sys/userList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : [ '<b>用户账号</b>', '<b>用户名称</b>', '<b>用户邮箱</b>', '<b>用户电话</b>', '<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'userAccount',index:'userAccount', width:80,sortable:false},
					{name:'userName',index:'userName', width:80,sortable:false},
					{name:'email',index:'email', width:80,sortable:false},  
					{name:'mobile',index:'mobile', width:80,sortable:false},
					{name:'id',index:'id', width:130,formatter:getActions,sortable:false,resizable:false,align:'center'}
		           ],
		rowNum : 10,//一页显示多少条
		rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
		pager : '#pager2',//表格页脚的占位符(一般是div)的id
		//sortname : 'id',//初始化的时候排序的字段
		//sortorder : "desc",//排序方式,可选desc,asc
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
						url:'../sys/addUser.do',//这里是接收数据的URL
						data:$('#userform').serialize(),//传给后台的数据，多个参数用&连接
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
	$("#dialogRole").dialog({   //创建dialog弹窗
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
		    	id:'btn_ok_role',
		    	click:function(){
		    		saveUserRole();
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
		$('#userAccount').val("");
		$('#userName').val("");
		$('#email').val("");
		$('#mobile').val("");
		
		//打开对话表
		$("#dialog").dialog("open");
	});
	
	$("#search").click(function(){
		var searchUserAccount = $('#searchUserAccount').val();
		var searchUserName = $('#searchUserName').val();
		var searchEmail = $('#searchEmail').val();
		var searchMobile = $('#searchMobile').val();
		$("#list2").jqGrid("setGridParam",{postData:{userAccount:searchUserAccount, userName:searchUserName,email:searchEmail,mobile:searchMobile},page:1} );//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
});

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:editUser(\''+rowObject.id+'\')">编辑</a>&nbsp;'
    +'<a href="javascript:setRole(\''+rowObject.id+'\',\''+rowObject.userName+'\')">授权</a>&nbsp;&nbsp;';
}

/**
 * 编辑用户详情
 * @param userId
 */
function editUser(userId){
	//取得用户信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../sys/getOneUser.do',//这里是接收数据的URL
		data:'userId='+userId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var userObj = eval("("+msg+")");
			
			//更新信息至userform并dialog显示
			$('#id').val(userObj.id);
			$('#userAccount').val(userObj.userAccount);
			$('#userName').val(userObj.userName);
			$('#email').val(userObj.email);
			$('#mobile').val(userObj.mobile);
			
			$("#dialog").dialog("open");
		},
		error:function(){//修理失败，未能连接
			alert("保存用户失败，请联系管理员");
		}
	});
}


/**
 * 设置用户角色信息
 * @param userId
 */
function setRole(userId,userN){
	userId_Role = userId;
	$('#dialogRole').dialog('option', 'title',userN+"的角色");
	//得到角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../sys/getUserRole.do',//这里是接收数据的URL
		data:'userId='+userId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(data){
			//创建选择框
			var roleA = eval("("+data+")");
			$("#div_role").empty();
			for(var i=0;i<roleA.length;i++){
				if(roleA[i].checked)
					$("#div_role").append("<input type='checkbox' name='ck_role' value='"+roleA[i].id+"' checked>&nbsp;&nbsp;"+roleA[i].name+"<br/>");
				else
					$("#div_role").append("<input type='checkbox' name='ck_role' value='"+roleA[i].id+"'>&nbsp;&nbsp;"+roleA[i].name+"<br/>");
			}
			//显示对话框
			$("#dialogRole").dialog("open");
		},
		error:function(){//修理失败，未能连接
			alert("未获得到用户角色，请联系管理员");
		}
	});
}
/**
 * 保存用户角色信息
 */
function saveUserRole(){
	var roleIds = "";
	//获取选择角色
	$('input[type="checkbox"][name="ck_role"]:checked').each(
        function() {
        	roleIds+=$(this).val()+",";   
        }
    );
	if(roleIds.length<1){
		alert("请选择角色！");
		return;
	}
	//向后台发送数据
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../sys/saveUserRole.do',//这里是接收数据的URL
		data:'userId='+userId_Role+'&roleIds='+roleIds,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			if(msg=="1")
				$("#dialogRole").dialog("close");
			else
				alert("保存角色失败，请联系管理员");
		},
		error:function(){//修理失败，未能连接
			alert("保存角色失败，请联系管理员");
		}
	});
}

