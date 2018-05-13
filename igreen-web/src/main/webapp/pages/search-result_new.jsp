<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<!--页头end-->
<!--二级导航begin-->
<div class="mainBox nav-main">
  <ul>
    <li><a id="one1" onclick="setTab('one',1,6)" href="javascript:void(0);" class="on">基本信息</a></li>
    <li><a id="one2" onclick="setTab('one',2,6)" href="javascript:void(0);">环境风险</a></li>
    <li><a id="one3" onclick="setTab('one',3,6)" href="javascript:void(0);">环境许可</a></li>
    <%--<li><a id="one4" onclick="setTab('one',4,6)" href="javascript:void(0);">关联关系</a></li>
    <li><a id="one5" onclick="setTab('one',5,6)" href="javascript:void(0);">经营信息</a></li>
    <li><a id="one6" onclick="setTab('one',6,6)" href="javascript:void(0);">知识产权</a></li>--%>
  </ul>
</div>
<!--二级导航end-->
<!--页中begin-->
<div class="mainBox home-main">
<div class="home-inner" id="con_one_1" style="display:block;">
  <div class="data-box">
    <div class="data-tit no-top"><i></i><h3>登记信息</h3></div>
    <div class="data-tab">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="183">企业名称</th>
          <td width="274">${igreen.registItem.companyName}</td>
          <th width="183">法人代表姓名</th>
          <td>${igreen.registItem.legalRepresentative}</td>
        </tr>
        <tr>
          <th>注册号</th>
          <td>${igreen.registItem.registNumber}</td>
          <th>原注册号</th>
          <td>${igreen.registItem.oldRegistNumber}</td>
        </tr>
        <tr>
          <th>注册资本(万元)</th>
          <td>${igreen.registItem.registeredCapital}</td>
          <th>实收资本 (万元)</th>
          <td>${igreen.registItem.paidInCapital}</td>
        </tr>
        <tr>
          <th>币种</th>
          <td>${igreen.registItem.currency}</td>
          <th>企业(机构)类型</th>
          <td>${igreen.registItem.companyType}</td>
        </tr>
        <tr>
          <th>经营状态</th>
          <td>${igreen.registItem.operateState}</td>
          <th>经营期限 自</th>
          <td>${igreen.registItem.startTime}</td>
        </tr>
        <tr>
          <th>经营期限 至</th>
          <td>${igreen.registItem.endTime}</td>
          <th>开业日期</th>
          <td>${igreen.registItem.openTime}</td>
        </tr>
        <tr>
          <th>注销日期</th>
          <td>${igreen.registItem.cancelTime}</td>
          <th>吊销日期</th>
          <td>${igreen.registItem.revokeTime}</td>
        </tr>
        <tr>
          <th>登记机关</th>
          <td>${igreen.registItem.registOffice}</td>
          <th>地址</th>
          <td>${igreen.registItem.address}</td>
        </tr>
        <tr>
          <th>最后年检年度</th>
          <td>${igreen.registItem.annualYear}</td>
          <th>最后年检日期</th>
          <td>${igreen.registItem.annualDay}</td>
        </tr>
        <tr>
          <th>行业门类代码</th>
          <td>${igreen.registItem.tradeCode}</td>
          <th>行业门类名称</th>
          <td>${igreen.registItem.tradeName}</td>
        </tr>
        <tr>
          <th>国民经济行业代码</th>
          <td>${igreen.registItem.countryTradeCode}</td>
          <th>国民经济行业名称</th>
          <td>${igreen.registItem.countryTradeName}</td>
        </tr>
        <tr>
          <th>许可经营项目</th>
          <td>${igreen.registItem.permission}</td>
          <th>一般经营项目</th>
          <td>${igreen.registItem.general}</td>
        </tr>
        <tr>
          <th>经营(业务)范围</th>
          <td>${igreen.registItem.businessScope}</td>
          <th>经营(业务)范围及方式</th>
          <td>${igreen.registItem.businessWay}</td>
        </tr>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>法院判决</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th>序号</th>
          <th>股东名称</th>
          <th>认缴出资额(万元)</th>
          <th>币种</th>
          <th>出资比例</th>
          <th>出资日期</th>
          <th>国籍</th>
        </tr>
        <%--<c:forEach var="shareholder" items="${igreen.shareholders}" varStatus="status">
		<tr>
			<td>${ status.index + 1}</td>
			<td><c:out value="${shareholder.shareholderName}"/></td>
	        <td><c:out value="${shareholder.capital}"/></td>
	        <td><c:out value="${shareholder.currency}"/></td>
	        <td><c:out value="${shareholder.ratio}"/></td>
	        <td><c:out value="${shareholder.contributiveTime}"/></td>
	        <td><c:out value="${shareholder.nationality}"/></td>
		</tr>
		</c:forEach>--%>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>专利信息</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="40%">人员姓名</th>
          <th>职务</th>
        </tr>
    	<%--<c:forEach var="employee" items="${igreen.employees}" varStatus="status">
        <tr>
          <td><c:out value="${employee.name}"/></td>
          <td><c:out value="${employee.job}"/></td>
        </tr>
    	</c:forEach>--%>
      </table>
    </div>
  </div>
