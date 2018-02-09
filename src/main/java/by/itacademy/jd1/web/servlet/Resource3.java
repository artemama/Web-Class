package by.itacademy.jd1.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

public class Resource3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { // посмотрели и создали куки
		Cookie myCookie = new Cookie("TestCookie", "coocieValue");
		myCookie.setMaxAge(24*60*60);			// Срок жизни куки
		resp.addCookie(myCookie);
		
		HttpSession session = req.getSession();
		req.getSession().setAttribute("Authorised", Boolean.TRUE);
	}

}
