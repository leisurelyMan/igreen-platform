<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<script type="text/javascript" src="../../static/qichacha/judgement.js"></script>
<script type="text/javascript" src="../../static/qichacha/pagecommon.js"></script>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
			<div id="usual1" class="usual">
				<div class="itab">
					<ul>
						<li><a href="#" id="JudgementList" class="selected">法院判决信息</a></li>
						<li><a href="#" id="PatentList">专利信息</a></li>
						<li><a href="#" id="PenaltyList">处罚信息</a></li>
					</ul>
				</div>
			</div>
		</div>
 		<div class="tools">
			<ul class="toolbar">
				<li><input id="returnbtn" type="button" class="btn" value="返回列表页面"/></li>
			</ul>
		</div>
		<table id="list1"></table>
		</br>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="股东出资信息">
			<form class="shareholderform" id="shareholderform">
				<input id="keyNo" name="keyNo" type="hidden" value="${company.keyNo}"/>
				<input id="searchName"	name="searchName" type="hidden" value="${company.name}"/>
				<input id="searchCreditCode"	name="searchCreditCode" type="hidden" value="${company.creditCode}" />
				<input id="searchOrgNo"	name="searchOrgNo" type="hidden" value="${company.orgNo}"/>
				<input id="searchCompanyNames" name="searchCompanyNames" type="hidden" value="${company.companyNames}"/>
				<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}"/>
				<input type="hidden" id="pageRows" name="pageRows" value="${pageRows}"/>
				
				<input type="hidden" id="id" name="id" value="" />
				<ul class="forminfo">
					<li><label>股东名称</label><input id="shareholderName" name="shareholderName" type="text" class="dfinput" /></li>
					<li><label>认缴出资额(万元)</label><input id="capital" name="capital" type="text" class="dfinput" /></li>
					<li><label>币种</label>
						<select id="currency" name="currency">
							<option value="人民币">人民币</option>
							<option value="美元">美元</option>
						</select>
					</li>
					<li><label>出资比例</label><input id="ratio" name="ratio" type="text" class="dfinput" /></li>
					<li><label>出资日期</label><input id="contributiveTime" name="contributiveTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" class="dfinput" /></li>
					<li><label>国籍</label><input id="nationality" name="nationality" type="text" class="dfinput" /></li>
				</ul>
			</form>
		</div>
		<div id="hiddendiv">
		</div>
	</div>
</body>
</html>