</div>
<div class="home-inner" id="con_one_2" style="height: 890px; display:none;">
    <div class="data-box">
      <div class="data-tit no-top"><i></i><h3>重点监管企业</h3></div>
      <div class="data-tab tab-2">
        <table width="100%" cellpadding="0" cellspacing="0">
          <tr>
            <th width="8%">序号</th>
            <th>标题</th>
          </tr>
          <c:forEach var="openCourtNotice" items="${igreen.openCourtNotices}" varStatus="status">
          <tr>
			<td>${ status.index + 1}</td>
			<td><c:out value="${openCourtNotice.title}"/></td>
          </tr>
          </c:forEach>
        </table>
      </div>
    </div>
    <div class="data-box">
      <div class="data-tit"><i></i><h3>监管记录</h3></div>
      <div class="data-tab tab-2">
        <table width="100%" cellpadding="0" cellspacing="0">
          <tr>
            <th width="8%">序号</th>
            <th width="12%">时间</th>
            <th width="25%">案件类型</th>
            <th>标题</th>
          </tr>
          <c:forEach var="writtenJudgement" items="${igreen.writtenJudgements}" varStatus="status">
          <tr>
            <td>${ status.index + 1}</td>
            <td><c:out value="${writtenJudgement.caseTime}"/></td>
            <td><c:out value="${writtenJudgement.caseType}"/></td>
            <td><c:out value="${writtenJudgement.caseTitle}"/></td>
          </tr>
          </c:forEach>
        </table>
      </div>
    </div>
    <div class="data-box">
      <div class="data-tit"><i></i><h3>群众举报案件</h3></div>
      <div class="data-tab tab-2">
        <table width="100%" cellpadding="0" cellspacing="0">
          <tr>
            <th width="8%">序号</th>
            <th width="12%">立案时间</th>
            <th width="10%">案件状态</th>
            <th width="15%">案号</th>
            <th width="25%">执行标的</th>
            <th>执行法院</th>
          </tr>
          <c:forEach var="executedItem" items="${igreen.executedItems}" varStatus="status">
          <tr>
            <td>${ status.index + 1}</td>
            <td><c:out value="${executedItem.caseFilingTime}"/></td>
            <td><c:out value="${executedItem.caseStatus}"/></td>
            <td><c:out value="${executedItem.caseNo}"/></td>
            <td><c:out value="${executedItem.executeTarget}"/></td>
            <td><c:out value="${executedItem.executeCourt}"/></td>
          </tr>
          </c:forEach>
        </table>
      </div>
    </div>
