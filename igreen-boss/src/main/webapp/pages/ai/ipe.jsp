<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<script type="text/javascript" src="../static/ai/ipe.js?v=1"></script>
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

<title>ai</title>
</head>
<body>
	<div class="rightinfo">
		<div class="tools">
			<ul class="toolbar">
				<li>公司名称：<input id="company"	name="company" style="width: 800px;" type="text" class="searchinput" /></li>
				<li><input id="distincebutton" type="button" class="scbtn" value="下载模板"/></li>
				<li><input id="distinceupload" type="button" class="scbtn" value="上传公司信息"/></li>
				<li>年度:<input id="year" name="year" type="text" class="searchinput" /></li>
				<li>季度:<select id="season" name="season" class="searchinput">
					<option value="1">一季度</option>
					<option value="2">二季度</option>
					<option value="3">三季度</option>
					<option value="4">四季度</option>
				</select></li>
				<li>省份:<input id="province" name="province" type="text" class="searchinput" /></li>
				<li>市:<input id="city"	name="city" type="text" class="searchinput" /></li>
				<li>行业:<select id="industry" name="industry" class="searchinput">
						<option value="">全部</option>
						<c:forEach var="company" items="${companyBases}" varStatus="status">
							<option value="${company.industry}">${company.industry}</option>
						</c:forEach>
					</select></li>
				<li>子行业:<select id="subIndustry" name="subIndustry" class="searchinput">
						<option value="">全部</option>
					</select></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
			</ul>
		</div>
		<table id="list"></table>
		<div id="pager" class="pagin"></div>
		<div id="exceldialog" title="导入公司信息">
			<form class="excelform"  id="excelform" action="../competitionsign/uploadExcel.do">
				<ul class="forminfo">
					<li><label>选择文件</label><input id="upexcel" name="upexcel" type="file" value="" class="dfinput"/></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>