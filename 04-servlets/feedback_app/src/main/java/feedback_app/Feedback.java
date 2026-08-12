package feedback_app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class Feedback extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String mobileno = req.getParameter("mobileno");
		String feedbackmsg = req.getParameter("feedbackmsg");
		
		
		
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		//writer.println("Servlet working properly...");
		writer.println("""
				
				<h2>Thank you for submitting your feedback</h2>
				<h3>Email Address: %s</h3>
				<h3>Mobile Number: %s</h3>
				<h3>Feedback Comments: %s</h3>
				
				""".formatted(email,mobileno,feedbackmsg));
		
	}
	
}
