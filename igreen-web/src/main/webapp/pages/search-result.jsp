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
    <li><a id="one2" onclick="setTab('one',2,6)" href="javascript:void(0);">法律风险</a></li>
    <li><a id="one3" onclick="setTab('one',3,6)" href="javascript:void(0);">经营风险</a></li>
    <li><a id="one4" onclick="setTab('one',4,6)" href="javascript:void(0);">关联关系</a></li>
    <li><a id="one5" onclick="setTab('one',5,6)" href="javascript:void(0);">经营信息</a></li>
    <li><a id="one6" onclick="setTab('one',6,6)" href="javascript:void(0);">知识产权</a></li>
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
    <div class="data-tit"><i></i><h3>股东及出资信息</h3></div>
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
        <c:forEach var="shareholder" items="${igreen.shareholders}" varStatus="status">
		<tr>
			<td>${ status.index + 1}</td>
			<td><c:out value="${shareholder.shareholderName}"/></td>
	        <td><c:out value="${shareholder.capital}"/></td>
	        <td><c:out value="${shareholder.currency}"/></td>
	        <td><c:out value="${shareholder.ratio}"/></td>
	        <td><c:out value="${shareholder.contributiveTime}"/></td>
	        <td><c:out value="${shareholder.nationality}"/></td>
		</tr>
		</c:forEach>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>主要人员信息</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="40%">人员姓名</th>
          <th>职务</th>
        </tr>
    	<c:forEach var="employee" items="${igreen.employees}" varStatus="status">
        <tr>
          <td><c:out value="${employee.name}"/></td>
          <td><c:out value="${employee.job}"/></td>
        </tr>
    	</c:forEach>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>变更信息</h3></div>
    <div class="data-tab">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="183">变更事项</th>
          <td width="274">${igreen.exchange.exchangeItem}</td>
          <th width="183">变更前内容</th>
          <td>${igreen.exchange.beforeItem}</td>
        </tr>
        <tr>
          <th>变更后内容</th>
          <td>${igreen.exchange.afterItem}</td>
          <th>变更日期</th>
          <td>${igreen.exchange.exchangeTime}</td>
        </tr>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>组织机构代码证信息</h3></div>
    <div class="data-tab">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="183">机构代码</th>
          <td width="274">${igreen.organizationItem.organizationCode}</td>
          <th width="183">机构名称</th>
          <td>${igreen.organizationItem.organizationName}</td>
        </tr>
        <tr>
          <th>机构类型</th>
          <td>${igreen.organizationItem.organizationType}</td>
          <th>机构地址</th>
          <td>${igreen.organizationItem.organizationAddress}</td>
        </tr>
        <tr>
          <th>管辖机构</th>
          <td>${igreen.organizationItem.jurisdictionalAgency}</td>
          <th></th>
          <td></td>
        </tr>
      </table>
    </div>
  </div>
