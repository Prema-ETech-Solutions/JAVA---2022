package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Name2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out =
		resp.getWriter();
		Cookie C[] = req.getCookies();
		String name = "";
		boolean v = false;
		if (C != null) 
		{
			for (Cookie c : C)
			{
				if (c.getName().equals("n1")) 
				{
					v=true;
					name =c.getValue();	
				}
			}
			if (v!=false)
			{
				out.println("<h1>YOUR NAME ON SECOND PAGE "+name+"");
			}
		} 
		else 
		{
			RequestDispatcher Rd = req.getRequestDispatcher("home.html");
			out.println("<h1>ENTER YOUR NAME</h1>");
			Rd.include(req, resp);
		}
		
	}

}
