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
	<script type="text/javascript" src="../static/businessRisk/pledgeStockRight.js"></script>

<title>股权质押信息</title>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
			<div id="usual1" class="usual">
				<div class="itab">
					<ul>
						<li><a href="../businessRisk/toAdministrativePenaltyList.do?id=${id}">行政处罚信息</a></li>
						<li><a href="../businessRisk/toFreezeStockRightList.do?id=${id}">股权冻结信息</a></li>
						<li><a href="../businessRisk/toPledgeStockRightList.do?id=${id}" class="selected">股权质押信息</a></li>
						<li><a href="../businessRisk/toChattelMortgageList.do?id=${id}">动产抵押信息</a></li>
						<li><a href="../businessRisk/toThingChattelMortgageList.do?id=${id}">动产抵押物信息</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>质权人姓名：<input id="searchPledgee"	name="searchPledgee" type="text" class="searchinput" /></li>
				<li>出质人类别：<input id="searchPledgeeType"	name="searchPledgeeType" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><span><img src="../static/images/t01.png" /></span>添加</li>
			</ul>
		</div>
		<table id="list1"></table>
		</br>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="股权质押信息">
			<form class="executedItemform" id="executedItemform">
				<input type="hidden" id="id" name="id" value="" />
				<input type="hidden" name="registItemId" id="registItemId" value="${id}"/>
				<ul class="forminfo">
					<li><label>质权人姓名</label><input id="pledgee" name="pledgee" type="text" class="dfinput" /></li>
					<li><label>出质人类别</label><input id="pledgeeType" name="pledgeeType" type="text" class="dfinput" /></li>
					<li><label>出质金额</label><input id="pledgeAmount" name="pledgeAmount" type="text" class="dfinput" /></li>
					<li><label>出质备案日期</label><input id="recordTime" name="recordTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>出质审批部门</label><input id="examinedOffice" name="examinedOffice" type="text" class="dfinput" /></li>
					<li><label>出质批准日期</label><input id="examinedTime" name="examinedTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>出质截至日期</label><input id="examinedEndTime" name="examinedEndTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>