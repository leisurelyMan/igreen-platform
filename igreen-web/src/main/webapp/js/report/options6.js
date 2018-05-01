 var myChart8 = echarts.init(document.getElementById('bar3'));

		        // 指定图表的配置项和数据

				var option8 = {
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
					            axisLabel: {
									textStyle: {
										 color:"#666",
									    fontSize: 14,
									},
								},
								axisTick : {show: false},
					            
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
									      color: ['#fff','#fff']
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
					                    },
					                }
				                },
				                barWidth:40,
					            data:[
					                { 
				            	      value:1828679636,
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
					            	   value:2772555757,
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
					            	   value:1984493010,

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

				

				 var myChart9 = echarts.init(document.getElementById('bar4'));

		        // 指定图表的配置项和数据

				var option9 = {
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
									    color:"#666",
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
					             axisLine: {
									show:false,
									
								},
					            axisTick : {show: false},
					            axisLabel: {
									textStyle: {
									    fontSize: 12,
									    color:"#666"
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
					            name:'收益对比',
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
				            	      value:108859002,
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
					            	   value:141862108,
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
					            	   value:97087476,

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

				





