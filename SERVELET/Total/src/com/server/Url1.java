package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Url1 extends HttpServlet 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String Name = req.getParameter("N1");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>");
		out.println("SERVERT ONE VALUE "+Name);
		out.println("</h1>");
		out.println("<a href =Server2?u1="+Name+">GO TO SECOND</a>");
	
	}

}
