<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="../ztree/css/zTreeStyle/zTreeStyle.css">
	<link rel="stylesheet" type="text/css" media="screen" href="../static/jqgrid/css/ui.jqgrid.css" />
	<link rel="stylesheet" type="text/css" media="screen" href="../static/css/jqueryui/jquery-ui-1.10.4.custom.min.smoothness.css" />
	<script type="text/javascript" src="../static/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="../static/js/jquery.form.js"></script>
	<script type="text/javascript" src="../static/js/ui/jquery-ui-1.10.4.custom.min.smoothness.js"></script>
	<script type="text/javascript" src="../ztree/js/jquery.ztree.core.js"></script>
	<script type="text/javascript" src="../ztree/js/jquery.ztree.excheck.js"></script>
	<script type="text/javascript" src="../ztree/js/jquery.ztree.exedit.js"></script>
	
	<script type="text/javascript" src="../static/jqgrid/js/i18n/grid.locale-cn.js"></script>
	<script type="text/javascript" src="../static/jqgrid/js/jquery.jqGrid.src.js"></script>
	<link rel="stylesheet" href="../static/css/style_new.css">

    <!-- 日期插件 -->
    <script type="text/javascript" src="../static/laydate/laydate.dev.js"></script>
<title>用户管理</title>
<!-- 本页面初始化用到的js包，创建jqGrid的代码就在里面 -->
<script type="text/javascript" src="../static/basicInfo/upload.js"></script>
</head>
<body>
	<div class="rightinfo">
	<form method="POST"  enctype="multipart/form-data" id="form1" action="uploadExcel/upload.do"> 
	<table class="tablelist">
	<thead>
	<tr>
	<td>导入数据</td>
	</tr>
	</thead>
	<tbody>
  		<tr>
  			<td>是否覆盖导入
				<select id="override" name="override">
					<option value="0">否</option>
					<option value="1">是</option>
				</select>
			</td>
  		</tr>
  		<tr>
  			<td><input id="upfile" type="file" name="upfile" /></td>
  		</tr>
  		<tr>
  			<td><div class="ibox"><a id="btn" class="ibtn"><img src="../static/images/upload.png" />导入数据</a></div></td>
  		</tr>
	</tbody>

	</table>
	</form>
	</div>
</body>
</html>