</div>
<div class="home-inner" id="con_one_2" style="height: 890px; display:none;">
    <div class="data-box">
      <div class="data-tit no-top"><i></i><h3>开庭公告</h3></div>
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
      <div class="data-tit"><i></i><h3>裁判文书信息</h3></div>
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
      <div class="data-tit"><i></i><h3>被执行人信息</h3></div>
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
    <div class="data-box">
      <div class="data-tit"><i></i><h3>失信被执行人信息</h3></div>
      <div class="data-tab tab-2">
        <table width="2050" cellpadding="0" cellspacing="0">
          <tr>
            <th width="66">序号</th>
            <th width="112">立案时间</th>
            <th width="100">法定代表人</th>
            <th width="100">组织机构号</th>
            <th width="240">生效法律文书确定的义务</th>
            <th width="240">失信被执行人为具体情形</th>
            <th width="200">被执行人的履行情况</th>
            <th width="100">全部未履行</th>
            <th width="100">公布时间</th>
            <th width="100">省份</th>
            <th width="100">执行依据文号</th>
            <th>执行法院</th>
          </tr>
          <c:forEach var="breakPromiseExecuted" items="${igreen.breakPromiseExecuteds}" varStatus="status">
          <tr>
            <td>${ status.index + 1}</td>
            <td><c:out value="${breakPromiseExecuted.caseFilingTime}"/></td>
            <td><c:out value="${breakPromiseExecuted.legalPerson}"/></td>
            <td><c:out value="${breakPromiseExecuted.organizationNo}"/></td>
            <td><c:out value="${breakPromiseExecuted.obligation}"/></td>
            <td><c:out value="${breakPromiseExecuted.executedCondition}"/></td>
            <td><c:out value="${breakPromiseExecuted.performCondition}"/></td>
            <td><c:out value="${breakPromiseExecuted.nonperforming}"/></td>
            <td><c:out value="${breakPromiseExecuted.publishTime}"/></td>
            <td><c:out value="${breakPromiseExecuted.province}"/></td>
            <td><c:out value="${breakPromiseExecuted.accordingNo}"/></td>
            <td><c:out value="${breakPromiseExecuted.executeCourt}"/></td>
          </tr>
          </c:forEach>
        </table>
      </div>
    </div>
    <div class="data-box">
      <div class="data-tit"><i></i><h3>法院公告</h3></div>
      <div class="data-tab tab-2">
        <table width="100%" cellpadding="0" cellspacing="0">
          <tr>
            <th width="8%">序号</th>
            <th width="12%">时间</th>
            <th width="15%">公告类型</th>
            <th width="25%">法院</th>
            <th>公告内容</th>
          </tr>
          <c:forEach var="courtNotice" items="${igreen.courtNotices}" varStatus="status">
          <tr>
            <td>${ status.index + 1}</td>
            <td><c:out value="${courtNotice.noticeTime}"/></td>
            <td><c:out value="${courtNotice.noticeType}"/></td>
            <td><c:out value="${courtNotice.court}"/></td>
            <td><c:out value="${courtNotice.notice}"/></td>
          </tr>
          </c:forEach>
        </table>
      </div>
    </div>
</div>
<div class="home-inner" id="con_one_3" style="height:910px; display:none;">
  <div class="data-box">
    <div class="data-tit no-top"><i></i><h3>行政处罚信息</h3></div>
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
    <div class="data-tit"><i></i><h3>股权冻结信息</h3></div>
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
    <div class="data-tit"><i></i><h3>股权质押信息</h3></div>
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
  <div class="data-box">
      <div class="data-tit"><i></i><h3>动产抵押信息</h3></div>
      <div class="data-tab tab-2">
        <table width="2500" cellpadding="0" cellspacing="0">
          <tr>
            <th width="66">序号</th>
            <th width="6%">抵押ID</th>
            <th width="6%">抵押人</th>
            <th width="8%">抵押权人</th>
            <th width="10%">登记机关</th>
            <th width="8%">登记日期</th>
            <th width="4%">状态标识</th>
            <th width="8%">登记证号</th>
            <th width="8%">申请抵押原因</th>
            <th width="8%">被担保主债权种类</th>
            <th width="8%">被担保主债权数额(万元)</th>
            <th width="8%">履约起始日期</th>
            <th width="8%">履约截止日期</th>
            <th>注销日期</th>
          </tr>
          <c:forEach var="chattelMortgage" items="${igreen.chattelMortgages}" varStatus="status">
          <tr>
            <td>${ status.index + 1}</td>
            <td><c:out value="${chattelMortgage.mortgageId}"/></td>
            <td><c:out value="${chattelMortgage.mortgagee}"/></td>
            <td><c:out value="${chattelMortgage.pledgee}"/></td>
            <td><c:out value="${chattelMortgage.registOffice}"/></td>
            <td><c:out value="${chattelMortgage.registTime}"/></td>
            <td><c:out value="${chattelMortgage.mortgageStatus}"/></td>
            <td><c:out value="${chattelMortgage.registNo}"/></td>
            <td><c:out value="${chattelMortgage.mortgageReason}"/></td>
            <td><c:out value="${chattelMortgage.creditorType}"/></td>
            <td><c:out value="${chattelMortgage.creditorAmount}"/></td>
            <td><c:out value="${chattelMortgage.beginTime}"/></td>
            <td><c:out value="${chattelMortgage.endTime}"/></td>
            <td><c:out value="${chattelMortgage.cancelTime}"/></td>
          </tr>
          </c:forEach>
        </table>
      </div>
  </div>
  <div class="data-box">
      <div class="data-tit"><i></i><h3>动产抵押物信息</h3></div>
      <div class="data-tab tab-2">
        <table width="100%" cellpadding="0" cellspacing="0">
          <tr>
            <th width="8%">序号</th>
            <th width="20% ">抵押ID</th>
            <th>抵押物名称</th>
            <th width="15%">数量</th>
            <th width="20%">价值(万元)</th>
          </tr>
          <c:forEach var="thingChattelMortgage" items="${igreen.thingChattelMortgages}" varStatus="status">
          <tr>
            <td>${ status.index + 1}</td>
            <td><c:out value="${thingChattelMortgage.mortgageId}"/></td>
            <td><c:out value="${thingChattelMortgage.thingName}"/></td>
            <td><c:out value="${thingChattelMortgage.thingNum}"/></td>
            <td><c:out value="${thingChattelMortgage.thingAmount}"/></td>
          </tr>
          </c:forEach>
        </table>
      </div>
  </div>
