package org.jwt.config;

import org.jwt.filter.MyTokenFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class FilterConfig {

	@SuppressWarnings("rawtypes")
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean<MyTokenFilter> registration = new FilterRegistrationBean<MyTokenFilter>();
		registration.setFilter(myTokenFilter());
		registration.addUrlPatterns("/*");
		registration.setOrder(1);
		return registration;
	}

	@Bean
	public MyTokenFilter myTokenFilter() {
		return new MyTokenFilter();
	}
}
