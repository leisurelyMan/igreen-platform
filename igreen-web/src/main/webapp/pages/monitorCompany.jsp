<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>Enrobot监控</title>
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
  <link rel="shortcut icon" href="/favicon.ico"></head>
</head>
<body>
<div id="app-content">
  <div class="site-header">
    <div class="wrapper">
      <ul class="site-nav">
        <li><a href="/pages/index.html">主页</a></li>
        <li><a href="/pages/index.html#link3">公司大事件 </a></li>
        <li><a href="/pages/index.html#link2">业务模块</a></li>
        <li><a href="/pages/index.html#link1">公司简介</a></li>
        <li><a href="/pages/search.html">企业征信</a></li>
        <li><a>联系我们</a></li>
      </ul>
    </div>
  </div>
  <div class="wrapper">
    <div class="page-title">Enrobot 监控</div>
    <div class="page-content">
      <!-- 摘要表格:begin -->
      <div class="block block-table">
        <div class="block-tit">
          <span>摘要表格</span>
        </div>
        <div class="block-cnt">
          <table>
            <thead>
            <tr>
              <th class="tl" style="width:5%">编号</th>
              <th class="tl" style="width:20%">企业名称</th>
              <th class="tl" style="width:12%">组织机构代码</th>
              <th class="tl" style="width:15%">省市</th>
              <th class="tl">行业</th>
              <th class="tl">诉讼（件）</th>
              <th class="tl">专利（件）</th>
              <th style="width:10%">重点监管<br>企业数</th>
              <th style="width:10%">排污<br>许可数</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${monitorCompanys}" varStatus="status">
              <tr>
                <td>${ status.index + 1}</td>
                <td><c:out value="${item.companyName}"/></td>
                <td><c:out value="${item.orgNo}"/></td>
                <td><c:out value="${item.province}"/></td>
                <td><c:out value="${item.industryName}"/></td>
                <td><c:out value="${item.judgementsCount}"/></td>
                <td><c:out value="${item.patentCount}"/></td>
                <td class="tc"><c:out value="${item.monitorCompaniesCount}"/></td>
                <td class="tc"><c:out value="${item.executionRecordsCount}"/></td>
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
            <span>注册资本分布</span>
          </div>
          <div class="block-cnt">
            <div id="shareholderChart" style="width: 557px;height:190px;"></div>
            <div class="num"></div>
          </div>
          <div class="note"></div>
        </div>
        <div class="block block-region">
          <div class="block-tit">
            <span>地域分布</span>
          </div>
          <div class="block-cnt">
            <div id="regionChart" style="width: 382px;height:190px;"></div>
          </div>
          <div class="note"></div>
        </div>
      </div>
      <div class="row">
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
              <div class="level-text level-text-1"><span>暂扣、吊销许可证</span></div>
            </div>
            <div class="level">
              <div class="lever-chart-wrap">
                <div id="levelChart2" style="width: 189px;height:100px;"></div>
              </div>
              <div class="level-text level-text-2"><span>没收违法所得</span></div>
            </div>
            <div class="level">
              <div class="lever-chart-wrap">
                <div id="levelChart3" style="width: 189px;height:100px;"></div>
              </div>
              <div class="level-text level-text-3"><span>行政拘留</span></div>
            </div>
            <div class="level">
              <div class="lever-chart-wrap">
                <div id="levelChart4" style="width: 189px;height:100px;"></div>
              </div>
              <div class="level-text level-text-4"><span>责令停产整顿</span></div>
            </div>
            <div class="level">
              <div class="lever-chart-wrap">
                <div id="levelChart5" style="width: 189px;height:100px;"></div>
              </div>
              <div class="level-text level-text-5"><span>责令停产、停业、关闭</span></div>
            </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="block block-trends">
          <div class="block-tit">
            <span>未来一年的平均预测结果</span>
          </div>
          <div class="block-cnt">
            <div class="legend clearfix">
              <ul id="tab-switch">
                <li class="cur">近三月</li>
                <li>近六月</li>
                <li>近一年</li>
              </ul>
              <span>预测单位</span>
              <span class="type type-1">暂扣、吊销许可证</span>
              <span class="type type-2">没收违法所得</span>
              <span class="type type-3">行政拘留</span>
              <span class="type type-4">责令停产整顿</span>
              <span class="type type-5">责令停产、停业、关闭</span>
            </div>
            <div id="trendsChart" style="width: 945px;height:295px;"></div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="site-footer">
    <div class="wrapper">
      <div class="column">
        <div>公司概况</div>
        <p><a href="">关于我们</a></p>
        <p><a href="">媒体报道</a></p>
        <p><a href="">公司动态</a></p>
      </div>
      <div class="column">
        <div>新手帮助</div>
        <p><a href="">新手指引</a></p>
        <p><a href="">产品介绍</a></p>
        <p><a href="">用户协议</a></p>
        <p><a href="">意见反馈</a></p>
      </div>
      <div class="column">
        <div>平台安全</div>
        <p><a href="">安全保障</a></p>
        <p><a href="">隐私保护</a></p>
        <p><a href="">政策法规</a></p>
        <p><a href="">免责声明</a></p>
      </div>
      <div class="column">
        <div>联系我们</div>
        <p>客服电话：(010)-58760933</p>
        <p>工作时间：周一至周五 9 : 00-18 : 30</p>
        <p>商务合作：<a href="mailto:zskj123456@163.com">zskj123456@163.com</a></p>
        <p>官方微信：<a class="link">igreenbank</a></p>
      </div>
    </div>
    <div class="copy">集团公司 版权所有 Copyright © 1988-2015  All Right Reserved 京ICP备10207363-1号</div>
  </div>
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
                formatter: "{a} <br/>{b}: {c} ({d})"
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
                    /*data: _.times(5, i => {
                        return {value: _.random(0, 100, false), name:'行业'+i}
                    })*/
                    data : industryJson
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
                formatter: "{a} <br/>{b}: {c} ({d})"
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

        var levelChartOption = {
            grid: {
                left: '28%',
                right: '28%',
                top:'15%',
                bottom:'5%',
                containLabel: false
            },
            xAxis: {
                show: false,
                type: 'category',
            },
            yAxis: {
                show: false,
                type: 'value'
            },
            series: [{
                data: _.times(5, i => {
                    return {
                        value: _.random(0, 100, false),
                        itemStyle:{
                            borderColor: '#7ecef4',
                            color: '#edf7f9'
                        }
                    }
                }),
        type: 'bar',
            barWidth: 11,
    }]
    }
        var levelChart1 = echarts.init(document.getElementById('levelChart1'));
        levelChart1.setOption(levelChartOption)
        var levelChart2 = echarts.init(document.getElementById('levelChart2'));
        levelChart2.setOption(levelChartOption)
        var levelChart3 = echarts.init(document.getElementById('levelChart3'));
        levelChart3.setOption(levelChartOption)
        var levelChart4 = echarts.init(document.getElementById('levelChart4'));
        levelChart4.setOption(levelChartOption)
        var levelChart5 = echarts.init(document.getElementById('levelChart5'));
        levelChart5.setOption(levelChartOption)

        function renderTrendsFunc(){
            var trendsChart = echarts.init(document.getElementById('trendsChart'));
            //var _axisX = ['1.1', '1.2', '1.3', '2.1', '2.3', '3.30', '4.1', '4.2', '4.3', '4.20', '5.1', '6.1', '7.1', '8.1', '9.1', '10.1', '11.1', '12.1']
            var _axisX = ['一季度', '二季度', '三季度', '四季度'];
            trendsChart.setOption({
                grid: {
                    left: '0',
                    right: '0%',
                    top:'3%',
                    bottom:'3%',
                    containLabel: true
                },
                tooltip : {
                    trigger: 'axis',
                    backgroundColor: '#4c4c4c',
                    padding:0,
                    formatter: function(params){
                        var nameArray = params[0].name.split('.')
                        //var date = nameArray[0] + '月' + nameArray[1] + '日';
                        var date = nameArray[0];
                        return '<div style="height:40px;">'+
                            '<div style="float:right;background:#4cbf93;height:40px;width:64px;">' +
                            '</div>' +
                            '<div style="float:left;padding:5px;width:85px;height:30px;font-size:12px;line-height:16px;">' +
                            '<div>'+date+'</div>' +
                            '<div>'+params[0].value+' 单位</div>' +
                            '</div>' +
                            '</div>'
                    },
                    extraCssText: 'border-radius:0;'
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
                    }
                },
                series: [
                    <c:forEach var="item" items="${foreCasts}" varStatus="status">
                    {
                        name : '${item.name}',
                        data: JSON.parse('${item.data}'),
                        type: 'line',
                        symbolSize:10,
                        lineStyle:{
                          width:1,
                          color:'#e1e1e1'
                        },
                        areaStyle: {
                            color:'#edf7f9'
                        },
                        itemStyle:{
                            color:'#7e7e7e'
                        }
                    }
                    <c:if test="${!status.last}">,</c:if>
                    </c:forEach>

        ]
        });
        }
        renderTrendsFunc()


        $('#tab-switch > li').click(function(){
            $(this).addClass('cur').siblings().removeClass('cur');
            renderTrendsFunc();
        })
    })();
</script>
<script type="text/javascript" src="/js/vendors.20180913.js"></script><script type="text/javascript" src="/js/index.20180913.js"></script></body>
</html>