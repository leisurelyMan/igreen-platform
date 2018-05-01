 var myChart4 = echarts.init(document.getElementById('bar1'));
                var option4 = {
				    tooltip : {
				        trigger: 'item',
				        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
				            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
				        }
				    },
				    grid: {
				    	 width:"100%",
				    	 left:"0",
				    	 top:"10"
				    },

				   
				    label: {

					normal: {

						show: true,

					  }

					},
				  
				    xAxis : {
				        
				            type : 'category',
				            axisTick : {show: false},
				            data : ['江苏省','浙江省','山东省','安徽省','黑龙江省','河北省','上海市','福建省','天津市','辽宁省'],
					        axisLine: {
								lineStyle: {
								       color: '#eff2f5',
								       fontSize:14
								}
							},
							nameTextStyle: {
								color:"#eff2f5",
								fontSize: 16
							},
							axisLabel: {

								show: true,
								interval: 'auto',
								inside: false,
								rotate: 0,
								margin: 8,
								formatter: null,
								textStyle: {
									color:"#666",
									fontSize:12
								}
							}

				    },
				    yAxis :
				        {
				            type : 'value',
				            axisTick : {show: false},
							axisLine: {
								show:false,
								lineStyle: {
								   color: '#000'
							    }
							},

							nameTextStyle: {
								show:false,
								color:"#3bd7d7",
								fontSize: 14
							},
							axisLabel: {

								show: false
							}
							,
							splitLine: {
								show: true, 
								interval: 'auto',
								lineStyle: {
								    color: ['#edf0f4','#edf0f4']
								}
                             },
							splitArea: {

								interval: 'auto',
								show: true,
								areaStyle: {
								      color: ['#fff','#fff']
								},
                            },
                            splitNumber: 6
				        }
				    ,
				    
				    series : [
				       
				        {
				            name:'',
				            type:'bar',
				            stack: '总量',
				            label: {
				                normal: {
				                    show: true,
				                    formatter:'{c}%',
				                    textStyle: {
				                       color:"#7ac3ff",
				                       fontSize:14}
				                }
				            },
				            barWidth:40,
				            
				            data:[
				                 { 
				                  
				            	   value:39.24,
				            	   name:"江苏省",
				            	   label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	}
				            	  },
				            	  { 
				            	   value:16.96,
				            	   name:"浙江省",
				            	   label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	}
				            	  },
				            	  { 
				            	   value:8.29,
				            	   name:"山东省",
				            	   label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	}
				            	  },
				            	  { 
				            	   value:8.15,
				            	   name:"安徽省",
				            	   label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	}
				            	  },
				            	  { 
				            	   value:4.75,
				            	   name:"黑龙江省",
				            	   label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	}
				            	  },
				            	  { 
				            	   value:2.8,
				            	   name:"河北省",
				            	   label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	}
				            	  },
				            	  { 
				            	   value:2.36,
				            	   name:"上海市",
				            	   label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	}
				            	  },
				            	  { 
				            	   value:2.28,
				            	   name:"天津市",
				            	   label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	}
				            	  },
				            	  { 
				            	   value:2.28,
				            	   name:"福建省",
				            	   label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	}
				            	  },
				            	  { 
				            	   value:1.56,
				            	   name:"辽宁省",
				            	   label:{
					            	   	 normal:{
					            	   	 	position:'top'
					            	   	 }
				            	   	}
				            	  }]				        }
				    ],
				    color:["#7ac3ff"]
				};

			