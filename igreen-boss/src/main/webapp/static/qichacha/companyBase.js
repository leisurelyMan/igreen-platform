
jQuery(document).ready(function(){
	//创建jqGrid组件
	jQuery("#list2").jqGrid({
		url : '../companybase/companybaseList.do',//组件创建完成之后请求数据的url
		datatype : "json",//请求数据返回的类型。可选json,xml,txt
		rownumbers: true,
		postData:{name:$('#searchName').val(), creditCode:$('#searchCreditCode').val(),orgNo:$('#searchOrgNo').val(),companyNames:$('#searchCompanyNames').val()},
		colNames : ['<b>企业名称</b>','<b>注册时间</b>','<b>注册编码</b>','<b>行业</b>','<b>细分行业</b>','<b>注册资本</b>','<b>组织机构代码</b>','<b>状态</b>','<b>操作</b>' ],//jqGrid的列显示名字
		colModel : [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		 		    {name:'name',index:'name', width:80,sortable:false},
					{name:'startDate',index:'startDate', width:80,sortable:false},
					{name:'creditCode',index:'creditCode', width:80,sortable:false},
					{name:'industry',index:'industry', width:80,sortable:false}, 
					{name:'subindustry',index:'subindustry', width:80,sortable:false},
					{name:'registCapi',index:'registCapi', width:50,sortable:false},
					{name:'orgNo',index:'orgNo', width:80,sortable:false},
					{name:'status',index:'status', width:80,sortable:false},
					{name:'keyNo',index:'keyNo', width:230,formatter:getActions,sortable:false,resizable:false,align:'center'}
		           ],
		rowNum : $('#pageRows').val(),//一页显示多少条
		page : $('#currentPage').val(),
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
	
	
	$("#dialog").dialog({   //创建dialog弹窗
		title:'公司基本信息',
		autoOpen: false,     //不自动打开窗口 
		show:"slide",       //显示弹窗出现的效果，slide为滑动效果 
		hide:"explode",     //显示窗口消失的效果，explode为爆炸效果
		resizable: true,    //设置是否可拉动弹窗的大小，默认为true  
		modal: true,         //是否有遮罩模型  
		width: 600,
		zIndex: 2,
		buttons:[//定义两个button按钮
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
		$('#companyName').val("");
		$('#legalRepresentative').val("");
		$('#registNumber').val("");
		$('#oldRegistNumber').val("");
		$('#registeredCapital').val("");
		$('#paidInCapital').val("");
		$('#currency').val("");
		$('#companyType').val("");
		$('#operateState').val("");
		$('#startTime').val("");
		$('#endTime').val("");
		$('#openTime').val("");
		$('#cancelTime').val("");
		$('#revokeTime').val("");
		$('#registOffice').val("");
		$('#address').val("");
		$('#annualYear').val("");
		$('#annualDay').val("");
		$('#tradeCode').val("");
		$('#tradeName').val("");
		$('#countryTradeCode').val("");
		$('#countryTradeName').val("");
		$('#permission').val("");
		$('#general').val("");
		$('#businessScope').val("");
		$('#businessWay').val("");
		//打开对话表
		$("#dialog").dialog("open");
	});
	
	$("#search").click(function(){
		var searchName = $('#searchName').val();
		var searchCreditCode = $('#searchCreditCode').val();
		var searchOrgNo = $('#searchOrgNo').val();
		var searchCompanyNames = $('#searchCompanyNames').val();
		$("#list2").jqGrid("setGridParam",{postData:{name:searchName, creditCode:searchCreditCode,
			orgNo:searchOrgNo,companyNames:searchCompanyNames},page:1} );//设置查询参数
		$("#list2").trigger("reloadGrid");
	});
});

function getActions(cellvalue, options, rowObject){
    return '<a href="javascript:edit(\''+rowObject.keyNo+'\')">查看详情</a>&nbsp;'
    		/*+'<a href="../qichacha/judgement/toJudgementList.do?keyNo='+rowObject.keyNo+'">法院判决信息</a>&nbsp;'*/
    		+'<a href="javascript:JudgementList(\''+rowObject.keyNo+'\')">法院判决信息</a>&nbsp;'
    		+'<a href="javascript:PatentList(\''+rowObject.keyNo+'\')">专利信息</a>&nbsp;'
    		+'<a href="javascript:PenaltyList(\''+rowObject.keyNo+'\')">处罚信息</a>';
}


function PenaltyList(keyNo){
	var keyNoinput = $('<input type="hidden" name="keyNo" value="'+keyNo+'"/>');
	var searchNameinput = $('<input type="hidden" name="name" value="'+$('#searchName').val()+'"/>');
	var searchCreditCodeinput = $('<input type="hidden" name="creditCode" value="'+$('#searchCreditCode').val()+'"/>');
	var searchOrgNoinput = $('<input type="hidden" name="orgNo" value="'+$('#searchOrgNo').val()+'"/>');
	var searchCompanyNamesinput = $('<input type="hidden" name="companyNames" value="'+$('#searchCompanyNames').val()+'"/>');
	var currentPageinput = $('<input type="hidden" name="currentPage" value="'+$('#list2').getGridParam('page')+'"/>');
	var pageRowsinput = $('<input type="hidden" name="pageRows" value="'+$('#list2').getGridParam('rowNum')+'"/>');
    // 取得要提交页面的URL  
    var action = "../qichacha/patent/toPatentList.do"; 
    // 创建Form  
    var form = $('<form id="hiddenform"></form>');
    // 设置属性  
    form.attr('action', action);  
    form.attr('method', 'post');  
    // form的target属性决定form在哪个页面提交  
    // _self -> 当前页面 _blank -> 新页面  
    form.attr('target', '_self');  
    // 附加到Form 
    form.append(keyNoinput);
    form.append(searchNameinput);
    form.append(searchCreditCodeinput);
    form.append(searchOrgNoinput);
    form.append(searchCompanyNamesinput);
    form.append(currentPageinput);
    form.append(pageRowsinput);
    $("#hiddendiv").empty().append(form);
    // 提交表单  
    $("#hiddenform").submit();	
}


function PatentList(keyNo){
	var keyNoinput = $('<input type="hidden" name="keyNo" value="'+keyNo+'"/>');
	var searchNameinput = $('<input type="hidden" name="name" value="'+$('#searchName').val()+'"/>');
	var searchCreditCodeinput = $('<input type="hidden" name="creditCode" value="'+$('#searchCreditCode').val()+'"/>');
	var searchOrgNoinput = $('<input type="hidden" name="orgNo" value="'+$('#searchOrgNo').val()+'"/>');
	var searchCompanyNamesinput = $('<input type="hidden" name="companyNames" value="'+$('#searchCompanyNames').val()+'"/>');
	var currentPageinput = $('<input type="hidden" name="currentPage" value="'+$('#list2').getGridParam('page')+'"/>');
	var pageRowsinput = $('<input type="hidden" name="pageRows" value="'+$('#list2').getGridParam('rowNum')+'"/>');
    // 取得要提交页面的URL  
    var action = "../qichacha/patent/toPatentList.do"; 
    // 创建Form  
    var form = $('<form id="hiddenform"></form>');
    // 设置属性  
    form.attr('action', action);  
    form.attr('method', 'post');  
    // form的target属性决定form在哪个页面提交  
    // _self -> 当前页面 _blank -> 新页面  
    form.attr('target', '_self');  
    // 附加到Form 
    form.append(keyNoinput);
    form.append(searchNameinput);
    form.append(searchCreditCodeinput);
    form.append(searchOrgNoinput);
    form.append(searchCompanyNamesinput);
    form.append(currentPageinput);
    form.append(pageRowsinput);
    $("#hiddendiv").empty().append(form);
    // 提交表单  
    $("#hiddenform").submit();	
}

function JudgementList(keyNo){
	var keyNoinput = $('<input type="hidden" name="keyNo" value="'+keyNo+'"/>');
	var searchNameinput = $('<input type="hidden" name="name" value="'+$('#searchName').val()+'"/>');
	var searchCreditCodeinput = $('<input type="hidden" name="creditCode" value="'+$('#searchCreditCode').val()+'"/>');
	var searchOrgNoinput = $('<input type="hidden" name="orgNo" value="'+$('#searchOrgNo').val()+'"/>');
	var searchCompanyNamesinput = $('<input type="hidden" name="companyNames" value="'+$('#searchCompanyNames').val()+'"/>');
	var currentPageinput = $('<input type="hidden" name="currentPage" value="'+$('#list2').getGridParam('page')+'"/>');
	var pageRowsinput = $('<input type="hidden" name="pageRows" value="'+$('#list2').getGridParam('rowNum')+'"/>');
    // 取得要提交页面的URL  
    var action = "../qichacha/judgement/toJudgementList.do";  
    // 创建Form  
    var form = $('<form id="hiddenform"></form>');
    // 设置属性  
    form.attr('action', action);  
    form.attr('method', 'post');  
    // form的target属性决定form在哪个页面提交  
    // _self -> 当前页面 _blank -> 新页面  
    form.attr('target', '_self');  
    // 附加到Form 
    form.append(keyNoinput);
    form.append(searchNameinput);
    form.append(searchCreditCodeinput);
    form.append(searchOrgNoinput);
    form.append(searchCompanyNamesinput);
    form.append(currentPageinput);
    form.append(pageRowsinput);
    $("#hiddendiv").empty().append(form);
    // 提交表单  
    $("#hiddenform").submit();
}


/**
 * 编辑详情
 * @param userId
 */
function edit(keyNo){
	//取得角色信息
	$.ajax({
		type:'post',//可选get
		async:false,//同步
		url:'../companybase/getQichachaCompanyBase.do',//这里是接收数据的URL
		data:'keyNo='+keyNo,//传给后台的数据，多个参数用&连接
		dataType:'text',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		success:function(msg){
			var userObj = eval("("+msg+")");
			
			//更新信息至roleform并dialog显示
			$('#name').val(userObj.name);
		    /**
		     * 注册时间
		     */
			$('#startDate').val(userObj.startDate);
		    /**
		     * 省编码
		     */
			$('#province').val(userObj.province);
		    /**
		     * 行业编码
		     */
			$('#industryCode').val(userObj.industryCode);
		    /**
		     * 细分行业编码
		     */
			$('#subindustryCode').val(userObj.subindustryCode);
		    /**
		     * 行业
		     */
			$('#industry').val(userObj.industry);
		    /**
		     * 细分行业
		     */
			$('#subindustry').val(userObj.subindustry);
		    /**
		     * 注册编码
		     */
			$('#creditCode').val(userObj.creditCode);
		    /**
		     * 注册资本
		     */
			$('#registCapi').val(userObj.registCapi);
		    /**
		     * 经营形式
		     */
			$('#econKind').val(userObj.econKind);
		    /**
		     * 组织机构代码
		     */
			$('#orgNo').val(userObj.orgNo);
		    /**
		     * 状态
		     */
			$('#status').val(userObj.status);
		    /**
		     * 经营范围
		     */
			$('#scope').val(userObj.scope);
			
			
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
