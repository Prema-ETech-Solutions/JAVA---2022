package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Name1 extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		PrintWriter out = resp.getWriter();
		out.println("<h1>");
		out.println("YOUR NAME IS "+name);
		out.println("</h1>");
		out.println("<a href=s2>SECOND</a>");
		if (name != null)
		{
			Cookie c1 = new Cookie("n1",name);
			resp.addCookie(c1);
			
		}
		
		
		
	}

}
