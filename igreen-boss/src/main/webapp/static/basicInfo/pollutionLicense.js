
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#pollutionTable").jqGrid({
		url : '../basicInfo/pollutionLicenseList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>省/直辖市</b>','<b>城市</b>','<b>许可证编号</b>','<b>单位名称</b>','<b>行业类别</b>','<b>有效期限</b>','<b>发证日期</b>','<b>公司地址</b>','<b>详情</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'province',index:'province', width:30,sortable:false},
					{name:'city',index:'city', width:30,sortable:false},
					{name:'licenseNumber',index:'licenseNumber', width:100,sortable:false}, 
					{name:'companyName',index:'companyName', width:100,sortable:false},
					{name:'industry',index:'industry', width:50,sortable:false},
					{name:'validDate',index:'validDate', width:50,sortable:false},
					{name:'certificateDateStr',index:'certificateDateStr', width:50,sortable:false},
					{name:'address',index:'address', width:200,sortable:false},
					{name:'id',index:'id', width:50,formatter:getActions,sortable:false,resizable:false,align:'center'}
		           ],
		rowNum : 10,//一页显示多少条
		rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
		pager : '#pollutionPagin',//表格页脚的占位符(一般是div)的id
		autowidth : true,
		height: 'auto',
		mtype : "post",//向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
	    prmNames:{
	    	page:'currentPage',
	    	rows:'pageRows'
	    },
		caption : "空气质量日报分析"//表格的标题名字
	});
	
	$("#search").click(function(){
		var province = $('#province').val();
		var city = $('#city').val();
		var address = $('#address').val();
		var companyName = $('#companyName').val();
		var industry = $('#industry').val();
			
		var params = {province:province,city:city,address:address,companyName:companyName,
				industry:industry}
			
		$("#pollutionTable").jqGrid("setGridParam",{postData:params,page:1} );//设置查询参数
		$("#pollutionTable").trigger("reloadGrid");
	});
	
	function getActions(cellvalue, options, rowObject){
	    return '<a href="../basicInfo/toPollutionLicenseDetail.do?id='+rowObject.id+'">基本信息</a>&nbsp';
	}
})
	


