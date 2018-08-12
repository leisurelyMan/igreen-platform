
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../companyQuery/toQueryConfigList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>id</b>','<b>名称</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'id',index:'id', width:80,sortable:false},
					{name:'name',index:'name', width:80,sortable:false},
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
		caption : "查询配置信息列表"//表格的标题名字
	});
	
	jQuery("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
	
	$("#add").click(function(){
		toEdit(null);
	});
	
	$("#search").click(function(){
		var searchName = $('#searchName').val();
		$("#list2").jqGrid("setGridParam",{postData:{name:searchName},page:1} );//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
});

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:toEdit(\''+rowObject.id+'\')">编辑</a>&nbsp;';
}

function toEdit(id){
	if(id != null)
		var idinput = $('<input type="hidden" name="id" value="'+id+'"/>');
	var searchName = $('<input type="hidden" name="name" value="'+$('#searchName').val()+'"/>');
	var currentPageinput = $('<input type="hidden" name="currentPage" value="'+$('#list2').getGridParam('page')+'"/>');
	var pageRowsinput = $('<input type="hidden" name="pageRows" value="'+$('#list2').getGridParam('rowNum')+'"/>');
    // 取得要提交页面的URL  
    var action = "../companyQuery/toQueryConfigEdit.do";  
    // 创建Form  
    var form = $('<form id="hiddenform"></form>');
    // 设置属性  
    form.attr('action', action);  
    form.attr('method', 'post');  
    // form的target属性决定form在哪个页面提交  
    // _self -> 当前页面 _blank -> 新页面  
    form.attr('target', '_self');  
    // 附加到Form 
    form.append(idinput);
    form.append(searchName);
    form.append(currentPageinput);
    form.append(pageRowsinput);
    $("#hiddendiv").empty().append(form);
    // 提交表单  
    $("#hiddenform").submit();
}

function getStatus(cellvalue, options, rowObject){
	if(cellvalue == 1)
		return "有效";
	else
		return "无效";
}
