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
	<script type="text/javascript" src="../static/sys/sysDictionary.js"></script>

<title>分支机构信息</title>
</head>
<body>
	<div class="rightinfo">
		<div class="tools">
			<ul class="toolbar">
				<li>一级字典：<select id="searchDicParentId" name="searchDicParentId"></select></li>
				<li>字典名称：<input id="searchDicName"	name="searchDicName" type="text" class="searchinput" /></li>
				<li>状态:<select id="searchStatus" name="searchStatus"></select></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><span><img src="../static/images/t01.png" /></span>添加</li>
			</ul>
		</div>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="字典信息">
			<form class="dictionaryform" id="dictionaryform">
				<input type="hidden" id="id" name="id" value="" />
				<ul class="forminfo">
					<li><label>上级字典</label> <select id="dicParentId" name="dicParentId"></select></li>
					<li><label>字典名称</label><input id="dicName" name="dicName" type="text" class="dfinput" /></li>
				</ul>
			</form>
		</div>
		<div id="childDialog" title="字典信息">
			<form class="childform" id="childform">
			<input id="childdicParentId" name="childdicParentId" type="hidden" class="dfinput" readonly="readonly"/>
				<ul class="forminfo">
					<li><label>上级字典</label><input id="parentName" name="parentName" type="text" class="dfinput" readonly="readonly"/></li>
					<li><label>字典名称</label><input id="childdicName" name="childdicName" type="text" class="dfinput" /></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>