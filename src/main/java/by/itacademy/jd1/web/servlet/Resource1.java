package by.itacademy.jd1.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

public class Resource1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>");
		writer.println("Hello I'm Resource 1");
		writer.println("</h1>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String isactive = req.getParameter("isactive");
		String date = req.getParameter("date");
		String fio = req.getParameter("fio");
		String info = req.getHeader("User-Agent");
		
		PrintWriter writer = resp.getWriter();
		writer.println(String.format("Data was saved on server.isActive = %s, fio= %s, date=%s, User-Agent= %s "  , isactive, fio, date, info));
	}

}
