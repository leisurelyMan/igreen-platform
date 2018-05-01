 var myChart16 = echarts.init(document.getElementById('bar9'));

		        // 指定图表的配置项和数据

				var option16 = {
					    tooltip : {
					    	show:false,
					    	showContent:false,
					        trigger: 'axis',
					        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
					        }
					    },
					    grid: {
				    	 width:"90%",
				    	 left:"10%",
				    	 top:"10"
				    },
					    
					    xAxis : 
					        {  
					            type : 'category',
					            data : [
					             '林先生','陈先生','苏女士',
					             '杨女士','叶先生','吴先生','张女士','吕女士','俞女士','葛女士'],
					            axisLabel: {
					            	show:true,
									textStyle: {
									
									    fontSize: 14,
									    color:"#666"
									},
									
									interval:0,
									
								},
								axisLine: {
									show: false,
                                },
                                splitLine:{show: false},
								axisTick: {
								   show: false
								},
					            
					        }
					    ,
					    yAxis : [
					        {
					            type : 'value',
					            axisLabel: {
					            	show:true,
									textStyle: {
										color:"#666",
									    fontSize: 12,
									}
								},
								axisLine: {
									show: false,
									
                                },
                                scale:true,
                                min:0,
                                splitLine:{show: false},
                                axisTick: {
								   show: false
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
                             }
								
					        }
					    ],
					    series : [

					        {
					            name:'出借金额',
					            type:'bar',
					            label: {
					                normal: {
					                    show: false,
					                    formatter:'{c}元',
					                    textStyle:{
					                    	fontSize:14
					                    },
					                }
				                },
				                barWidth:32,
					            data:[
					                { 
				            	      value:10800000,
				            	      label:{

					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  }
				            	    }, 
				            	    { 
					            	   value:5500000,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	}
					            	   
				            	    },
				            	    { 
					            	   value:4878000,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	}
					            	   	
				            	    }, { 
				            	      value:4273900,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  }
				            	    }, 
				            	    { 
					            	   value:4040000,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   
				            	    },
				            	    { 
					            	   value:4038600,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	
				            	    },
				            	     { 
				            	      value:4000000,
				            	      label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	  }
				            	    }, 
				            	    { 
					            	   value:4000000,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   
				            	    },
				            	    { 
					            	   value:3820000,
					            	   label:{
						            	   	 normal:{
						            	   	 	position:'top'
						            	   	 }
					            	   	},
					            	   	
				            	    },
				            	    { 
					            	   value:3735000,
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

				

				





