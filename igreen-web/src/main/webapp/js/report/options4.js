var myChart5 = echarts.init(document.getElementById('pie4'));
var option5 = {
					   
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
					    	bottom:"100",
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
					            name:'男女占比',
					            type:'pie',
					             radius : ['50%', '80%'],
					            center: ['50%', '50%'],
					            data:[

					                
					                {value:71.5, name:'男'},
					                {value:28.5, name:'女'}

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
		        

             var myChart6 = echarts.init(document.getElementById('pie5'));
             var option6 = {
					    
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
					    	right:"0",
					    	bottom:"80",
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
					            name:'年龄占比',
					            type:'pie',
					            radius : ['50%', '80%'],
					            center: ['50%', '50%'],
					            data:[
					                {value:0.01, name:'0-20岁'},
					                {value:14.3, name:'21-30岁'},
					                {value:40.75, name:'31-40岁'},
					                {value:35.91, name:'41-50岁'},
					                {value:8.88, name:'51-60岁'},
					                {value:0.15, name:'60岁以上'}
		
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
					    color:["#00c16f","#da4f51","#8c3ef3","#ffca00","#0099ff","#f19149"]
					};

		        // 使用刚指定的配置项和数据显示图表。
		        	        