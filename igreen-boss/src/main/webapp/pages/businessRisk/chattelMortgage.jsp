<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="../ztree/css/zTreeStyle/zTreeStyle.css">
	<link rel="stylesheet" type="text/css" media="screen" href="../static/jqgrid/css/ui.jqgrid.css" />
	<link rel="stylesheet" type="text/css" media="screen" href="../static/css/jqueryui/jquery-ui-1.10.4.custom.min.smoothness.css" />
	<script type="text/javascript" src="../static/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="../static/js/ui/jquery-ui-1.10.4.custom.min.smoothness.js"></script>
	<script type="text/javascript" src="../ztree/js/jquery.ztree.core.js"></script>
	<script type="text/javascript" src="../ztree/js/jquery.ztree.excheck.js"></script>
	<script type="text/javascript" src="../ztree/js/jquery.ztree.exedit.js"></script>
	
	<script type="text/javascript" src="../static/jqgrid/js/i18n/grid.locale-cn.js"></script>
	<script type="text/javascript" src="../static/jqgrid/js/jquery.jqGrid.src.js"></script>
	<link rel="stylesheet" href="../static/css/style_new.css">

    <!-- 日期插件 -->
    <script type="text/javascript" src="../static/laydate/laydate.dev.js"></script>

	<!-- 本页面初始化用到的js包，创建jqGrid的代码就在里面 -->
	<script type="text/javascript" src="../static/businessRisk/chattelMortgage.js"></script>

<title>动产抵押信息</title>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
			<div id="usual1" class="usual">
				<div class="itab">
					<ul>
						<li><a href="../businessRisk/toAdministrativePenaltyList.do?id=${id}">行政处罚信息</a></li>
						<li><a href="../businessRisk/toFreezeStockRightList.do?id=${id}">股权冻结信息</a></li>
						<li><a href="../businessRisk/toPledgeStockRightList.do?id=${id}">股权质押信息</a></li>
						<li><a href="../businessRisk/toChattelMortgageList.do?id=${id}" class="selected">动产抵押信息</a></li>
						<li><a href="../businessRisk/toThingChattelMortgageList.do?id=${id}">动产抵押物信息</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>抵押人：<input id="searchMortgagee"	name="searchMortgagee" type="text" class="searchinput" /></li>
				<li>抵押权人：<input id="searchPledgee"	name="searchPledgee" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><span><img src="../static/images/t01.png" /></span>添加</li>
			</ul>
		</div>
		<table id="list1"></table>
		</br>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="动产抵押信息">
			<form class="executedItemform" id="executedItemform">
				<input type="hidden" id="id" name="id" value="" />
				<input type="hidden" name="registItemId" id="registItemId" value="${id}"/>
				<ul class="forminfo">
					<li><label>抵押ID</label><input id="mortgageId" name="mortgageId" type="text" class="dfinput" /></li>
					<li><label>抵押人</label><input id="mortgagee" name="mortgagee" type="text" class="dfinput" /></li>
					<li><label>抵押权人</label><input id="pledgee" name="pledgee" type="text" class="dfinput" /></li>
					<li><label>登记机关</label><input id="registOffice" name="registOffice" type="text" class="dfinput" /></li>
					<li><label>登记日期</label><input id="registTime" name="registTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>状态标识</label><input id="mortgageStatus" name="mortgageStatus" type="text" class="dfinput" /></li>
					<li><label>登记证号</label><input id="registNo" name="registNo" type="text" class="dfinput" /></li>
					<li><label>申请抵押原因</label><input id="mortgageReason" name="mortgageReason" type="text" class="dfinput" /></li>
					<li><label>被担保主债权种类</label><input id="creditorType" name="creditorType" type="text" class="dfinput" /></li>
					<li><label>被担保主债权数额(万元)</label><input id="creditorAmount" name="creditorAmount" type="text" class="dfinput" /></li>
					<li><label>履约起始日期</label><input id="beginTime" name="beginTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>履约截止日期</label><input id="endTime" name="endTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>注销日期</label><input id="cancelTime" name="cancelTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>