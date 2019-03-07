//定义角色用户ID
var userId_Role = ""; 
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../ipe/industryList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : [ '<b>企业名称</b>', '<b>年度</b>', '<b>标题</b>', '<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'companyName',index:'companyName', width:80,sortable:false},
					{name:'year',index:'year', width:20,sortable:false},
		 		    {name:'title',index:'title', width:200,sortable:false},
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
	
	
	jQuery("#list2").jqGrid('navGrid', '#pager2', {edit : false,add : false,del : false});
	
	$("#search").click(function(){
		var companyName = $('#companyName').val();
		var year = $('#year').val();
		var title = $('#title').val();
		var address = $('#address').val();
		$("#list2").jqGrid("setGridParam",{postData:{companyName:companyName,year:year,title:title,address:address},page:1} );//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
	
});

function getActions(cellvalue, options, rowObject){
    //return '<a href="javascript:industry(\''+rowObject.id+'\')">查看详情</a>&nbsp;';
    if(rowObject.fileName == null)
    return "";
    if(rowObject.fileName.indexOf("/data/files")>=0)
        return '<a href="http://img.igreenbank.cn/'+rowObject.fileName.replace('/data/files/','')+'" target="view_window">查看详情</a>'
    return '<a href="http://img.igreenbank.cn/ipe/'+rowObject.fileName+'" target="view_window">查看详情</a>'
}
