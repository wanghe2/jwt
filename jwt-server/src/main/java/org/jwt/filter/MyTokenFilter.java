package org.jwt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wang.util.TockenUtil;

public class MyTokenFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String realPath=((HttpServletRequest )request).getRequestURI();
		if(realPath.contains("checklogin")||realPath.contains("loginpage")) {
			chain.doFilter(request, response);
		}else {
			String jwt_token=((HttpServletRequest )request).getParameter("jwt_token");
			if(TockenUtil.validateJWT(jwt_token).getSuccess()) {
				chain.doFilter(request, response);
			}else
				((HttpServletResponse)response).sendRedirect("/loginpage");
			}
	}

	@Override
	public void destroy() {
		
	}

}
