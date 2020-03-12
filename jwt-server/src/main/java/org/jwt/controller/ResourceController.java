package org.jwt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResourceController {

	@RequestMapping("getinfo")
	public String info(HttpServletRequest request,HttpServletResponse response) {
		System.err.print("*****资源访问************");
		return "datainfo";
	}
	
}
