  //ajax 方式上传文件操作  
$(document).ready(function(){
	$('#btn').click(function(){
		var incrementFlag = $('#incrementFlag').val( );
		var beginCompnayId = $('#beginCompnayId').val( );
    	$.ajax({
			url:"../basicInfo/businessRiskReptile.do",
			data:{incrementFlag:incrementFlag,beginCompnayId:beginCompnayId},
			type:"post",
			dataType:"json",
			success:function(data){
				alert(data.message);
		}});  
	}); 
    
    $('#stop').click(function(){  
    	$.ajax({
			url:"../basicInfo/businessRiskReptileStop.do",
			type:"post",
			dataType:"json",
			async:"false",
			success:function(data){
				alert("IPE爬虫已停止！");
		}});  
	});  
});  
   
 //JS校验form表单信息  
function checkData(){  
	var fileDir = $("#upfile").val();  
	var suffix = fileDir.substr(fileDir.lastIndexOf("."));  
	if("" == fileDir){  
		alert("选择需要导入的Excel文件！");  
		return false;  
	}  
	if(".xls" != suffix && ".xlsx" != suffix ){  
		alert("选择Excel格式的文件导入！");  
		return false;  
	}  
	return true;  
}  