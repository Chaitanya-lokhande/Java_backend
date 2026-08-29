package springmvcsearch.controller;

import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SearchInterceptor extends WebRequestHandlerInterceptorAdapter{

	public SearchInterceptor(WebRequestInterceptor requestInterceptor) {
		super(requestInterceptor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("This is prehandler method");
		return true;
	}
	
	
}
