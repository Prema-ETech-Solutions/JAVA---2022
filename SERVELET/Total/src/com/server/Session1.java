package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session1 extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String Value = req.getParameter("Name1");
		HttpSession Session = req.getSession();
		Session.setAttribute("N1",Value);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>");
		out.println("VALUE OF NAME "+Value);
		out.println("</h1>");
		out.println("<a href=Session2>SECOND</a>");
	}
}
