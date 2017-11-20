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
	<script type="text/javascript" src="../static/relation/relationCompany.js"></script>
	
	<script type="text/javascript" src="../static/js/selectUtil.js"></script>
	

<title>企业投资信息</title>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
			<div id="usual1" class="usual">
				<div class="itab">
					<ul>
						<li><a href="../relation/toBranchList.do?id=${id}">分支机构信息</a></li>
						<li><a href="../relation/toInvestmentList.do?id=${id}">企业投资信息</a></li>
						<li><a href="../relation/toRelationCompanyList.do?id=${id}" class="selected">关联企业信息</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>企业(机构)名称：<input id="searchCompanyName"	name="searchCompanyName" type="text" class="searchinput" /></li>
				<li>注册号：<input id="searchRegistNo"	name="searchRegistNo" type="text" class="searchinput" /></li>
				<li>企业(机构)类型：<input id="searchCompanyType"	name="searchCompanyType" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><span><img src="../static/images/t01.png" /></span>添加</li>
			</ul>
		</div>
		<table id="list1"></table>
		</br>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="企业投资信息">
			<form class="executedItemform" id="executedItemform">
				<input type="hidden" id="id" name="id" value="" />
				<input type="hidden" name="registItemId" id="registItemId" value="${id}"/>
				<ul class="forminfo">
					<li><label>主要人员信息</label>
						<select id="employeeId" name="employeeId"></select>
					</li>
					<li><label>企业名称</label><input id="companyName" name="companyName" type="text" class="dfinput" /></li>
					<li><label>任职</label><input id="job" name="job" type="text" class="dfinput" /></li>
					<li><label>投资(万元)</label><input id="investment" name="investment" type="text" class="dfinput" /></li>
					<li><label>持股比例</label><input id="ratio" name="ratio" type="text" class="dfinput" /></li>
					<li><label>注册资本(万元)</label><input id="registAmount" name="registAmount" type="text" class="dfinput" /></li>
 					<li><label>认缴出资币种</label>
						<select id="registCurrency" name="registCurrency">
							<option value="人民币">人民币</option>
							<option value="美元">美元</option>
						</select>
					</li>
					
					<li><label>企业(机构)类型</label><input id="companyType" name="companyType" type="text" class="dfinput" /></li>
					<li><label>注册号</label><input id="registNo" name="registNo" type="text" class="dfinput" /></li>
					<li><label>登记机关</label><input id="registOffice" name="registOffice" type="text" class="dfinput" /></li>
					<li><label>企业状态</label><input id="companyStatus" name="companyStatus" type="text" class="dfinput" /></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>