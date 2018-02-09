package by.itacademy.jd1.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.jar.Attributes.Name;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.apache.commons.lang.ObjectUtils.Null;

public class Resource4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cookieName = "testCookie";
		String cookieValue = "111";

		Cookie[] myCookies = req.getCookies(); // читаем куки
		if (myCookies != null) {

			for (int i = 0; i < myCookies.length; i++) {
				Cookie cookie = myCookies[i];
				if (cookieName.equals(cookie.getName())) {
					cookieValue = cookie.getValue();
					break;
				}
			}
		}

		resp.getWriter().println("I got the cookie:" + cookieValue);

		Boolean isAuthorized = (Boolean) req.getSession().getAttribute("Authorized");
		if (isAuthorized != null && isAuthorized) {
			resp.getWriter().println("you are logged in");
		} else {
			resp.getWriter().println("you are anonymus");
		}
	}

}
