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
	<script type="text/javascript" src="../static/businessRisk/freezeStockRight.js"></script>

<title>股权冻结信息</title>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
			<div id="usual1" class="usual">
				<div class="itab">
					<ul>
						<li><a href="../businessRisk/toAdministrativePenaltyList.do?id=${id}">行政处罚信息</a></li>
						<li><a href="../businessRisk/toFreezeStockRightList.do?id=${id}" class="selected">股权冻结信息</a></li>
						<li><a href="../businessRisk/toPledgeStockRightList.do?id=${id}">股权质押信息</a></li>
						<li><a href="../businessRisk/toChattelMortgageList.do?id=${id}">动产抵押信息</a></li>
						<li><a href="../businessRisk/toThingChattelMortgageList.do?id=${id}">动产抵押物信息</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>冻结文号：<input id="searchFreezeNo"	name="searchFreezeNo" type="text" class="searchinput" /></li>
				<li>冻结机关：<input id="searchFreezeOffice"	name="searchFreezeOffice" type="text" class="searchinput" /></li>
				<li>解冻文号：<input id="searchUnfreezeNo"	name="searchUnfreezeNo" type="text" class="searchinput" /></li>
				<li>解冻机关：<input id="searchUnfreezeOffice"	name="searchUnfreezeOffice" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><span><img src="../static/images/t01.png" /></span>添加</li>
			</ul>
		</div>
		<table id="list1"></table>
		</br>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="股权冻结信息">
			<form class="executedItemform" id="executedItemform">
				<input type="hidden" id="id" name="id" value="" />
				<input type="hidden" name="registItemId" id="registItemId" value="${id}"/>
				<ul class="forminfo">
					<li><label>冻结文号</label><input id="freezeNo" name="freezeNo" type="text" class="dfinput" /></li>
					<li><label>冻结机关</label><input id="freezeOffice" name="freezeOffice" type="text" class="dfinput" /></li>
					<li><label>冻结起始日期</label><input id="freezeBeginTime" name="freezeBeginTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>冻结截至日期</label><input id="freezeEndTime" name="freezeEndTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>冻结金额</label><input id="freezeAmount" name="freezeAmount" type="text" class="dfinput" /></li>
					<li><label>解冻机关</label><input id="unfreezeOffice" name="unfreezeOffice" type="text" class="dfinput" /></li>
					<li><label>解冻文号</label><input id="unfreezeNo" name="unfreezeNo" type="text" class="dfinput" /></li>
					<li><label>解冻日期</label><input id="unfreezeTime" name="unfreezeTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>解冻说明</label><input id="unfreezeExplain" name="unfreezeExplain" type="text" class="dfinput" /></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>