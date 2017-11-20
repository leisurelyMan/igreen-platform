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
	<script type="text/javascript" src="../static/lawRisk/breakPromiseExecuted.js"></script>

<title>失信被执行人信息</title>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
			<div id="usual1" class="usual">
				<div class="itab">
					<ul>
						<li><a href="../lawRisk/toOpenCourtList.do?id=${id}">开庭公告</a></li>
						<li><a href="../lawRisk/toWrittenJudgementList.do?id=${id}">裁判文书信息</a></li>
						<li><a href="../lawRisk/toExecutedItemList.do?id=${id}">被执行人信息</a></li>
						<li><a href="../lawRisk/toBreakPromiseExecutedList.do?id=${id}" class="selected">失信被执行人信息</a></li>
						<li><a href="../lawRisk/toCourtNoticeList.do?id=${id}">法院公告</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>法定代表人：<input id="searchLegalPerson"	name="searchLegalPerson" type="text" class="searchinput" /></li>
				<li>组织机构号：<input id="searchOrganizationNo"	name="searchOrganizationNo" type="text" class="searchinput" /></li>
				<li>执行依据文号：<input id="searchAccordingNo"	name="searchAccordingNo" type="text" class="searchinput" /></li>
				<li>执行法院：<input id="searchExecuteCourt"	name="searchExecuteCourt" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><span><img src="../static/images/t01.png" /></span>添加</li>
			</ul>
		</div>
		<table id="list1"></table>
		</br>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="失信被执行人信息">
			<form class="executedItemform" id="executedItemform">
				<input type="hidden" id="id" name="id" value="" />
				<input type="hidden" name="registItemId" id="registItemId" value="${id}"/>
				<ul class="forminfo">
					<li><label>立案时间</label><input id="caseFilingTime" name="caseFilingTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>法定代表人</label><input id="legalPerson" name="legalPerson" type="text" class="dfinput" /></li>
					<li><label>组织机构号</label><input id="organizationNo" name="organizationNo" type="text" class="dfinput" /></li>
					<li><label>生效法律文书确定的义务</label><input id="obligation" name="obligation" type="text" class="dfinput" /></li>
					<li><label>失信被执行人为具体情形</label><input id="executedCondition" name="executedCondition" type="text" class="dfinput" /></li>
					<li><label>被执行人的履行情况</label><input id="performCondition" name="performCondition" type="text" class="dfinput" /></li>
					<li><label>全部未履行</label><input id="nonperforming" name="nonperforming" type="text" class="dfinput" /></li>
					<li><label>公布时间</label><input id="publishTime" name="publishTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>省份</label><input id="province" name="province" type="text" class="dfinput" /></li>
					<li><label>执行依据文号</label><input id="accordingNo" name="accordingNo" type="text" class="dfinput" /></li>
					<li><label>执行法院</label><input id="executeCourt" name="executeCourt" type="text" class="dfinput" /></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>