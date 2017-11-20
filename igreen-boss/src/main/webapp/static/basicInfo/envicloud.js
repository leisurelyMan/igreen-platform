
jQuery(document).ready(function(){
	$("#search").click(function(){
		var params = {}
		var sourceValue = $('#cloudSource').val();//这就是selected的值 
		params.sourceValue = sourceValue;
		if(sourceValue == "location"){
			params.cityCode = $("#cityCode").val( );
			params.province = $("#cityProvince").val( );
		}else if(sourceValue == "area"){
			params.startLng = $("#startLng").val( );
			params.startLat = $("#startLat").val( );
			params.endLng = $("#endLng").val( );
			params.endLat = $("#endLat").val( );
		}else if(sourceValue == "monthlymete"){
			params.cityCode = $("#cityCode").val( );
			params.province = $("#cityProvince").val( );
			params.year = $("#year").val( );
			params.type = $("#mtype").val( );
		}else if(sourceValue == "yearlymete"){
			params.cityCode = $("#cityCode").val( );
			params.province = $("#cityProvince").val( );
			params.startYear = $("#startYear").val( );
			params.endYear = $("#endYear").val( );
			params.type = $("#ytype").val( );
		}else if(sourceValue == "citydailyair"){
			params.cityCode = $("#cityCode").val( );
			params.province = $("#cityProvince").val( );
			params.date = $("#date").val( );
			params.type = $("#ctype").val( );
		}else if(sourceValue == "discharge"){
			params.year = $("#year").val( );
			params.filter = $("#filter").val( );
		}else if(sourceValue == "periodicdischarge"){
			params.startYear = $("#startYear").val( );
			params.endYear = $("#endYear").val( );
			params.province = $("#province").val( );
			params.filter = $("#filter").val( );
		}
		
		 $.ajax({
	            type:"POST",
	            url:"../basicInfo/getData.do",
	            data:params,
	            datatype: "json",       
	            success:function(data){
	            	$("#result").html(data);            
	            }
	       });
	});
	
	$('#cloudSource').change(function(){
		$("#lCityCode").css('display','none'); 
		$("#lCityProvince").css('display','none');
		$("#lStartLng").css('display','none');
		$("#lStartLat").css('display','none');
		$("#lEndLng").css('display','none');
		$("#lEndLat").css('display','none');
		$("#lYear").css('display','none');
		$("#lStartYear").css('display','none');
		$("#lEndYear").css('display','none');
		$("#lDate").css('display','none');
		$("#lProvince").css('display','none');
		$("#lFilter").css('display','none');
		$("#lmtype").css('display','none');
		$("#lytype").css('display','none');
		$("#lctype").css('display','none');
		var sourceValue = $(this).val();//这就是selected的值 
		if(sourceValue == "location"){
			$("#lCityCode").css('display','block');
			$("#lCityProvince").css('display','block');
		}else if(sourceValue == "area"){
			$("#lStartLng").css('display','block');
			$("#lStartLat").css('display','block');
			$("#lEndLng").css('display','block');
			$("#lEndLat").css('display','block');
		}else if(sourceValue == "monthlymete"){
			$("#lCityCode").css('display','block');
			$("#lCityProvince").css('display','block');
			$("#lYear").css('display','block');
			$("#lmtype").css('display','block');
		}else if(sourceValue == "yearlymete"){
			$("#lCityCode").css('display','block');
			$("#lCityProvince").css('display','block');
			$("#lStartYear").css('display','block');
			$("#lEndYear").css('display','block');
			$("#lytype").css('display','block');
		}else if(sourceValue == "citydailyair"){
			$("#lCityCode").css('display','block');
			$("#lCityProvince").css('display','block');
			$("#lDate").css('display','block');
			$("#lctype").css('display','block');
		}else if(sourceValue == "discharge"){
			$("#lYear").css('display','block');
			$("#lFilter").css('display','block');
		}else if(sourceValue == "periodicdischarge"){
			$("#lStartYear").css('display','block');
			$("#lEndYear").css('display','block');
			$("#lProvince").css('display','block');
			$("#lFilter").css('display','block');
		}
    }) 
    
    $("#lCityCode").css('display','block'); 
	$("#lCityProvince").css('display','block');
	$("#lStartLng").css('display','none');
	$("#lStartLat").css('display','none');
	$("#lEndLng").css('display','none');
	$("#lEndLat").css('display','none');
	$("#lYear").css('display','none');
	$("#lStartYear").css('display','none');
	$("#lEndYear").css('display','none');
	$("#lDate").css('display','none');
	$("#lProvince").css('display','none');
	$("#lFilter").css('display','none');
	$("#lmtype").css('display','none');
	$("#lytype").css('display','none');
	$("#lctype").css('display','none');
});


