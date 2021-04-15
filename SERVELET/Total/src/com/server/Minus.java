package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Minus extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int n1  = Integer.parseInt(req.getParameter("v1")),
		    n2  = Integer.parseInt(req.getParameter("v2"));
		int sum = (int)req.getAttribute("n1");
		PrintWriter out = resp.getWriter();
		
		out.println("<h1>");
		out.println("SUM OF VALUES "+sum+"<br>");
		out.println("MINUS OF VALUES "+(n1-n2));
		out.println("</h1>");
		
		
	}

}
