<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
  <link rel="stylesheet" type="text/css" href="/css/main.css">
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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

 $(function(){
   $(".panel-heading a").click(function(){
     var name = $(this).html();
     var flg = $(this).attr("aria-expanded");
     var content_id = $(this).attr("href");
     var content = $(content_id).find('.panel-body').html();
     if(flg == "false" && content == ''){
       $.ajax({
         url:"/company/monitor/monitorData",
         data :{companyName : name, deleId : content_id},
         type:"GET",
         dataType:"html",
         success:function(result){
           $(content_id).find(".panel-body").html(result);
         }
       });
     }
   });
 });
</script>
</head>
<body style="background:#f9f9f9;">
<!--页头begin-->
<div class="header-2">
  <div class="mainBox">
    <div class="logo"><a href="/pages/index.html"><img src="/images/logo-2.png" height="40" width="186" alt=""></a></div>
    <ul>
      <li><a href="/pages/index.html#link3">公司大事件 </a></li>
      <li><a href="/pages/index.html#link2">业务模块</a></li>
      <li><a href="/pages/index.html#link1">公司简介</a></li>
      <li><a href="/pages/search.html">企业征信</a></li>
    </ul>
    <div class="head-links"><a href="#">个人中心</a><i></i><a href="#">注册</a><i></i><a href="#">登录</a></div>
  </div>
</div>
<!--页头end-->
<div class="panel-group mainBox home-main" id="accordion">
  <c:forEach var="item" items="${companyList}" varStatus="status">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <span>${ status.index + 1}、</span>
          <a data-toggle="collapse" data-parent="#accordion" aria-expanded="false"
             href="#collapse_${ status.index + 1}">
            <c:out value="${item}"/>
          </a>
        </h4>
      </div>
      <div id="collapse_${ status.index + 1}" class="panel-collapse collapse">
        <div class="panel-body"></div>
      </div>
    </div>
  </c:forEach>

</div>
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