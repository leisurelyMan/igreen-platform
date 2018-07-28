<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
  <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" type="text/css" href="../css/search/search.css"/>
  <script src="../js/search/jquery-1.8.3.min.js"></script>
  <script src="../js/search/public.js"></script>
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
<body>
<div class="header-2" style="background:#fff;">
  <div class="mainBox">
    <div class="logo">
      <a href="../pages/index.html">
        <img src="../images/search/logo-2.png" height="40" width="186" alt="">
      </a>
    </div>
    <ul>
      <li>
        <a href="../pages/index.html#link3" rid="link3">公司大事件 </a>
      </li>
      <li>
        <a href="../pages/index.html#link2" rid="link2">主营业务</a>
      </li>
      <li>
        <a href="../pages/index.html#link1" rid="link1">产品模块</a>
      </li>
      <li>
        <a href="http://www.igreenbank.cn/pages/questionnaire.html">绿色债券评估</a>
      </li>
    </ul>
    <div class="head-links">
      <a href="#">个人中心</a>
      <i></i>
      <a href="#">注册</a>
      <i></i>
      <a href="#">登录</a>
    </div>
  </div>
</div>
<div id="container">
  <div class="header">
    <img src="../images/search/searchBack.png" alt="">
  </div>
  <div id="content">
    <div class="searchWrap">
      <form action="../index/searchNew" method="post" id="searchForm">
        <img src="../images/search/searchBtn.png" alt="" class="searchBtn">
        <input type="text" class="searchVal" id="companyName" value="${companyName}" name="companyName" placeholder="请输入要搜索的内容">
      </form>
    </div>
    <div class="searchHead">
      <ul>
        <li class="hoverGreen">
          <span>基本信息</span>
          <span></span>
          <div class="erjiMenu">
            <div><a href="#registInfo">登记信息</a></div>
            <div><a href="#courtDecision">法院判决</a></div>
            <div><a href="#patentInfo">专利信息</a> </div>
          </div>
        </li>
        <li>
          <span>环境风险</span>
          <span></span>
          <div class="erjiMenu" style="min-width: 100px;">
            <div><a href="#registInfoHuanjing">重点监管企业</a></div>
          </div>
        </li>
        <li>
          <span>环境许可</span>
          <span></span>
          <div class="erjiMenu">
            <div><a href="#registInfoXunke">排污许可</a></div>
            <div><a href="#courtDecisionXunke">清洁生产企业</a></div>
            <div><a href="#patentInfoXunke">能效备案</a></div>
          </div>
        </li>
        <li>
          <span>风险预测</span>
          <span></span>
          <div class="erjiMenu" style="min-width: 100px;">
            <div><a href="#registInfoYuce">风险预测</a></div>
          </div>
        </li>
        <!--<li>
          <span>风险监控</span>
          <span class="tips">new</span>-->
          <!--<div class="erjiMenu">-->
          <!--<div><a href="">排污许可</a></div>-->
          <!--<div><a href="">清洁生产企业</a></div>-->
          <!--<div><a href="">能效备案</a></div>-->
          <!--</div>-->
        <!--</li>-->
      </ul>
    </div>
    <div class="tabcontent">
      <!--第一个tab(基本信息)-->
      <div class="first tab" style="display: block;">
        <div class="tableContent">
          <!--第一部分-->
          <div id="registInfo" class="area area1">
            <div class="areaHead">
              <div class="shuxian fl"></div>
              <div class="areaHeadInfo fl">登记信息</div>
              <div class="areaHeadHengxian"></div>
              <div class="clear"></div>
            </div>
            <div class="table">
              <table width="1100"  border="1" cellpadding="10" cellspacing="0" bordercolor="#bfbfbf">
                <tr height="50">
                  <td width="130" bordercolor="1" bgcolor="#eeeeee" class="dengjiTitle"> 公司名称</td>
                  <td width="420" class="qingjieContent">${igreen.qichachaCompanyBase.name}</td>
                  <td width="130" bordercolor="1" bgcolor="#eeeeee" class="dengjiTitle">省编码</td>
                  <td width="130" class="qingjieContent">${igreen.qichachaCompanyBase.province}</td>
                  <td width="275" rowspan="2">
                    <div align="center">
                      <p class="lastTitle">注册资本</p>
                      <p class="lastCon">${igreen.qichachaCompanyBase.registCapi}</p>
                    </div>
                  </td>
                </tr>
                <tr height="50">
                  <td bgcolor="#eeeeee" class="dengjiTitle">行业</td>
                  <td class="qingjieContent">${igreen.qichachaCompanyBase.industry}</td>
                  <td bordercolor="1" bgcolor="#eeeeee" class="dengjiTitle">行业编码</td>
                  <td class="qingjieContent">${igreen.qichachaCompanyBase.industryCode}</td>
                </tr>
                <tr height="50">
                  <td bgcolor="#eeeeee" class="dengjiTitle">细分行业</td>
                  <td class="qingjieContent">${igreen.qichachaCompanyBase.subindustry}</td>
                  <td bordercolor="1" bgcolor="#eeeeee" class="dengjiTitle">细分行业编码</td>
                  <td class="qingjieContent">${igreen.qichachaCompanyBase.subindustryCode}</td>
                  <td rowspan="2">
                    <div align="center">
                      <p class="lastTitle">注册时间</p>
                      <p class="lastCon">${igreen.qichachaCompanyBase.startDate}</p>
                    </div>
                  </td>
                </tr>
                <tr height="50">
                  <td bgcolor="#eeeeee" class="dengjiTitle">注册编码</td>
                  <td class="qingjieContent">${igreen.qichachaCompanyBase.creditCode}</td>
                  <td bordercolor="1" bgcolor="#eeeeee" class="dengjiTitle">组织机构代码</td>
                  <td class="qingjieContent">${igreen.qichachaCompanyBase.orgNo}</td>
                </tr>
                <tr height="50">
                  <td bgcolor="#eeeeee" class="dengjiTitle">经营形式</td>
                  <td colspan="3" class="qingjieContent">${igreen.qichachaCompanyBase.econKind}</td>
                  <td rowspan="2">
                    <div align="center">
                      <p class="lastTitle">公司状态</p>
                      <p style="font-size: 16px;">
                        <c:if test="${igreen.qichachaCompanyBase.status=='在营'}">
                          <span style="color: #17a573;">${igreen.qichachaCompanyBase.status}</span>
                        </c:if>
                        <c:if test="${igreen.qichachaCompanyBase.status !='在营'}">
                          <span style="color: #f74346;">${igreen.qichachaCompanyBase.status}</span>
                        </c:if>
                      </p>
                    </div>
                  </td>
                </tr>
                <tr height="50">
                  <td bgcolor="#eeeeee" class="dengjiTitle">注册地址</td>
                  <td colspan="3">&nbsp;</td>
                </tr>
                <tr height="100">
                  <td bgcolor="#eeeeee" class="dengjiTitle">经营范围</td>
                  <td colspan="4">${igreen.qichachaCompanyBase.scope}</td>
                </tr>
              </table>
            </div>
          </div>
          <!--第二部分-->
          <div id="courtDecision" class="area area1">
            <div class="areaHead">
              <div class="shuxian fl"></div>
              <div class="areaHeadInfo fl">法院判决</div>
              <div class="areaHeadHengxian"></div>
              <div class="clear"></div>
            </div>
            <div class="table">
              <table width="1188"  border="1" cellpadding="5" cellspacing="0" bordercolor="#b9b9b9">
                <tr bgcolor="#eeeeee" height="50">
                  <td width="50" height="38"><div align="center" class="dengjiTitle">序号</div></td>
                  <td width="120"><div align="center">执行法院</div></td>
                  <td width="465"><div align="center">处罚名称</div></td>
                  <td width="130"><div align="center">处罚编号</div></td>
                  <td width="45"><div align="center">处罚类型</div></td>
                  <td width="120"><div align="center">提交时间</div></td>
                  <td width="80"><div align="center">是否为起诉人</div></td>
                  <td width="65"><div align="center">是否为被告</div></td>
                  <td width="65"><div align="center">更新时间</div></td>
                  <td width="65"><div align="center">年度</div></td>
                  <td width="75"><div align="center">角色</div></td>
                </tr>
              <c:forEach var="qichachaJudgement" items="${igreen.qichachaJudgements}" varStatus="status">
                <tr height="100" class="qingjieContent">
                  <td><div align="center">${ status.index + 1}</div></td>
                  <td><div align="center">${qichachaJudgement.court}</div></td>
                  <td>${qichachaJudgement.caseName}</td>
                  <td>${qichachaJudgement.caseNo}<br /></td>
                  <td><div align="center">${qichachaJudgement.caseType}</div></td>
                  <td class="qingjieContent">${qichachaJudgement.submitDate}</td>
                  <td><div align="center">${qichachaJudgement.isProsecutor}</div></td>
                  <td><div align="center">${qichachaJudgement.isDefendant}</div></td>
                  <td><div align="center">${qichachaJudgement.updateDate}</div></td>
                  <td><div align="center">${qichachaJudgement.courtYear}</div></td>
                  <td><div align="center">${qichachaJudgement.caseRole}</div></td>
                </tr>
              </c:forEach>
              </table>
            </div>
          </div>
          <!--第三部分-->
          <div id="patentInfo" class="area area1">
            <div class="areaHead">
              <div class="shuxian fl"></div>
              <div class="areaHeadInfo fl">专利信息</div>
              <div class="areaHeadHengxian"></div>
              <div class="clear"></div>
            </div>
            <div class="table">
              <table width="1400" border="1" cellpadding="5" cellspacing="0" bordercolor="#b9b9b9">
                <tr bgcolor="#eeeeee" height="50" class="dengjiTitle">
                  <td width="50" height="38"><div align="center">序号</div></td>
                  <td width="50"><div align="center">专利类别</div></td>
                  <td width="65"><div align="center">种类CODE</div></td>
                  <td width="90"><div align="center">申请编号</div></td>
                  <td width="90"><div align="center">申请时间</div></td>
                  <td width="105"><div align="center">发布编号</div></td>
                  <td width="100"><div align="center">发布时间</div></td>
                  <td width="85"><div align="center">法定状态和描述</div></td>
                  <td width="215"><div align="center">标题</div></td>
                  <td width="150"><div align="center">代理机构</div></td>
                  <td width="110"><div align="center">种类描述</div></td>
                  <td width="120"><div align="center">专利种类描述</div></td>
                  <td width="100"><div align="center">发明人</div></td>
                  <td width="75"><div align="center">代理人</div></td>
                </tr>
                <c:forEach var="qichachaPatent" items="${igreen.qichachaPatents}" varStatus="status">
                  <tr height="120" class="qingjieContent">
                    <td><div align="center">${ status.index + 1}</div></td>
                    <td><div align="center">${qichachaPatent.ipcList}</div></td>
                    <td><div align="center">${qichachaPatent.kindCode}</div></td>
                    <td><div align="center">${qichachaPatent.applicationNumber}</div></td>
                    <td><div align="center">${qichachaPatent.applicationDate}</div></td>
                    <td><div align="center">${qichachaPatent.publicationNumber}</div></td>
                    <td><div align="center">${qichachaPatent.publicationDate}</div></td>
                    <td><div align="center">${qichachaPatent.legalStatusDesc}</div></td>
                    <td><div align="center">${qichachaPatent.title} </div></td>
                    <td><div align="center">${qichachaPatent.agency}</div></td>
                    <td><div align="center">${qichachaPatent.kindCodeDesc}</div></td>
                    <td><div align="center">${qichachaPatent.ipcDesc}</div></td>
                    <td><div align="center">${qichachaPatent.inventorStringList}</div></td>
                    <td><div align="center">${qichachaPatent.assigneestringList}</div></td>
                  </tr>
                </c:forEach>
                </table>
            </div>
          </div>
        </div>
        <!--广告-->
        <div class="advert">
          <div class="advertL advertContent fl">
            <div class="advertTxtWrap">
              <div class="title">广告</div>
              <div class="advertIconWrap"><img src="../images/search/advertIcon.png" alt=""></div>
              <div class="advertTxt">
                这里可以放一句广告标语、一段话、公司最新活动。或者信息来源。
              </div>
            </div>
          </div>
          <div class="advertR advertContent fl" style="width: 500px;margin-left: 25px;">
            <div class="advertTxtWrap">
              <div class="title">广告</div>
              <div class="advertIconWrap"><img src="../images/search/advertIcon.png" alt=""></div>
              <div class="advertTxt">
                这里可以放一句广告标语、一段话、公司最新活动。或者信息来源。
              </div>
            </div>
          </div>
        </div>
        <!--悬浮按钮-->
        <div class="xuanfuBtnWrap">
          <a href="#registInfo"><div class="xuanfuBtnList"><span class="xuanfuIcon"></span><span>登记信息</span></div></a>
          <a href="#courtDecision"><div class="xuanfuBtnList"><span class="xuanfuIcon"></span><span>法院裁决</span></div></a>
          <a href="#patentInfo"><div class="xuanfuBtnList"><span class="xuanfuIcon"></span><span>专利信息</span></div></a>
          <div class="backTop"><span class="xuanfuBackTop"></span><span class="backTopTxt">回到顶部</span></div>
          <div class="addBtn"></div>
        </div>
      </div>
      <!--第二个tab(环境风险)-->
      <div class="second tab" style="display: none;">
        <div class="tableContent">
          <!--第一部分-->
          <div id="registInfoHuanjing" class="area area1">
            <div class="areaHead">
              <div class="shuxian fl"></div>
              <div class="areaHeadInfo fl">重点监管企业</div>
              <div class="areaHeadHengxian"></div>
              <div class="clear"></div>
            </div>
            <div class="table">
              <table width="1147" border="1" cellpadding="0" cellspacing="0" bordercolor="#b5b5b5">
                <tr bordercolor="#b9b9b9" bgcolor="#eeeeee" height="50" class="dengjiTitle">
                  <td width="45" bordercolor="#b9b9b9"><div align="center">序号</div></td>
                  <td width="75"><div align="center">序列</div></td>
                  <td width="110"><div align="center">行政区划代码</div></td>
                  <td width="110"><div align="center">法人代码</div></td>
                  <td width="315"><div align="center">设计企业</div></td>
                  <td width="90"><div align="center">监控类别</div></td>
                  <td width="80"><div align="center">所属省份</div></td>
                  <td width="90"><div align="center">所属年份</div></td>
                  <td width="170"><div align="center">创建时间</div></td>
                </tr>
                <c:forEach var="monitorCompanie" items="${igreen.monitorCompanies}" varStatus="status">
                  <tr height="50" class="qingjieContent">
                    <td><div align="center">${ status.index + 1}</div></td>
                    <td><div align="center">${monitorCompanie.monitorSequence}</div></td>
                    <td><div align="center">${monitorCompanie.regionCode}</div></td>
                    <td><div align="center">${monitorCompanie.legalPersonCode}</div></td>
                    <td><div align="center">${monitorCompanie.companyName}</div></td>
                    <td><div align="center">${monitorCompanie.monitorType}</div></td>
                    <td><div align="center">${monitorCompanie.province}</div></td>
                    <td><div align="center">${monitorCompanie.monitorYear}</div></td>
                    <td><div align="center">
                      <p>${monitorCompanie.createTm}</p>
                        <%--<p>CST 2017 </p>--%>
                    </div></td>
                  </tr>
                </c:forEach>
              </table>
            </div>
          </div>
        </div>
        <!--广告-->
        <div class="advert">
          <div class="advertL advertContent fl">
            <div class="advertTxtWrap">
              <div class="title">广告</div>
              <div class="advertIconWrap"><img src="../images/search/advertIcon.png" alt=""></div>
              <div class="advertTxt">
                这里可以放一句广告标语、一段话、公司最新活动。或者信息来源。
              </div>
            </div>
          </div>
          <div class="advertR advertContent fl" style="width: 500px;margin-left: 25px;">
            <div class="advertTxtWrap">
              <div class="title">广告</div>
              <div class="advertIconWrap"><img src="../images/search/advertIcon.png" alt=""></div>
              <div class="advertTxt">
                这里可以放一句广告标语、一段话、公司最新活动。或者信息来源。
              </div>
            </div>
          </div>
        </div>
        <!--悬浮按钮-->
        <div class="xuanfuBtnWrap">
          <a href="#registInfoHuanjing"><div class="xuanfuBtnList"><span class="xuanfuIcon"></span><span>重点监管企业</span></div></a>
          <div class="backTop"><span class="xuanfuBackTop"></span><span class="backTopTxt">回到顶部</span></div>
          <div class="addBtn"></div>
        </div>
      </div>
      <!--第三个tab(环境许可)-->
      <div class="third tab" style="display: none;">
        <div class="tableContent">
          <!--第一部分-->
          <div id="registInfoXunke" class="area area1">
            <div class="areaHead">
              <div class="shuxian fl"></div>
              <div class="areaHeadInfo fl">排污许可</div>
              <div class="areaHeadHengxian"></div>
              <div class="clear"></div>
            </div>
            <div class="table">
              <table width="942"  border="1" bordercolor="#b6b6b6" cellpadding="5" cellspacing="0">
                <tr height="50" class="qingjieTitle"  bgcolor="#eeeeee">
                  <td width="45" height="29"><div align="center">序号</div></td>
                  <td width="415"><div align="center">主要内容</div></td>
                  <td width="405"><div align="center">上报频次</div></td>
                  <td width="225"><div align="center">其他信息</div></td>
                </tr>
                <c:forEach var="execution" items="${igreen.executionRecords}" varStatus="status">
                  <tr height="150">
                    <td height="107" class="qingjieContent"><div align="center">${ status.index + 1}</div></td>
                    <td class="qingjieContent"><div align="center">${execution.content}</div></td>
                    <td class="qingjieContent"><p align="center">${execution.frequency}</p>    </td>
                    <td class="qingjieContent"><div align="center">${execution.otherInfo}</div></td>
                  </tr>
                </c:forEach>
              </table>
            </div>
          </div>
          <!--第二部分-->
          <div id="courtDecisionXunke" class="area area1">
            <div class="areaHead">
              <div class="shuxian fl"></div>
              <div class="areaHeadInfo fl">清洁生产企业</div>
              <div class="areaHeadHengxian"></div>
              <div class="clear"></div>
            </div>
            <div class="table">
              <table width="1100"  border="1" cellpadding="10" cellspacing="0" bordercolor="#aeaeae">
                <tr>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">企业名称</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.companyName}</td>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">行业</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.trade}</td>
                </tr>
                <tr>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">年份</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.year}</td>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">批次</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.batchNo}</td>
                </tr>
                <tr>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">城市</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.city}</td>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">编号</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.serialNumber}</td>
                </tr>
                <tr>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">主要产品及年产量</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.productSalesAmount}</td>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">所属地区</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.region}</td>
                </tr>
                <tr>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">地址</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.address}</td>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">公布时间</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.reportTime}</td>
                </tr>
                <tr>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">提交审核时间</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.submitCheckTime}</td>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">完成评估时间</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.completeEstimateTime}</td>
                </tr>
                <tr>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">完成验收时间</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.completeCheckTime}</td>
                  <td width="135" bgcolor="#eeeeee" class="dengjiTitle"><div align="center">审核机构名称</div></td>
                  <td width="410" class="qingjieContent" style="padding-left: 15px;">${igreen.cleanProductionCompany.checkOrganization}</td>
                </tr>
              </table>
            </div>
          </div>
          <!--第三部分-->
          <div id="patentInfoXunke" class="area area1">
            <div class="areaHead">
              <div class="shuxian fl"></div>
              <div class="areaHeadInfo fl">能效备案</div>
              <div class="areaHeadHengxian"></div>
              <div class="clear"></div>
            </div>
            <div class="table">
              <table width="1100"  border="1" cellpadding="0" cellspacing="0" bordercolor="#b6b6b6">
                <tr bgcolor="#eeeeee" height="50" class="dengjiTitle">
                  <td width="45" height="35"><div align="center">序号</div></td>
                  <td width="195"><div align="center">公告号</div></td>
                  <td width="195"><div align="center">备案单位</div></td>
                  <td width="210"><div align="center">公司类型</div></td>
                  <td width="145"><div align="center">状态</div></td>
                  <td width="295"><div align="center">备注</div></td>
                </tr>
                <c:forEach var="excelEnergyEfficiencyLabel" items="${igreen.excelEnergyEfficiencyLabels}" varStatus="status">
                  <tr class="qingjieContent" height="50">
                    <td><div align="center">${ status.index + 1}</div></td>
                    <td><div align="center">${excelEnergyEfficiencyLabel.noticeNo}</div></td>
                    <td><div align="center">${excelEnergyEfficiencyLabel.filingCompany}</div></td>
                    <td><div align="center">${excelEnergyEfficiencyLabel.companyType}</div></td>
                    <td><div align="center">${excelEnergyEfficiencyLabel.statas}</div></td>
                    <td><div align="center">${excelEnergyEfficiencyLabel.remark}</div></td>
                  </tr>
                </c:forEach>
              </table>
            </div>
          </div>
        </div>
        <!--广告-->
        <div class="advert">
          <div class="advertL advertContent fl">
            <div class="advertTxtWrap">
              <div class="title">广告</div>
              <div class="advertIconWrap"><img src="../images/search/advertIcon.png" alt=""></div>
              <div class="advertTxt">
                这里可以放一句广告标语、一段话、公司最新活动。或者信息来源。
              </div>
            </div>
          </div>
          <div class="advertR advertContent fl" style="width: 500px;margin-left: 25px;">
            <div class="advertTxtWrap">
              <div class="title">广告</div>
              <div class="advertIconWrap"><img src="../images/search/advertIcon.png" alt=""></div>
              <div class="advertTxt">
                这里可以放一句广告标语、一段话、公司最新活动。或者信息来源。
              </div>
            </div>
          </div>
        </div>
        <!--悬浮按钮-->
        <div class="xuanfuBtnWrap">
          <a href="#registInfoXunke"><div class="xuanfuBtnList"><span class="xuanfuIcon"></span><span>排污许可</span></div></a>
          <a href="#courtDecisionXunke"><div class="xuanfuBtnList"><span class="xuanfuIcon"></span><span>清洁生产企业</span></div></a>
          <a href="#patentInfoXunke"><div class="xuanfuBtnList"><span class="xuanfuIcon"></span><span>能效备案</span></div></a>
          <div class="backTop"><span class="xuanfuBackTop"></span><span class="backTopTxt">回到顶部</span></div>
          <div class="addBtn"></div>
        </div>
      </div>
      <!--第四个tab(风险预测)-->
      <div class="four tab" style="display: none;">
        <div class="tableContent">
          <!--第一部分-->
          <div id="registInfoYuce" class="area area1">
            <div class="areaHead">
              <div class="shuxian fl"></div>
              <div class="areaHeadInfo fl">风险预测</div>
              <div class="areaHeadHengxian"></div>
              <div class="clear"></div>
            </div>
            <div class="table">
              <table width="1058"  border="1" cellpadding="0" cellspacing="0" bordercolor="#b5b5b5">
                <tr bgcolor="#eeeeee" class="dengjiTitle">
                  <td width="135"><div align="center">季度</div></td>
                  <td width="56"><div align="center">罚款</div></td>
                  <td width="159"><div align="center">暂扣、吊销许可证</div></td>
                  <td width="151"><div align="center">没收违法所得</div></td>
                  <td width="101"><div align="center">行政拘留</div></td>
                  <td width="151"><div align="center">责令停产整顿</div></td>
                  <td width="262"><div align="center">责令、停产、停业、关闭</div></td>
                  <td width="72"><div align="center">总计</div></td>
                </tr>
                <c:forEach var="aiIpe" items="${igreen.aiIpeList}" varStatus="status">
                  <tr class="qingjieContent">
                    <td><div align="center"><c:if test="${aiIpe.season == 1}">
                      2019年第一季度
                    </c:if>
                      <c:if test="${aiIpe.season == 2}">
                        2019年第二季度
                      </c:if>
                      <c:if test="${aiIpe.season == 3}">
                        2019年第三季度
                      </c:if>
                      <c:if test="${aiIpe.season == 4}">
                        2019年第四季度
                      </c:if></div></td>
                    <td><div align="center"><fmt:formatNumber type="number" value="${aiIpe.fine }" pattern="0.00" maxFractionDigits="2"/>%</div></td>
                    <td><div align="center"><fmt:formatNumber type="number" value="${aiIpe.revoke }" pattern="0.00" maxFractionDigits="2"/>%</div></td>
                    <td><div align="center"><fmt:formatNumber type="number" value="${aiIpe.confiscate }" pattern="0.00" maxFractionDigits="2"/>%</div></td>
                    <td><div align="center"><fmt:formatNumber type="number" value="${aiIpe.detention }" pattern="0.00" maxFractionDigits="2"/>%</div></td>
                    <td><div align="center"><fmt:formatNumber type="number" value="${aiIpe.production }" pattern="0.00" maxFractionDigits="2"/>%</div></td>
                    <td><div align="center"><fmt:formatNumber type="number" value="${aiIpe.instruct }" pattern="0.00" maxFractionDigits="2"/>%</div></td>
                    <td><div align="center"><fmt:formatNumber type="number" value="${aiIpe.totalSum}" pattern="0.00" maxFractionDigits="2"/>%</div></td>
                  </tr>
                </c:forEach>
              </table>

            </div>
          </div>
        </div>
        <!--广告-->
        <div class="advert">
          <div class="advertL advertContent fl">
            <div class="advertTxtWrap">
              <div class="title">广告</div>
              <div class="advertIconWrap"><img src="../images/search/advertIcon.png" alt=""></div>
              <div class="advertTxt">
                这里可以放一句广告标语、一段话、公司最新活动。或者信息来源。
              </div>
            </div>
          </div>
          <div class="advertR advertContent fl" style="width: 500px;margin-left: 25px;">
            <div class="advertTxtWrap">
              <div class="title">广告</div>
              <div class="advertIconWrap"><img src="../images/search/advertIcon.png" alt=""></div>
              <div class="advertTxt">
                这里可以放一句广告标语、一段话、公司最新活动。或者信息来源。
              </div>
            </div>
          </div>
        </div>
        <!--悬浮按钮-->
        <div class="xuanfuBtnWrap">
          <a href="#registInfoYuce"><div class="xuanfuBtnList"><span class="xuanfuIcon"></span><span>风险预测</span></div></a>
          <div class="backTop"><span class="xuanfuBackTop"></span><span class="backTopTxt">回到顶部</span></div>
          <div class="addBtn"></div>
        </div>
      </div>
      <!--第五个tab(风险监控)-->
      <div class="five tab" style="display: none;">
        <!--<div class="tableContent">-->
        <!--&lt;!&ndash;第一部分&ndash;&gt;-->
        <!--<div id="registInfoJiankong" class="area area1">-->
        <!--<div class="areaHead">-->
        <!--<div class="shuxian fl"></div>-->
        <!--<div class="areaHeadInfo fl">登记信息</div>-->
        <!--<div class="areaHeadHengxian"></div>-->
        <!--<div class="clear"></div>-->
        <!--</div>-->
        <!--<div class="table">-->
        <!--<table width="861" height="386" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#bfbfbf">-->
        <!--<tr>-->
        <!--<td width="108" bordercolor="1" bgcolor="#eeeeee"> 公司名称</td>-->
        <!--<td width="325">海洋龙凤热点有限公司</td>-->
        <!--<td width="102" bordercolor="1" bgcolor="#eeeeee">省编码</td>-->
        <!--<td width="102">SD</td>-->
        <!--<td width="190" rowspan="2">&nbsp;</td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td bgcolor="#eeeeee">行业</td>-->
        <!--<td>电力、热力、燃气及水生产和供应业</td>-->
        <!--<td bordercolor="1" bgcolor="#eeeeee">行业编码</td>-->
        <!--<td>D</td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td bgcolor="#eeeeee">细分行业</td>-->
        <!--<td>电力、热力生产和供应业</td>-->
        <!--<td bordercolor="1" bgcolor="#eeeeee">细分行业编码</td>-->
        <!--<td>44</td>-->
        <!--<td rowspan="2">&nbsp;</td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td bgcolor="#eeeeee">注册编码</td>-->
        <!--<td>91370687748957371R</td>-->
        <!--<td bordercolor="1" bgcolor="#eeeeee">组织机构代码</td>-->
        <!--<td>74895737-1</td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td bgcolor="#eeeeee">经营形式</td>-->
        <!--<td colspan="3">有限责任公司(非自然人投资或控股的法人独资)</td>-->
        <!--<td rowspan="2">&nbsp;</td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td bgcolor="#eeeeee">注册地址</td>-->
        <!--<td colspan="3">&nbsp;</td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td bgcolor="#eeeeee">经营范围</td>-->
        <!--<td colspan="4">&nbsp;</td>-->
        <!--</tr>-->
        <!--</table>-->
        <!--</div>-->
        <!--</div>-->
        <!--&lt;!&ndash;第二部分&ndash;&gt;-->
        <!--<div id="courtDecisionJiankong" class="area area1">-->
        <!--<div class="areaHead">-->
        <!--<div class="shuxian fl"></div>-->
        <!--<div class="areaHeadInfo fl">法院判决</div>-->
        <!--<div class="areaHeadHengxian"></div>-->
        <!--<div class="clear"></div>-->
        <!--</div>-->
        <!--<div class="table">-->
        <!--<table width="1188" height="362" border="1" cellpadding="0" cellspacing="0" bordercolor="#b9b9b9">-->
        <!--<tr bgcolor="#eeeeee">-->
        <!--<td width="41" height="38"><div align="center">序号</div></td>-->
        <!--<td width="89"><div align="center">执行法院</div></td>-->
        <!--<td width="410"><div align="center">处罚名称</div></td>-->
        <!--<td width="158"><div align="center">处罚编号</div></td>-->
        <!--<td width="39"><div align="center">处罚类型</div></td>-->
        <!--<td width="77"><div align="center">提交时间</div></td>-->
        <!--<td width="80"><div align="center">是否为起诉人</div></td>-->
        <!--<td width="65"><div align="center">是否为被告</div></td>-->
        <!--<td width="65"><div align="center">更新时间</div></td>-->
        <!--<td width="65"><div align="center">年度</div></td>-->
        <!--<td width="75"><div align="center">角色</div></td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td><div align="center">1</div></td>-->
        <!--<td><div align="center">山东省烟台市中级人民法院</div></td>-->
        <!--<td>海阳龙凤热电有限公司、刁学堂与海阳龙凤热电有限公司、成武县中信劳务派遣有限公司劳务派遣合同纠纷、确认劳动关系纠纷二审民事判决书</td>-->
        <!--<td>（2016）鲁06民终3815号<br /></td>-->
        <!--<td><div align="center">MS</div></td>-->
        <!--<td>2016-12-16</td>-->
        <!--<td><div align="center">是</div></td>-->
        <!--<td><div align="center">否</div></td>-->
        <!--<td><div align="center">2016-10-08<br />-->
        <!--T00:00:00+08:00</div></td>-->
        <!--<td><div align="center">2003</div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--</tr>-->
        <!--</table>-->
        <!--</div>-->
        <!--</div>-->
        <!--&lt;!&ndash;第三部分&ndash;&gt;-->
        <!--<div id="patentInfoJiankong" class="area area1">-->
        <!--<div class="areaHead">-->
        <!--<div class="shuxian fl"></div>-->
        <!--<div class="areaHeadInfo fl">专利信息</div>-->
        <!--<div class="areaHeadHengxian"></div>-->
        <!--<div class="clear"></div>-->
        <!--</div>-->
        <!--<div class="table">-->
        <!--<table width="1130" height="362" border="1" cellpadding="5" cellspacing="0" bordercolor="#b9b9b9">-->
        <!--<tr bgcolor="#eeeeee">-->
        <!--<td width="29" height="38"><div align="center">序号</div></td>-->
        <!--<td width="26"><div align="center">专利类别</div></td>-->
        <!--<td width="28"><div align="center">种类CODE</div></td>-->
        <!--<td width="112"><div align="center">申请编号</div></td>-->
        <!--<td width="72"><div align="center">申请时间</div></td>-->
        <!--<td width="84"><div align="center">发布编号</div></td>-->
        <!--<td width="70"><div align="center">发布时间</div></td>-->
        <!--<td width="62"><div align="center">法定状态和描述</div></td>-->
        <!--<td width="117"><div align="center">标题</div></td>-->
        <!--<td width="71"><div align="center">代理机构</div></td>-->
        <!--<td width="59"><div align="center">种类描述</div></td>-->
        <!--<td width="96"><div align="center">专利种类描述</div></td>-->
        <!--<td width="70"><div align="center">发明人</div></td>-->
        <!--<td width="64"><div align="center">代理人</div></td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td><div align="center">1</div></td>-->
        <!--<td><div align="center">B01</div></td>-->
        <!--<td><div align="center">U</div></td>-->
        <!--<td><div align="center">CN201220059346.5</div></td>-->
        <!--<td><div align="center">2012-02-22</div></td>-->
        <!--<td><div align="center">CN202538410U</div></td>-->
        <!--<td><div align="center">2012-11-21</div></td>-->
        <!--<td><div align="center">6-专利权的终止 </div></td>-->
        <!--<td><div align="center">一种以热电厂燃烧后的工业废物为原料的轻质陶粒及其制备方法</div></td>-->
        <!--<td><div align="center">北京双收知识产权代理有限公司 11241 </div></td>-->
        <!--<td><div align="center">实用新型</div></td>-->
        <!--<td><div align="center">一般的物理或化学的方法或装置L</div></td>-->
        <!--<td><div align="center">张宇;张德成;刘福田;阮方;张明玖;盖祥云;陈铭</div></td>-->
        <!--<td><div align="center">海阳龙凤热电有限公司</div></td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--<td><div align="center"></div></td>-->
        <!--</tr>-->
        <!--</table>-->
        <!--</div>-->
        <!--</div>-->
        <!--</div>-->
        <!--&lt;!&ndash;广告&ndash;&gt;-->
        <!--<div class="advert">-->
        <!--<div class="advertL advertContent fl">-->
        <!--<div class="advertTxtWrap">-->
        <!--<div class="title">广告</div>-->
        <!--<div class="advertIconWrap"><img src="../images/search/advertIcon.png" alt=""></div>-->
        <!--<div class="advertTxt">-->
        <!--这里可以放一句广告标语、一段话、公司最新活动。或者信息来源。-->
        <!--</div>-->
        <!--</div>-->
        <!--</div>-->
        <!--<div class="advertR advertContent fl" style="width: 500px;margin-left: 25px;">-->
        <!--<div class="advertTxtWrap">-->
        <!--<div class="title">广告</div>-->
        <!--<div class="advertIconWrap"><img src="../images/search/advertIcon.png" alt=""></div>-->
        <!--<div class="advertTxt">-->
        <!--这里可以放一句广告标语、一段话、公司最新活动。或者信息来源。-->
        <!--</div>-->
        <!--</div>-->
        <!--</div>-->
        <!--</div>-->
        <!--&lt;!&ndash;悬浮按钮&ndash;&gt;-->
        <!--<div class="xuanfuBtnWrap">-->
        <!--<a href="#registInfo"><div class="xuanfuBtnList"><span class="xuanfuIcon"></span><span>登记信息</span></div></a>-->
        <!--<a href="#courtDecision"><div class="xuanfuBtnList"><span class="xuanfuIcon"></span><span>法院裁决</span></div></a>-->
        <!--<a href="#patentInfo"><div class="xuanfuBtnList"><span class="xuanfuIcon"></span><span>专利信息</span></div></a>-->
        <!--<div class="backTop"><span class="xuanfuBackTop"></span><span class="backTopTxt">回到顶部</span></div>-->
        <!--<div class="addBtn"></div>-->
        <!--</div>-->
      </div>
    </div>
  </div>
