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
<script type="text/javascript" src="../static/basicInfo/questionnaire.js?v=1"></script>
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

<title>分支机构信息</title>
</head>
<body>
	<div class="rightinfo">
		<div class="tools">
			<ul class="toolbar">
<!-- 				<li>一级字典：<select id="searchDicParentId" name="searchDicParentId"></select></li>
				<li>字典名称：<input id="searchDicName"	name="searchDicName" type="text" class="searchinput" /></li> -->
				<li>状态:<select id="searchStatus" name="searchStatus">
						<option value="">全部</option>
						<option value="0">未处理</option>
						<option value="1">已处理</option>
					</select>
				</li>
				<li>填表人姓名：<input id="searchCustomerName" type="text" class="searchinput" /></li>
				<li>填表人电话：<input id="searchCustomerMobile" type="text" class="searchinput" /></li>
				<li>填表人邮箱：<input id="searchCustomerMail" type="text" class="searchinput" /></li>
				<li>填表人微信：<input id="searchCustomerWechart" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><span><img src="../static/images/t01.png" /></span>添加</li>
			</ul>
		</div>
		<table id="list2"></table>
		<div id="pager2" class="pagin"></div>
		
		<div id="dialog" title="问卷调查信息">
			<ul class="forminfo">
				<li><label>填表人企业:</label></li>
				<li><span id="customerCompanyValue"></span></li>
				<li><label>募投项目所在地区:</label></li>
				<li><span id="countryValue"></span></li>
				<li><label>发行人性质:</label></li>
				<li><span id="issuerQualityValue"></span></li>
				<li><label>拟发行绿色债券类型:</label></li>
				<li><span id="bondTypeValue"></span></li>
				<li><label>拟发行绿色债券场所:</label></li>
				<li><span id="issueBondsAreaValue"></span></li>
				<li><label>拟发行绿色债券规模:</label></li>
				<li><span id="bondsScopeValue"></span></li>
				<li><label>发行人近三年债券发行记录:</label></li>
				<li><span id="issueBondsRecordsValue"></span></li>
				<li><label>发行绿债拟募投项目类型:</label></li>
				<li><span id="greenBondsTypeValue"></span></li>
				<li><label>发行绿债拟募投项目主要技术:</label></li>
				<li><textarea id="majorTechnique" readonly="readonly"></textarea></li>
				<li><label>拟发行绿债募投项目已获得下列哪些合规性文件:</label></li>
				<li><span id="complianceDocumentsValue"></span></li>
				<li><label>拟发行绿色资产支持专项计划的基础资产项目类型:</label></li>
				<li><span id="complianceProjectTypeValue"></span></li>
				<li><label>拟发行绿色资产支持专项计划的基础资产项目主要技术:</label></li>
				<li><textarea id="baseProjectMajorTechnique" readonly="readonly"></textarea></li>
				<li><label>拟发行绿色资产支持专项计划的基础资产项目已获得下列哪些合规性文件:</label></li>
				<li><span id="awardedComplianceDocumentsValue"></span></li>
				<li><label>填表人姓名:</label></li>
				<li><span id="customerName"></span></li>
				<li><label>填表人电话:</label></li>
				<li><span id="customerMobile"></span></li>
				<li><label>填表人邮箱:</label></li>
				<li><span id="customerMail"></span></li>
				<li><label>填表人微信:</label></li>
				<li><span id="customerWechart"></span></li>
			</ul>
		</div>
	</div>
</body>
</html>