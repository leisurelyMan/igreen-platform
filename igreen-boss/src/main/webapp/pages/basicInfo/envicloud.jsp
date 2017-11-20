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
<script type="text/javascript" src="../static/basicInfo/envicloud.js?v=2"></script>
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
				<select id="cloudSource" name="cloudSource">
					<option value="location" selected="selected">城市地理位置</option>
					<option value="area">范围覆盖城市</option>
					<option value="monthlymete">月度历史天气</option>
					<option value="yearlymete">年度历史天气</option>
					<option value="citydailyair">指定日期空气质量</option>
					<option value="discharge">年度污染排放</option>
					<option value="periodicdischarge">省级历史污染排放</option>
				</select>
				</li>
			</ul>
			
			<ul class="toolbar">
				<li id="lCityCode">城市名称：<input id="cityCode"	name="cityCode" type="text" class="searchinput" /></li>
				<li id="lCityProvince">城市省份：<input id="cityProvince"	name="cityProvince" type="text" class="searchinput" /></li>
				<li id="lStartLng">起始坐标经度(东经)：<input id="startLng" name="startLng" type="text" class="searchinput" /></li>
				<li id="lStartLat">起始坐标纬度(北纬)：<input id="startLat"	name="startLat" type="text" class="searchinput" /></li>
				<li id="lEndLng">结束坐标经度(东经)：<input id="endLng"	name="endLng" type="text" class="searchinput" /></li>
				<li id="lEndLat">结束坐标纬度(北纬)：<input id="endLat"	name="endLat" type="text" class="searchinput" /></li>
				<li id="lYear">查询年份：<input id="year"	name="year" type="text" class="searchinput" /></li>
				<li id="lStartYear">起始年份：<input id="startYear"	name="startYear" type="text" class="searchinput" /></li>
				<li id="lEndYear">结束年份：<input id="endYear"	name="endYear" type="text" class="searchinput" /></li>
				<li id="lDate">查询日期(yyyyMMdd)：<input id="date"	name="date" type="text" class="searchinput" /></li>
				<li id="lProvince">查询省份：<input id="province"	name="province" type="text" class="searchinput" /></li>
				<li id="lFilter">过滤条件：<input id="filter"	name="filter" type="text" class="searchinput" /></li>
				<li id="lmtype">查询类型：
				    <select id="mtype" name="mtype">
				    	<option value="" selected="selected">全部</option>
						<option value="pre">降水量(mm)</option>
						<option value="avg">平均气温(℃)</option>
						<option value="max">最高气温(℃)</option>
						<option value="min">最低气温(℃)</option>
				    </select>
				</li>
				<li id="lytype">查询类型：
				    <select id="ytype" name="ytype">
				    	<option value="" selected="selected">全部</option>
						<option value="jan">一月平均气温(℃)</option>
						<option value="july">七月平均气温(℃)</option>
						<option value="pre">年降水量(mm)</option>
				    </select>
				</li>
				<li id="lctype">查询指标：
				    <select id="ctype" name="ctype">
				    	<option value="" selected="selected">全部</option>
						<option value="AQI">AQI</option>
						<option value="PM25">PM25</option>
						<option value="PM10">PM10</option>
						<option value="CO">CO</option>
						<option value="SO2">SO2</option>
						<option value="NO2">NO2</option>
						<option value="O3">O3</option>
				    </select>
				</li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
			</ul>
		</div>
		<div id="clean">
			<textarea id="result" rows="100" cols="500"></textarea>
		</div>
	</div>
</body>
</html>