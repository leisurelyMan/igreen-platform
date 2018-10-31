<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="keywords" content="">
  <meta name="description" content="">
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta name="viewport" content="width=device-width,minimum-scale=1,maximum-scale=1,user-scalable=no,initial-scale=1">
  <script src="/js/libs/flexible-loader.js" type="text/javascript"></script>
  <script src="/js/libs/jquery-1.9.1.min.js"></script>
  <!-- <script src="/js/libs/vue.min.js"></script>
  <script src="/js/libs/vue-i18n.min.js"></script> -->
  <!--[if lt IE 9]>
  <script src="/js/libs/html5shiv.min.js"></script>
  <script src="/js/libs/respond.min.js"></script>
  <![endif]-->
  <link rel="shortcut icon" href="/favicon.ico">
  <link href="/css/index.css" rel="stylesheet">
  <link rel="stylesheet" type="text/css" href="/css/main.css">
</head>
<style>

  table tbody {
    display:block;
    height:195px;
    overflow-y:scroll;
  }

  table thead, tbody tr {
    display:table;
    width:100%;
    table-layout:fixed;

  }

  li a {
    color: #000;
  }
  a {
    color: #3c3c3c;
    text-decoration: none;
  }
  a:-webkit-any-link {
    color: -webkit-link;
    cursor: pointer;
  }
  /*滚动条样式*/
  table tbody::-webkit-scrollbar {/*滚动条整体样式*/
    width: 4px;     /*高宽分别对应横竖滚动条的尺寸*/
    height: 3px;
  }
  table tbody::-webkit-scrollbar-thumb {/*滚动条里面小方块*/
    border-radius: 5px;
    -webkit-box-shadow: inset 0 0 5px rgba(0,0,0,0.2);
    background: rgba(0,0,0,0.2);
  }
  table tbody::-webkit-scrollbar-track {/*滚动条里面轨道*/
    -webkit-box-shadow: inset 0 0 5px rgba(0,0,0,0.2);
    border-radius: 0;
    background: rgba(0,0,0,0.1);
  }
