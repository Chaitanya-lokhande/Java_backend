package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet request from third servlet...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String message = req.getParameter("message");
		
		System.out.println("Form Submitted...");
		System.out.println("message: "+ message);
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		Date date = new Date();
		writer.print("<center><h1>Form Submitted</h1><center>");
		writer.print("""
				
				<h2>Message: %s</h2>
				<h3>Date: %s</h3>
				""".formatted(message,date));
		
	}
	
	
}
