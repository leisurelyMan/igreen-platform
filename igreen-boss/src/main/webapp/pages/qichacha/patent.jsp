<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="../../ztree/css/zTreeStyle/zTreeStyle.css">
	<link rel="stylesheet" type="text/css" media="screen" href="../../static/jqgrid/css/ui.jqgrid.css" />
	<link rel="stylesheet" type="text/css" media="screen" href="../../static/css/jqueryui/jquery-ui-1.10.4.custom.min.smoothness.css" />
	<script type="text/javascript" src="../../static/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="../../static/js/ui/jquery-ui-1.10.4.custom.min.smoothness.js"></script>
	<script type="text/javascript" src="../../ztree/js/jquery.ztree.core.js"></script>
	<script type="text/javascript" src="../../ztree/js/jquery.ztree.excheck.js"></script>
	<script type="text/javascript" src="../../ztree/js/jquery.ztree.exedit.js"></script>
	
	<script type="text/javascript" src="../../static/jqgrid/js/i18n/grid.locale-cn.js"></script>
	<script type="text/javascript" src="../../static/jqgrid/js/jquery.jqGrid.src.js"></script>
	<link rel="stylesheet" href="../../static/css/style_new.css">

    <!-- 日期插件 -->
    <script type="text/javascript" src="../../static/laydate/laydate.dev.js"></script>
<title>用户管理</title>
<!-- 本页面初始化用到的js包，创建jqGrid的代码就在里面 -->
<script type="text/javascript" src="../../static/qichacha/patent.js"></script>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
			<div id="usual1" class="usual">
				<div class="itab">
					<ul>
						<li><a href="../../qichacha/judgement/toJudgementList.do?keyNo=${keyNo}">法院判决信息</a></li>
						<li><a href="../../qichacha/patent/toPatentList.do?keyNo=${keyNo}" class="selected">专利信息</a></li>
						<li><a href="../../qichacha/penalty/toPenaltyList.do?keyNo=${keyNo}">处罚信息</a></li>
					</ul>
				</div>
			</div>
		</div>
<!-- 		<div class="tools">
			<ul class="toolbar">
			
				<li>股东名称：<input id="searchShareholderName"	name="searchShareholderName" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../../static/images/ico06.png" /></span></li>
			</ul>
		</div> -->
		<table id="list1"></table>
		</br>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="股东出资信息">
			<form class="shareholderform" id="shareholderform">
				<input type="hidden" name="keyNo" id="keyNo" value="${keyNo}"/>
				<ul class="forminfo">
					<li><label>专利类别</label><input id="ipcList" name="ipcList" type="text" class="dfinput" /></li>
					<li><label>专利类别描述</label><input id="ipcDesc" name="ipcDesc" type="text" class="dfinput" /></li>
					<li><label>申请编号</label><input id="applicationNumber" name="applicationNumber" type="text" class="dfinput" /></li>
					<li><label>申请时间</label><input id="applicationDate" name="applicationDate" type="text" class="dfinput" /></li>
					<li><label>发布编号</label><input id="publicationNumber" name="publicationNumber" type="text" class="dfinput" /></li>
					<li><label>发布时间</label><input id="publicationDate" name="publicationDate" type="text" class="dfinput" /></li>
					<li><label>法定状态</label><input id="legalStatusDesc" name="legalStatusDesc" type="text" class="dfinput" /></li>
					<li><label>标题</label><input id="title" name="title" type="text" class="dfinput" /></li>
					<li><label>代理机构</label><input id="agency" name="agency" type="text" class="dfinput" /></li>
					<li><label>种类</label><input id="kindCodeDesc" name="kindCodeDesc" type="text" class="dfinput" /></li>
					<li><label>发明人</label><input id="inventorStringList" name="inventorStringList" type="text" class="dfinput" /></li>
					<li><label>代理人</label><input id="assigneestringList" name="assigneestringList" type="text" class="dfinput" /></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>