 var myChart7 = echarts.init(document.getElementById('bar2'));

		        // 指定图表的配置项和数据

				var option7 = {

					    tooltip : {
					        trigger: 'axis',
					        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
					        }
					    },
                         grid: {
					    	 width:"90%",
					    	 left:"10%",
					    	 top:"80"
				        },
					    legend: {
					    	itemWidth:8,
					    	itemHeight:8,
					    	data:[{
					    		  name:'注册用户量',
                                  icon:'rect',
                                  textStyle:{
                                  	 color:"auto"
                                  }
					    	   },{
                                  name:'出借用户量',
                                  icon:'rect',
                                  textStyle:{
                                  	 color:"auto"
                                  }}
                                  ],
					    	right:"auto",
					    	top:"auto",
					    	selectedMode:false,
					    	orient: 'horizontal',
					    	textStyle:{
					    		fontSize:18
					    	},
					    	itemGap:30
					    },	
					    
					    
					    xAxis : 
					        {
					            type : 'category',
					            data : ['十一月','十二月','一月'],
					            axisTick : {show: false},
					            axisLabel: {
									textStyle: {
									    fontSize: 14,
									    color:"#666666"
									}
								},
								axisLine: {
									show:false,
									lineStyle: {
									   color: '#000'
								    }
								},					            
					        }
					    ,
					    yAxis : [
					        {
					            type : 'value',
					             axisTick : {show: false},
								axisLine: {
									show:false,
									
								},
					            axisLabel: {
									textStyle: {
									    fontSize: 14,
									    color:"#666666"
									},
								},
					            splitArea: {
									interval: 'auto',
									show: true,
									areaStyle: {
									      color: ['#fff','#fff']
									},
                                },
                                splitLine: {
									show: true, 
									interval: 'auto',
									lineStyle: {
									    color: ['#edf0f4','#edf0f4']
									}
                                },
					        }
					    ],
					    series : [

					        {
					            name:'注册用户量',
					            type:'bar',
					            label: {
					                normal: {
					                    show: true,
					                    formatter:'{c}人',
					                    textStyle: {					                       
					                       fontSize:14				                       
					                    }
					                }
				                },
				                barWidth:40,
					            data:[
					                { 
				            	      value:23335,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  }
				            	    }, 
				            	    { 
					            	   value:50157,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	}
				            	    },
				            	    { 
					            	   value:87406,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	}
				            	    }],
						            itemStyle: {
										normal: {
										    color: "#00c16f",
										}
									}
					        },

					        {
					            name:'出借用户量',
					            type:'bar',
					            label: {
					                normal: {
					                    show: true,
					                    formatter:'{c}人',
					                    textStyle: {					                       
					                       fontSize:14				                       
					                    }
					                }
				                },
				                barWidth:40,
					            data:[
					                { 
				            	      value:24197,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  }
				            	    }, 
				            	    { 
					            	   value:22657,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	}
				            	    },
				            	    { 
					            	   value:18764,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	}
				            	    }],
						            itemStyle: {
										normal: {
										    color: "#da4f51",
										}
									}
					        }
					    ]
                };

				


