package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hide1 extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String n1 = req.getParameter("t1");
		resp.setContentType("text/html");
		PrintWriter out =
		resp.getWriter();
		out.println("<h1>"
				+ "THIS IS SECOND SERVERT VALUE "
				+n1
				+ "</h1>"
				+ "<form action=\"Show\" method=\"Get\">"
				+ "<button type = submit>GO</button>"
				+ "<input type = hidden name = U1 Value="+n1+">"
				+ "</form>");
	}

}