</div>
<div class="home-inner" id="con_one_4" style="display:none;">
  <div class="data-box">
    <div class="data-tit no-top"><i></i><h3>分支机构信息</h3></div>
    <div class="data-tab">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="140">分支机构名称</th>
          <td width="300">${igreen.branch.branchName}</td>
          <th width="160">分支机构企业注册号</th>
          <td>${igreen.branch.branchRegistNo}</td>
        </tr>
        <tr>
          <th>分支机构负责人</th>
          <td>${igreen.branch.principal}</td>
          <th>一般经营项目</th>
          <td>${igreen.branch.general}</td>
        </tr>
        <tr>
          <th>分支机构地址</th>
          <td>${igreen.branch.address}</td>
          <th></th>
          <td></td>
        </tr>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>企业投资</h3></div>
    <div class="data-tab tab-2">
      <table width="2300" cellpadding="0" cellspacing="0">
        <tr>
          <th width="66">序号</th>
          <th width="300 ">企业(机构)名称</th>
          <th width="150">注册号</th>
          <th width="150">企业(机构)类型</th>
          <th width="150">注册资本(万元)</th>
          <th width="120">注册资本币种</th>
          <th width="100">企业状态</th>
          <th width="100">注销日期</th>
          <th width="100">吊销日期</th>
          <th width="100">登记机关</th>
          <th width="120">认缴出资额(万元)</th>
          <th width="120">认缴出资币种</th>
          <th width="100">出资比例</th>
          <th width="100">开业日期</th>
          <th>法定代表人姓名</th>
        </tr>
        <c:forEach var="investment" items="${igreen.investments}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${investment.companyName}"/></td>
          <td><c:out value="${investment.registNo}"/></td>
          <td><c:out value="${investment.companyType}"/></td>
          <td><c:out value="${investment.registAmount}"/></td>
          <td><c:out value="${investment.registCurrency}"/></td>
          <td><c:out value="${investment.companyStatus}"/></td>
          <td><c:out value="${investment.cancelTime}"/></td>
          <td><c:out value="${investment.revokeTime}"/></td>
          <td><c:out value="${investment.registOffice}"/></td>
          <td><c:out value="${investment.subscribeCapital}"/></td>
          <td><c:out value="${investment.subscribeCurrency}"/></td>
          <td><c:out value="${investment.ratio}"/></td>
          <td><c:out value="${investment.openTime}"/></td>
          <td><c:out value="${investment.legalRepresentative}"/></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>关联企业</h3></div>
    <c:forEach var="companyView" items="${igreen.companyViews}">
    <div class="data-min-tit"><c:out value="${companyView.name}"/> <c:out value="${companyView.job}"/></div>
    <div class="data-tab tab-2">
      <table width="1800" cellpadding="0" cellspacing="0">
        <tr>
          <th width="66">序号</th>
          <th width="300">企业名称</th>
          <th width="100">任职</th>
          <th width="120">投资（万元）</th>
          <th width="100">持股比例</th>
          <th width="120">注册资本（万元）</th>
          <th width="120">注册资本币种</th>
          <th width="150">企业（机构）类型</th>
          <th width="150">注册号</th>
          <th>登记机关</th>
          <th width="100">企业状态</th>
        </tr>
        <c:forEach var="relationCompanie" items="${companyView.relationCompanies}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${relationCompanie.companyName}"/></td>
          <td><c:out value="${relationCompanie.job}"/></td>
          <td><c:out value="${relationCompanie.investment}"/></td>
          <td><c:out value="${relationCompanie.ratio}"/></td>
          <td><c:out value="${relationCompanie.registAmount}"/></td>
          <td><c:out value="${relationCompanie.registCurrency}"/></td>
          <td><c:out value="${relationCompanie.companyType}"/></td>
          <td><c:out value="${relationCompanie.registNo}"/></td>
          <td><c:out value="${relationCompanie.registOffice}"/></td>
          <td><c:out value="${relationCompanie.companyStatus}"/></td>
        </tr>
        </c:forEach>
      </table>
    </div>
    </c:forEach>
  </div>
