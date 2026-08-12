package feedback_app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/request1")
public class Request1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = "chaitanya";
		String userId = "1234";
		
		Cookie cookie = new Cookie("username",username);
		cookie.setMaxAge(60);
		
		resp.addCookie(cookie);
	}

}
