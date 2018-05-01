

var myChart3 = echarts.init(document.getElementById('pie3'));
var option3 = {
					    grid: {
					        height:"auto",
					        containLabel:true
					    },
					    legend: {
					    	itemWidth:8,
					    	itemHeight:8,
					    	data:[{
					    		  name:'加息宝',
                                  icon:'rect'
                                 
					    	   },{
                                  name:'月满金',
                                  icon:'rect'
                                  
					    	},
					    	{
					    		  name:'季度金',
                                  icon:'rect'
                                  
					    	   },{
                                  name:'双季金',
                                  icon:'rect'

					    	},
					    	{
					    		  name:'金元宝',
                                  icon:'rect'
                                  
					    	},{
                                  name:'金信宝',
                                  icon:'rect'
					    	},
					    	{
                                  name:'金信盈',
                                  icon:'rect'
					    	}		
					    	],
					    	right:"auto",
					    	bottom:"-5",
					    	selectedMode:false,
					    	orient: 'horizontal',
					    	textStyle:{
					    		fontSize:16,
					    		color:"auto"
					    	},
					    	itemGap:20

					    },

					    tooltip : {
					        trigger: 'item',
					        formatter: "{a} <br/>{b} : {d}%"
					    },



					    series : [
					        {
					            name:'出借金额占比',
					            type:'pie',
					            radius : ['62%', '80%'],
					            center: ['45%', '47%'],
					            data:[
					                {value:4.2, name:'加息宝'},
					                {value:17.24, name:'月满金'},
					                {value:18.27, name:'季度金'},
					                {value:11.32, name:'双季金'},
					                {value:45.06, name:'金元宝'},
					                {value:0.74, name:'金信宝'},
									{value:3.16, name:'金信盈'}
					            ],
					            roseType: '',
					            label: {
					                normal: {
					                    textStyle: {
					                       fontSize:18
					                    },
					                    formatter:'{c}%'
					                }
					            },
					            labelLine: {
					                normal: {
					                    lineStyle: {
					                       
					                    },
					                    smooth: 0.2,
					                    length: 20,
					                    length2: 30
					                }
					            }

					        }
					    ],
					    color:["#00c16f","#da4f51","#8c3ef3","#ffca00","#0099ff","#f19149","#58d3cf"]
					};

		       	        