package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum_post extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int v1,v2;
		v1=Integer.parseInt(req.getParameter("v1_post"));                 
		v2=Integer.parseInt(req.getParameter("v2_post"));
		int rs = v1+v2;
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<h1>SUM USING POST "+rs+"</h1>");
		
	}
}
