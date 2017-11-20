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
<title>MEP数据查询</title>
<!-- 本页面初始化用到的js包，创建jqGrid的代码就在里面 -->
<script type="text/javascript" src="../static/basicInfo/mep.js?v=8"></script>
<style>
.ui-jqgrid tr.jqgrow td {
  white-space: normal !important;
  height:auto;
  vertical-align:text-top;
  padding-top:2px;
 }
</style>
</head>
<body>
	<div class="rightinfo">
		<div class="tools">
			<ul class="toolbar">
				<li>数据源：
					<select id="mepSource" name="mepSource">
						<option value="1" selected="selected">清洁生产企业</option>
						<option value="2">重点监管企业</option>
						<option value="3">群众举报案件</option>
					</select>
				</li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
			</ul>
		</div>
		<div id="cleanCom">
			<div class="tools">
				<ul class="toolbar">
					<li>年份：<input id="cleanYear" name="cleanfield" type="text" class="searchinput" /></li>
					<li>批次：<input id="cleanBatchNo" name="cleanfield" type="text" class="searchinput" /></li>
					<li>城市：<input id="cleanCity" name="cleanfield" type="text" class="searchinput" /></li>
					<li>编号：<input id="cleanSerialNumber" name="cleanfield" type="text" class="searchinput" /></li>
					<li>公司名称：<input id="cleanCompanyName" name="cleanfield" type="text" class="searchinput" /></li>
					<li>行业：<input id="cleanTrade" name="cleanfield" type="text" class="searchinput" /></li>
				</ul>
			</div>
			<div class="tools">
				<ul class="toolbar">
					<li>主要产品及年产量：<input id="cleanProductSalesAmount" name="cleanfield" type="text" class="searchinput" /></li>
					<li>所属地区：<input id="cleanRegion" name="cleanfield" type="text" class="searchinput" /></li>
					<li>地址：<input id="cleanAddress" name="cleanfield" type="text" class="searchinput" /></li>
					<li>公布时间：<input id="cleanReportTime" name="cleanfield" type="text" class="searchinput" /></li>
					<li>提交审核时间：<input id="cleanSubmitCheckTime" name="cleanfield" type="text" class="searchinput" /></li>
				</ul>
			</div>
			<div class="tools">
				<ul class="toolbar">
					<li>完成评估时间：<input id="cleanCompleteEstimateTime" name="cleanfield" type="text" class="searchinput" /></li>
					<li>完成验收时间：<input id="cleanCompleteCheckTime" name="cleanfield" type="text" class="searchinput" /></li>
					<li>审核咨询机构名：<input id="cleanCheckOrganization" name="cleanfield" type="text" class="searchinput" /></li>
				</ul>
			</div>
		</div>
		
		<div id="monitorCom">
			<div class="tools">
				<ul class="toolbar">
					<li>序号：<input id="monSequence" name="monfield" type="text" class="searchinput" /></li>
					<li>行政区划代码：<input id="monRegionCode" name="monfield" type="text" class="searchinput" /></li>
					<li>法人代码：<input id="monLegalPersonCode" name="monfield" type="text" class="searchinput" /></li>
					<li>企业名称：<input id="monCompanyName" name="monfield" type="text" class="searchinput" /></li>
				</ul>
			</div>
			<div class="tools">
				<ul class="toolbar">
					<li>监控类别：<input id="monType" name="monfield" type="text" class="searchinput" /></li>
					<li>所属省份：<input id="monProvince" name="monfield" type="text" class="searchinput" /></li>
					<li>所属年份：<input id="monYear" name="monfield" type="text" class="searchinput" /></li>
				</ul>
			</div>
		</div>
		
		<div id="reCom">
			<div class="tools">
				<ul class="toolbar">
					<li>序号：<input id="reSequence" name="refield" type="text" class="searchinput" /></li>
					<li>年份：<input id="reYear" name="refield" type="text" class="searchinput" /></li>
					<li>月份：<input id="reMonth" name="refield" type="text" class="searchinput" /></li>
					<li>省份：<input id="reProvince" name="refield" type="text" class="searchinput" /></li>
				</ul>
			</div>
			<div class="tools">
				<ul class="toolbar">
					<li>涉及企业：<input id="reCompany" name="refield" type="text" class="searchinput" /></li>
					<li>存在问题：<input id="reProblem" name="refield" type="text" class="searchinput" /></li>
					<li>处理情况：<input id="reDetail" name="refield" type="text" class="searchinput" /></li>
				</ul>
			</div>
		</div>
	</div>
		<div height:100px></div>
		<div id="clean">
			<table id="cleanCompany"></table>
			<div id="cleanCompanyPager" class="pagin"></div>
		</div>
		
		<div id="monitor">
			<table id="monitorCompany"></table>
			<div id="monitorCompanyPager" class="pagin"></div>
		</div>
		
		<div id="re">
			<table id="report"></table>
			<div id="reportPager" class="pagin"></div>
		</div>
	</div>
</body>
</html>