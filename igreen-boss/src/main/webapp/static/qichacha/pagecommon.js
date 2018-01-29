jQuery(document).ready(function(){
	$("#returnbtn").click(function(){
		var searchNameinput = $('<input type="hidden" name="name" value="'+$('#searchName').val()+'"/>');
		var searchCreditCodeinput = $('<input type="hidden" name="creditCode" value="'+$('#searchCreditCode').val()+'"/>');
		var searchOrgNoinput = $('<input type="hidden" name="orgNo" value="'+$('#searchOrgNo').val()+'"/>');
		var searchCompanyNamesinput = $('<input type="hidden" name="companyNames" value="'+$('#searchCompanyNames').val()+'"/>');
		var currentPageinput = $('<input type="hidden" name="currentPage" value="'+$('#currentPage').val()+'"/>');
		var pageRowsinput = $('<input type="hidden" name="pageRows" value="'+$('#pageRows').val()+'"/>');
	    // 取得要提交页面的URL  
	    var action = "../../companybase/toCompanyBaseList.do";  
	    // 创建Form  
	    var form = $('<form id="hiddenform"></form>');
	    // 设置属性  
	    form.attr('action', action);  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  
	    // _self -> 当前页面 _blank -> 新页面  
	    form.attr('target', '_self');  
	    // 附加到Form 
	    form.append(searchNameinput);
	    form.append(searchCreditCodeinput);
	    form.append(searchOrgNoinput);
	    form.append(searchCompanyNamesinput);
	    form.append(currentPageinput);
	    form.append(pageRowsinput);
	    $("#hiddendiv").empty().append(form);
	    // 提交表单  
	    $("#hiddenform").submit();
	});
	
	$("#JudgementList").click(function(){
		var keyNoinput = $('<input type="hidden" name="keyNo" value="'+$('#keyNo').val()+'"/>');
		var searchNameinput = $('<input type="hidden" name="name" value="'+$('#searchName').val()+'"/>');
		var searchCreditCodeinput = $('<input type="hidden" name="creditCode" value="'+$('#searchCreditCode').val()+'"/>');
		var searchOrgNoinput = $('<input type="hidden" name="orgNo" value="'+$('#searchOrgNo').val()+'"/>');
		var searchCompanyNamesinput = $('<input type="hidden" name="companyNames" value="'+$('#searchCompanyNames').val()+'"/>');
		var currentPageinput = $('<input type="hidden" name="currentPage" value="'+$('#currentPage').val()+'"/>');
		var pageRowsinput = $('<input type="hidden" name="pageRows" value="'+$('#pageRows').val()+'"/>');
	    // 取得要提交页面的URL  
	    var action = "../../qichacha/judgement/toJudgementList.do";  
	    // 创建Form  
	    var form = $('<form id="hiddenform"></form>');
	    // 设置属性  
	    form.attr('action', action);  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  
	    // _self -> 当前页面 _blank -> 新页面  
	    form.attr('target', '_self');  
	    // 附加到Form 
	    form.append(keyNoinput);
	    form.append(searchNameinput);
	    form.append(searchCreditCodeinput);
	    form.append(searchOrgNoinput);
	    form.append(searchCompanyNamesinput);
	    form.append(currentPageinput);
	    form.append(pageRowsinput);
	    $("#hiddendiv").empty().append(form);
	    // 提交表单  
	    $("#hiddenform").submit();
	});
	
	$("#PatentList").click(function(){
		var keyNoinput = $('<input type="hidden" name="keyNo" value="'+$('#keyNo').val()+'"/>');
		var searchNameinput = $('<input type="hidden" name="name" value="'+$('#searchName').val()+'"/>');
		var searchCreditCodeinput = $('<input type="hidden" name="creditCode" value="'+$('#searchCreditCode').val()+'"/>');
		var searchOrgNoinput = $('<input type="hidden" name="orgNo" value="'+$('#searchOrgNo').val()+'"/>');
		var searchCompanyNamesinput = $('<input type="hidden" name="companyNames" value="'+$('#searchCompanyNames').val()+'"/>');
		var currentPageinput = $('<input type="hidden" name="currentPage" value="'+$('#currentPage').val()+'"/>');
		var pageRowsinput = $('<input type="hidden" name="pageRows" value="'+$('#pageRows').val()+'"/>');
	    // 取得要提交页面的URL  
	    var action = "../../qichacha/patent/toPatentList.do";  
	    // 创建Form  
	    var form = $('<form id="hiddenform"></form>');
	    // 设置属性  
	    form.attr('action', action);  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  
	    // _self -> 当前页面 _blank -> 新页面  
	    form.attr('target', '_self');  
	    // 附加到Form 
	    form.append(keyNoinput);
	    form.append(searchNameinput);
	    form.append(searchCreditCodeinput);
	    form.append(searchOrgNoinput);
	    form.append(searchCompanyNamesinput);
	    form.append(currentPageinput);
	    form.append(pageRowsinput);
	    $("#hiddendiv").empty().append(form);
	    // 提交表单  
	    $("#hiddenform").submit();
	});
	

	$("#PenaltyList").click(function(){
		var keyNoinput = $('<input type="hidden" name="keyNo" value="'+$('#keyNo').val()+'"/>');
		var searchNameinput = $('<input type="hidden" name="name" value="'+$('#searchName').val()+'"/>');
		var searchCreditCodeinput = $('<input type="hidden" name="creditCode" value="'+$('#searchCreditCode').val()+'"/>');
		var searchOrgNoinput = $('<input type="hidden" name="orgNo" value="'+$('#searchOrgNo').val()+'"/>');
		var searchCompanyNamesinput = $('<input type="hidden" name="companyNames" value="'+$('#searchCompanyNames').val()+'"/>');
		var currentPageinput = $('<input type="hidden" name="currentPage" value="'+$('#currentPage').val()+'"/>');
		var pageRowsinput = $('<input type="hidden" name="pageRows" value="'+$('#pageRows').val()+'"/>');
	    // 取得要提交页面的URL  
	    var action = "../../qichacha/penalty/toPenaltyList.do";  
	    // 创建Form  
	    var form = $('<form id="hiddenform"></form>');
	    // 设置属性  
	    form.attr('action', action);  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  
	    // _self -> 当前页面 _blank -> 新页面  
	    form.attr('target', '_self');  
	    // 附加到Form 
	    form.append(keyNoinput);
	    form.append(searchNameinput);
	    form.append(searchCreditCodeinput);
	    form.append(searchOrgNoinput);
	    form.append(searchCompanyNamesinput);
	    form.append(currentPageinput);
	    form.append(pageRowsinput);
	    $("#hiddendiv").empty().append(form);
	    // 提交表单  
	    $("#hiddenform").submit();
	});
});