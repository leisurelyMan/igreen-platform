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
<script type="text/javascript" src="../static/ipe/industry.js?v=1"></script>
<style type="text/css">
.forminfo li label {
    width: auto;
    font-weight:bold;
    line-height: 34px;
    display: block;
    float: left;
}

textarea {
    width: 450px;
    height: 70px;
    background: #fff;
    border: solid 1px #dad7cc;
    padding: 10px;
    line-height: 22px;
    color: #666;
}
</style>

<title>IPE企业监管信息</title>
</head>
<body>
	<div class="rightinfo">
		<div class="tools">
			<ul class="toolbar">
				<li>企业名称:<input id="companyName"	name="companyName" type="text" class="searchinput" /></li>
				<!--<li>地址:<input id="address"	name="address" type="text" class="searchinput" /></li>-->
				<li>年度:<input id="year" name="year" type="text" class="searchinput" /></li>
				<li>标题:<input id="title"	name="title" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
			</ul>
		</div>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
	</div>
</body>
</html>