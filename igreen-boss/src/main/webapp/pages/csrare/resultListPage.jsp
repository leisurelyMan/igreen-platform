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
	<link rel="stylesheet" href="../static/csrare/css/law.css">

    <!-- 日期插件 -->
    <script type="text/javascript" src="../static/laydate/laydate.dev.js"></script>

	<!-- 本页面初始化用到的js包，创建jqGrid的代码就在里面 -->
	<script type="text/javascript" src="../static/csrare/resultListPage.js"></script>
	
	

<title>爬虫结果</title>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>网站名称：<input id="searchWebName" name="searchWebName" type="text" class="searchinput" /></li>
				<li>标题：<input id="searchWebDetailName" name="searchWebDetailName" type="text" class="searchinput" /></li>
				<li>类别:<select id="attachType" name="attachType" class="searchinput">
					<option value="">全部</option>
					<option value="法规性文件">国家法律法规</option>
					<option value="地方政府规章">地方性法律法规</option>
					<option value="	国际条约公约">国际条约公约</option>
					<option value="企业规范性文件">企业规范性文件</option>
				</select>
				</li>
				<li>城市：<input id="applicationDomain" name="applicationDomain" type="text" class="searchinput" /></li>
				<li>生效年份:<select id="effectiveYear" name="effectiveYear" class="searchinput">
					<option value="">全部</option>
					<option value="2018">2018年</option>
					<option value="2017">2017年</option>
					<option value="2016">2016年</option>
					<option value="2015">2015年</option>
					<option value="2014">2014年</option>
					<option value="2013">2013年</option>
					<option value="2012">2012年</option>
					<option value="2011">2011年</option>
					<option value="2010">2010年</option>
					<option value="2009">2009年</option>
					<option value="2008">2008年</option>
					<option value="2007">2007年以前</option>
				</select>
				</li>
				<li>效 力:<select id="effectStatus" name="effectStatus" class="searchinput">
					<option value="">全部</option>
					<option value="在用">在用</option>
					<option value="试行">试行</option>
					<option value="已被修订">已被修订</option>
					<option value="尚未生效">尚未生效</option>
					<option value="作废">作废</option>
				</select>
				</li>
				<li>最近时间:<select id="latelyMonth" name="latelyMonth" class="searchinput">
					<option value="">全部</option>
					<option value="1">1个月</option>
					<option value="3">3个月</option>
					<option value="6">6个月</option>
					<option value="12">1年</option>
					<option value="24">2年</option>
				</select>
				</li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><a href="../csrare/test.do"></a>添加</li>
			</ul>
		</div>
		<table id="list"></table>
		<div id="pager" class="pagin"></div>
		
		<div id="dialog" title="详情">
			<h1 class="fgtitle" id="fgtitle">（国家）关于用于原始用途的含有或直接沾染危险废物的包装物、容器属性认定有关问题的复函</h1>
			<div class="fgxx">
				<table width="100%" border="0" cellspacing="1" cellpadding="1" style="background:#f9e6c0;">
					<tbody>
					<tr>
						<td width="100" height="42" align="right" bgcolor="#fffefc">颁布机构：</td>
						<td colspan="3" bgcolor="#fffefc" class="righttd" id="org"></td>
					</tr>
					<tr>
						<td width="100" height="42" align="right" bgcolor="#fffefc">生效状态：</td>
						<td bgcolor="#fffefc" class="righttd" id="effStatus"></td>
						<td width="100" align="right" bgcolor="#fffefc">所属类型：</td>
						<td bgcolor="#fffefc" class="righttd" id="attrType"></td>
					</tr>
					<tr>
						<td width="100" height="42" align="right" bgcolor="#fffefc">适用地区：</td>
						<td bgcolor="#fffefc" class="righttd" id="city"></td>
						<td width="100" align="right" bgcolor="#fffefc">适用领域：</td>
						<td bgcolor="#fffefc" class="righttd" id="lingyu"></td>
					</tr>
					<tr>
						<td width="100" height="42" align="right" bgcolor="#fffefc">生效日期：</td>
						<td bgcolor="#fffefc" class="righttd" id="effDate"></td>
						<td width="100" align="right" bgcolor="#fffefc">颁布日期：</td>
						<td bgcolor="#fffefc" class="righttd" id="pubDate"></td>
					</tr>
					</tbody>
				</table>
			</div>
			<div id="content" class="show" style="white-space: pre-line;">
			</div>
		</div>
	</div>
</body>
</html>