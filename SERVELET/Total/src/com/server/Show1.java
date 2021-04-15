package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Show1 extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String N1 = 
		req.getParameter("U1");
		resp.setContentType("text/html");
		PrintWriter out =
		resp.getWriter();
		out.println("<h1>SECOND SHOW "+N1+"</h1>");
	}

}
