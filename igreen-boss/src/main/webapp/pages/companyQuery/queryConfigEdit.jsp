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
<script type="text/javascript" src="../static/companyQuery/queryConfigEdit.js"></script>
<title>公司查询配置</title>
</head>
<body>
	<div class="formbody">
		<div class="formtitle">
			<span>编辑配置信息</span>
		</div>
		<input type="hidden" id="id" value="${searchRecord.id}"/>
		<input type="hidden" id="searchName" name="searchName" value="${searchRecord.name}"/>
		<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}"/>
		<input type="hidden" id="pageRows" name="pageRows" value="${pageRows}"/>
		<label>配置名称</label><input id="name" name="name" type="text" value="${record.name}" class="dfinput" />
		</br>
		</br>
		<label>配置公司</label>
		<table class="tablelist">
			<thead>
				<tr>
					<th>公司ID</th>
					<th>公司名称</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody id="tablebody">
			</tbody>
		</table>
		<label>&nbsp;</label><input name="" id="saveButton" type="button" class="btn" value="确认保存"/>
		<div class="formtitle">
			<span>公司检索</span>
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>企业名称：<input id="searchName"	name="searchName" type="text" class="searchinput" /></li>
				<li>地址：<input id="searchAddress"	name="searchAddress" type="text" class="searchinput" /></li>
				<li>集团公司：<input id="searchGroupName"	name="searchGroupName" type="text" class="searchinput" /></li>
				<li>是否上市：
					<select id="searchGroupPublic" name="searchGroupPublic">
						<option value="">全部</option>
						<option value="是">是</option>
						<option value="否">否</option>
					</select>
				</li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
			</ul>
		</div>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
	</div>
</body>
</html>