</div>
<div class="footer">
  <div class="mainBox clearfix">
    <dl class="left-links">
      <dt>公司概况</dt>
      <dd>
        <a href="#">关于我们</a>
      </dd>
      <dd>
        <a href="#">媒体报道</a>
      </dd>
      <dd>
        <a href="#">公司动态</a>
      </dd>
      <dd>
        <a href="#">联系我们</a>
      </dd>
    </dl>
    <i class="line"></i>
    <dl>
      <dt>新手帮助</dt>
      <dd>
        <a href="#">新手指引</a>
      </dd>
      <dd>
        <a href="#">产品介绍</a>
      </dd>
    </dl>
    <i class="line"></i>
    <dl>
      <dt>平台安全</dt>
      <dd>
        <a href="#">安全保障</a>
      </dd>
      <dd>
        <a href="#">隐私保护</a>
      </dd>
      <dd>
        <a href="#">政策法规</a>
      </dd>
    </dl>
    <i class="line"></i>
    <dl>
      <dt>联系我们</dt>
      <dd>
        <a href="#">联系邮箱</a>
      </dd>
      <dd>
        <a href="#">客服电话</a>
      </dd>
      <dd>
        <a href="#">工作时间</a>
      </dd>
    </dl>
    <i class="line"></i>
    <dl class="right-links">
      <dt>关注我们</dt>
      <dd>
        <a href="#">关注微信</a>
      </dd>
      <dd>
        <a href="#">关注微博</a>
      </dd>
    </dl>
  </div>
  <div class="copyright">集团公司 版权所有&nbsp;Copyright © 2017-2020 &nbsp;</div>
  <div class="copyright">京ICP备17045942号 &nbsp;</div>
