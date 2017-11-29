<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/main.css">
<title>搜索结果-基本信息</title>
<script type="text/javascript">
 function setTab(name, cursel, n) {
            for (i = 1; i <= n; i++) {
                var menu = document.getElementById(name + i);
                var con = document.getElementById("con_" + name + "_" + i);
                menu.className = i == cursel ? "on" : "";
                con.style.display = i == cursel ? "block" : "none";
            }
        };
</script>
</head>
<body style="background:#f9f9f9;">
<!--页头begin-->
<div class="header-2">
  <div class="mainBox">
    <div class="logo"><a href="../pages/index.html"><img src="../images/logo-2.png" height="40" width="186" alt=""></a></div>
    <ul>
      <li><a href="../pages/index.html#link3">公司大事件 </a></li>
      <li><a href="../pages/index.html#link2">业务模块</a></li>
      <li><a href="../pages/index.html#link1">公司简介</a></li>
      <li><a href="../pages/search.html">企业征信</a></li>
    </ul>
    <div class="head-links"><a href="#">个人中心</a><i></i><a href="#">注册</a><i></i><a href="#">登录</a></div>
  </div>
</div>

<!--页中begin-->
<div class="mainBox home-main">
<div class="home-inner" id="con_one_1" style="display:block;">
  <div class="data-box">
    <div class="data-tit no-top"><i></i><h3>基本信息</h3></div>
    <div class="data-tab">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="183">企业名称</th>
          <td colspan="3">${searchInfo.companyName}</td>
        </tr>
        <tr>
          <th>所在地区</th>
          <td width="274">${searchInfo.region}</td>
          <th>行业类别</th>
          <td>${searchInfo.industry}</td>
        </tr>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>环境监管记录（本公司有记录的环境处罚共计${fn:length(searchInfo.ipeIndustryRecord)}条）</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th>时间(年度)</th>
          <th>操作</th>
        </tr>
        <c:forEach var="item" items="${searchInfo.ipeIndustryRecord}" varStatus="status">
		<tr>
	        <td><c:out value="${item.year}"/></td>
	        <td><a href="http://47.94.240.82/ipe/<c:out value='${item.fileName}'/>"  target="view_window">查看</a></td>
		</tr>
		</c:forEach>
      </table>
    </div>
  </div>
  <div class="data-box" >
   <div class="data-tit"><i></i><h3>排污许可信息</h3></div>
    <div class="data-tab">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="183">有效期限</th>
          <td width="274">${searchInfo.validDate}</td>
          <th>发证日期</th>
          <td>${searchInfo.certificateDate}</td>
        </tr>
      </table>
    </div>
  </div>
 
  <div class="data-box">
    <div class="data-tit"><i></i><h3>清洁生产企业</h3></div>
    <div class="data-tab">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="183">编号</th>
          <td width="274">${searchInfo.serialNumber}</td>
          <th width="183">主要产品及产量</th>
          <td>${searchInfo.productSalesAmount}</td>
        </tr>
        <tr>
          <th>公布时间</th>
          <td>${searchInfo.reportTime}</td>
          <th>提交审核</th>
          <td>${searchInfo.submitCheckTime}</td>
        </tr>
        <tr>
          <th>完成审核</th>
          <td>${searchInfo.completeEstimateTime}</td>
          <th>完成验收</th>
          <td>${searchInfo.completeCheckTime}</td>
        </tr>
        <tr>
          <th>审核咨询机构名称</th>
          <td>${searchInfo.checkOrganization}</td>
          <th></th>
          <td></td>
        </tr>
      </table>
    </div>
    </div>
</div>

</div>
<!--页中end-->
<!--页脚begin-->
<div class="footer">
  <div class="mainBox clearfix">
    <dl class="left-links">
      <dt>公司概况</dt>
      <dd><a href="#">关于我们</a></dd>
      <dd><a href="#">媒体报道</a></dd>
      <dd><a href="#">公司动态</a></dd>
      <dd><a href="#">联系我们</a></dd>
    </dl>
    <i class="line"></i>
    <dl>
      <dt>新手帮助</dt>
      <dd><a href="#">新手指引</a></dd>
      <dd><a href="#">产品介绍</a></dd>
    </dl>
    <i class="line"></i>
    <dl>
      <dt>平台安全</dt>
      <dd><a href="#">安全保障</a></dd>
      <dd><a href="#">隐私保护</a></dd>
      <dd><a href="#">政策法规</a></dd>
    </dl>
    <i class="line"></i>
    <dl>
      <dt>联系我们</dt>
      <dd><a href="#">联系邮箱</a></dd>
      <dd><a href="#">客服电话</a></dd>
      <dd><a href="#">工作时间</a></dd>
    </dl>
    <i class="line"></i>
    <dl class="right-links">
      <dt>关注我们</dt>
      <dd><a href="#">关注微信</a></dd>
      <dd><a href="#">关注微博</a></dd>
    </dl>
  </div>
  <div class="copyright">集团公司 版权所有 Copyright © 1988-2015  All Right Reserved 京ICP备10207363-1号</div>
</div>
<!--页脚end-->
</body>
</html>