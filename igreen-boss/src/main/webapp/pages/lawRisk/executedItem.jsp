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
	<script type="text/javascript" src="../static/lawRisk/executedItem.js"></script>

<title>用户管理</title>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
			<div id="usual1" class="usual">
				<div class="itab">
					<ul>
						<li><a href="../lawRisk/toOpenCourtList.do?id=${id}">开庭公告</a></li>
						<li><a href="../lawRisk/toWrittenJudgementList.do?id=${id}">裁判文书信息</a></li>
						<li><a href="../lawRisk/toExecutedItemList.do?id=${id}" class="selected">被执行人信息</a></li>
						<li><a href="../lawRisk/toBreakPromiseExecutedList.do?id=${id}">失信被执行人信息</a></li>
						<li><a href="../lawRisk/toCourtNoticeList.do?id=${id}">法院公告</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>案件状态：<input id="searchCaseStatus"	name="searchCaseStatus" type="text" class="searchinput" /></li>
				<li>案号：<input id="searchCaseNo"	name="searchCaseNo" type="text" class="searchinput" /></li>
				<li>执行标的：<input id="searchExecuteTarget"	name="searchExecuteTarget" type="text" class="searchinput" /></li>
				<li>执行法院：<input id="searchExecuteCourt"	name="searchExecuteCourt" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><span><img src="../static/images/t01.png" /></span>添加</li>
			</ul>
		</div>
		<table id="list1"></table>
		</br>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="被执行人信息">
			<form class="executedItemform" id="executedItemform">
				<input type="hidden" id="id" name="id" value="" />
				<input type="hidden" name="registItemId" id="registItemId" value="${id}"/>
				<ul class="forminfo">
					<li><label>立案时间</label><input id="caseFilingTime" name="caseFilingTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>案件状态</label><input id="caseStatus" name="caseStatus" type="text" class="dfinput" /></li>
					<li><label>案号</label><input id="caseNo" name="caseNo" type="text" class="dfinput" /></li>
					<li><label>执行标的</label><input id="executeTarget" name="executeTarget" type="text" class="dfinput" /></li>
					<li><label>执行法院</label><input id="executeCourt" name="executeCourt" type="text" class="dfinput" /></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>