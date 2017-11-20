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
	<script type="text/javascript" src="../static/basicInfo/organizationItem.js"></script>
<title>组织机构代码证信息</title>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
			<div id="usual1" class="usual">
				<div class="itab">
					<ul>
						<li><a href="../basicInfo/toShareholderList.do?id=${id}">股东及出资信息</a></li>
						<li><a href="../basicInfo/toEmployeeList.do?id=${id}">主要人员信息</a></li>
						<li><a href="../basicInfo/toExchangeList.do?id=${id}">变更信息</a></li>
						<li><a href="../basicInfo/toOrganizationItemList.do?id=${id}" class="selected">组织机构代码证信息</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>机构代码：<input id="searchOrganizationCode" name="searchOrganizationCode" type="text" class="searchinput" /></li>
				<li>机构名称：<input id="searchOrganizationName" name="searchOrganizationName" type="text" class="searchinput" /></li>
				<li>机构类型：<input id="searchOrganizationType" name="searchOrganizationType" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><span><img src="../static/images/t01.png" /></span>添加</li>
			</ul>
		</div>
		<table id="list1"></table>
		</br>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="组织机构代码证信息">
			<form class="organizationform" id="organizationform">
				<input type="hidden" id="id" name="id" value="" />
				<input type="hidden" name="registItemId" id="registItemId" value="${id}"/>
				<ul class="forminfo">
					<li><label>机构代码：</label><input id="organizationCode" name="organizationCode" type="text" class="dfinput" /></li>
					<li><label>机构名称：</label><input id="organizationName" name="organizationName" type="text" class="dfinput" /></li>
					<li><label>机构类型：</label><input id="organizationType" name="organizationType" type="text" class="dfinput" /></li>
					<li><label>机构地址：</label><input id="organizationAddress" name="organizationAddress" type="text" class="dfinput" /></li>
					<li><label>管辖机构：</label><input id="jurisdictionalAgency" name="jurisdictionalAgency" type="text" class="dfinput" /></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>