 var myChart10 = echarts.init(document.getElementById('bar5'));

		        // 指定图表的配置项和数据

				var option10 = {
					    tooltip : {
					        trigger: 'axis',
					        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
					        }
					    },
					    grid: {
					        containLabel: true,
					        width:"100%",
					        height:"90%",
					        left:"0",
					        top:"15",
					        bottom:"10%"
					    },
					    
					    xAxis : 
					        {
					            type : 'category',
					            data : ['十一月','十二月','一月'],
					             axisLine: {
									show:false,
									
								},
					            axisTick : {show: false},
					            axisLabel: {
									textStyle: {
										 color:"#666",
									    fontSize: 14,
									},
								},
					            
					        }
					    ,
					    yAxis : [
					        {
					            type : 'value',
					             axisLine: {
									show:false,
									
								},
					            axisTick : {show: false},
					            axisLabel: {
									textStyle: {
										color:"#666",
									    fontSize: 12,
									},
								},
					            splitArea: {
									interval: 'auto',
									show: false,
									areaStyle: {
									      color: ['#2c2b2b','#232323']
									},
                                },
                                splitLine: {
									show: true, 
									interval: 'auto',
									lineStyle: {
									    color: ['#eff2f5','#eff2f5']
									}
                                },
					        }
					    ],
					    series : [

					        {
					            name:'发标对比',
					            type:'bar',
					            label: {
					                normal: {
					                    show: true,
					                    formatter:'{c}',
					                    textStyle:{
					                    	fontSize:14
					                    },
					                }
				                },
				                barWidth:40,
					            data:[
					                { 
				            	      value:706,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  },
					            	  itemStyle: {
											normal: {
											    color: "#00c16f",
											}
									    }
				            	    }, 
				            	    { 
					            	   value:677,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	itemStyle: {
											normal: {
											    color: "#da4f51",
											}
									    }
				            	    },
				            	    { 
					            	   value:708,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	itemStyle: {
											normal: {
											    color: "#8c3ef3",
											}
									    }
				            	    }],
						            
					        }
					    ]
                };

				

				 var myChart11 = echarts.init(document.getElementById('bar6'));

		        // 指定图表的配置项和数据

				var option11 = {
					    tooltip : {
					        trigger: 'axis',
					        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
					        }
					    },
					    grid: {
					        containLabel: true,
					        width:"100%",
					        height:"90%",
					        right:"0",
					        top:"15",
					        bottom:"10%"
					    },
					    
					    xAxis : 
					        {
					            type : 'category',
					            data : ['十一月','十二月','一月'],
					            axisLabel: {
									textStyle: {
									    fontSize: 14,
									    color:"#666"
									},
								},
								 axisLine: {
									show:false,
									
								},
					            axisTick : {show: false}
					            
					        }
					    ,
					    yAxis : [
					        {
					            type : 'value',
					            axisLabel: {
									textStyle: {
									    fontSize: 12,
									    color:"#666"
									},
								},
								 axisLine: {
									show:false,
									
								},
					            axisTick : {show: false},
					            splitArea: {
									interval: 'auto',
									show: false,
									areaStyle: {
									      color: ['#2c2b2b','#232323']
									},
                                },
                                splitLine: {
									show: true, 
									interval: 'auto',
									lineStyle: {
									    color: ['#eff2f5','#eff2f5']
									}
                                },
					        }
					    ],
					    series : [

					        {
					            name:'出借对比',
					            type:'bar',
					            label: {
					                normal: {
					                    show: true,
					                    formatter:'{c}',
					                    textStyle:{
					                    	fontSize:14
					                    }
					                }
				                },
				                barWidth:40,
					            data:[
					                { 
				            	      value:36864,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  },
					            	  itemStyle: {
											normal: {
											    color: "#00c16f",
											}
									    }
				            	    }, 
				            	    { 
					            	   value:37545,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	itemStyle: {
											normal: {
											    color: "#da4f51",
											}
									    }
				            	    },
				            	    { 
					            	   value:28170,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	itemStyle: {
											normal: {
											    color: "#8c3ef3",
											}
									    }
				            	    }]
						            
					        }
					    ]
                };

				