</div>
<div class="home-inner" id="con_one_5" style="display:none;"><!--需要纵向滚动条，给home-inner设个行内高度即可-->
  <div class="data-box">
    <div class="data-tit no-top"><i></i><h3>招聘信息</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="66">序号</th>
          <th width="150 ">职位</th>
          <th width="120">薪资</th>
          <th width="150">经验要求</th>
          <th width="150">地点</th>
          <th width="120">学历</th>
          <th>来源</th>
        </tr>
        <c:forEach var="invite" items="${igreen.invites}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${invite.job}"/></td>
          <td><c:out value="${invite.salary}"/></td>
          <td><c:out value="${invite.experience}"/></td>
          <td><c:out value="${invite.address}"/></td>
          <td><c:out value="${invite.education}"/></td>
          <td><c:out value="${invite.source}"/></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </div>
</div>
<div class="home-inner" id="con_one_6" style="display:none; height:880px;">
  <div class="data-box">
    <div class="data-tit no-top"><i></i><h3>专利信息</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="66">序号</th>
          <th width="150 ">申请日期</th>
          <th width="200">类型</th>
          <th>名称</th>
        </tr>
        <c:forEach var="patent" items="${igreen.patents}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${patent.applyTime}"/></td>
          <td><c:out value="${patent.patentType}"/></td>
          <td><c:out value="${patent.patentName}"/></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>商标信息</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="66">序号</th>
          <th width="300">商标名称</th>
          <th width="150">申请日期</th>
          <th width="150">状态</th>
          <th width="150">注册号</th>
          <th>类别</th>
        </tr>
        <c:forEach var="brand" items="${igreen.brands}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${brand.brandName}"/></td>
          <td><c:out value="${brand.applyTime}"/></td>
          <td><c:out value="${brand.brandStatus}"/></td>
          <td><c:out value="${brand.registNo}"/></td>
          <td><c:out value="${brand.brandType}"/></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>著作权信息</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="66">序号</th>
          <th>作品名称</th>
          <th width="100">登记号</th>
          <th width="100">类别</th>
          <th width="100">创作完成日期</th>
          <th width="100">登记日期</th>
          <th width="100">首次发布日期</th>
          <th width="100">最后更新时间</th>
        </tr>
        <c:forEach var="copyright" items="${igreen.copyrights}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${copyright.productionName}"/></td>
          <td><c:out value="${copyright.registNo}"/></td>
          <td><c:out value="${copyright.productionType}"/></td>
          <td><c:out value="${copyright.completeTime}"/></td>
          <td><c:out value="${copyright.registTime}"/></td>
          <td><c:out value="${copyright.firstPublishTime}"/></td>
          <td><c:out value="${copyright.lastUpdateTime}"/></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>软件著作权信息</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="66">序号</th>
          <th>软件名称</th>
          <th width="120">软件简称</th>
          <th width="120">登记号</th>
          <th width="100">版本号</th>
          <th width="150">分类号</th>
          <th width="120">登记批准日期</th>
        </tr>
        <c:forEach var="softwareCopyright" items="${igreen.softwareCopyrights}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${softwareCopyright.softwareName}"/></td>
          <td><c:out value="${softwareCopyright.softwareShopName}"/></td>
          <td><c:out value="${softwareCopyright.registNo}"/></td>
          <td><c:out value="${softwareCopyright.softwareVersion}"/></td>
          <td><c:out value="${softwareCopyright.classifyNo}"/></td>
          <td><c:out value="${softwareCopyright.approveRegistTime}"/></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>域名</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th width="66">序号</th>
          <th>网址</th>
          <th width="300">网址名称</th>
          <th width="200">网站备案/许可证号</th>
          <th width="120">登记批准日期</th>
        </tr>
        <c:forEach var="domainName" items="${igreen.domainNames}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${domainName.location}"/></td>
          <td><c:out value="${domainName.locationName}"/></td>
          <td><c:out value="${domainName.licenseKey}"/></td>
          <td><c:out value="${domainName.approveRegistTime}"/></td>
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