package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session2 extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession Session = req.getSession();
		String N1 = Session.getAttribute("N1").toString();
		resp.setContentType("text/html");
		PrintWriter out =
		resp.getWriter();
		
		out.println("<h1> VALUE FROM  SESSION "+N1+"</h1>");
		
	}
	

}
