//定义角色用户ID
var userId_Role = ""; 
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list").jqGrid({
		url : '../aiIpe/ipeListData.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : [ '<b>罚款</b>','<b>暂扣、吊销许可证</b>', '<b>没收违法所得</b>', '<b>行政拘留</b>', '<b>责令停产整顿</b>', '<b>责令停产、停业、关闭</b>', '<b>other</b>', '<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'fine',index:'fine', width:80,sortable:false},
		 		    {name:'revoke',index:'revoke', width:80,sortable:false},
					{name:'confiscate',index:'confiscate', width:80,sortable:false},
		 		    {name:'detention',index:'detention', width:100,sortable:false},
					{name:'production',index:'production', width:100,sortable:false},
					{name:'instruct',index:'instruct', width:100,sortable:false},
					{name:'other',index:'other', width:100,sortable:false},
					{name:'id',index:'id', width:130,formatter:getActions,sortable:false,resizable:false,align:'center'}
		           ],
		rowNum : 10,//一页显示多少条
		rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
		pager : '#pager',//表格页脚的占位符(一般是div)的id
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
	    prmNames:{
	    	page:'currentPage',
	    	rows:'pageRows'
	    },
		caption : "ai"//表格的标题名字
	});
	
	
	jQuery("#list").jqGrid('navGrid', '#pager', {edit : false,add : false,del : false});
	
	$("#search").click(function(){
		var company = $('#company').val();
		var year = $('#year').val();
		var season = $('#season').val();
		var province = $('#province').val();
		var city = $("#city").val();
		var industry = $("#industry").val();
		var subIndustry = $("#subIndustry").val();
		$("#list").jqGrid("setGridParam",{postData:{company:company,year:year,season:season,province:province,city:city,industry:industry,subIndustry:subIndustry},page:1} );//设置查询参数
		$("#list").trigger("reloadGrid");
	});
	
});

function getActions(cellvalue, options, rowObject){
    //return '<a href="javascript:industry(\''+rowObject.id+'\')">查看详情</a>&nbsp;';
    return '<a href="http://47.94.240.82/ipe/'+rowObject.fileName+'" target="view_window">查看详情</a>'
}
