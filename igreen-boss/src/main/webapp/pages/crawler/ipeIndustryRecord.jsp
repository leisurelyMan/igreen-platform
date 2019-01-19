<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="../ztree/css/zTreeStyle/zTreeStyle.css"/>
	<link rel="stylesheet" type="text/css" media="screen" href="../static/jqgrid/css/ui.jqgrid.css" />
	<link rel="stylesheet" type="text/css" media="screen" href="../static/css/jqueryui/jquery-ui-1.10.4.custom.min.smoothness.css" />
	<script type="text/javascript" src="../static/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="../static/js/ui/jquery-ui-1.10.4.custom.min.smoothness.js"></script>
	<script type="text/javascript" src="../ztree/js/jquery.ztree.core.js"></script>
	<script type="text/javascript" src="../ztree/js/jquery.ztree.excheck.js"></script>
	<script type="text/javascript" src="../ztree/js/jquery.ztree.exedit.js"></script>
	
	<script type="text/javascript" src="../static/jqgrid/js/i18n/grid.locale-cn.js"></script>
	<script type="text/javascript" src="../static/jqgrid/js/jquery.jqGrid.src.js"></script>
	<link rel="stylesheet" href="../static/css/style_new.css"/>

    <!-- 日期插件 -->
    <script type="text/javascript" src="../static/laydate/laydate.dev.js"></script>

	<!-- 本页面初始化用到的js包，创建jqGrid的代码就在里面 -->
	<script type="text/javascript" src="../static/crawler/ipeIndustryRecord.js"></script>

<title>爬虫结果</title>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>网站域名：<input id="searchWebDomain" name="searchWebDomain" type="text" class="searchinput" /></li>
				<li>url：<input id="searchWebDetailUrl" name="searchWebDetailUrl" type="text" class="searchinput" /></li>
				<li>公司名称：<input id="searchCompanyName" name="searchCompanyName" type="text" class="searchinput" /></li>
				<li>省：<input id="searchProvince" name="searchProvince" type="text" class="searchinput" /></li>
				<li>市：<input id="searchCity" name="searchCity" type="text" class="searchinput" /></li>
				<li>县：<input id="searchDistrict" name="searchDistrict" type="text" class="searchinput" /></li>
				<li>处罚类型：
				    <select id="searchPunishType" name="searchPunishType" >
                        <option>全部</option>
                        <option value="-1">空</option>
                        <option value="1">罚款</option>
                        <option value="2">暂扣、吊销许可证</option>
                        <option value="3">没收违法所得</option>
                        <option value="4">行政拘留</option>
                        <option value="5">责令改正</option>
                        <option value="6">责令限停产或停建</option>
                        <option value="7">其他</option>
				    </select>
				</li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" style="padding-right: 0px;" id="affirm"><input name="" type="button" class="btn" value="确认数据"/></li>

			</ul>
		</div>
		<table id="list"></table>
		<div id="pager" class="pagin"></div>
		
		<div id="dialog" title="详情">
			<form class="dialogform" id="dialogform">
				<input type="hidden" id="id" name="id" value="" />
				<ul class="forminfo">
					<li><label>网站名称</label><input id="webName" name="webName" type="text" class="dfinput" /></li>
					<li><label>网站域名</label><input id="webDomain" name="webDomain" type="text" class="dfinput" /></li>
					<li><label>年度</label><input id="year" name="year" type="text" class="dfinput" /></li>
					<li><label>详情页标题</label><input id="webDetailName" name="webDetailName" type="text" class="dfinput" /></li>
					<li><label>详情页url</label><input id="webDetailUrl" name="webDetailUrl" type="text" class="dfinput" /></li>
					<li><label>公司名称</label><input id="companyName" name="companyName" type="text" class="dfinput" /></li>
					<li><label>省</label><input id="province" name="province" type="text" class="dfinput" /></li>
                    <li><label>市</label><input id="city" name="city" type="text" class="dfinput" /></li>
                    <li><label>县</label><input id="district" name="district" type="text" class="dfinput" /></li>
                    <li><label>处罚类型</label><input id="punishType" name="punishType" type="text" class="dfinput" /></li>
                    <li><label>处罚公布时间</label><input id="punishTime" name="punishTime" type="text" class="dfinput" /></li>
                    <li><label>处罚金额</label><input id="punishMoney" name="punishMoney" type="text" class="dfinput" /></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>