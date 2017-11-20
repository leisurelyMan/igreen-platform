/***********构建树所需参数*************/
var curRoleId = "";
var setting = null;
var zNodes =[];

jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../sys/roleList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : [ '<b>角色名称</b>', '<b>角色简称</b>', '<b>角色状态</b>', '<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'name',index:'name', width:80,sortable:false},
					{name:'shortName',index:'shortName', width:80,sortable:false},
					{name:'status',index:'status', width:80,sortable:false,formatter:getStatus},  
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
	
	
	//功能选择控件
	setting = {
		check: {
			enable: true,
			chkboxType: { "Y": "ps", "N": "ps" }
		},
		view: {
			dblClickExpand: false
		},
		data: {
			key:{
				name:"name",
				checked: "checked"
			},
			simpleData: {
				enable: true,
				idKey:"id",
				pIdKey:"parentId",
				rootPId:"0"
			}
		},
		async: {  
			 enable: true,  
			 url:getAsyncUrl,
			 dataType: "text",  
			 dataFilter: ajaxDataFilter, 
			 autoParam:["id","pid","name"]
		}, 
		callback: {
			beforeClick: beforeClick,
			onClick: onClick
		}
	};
	
	function beforeClick(treeId, treeNode) {
		var check = (treeNode && !treeNode.isParent);
		if (!check) alert("只能选择部门");
		return check;
	}
	function onClick(e, treeId, treeNode) {
		var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
		nodes = zTree.getSelectedNodes(),
		v = "";
		n = "";
		nodes.sort(function compare(a,b){return a.id-b.id;});
		for (var i=0, l=nodes.length; i<l; i++) {
			v = nodes[i].id;
			n = nodes[i].unitName;
		}
		
		curUnitIdSelect.val(v);
		curUnitNameSelect.val(n);
		hideMenu();
	}
	function ajaxDataFilter(treeId, parentNode, childNodes){
		if (!childNodes) return null; 
		for (var i=0, l=childNodes.length; i<l; i++) {
			childNodes[i].name = childNodes[i].name.replace('',''); 
		} 
		return childNodes; 
	}
	$.fn.zTree.init($("#treeMenu"), setting, zNodes);
	
	
	$("#dialog").dialog({   //创建dialog弹窗
		title:'角色管理',
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
						url:'../sys/addRole.do',//这里是接收数据的URL
						data:$('#roleform').serialize(),//传给后台的数据，多个参数用&连接
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
	jQuery("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
	
	$("#add").click(function(){
		//清空原有值
		$('#id').val("");
		$('#name').val("");
		$('#shortName').val("");
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
    return '<a href="javascript:editRole(\''+rowObject.id+'\')">编辑</a>&nbsp;'
    		+'<a href="javascript:setRoleMenu(\''+rowObject.id+'\')">设置功能</a>';
}

/**
 * 编辑角色详情
 * @param userId
 */
function editRole(userId){
	//取得角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../sys/getOneRole.do',//这里是接收数据的URL
		data:'userId='+userId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var userObj = eval("("+msg+")");
			
			//更新信息至roleform并dialog显示
			$('#id').val(userObj.id);
			$('#name').val(userObj.name);
			$('#shortName').val(userObj.shortName);
			
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

function getAsyncUrl(treeId, treeNode){
	return "../sys/getRoleMenuTree.do?roleId="+curRoleId;
}
/**
 * 设置角色拥有的菜单权限
 * @param roleId
 */
function setRoleMenu(roleId){
	curRoleId = roleId;
	//初始化树
	$.fn.zTree.destroy();
	
	$.fn.zTree.init($("#treeMenu"), setting, zNodes);
	
	//显示菜单树
	showMenu();
}
/**
 * 居中显示图层
 */
function showMenu() {
    var bH = $(document).height();
    var bW = $(document).width();
    $("#menuContent").css({left:(($(document).width())/2-(parseInt($("#menuContent").width())/2)) + "px", 
    	top: + (($(document).height())/2-(parseInt($("#menuContent").height())/2)) + "px"}).slideDown("fast");
}
/**
 * 保存选择Menu
 */
function saveMenu(){
	var roleId = curRoleId;
	var treeObj = $.fn.zTree.getZTreeObj("treeMenu");
	//计算已选节点ID，以逗号分隔
	var nodes = treeObj.getCheckedNodes(true);
	var rtn_menuid = "";
	for(var i=0;i<nodes.length;i++){
		rtn_menuid += nodes[i].id+",";
	}
	//将数据传入后台
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../sys/saveRoleMenu.do',//这里是接收数据的URL
		data:'roleId='+roleId+'&menuIds='+rtn_menuid,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			closeMenu();
		},
		error:function(){//修理失败，未能连接
			alert("保存信息失败，请联系管理员");
		}
	});
}
/**
 * 关闭菜单树
 */
function closeMenu() {
	$("#menuContent").css({display:'none'});
}