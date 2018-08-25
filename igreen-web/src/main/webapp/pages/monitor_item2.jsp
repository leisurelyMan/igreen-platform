<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<body style="background:#f9f9f9;">
<!--页中begin-->
<div class="mainBox home-main" style="margin-top: 30px;">
  <c:if test="${deleId=='register' || deleId==''}">
  <div class="home-inner" id="con_${deleId}_1" style="display:block;padding: 10px 0 50px;">
    <div class="data-box">
      <div class="data-tit no-top"><i></i><h3 style="margin-top: 0px;">登记信息</h3></div>
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
        </table>
      </div>
    </div>
    <div class="data-box">
      <div class="data-tit"><i></i><h3 style="margin-top: 0px;">法院判决</h3></div>
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
      <div class="data-tit"><i></i><h3 style="margin-top: 0px;">专利信息</h3></div>
      <div class="data-tab tab-2">
        <table width="100%" cellpadding="0" cellspacing="0">
          <tr>
            <th>序号</th>
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
  </c:if>
  <c:if test="${deleId=='business' || deleId==''}">
  <div class="home-inner" id="con_${deleId}_2" style="height: 890px; display:block;padding: 10px 0 50px;">
    <div class="data-box">
      <div class="data-tit no-top"><i></i><h3 style="margin-top: 0px;">重点监管企业</h3></div>
      <div class="data-tab tab-2">
        <table width="100%" cellpadding="0" cellspacing="0">
          <tr>
            <th>序号</th>
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

  </div>
  </c:if>
  <c:if test="${deleId=='environment' || deleId==''}">
  <div class="home-inner" id="con_${deleId}_3" style="height:910px; display:block;padding: 10px 0 50px;">
    <div class="data-box">
      <div class="data-tit no-top"><i></i><h3 style="margin-top: 0px;">排污许可</h3></div>
      <div class="data-tab tab-2">
        <table width="1500" cellpadding="0" cellspacing="0">
          <tr>
            <th width="66">序号</th>
            <th width="200">主要内容</th>
            <th width="100">上报频次</th>
            <th>其他信息</th>
          </tr>
          <c:forEach var="execution" items="${igreen.executionRecords}" varStatus="status">
            <tr>
              <td>${ status.index + 1}</td>
              <td><c:out value="${execution.content}"/></td>
              <td><c:out value="${execution.frequency}"/></td>
              <td><c:out value="${execution.otherInfo}"/></td>
            </tr>
          </c:forEach>
        </table>
      </div>
    </div>
    <div class="data-box">
      <div class="data-tit"><i></i><h3 style="margin-top: 0px;">清洁生产企业</h3></div>
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
      <div class="data-tit"><i></i><h3 style="margin-top: 0px;">能效备案</h3></div>
      <div class="data-tab tab-2">
        <table width="100%" cellpadding="0" cellspacing="0">
          <tr>
            <th width="8%">序号</th>
            <th width="12% ">公告号</th>
            <th width="12%">备案单位</th>
            <th width="12%">公司类型</th>
            <th width="12%">状态</th>
            <th>备注</th>
          </tr>
          <c:forEach var="excelEnergyEfficiencyLabel" items="${igreen.excelEnergyEfficiencyLabels}" varStatus="status">
            <tr>
              <td>${ status.index + 1}</td>
              <td><c:out value="${excelEnergyEfficiencyLabel.noticeNo}"/></td>
              <td><c:out value="${excelEnergyEfficiencyLabel.filingCompany}"/></td>
              <td><c:out value="${excelEnergyEfficiencyLabel.companyType}"/></td>
              <td><c:out value="${excelEnergyEfficiencyLabel.statas}"/></td>
              <td><c:out value="${excelEnergyEfficiencyLabel.remark}"/></td>
            </tr>
          </c:forEach>
        </table>
      </div>
    </div>
  </div>
  </c:if>
  <c:if test="${deleId=='ipe' || deleId==''}">
  <div class="home-inner" id="con_${deleId}_4" style="height:910px; display:block;padding: 10px 0 50px;">
    <div class="data-box">
      <div class="data-tit"><i></i><h3 style="margin-top: 0px;">风险预测</h3></div>
      <div class="data-tab tab-2">
        <table width="100%" cellpadding="0" cellspacing="0">
          <tr>
            <th width="8%">季度</th>
            <th width="12% ">罚款</th>
            <th width="12%">暂扣、吊销许可证</th>
            <th width="12%">没收违法所得</th>
            <th width="12%">行政拘留</th>
            <th width="12%">责令停产整顿</th>
            <th width="12%">责令停产、停业、关闭</th>
            <th width="12%">总计</th>
          </tr>
          <c:forEach var="aiIpe" items="${igreen.aiIpeList}" varStatus="status">
            <tr>
              <td>
                <c:if test="${aiIpe.season == 1}">
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
                </c:if></td>
              <td><fmt:formatNumber type="number" value="${aiIpe.fine }" pattern="0.00" maxFractionDigits="2"/>%</td>
              <td><fmt:formatNumber type="number" value="${aiIpe.revoke }" pattern="0.00" maxFractionDigits="2"/>%</td>
              <td><fmt:formatNumber type="number" value="${aiIpe.confiscate }" pattern="0.00" maxFractionDigits="2"/>%</td>
              <td><fmt:formatNumber type="number" value="${aiIpe.detention }" pattern="0.00" maxFractionDigits="2"/>%</td>
              <td><fmt:formatNumber type="number" value="${aiIpe.production }" pattern="0.00" maxFractionDigits="2"/>%</td>
              <td><fmt:formatNumber type="number" value="${aiIpe.instruct }" pattern="0.00" maxFractionDigits="2"/>%</td>
              <td><fmt:formatNumber type="number" value="${aiIpe.totalSum}" pattern="0.00" maxFractionDigits="2"/>%</td>

            </tr>
          </c:forEach>
        </table>
      </div>
    </div>
  </div>
  </c:if>
</div>
<!--页中end-->
</body>
</html>