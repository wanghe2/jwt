package org.jwt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wang.util.TockenUtil;

@Controller
public class LoginController {

	@RequestMapping("checklogin")
	public String checklogin(@RequestParam String username,@RequestParam String password,HttpServletRequest request,HttpServletResponse response) {
		/**
		 * 假装用户名和密码验证通过
		 */
		String jwt_token=TockenUtil.createJWT(username, password, 1000*60*30);
		request.setAttribute("jwt_token", jwt_token);
		return "index";
	}
	
	@RequestMapping("loginpage")
	public String loginpage() {
		return "loginpage";
	}
}
