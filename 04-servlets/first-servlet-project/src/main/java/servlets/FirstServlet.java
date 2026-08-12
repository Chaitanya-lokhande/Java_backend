package servlets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class FirstServlet implements Servlet{
	
	private ServletConfig servletConfig;

	@Override
	public void destroy() {
		System.out.println("Destroying Servlet");
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.servletConfig = config;
		System.out.println("Initializing Servlet");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service Request");
		
	}

	
	@Override
	public ServletConfig getServletConfig() {
		
		return this.servletConfig;
	}

	@Override
	public String getServletInfo() {
		return "This servlet is created by: Chaitanya";
	}
}
