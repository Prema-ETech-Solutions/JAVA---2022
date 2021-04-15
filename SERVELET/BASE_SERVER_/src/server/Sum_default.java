package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum_default extends HttpServlet 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		int v1,v2 ;
		v1=Integer.parseInt(req.getParameter("v1"));
		v2=Integer.parseInt(req.getParameter("v2"));
		int rs= v1+v2;
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>THIS IS SUM "+rs+"</h1>");
	}
	

}
