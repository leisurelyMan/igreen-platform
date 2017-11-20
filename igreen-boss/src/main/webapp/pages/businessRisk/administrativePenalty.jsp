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
	<script type="text/javascript" src="../static/businessRisk/administrativePenalty.js"></script>

<title>行政处罚信息</title>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
			<div id="usual1" class="usual">
				<div class="itab">
					<ul>
						<li><a href="../businessRisk/toAdministrativePenaltyList.do?id=${id}" class="selected">行政处罚信息</a></li>
						<li><a href="../businessRisk/toFreezeStockRightList.do?id=${id}">股权冻结信息</a></li>
						<li><a href="../businessRisk/toPledgeStockRightList.do?id=${id}">股权质押信息</a></li>
						<li><a href="../businessRisk/toChattelMortgageList.do?id=${id}">动产抵押信息</a></li>
						<li><a href="../businessRisk/toThingChattelMortgageList.do?id=${id}">动产抵押物信息</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>案由：<input id="searchCrimeReason"	name="searchCrimeReason" type="text" class="searchinput" /></li>
				<li>案件类型：<input id="searchCaseType"	name="searchCaseType" type="text" class="searchinput" /></li>
				<li>执行类别：<input id="searchExecuteType"	name="searchExecuteType" type="text" class="searchinput" /></li>
				<li>处罚机关：<input id="searchPunishOffice"	name="searchPunishOffice" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><span><img src="../static/images/t01.png" /></span>添加</li>
			</ul>
		</div>
		<table id="list1"></table>
		</br>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="行政处罚信息">
			<form class="executedItemform" id="executedItemform">
				<input type="hidden" id="id" name="id" value="" />
				<input type="hidden" name="registItemId" id="registItemId" value="${id}"/>
				<ul class="forminfo">
					<li><label>案发时间</label><input id="crimeTime" name="crimeTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>案由</label><input id="crimeReason" name="crimeReason" type="text" class="dfinput" /></li>
					<li><label>案件类型</label><input id="caseType" name="caseType" type="text" class="dfinput" /></li>
					<li><label>执行类别</label><input id="executeType" name="executeType" type="text" class="dfinput" /></li>
					<li><label>案件结果</label><input id="caseResult" name="caseResult" type="text" class="dfinput" /></li>
					<li><label>处罚决定书签发日期</label><input id="punishTime" name="punishTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>处罚机关</label><input id="punishOffice" name="punishOffice" type="text" class="dfinput" /></li>
					<li><label>主要违法事实</label><input id="factMalfeasance" name="factMalfeasance" type="text" class="dfinput" /></li>
					<li><label>处罚依据</label><input id="punishBase" name="punishBase" type="text" class="dfinput" /></li>
					<li><label>处罚种类</label><input id="punishType" name="punishType" type="text" class="dfinput" /></li>
					<li><label>处罚结果</label><input id="punishResult" name="punishResult" type="text" class="dfinput" /></li>
					<li><label>处罚金额</label><input id="punishAmount" name="punishAmount" type="text" class="dfinput" /></li>
					<li><label>处罚执行情况</label><input id="punishment" name="punishment" type="text" class="dfinput" /></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>