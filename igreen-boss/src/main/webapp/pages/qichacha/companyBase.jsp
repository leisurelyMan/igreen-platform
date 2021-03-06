<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
	<script type="text/javascript" src="../static/qichacha/companyBase.js"></script>
    
<title>qichacha</title>
</head>
	<div class="rightinfo">
		<div class="tools">
				<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}"/>
				<input type="hidden" id="pageRows" name="pageRows" value="${pageRows}"/>
			<ul class="toolbar">

				<li>企业名称：<input id="searchName"	name="searchName" type="text" class="searchinput" value="${company.name}"/></li>
				<li>注册编码：<input id="searchCreditCode"	name="searchCreditCode" type="text" class="searchinput" value="${company.creditCode}"/></li>
				<li>组织机构代码：<input id="searchOrgNo"	name="searchOrgNo" type="text" class="searchinput" value="${company.orgNo}"/></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
			</ul>
			<ul class="forminfo">
				<li>企业名称(多个企业查询请用换行分隔)：<textarea id="searchCompanyNames" name="searchCompanyNames" cols="" rows="" class="textinput">${company.companyNames}</textarea></li>
			</ul>
		</div>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="编辑角色信息">
			<form class="registItemform" id="registItemform">
				<input type="hidden" id="id" name="id" value="" />
				<ul class="forminfo">
					<li><label>公司名称</label><input id="name" name="name" type="text" class="dfinput" /></li>
					<li><label>注册时间</label><input id="startDate" name="startDate" type="text" class="dfinput" /></li>
					<li><label>省编码</label><input id="province" name="province" type="text" class="dfinput" /></li>
					<li><label>行业编码</label><input id="industryCode" name="industryCode" type="text" class="dfinput" /></li>
					<li><label>细分行业编码</label><input id="subindustryCode" name="subindustryCode" type="text" class="dfinput" /></li>
					<li><label>行业</label><input id="industry" name="industry" type="text" class="dfinput" /></li>
					<li><label>细分行业</label><input id="subindustry" name="subindustry" type="text" class="dfinput" /></li>
					<li><label>注册编码</label><input id="creditCode" name="creditCode" type="text" class="dfinput" /></li>
					<li><label>注册资本</label><input id="registCapi" name="registCapi" type="text" class="dfinput" /></li>
					<li><label>经营形式</label><input id="econKind" name="econKind" type="text" class="dfinput" /></li>
					<li><label>组织机构代码</label><input id="orgNo" name="orgNo" type="text" class="dfinput" /></li>
					<li><label>状态</label><input id="status" name="status" type="text" class="dfinput" /></li>
					<li><label>经营范围</label><textarea id="scope" name="scope" cols="" rows="" class="textinput"></textarea></li>
				</ul>
			</form>
		</div>
		<div id="hiddendiv">
		</div>
	</div>
</body>
</html>