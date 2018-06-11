//定义角色用户ID
var userId_Role = ""; 
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list").jqGrid({
		url : '../aiIpe/ipeListData.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : [ '<b>罚款</b>','<b>暂扣、吊销许可证</b>', '<b>没收违法所得</b>', '<b>行政拘留</b>', '<b>责令停产整顿</b>', '<b>责令停产、停业、关闭</b>', '<b>other</b>'],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'fine',index:'fine', width:80,sortable:false},
		 		    {name:'revoke',index:'revoke', width:80,sortable:false},
					{name:'confiscate',index:'confiscate', width:80,sortable:false},
		 		    {name:'detention',index:'detention', width:100,sortable:false},
					{name:'production',index:'production', width:100,sortable:false},
					{name:'instruct',index:'instruct', width:100,sortable:false},
					{name:'other',index:'other', width:100,sortable:false}
		           ],
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

	//上传excel dialog
	$("#exceldialog").dialog({   //创建dialog弹窗
		title:'导入公司信息',
		autoOpen: false,     //不自动打开窗口
		show:"slide",       //显示弹窗出现的效果，slide为滑动效果
		hide:"explode",     //显示窗口消失的效果，explode为爆炸效果
		resizable: true,    //设置是否可拉动弹窗的大小，默认为true
		modal: true,         //是否有遮罩模型
		minWidth: 600,
		zIndex: 2,
		buttons:[//定义两个button按钮
			{
				text:"确定",
				id:'btn_ok',
				click:function(){
					var formData = new FormData();
					formData.append("upexcel", document.getElementById("upexcel").files[0]);
					$.ajax({
						type:'post',//可选get
						contentType: false,
						/**
						 * 必须false才会避开jQuery对 formdata 的默认处理
						 * XMLHttpRequest会对 formdata 进行正确的处理
						 */
						processData: false,
						url:'../aiIpe/uploadCompany.do',//这里是接收数据的URL
						data:formData,//传给后台的数据，多个参数用&连接
						dataType:'json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
						success:function(msg){
							if(msg.code == 1){
								alert("导入成功");
								$("#company").val(msg.obj);
								$("#exceldialog").dialog("close");
							}else{
								alert("导入失败");
							}
						},
						error:function(){//修理失败，未能连接
							alert("导入失败");
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
	
	jQuery("#list").jqGrid('navGrid', '#pager', {edit : false,add : false,del : false});
	
	$("#search").click(function(){
		var company = $('#company').val();
		var year = $('#year').val();
		var season = $('#season').val();
		if(company == null || company == ''
			|| year == '' || year == null
			|| season == null || season == ''){

			alert("公司名称、年度和季节是必填项，请重新输入！");
			return;
		}
		var province = $('#province').val();
		var city = $("#city").val();
		var industry = $("#industry").val();
		var subIndustry = $("#subIndustry").val();
		$("#list").jqGrid("setGridParam",{postData:{company:company,year:year,season:season,province:province,city:city,industry:industry,subIndustry:subIndustry},page:1} );//设置查询参数
		$("#list").trigger("reloadGrid");
	});

	$("#distincebutton").click(function(){
		var $eleForm = $("<form method='get'></form>");

		$eleForm.attr("action","../filetemplate/company_template.xlsx");

		$(document.body).append($eleForm);

		//提交表单，实现下载
		$eleForm.submit();
	});

	$("#distinceupload").click(function(){
		$("#exceldialog").dialog("open");
	});
	
});

function getActions(cellvalue, options, rowObject){
    //return '<a href="javascript:industry(\''+rowObject.id+'\')">查看详情</a>&nbsp;';
    return '<a href="http://47.94.240.82/ipe/'+rowObject.fileName+'" target="view_window">查看详情</a>'
}
