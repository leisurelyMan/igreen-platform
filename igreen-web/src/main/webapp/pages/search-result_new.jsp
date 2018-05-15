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
          <th width="183">公司名称</th>
          <td width="274">${igreen.qichachaCompanyBase.name}</td>
          <th width="183">注册时间</th>
          <td>${igreen.qichachaCompanyBase.startDate}</td>
        </tr>
        <tr>
          <th>省编码</th>
          <td>${igreen.qichachaCompanyBase.province}</td>
          <th>行业编码</th>
          <td>${igreen.qichachaCompanyBase.industryCode}</td>
        </tr>
        <tr>
          <th>细分行业编码</th>
          <td>${igreen.qichachaCompanyBase.subindustryCode}</td>
          <th>行业</th>
          <td>${igreen.qichachaCompanyBase.industry}</td>
        </tr>
        <tr>
          <th>细分行业</th>
          <td>${igreen.qichachaCompanyBase.subindustry}</td>
          <th>注册编码</th>
          <td>${igreen.qichachaCompanyBase.creditCode}</td>
        </tr>
        <tr>
          <th>注册资本</th>
          <td>${igreen.qichachaCompanyBase.registCapi}</td>
          <th>经营形式</th>
          <td>${igreen.qichachaCompanyBase.econKind}</td>
        </tr>
        <tr>
          <th>组织机构代码</th>
          <td>${igreen.qichachaCompanyBase.orgNo}</td>
          <th>状态</th>
          <td>${igreen.qichachaCompanyBase.status}</td>
        </tr>
        <tr>
          <th>经营范围</th>
          <td>${igreen.qichachaCompanyBase.scope}</td>
          <th></th>
          <td></td>
        </tr>
        <%--<tr>
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
        </tr>--%>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>法院判决</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th>序号</th>
          <th>执行法院</th>
          <th>处罚名称</th>
          <th>处罚编号</th>
          <th>处罚类型</th>
          <th>提交时间</th>
          <th>是否为起诉人</th>
          <th>是否为被告</th>
          <th>更新时间</th>
          <th>年度</th>
          <th>角色</th>
        </tr>
        <c:forEach var="qichachaJudgement" items="${igreen.qichachaJudgements}" varStatus="status">
		<tr>
			<td>${ status.index + 1}</td>
			<td><c:out value="${qichachaJudgement.court}"/></td>
	        <td><c:out value="${qichachaJudgement.caseName}"/></td>
	        <td><c:out value="${qichachaJudgement.caseNo}"/></td>
	        <td><c:out value="${qichachaJudgement.caseType}"/></td>
	        <td><c:out value="${qichachaJudgement.submitDate}"/></td>
	        <td><c:out value="${qichachaJudgement.isProsecutor}"/></td>
          <td><c:out value="${qichachaJudgement.isDefendant}"/></td>
          <td><c:out value="${qichachaJudgement.updateDate}"/></td>
          <td><c:out value="${qichachaJudgement.courtYear}"/></td>
          <td><c:out value="${qichachaJudgement.caseRole}"/></td>
		</tr>
		</c:forEach>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>专利信息</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
        <tr>
          <th>序号</th>
          <th>key_nop</th>
          <th>专利类别</th>
          <th>种类code</th>
          <th>申请编号</th>
          <th>申请时间</th>
          <th>发布编号</th>
          <th>发布时间</th>
          <th>法定状态</th>
          <th>法定状态描述</th>
          <th>标题</th>
          <th>代理机构</th>
          <th>种类描述</th>
          <th>专利类别描述</th>
          <th>发明人</th>
          <th>代理人</th>
        </tr>
    	<c:forEach var="qichachaPatent" items="${igreen.qichachaPatents}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${qichachaPatent.keyNop}"/></td>
          <td><c:out value="${qichachaPatent.ipcList}"/></td>
          <td><c:out value="${qichachaPatent.kindCode}"/></td>
          <td><c:out value="${qichachaPatent.applicationNumber}"/></td>
          <td><c:out value="${qichachaPatent.applicationDate}"/></td>
          <td><c:out value="${qichachaPatent.publicationNumber}"/></td>
          <td><c:out value="${qichachaPatent.publicationDate}"/></td>
          <td><c:out value="${qichachaPatent.legalStatus}"/></td>
          <td><c:out value="${qichachaPatent.legalStatusDesc}"/></td>
          <td><c:out value="${qichachaPatent.title}"/></td>
          <td><c:out value="${qichachaPatent.agency}"/></td>
          <td><c:out value="${qichachaPatent.kindCodeDesc}"/></td>
          <td><c:out value="${qichachaPatent.ipcDesc}"/></td>
          <td><c:out value="${qichachaPatent.inventorStringList}"/></td>
          <td><c:out value="${qichachaPatent.assigneestringList}"/></td>
        </tr>
    	</c:forEach>
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
            <th>序号</th>
            <th>登记信息表主键</th>
            <th>序列</th>
            <th>行政区划代码</th>
            <th>法人代码</th>
            <th>涉及企业</th>
            <th>监控类别</th>
            <th>所属省份</th>
            <th>所属年份</th>
            <th>创建时间</th>
          </tr>
          <c:forEach var="monitorCompanie" items="${igreen.monitorCompanies}" varStatus="status">
          <tr>
			<td>${ status.index + 1}</td>
			<td><c:out value="${monitorCompanie.registItemId}"/></td>
            <td><c:out value="${monitorCompanie.monitorSequence}"/></td>
            <td><c:out value="${monitorCompanie.regionCode}"/></td>
            <td><c:out value="${monitorCompanie.legalPersonCode}"/></td>
            <td><c:out value="${monitorCompanie.companyName}"/></td>
            <td><c:out value="${monitorCompanie.monitorType}"/></td>
            <td><c:out value="${monitorCompanie.province}"/></td>
            <td><c:out value="${monitorCompanie.monitorYear}"/></td>
            <td><c:out value="${monitorCompanie.createTm}"/></td>
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
            <th>序号</th>
            <th>公司名称</th>
            <th>登记信息ID</th>
            <th>年度</th>
            <th>标题</th>
            <th>ipe记录ID</th>
            <th>文件名称</th>
            <th>状态</th>
          </tr>
          <c:forEach var="ipeIndustryRecord" items="${igreen.ipeIndustryRecords}" varStatus="status">
          <tr>
            <td>${ status.index + 1}</td>
            <td><c:out value="${ipeIndustryRecord.companyName}"/></td>
            <td><c:out value="${ipeIndustryRecord.registItemId}"/></td>
            <td><c:out value="${ipeIndustryRecord.year}"/></td>
            <td><c:out value="${ipeIndustryRecord.title}"/></td>
            <td><c:out value="${ipeIndustryRecord.ipeId}"/></td>
            <td><c:out value="${ipeIndustryRecord.fileName}"/></td>
            <td><c:out value="${ipeIndustryRecord.status}"/></td>
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
            <th>序号</th>
            <th>登记信息表主键</th>
            <th>序列</th>
            <th>年份</th>
            <th>月份</th>
            <th>省份</th>
            <th>涉及企业</th>
            <th>存在问题</th>
            <th>处理情况</th>
            <th>备注</th>
          </tr>
          <c:forEach var="environmentalIssue" items="${igreen.environmentalIssues}" varStatus="status">
          <tr>
            <td>${ status.index + 1}</td>
            <td><c:out value="${environmentalIssue.registItemId}"/></td>
            <td><c:out value="${environmentalIssue.reportSequence}"/></td>
            <td><c:out value="${environmentalIssue.reportYear}"/></td>
            <td><c:out value="${environmentalIssue.reportMonth}"/></td>
            <td><c:out value="${environmentalIssue.province}"/></td>
            <td><c:out value="${environmentalIssue.companyName}"/></td>
            <td><c:out value="${environmentalIssue.reportIssue}"/></td>
            <td><c:out value="${environmentalIssue.dealResult}"/></td>
            <td><c:out value="${environmentalIssue.reportComment}"/></td>
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
      <table width="1500" cellpadding="0" cellspacing="0">
        <tr>
          <th width="66">序号</th>
          <th width="200">主要内容</th>
          <th width="100">上报频次</th>
          <th>其他信息</th>
        </tr>
        <c:forEach var="executionRecord" items="${igreen.executionRecords}" varStatus="status">
        <tr>
          <td>${ status.index + 1}</td>
          <td><c:out value="${executionRecord.content}"/></td>
          <td><c:out value="${executionRecord.frequency}"/></td>
          <td><c:out value="${executionRecord.otherInfo}"/></td>
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
          <th width="183">企业名称</th>
          <td width="274">${igreen.cleanProductionCompany.companyName}</td>
          <th width="183">行业</th>
          <td>${igreen.cleanProductionCompany.trade}</td>
        </tr>
        <tr>
          <th>年份</th>
          <td >${igreen.cleanProductionCompany.year}</td>
          <th>批次</th>
          <td>${igreen.cleanProductionCompany.batchNo}</td>
        </tr>
        <tr>
          <th>城市</th>
          <td>${igreen.cleanProductionCompany.city}</td>
          <th>编号</th>
          <td>${igreen.cleanProductionCompany.serialNumber}</td>
        </tr>
        <tr>
          <th>主要产品及年产量</th>
          <td>${igreen.cleanProductionCompany.productSalesAmount}</td>
          <th>所属地区</th>
          <td>${igreen.cleanProductionCompany.region}</td>
        </tr>
        <tr>
          <th>地址</th>
          <td>${igreen.cleanProductionCompany.address}</td>
          <th>公布时间</th>
          <td>${igreen.cleanProductionCompany.reportTime}</td>
        </tr>
        <tr>
          <th>提交审核时间</th>
          <td>${igreen.cleanProductionCompany.submitCheckTime}</td>
          <th>完成评估时间</th>
          <td>${igreen.cleanProductionCompany.completeEstimateTime}</td>
        </tr>
        <tr>
          <th>完成验收时间</th>
          <td>${igreen.cleanProductionCompany.completeCheckTime}</td>
          <th>审核咨询机构名称</th>
          <td>${igreen.cleanProductionCompany.checkOrganization}</td>
        </tr>
      </table>
    </div>
  </div>
  <div class="data-box">
    <div class="data-tit"><i></i><h3>能效备案</h3></div>
    <div class="data-tab tab-2">
      <table width="100%" cellpadding="0" cellspacing="0">
       <%-- <tr>
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
        </c:forEach>--%>
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