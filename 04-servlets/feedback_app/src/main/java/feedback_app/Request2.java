package feedback_app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/request2")
public class Request2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		var writer = resp.getWriter();
		Cookie[] cookies = req.getCookies();
		
		var flag = false;
		
		if(cookies != null) {
			for(Cookie c : cookies) {
				String name = c.getName();
				if(name.equals("username")) {
					System.out.println("Username: " + c.getValue());
					writer.println("""
							
							<h1>Welcome: %s</h1>
							
							""".formatted(c.getValue()));
					flag = true;
				}
			}
		}
		if(!flag) {
			writer.println("<h1> New User. Run request1 first and set cookies...");
			
		}
		
	}

}