</div>
</body>
<script>


  // var btn = document.getElementsByClassName('backTop');
  var btn = document.getElementById('backTop');
  var clientHeight = document.documentElement.clientHeight;  //获取可视区域的高度
  var timer = null;   //定义一个定时器
  var isTop = true;   //定义一个布尔值，用于判断是否到达顶部
  // function backTop(){
  //
  //     timer = setInterval( function(){
  //
  //         //获取滚动条的滚动高度
  //         var scrollTop = document.documentElement.scrollTop || document.body.scrollTop;
  //
  //         //用于设置速度差，产生缓动的效果
  //         var speed = Math.floor(-scrollTop / 6);
  //         document.documentElement.scrollTop = document.body.scrollTop = scrollTop + speed;
  //         isTop =true;  //用于阻止滚动事件清除定时器
  //
  //         if(scrollTop == 0){
  //             clearInterval(timer);
  //         }
  //
  //     },10 );
  // }
  $('.searchHead li').hover(function(){
    $(this).addClass('hoverGreen').siblings('').removeClass('hoverGreen');
  })

  $('.searchBtn').click(function(){
    var companyName = $("#companyName").val();
    if(companyName == null || companyName == ''){
      alert("请输入要查询的内容！");
      return;
    }
    $("#searchForm").submit();
  });
</script>
</html>