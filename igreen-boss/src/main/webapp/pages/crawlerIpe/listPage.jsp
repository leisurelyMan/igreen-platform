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
	<script type="text/javascript" src="../static/crawlerIpe/listPage.js"></script>
	
	

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

					<li><label>网站所在地区</label><input id="city" name="city" type="text" class="dfinput" placeholder="填写网站所在城市"/></li>
					<li><label>网站区域</label><input id="area" name="area" type="text" class="dfinput" placeholder="填写网站所在地域"/></li>
					<li><label>网站来源</label><input id="sourceType" name="sourceType" type="text" class="dfinput" placeholder="填写网站来源"/></li>


					<li><label>全文检索URL</label><input id="webSearchUrl" name="webSearchUrl" type="text" class="dfinput" placeholder="抓取全文检索URL"/></li>
					<li><label>分页url正则表达式</label><input id="pageUrlRegular" name="pageUrlRegular" type="text" class="dfinput" placeholder="分页url匹配正则${page} 替换页码数据"/></li>
					<li><label>已知分页类型</label>
					<select id="pageType" name="pageType">
						<option value="1">总条数</option>
						<option value="2">总页数</option>
					</select>
					</li>
					<li><label>分页请求返回方式</label>
					<select id="pageReqMethod" name="pageReqMethod" onchange="showDetailId(this);">
						<option value="1">AJAX返回html和页面跳转</option>
						<option value="2">列表AJAX 返回json</option>
						<option value="3">列表和详情AJAX 返回json</option>
					</select>
					</li>
					<li id="detailId" style="display: none;"><label>返回为json时获取详情标识</label>
						<input id="detailById" name="detailById" type="text" class="dfinput" placeholder="返回为json时获取详情标识 格式例如$.data.xxx"/>
					</li>

					<li><label>请求方式（适用返回方式 Json）</label>
						<select id="requestMethod" name="requestMethod">
							<option value="GET">GET</option>
							<option value="POST">POST</option>
						</select>
					</li>
					<li><label>最大分页/每页pageSize</label><input id="maxPage" name="maxPage" type="number" class="dfinput" placeholder="网站允许最大分页条数 空代表不限制,已知分页类型为总条数时 代表每页pageSize"/></li>
					<li><label>开始分页</label><input id="startPage" name="startPage" type="number" class="dfinput" placeholder="网站首页页码数"/></li>
					<li><label>获取分页数据类型</label>
					<select id="attrType" name="attrType">
						<option value="attr">attr</option>
						<option value="text">text</option>
						<option value="href">href</option>
					</select>
					</li>
					<li><label>获取分页数据对应的名称</label><input id="attrName" name="attrName" type="text" class="dfinput" placeholder="获取分页数据的名称"/></li>
					<li><label>分页所在位置结果</label><input id="pageResult" name="pageResult" type="text" class="dfinput" placeholder="分页所在位置结果(json返回代表页码)"/></li>
					<li><label>分页所在位置结果替换正则</label><input id="replaceRegular" name="replaceRegular" type="text" class="dfinput" placeholder="分页所在位置结果替换正则"/></li>
					<li><label>详情页url匹配正则表达式</label><input id="detailUrlRegular" name="detailUrlRegular" type="text" class="dfinput" placeholder="详情页url正则，多个用@分割"/></li>
					<li><label>详情页title xpath</label><input id="detailTitleRegular" name="detailTitleRegular" type="text" class="dfinput" placeholder="详情页标题对应xpath 多个用#分隔"/></li>
					<li><label>详情页内容获取 xpath</label><input id="detailContentRegular" name="detailContentRegular" type="text" class="dfinput" placeholder="详情页内容所在标签的xpath 多个用#分隔"/></li>
					<li><label>字段获取xpath配置</label><input id="fieldPropertyRegular" name="fieldPropertyRegular" type="text" class="dfinput" placeholder="获取xpath配置格式[{field:''xx'',type:'xpath',''pathValue'':''xpath规则'',attrType:'text/attr',attrDom:'attrType == attr时有效，值为attr的属性例如（href, id, name ,或者自定义的）'},{field:''xx'',type:'value',''pathValue'':''固定值''},...]"/></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>