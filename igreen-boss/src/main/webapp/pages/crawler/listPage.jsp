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
	<script type="text/javascript" src="../static/crawler/listPage.js"></script>
	
	

<title>爬虫配置</title>
</head>
<body>
	<div class="rightinfo">
		<div class="formbody">
		</div>
		<div class="tools">
			<ul class="toolbar">
				<li>网站名称：<input id="searchWebName"	name="searchWebName" type="text" class="searchinput" /></li>
				<li>网站域名：<input id="searchWebDomain"	name="searchWebDomain" type="text" class="searchinput" /></li>
				<li class="click" id="search"><span><img src="../static/images/ico06.png" /></span></li>
				<li class="click" id="add"><span><img src="../static/images/t01.png" /></span>添加</li>
			</ul>
		</div>
		<table id="list"></table>
		<div id="pager" class="pagin"></div>
		
		<div id="dialog" title="爬虫配置">
			<form class="executedItemform" id="executedItemform">
				<input type="hidden" id="id" name="id" value="" />
				<ul class="forminfo">
					<li><label>网站名称</label><input id="webName" name="webName" type="text" class="dfinput" placeholder="填写网站名称" /></li>
					<li><label>网站域名</label><input id="webDomain" name="webDomain" type="text" class="dfinput" placeholder="填写网站域名，不带http://"/></li>
					<li><label>全文检索URL</label><input id="webSearchUrl" name="webSearchUrl" type="text" class="dfinput" placeholder="抓取全文检索URL"/></li>
					<li><label>分页url正则表达式</label><input id="pageUrlRegular" name="pageUrlRegular" type="text" class="dfinput" placeholder="分页url匹配正则${page} 替换页码数据"/></li>
					<li><label>已知分页类型</label>
					<select id="pageType" name="pageType">
						<option value="1">总条数</option>
						<option value="2">总页数</option>
					</select>
					</li>
					<li><label>分页请求返回方式</label>
					<select id="pageReqMethod" name="pageReqMethod">
						<option value="1">AJAX返回html和页面跳转</option>
						<option value="2">AJAX 返回json</option>
					</select>
					</li>
					<li><label>最大分页</label><input id="maxPage" name="maxPage" type="number" class="dfinput" placeholder="网站允许最大分页条数"/></li>
					<li><label>开始分页</label><input id="startPage" name="startPage" type="number" class="dfinput" placeholder="网站首页页码数"/></li>
					<li><label>获取分页数据类型</label>
					<select id="attrType" name="attrType">
						<option value="attr">attr</option>
						<option value="text">text</option>
					</select>
					</li>
					<li><label>获取分页数据对应的名称</label><input id="attrName" name="attrName" type="text" class="dfinput" placeholder="获取分页数据的名称"/></li>
					<li><label>分页所在位置结果</label><input id="pageResult" name="pageResult" type="text" class="dfinput" placeholder="分页所在位置结果"/></li>
					<li><label>详情页url匹配正则表达式</label><input id="detailUrlRegular" name="detailUrlRegular" type="text" class="dfinput" placeholder="详情页url正则，多个用||分割"/></li>
					<li><label>详情页title xpath</label><input id="detailTitleRegular" name="detailTitleRegular" type="text" class="dfinput" placeholder="详情页标题对应xpath"/></li>
					<li><label>详情页内容获取 xpath</label><input id="detailContentRegular" name="detailContentRegular" type="text" class="dfinput" placeholder="详情页内容所在标签的xpath"/></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>