var myChart12 = echarts.init(document.getElementById('pie6'));
var option12 = {
					   
					   
					    legend: {
					    	show:true,
					    	itemWidth:8,
					    	itemHeight:8,
					    	data:[{
					    		  name:'男',
                                  icon:'rect'
					    	   },{
                                  name:'女',
                                  icon:'rect'
					    	}],
					    	bottom:"0",
					    	left:"0",
					    	selectedMode:false,
					    	orient: 'horizontal',
					    	textStyle:{
					    		fontSize:16,
					    		color:"auto"
					    	}

					    },

					    tooltip : {
					        trigger: 'item',
					        formatter: "{a} <br/>{b} : {d}%"
					    },



					    series : [
					        {
					            name:'区间出借额占比',
					            type:'pie',
					            radius : ['50%', '80%'],
					            center: ['50%', '50%'],
					            data:[
					                
					                {value:33.14, name:'出借额<1万'},
					                {value:34.42, name:'1万≤出借额＜5万'},
					                {value:12.86, name:'5万≤出借额＜10万'},
					                {value:13.96, name:'10万≤出借额＜30万'},
					                {value:5.62, name:'出借额≥30万'}
					            ],
					            roseType: '',
					            label: {
					                normal: {
					                    textStyle: {
					                       fontSize:16
					                    },
					                    formatter:'{c}%'
					                }
					            },
					            labelLine: {
					                normal: {
					                    lineStyle: {
					                       
					                    },
					                    smooth: 0.2,
					                    length: 16,
					                    length2: 30
					                }
					            },

					        }
					    ],
					    color:["#00c16f","#da4f51","#8c3ef3","#ffca00","#0099ff"]
					};

		        // 使用刚指定的配置项和数据显示图表。
		       

var myChart13 = echarts.init(document.getElementById('pie7'));
var option13 = {
					    
					     legend: {
					    	
					    	itemWidth:8,
					    	itemHeight:8,
					    	data:[{
					    		  name:'金信宝APP',
                                  icon:'rect'
					    	   },{
                                  name:'PC端',
                                  icon:'rect'
					    	},{
                                  name:'手机网页端',
                                  icon:'rect'
					    	}],
					    	right:"0",
					    	bottom:"45",
					    	selectedMode:false,
					    	orient: 'vertical',
					    	textStyle:{
					    		color:"auto",
					    		fontSize:14
					    	}

					    },

					    tooltip : {
					        trigger: 'item',
					        formatter: "{a} <br/>{b} : {d}%"
					    },

					    series : [
					        {
					            name:'终端出借额占比',
					            type:'pie',
					            radius : ['50%', '80%'],
					            center: ['50%', '50%'],
					            data:[
					                
					                {value:84.33, name:'金信宝APP'},
					                {value:15.33, name:'PC端'},
					                {value:0.34, name:'手机网页端'}

					            ],
					            roseType: '',
					            label: {
					                normal: {
					                    textStyle: {
					                       fontSize:16
					                    },
					                    formatter:'{c}%'
					                }
					            },
					            labelLine: {
					                normal: {
					                    lineStyle: {
					                       
					                    },
					                    smooth: 1,
					                    length: 16,
					                    length2: 30
					                }
					            }

					        }
					    ],
					    color:["#00c16f","#da4f51","#8c3ef3"]
					};

		        // 使用刚指定的配置项和数据显示图表。
		       	        