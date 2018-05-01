var myChart = echarts.init(document.getElementById('pie1'));
var option = {
					   
					    legend: {
					    	itemWidth:8,
					    	itemHeight:8,
					    	data:[{
					    		  name:'男',
                                  icon:'rect'
					    	   },{
                                  name:'女',
                                  icon:'rect'
					    	}],
					    	right:"30",
					    	bottom:"60",
					    	selectedMode:false,
					    	orient: 'vertical',
					    	textStyle:{
					    		color:"auto",
					    		fontSize:16
					    	}

					    },

					    tooltip : {
					        trigger: 'item',
					        formatter: "{a} <br/>{b} : {d}%"
					    },

					    series : [
					        {
					            name:'男女比例',
					            type:'pie',
					            radius : ['50%', '80%'],
					            center: ['50%', '50%'],
					            data:[
				                
					                {value:46.14, name:'男'},
					                {value:53.86, name:'女'}

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
					            },

					        }
					    ],
					    color:["#00c16f","#da4f51"]
					};

		        // 使用刚指定的配置项和数据显示图表。
		        

var myChart2 = echarts.init(document.getElementById('pie2'));
var option2 = {
					    
					    legend: {
					    	itemWidth:8,
					    	itemHeight:8,
					    	data:[{
					    		  name:'0-20岁',
                                  icon:'rect'
                                 
					    	   },{
                                  name:'21-30岁',
                                  icon:'rect'
                                  
					    	},
					    	{
					    		  name:'31-40岁',
                                  icon:'rect'
					    	   },{
                                  name:'41-50岁',
                                  icon:'rect'
                                 
                               
					    	},
					    	{
					    		  name:'51-60岁',
                                  icon:'rect'
                                  
					    	   },{
                                  name:'60岁以上',
                                  icon:'rect'
                                  
                               
					    	}	
					    	],
					    	right:"-5",
					    	bottom:"40",
					    	selectedMode:false,
					    	orient: 'vertical',
					    	textStyle:{
					    		fontSize:14,
					    		color:"auto"
					    	},
					    	itemGap:6

					    },

					    tooltip : {
					        trigger: 'item',
					        formatter: "{a} <br/>{b} : {d}%"
					    },



					    series : [
					        {
					            name:'年龄段占比',
					            type:'pie',
					            radius : ['50%', '80%'],
					            center: ['50%', '50%'],
					            data:[
					                {value:0.3, name:'0-20岁'},
					                {value:30.74, name:'21-30岁'},
					                {value:26.17, name:'31-40岁'},
					                {value:16.26, name:'41-50岁'},
					                {value:13.45, name:'51-60岁'},
					                {value:13.07, name:'60岁以上'}
		
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
					            }

					        }
					    ],
					    color:["#00c16f","#da4f51","#8c3ef3","#ffca00","#0099ff","#f19149"]
					};

		        // 使用刚指定的配置项和数据显示图表。
		        		        