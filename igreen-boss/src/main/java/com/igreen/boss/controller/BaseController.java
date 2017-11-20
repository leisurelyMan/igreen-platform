package com.igreen.boss.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.igreen.common.model.SysUser;

public class BaseController {

	
	public SysUser getUser(HttpServletRequest request,HttpServletResponse response){
        //获取Session  
        HttpSession session = request.getSession();  
        SysUser user = (SysUser)session.getAttribute("user");
        if(user != null)  
            return user;
		else
			try {
				response.sendRedirect("login.html");
			} catch (IOException e) {
				e.printStackTrace();
			}
        return null;
	}
}