</style>
</head>
<body>
<div id="app-content">
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
  <div class="wrapper">
    <div class="page-title">EnRobot 监控</div>
    <div class="page-content">
      <!-- 摘要表格:begin -->
      <div class="block block-table">
        <div class="block-tit">
          <span>监控名单</span>
        </div>
        <div class="block-cnt">
          <table>
            <thead>
            <tr>
              <th class="tl" style="width:5%">编号</th>
              <th class="tl" style="width:20%">企业名称</th>
              <th class="tl" style="width:10%">组织机构代码</th>
              <th class="tl" style="width:5%">省市</th>
              <th class="tl" style="width:10%">行业</th>
              <th class="tl" style="width:10%">诉讼（件）</th>
              <th class="tl" style="width:10%">专利（件）</th>
              <th style="width:10%">重点监管<br>企业数</th>
              <th style="width:10%">排污<br>许可数</th>
              <th style="width:10%">环境<br>违规数</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${monitorCompanys}" varStatus="status">
              <tr>
                <td style="width:5%">${ status.index + 1}</td>
                <td style="width:20%"><c:out value="${item.companyName}"/></td>
                <td style="width:10%"><c:out value="${item.orgNo}"/></td>
                <td style="width:5%"><c:out value="${item.province}"/></td>
                <td style="width:10%"><c:out value="${item.industryName}"/></td>
                <td class="tc" style="width:10%"><c:out value="${item.judgementsCount}"/></td>
                <td class="tc" style="width:10%"><c:out value="${item.patentCount}"/></td>
                <td class="tc" style="width:10%"><c:out value="${item.monitorCompaniesCount}"/></td>
                <td class="tc" style="width:10%"><c:out value="${item.executionRecordsCount}"/></td>
                <td class="tc" style="width:9.9%"><c:out value="${item.administrativePenaltyCount}"/></td>
              </tr>
            </c:forEach>
            </tbody>
          </table>
        </div>
      </div>
      <!-- 摘要表格:end -->
      <div class="clearfix row">
        <div class="block block-shareholder">
          <div class="block-tit">
            <span>行业分布</span>
          </div>
          <div class="block-cnt">
            <div id="shareholderChart" style="width: 557px;height:190px;"></div>
            <div class="num"></div>
          </div>
          <!--<div class="note">文字描述文字描述文字3000描述文字描述。</div>-->
        </div>
        <div class="block block-region">
          <div class="block-tit">
            <span>地域分布</span>
          </div>
          <div class="block-cnt">
            <div id="regionChart" style="width: 382px;height:190px;"></div>
          </div>
          <!--<div class="note">文字描述文字描述文字3000描述文字描述。</div>-->
        </div>
      </div>
      <!-- <div class="row">
          <div class="block block-risk">
              <div class="block-tit">
                  <ul class="fr">
                      <li>年度总处罚： 1.78</li>
                      <li>已处理： 222件</li>
                      <li>待处理： 222件</li>
                  </ul>
                  <span>环境风险预测</span>
              </div>
              <div class="block-cnt clearfix">
                  <div class="level">
                      <div class="lever-chart-wrap">
                          <div id="levelChart1" style="width: 189px;height:100px;"></div>
                      </div>
                      <div class="level-text level-text-1"><span>处罚类型1</span></div>
                  </div>
                  <div class="level">
                      <div class="lever-chart-wrap">
                          <div id="levelChart2" style="width: 189px;height:100px;"></div>
                      </div>
                      <div class="level-text level-text-2"><span>处罚类型2</span></div>
                  </div>
                  <div class="level">
                      <div class="lever-chart-wrap">
                          <div id="levelChart3" style="width: 189px;height:100px;"></div>
                      </div>
                      <div class="level-text level-text-3"><span>处罚类型3</span></div>
                  </div>
                  <div class="level">
                      <div class="lever-chart-wrap">
                          <div id="levelChart4" style="width: 189px;height:100px;"></div>
                      </div>
                      <div class="level-text level-text-4"><span>处罚类型4</span></div>
                  </div>
                  <div class="level">
                      <div class="lever-chart-wrap">
                          <div id="levelChart5" style="width: 189px;height:100px;"></div>
                      </div>
                      <div class="level-text level-text-5"><span>处罚类型5</span></div>
                  </div>
              </div>
          </div>
      </div> -->
      <div class="row clearfix">
        <div class="block block-trends fl">
          <div class="block-tit">
            <span>2019年违约风险预测</span>
          </div>
          <div class="block-cnt">
            <div class="legend clearfix">
              <!--<ul id="tab-switch">
                <li class="cur">近三月</li>
                <li>近六月</li>
                <li>近一年</li>
              </ul>-->
              <span>预测单位</span>
              <span class="type type-1">暂扣、吊销许可证</span>
              <span class="type type-2">没收违法所得</span>
              <span class="type type-3">行政拘留</span>
              <span class="type type-4">责令停产整顿</span>
              <span class="type type-5">责令停产、停业、关闭</span>
            </div>
            <div id="trendsChart" style="width: 500px;height:295px;"></div>
          </div>
        </div>
        <div class="block block-risk-right fr">
          <div class="block-tit">
            <span>各类处罚统计</span>
          </div>
          <div class="block-cnt">
            <div id="levelChartRight" style="width: 382px;height:376px;"></div>
          </div>
        </div>
      </div>
    </div>
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
</div>
<script src="/js/libs/lodash.min.js"></script>
<script src="/js/libs/echarts.min.js"></script>
<script>
    var industryJson = new Array();
    <c:forEach var="item" items="${industryReports}" varStatus="status">
    var obj = new Object();
    obj.name = '${item.name}';
    obj.value = '${item.nameValue}';
    industryJson.push(obj);
    </c:forEach>
    var provinceJson = new Array();
    var provinceArr = new Array();
    <c:forEach var="item" items="${provinceReports}" varStatus="status">
    var obj = new Object();
    obj.name = '${item.name}';
    obj.value = '${item.nameValue}';
    provinceArr.push('${item.name}');
    provinceJson.push(obj);
    </c:forEach>

    (function () {
        var shareholderChart = echarts.init(document.getElementById('shareholderChart'));
        shareholderChart.setOption({
            grid: {
                left: '0',
                right: '0%',
                top:'0%',
                bottom:'0%',
                containLabel: true
            },
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b}: {d}% ({c}家)"
            },
            color:['#5481a0','#749fb7', '#6998a8', '#656d7a', '#bdbec0', '#e7e7e7', '#89afad', '#a1c4c3', '#b6d3d2'],
            series: [
                {
                    name:'注册资本分布',
                    type:'pie',
                    radius: ['35%', '55%'],
                    label: {
                        normal: {
                            formatter: '{name|{b}}\n{per|·}',
                            rich: {
                                per: {
                                    fontSize:100,
                                    border:0,
                                    padding:[10,-20,0,-20],
                                    lineHeight:30
                                }
                            }
                        }
                    },
                    labelLine:{
                        length2:100
                    },
                    data:industryJson
                }
            ]
        });

        var regionChart = echarts.init(document.getElementById('regionChart'));
        regionChart.setOption({
            grid: {
                left: '0',
                right: '0%',
                top:'0%',
                bottom:'0%',
                containLabel: true
            },
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b}: {d}% ({c}家)"
            },
            color:['#476ca8','#5ac2ae', '#c7da3e'],
            legend: {
                orient: 'vertical',
                align:'left',
                x: 'right',
                padding:[0, 20, 0, 0],
                data:provinceArr,
                itemWidth:12,
                itemHeight:12,
            },
            series: [
                {
                    name:'地域分布',
                    type:'pie',
                    radius: ['35%', '55%'],
                    label: {
                        normal: {
                            formatter: '{per|{c}}',
                            rich: {
                                per: {
                                    fontSize:12,
                                    border:0,
                                    lineHeight:30,
                                    borderRadius:100,
                                    width:25,
                                    height:25,
                                    backgroundColor:'#eee',
                                    // color:'#fff',
                                    fontWeight:'bold',
                                    padding:0,
                                    align:'center'
                                }
                            }
                        }
                    },
                    labelLine:{
                        // length:15,
                        // length2:0
                        smooth: true
                    },
                    data: provinceJson
                }
            ]
        });

        var levelChartOptionRight = {
            grid: {
                left: '28%',
                right: '28%',
                top:'15%',
                bottom:'5%',
                containLabel: false
            },
            tooltip: {
                trigger: 'item',
                formatter: "{b}: {d}%"
            },
            xAxis: {
                show: false,
                type: 'category',
            },
            yAxis: {
                show: false,
                type: 'value'
            },
            color:['#c65a24','#ef9162','#f4c24a','#aa7560','#d6a994'],
            series: [{
                data: [<c:forEach var="item" items="${foreCasts}" varStatus="status">
                    <c:set value="0" var="sum" />
                    <c:forEach var="dataNum" items="${item.data}" varStatus="status"><c:set value="${sum + dataNum}" var="sum" /></c:forEach>
                    <c:set value="${fn:indexOf(item.name, '、')}" var="dataIndex"/>
                    <c:set value="${fn:length(item.name)}" var="dataLenth"/>
                    {
                        name : <c:if test="${fn:contains(item.name, '、')}">'${fn:substring(item.name, 0, dataIndex)}\n${fn:substring(item.name, dataIndex+1, dataLenth)}' </c:if> <c:if test="${!fn:contains(item.name, '、')}">'${item.name}'</c:if>,
                        value: ${sum},
                    }
                    <c:if test="${!status.last}">,</c:if>
                    </c:forEach>],
                type: 'pie',
                radius: ['35%', '50%']
            }]
        }
        var levelChartRight = echarts.init(document.getElementById('levelChartRight'));
        levelChartRight.setOption(levelChartOptionRight)

        function renderTrendsFunc(){
            var trendsChart = echarts.init(document.getElementById('trendsChart'));
            //var _axisX = ['1.1', '1.2', '1.3', '2.1', '2.3', '3.30', '4.1', '4.2', '4.3', '4.20', '5.1', '6.1', '7.1', '8.1', '9.1', '10.1', '11.1', '12.1']
            var _axisX = ['一季度', '二季度', '三季度', '四季度'];
            trendsChart.setOption({
                grid: {
                    left: '0',
                    right: '20',
                    top:'3%',
                    bottom:'3%',
                    containLabel: true
                },
                tooltip : {
                    trigger: 'axis'
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    axisTick:{
                        show:false
                    },
                    axisLabel:{
                        interval: function(i, value){
                            if(i > 0){
                                if(_axisX[i].split('.')[0] != _axisX[i-1].split('.')[0]){
                                    return true
                                }
                            }else{
                                return true
                            }
                        },
                        formatter: function(params){
                            var month = params.split('.')[0]
                            return month
                        }
                    },
                    data: _axisX
                },
                yAxis: {
                    type: 'value',
                    axisLine:{
                        show: false
                    },
                    axisTick:{
                        show:false
                    },
                    splitLine:{
                        lineStyle:{
                            type:'dashed'
                        }
                    },
                    axisLabel: {
                        //设置y轴数值为%
                        formatter: '{value} %'
                    }
                },
                series: [<c:forEach var="item" items="${foreCasts}" varStatus="status">
                    {
                        name : '${item.name}',
                        data: JSON.parse('${item.data}'),
                        type: 'line',
                        symbolSize:10,
                        lineStyle:{
                            width:1,
                            color:'${item.style}'
                        },
                        itemStyle:{
                            color:'${item.style}'
                        }
                    }
                    <c:if test="${!status.last}">,</c:if>
                    </c:forEach>]
            });
        }
        renderTrendsFunc()


        $('#tab-switch > li').click(function(){
            $(this).addClass('cur').siblings().removeClass('cur');
            renderTrendsFunc();
        })
    })();
</script>
<script type="text/javascript" src="/js/vendors.20180913.js"></script>
<script type="text/javascript" src="/js/index.20180913.js"></script>
</body>
</html>