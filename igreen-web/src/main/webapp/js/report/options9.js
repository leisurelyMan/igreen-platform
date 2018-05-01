 var myChart14 = echarts.init(document.getElementById('bar7'));

		        // 指定图表的配置项和数据

				var option14 = {
					    tooltip : {
					        trigger: 'axis',
					        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
					        },
					        formatter: "{a} <br/>{b} : {c}%"
					    },
					    grid: {
					        containLabel: true,
					        width:"100%",
					        height:"84%",
					        left:"0",
					        top:"8",
					        bottom:"10%"
					    },
					    
					    xAxis : 
					        {
					            type : 'category',
					            data : ['江苏省','浙江省','山东省','安徽省','黑龙江省','福建省','河北省','江西省','广东省','湖南省'],
					            axisLine: {
									show:false,
									
								},
					            axisTick : {show: false},
					            axisLabel: {
									textStyle: {
										color:"#666",
									    fontSize: 12,
									
									},
									interval:0,
									rotate: 65
								}

								
					            
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
									formatter:function(val){
									    return val+"%";
									}
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
									    color: ['#edf0f4','#edf0f4']
									}
                                },
					        }
					    ],
					    series : [

					        {
					            name:'出借用户量',
					            type:'bar',
					            label: {
					                normal: {
					                    show: true,
					                    formatter:'{c}%',
					                    textStyle:{
					                    	fontSize:12
					                    },
					                }
				                },
				                barWidth:25,
					            data:[
					                { 
				            	      value:31.38,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  }
				            	    }, 
				            	    { 
					            	   value:13.88,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   
				            	    },
				            	    { 
					            	   value:11.4,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	
				            	    }, { 
				            	      value:10.9,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  }
				            	    }, 
				            	    { 
					            	   value:4.91,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   
				            	    },
				            	    { 
					            	   value:3.51,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	
				            	    },
				            	     { 
				            	      value:2.94,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  }
				            	    }, 
				            	    { 
					            	   value:2.43,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   
				            	    },
				            	    { 
					            	   value:1.9,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	
				            	    },
				            	    { 
					            	   value:1.79,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	
				            	    }],
				            	    itemStyle: {
											normal: {
											    color: "#7ac3ff",
											}
									}
						            
					        }
					    ]
                };

				

				 var myChart15 = echarts.init(document.getElementById('bar8'));

		        // 指定图表的配置项和数据

				var option15 = {
					    tooltip : {
					        trigger: 'axis',
					        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
					        }
					        ,
					        formatter: "{a}<br/>{b} : {c}%"
					    },
					    grid: {
					        containLabel: true,
					        width:"100%",
					        height:"84%",
					        left:"0",
					        top:"12",
					        bottom:"10%"
					    },
					    
					    
					    xAxis : 
					        {
					            type : 'category',
					            axisLine: {
									show:false,
									
								},
					            axisTick : {show: false},
					            data : ['江苏省','浙江省','山东省','安徽省','黑龙江省','福建省','天津市','上海市','河北省','江西省'],
					            axisLabel: {
									textStyle: {
										 color:"#666",
									    fontSize: 12,
									  
									},
									rotate: 65,
									interval:0
									
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
									formatter:function(val){
									    return val+"%";
									}
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
									    color: ['#edf0f4','#edf0f4']
									}
                                },
					        }
					    ],
					    series : [

					        {
					            name:'出借金额',
					            type:'bar',
					            label: {
					                normal: {
					                    show: true,
					                    formatter:'{c}%',
					                    textStyle:{
					                    	fontSize:12
					                    },
					                }
				                },
				                barWidth:25,
					            data:[
					                { 
				            	      value:37.89,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  }
				            	    }, 
				            	    { 
					            	   value:18.5,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   
				            	    },
				            	    { 
					            	   value:9.07,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	
				            	    }, { 
				            	      value:7.97,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  }
				            	    }, 
				            	    { 
					            	   value:5.2,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   
				            	    },
				            	    { 
					            	   value:3.31,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	
				            	    },
				            	     { 
				            	      value:2.4,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  }
				            	    }, 
				            	    { 
					            	   value:2.13,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   
				            	    },
				            	    { 
					            	   value:1.65,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	
				            	    },
				            	    { 
					            	   value:1.33,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	
				            	    }],
				            	    itemStyle: {
											normal: {
											    color: "#7ac3ff",
											}
									}
						            
					        }
					    ]
                };

				





