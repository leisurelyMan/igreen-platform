
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list").jqGrid({
		url : '../excelIpeIndustry/pageList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		colNames : ['<b>公司名称</b>','<b>url</b>','<b>省</b>','<b>市</b>','<b>处罚类型</b>','<b>处罚公布时间</b>','<b>处罚金额</b>','<b>处罚编号</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
                    {name:'companyName',index:'companyName', width:120,sortable:false},
                    {name:'webDetailUrl',index:'webDetailUrl', width:180,sortable:false},
                    {name:'province',index:'province', width:60,sortable:false},
                    {name:'city',index:'city', width:60,sortable:false},
                    {name:'punishType',index:'punishType', width:60,sortable:false},
                    {name:'punishTime',index:'punishTime', width:60,sortable:false},
                    {name:'punishMoney',index:'punishMoney', width:60,sortable:false},
                    {name:'punishNo',index:'punishNo', width:60,sortable:false},
					{name:'id',index:'id', width:40,formatter:getActions,sortable:false,resizable:false,align:'center'}
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
		caption : "处罚记录"//表格的标题名字
	});
	
	jQuery("#list").jqGrid('navGrid', '#pager', {edit : false,add : false,del : false});
	
    $("#dialog").dialog({   //创建dialog弹窗
		title:'处罚信息',
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
						url:'../excelIpeIndustry/saveOrUpdate.do',//这里是接收数据的URL
						data:$('#dialogform').serialize(),//传给后台的数据，多个参数用&连接
						dataType:'json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
						success:function(msg){
							if(msg.code == -1){
								alert(msg.message);
								//验证插入后，刷新grid
							}else{
								alert("保存成功");
								$("#list").trigger("reloadGrid");
								$("#dialog").dialog("close");
							}
						},
						error:function(){//修理失败，未能连接
							alert("保存失败");
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
						url:'../excelIpeIndustry/uploadExcel.do',//这里是接收数据的URL
						data:formData,//传给后台的数据，多个参数用&连接
						dataType:'json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
						success:function(msg){
							if(msg.code == 1){
								alert("导入成功");
								$("#list").trigger("reloadGrid");
								$("#exceldialog").dialog("close");
							}else if(msg.code == -2){
							    alert(msg.message);
                                $("#errorrow").val(msg.message);
							}else{
								alert(msg.message);
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


    $("#add").click(function(){
        //清空原有值
        $('#id').val("");
        $('#webDetailUrl').val("");
        $('#companyName').val("");
        $('#province').val("");
        $('#city').val("");
        $('#punishType').val("");
        $('#punishTime').val("");
        $('#punishMoney').val("");
        $('#punishNo').val("");

        //打开对话表
        $("#dialog").dialog("open");
    });


	$("#search").click(function(){
		var webName = $('#searchWebName').val();
		var webDetailName = $('#searchWebDetailName').val();
		var searchName = $('#searchName').val();
		
		$("#list").jqGrid("setGridParam",{postData:{webName:webName,webDetailName:webDetailName,searchName:searchName},page:1} );//设置查询参数
		$("#list").trigger("reloadGrid");
	});

    $("#distinceupload").click(function(){
        $("#exceldialog").dialog("open");
    });
    $("#deleteAll").click(function(){
        $.ajax({
            type:'post',//可选get
            async:false,//同步
            url:'../excelIpeIndustry/deleteAll.do',//这里是接收数据的URL
            dataType:'json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
            success:function(msg){
                if(msg.code == 1){
                    alert("删除成功");
                    $("#list").trigger("reloadGrid");
                    $("#dialog").dialog("close");
                }else{
                    alert(msg.message);
                    //验证插入后，刷新grid
                }
            },
            error:function(){//修理失败，未能连接
                alert("保存失败");
            }
        });
    });

    $("#affirm").click(function(){
        if(confirm("数据提交后将不能再修改")){
            $.ajax({
                type:'post',//可选get
                async:false,//同步
                url:'../excelIpeIndustry/affirm.do',//这里是接收数据的URL
                dataType:'json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
                success:function(msg){
                    if(msg.code == 1){
                        alert("数据确认成功");
                        $("#list").trigger("reloadGrid");
                        $("#dialog").dialog("close");
                    }else{
                        alert(msg.message);
                        //验证插入后，刷新grid
                    }
                },
                error:function(){//修理失败，未能连接
                    alert("操作失败");
                }
            });
        }
    });

});


/**
 * 编辑角色详情
 * @param userId
 */
function edit(recordId){
	//取得角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../excelIpeIndustry/getOne.do',//这里是接收数据的URL
		data:'recordId='+recordId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var obj = eval("("+msg+")");

			//更新信息至roleform并dialog显示
			$('#id').val(obj.id);
            $('#webDetailUrl').val(obj.webDetailUrl);
            $('#companyName').val(obj.companyName);
            $('#province').val(obj.province);
            $('#city').val(obj.city);
            $('#punishType').val(obj.punishType);
            $('#punishTime').val(obj.punishTime);
            $('#punishMoney').val(obj.punishMoney);
            $('#punishNo').val(obj.punishNo);

			$("#dialog").dialog("open");
		},
		error:function(){//修理失败，未能连接
			alert("获取信息失败");
		}
	});
}

function deleteRecord(recordId){
	//取得角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../excelIpeIndustry/deleteRecord.do',//这里是接收数据的URL
		data:'recordId='+recordId,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){

            if(msg.code == -1){
                alert(msg.message);
                //验证插入后，刷新grid
            }else{
                alert("删除成功");
                $("#list").trigger("reloadGrid");
                $("#dialog").dialog("close");
            }
		},
		error:function(){//修理失败，未能连接
			alert("获取信息失败");
		}
	});
}

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:edit(\''+rowObject.id+'\')">编辑</a>&nbsp;'
    +'<a href="javascript:deleteRecord(\''+rowObject.id+'\')">删除</a>&nbsp;';
}


