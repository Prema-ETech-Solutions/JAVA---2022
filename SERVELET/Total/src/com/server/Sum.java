package com.server;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum extends HttpServlet 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int n1 =Integer.parseInt(req.getParameter("v1")),
		n2= Integer.parseInt(req.getParameter("v2"));
		
		int sum = n1+n2;
		req.setAttribute("n1", sum);
		RequestDispatcher Rd = req.getRequestDispatcher("/minus");
		Rd.forward(req, resp);
	}
	

}