</div>
<div class="home-inner" id="con_one_3" style="height:910px; display:none;">
  <div class="data-box">
    <div class="data-tit no-top"><i></i><h3>排污许可</h3></div>
    <div class="data-tab tab-2">
      <table width="2400" cellpadding="0" cellspacing="0">
        <tr>
          <th width="66">序号</th>
          <th width="100 ">案发时间</th>
          <th width="200">案由</th>
          <th width="100">案件类型</th>
          <th width="100">执行类别</th>
          <th width="100">案件结果</th>
          <th width="150">处罚决定书签发日期</th>
          <th width="200">处罚机关</th>
          <th width="200">主要违法事实</th>
          <th width="150">处罚依据</th>
          <th width="150">处罚种类</th>
          <th width="150">处罚结果</th>
          <th width="150">处罚金额</th>
          <th>处罚执行情况</th>
        </tr>
        <c:forEach var="administrativePenaltie" items="${igreen.administrativePenalties}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${administrativePenaltie.crimeTime}"/></td>
          <td><c:out value="${administrativePenaltie.crimeReason}"/></td>
          <td><c:out value="${administrativePenaltie.caseType}"/></td>
          <td><c:out value="${administrativePenaltie.executeType}"/></td>
          <td><c:out value="${administrativePenaltie.caseResult}"/></td>
          <td><c:out value="${administrativePenaltie.punishTime}"/></td>
          <td><c:out value="${administrativePenaltie.punishOffice}"/></td>
          <td><c:out value="${administrativePenaltie.factMalfeasance}"/></td>
          <td><c:out value="${administrativePenaltie.punishBase}"/></td>
          <td><c:out value="${administrativePenaltie.punishType}"/></td>
          <td><c:out value="${administrativePenaltie.punishResult}"/></td>
          <td><c:out value="${administrativePenaltie.punishAmount}"/></td>
          <td><c:out value="${administrativePenaltie.punishment}"/></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>清洁生产企业</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="8%">序号</th>
          <th width="10% ">冻结文号</th>
          <th width="10%">冻结机关</th>
          <th width="12%">冻结起始日期</th>
          <th width="12%">冻结截至日期</th>
          <th width="8%">冻结金额</th>
          <th width="8%">解冻机关</th>
          <th width="8%">解冻文号</th>
          <th width="8%">解冻日期</th>
          <th>解冻说明</th>
        </tr>
        <c:forEach var="freezeStockRight" items="${igreen.freezeStockRights}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${freezeStockRight.freezeNo}"/></td>
          <td><c:out value="${freezeStockRight.freezeOffice}"/></td>
          <td><c:out value="${freezeStockRight.freezeBeginTime}"/></td>
          <td><c:out value="${freezeStockRight.freezeEndTime}"/></td>
          <td><c:out value="${freezeStockRight.freezeAmount}"/></td>
          <td><c:out value="${freezeStockRight.unfreezeOffice}"/></td>
          <td><c:out value="${freezeStockRight.unfreezeNo}"/></td>
          <td><c:out value="${freezeStockRight.unfreezeTime}"/></td>
          <td><c:out value="${freezeStockRight.unfreezeExplain}"/></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>能效备案</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="8%">序号</th>
          <th width="12% ">质权人姓名</th>
          <th width="12%">出质人类别</th>
          <th width="12%">出质金额</th>
          <th width="12%">出质备案日期</th>
          <th>出质审批部门</th>
          <th width="12%">出质批准日期</th>
          <th width="12%">出质截至日期</th>
        </tr>
        <c:forEach var="pledgeStockRight" items="${igreen.pledgeStockRights}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${pledgeStockRight.pledgee}"/></td>
          <td><c:out value="${pledgeStockRight.pledgeeType}"/></td>
          <td><c:out value="${pledgeStockRight.pledgeAmount}"/></td>
          <td><c:out value="${pledgeStockRight.recordTime}"/></td>
          <td><c:out value="${pledgeStockRight.examinedOffice}"/></td>
          <td><c:out value="${pledgeStockRight.examinedTime}"/></td>
          <td><c:out value="${pledgeStockRight.examinedEndTime}"/></td>
        </tr>
        </c:forEach>
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